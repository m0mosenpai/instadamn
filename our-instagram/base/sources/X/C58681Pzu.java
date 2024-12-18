package X;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Pzu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58681Pzu {
    public final /* synthetic */ C1339463c A00;
    public final /* synthetic */ C58680Pzt A01;
    public final /* synthetic */ C58678Pzr A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Executor A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public final void A01(Q03 q03, Throwable th) {
        C14360o3.A0B(th, 0);
        C1339463c c1339463c = this.A00;
        Map map = c1339463c.A03;
        String str = this.A04;
        Object obj = map.get(str);
        if (obj != null) {
            java.util.Set set = (java.util.Set) obj;
            map.remove(str);
            C58678Pzr c58678Pzr = this.A02;
            EnumC58683Pzw enumC58683Pzw = c58678Pzr.A01;
            EnumC58683Pzw enumC58683Pzw2 = EnumC58683Pzw.A02;
            if (enumC58683Pzw != enumC58683Pzw2 && set.contains(enumC58683Pzw2)) {
                String str2 = this.A03;
                c1339463c.A00(new C58678Pzr(enumC58683Pzw2, c58678Pzr.A02, c58678Pzr.A03, c58678Pzr.A00), str, str2, this.A05, this.A06, this.A07);
                return;
            }
            this.A06.invoke(new C60925Rbf(q03, str, th));
            return;
        }
        throw AbstractC166987dD.A14("Invalid state: Active queries have been cleaned up, but requests still in flight");
    }

    public C58681Pzu(C1339463c c1339463c, C58680Pzt c58680Pzt, C58678Pzr c58678Pzr, String str, String str2, Executor executor, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        this.A01 = c58680Pzt;
        this.A00 = c1339463c;
        this.A04 = str;
        this.A02 = c58678Pzr;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = interfaceC16660sJ;
        this.A03 = str2;
        this.A05 = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0134, code lost:
    
        if (r4.A00 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if (r37.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, X.THk] */
    /* JADX WARN: Type inference failed for: r13v5, types: [X.THk] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.LzC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.SHt, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.Q03 r36, java.lang.String r37, java.util.List r38) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58681Pzu.A00(X.Q03, java.lang.String, java.util.List):void");
    }
}
