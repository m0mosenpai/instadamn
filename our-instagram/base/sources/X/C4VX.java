package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4VX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VX {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final UserSession A08;
    public final C75363a3 A09;
    public final String A0A;

    public C4VX(Context context, UserSession userSession, C75363a3 c75363a3, String str) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 4);
        this.A07 = context;
        this.A08 = userSession;
        this.A09 = c75363a3;
        this.A0A = str;
        this.A06 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 29) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4VY A00() {
        /*
            r13 = this;
            android.content.Context r2 = r13.A07
            com.instagram.common.session.UserSession r3 = r13.A08
            X.3a3 r4 = r13.A09
            java.lang.String r5 = r13.A0A
            int r6 = r13.A00
            boolean r7 = r13.A02
            boolean r8 = r13.A04
            boolean r9 = r13.A03
            boolean r10 = r13.A01
            boolean r0 = r13.A05
            if (r0 == 0) goto L1d
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r11 = 1
            if (r1 >= r0) goto L1e
        L1d:
            r11 = 0
        L1e:
            boolean r12 = r13.A06
            X.4VY r1 = new X.4VY
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4VX.A00():X.4VY");
    }
}
