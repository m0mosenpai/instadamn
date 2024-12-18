package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iz6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42954Iz6 implements InterfaceC669530m, InterfaceC116905Qw, InterfaceC120815dY {
    public InterfaceC670130s A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final AbstractC39459Hbl A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;
    public final AbstractC37552Gg8 A07;

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        this.A00 = interfaceC670130s;
        return true;
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return 0;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC120815dY
    public final boolean CKw() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5F() {
    }

    @Override // X.InterfaceC116905Qw
    public final void D5G(C37752GjR c37752GjR) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0164, code lost:
    
        if (r1 != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.30s] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC116905Qw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D5H(X.C37818GkY r16) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42954Iz6.D5H(X.GkY):void");
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    private final void A00(C38321qM c38321qM) {
        UserSession userSession = this.A02;
        if (!C18U.A06(C06090Tz.A05, userSession, 36318329354393705L) || c38321qM.Cff() || c38321qM.A5p()) {
            C4AG.A00(userSession).A01(new C4AD(c38321qM.CFR(), this.A03.getModuleName()));
        }
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC120815dY
    public final Map Bkt() {
        InterfaceC670130s interfaceC670130s = this.A00;
        if (interfaceC670130s != null) {
            return interfaceC670130s.Bkt();
        }
        return null;
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void Cnx(boolean z) {
        AbstractC12120kG.A07("SimpleClipsSponsoredContentFetcher", "Call of unsupported method maybeCarryOverFirstResponse", null);
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
    }

    public C42954Iz6(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, AbstractC37552Gg8 abstractC37552Gg8, AbstractC39459Hbl abstractC39459Hbl) {
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = interfaceC60442pS;
        this.A04 = abstractC39459Hbl;
        this.A05 = userSession;
        this.A06 = interfaceC60442pS;
        this.A07 = abstractC37552Gg8;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        AbstractC167017dG.A1Q(anonymousClass320, enumC37671p4);
    }
}
