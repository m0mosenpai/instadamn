package X;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient$2;

/* loaded from: classes10.dex */
public final class TPJ implements Runnable {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ CustomTabsClient$2 A02;

    public TPJ(android.net.Uri uri, Bundle bundle, CustomTabsClient$2 customTabsClient$2) {
        this.A02 = customTabsClient$2;
        this.A00 = uri;
        this.A01 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
