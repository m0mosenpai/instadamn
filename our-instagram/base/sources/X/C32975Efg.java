package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Efg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32975Efg extends C32547EUx {
    public final InterfaceC11380iw A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C32316ELf A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32975Efg(androidx.fragment.app.Fragment r11, X.InterfaceC11380iw r12, X.C07270a1 r13, X.InterfaceC37227Gac r14, X.C32316ELf r15, java.lang.String r16, java.lang.String r17) {
        /*
            r10 = this;
            r1 = r10
            r10.A03 = r15
            androidx.fragment.app.FragmentActivity r2 = r11.getActivity()
            java.lang.String r0 = X.C32316ELf.A0X
            X.DwI r7 = X.EnumC31713DwI.A0t
            java.lang.Integer r8 = X.C05F.A00
            android.net.Uri r3 = X.AbstractC31525Dt9.A01(r11)
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.A01 = r9
            r0 = r17
            r10.A02 = r0
            r10.A00 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32975Efg.<init>(androidx.fragment.app.Fragment, X.0iw, X.0a1, X.Gac, X.ELf, java.lang.String, java.lang.String):void");
    }

    public static void A01(UserSession userSession, C32975Efg c32975Efg, User user) {
        if (c32975Efg.A03.getContext() != null) {
            super.A03(userSession, user);
        }
    }

    @Override // X.C32547EUx
    public final void A03(UserSession userSession, User user) {
        C32316ELf c32316ELf = this.A03;
        if (c32316ELf.getContext() != null) {
            String username = user.getUsername();
            String str = this.A02;
            ImageUrl Bhu = user.Bhu();
            String str2 = C32316ELf.A0X;
            AbstractC31710DwF.A02(c32316ELf, userSession, Bhu, new G9Y(2, userSession, user, this), EnumC31713DwI.A0t, username, str, false);
            return;
        }
        A01(userSession, this, user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (((X.EfU) ((X.C115115Ig) r8).A00).A0C == false) goto L10;
     */
    @Override // X.C32547EUx, X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFail(X.AbstractC115105If r8) {
        /*
            r7 = this;
            r0 = 143311133(0x88ac11d, float:8.350974E-34)
            int r3 = X.C0f9.A03(r0)
            super.onFail(r8)
            java.lang.String r4 = r7.A01
            X.ELf r6 = r7.A03
            java.lang.String r0 = X.C32316ELf.A0X
            android.widget.TextView r0 = r6.A05
            java.lang.String r0 = X.AbstractC13880nE.A0J(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = r7.A02
            boolean r0 = r0.equals(r0)
            if (r0 == 0) goto L34
            boolean r0 = r8 instanceof X.C115115Ig
            if (r0 == 0) goto L34
            r0 = r8
            X.5Ig r0 = (X.C115115Ig) r0
            java.lang.Object r0 = r0.A00
            X.EfU r0 = (X.EfU) r0
            boolean r0 = r0.A0C
            r5 = 1
            if (r0 != 0) goto L35
        L34:
            r5 = 0
        L35:
            X.1Q9 r1 = X.C1Q9.A1D
            X.0a1 r0 = r6.A06
            X.FgN r2 = r1.A02(r0)
            X.DwI r1 = X.EnumC31713DwI.A0t
            r0 = 0
            X.FcA r2 = r2.A06(r0, r1)
            if (r5 == 0) goto L4c
            r0 = 1
            r6.A0G = r0
            X.C32316ELf.A00(r6)
        L4c:
            java.lang.String r1 = r7.A00
            boolean r0 = r8 instanceof X.C115115Ig
            if (r0 == 0) goto L5d
            X.5Ig r8 = (X.C115115Ig) r8
            java.lang.Object r0 = r8.A00
            X.1ul r0 = (X.C40781ul) r0
            java.lang.String r0 = r0.mErrorType
            if (r0 == 0) goto L5d
            r1 = r0
        L5d:
            java.lang.String r0 = "error"
            r2.A04(r0, r1)
            java.lang.String r0 = "log_in_token"
            r2.A04(r0, r4)
            r2.A02()
            r0 = 1629521894(0x612087e6, float:1.8507947E20)
            X.C0f9.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32975Efg.onFail(X.5If):void");
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-811885048);
        super.onFinish();
        C32316ELf c32316ELf = this.A03;
        c32316ELf.A0J = false;
        C32316ELf.A00(c32316ELf);
        C0f9.A0A(-1909731700, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1404577823);
        super.onStart();
        C32316ELf c32316ELf = this.A03;
        c32316ELf.A0J = true;
        C32316ELf.A00(c32316ELf);
        C0f9.A0A(-2087590770, A03);
    }
}
