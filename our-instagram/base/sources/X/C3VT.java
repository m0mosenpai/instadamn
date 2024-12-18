package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

@Deprecated(message = "Delegates are deprecated, see KDoc above")
/* renamed from: X.3VT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VT implements C3VU {
    public final Fragment A00;
    public final UserSession A01;
    public final C57112jm A02;
    public final InterfaceC65282xQ A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C9EG(this, 9));
    public final C36Y A05;
    public final InterfaceC686136y A06;
    public final C24461Hp A07;
    public final InterfaceC60442pS A08;
    public final C36Q A09;
    public final InterfaceC61432r6 A0A;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        if (r0.AgU() == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0021, code lost:
    
        if (r13 != null) goto L10;
     */
    @Override // X.C3VU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D2a(X.C38321qM r12, X.C38321qM r13, X.C38321qM r14, int r15, int r16, int r17) {
        /*
            r11 = this;
            r7 = r14
            boolean r0 = r14.A6T()
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            if (r0 != 0) goto L1c
            X.1rF r0 = r14.A0C
            X.4vY r0 = r0.BRN()
            if (r0 == 0) goto La6
            X.46k r0 = r0.AgU()
            if (r0 == 0) goto La6
        L1c:
            X.2xQ r0 = r11.A03
            r0.CtR(r12)
            if (r13 == 0) goto L2c
        L23:
            X.36Y r0 = r11.A05
            if (r0 == 0) goto L2c
            X.2vr r4 = r0.A04
            r4.Cij(r5, r6, r7, r8, r9, r10)
        L2c:
            r0 = -1
            if (r15 == r0) goto L9b
            if (r10 == r9) goto L9b
            if (r10 <= r9) goto La3
            java.lang.Integer r1 = X.C05F.A00
        L35:
            com.instagram.common.session.UserSession r4 = r11.A01
            X.2pS r3 = r11.A08
            java.lang.String r0 = "gesture"
            X.3mZ r2 = X.AbstractC82703mY.A04(r12, r3, r0)
            r2.A0G(r4, r12)
            r2.A08(r10)
            int r0 = r1.intValue()
            if (r0 == 0) goto La0
            r0 = 3199(0xc7f, float:4.483E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
        L51:
            r2.A7T = r0
            boolean r1 = r12.CdW()
            X.0wW r0 = X.AbstractC12220kQ.A01(r3, r4)
            if (r1 == 0) goto L9c
            X.Xik.A00(r0, r2, r3)
        L60:
            X.2r6 r3 = r11.A0A
            X.317 r2 = X.AnonymousClass317.A0A
            X.2xQ r0 = r11.A03
            X.3Zb r1 = r0.BRZ(r12)
            X.6T6 r0 = X.C6T5.A00()
            r3.DVi(r0, r2, r12, r1)
            if (r13 == 0) goto L9b
            boolean r0 = r13.CdW()
            if (r0 != 0) goto L9b
            X.1Hp r5 = r11.A07
            java.lang.String r4 = r13.getId()
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317083814138660(0x81063200051324, double:3.0304082689954416E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9b
            if (r4 == 0) goto L9b
            boolean r0 = X.AbstractC001900j.A0T(r4)
            if (r0 != 0) goto L9b
            java.util.Set r0 = r5.A04
            r0.add(r4)
        L9b:
            return
        L9c:
            X.XN2.A00(r0, r2, r3)
            goto L60
        La0:
            java.lang.String r0 = "swipe_left"
            goto L51
        La3:
            java.lang.Integer r1 = X.C05F.A01
            goto L35
        La6:
            if (r13 == 0) goto L2c
            boolean r0 = r13.A6T()
            if (r0 != 0) goto L1c
            X.1rF r0 = r13.A0C
            X.4vY r0 = r0.BRN()
            if (r0 == 0) goto L23
            X.46k r0 = r0.AgU()
            if (r0 == 0) goto L23
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3VT.D2a(X.1qM, X.1qM, X.1qM, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.36W, X.2n8] */
    @Override // X.C3VU
    public final void EDw(View view, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C38321qM A1e;
        C14360o3.A0B(c38321qM, 1);
        C36Q c36q = this.A09;
        if (c36q != null && (A1e = c38321qM.A1e(i)) != null) {
            String A0b = AnonymousClass001.A0b(A1e.getId(), ":carousel_item:", i);
            C42C c42c = new C42C(c75113Zb, i);
            UserSession userSession = c36q.A01;
            C36V c36v = C36V.A02;
            ?? c59072n8 = new C59072n8(c38321qM, c42c, A0b);
            c59072n8.A00 = userSession;
            c36q.A05.Ctu(c59072n8, c38321qM, c42c);
            C57112jm c57112jm = c36q.A02;
            c57112jm.A05(view, new C36V(c59072n8));
            AbstractC79253gW.A00(c57112jm);
        }
    }

    public C3VT(Fragment fragment, UserSession userSession, C57112jm c57112jm, C36Y c36y, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C36Q c36q, InterfaceC61432r6 interfaceC61432r6) {
        this.A06 = interfaceC686136y;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A08 = interfaceC60442pS;
        this.A03 = interfaceC65282xQ;
        this.A05 = c36y;
        this.A0A = interfaceC61432r6;
        this.A09 = c36q;
        this.A02 = c57112jm;
        this.A07 = AbstractC24451Ho.A00(userSession);
    }

    @Override // X.C37M
    public final InterfaceC80083hx Ai8() {
        return this.A06.Ai8();
    }

    @Override // X.C37O
    public final InterfaceC101004gG Am6() {
        return this.A06.Am6();
    }

    @Override // X.InterfaceC686337a
    public final InterfaceC904041a AmA() {
        return this.A06.AmA();
    }

    @Override // X.C37W
    public final InterfaceC904541f AmN() {
        return this.A06.AmN();
    }

    @Override // X.C37E
    public final C41V AmT() {
        return this.A06.AmT();
    }

    @Override // X.C37K
    public final InterfaceC86673tf ApH() {
        return this.A06.ApH();
    }

    @Override // X.AnonymousClass372
    public final C39G Ar3() {
        return this.A06.Ar3();
    }

    @Override // X.C3VU
    public final void Dg6(View view, C38321qM c38321qM, int i) {
        C37466Gek c37466Gek = (C37466Gek) this.A04.getValue();
        String A0R = AnonymousClass001.A0R("shop_entry_point_impression_", c38321qM.getId());
        C57112jm c57112jm = c37466Gek.A03;
        Integer valueOf = Integer.valueOf(i);
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(c38321qM, valueOf, A0R);
        c59072n8.A00(c37466Gek.A02);
        c57112jm.A05(view, c59072n8.A01());
    }

    @Override // X.InterfaceC686236z
    public final InterfaceC86303t2 BRj() {
        throw C00O.createAndThrow();
    }
}
