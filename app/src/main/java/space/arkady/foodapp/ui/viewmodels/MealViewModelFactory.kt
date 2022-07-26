package space.arkady.foodapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import space.arkady.foodapp.database.MealDatabase

class MealViewModelFactory(val mealDatabase: MealDatabase): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MealViewModel(mealDatabase) as T
    }
}