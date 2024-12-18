package X;

import android.content.ComponentName;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* loaded from: classes10.dex */
public final class SFE {
    public final ComponentName A00;
    public final ICustomTabsCallback A01;
    public final ICustomTabsService A02;

    public SFE(ComponentName componentName, ICustomTabsCallback iCustomTabsCallback, ICustomTabsService iCustomTabsService) {
        this.A02 = iCustomTabsService;
        this.A01 = iCustomTabsCallback;
        this.A00 = componentName;
    }
}
