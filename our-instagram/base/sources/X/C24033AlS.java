package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.AlS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24033AlS implements InterfaceC169117gk {
    public final C195218kN A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    @Override // X.InterfaceC169117gk
    public final Object E7Q(String str) {
        C14360o3.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C195218kN c195218kN = this.A00;
        String str2 = this.A02;
        c195218kN.A08(null, str2, str, linkedHashSet);
        List list = this.A04;
        if (list != null) {
            C01L A1I = C0eM.A1I();
            A1I.addAll(list);
            AbstractC169147gn.A00(null, str, C0eM.A1J(A1I), linkedHashSet);
        }
        ArrayList A0U = AbstractC001800i.A0U(linkedHashSet);
        c195218kN.A09(str2, A0U);
        return new A85(str, A0U, linkedHashSet);
    }

    public C24033AlS(UserSession userSession, String str, String str2, List list) {
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = list;
        this.A03 = str2;
        C195218kN A00 = C195218kN.A00(userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r1 > r2.size()) goto L20;
     */
    @Override // X.InterfaceC169117gk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object AIV(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            java.util.List r10 = (java.util.List) r10
            com.instagram.common.session.UserSession r3 = r8.A01
            java.lang.String r2 = r8.A03
            X.01L r4 = X.C0eM.A1I()
            if (r10 != 0) goto Le
            X.0sl r10 = X.C16930sl.A00
        Le:
            r7 = 0
            X.B85 r1 = X.B85.A00
            java.lang.Class<X.A6B> r0 = X.A6B.class
            java.lang.Object r1 = r3.A01(r0, r1)
            X.A6B r1 = (X.A6B) r1
            monitor-enter(r1)
            android.util.LruCache r0 = r1.A00     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb9
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r1)
            if (r9 == 0) goto Lb4
            boolean r0 = r9 instanceof X.A85
            if (r0 == 0) goto Lb4
            X.A85 r9 = (X.A85) r9
            if (r2 == 0) goto L81
            r1 = 2131954834(0x7f130c92, float:1.9546178E38)
            X.Dq0 r0 = new X.Dq0
            r0.<init>(r1)
            r4.add(r0)
            java.lang.String r6 = r9.A00
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r6)
            if (r0 == 0) goto L4d
            int r1 = r0.intValue()
            if (r1 <= 0) goto L4d
            int r0 = r2.size()
            r5 = 1
            if (r1 <= r0) goto L4e
        L4d:
            r5 = 0
        L4e:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9ZB r0 = (X.C9ZB) r0
            if (r5 == 0) goto L73
            int r0 = r0.A00
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.AbstractC002300n.A0h(r0, r6, r7)
            if (r0 == 0) goto L56
        L73:
            r3.add(r1)
            goto L56
        L77:
            r1 = 28
            X.Mtf r0 = new X.Mtf
            r0.<init>(r3, r1)
            r4.add(r0)
        L81:
            r1 = 2131969515(0x7f1345eb, float:1.9575955E38)
            X.Dq0 r0 = new X.Dq0
            r0.<init>(r1)
            r4.add(r0)
            java.util.List r0 = r9.A01
            r4.addAll(r0)
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r10.iterator()
        L99:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r1 = r2.next()
            java.util.Set r0 = r9.A02
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L99
            r3.add(r1)
            goto L99
        Lb1:
            r4.addAll(r3)
        Lb4:
            X.01L r0 = X.C0eM.A1J(r4)
            return r0
        Lb9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24033AlS.AIV(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object ARP() {
        return C16930sl.A00;
    }
}
