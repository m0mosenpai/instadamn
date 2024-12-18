package com.facebook.browser.lite.chrome.widgets.menu;

import X.C63193Sev;
import X.InterfaceC65339TiK;
import X.ViewOnClickListenerC63504SoX;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.Locale;

/* loaded from: classes10.dex */
public class MenuItemNavigationView extends LinearLayout {
    public MenuItemNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void A00(ImageButton imageButton, C63193Sev c63193Sev, InterfaceC65339TiK interfaceC65339TiK, MenuItemNavigationView menuItemNavigationView) {
        imageButton.setEnabled(c63193Sev.A05);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            imageButton.setScaleX(-1.0f);
        }
        if (c63193Sev.A05) {
            imageButton.setOnClickListener(new ViewOnClickListenerC63504SoX(0, interfaceC65339TiK, menuItemNavigationView, c63193Sev));
        }
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MenuItemNavigationView(Context context) {
        this(context, null);
    }
}
