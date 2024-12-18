package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.33P, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33P extends C1I2 implements InterfaceC60602pj, C30B, C33Q, C33R, C33S, View.OnKeyListener {
    public View A00;
    public C66290U7l A01;
    public C3A4 A02;
    public C3FQ A03;
    public boolean A04;
    public C41230IMv A05;
    public InterfaceC41501vz A06;
    public StickyHeaderListView A07;
    public boolean A08;
    public final InterfaceC60022ok A09;
    public final UserSession A0A;
    public final C57112jm A0B;
    public final InterfaceC60442pS A0C;
    public final InterfaceC65282xQ A0D;
    public final C33N A0E;
    public final C33U A0F;
    public final C30E A0G;
    public final C33T A0H;
    public final C676433d A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final boolean A0M;
    public final Context A0N;
    public final Fragment A0O;
    public final HeroScrollSetting A0P;
    public final C25671My A0Q;
    public final C676233b A0R;
    public final AbstractC61692rW A0S;
    public final Integer A0T;
    public final Map A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C33P(android.content.Context r14, com.instagram.common.session.UserSession r15, X.InterfaceC60442pS r16, X.InterfaceC65282xQ r17) {
        /*
            r13 = this;
            r2 = 0
            r0 = 2
            r3 = r15
            X.C14360o3.A0B(r15, r0)
            r0 = 3
            r5 = r16
            X.C14360o3.A0B(r5, r0)
            r0 = 4
            r7 = r17
            X.C14360o3.A0B(r7, r0)
            X.33N r9 = X.C33N.A08
            r0 = 6
            X.C14360o3.A0B(r9, r0)
            java.lang.Integer r10 = X.C05F.A0u
            r12 = 0
            r0 = r13
            r1 = r14
            r4 = r2
            r6 = r2
            r8 = r2
            r11 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.<init>(android.content.Context, com.instagram.common.session.UserSession, X.2pS, X.2xQ):void");
    }

    public final EnumC79303gb A01(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.BRp() == EnumC40111tc.A0a && !c38321qM.equals(this.A0G.A0G())) {
            return EnumC79303gb.A03;
        }
        return EnumC79303gb.A02;
    }

    public final EnumC74373Vt A02(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (!this.A0D.BRZ(c38321qM).A0l.A00() && !this.A0G.A0a(c38321qM)) {
            return EnumC74373Vt.A0C;
        }
        return this.A0G.A0I(c38321qM);
    }

    public final void A03(View view, C38321qM c38321qM, Object obj, float f, int i, int i2) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(obj, 1);
        C33U c33u = this.A0F;
        Map map = c33u.A0O;
        C4HV c4hv = (C4HV) map.get(c38321qM);
        if (c4hv == null) {
            map.put(c38321qM, new C4HV(view, obj, f, i, i2, false, false, false));
        } else {
            if (f != c4hv.A00 || i != c4hv.A02 || i2 != c4hv.A01) {
                c4hv.A02 = i;
                c4hv.A01 = i2;
                c4hv.A00 = f;
            }
            c33u.A0H.BRZ(c38321qM);
        }
        c33u.A08 = true;
        c33u.A0H.BRZ(c38321qM);
    }

    public final void A04(View view, C38321qM c38321qM, Object obj, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(obj, 1);
        C33U c33u = this.A0F;
        c33u.A0O.put(c38321qM, new C4HV(view, obj, f, i, i2, z, z2, z3));
        C75113Zb BRZ = c33u.A0H.BRZ(c38321qM);
        if (false != BRZ.A25) {
            BRZ.A25 = false;
        }
        c33u.A08 = true;
        c33u.A07 = true;
    }

    public final void A05(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C30E c30e = this.A0G;
        if (C3u9.A00(c30e.A0J())) {
            if (C903540u.A00.A01(this.A0A, c38321qM)) {
                c30e.A0U("scroll");
            } else {
                c30e.A0V("scroll", false, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC65512xn.A00(r5.A0F).A00, 36329238572056795L) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C38321qM r8) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            X.33U r5 = r7.A0F
            X.33Y r1 = r5.A0K
            boolean r0 = r1.A03(r8)
            if (r0 == 0) goto L11
            r0 = 0
            r1.A00 = r0
        L11:
            X.2xQ r0 = r5.A0H
            X.3Zb r6 = r0.BRZ(r8)
            boolean r0 = r6.A25
            r4 = 1
            if (r0 == 0) goto L32
            com.instagram.common.session.UserSession r0 = r5.A0F
            X.2kL r0 = X.AbstractC65512xn.A00(r0)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329238572056795(0x811140000c40db, double:3.038094986846152E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 == 0) goto L33
        L32:
            r1 = 0
        L33:
            com.instagram.common.session.UserSession r0 = r5.A0F
            boolean r0 = X.AbstractC41071vF.A0T(r0, r8)
            if (r0 == 0) goto L42
            if (r1 != 0) goto L42
            X.3Zn r0 = X.EnumC75203Zn.A05
            r6.A0K(r0)
        L42:
            java.util.Map r0 = r5.A0O
            r0.remove(r8)
            r5.A08 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.A06(X.1qM):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r3 == X.C3Q0.PAUSED) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0041, code lost:
    
        if (r0 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C38321qM r11, X.C3Y7 r12, X.C75113Zb r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.A07(X.1qM, X.3Y7, X.3Zb):void");
    }

    public final void A09(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, C4QP c4qp, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c3y7, 2);
        A0A(c38321qM, c3y7, c75113Zb, c4qp, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        if (X.AbstractC76273bX.A00(r1, r18) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(X.C38321qM r18, X.C3Y7 r19, X.C75113Zb r20, X.C4QP r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.A0A(X.1qM, X.3Y7, X.3Zb, X.4QP, boolean, boolean):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if ((r2 instanceof android.view.ViewGroup) != false) goto L8;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8S(android.view.View r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r5.A00 = r6
            r0 = 2131441895(0x7f0b38e7, float:1.8505815E38)
            android.view.View r0 = r6.findViewById(r0)
            com.instagram.ui.listview.StickyHeaderListView r0 = (com.instagram.ui.listview.StickyHeaderListView) r0
            r5.A07 = r0
            X.33U r4 = r5.A0F
            r4.A05 = r0
            r3 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r2 = r6.findViewById(r3)
            if (r2 != 0) goto L3a
            com.instagram.common.session.UserSession r1 = r5.A0A
            java.lang.Integer r0 = r5.A0T
            android.view.View r1 = X.C33L.A00(r6, r1, r0)
            android.view.View r2 = r1.findViewById(r3)
            if (r2 != 0) goto L3a
            r0 = 2131439408(0x7f0b2f30, float:1.850077E38)
            android.view.View r2 = r1.findViewById(r0)
            X.C14360o3.A07(r2)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L42
        L3a:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.3FQ r0 = X.C3FN.A00(r2)
            r5.A03 = r0
        L42:
            X.3FQ r0 = r5.A03
            r4.A04 = r0
            X.2jm r0 = r5.A0B
            if (r0 == 0) goto L4c
            r0.A00 = r4
        L4c:
            com.instagram.common.session.UserSession r1 = r5.A0A
            java.lang.String r0 = "ig_video_setting"
            boolean r0 = X.C3FU.A02(r1, r0)
            if (r0 == 0) goto L64
            X.Inn r2 = new X.Inn
            r2.<init>(r5)
            X.1My r1 = r5.A0Q
            java.lang.Class<X.FwW> r0 = X.C36096FwW.class
            r1.A01(r2, r0)
            r5.A06 = r2
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.D8S(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r2 == X.EnumC75183Zl.A05) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
    
        if (r6 != null) goto L53;
     */
    @Override // X.C33R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSJ(X.C75113Zb r27, int r28) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.DSJ(X.3Zb, int):void");
    }

    @Override // X.C30B
    public final void DsL(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb) {
        C3FQ c3fq;
        int BMa;
        C14360o3.A0B(c3y7, 2);
        View BQt = c3y7.BQt();
        if (BQt != null && (c3fq = this.A03) != null && (BMa = c3fq.BMa(BQt)) != -1) {
            c3fq.EmE(BMa, Math.max((c3fq.CFj().getHeight() - BQt.getHeight()) / 2, C3HB.A00(this.A0N)));
        }
    }

    @Override // X.C30B
    public final void DzI(C38321qM c38321qM, String str) {
        C14360o3.A0B(c38321qM, 0);
        java.util.Set set = (java.util.Set) this.A0U.remove(c38321qM);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC97134Xy) it.next()).DzI(c38321qM, str);
            }
        }
    }

    @Override // X.C30B
    public final void E01(EnumC92424Bx enumC92424Bx, C38321qM c38321qM) {
        InterfaceC678133v interfaceC678133v;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(enumC92424Bx, 1);
        AbstractC61692rW abstractC61692rW = this.A0S;
        if (abstractC61692rW != null) {
            abstractC61692rW.A05(c38321qM);
        }
        C41230IMv c41230IMv = this.A05;
        if (c41230IMv != null && (interfaceC678133v = c41230IMv.A00) != null) {
            interfaceC678133v.E4S();
        }
        java.util.Set set = (java.util.Set) this.A0U.remove(c38321qM);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((InterfaceC97134Xy) it.next()).E09(enumC92424Bx, c38321qM);
            }
        }
    }

    @Override // X.C33S
    public final void Eob() {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
        this.A0G.A0L();
        InterfaceC41501vz interfaceC41501vz = this.A06;
        if (interfaceC41501vz != null) {
            this.A0Q.A02(interfaceC41501vz, C36096FwW.class);
        }
        C33U c33u = this.A0F;
        c33u.A0D.removeCallbacksAndMessages(null);
        this.A07 = null;
        c33u.A05 = null;
        this.A03 = null;
        c33u.A04 = null;
        C57112jm c57112jm = this.A0B;
        if (c57112jm != null) {
            c57112jm.A00 = null;
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(keyEvent, 2);
        return this.A0G.onKey(view, i, keyEvent);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        C3Y7 c3y7;
        View BQt;
        this.A08 = true;
        C33U c33u = this.A0F;
        c33u.A0A = true;
        if (!this.A0D.CSO() || this.A0M) {
            c33u.A0D.sendEmptyMessage(0);
        }
        C4S6 c4s6 = this.A0G.A02;
        if (c4s6 != null && (c3y7 = c4s6.A08) != null && (BQt = c3y7.BQt()) != null) {
            BQt.setVisibility(0);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    public final C38321qM A00() {
        int B6q;
        int BM3;
        View BQt;
        C38321qM A00;
        C33U c33u = this.A0F;
        C3FQ c3fq = c33u.A04;
        if (c3fq == null || (B6q = c3fq.B6q()) > (BM3 = c3fq.BM3())) {
            return null;
        }
        while (true) {
            InterfaceC65282xQ interfaceC65282xQ = c33u.A0H;
            C3Y7 A01 = C3Q5.A01(c33u.A0F, interfaceC65282xQ, c3fq, B6q);
            if (A01 != null && (BQt = A01.BQt()) != null) {
                int height = (int) (BQt.getHeight() * c33u.A0B);
                StickyHeaderListView stickyHeaderListView = c33u.A05;
                ViewGroup CFj = c3fq.CFj();
                C14360o3.A07(CFj);
                if (C81203jp.A01(CFj, BQt, stickyHeaderListView) >= height && (A00 = C3Q5.A00(interfaceC65282xQ, c3fq, B6q)) != null) {
                    return A00;
                }
            }
            if (B6q != BM3) {
                B6q++;
            } else {
                return null;
            }
        }
    }

    public final void A08(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2, int i) {
        UserSession userSession = this.A0A;
        C14360o3.A0B(userSession, 1);
        if (c38321qM.A5M() && c38321qM.A4i() && ((c38321qM.A4y() || (c38321qM.A50() && C36A.A0G(userSession))) && C36A.A07(userSession))) {
            return;
        }
        this.A0G.A0R(c38321qM, this.A0C, c3y7, c75113Zb, interfaceC86303t2, i);
    }

    public final void A0C(String str) {
        this.A0F.A0M.A0V(str, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
    
        if (r0 != null) goto L54;
     */
    @Override // X.C30B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DaS(X.C38321qM r9, int r10) {
        /*
            r8 = this;
            X.2rW r0 = r8.A0S
            if (r0 == 0) goto L7
            r0.A04(r9)
        L7:
            X.3A4 r2 = r8.A02
            if (r2 == 0) goto L32
            if (r9 == 0) goto L32
            X.41E r1 = X.C41E.A00
            com.instagram.common.session.UserSession r0 = r2.A06
            boolean r0 = r1.A01(r0, r9)
            if (r0 != 0) goto L30
            r0 = 1
            r2.A05 = r0
            java.util.List r0 = r2.A07
            java.util.Iterator r1 = r0.iterator()
        L20:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.next()
            X.33S r0 = (X.C33S) r0
            r0.Eob()
            goto L20
        L30:
            r2.A01 = r9
        L32:
            boolean r0 = r8.A0X
            if (r0 != 0) goto Lc6
            android.content.Context r0 = r8.A0N
            com.instagram.common.session.UserSession r7 = r8.A0A
            r6 = 1
            boolean r0 = X.AbstractC97064Xr.A00(r0, r7, r6)
            if (r0 == 0) goto Lc6
        L41:
            X.2xQ r5 = r8.A0D
            int r0 = r5.getCount()
            if (r10 >= r0) goto L52
            java.lang.Object r0 = r5.getItem(r10)
            if (r0 == r9) goto L52
            int r10 = r10 + 1
            goto L41
        L52:
            r3 = 0
        L53:
            int r10 = r10 + 1
            int r0 = r5.getCount()
            if (r10 >= r0) goto Lc6
            r0 = 20
            if (r3 >= r0) goto Lc6
            java.lang.Object r4 = r5.getItem(r10)
            if (r4 == 0) goto L53
            X.C14360o3.A0B(r7, r6)
            boolean r0 = r4 instanceof X.C38321qM
            if (r0 == 0) goto L53
            X.1qM r4 = (X.C38321qM) r4
            boolean r0 = X.AbstractC41071vF.A0S(r7, r4)
            if (r0 != 0) goto L53
            boolean r0 = r4.A5M()
            if (r0 != 0) goto L53
            if (r10 < 0) goto Ldd
            int r0 = r5.getCount()
            if (r10 >= r0) goto Ldd
            java.lang.Object r2 = r5.getItem(r10)
        L86:
            int r1 = r10 - r6
            if (r1 < 0) goto Ldb
            int r0 = r5.getCount()
            if (r1 >= r0) goto Ldb
            java.lang.Object r0 = r5.getItem(r1)
        L94:
            if (r2 == r0) goto L53
            if (r4 == r9) goto Ld7
            boolean r0 = X.C3Q5.A04(r7, r5, r4)
            if (r0 == 0) goto Ld7
            X.4AH r3 = X.C4AG.A00(r7)
            boolean r0 = r4.A5M()
            if (r0 == 0) goto Lc7
            X.3Zb r0 = r5.BRZ(r4)
            int r0 = r0.A03
            X.1qM r0 = r4.A1e(r0)
            if (r0 == 0) goto Ld2
        Lb4:
            X.3a3 r2 = r0.CFR()
        Lb8:
            X.2pS r0 = r8.A0C
            java.lang.String r1 = r0.getModuleName()
            X.4AD r0 = new X.4AD
            r0.<init>(r2, r1)
            r3.A01(r0)
        Lc6:
            return
        Lc7:
            boolean r0 = r4.A5Q()
            if (r0 == 0) goto Ld2
            X.1qM r0 = r4.A1d()
            goto Lb4
        Ld2:
            X.3a3 r2 = r4.CFR()
            goto Lb8
        Ld7:
            int r3 = r3 + 1
            goto L53
        Ldb:
            r0 = 0
            goto L94
        Ldd:
            r2 = 0
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.DaS(X.1qM, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (r4 != null) goto L9;
     */
    @Override // X.C30B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dp2(X.C38321qM r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            X.3A4 r2 = r3.A02
            if (r2 == 0) goto L61
            if (r4 == 0) goto L47
            X.41E r1 = X.C41E.A00
            com.instagram.common.session.UserSession r0 = r2.A06
            boolean r0 = r1.A01(r0, r4)
            if (r0 != 0) goto L13
            r0 = 0
            r2.A05 = r0
        L13:
            r0 = 0
            r2.A01 = r0
        L16:
            X.2xQ r0 = r3.A0D
            X.3Zb r2 = r0.BRZ(r4)
            boolean r0 = r2.A2p
            r1 = 0
            if (r0 != 0) goto L25
            boolean r0 = r2.A2o
            if (r0 == 0) goto L26
        L25:
            r5 = 0
        L26:
            boolean r0 = r4.CdW()
            if (r0 == 0) goto L36
            boolean r0 = r3.A0W
            if (r0 == 0) goto L53
            boolean r0 = X.A1Q.A00()
            if (r0 == 0) goto L53
        L36:
            X.30E r0 = r3.A0G
            X.4S6 r0 = r0.A02
            if (r0 == 0) goto L51
            int r0 = r0.A0D
        L3e:
            r2.A0E(r1, r0)
        L41:
            r0 = 0
            r2.A0M(r3, r0, r1)
            r2.A0Q = r1
        L47:
            X.33U r1 = r3.A0F
            r0 = -1
            r1.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.A00 = r0
            return
        L51:
            r0 = 0
            goto L3e
        L53:
            X.30E r0 = r3.A0G
            X.4S6 r0 = r0.A02
            if (r0 == 0) goto L5f
            int r0 = r0.A0D
        L5b:
            r2.A0E(r5, r0)
            goto L41
        L5f:
            r0 = 0
            goto L5b
        L61:
            if (r4 == 0) goto L47
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.Dp2(X.1qM, int, int, int):void");
    }

    @Override // X.C33Q
    public final void Dyw() {
        C33U c33u;
        C30E c30e;
        C38321qM A0G;
        C75113Zb c75113Zb;
        C3Y7 c3y7;
        C38321qM A0G2 = this.A0G.A0G();
        if (A0G2 != null) {
            C27893CRe c27893CRe = (C27893CRe) this.A0J.get(A0G2.getId());
            if (c27893CRe != null) {
                C33P c33p = c27893CRe.A00.A04;
                String str = c27893CRe.A01;
                c33p.A0K.remove(str);
                c33p.A0J.remove(str);
                c27893CRe.A02.resumeWith(C0eB.A00);
            }
            if (C18U.A06(C06090Tz.A05, this.A0A, 36312574101030077L) && (A0G = (c30e = (c33u = this.A0F).A0M).A0G()) != null) {
                C4S6 c4s6 = c30e.A02;
                if (c4s6 != null && (c3y7 = c4s6.A08) != null) {
                    c75113Zb = c3y7.BRY();
                } else {
                    c75113Zb = null;
                }
                if (A0G.A5P()) {
                    AbstractC40651I0j.A00(c75113Zb);
                    c30e.A0U("preview_end");
                    if (c75113Zb != null) {
                        C33U.A05(A0G, c75113Zb, c33u);
                        c75113Zb.A0Y = 0;
                    }
                    c33u.A0H.CtR(A0G);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r7.A0Q >= 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        X.AbstractC40651I0j.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r10.A0I.A03(r8, r10.A0G.getModuleName()) == X.EnumC86893u2.A04) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        r9.A0U("preview_end");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8.A5P() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        X.C33U.A05(r8, r7, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r7.A0Y = 0;
        r10.A0H.CtR(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r1 = r10.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r1.A04(r8) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (((java.lang.Boolean) r1.A08.getValue()).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r1.A02(r8, r7, r10.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r6 >= r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r7 != null) goto L25;
     */
    @Override // X.C33Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DzB() {
        /*
            r11 = this;
            X.33U r10 = r11.A0F
            X.30E r9 = r10.A0M
            X.1qM r8 = r9.A0G()
            if (r8 == 0) goto L80
            X.4S6 r0 = r9.A02
            if (r0 == 0) goto Lb5
            X.3Y7 r0 = r0.A08
            if (r0 == 0) goto Lb5
            X.3Zb r7 = r0.BRY()
            if (r7 == 0) goto Lb6
            int r0 = r7.A0Q
            int r0 = r0 + 1
            r7.A0Q = r0
            r0 = 43
            X.C75113Zb.A00(r7, r0)
            X.3Zn r1 = r7.A0l
            X.3Zn r0 = X.EnumC75203Zn.A03
            if (r1 == r0) goto Lb6
            X.33N r0 = r10.A0L
            boolean r0 = r0.A03
            if (r0 != 0) goto Lb6
            com.instagram.common.session.UserSession r2 = r10.A0F
            boolean r0 = X.AbstractC41071vF.A0T(r2, r8)
            r1 = 1
            if (r0 == 0) goto L88
            int r0 = r7.A0Q
            if (r0 < r1) goto Lb6
        L3c:
            java.lang.String r2 = "preview_end"
            X.AbstractC40651I0j.A00(r7)
            X.2kL r1 = r10.A0I
            X.2pS r0 = r10.A0G
            java.lang.String r0 = r0.getModuleName()
            X.3u2 r1 = r1.A03(r8, r0)
            X.3u2 r0 = X.EnumC86893u2.A04
            if (r1 == r0) goto L54
            r9.A0U(r2)
        L54:
            boolean r0 = r8.A5P()
            if (r0 == 0) goto L5d
            X.C33U.A05(r8, r7, r10)
        L5d:
            r0 = 0
            r7.A0Y = r0
            X.2xQ r0 = r10.A0H
            r0.CtR(r8)
        L65:
            X.33Y r1 = r10.A0K
            boolean r0 = r1.A04(r8)
            if (r0 == 0) goto L80
            X.0do r0 = r1.A08
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            X.3FQ r0 = r10.A04
            r1.A02(r8, r7, r0)
        L80:
            X.IMv r0 = r11.A05
            if (r0 == 0) goto L87
            r0.A01()
        L87:
            return
        L88:
            boolean r0 = r8.A5P()
            if (r0 == 0) goto Lb6
            boolean r0 = r7.A2p
            if (r0 != 0) goto Lb6
            X.3bN r1 = X.C76173bM.A04
            X.2pS r0 = r10.A0G
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r1.A02(r2, r8, r0)
            if (r0 == 0) goto Lb6
            boolean r0 = r7.A2e
            if (r0 != 0) goto Lb6
            int r6 = r7.A0Q
            long r4 = r8.A1C()
            r2 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 2
            if (r1 <= 0) goto Lb2
            r0 = 1
        Lb2:
            if (r6 < r0) goto Lb6
            goto L3c
        Lb5:
            r7 = 0
        Lb6:
            X.U7l r0 = r10.A02
            if (r0 == 0) goto Lbd
            r0.A06(r8, r7)
        Lbd:
            if (r7 == 0) goto L80
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.DzB():void");
    }

    @Override // X.C30B
    public final void DzZ(C38321qM c38321qM, boolean z) {
        AbstractC61692rW abstractC61692rW = this.A0S;
        if (abstractC61692rW != null) {
            abstractC61692rW.A07(c38321qM, z);
        }
    }

    @Override // X.C33S
    public final void Eoq() {
        A0C("user_played_carousel_with_music");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC65512xn.A00(r3).A00, 36329238572056795L) != false) goto L19;
     */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            r7 = this;
            X.IMv r0 = r7.A05
            if (r0 == 0) goto Lb
            X.33v r0 = r0.A00
            if (r0 == 0) goto Lb
            r0.pause()
        Lb:
            X.30E r4 = r7.A0G
            X.1qM r6 = r4.A0G()
            if (r6 == 0) goto L53
            X.3bN r5 = X.C76173bM.A04
            com.instagram.common.session.UserSession r3 = r7.A0A
            X.2xQ r2 = r7.A0D
            X.3Zb r1 = r2.BRZ(r6)
            X.2pS r0 = r7.A0C
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = r5.A01(r3, r6, r1, r0)
            if (r0 == 0) goto L53
            X.3Zb r5 = r2.BRZ(r6)
            X.3Zn r1 = r5.A0l
            X.3Zn r0 = X.EnumC75203Zn.A06
            if (r1 == r0) goto L37
            X.3Zn r0 = X.EnumC75203Zn.A03
            if (r1 != r0) goto L53
        L37:
            boolean r0 = r5.A25
            if (r0 == 0) goto L4e
            X.2kL r0 = X.AbstractC65512xn.A00(r3)
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329238572056795(0x811140000c40db, double:3.038094986846152E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L53
        L4e:
            X.3Zn r0 = X.EnumC75203Zn.A05
            r5.A0K(r0)
        L53:
            X.33U r2 = r7.A0F
            android.os.Handler r1 = r2.A0D
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            java.lang.String r0 = "fragment_paused"
            r4.A0U(r0)
            r0 = 0
            r7.A08 = r0
            r2.A0A = r0
            r7.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.onPause():void");
    }

    public final void A0B(C38321qM c38321qM, InterfaceC97134Xy interfaceC97134Xy) {
        if (c38321qM.A59()) {
            Map map = this.A0U;
            java.util.Set set = (java.util.Set) map.get(c38321qM);
            if (set == null) {
                set = new HashSet();
                map.put(c38321qM, set);
            }
            set.add(interfaceC97134Xy);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r8 < r14) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r5.A0Q++;
        X.C75113Zb.A00(r5, 43);
        r7.A02(r12, r5, r4.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014f, code lost:
    
        if (r0 > r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r1 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        if (r0.booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0139, code lost:
    
        if (r5 != null) goto L22;
     */
    @Override // X.C33Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dze(X.C38321qM r12, X.C3Y7 r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.Dze(X.1qM, X.3Y7, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
    
        if (r14 != 0) goto L75;
     */
    @Override // X.C1I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(X.C3FQ r21, int r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.onScroll(X.3FQ, int, int, int, int, int):void");
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(-1315447831);
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        C33U c33u = this.A0F;
        c33u.A09 = z;
        C3A4 c3a4 = this.A02;
        if (c3a4 != null) {
            c3a4.A03 = z;
        }
        C41711wL.A01(this.A0A).A0D(this.A0P, z);
        if (i == 0) {
            C33T c33t = this.A0H;
            c33t.A01 = 0;
            c33t.A00 = 0;
            c33t.A02 = 0;
            c33t.A03 = 0L;
            c33t.A04 = 0L;
            c33u.A0D.sendEmptyMessageDelayed(0, 200L);
        } else if (!this.A0V) {
            c33u.A0D.removeMessages(0);
        }
        if (z) {
            C30E c30e = this.A0G;
            Toast toast = c30e.A00;
            if (toast != null) {
                toast.cancel();
            }
            c30e.A00 = null;
        }
        C0f9.A0A(-1084034890, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        if (r0.isLowRamDevice() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C33P(android.content.Context r23, androidx.fragment.app.Fragment r24, com.instagram.common.session.UserSession r25, X.C57112jm r26, X.InterfaceC60442pS r27, X.AbstractC61692rW r28, X.InterfaceC65282xQ r29, X.InterfaceC61782rf r30, X.C33N r31, java.lang.Integer r32, java.lang.String r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33P.<init>(android.content.Context, androidx.fragment.app.Fragment, com.instagram.common.session.UserSession, X.2jm, X.2pS, X.2rW, X.2xQ, X.2rf, X.33N, java.lang.Integer, java.lang.String, boolean):void");
    }
}
