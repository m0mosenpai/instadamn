package X;

import android.app.Activity;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class OVM {
    public static final OVM A00 = new Object();
    public static final HashMap A01 = AbstractC166987dD.A1G();

    public final synchronized Activity A00(String str) {
        C14360o3.A0B(str, 0);
        return (Activity) A01.get(str);
    }
}
