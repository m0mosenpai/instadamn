package X;

import android.content.Intent;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: X.0cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08750cd {
    public static Intent A00;
    public static Intent A01;
    public static Intent A02;
    public static boolean A03;
    public static final C08750cd A04 = new Object();

    public static final Intent A00() {
        Intent intent;
        if (!A03) {
            A03 = true;
            ArrayList A002 = AbstractC12840lW.A00(Looper.getMainLooper().getQueue());
            if (A002.size() > 0) {
                intent = (Intent) A002.get(A002.size() - 1);
            } else {
                intent = null;
            }
            A02 = intent;
            C08770cf.A02.addAll(A002);
        }
        return A02;
    }

    public final boolean A02() {
        Intent intent = A01;
        if ((intent != null || (intent = A00()) != null || (intent = A00) != null) && "android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER")) {
            return true;
        }
        return false;
    }

    public final void A01() {
        A00();
        AbstractC58327PtK.A06(C025009y.A00);
    }
}
