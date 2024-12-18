package X;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.PvC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58433PvC {
    public static C58433PvC A04;
    public String A02 = null;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final Queue A03 = new ArrayDeque();

    public static synchronized C58433PvC A00() {
        C58433PvC c58433PvC;
        synchronized (C58433PvC.class) {
            c58433PvC = A04;
            if (c58433PvC == null) {
                c58433PvC = new C58433PvC();
                A04 = c58433PvC;
            }
        }
        return c58433PvC;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(AbstractC167007dF.A1N(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK")));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            android.util.Log.isLoggable("FirebaseInstanceId", 3);
        }
        return this.A00.booleanValue();
    }
}
