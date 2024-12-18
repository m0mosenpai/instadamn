package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EaN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32696EaN extends G1U {
    public final FragmentActivity A00;
    public final String A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC37220GaV
    public final String Ata() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final CharSequence B7n() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final String BrR() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final void D8n() {
    }

    @Override // X.InterfaceC37220GaV
    public final void DAx() {
    }

    @Override // X.InterfaceC37220GaV
    public final void Djb() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 == null) goto L16;
     */
    @Override // X.InterfaceC37220GaV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence Ay2() {
        /*
            r7 = this;
            X.2EE r0 = r7.A02
            if (r0 == 0) goto L6d
            java.lang.String r5 = r0.At6()
        L8:
            com.instagram.common.session.UserSession r6 = r7.A01
            X.98R r3 = X.C98Q.A00(r6)
            r2 = 0
            if (r5 == 0) goto L33
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.C7I()
            if (r0 == 0) goto L6b
            X.3oE r1 = X.AbstractC31171DnF.A0N(r0)
        L1d:
            r0 = 44
            boolean r1 = r3.A00(r1, r0)
            android.content.Context r4 = r7.A00
            r0 = 2131954250(0x7f130a4a, float:1.9544994E38)
            if (r1 == 0) goto L2d
            r0 = 2131954252(0x7f130a4c, float:1.9544998E38)
        L2d:
            java.lang.String r0 = X.AbstractC167007dF.A0f(r4, r5, r0)
            if (r0 != 0) goto L3c
        L33:
            android.content.Context r4 = r7.A00
            r0 = 2131954251(0x7f130a4b, float:1.9544996E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r0)
        L3c:
            android.text.SpannableStringBuilder r3 = X.AbstractC25225BEi.A0H(r0)
            X.18A r0 = X.AnonymousClass189.A00(r6)
            java.util.concurrent.ConcurrentMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L52
            boolean r2 = r0.isVerified()
        L52:
            if (r5 == 0) goto L6a
            if (r2 == 0) goto L6a
            r2 = 0
            int r1 = X.AbstractC001900j.A08(r3, r5, r2, r2)
            r0 = -1
            if (r1 == r0) goto L6a
            int r1 = X.AbstractC001900j.A08(r3, r5, r2, r2)
            int r0 = r5.length()
            int r1 = r1 + r0
            X.C85963sQ.A03(r4, r3, r1)
        L6a:
            return r3
        L6b:
            r1 = 0
            goto L1d
        L6d:
            r5 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32696EaN.Ay2():java.lang.CharSequence");
    }

    public C32696EaN(Context context, FragmentActivity fragmentActivity, UserSession userSession, C2EE c2ee, String str) {
        super(context, userSession, c2ee);
        this.A00 = fragmentActivity;
        this.A01 = str;
        this.A02 = AbstractC09440dt.A01(new C37017GSy(userSession, 47));
    }
}
