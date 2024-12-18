package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;

/* renamed from: X.0cP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08610cP {
    public final long A00;
    public final C03190Dc A01;
    public final ArrayList A02;
    public final ArrayList A03;

    public static C04240Kq A00(Context context) {
        C04240Kq c04240Kq;
        C04240Kq c04240Kq2 = C04240Kq.A03;
        if (c04240Kq2 == null) {
            synchronized (C04240Kq.class) {
                c04240Kq = C04240Kq.A03;
                if (c04240Kq == null) {
                    c04240Kq = new C04240Kq(context);
                    C04240Kq.A03 = c04240Kq;
                }
            }
            return c04240Kq;
        }
        return c04240Kq2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0cM] */
    /* JADX WARN: Type inference failed for: r0v35, types: [X.0cM] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0bW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Context r11, X.InterfaceC08100bW r12, X.C0LG r13, X.C08610cP r14) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08610cP.A01(android.content.Context, X.0bW, X.0LG, X.0cP):void");
    }

    public final void A02(Context context, Intent intent, InterfaceC08100bW interfaceC08100bW) {
        long j = this.A00;
        long j2 = 16 & j;
        int i = DexStore.DAYS_TO_MS_FACTOR;
        if (j2 != 0) {
            i = Integer.MAX_VALUE;
        }
        A01(context, interfaceC08100bW, AbstractC08470cB.A01(context, intent, interfaceC08100bW, i, j), this);
    }

    public C08610cP(C08600cO c08600cO) {
        C03190Dc c03190Dc = c08600cO.A01;
        this.A01 = c03190Dc;
        this.A02 = c08600cO.A02;
        ArrayList arrayList = c08600cO.A03;
        this.A03 = arrayList;
        this.A00 = c08600cO.A00;
        if (c03190Dc == null && arrayList.isEmpty() && (1 & this.A00) == 0) {
            throw new IllegalArgumentException("TrustedCaller needs to be configured with at least 1 security check");
        }
    }

    public final boolean A03(Context context, Intent intent, InterfaceC08100bW interfaceC08100bW) {
        try {
            A02(context, intent, interfaceC08100bW);
            return true;
        } catch (SecurityException e) {
            if (interfaceC08100bW != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Cannot trust caller";
                }
                interfaceC08100bW.EHA("TrustedCaller", message, e.getCause());
                return false;
            }
            return false;
        }
    }
}
