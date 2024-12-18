package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BPA extends AbstractC51572Yf {
    public final UserSession A00;
    public final JI8 A01;
    public final BP9 A02;
    public final ClipsViewerConfig A03;
    public final InterfaceC31137Dmc A04;
    public final InterfaceC31161Dn5 A05;
    public final InterfaceC31048Dkm A06;
    public final boolean A07;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r14.A5t() != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r25) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPA.A0Y(X.3bS):X.2Vc");
    }

    private final C51722Yv A03(C2Z1 c2z1, String str) {
        C51722Yv c51722Yv = null;
        if (AbstractC85373rS.A00(this.A00)) {
            C75933ay c75933ay = C51722Yv.A02;
            c51722Yv = new C51722Yv(null, new C76933cf(c2z1.ArD(), EnumC76913cd.LOCAL, str));
        }
        BP8 bp8 = BP8.A00;
        Context context = c2z1.ArD().A0C;
        C14360o3.A07(context);
        return bp8.A00(context, this.A02.A06).A00(c51722Yv);
    }

    private final BQV A04(C2Z1 c2z1, int i) {
        C51722Yv A03 = A03(c2z1, "trans_key_overflow_pill_fade");
        InterfaceC30861Dha interfaceC30861Dha = this.A02.A04;
        if (interfaceC30861Dha instanceof BQU) {
            return new BQV(A03, this.A00, this.A05, (BQU) interfaceC30861Dha, i);
        }
        return null;
    }

    public BPA(ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC31137Dmc interfaceC31137Dmc, JI8 ji8, InterfaceC31161Dn5 interfaceC31161Dn5, BP9 bp9, InterfaceC31048Dkm interfaceC31048Dkm, boolean z) {
        AbstractC25234BEr.A1R(userSession, bp9, interfaceC31161Dn5, interfaceC31048Dkm, clipsViewerConfig);
        AbstractC167007dF.A1I(interfaceC31137Dmc, 7, ji8);
        this.A00 = userSession;
        this.A02 = bp9;
        this.A05 = interfaceC31161Dn5;
        this.A06 = interfaceC31048Dkm;
        this.A03 = clipsViewerConfig;
        this.A04 = interfaceC31137Dmc;
        this.A01 = ji8;
        this.A07 = z;
    }
}
