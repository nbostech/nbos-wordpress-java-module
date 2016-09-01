package com.nbos.capi.modules.wordpress.v0;

import com.nbos.capi.modules.ids.v0.IDS;

/**
 * Created by vivekkiran on 7/29/16.
 */

public class WPIdsRegistry {
    static {
        IDS.register("wordpress", WordPressApi.class);
    }
}
