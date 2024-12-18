package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.36D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36D extends AnonymousClass346 {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC670430v A02;
    public final C28091Xn A03;
    public final Context A04;
    public final InterfaceC60442pS A05;
    public final C36P A06;
    public final C681134z A07;
    public final C64092vU A08;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu2(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c59072n8, 0);
        C14360o3.A0B(c38321qM, 1);
        if (c38321qM.CdW() && AbstractC75423a9.A02(c38321qM, this.A05)) {
            c59072n8.A00(this.A06);
        }
    }

    public static final void A00(C59072n8 c59072n8, C38321qM c38321qM, C36D c36d) {
        UserSession userSession = c36d.A01;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36326163375077083L) && c38321qM.CdW() && AbstractC75423a9.A02(c38321qM, c36d.A05)) {
            c59072n8.A00(c36d.A07);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.36P] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.36O] */
    public C36D(Activity activity, Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC670430v interfaceC670430v) {
        this.A04 = context;
        this.A00 = activity;
        this.A01 = userSession;
        this.A05 = interfaceC60442pS;
        this.A02 = interfaceC670430v;
        this.A03 = C28071Xl.A00(context, userSession);
        C64092vU c64092vU = new C64092vU(AbstractC11060iN.A00(userSession), false);
        this.A08 = c64092vU;
        ArrayList arrayList = new ArrayList();
        InterfaceC670430v interfaceC670430v2 = this.A02;
        if (interfaceC670430v2 != null) {
            UserSession userSession2 = this.A01;
            C14360o3.A0B(userSession2, 0);
            if (C18U.A06(C06090Tz.A05, userSession2, 36314652862450428L)) {
                arrayList.add(new C36E(userSession2, interfaceC670430v2, c64092vU));
            }
        }
        final UserSession userSession3 = this.A01;
        C14360o3.A0B(userSession3, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession3, 36323457545284885L);
        C14360o3.A0A(Boolean.valueOf(A06));
        if (A06) {
            arrayList.add(new C36M(userSession3, c64092vU));
        }
        if (interfaceC670430v2 != null) {
            boolean A062 = C18U.A06(c06090Tz, userSession3, 36328637275913924L);
            C14360o3.A0A(Boolean.valueOf(A062));
            if (A062) {
                arrayList.add(new C42394Ipv(userSession3, interfaceC670430v2, c64092vU));
            }
        }
        if (C18U.A06(c06090Tz, userSession3, 36329178441728115L)) {
            arrayList.add(new C36N(this.A00, userSession3, c64092vU));
        }
        final ?? r2 = new Object() { // from class: X.36O
        };
        final List A0a = AbstractC001800i.A0a(arrayList);
        this.A06 = new InterfaceC43071ya(userSession3, r2, A0a) { // from class: X.36P
            public final UserSession A00;
            public final Map A01 = new LinkedHashMap();
            public final C36O A02;
            public final List A03;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
            @Override // X.InterfaceC43071ya
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ATP(X.C59062n7 r9, X.InterfaceC57162jr r10) {
                /*
                    r8 = this;
                    r0 = 0
                    X.C14360o3.A0B(r9, r0)
                    r7 = 1
                    X.C14360o3.A0B(r10, r7)
                    java.util.List r0 = r8.A03
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r2 = r0.iterator()
                L13:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L2a
                    java.lang.Object r1 = r2.next()
                    r0 = r1
                    X.36F r0 = (X.C36F) r0
                    boolean r0 = r0.CT0(r9, r10)
                    if (r0 == 0) goto L13
                    r5.add(r1)
                    goto L13
                L2a:
                    boolean r0 = r5.isEmpty()
                    if (r0 != 0) goto L4f
                    com.instagram.common.session.UserSession r1 = r8.A00
                    java.lang.Object r0 = r9.A03
                    X.1qM r0 = (X.C38321qM) r0
                    java.lang.String r4 = X.AbstractC41071vF.A07(r1, r0)
                    if (r4 == 0) goto L4f
                    java.util.Map r3 = r8.A01
                    java.lang.Object r2 = r3.get(r4)
                    X.1ya r2 = (X.InterfaceC43071ya) r2
                    if (r2 == 0) goto L50
                    boolean r0 = r5.contains(r2)
                    if (r0 == 0) goto L4f
                L4c:
                    r2.ATP(r9, r10)
                L4f:
                    return
                L50:
                    boolean r0 = r5.isEmpty()
                    r6 = 0
                    if (r0 != 0) goto L4f
                    int r0 = r5.size()
                    if (r0 != r7) goto L66
                    java.lang.Object r2 = X.AbstractC001800i.A0J(r5)
                L61:
                    X.1ya r2 = (X.InterfaceC43071ya) r2
                L63:
                    if (r2 != 0) goto Lb5
                    return
                L66:
                    java.util.Iterator r1 = r5.iterator()
                L6a:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto Lb3
                    java.lang.Object r2 = r1.next()
                    boolean r0 = r2 instanceof X.C36N
                    if (r0 == 0) goto L6a
                L78:
                    X.1ya r2 = (X.InterfaceC43071ya) r2
                    if (r2 != 0) goto Lb5
                    java.util.Iterator r1 = r5.iterator()
                L80:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto Lb1
                    java.lang.Object r2 = r1.next()
                    boolean r0 = r2 instanceof X.C36M
                    if (r0 == 0) goto L80
                L8e:
                    X.1ya r2 = (X.InterfaceC43071ya) r2
                    if (r2 != 0) goto Lb5
                    java.util.Iterator r2 = r5.iterator()
                L96:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto La5
                    java.lang.Object r1 = r2.next()
                    boolean r0 = r1 instanceof X.C42394Ipv
                    if (r0 == 0) goto L96
                    r6 = r1
                La5:
                    r2 = r6
                    X.1ya r2 = (X.InterfaceC43071ya) r2
                    if (r2 != 0) goto L63
                    X.2Ut r0 = X.AbstractC50712Us.A00
                    java.lang.Object r2 = X.AbstractC001800i.A0H(r5, r0)
                    goto L61
                Lb1:
                    r2 = r6
                    goto L8e
                Lb3:
                    r2 = r6
                    goto L78
                Lb5:
                    r3.put(r4, r2)
                    if (r2 != 0) goto L4c
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C36P.ATP(X.2n7, X.2jr):void");
            }

            {
                this.A00 = userSession3;
                this.A03 = A0a;
                this.A02 = r2;
            }
        };
        this.A07 = new C681134z(c64092vU);
    }
}
