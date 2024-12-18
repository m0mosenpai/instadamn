package X;

import com.google.common.collect.MapMakerInternalMap;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BNG implements InterfaceC43071ya {
    public final long A00;
    public final C006802i A01;
    public final InterfaceC14020nS A02;
    public final BNF A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final java.util.Set A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        if (r2 != null) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r35, X.InterfaceC57162jr r36) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BNG.ATP(X.2n7, X.2jr):void");
    }

    public /* synthetic */ BNG(UserSession userSession, BNF bnf) {
        InterfaceC14020nS A00 = C14120nc.A00();
        C006802i c006802i = C006802i.A0p;
        AbstractC25233BEq.A0x(1, userSession, A00, c006802i);
        this.A03 = bnf;
        this.A02 = A00;
        this.A01 = c006802i;
        C18B c18b = new C18B();
        c18b.A04(MapMakerInternalMap.Strength.A01);
        c18b.A01();
        this.A06 = c18b.A00();
        this.A05 = AbstractC166987dD.A1I();
        this.A07 = new LinkedHashSet();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A00 = (long) C18U.A00(c06090Tz, userSession, 37162625435500790L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36318200505309197L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36318200505636881L);
        this.A04 = AbstractC167017dG.A0j();
    }
}
