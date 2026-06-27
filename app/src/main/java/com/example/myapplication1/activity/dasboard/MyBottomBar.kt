package com.example.myapplication1.activity.dasboard

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication1.R

@Preview
@Composable
fun MyBottomBar() {
    val bottomMenuItemList = prepareBottomMenu()
    val context = LocalContext.current
    var selectedItem by remember { mutableStateOf("Home") }

    NavigationBar(
        containerColor = colorResource(R.color.white),
        tonalElevation = 3.dp,
    ) {
        bottomMenuItemList.forEach { menuItem ->
            val isSelected: Boolean = (selectedItem == menuItem.label)
            NavigationBarItem(
                selected = isSelected,
                colors =
                    NavigationBarItemDefaults.colors(
                        selectedIconColor = colorResource(R.color.black),
                        indicatorColor = Color.Transparent,
                    ),
                onClick = {},
                icon = {
                    Icon(
                        painter = menuItem.icon,
                        contentDescription = null,
                        modifier =
                            Modifier
                                .padding(top = 8.dp)
                                .size(if (isSelected) 30.dp else 20.dp),
                    )
                },
            )
        }
    }
}

@Composable
fun prepareBottomMenu(): List<BottomMenuItem> {
    val bottomMenuItemList = arrayListOf<BottomMenuItem>()

    bottomMenuItemList.add(BottomMenuItem(label = "Home", icon = painterResource(R.drawable.btn_1)))
    bottomMenuItemList.add(BottomMenuItem(label = "Cart", icon = painterResource(R.drawable.btn_2)))
    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Favorite",
            icon = painterResource(R.drawable.btn_3),
        ),
    )
    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Order",
            icon = painterResource(R.drawable.btn_4),
        ),
    )
    bottomMenuItemList.add(
        BottomMenuItem(
            label = "Profile",
            icon = painterResource(R.drawable.btn_5),
        ),
    )

    return bottomMenuItemList
}

data class BottomMenuItem(
    val label: String,
    val icon: Painter,
)