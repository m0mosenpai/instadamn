package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* loaded from: classes5.dex */
public final class BMA extends C3r5 {
    public static final java.util.Set A0B = AbstractC16830sb.A06(EnumC25465BOe.A03, EnumC25465BOe.A0I, EnumC25465BOe.A04, EnumC25465BOe.A0L);
    public final C37730Gj5 A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final SearchContext A03;
    public final BMD A04;
    public final BP6 A05;
    public final BMB A06;
    public final BMC A07;
    public final C37604Ggz A08;
    public final IG5 A09;
    public final String A0A;

    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f4, code lost:
    
        if (r1 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0309, code lost:
    
        if (r11 != null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0145, code lost:
    
        if (r1 == false) goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x01c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A05(X.C120985dq r36, X.C38321qM r37, X.C75113Zb r38) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMA.A05(X.5dq, X.1qM, X.3Zb):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.BP6] */
    public /* synthetic */ BMA(UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, IG5 ig5, String str) {
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        ?? obj = new Object();
        BMB bmb = new BMB(userSession);
        BMC bmc = new BMC(userSession);
        BMD bmd = new BMD(userSession, bmc);
        C37730Gj5 A002 = BME.A00(userSession);
        AbstractC25229BEm.A1I(searchContext, 3, A00);
        C14360o3.A0B(A002, 11);
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = searchContext;
        this.A0A = str;
        this.A09 = ig5;
        this.A08 = A00;
        this.A05 = obj;
        this.A06 = bmb;
        this.A07 = bmc;
        this.A04 = bmd;
        this.A00 = A002;
    }
}
