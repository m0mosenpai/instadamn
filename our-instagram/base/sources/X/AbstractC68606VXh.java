package X;

import android.content.res.Configuration;

/* renamed from: X.VXh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68606VXh {
    public static final boolean A00(Configuration configuration, Configuration configuration2) {
        AbstractC167017dG.A1N(configuration, configuration2);
        if (configuration.screenWidthDp == configuration2.screenWidthDp && configuration.screenHeightDp == configuration2.screenHeightDp && configuration.densityDpi == configuration2.densityDpi) {
            return false;
        }
        return true;
    }
}
