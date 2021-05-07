/*
 * Created by Doaa Fouad on 5/7/21 1:33 PM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 5/7/21 1:33 PM
 */

package base

import kotlinx.coroutines.Dispatchers

abstract class BaseRepository {
    protected var dispatcherIO = Dispatchers.IO
}