package X;

import android.os.Build;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88123wK {
    public static final Map A02 = new HashMap();
    public static final boolean A03;
    public static final boolean A04;
    public static final boolean A05;
    public static final String[] A06;
    public static final String[] A07;
    public static final String[] A08;
    public final Looper A00;
    public final InterfaceC88013w9 A01;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 29) {
            z = true;
        }
        A03 = z;
        A06 = new String[]{"huawei", "honor"};
        boolean z2 = false;
        if (i >= 31) {
            z2 = true;
        }
        A05 = z2;
        boolean z3 = false;
        if (i >= 30) {
            z3 = true;
        }
        A04 = z3;
        A07 = new String[]{"xiaomi", "redmi", "poco", "mi", "blackshark"};
        A08 = new String[]{"oppo", "realme", "oneplus"};
    }

    public C88123wK(Looper looper, InterfaceC88013w9 interfaceC88013w9, final AbstractC87953w3 abstractC87953w3) {
        this.A00 = looper;
        this.A01 = interfaceC88013w9;
        C87923w0.A00().A00.post(new Runnable() { // from class: X.3wL
            /* JADX WARN: Code restructure failed: missing block: B:100:0x01e3, code lost:
            
                if (r1 != null) goto L112;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x01c5, code lost:
            
                if (r6 != null) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x00fa, code lost:
            
                if (r1 == null) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
            
                if (r6.A03() == false) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:137:0x00a9, code lost:
            
                if (r0 == null) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                if (r6.A02() == false) goto L24;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0166  */
            /* JADX WARN: Type inference failed for: r2v4, types: [X.53q, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [X.4fa, X.3wM] */
            /* JADX WARN: Type inference failed for: r5v5, types: [X.3wM, X.40T] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.52d] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 507
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC88133wL.run():void");
            }
        });
    }
}
