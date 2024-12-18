package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* loaded from: classes6.dex */
public final class G57 implements InterfaceC37162GYz {
    public final FragmentActivity A00;
    public final C206269Bj A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final C7U0 A05;
    public final InterfaceC164947Zj A06;
    public final boolean A07;
    public final boolean A08;

    @Override // X.InterfaceC37162GYz
    public final boolean isEnabled() {
        InterfaceC163837Ux C7r = this.A05.C7r();
        if (C7r.CVY() && !C7r.C7W().A16) {
            return true;
        }
        return false;
    }

    public G57(FragmentActivity fragmentActivity, C206269Bj c206269Bj, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C7U0 c7u0, InterfaceC164947Zj interfaceC164947Zj, boolean z, boolean z2) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = capabilities;
        this.A05 = c7u0;
        this.A06 = interfaceC164947Zj;
        this.A01 = c206269Bj;
        this.A08 = z;
        this.A02 = interfaceC11380iw;
        this.A07 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        X.AbstractC34117F3t.A00(new X.G51(r14.A00, r14.A02, r10, r14.A04, r12), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r5 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36324514107240662L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        X.AbstractC34117F3t.A00(new X.C36421G4w(r10, r12, r14.A06), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (r14.A07 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10, 36317277087536095L) != false) goto L17;
     */
    @Override // X.InterfaceC37162GYz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r14 = this;
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            com.instagram.common.session.UserSession r10 = r14.A03
            X.7U0 r12 = r14.A05
            X.9Bj r8 = r14.A01
            boolean r5 = X.AbstractC34116F3s.A00(r8, r10, r12)
            if (r5 == 0) goto L2a
            androidx.fragment.app.FragmentActivity r7 = r14.A00
            X.0iw r9 = r14.A02
            X.G50 r6 = new X.G50
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            X.AbstractC34117F3t.A00(r6, r3)
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36324514107240662(0x810cf4000030d6, double:3.0351072162725365E-306)
            boolean r0 = X.C18U.A06(r4, r10, r0)
            if (r0 == 0) goto L3e
        L2a:
            X.E6i r0 = X.C35252Fgl.A00(r8, r10, r12)
            com.instagram.direct.capabilities.Capabilities r11 = r14.A04
            boolean r13 = r14.A08
            boolean r1 = X.AbstractC35172FfP.A02(r10, r11, r0, r13)
            boolean r0 = r14.A07
            if (r0 == 0) goto L5a
            if (r1 != 0) goto L5a
        L3c:
            if (r5 != 0) goto L48
        L3e:
            X.7Zj r1 = r14.A06
            X.G4w r0 = new X.G4w
            r0.<init>(r10, r12, r1)
            X.AbstractC34117F3t.A00(r0, r3)
        L48:
            boolean r0 = r14.A07
            if (r0 == 0) goto L67
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36317277087536095(0x81065f000313df, double:3.030530495870229E-306)
            boolean r0 = X.C18U.A06(r4, r10, r0)
            if (r0 != 0) goto L67
            return r3
        L5a:
            androidx.fragment.app.FragmentActivity r7 = r14.A00
            X.0iw r9 = r14.A02
            X.G52 r6 = new X.G52
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AbstractC34117F3t.A00(r6, r3)
            goto L3c
        L67:
            androidx.fragment.app.FragmentActivity r8 = r14.A00
            com.instagram.direct.capabilities.Capabilities r11 = r14.A04
            X.0iw r9 = r14.A02
            X.G51 r7 = new X.G51
            r7.<init>(r8, r9, r10, r11, r12)
            X.AbstractC34117F3t.A00(r7, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G57.getItems():java.util.List");
    }
}
