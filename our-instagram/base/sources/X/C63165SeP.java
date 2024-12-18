package X;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;

/* renamed from: X.SeP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63165SeP {
    public ActivityOptions A00;
    public final Intent A01 = AbstractC58318PtA.A0C();

    private void A00() {
        ActivityOptions activityOptions = this.A00;
        if (activityOptions == null) {
            activityOptions = ActivityOptions.makeBasic();
            this.A00 = activityOptions;
        }
        AbstractC61619Rqj.A00(activityOptions);
    }

    public final C62662SKw A01() {
        String str;
        Bundle A0b;
        Intent intent = this.A01;
        Bundle bundle = null;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle A0b2 = AbstractC166987dD.A0b();
            A0b2.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(A0b2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(AbstractC166987dD.A0b());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            str = adjustedDefault.get(0).toLanguageTag();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                A0b = intent.getBundleExtra("com.android.browser.headers");
            } else {
                A0b = AbstractC166987dD.A0b();
            }
            if (!A0b.containsKey("Accept-Language")) {
                A0b.putString("Accept-Language", str);
                intent.putExtra("com.android.browser.headers", A0b);
            }
        }
        if (i >= 34) {
            A00();
        }
        ActivityOptions activityOptions = this.A00;
        if (activityOptions != null) {
            bundle = activityOptions.toBundle();
        }
        return new C62662SKw(intent, bundle);
    }

    public C63165SeP(SFE sfe) {
    }

    public C63165SeP() {
    }
}
