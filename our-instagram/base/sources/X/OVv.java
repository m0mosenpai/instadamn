package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OVv {
    public final C2GT A00;
    public final C2GS A01;
    public final UserSession A02;
    public final C8K6 A03;
    public final Map A05 = AbstractC166987dD.A1G();
    public final Map A06 = AbstractC166987dD.A1G();
    public final Map A04 = AbstractC166987dD.A1G();

    public OVv(UserSession userSession, C8K6 c8k6) {
        this.A02 = userSession;
        this.A03 = c8k6;
        C2GS A0E = MSW.A0E();
        this.A01 = A0E;
        this.A00 = A0E;
    }

    public static final Object A00(OVv oVv, String str, InterfaceC23621Ds interfaceC23621Ds) {
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        UserSession userSession = oVv.A02;
        C1C6 A00 = C1C6.A00();
        C14360o3.A07(A00);
        OJH ojh = new OJH(A00, userSession, "ig_reels");
        ojh.A00 = new OyM(str, A0s);
        A0s.CPA(C57623PhZ.A00);
        ojh.A00(str);
        return A0s.A0E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010f, code lost:
    
        if (X.AJp.A01(r0) == false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0sl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A01(java.util.List r14, java.util.Map r15, java.util.Map r16) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OVv.A01(java.util.List, java.util.Map, java.util.Map):java.util.List");
    }
}
