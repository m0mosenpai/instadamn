package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.2aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52102aA {
    public static C52102aA A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public C52112aB A00;

    public final synchronized ColorStateList A03(Context context, int i) {
        return this.A00.A04(context, i);
    }

    public final synchronized Drawable A04(Context context, int i) {
        return this.A00.A05(context, i);
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter A00;
        synchronized (C52102aA.class) {
            A00 = C52112aB.A00(mode, i);
        }
        return A00;
    }

    public static synchronized C52102aA A01() {
        C52102aA c52102aA;
        synchronized (C52102aA.class) {
            if (A01 == null) {
                A02();
            }
            c52102aA = A01;
        }
        return c52102aA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.2aA, java.lang.Object] */
    public static synchronized void A02() {
        synchronized (C52102aA.class) {
            if (A01 == null) {
                ?? obj = new Object();
                A01 = obj;
                obj.A00 = C52112aB.A02();
                C52112aB c52112aB = A01.A00;
                C52162aG c52162aG = new C52162aG();
                synchronized (c52112aB) {
                    c52112aB.A01 = c52162aG;
                }
            }
        }
    }
}
