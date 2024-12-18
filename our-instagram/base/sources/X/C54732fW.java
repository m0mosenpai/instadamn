package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.2fW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54732fW implements InterfaceC13000lm, InterfaceC54742fX {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public Map A05;
    public final InterfaceC26681Qx A08;
    public final C23031Ai A0A;
    public final UserSession A0C;
    public boolean A06 = false;
    public final InterfaceC43641zu A07 = new T2I(this);
    public final InterfaceC41501vz A09 = new InterfaceC41501vz() { // from class: X.TFi
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            C54732fW.A03(C54732fW.this, false);
        }
    };
    public final C102524jl A0B = new C102524jl();
    public final AbstractRunnableC14200nk A0D = new C60949Rc9(this);

    @Override // X.InterfaceC54742fX
    public final void AWV() {
        A03(this, false);
    }

    private void A01() {
        if (this.A08.C98().A0C.contains("ig_read_zero_cms") && !this.A06) {
            C41451vu.A01.A02(this.A09, C57432kI.class);
            this.A06 = true;
        }
    }

    public static void A02(C54732fW c54732fW, long j) {
        Object obj = c54732fW.A01;
        if (obj != null) {
            c54732fW.A0B.A00(obj);
        }
        C102524jl c102524jl = c54732fW.A0B;
        AbstractRunnableC14200nk abstractRunnableC14200nk = c54732fW.A0D;
        c102524jl.A01(abstractRunnableC14200nk, j);
        c54732fW.A01 = abstractRunnableC14200nk;
    }

    public static void A03(C54732fW c54732fW, boolean z) {
        C1R0 C98 = c54732fW.A08.C98();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) new ArrayList(C98.A0C));
        String str = "";
        if (z) {
            str = c54732fW.A0A.A01.getString("cms_client_hash", "");
        }
        int i = C98.A00;
        C2JM c2jm = new C2JM();
        c2jm.A05("zero_features", copyOf);
        c2jm.A04("hash", str);
        c2jm.A04("carrier_id", String.format("%d", Integer.valueOf(i)));
        C907442n c907442n = new C907442n(c2jm, C211529Yk.class, "FetchCmsQuery", false);
        UserSession userSession = c54732fW.A0C;
        C14360o3.A0B(userSession, 0);
        C907542o c907542o = new C907542o(userSession);
        c907542o.A08(c907442n);
        Integer num = C05F.A00;
        c907542o.A08 = AbstractC111324zv.A00(58);
        C1ON A07 = c907542o.A07(num);
        A07.A00 = new C60900RbF(c54732fW, z);
        C1GJ.A03(A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r9 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r10.A05 == null) goto L10;
     */
    @Override // X.InterfaceC54742fX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            X.1Qx r4 = r10.A08
            X.1R0 r0 = r4.C98()
            java.lang.String r1 = "ig_read_zero_cms"
            java.util.Set r0 = r0.A0C
            boolean r1 = r0.contains(r1)
            r0 = 0
            if (r1 == 0) goto L8e
            java.lang.String r1 = r10.A04
            if (r1 == 0) goto L1e
            int r1 = r10.A00
            if (r1 == 0) goto L1e
            java.util.Map r2 = r10.A05
            r1 = 1
            if (r2 != 0) goto L1f
        L1e:
            r1 = 0
        L1f:
            r3 = 0
            if (r1 != 0) goto L91
            r1 = 657(0x291, float:9.2E-43)
            java.lang.String r5 = X.AbstractC58317Pt9.A00(r1)
            X.1Ai r6 = r10.A0A
            r9 = 0
            X.0xq r8 = r6.A01
            java.lang.String r1 = "zero_cms_carrier_id"
            int r1 = r8.getInt(r1, r3)
            r10.A00 = r1
            X.0ry r2 = r6.A8b
            X.0YR[] r7 = X.C23031Ai.A8c
            r1 = 179(0xb3, float:2.51E-43)
            r1 = r7[r1]
            java.lang.Object r1 = r2.CES(r6, r1)
            java.lang.String r1 = (java.lang.String) r1
            r10.A04 = r1
            java.lang.String r1 = "cms_client_hash"
            java.lang.String r1 = r8.getString(r1, r0)
            r10.A03 = r1
            X.0ry r2 = r6.A8a
            r1 = 180(0xb4, float:2.52E-43)
            r1 = r7[r1]
            java.lang.Object r6 = r2.CES(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            int r1 = r10.A00
            if (r1 == 0) goto L89
            java.lang.String r1 = r10.A04
            if (r1 == 0) goto L89
            java.lang.String r1 = r10.A03
            if (r1 == 0) goto L89
            if (r6 == 0) goto L89
            X.44S r2 = new X.44S     // Catch: java.io.IOException -> L82
            r2.<init>(r0)     // Catch: java.io.IOException -> L82
            X.R8t r1 = new X.R8t     // Catch: java.io.IOException -> L82
            r1.<init>(r10)     // Catch: java.io.IOException -> L82
            java.lang.Object r2 = r2.A0C(r1, r6)     // Catch: java.io.IOException -> L82
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.io.IOException -> L82
            if (r2 == 0) goto L88
            int r1 = r2.size()     // Catch: java.io.IOException -> L82
            if (r1 == 0) goto L88
            r10.A05 = r2     // Catch: java.io.IOException -> L82
            goto L88
        L82:
            r2 = move-exception
            java.lang.String r1 = "Error while de-serializing cms data"
            X.C0w9.A06(r5, r1, r2)
        L88:
            r9 = 1
        L89:
            if (r9 != 0) goto L91
        L8b:
            A03(r10, r3)
        L8e:
            if (r0 == 0) goto Lb8
            return r0
        L91:
            java.lang.String r2 = r10.A04
            if (r2 == 0) goto La3
            java.util.Locale r1 = X.C1Q2.A02()
            java.lang.String r1 = r1.toString()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L8b
        La3:
            int r2 = r10.A00
            X.1R0 r1 = r4.C98()
            int r1 = r1.A00
            if (r2 != r1) goto L8b
            java.util.Map r1 = r10.A05
            if (r1 == 0) goto L8b
            java.lang.Object r0 = r1.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            goto L8e
        Lb8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54732fW.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A0B.A00(this.A01);
        this.A08.EGT(this.A07);
        if (this.A06) {
            C41451vu.A01.A03(this.A09, C57432kI.class);
            this.A06 = false;
        }
    }

    public C54732fW(UserSession userSession) {
        this.A0C = userSession;
        this.A0A = AbstractC23021Ah.A00(userSession);
        this.A08 = C26661Qv.A00(userSession);
        A01();
        this.A08.AAd(this.A07);
        A01();
        A02(this, this.A08.C98().A01 * 1000);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2fX, java.lang.Object] */
    public static InterfaceC54742fX A00(final UserSession userSession) {
        String str = C26661Qv.A00(userSession).C98().A05;
        if (str != null && !str.equals("") && !str.equals("-1") && !str.equals("0") && userSession != null) {
            return (InterfaceC54742fX) userSession.A01(C54732fW.class, new InterfaceC16820sZ() { // from class: X.TW9
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return new C54732fW(UserSession.this);
                }
            });
        }
        return new Object();
    }
}
