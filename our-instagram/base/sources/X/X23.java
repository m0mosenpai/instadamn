package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class X23 extends ArrayList {
    public final int A00 = 1;
    public final Object A01;

    public X23(WP8 wp8) {
        this.A01 = wp8;
        Context context = wp8.A03;
        addAll(Arrays.asList(Integer.valueOf(context.getColor(R.color.design_dark_default_color_on_background)), Integer.valueOf(context.getColor(R.color.black)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_pink)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_gradient_lavender)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_gradient_purple)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_orange)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_green)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_blue))));
    }

    public X23(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A01 = defaultBrowserLiteChrome;
        add("iab_nav_optimization_ig");
        add("iab_android_ig_expandable_footer");
        add("iab_link_history_ig_android");
        add("ig_android_browser_lite");
    }
}
