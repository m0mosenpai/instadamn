package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G55 implements InterfaceC37162GYz {
    public final FragmentActivity A00;
    public final C206269Bj A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C7U0 A04;
    public final InterfaceC164947Zj A05;

    @Override // X.InterfaceC37162GYz
    public final boolean isEnabled() {
        InterfaceC163837Ux C7r = this.A04.C7r();
        if (C7r.C7W().A16 && C4GR.A01(AbstractC31172DnG.A00(C7r))) {
            return true;
        }
        return false;
    }

    public G55(FragmentActivity fragmentActivity, C206269Bj c206269Bj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0, InterfaceC164947Zj interfaceC164947Zj) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = c7u0;
        this.A01 = c206269Bj;
        this.A05 = interfaceC164947Zj;
        this.A02 = interfaceC11380iw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (X.C98Q.A00(r8).A00(X.AbstractC1345466e.A01(r1), 24) == false) goto L13;
     */
    @Override // X.InterfaceC37162GYz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r10 = this;
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            com.instagram.common.session.UserSession r8 = r10.A03
            X.7U0 r9 = r10.A04
            X.9Bj r6 = r10.A01
            boolean r0 = X.AbstractC34116F3s.A00(r6, r8, r9)
            if (r0 == 0) goto L69
            androidx.fragment.app.FragmentActivity r5 = r10.A00
            X.0iw r7 = r10.A02
            X.G50 r4 = new X.G50
            r4.<init>(r5, r6, r7, r8, r9)
        L19:
            X.GYy r4 = (X.InterfaceC37161GYy) r4
            X.AbstractC34117F3t.A00(r4, r3)
            X.7Ux r4 = r9.C7r()
            java.lang.String r0 = r8.userId
            boolean r0 = r4.CPb(r0)
            if (r0 != 0) goto L50
            X.3oI r1 = r4.CCa()
            if (r1 == 0) goto L46
            X.3oE r0 = X.AbstractC1345466e.A02(r1)
            if (r0 == 0) goto L46
            X.3oE r2 = X.AbstractC1345466e.A01(r1)
            X.98R r1 = X.C98Q.A00(r8)
            r0 = 24
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L50
        L46:
            X.7Zj r1 = r10.A05
            X.G4w r0 = new X.G4w
            r0.<init>(r8, r9, r1)
            X.AbstractC34117F3t.A00(r0, r3)
        L50:
            androidx.fragment.app.FragmentActivity r1 = r10.A00
            X.EcZ r0 = new X.EcZ
            r0.<init>(r1, r8, r9)
            X.AbstractC34117F3t.A00(r0, r3)
            X.7Zj r2 = r10.A05
            int r1 = X.AbstractC31172DnG.A00(r4)
            X.G4v r0 = new X.G4v
            r0.<init>(r9, r2, r1)
            X.AbstractC34117F3t.A00(r0, r3)
            return r3
        L69:
            X.G4u r4 = new X.G4u
            r4.<init>(r9)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G55.getItems():java.util.List");
    }
}
