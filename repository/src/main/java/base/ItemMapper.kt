/*
 * Created by Doaa Fouad on 5/7/21 1:27 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:26 PM
 */

package base

/**
 * Maps between remote model to item model and vice versa
 * */
interface ItemMapper<Remote, Item : ItemModel> {
    fun mapFromItem(model: Item): Remote
    fun mapToItem(model: Remote): Item
}