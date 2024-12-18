package X;

import android.content.Context;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JXc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43763JXc implements MRS {
    public L3S A00;
    public boolean A01;
    public final /* synthetic */ JR2 A02;

    @Override // X.MRS
    public final C55982hj BzO(DirectThreadKey directThreadKey, boolean z) {
        C14360o3.A0B(directThreadKey, 0);
        JR2 jr2 = this.A02;
        if (!jr2.A1L.isResumed()) {
            return null;
        }
        UserSession A0p = jr2.A0p();
        if (C18U.A06(AbstractC25225BEi.A0j(A0p, 1), A0p, 36325506245014660L)) {
            return null;
        }
        String str = directThreadKey.A00;
        Pair pair = jr2.A08;
        if (pair == null || !C14360o3.A0K(pair.first, str)) {
            InterfaceC09390do interfaceC09390do = jr2.A2f;
            ((C55982hj) AbstractC166987dD.A17(interfaceC09390do)).A08(0.0d, true);
            jr2.A08 = new Pair(str, AbstractC166987dD.A17(interfaceC09390do));
        }
        Pair pair2 = jr2.A08;
        C14360o3.A0A(pair2);
        return (C55982hj) pair2.second;
    }

    @Override // X.MRS
    public final void DLp(DirectThreadKey directThreadKey, String str) {
        C14360o3.A0B(directThreadKey, 0);
        if (directThreadKey.A00 != null && str != null) {
            JR2 jr2 = this.A02;
            if (((InterfaceC50516MRt) jr2.A2x.getValue()).Cp7(directThreadKey.A00, str)) {
                JR2.A0W(jr2, directThreadKey);
            }
        }
    }

    @Override // X.MRS
    public final void DLq(View view, C31446Drq c31446Drq, C3o9 c3o9, List list) {
        DirectThreadKey A02;
        double d;
        C14360o3.A0B(view, 2);
        C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.RowDelegate.onInboxThreadRowBind");
        JR2 jr2 = this.A02;
        try {
            if (AbstractC167007dF.A1Z(jr2.A2D) && (A02 = JRE.A02(c3o9)) != null) {
                String str = A02.A00;
                if (jr2.A0w().Bkz().contains(A02) && str != null) {
                    HashSet hashSet = jr2.A1b;
                    if (!AbstractC001800i.A0u(hashSet, A02.A00)) {
                        hashSet.add(str);
                        ArrayList CD3 = jr2.A0w().CD3(A02);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        Iterator it = CD3.iterator();
                        while (it.hasNext()) {
                            String A0h = ((C83403nh) it.next()).A0h();
                            if (A0h != null) {
                                A1E.add(A0h);
                            }
                        }
                        for (Object obj : A1E) {
                            HashMap hashMap = jr2.A1X;
                            Double d2 = (Double) hashMap.get(obj);
                            if (d2 != null) {
                                d = d2.doubleValue();
                                if (d >= 3.0d) {
                                    hashMap.put(obj, Double.valueOf(d));
                                }
                            } else {
                                d = 0.0d;
                            }
                            d += 1.0d;
                            hashMap.put(obj, Double.valueOf(d));
                        }
                        if (!CD3.isEmpty()) {
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(jr2.A0p()), "ig_inbox_reels_play_pile_impression");
                            if (A0f.isSampled()) {
                                AbstractC31171DnF.A1F(A0f, str);
                                A0f.Cht();
                            }
                        }
                    }
                }
            }
            JR2.A0E(view, jr2);
            A00.close();
        } finally {
        }
    }

    @Override // X.MRS
    public final void DT6(C31446Drq c31446Drq, C3o9 c3o9, List list, int i) {
        c31446Drq.A01 = AbstractC31239DoM.A00(Integer.valueOf(this.A02.A0u().A00));
        A01(c31446Drq, c3o9, "inbox", list, i);
    }

    @Override // X.MRS
    public final boolean DT9(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, C3o9 c3o9, String str, List list, boolean z, boolean z2) {
        C81663kb c81663kb;
        C14360o3.A0B(c3o9, 0);
        AbstractC25233BEq.A0v(1, directShareTarget, str, list);
        JR2 jr2 = this.A02;
        if (!jr2.A1C) {
            DirectThreadKey A02 = JRE.A02(c3o9);
            Integer num = null;
            if (A02 != null) {
                boolean isLockedChatEnabled = LockedChatKillSwitch.isLockedChatEnabled(jr2.A0p(), true);
                c81663kb = C2DU.A03(AbstractC43592JPx.A0g(jr2), A02);
                if (c81663kb == null) {
                    List list2 = A02.A02;
                    if (list2 != null) {
                        num = AbstractC43592JPx.A0s(list2);
                    }
                    boolean A1Z = AbstractC25229BEm.A1Z(A02.A00);
                    C0w9 c0w9 = C0w9.A01;
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Could not find thread with threadKey thread. threadIdIsNull:");
                    A1C.append(A1Z);
                    A1C.append(", numRecipients:");
                    A1C.append(num);
                    A1C.append(", isLockedChatEnabled");
                    A1C.append(isLockedChatEnabled);
                    c0w9.EmO("DirectInboxController_missingThread_onMessageLongClick", A1C.toString(), 1);
                }
            } else {
                c81663kb = null;
            }
            C31659DvP.A00(rectF, view, c31446Drq, (C31659DvP) jr2.A28.getValue(), new C48738Lh6(jr2), jr2.A0u(), c81663kb, directShareTarget, c3o9, str, null, list, z, z2);
            return true;
        }
        return true;
    }

    @Override // X.MRS
    public final void Dde(DirectThreadKey directThreadKey, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        C14360o3.A0B(reel, 1);
        ((C31226Do9) this.A02.A2d.getValue()).A02(reel, C3G2.A0c, gradientSpinnerAvatarView);
    }

    @Override // X.MRS
    public final void DhZ(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        AbstractC54148Nwk.A00(this.A02.A0p()).A03(C05F.A0C);
        A02(c3o9, C7T3.A0D, true);
    }

    @Override // X.MRS
    public final void Dha(C31446Drq c31446Drq, C3o9 c3o9, List list, int i) {
        C14360o3.A0B(c3o9, 0);
        A01(c31446Drq, c3o9, "inbox_thread_avatar", list, i);
    }

    @Override // X.MRS
    public final void Dhc(C3o9 c3o9, boolean z) {
        C14360o3.A0B(c3o9, 0);
        A02(c3o9, C7T3.A0A, z);
    }

    @Override // X.MRS
    public final void Dhs(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        AbstractC54148Nwk.A00(this.A02.A0p()).A03(C05F.A0C);
        A02(c3o9, C7T3.A0D, false);
    }

    @Override // X.MRS
    public final void E1I(RectF rectF, InterfaceC50477MQf interfaceC50477MQf, DirectThreadKey directThreadKey) {
        AbstractC167007dF.A1D(directThreadKey, 0, interfaceC50477MQf);
        JR2 jr2 = this.A02;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        if (!abstractC59962oe.isResumed()) {
            C0w9.A01.EmN("DirectInboxPresenter", "click listener called when fragment is not resumed");
            return;
        }
        jr2.A0z();
        C81663kb A03 = C2DU.A03(AbstractC43592JPx.A0g(jr2), directThreadKey);
        if (AbstractC31206Dnp.A01(jr2.A0p())) {
            C49693LxO c49693LxO = new C49693LxO(0, rectF, interfaceC50477MQf, jr2, A03);
            AbstractC31206Dnp.A00(abstractC59962oe.requireContext(), jr2.A0p(), c49693LxO);
            return;
        }
        UserSession A0p = jr2.A0p();
        Integer num = C05F.A0N;
        if (!AbstractC43607JQo.A00(A0p, num)) {
            JR2.A0C(rectF, interfaceC50477MQf, jr2, A03);
            return;
        }
        C23031Ai A00 = AbstractC23021Ah.A00(jr2.A0p());
        int i = A00.A01.getInt("zero_rating_direct_video_nux_count", 0);
        C1R0 C98 = C26661Qv.A00(jr2.A0p()).C98();
        ViewOnClickListenerC35676FpB viewOnClickListenerC35676FpB = new ViewOnClickListenerC35676FpB(i, 0, A03, jr2, interfaceC50477MQf, A00, rectF);
        Context requireContext = abstractC59962oe.requireContext();
        jr2.A0p();
        AbstractC34362FDe.A00(requireContext, viewOnClickListenerC35676FpB, C98, abstractC59962oe, null, false, num);
    }

    public C43763JXc(JR2 jr2) {
        this.A02 = jr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (X.C6CB.A02(X.C6CE.A00(r3.A0p()).A00, 36326549921740756L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C31446Drq r11, X.C3o9 r12, java.lang.String r13, int r14) {
        /*
            r10 = this;
            X.JR2 r3 = r10.A02
            X.MRw r0 = X.AbstractC43593JPy.A0V(r3)
            X.MPq r5 = r0.BWH()
            X.0do r0 = r3.A2F
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L29
            com.instagram.common.session.UserSession r0 = r3.A0p()
            X.6CF r0 = X.C6CE.A00(r0)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 36326549921740756(0x810ece000037d4, double:3.036394673559963E-306)
            boolean r0 = X.C6CB.A02(r2, r0)
            r9 = 13376(0x3440, float:1.8744E-41)
            if (r0 == 0) goto L2b
        L29:
            r9 = 13369(0x3439, float:1.8734E-41)
        L2b:
            r6 = r12
            boolean r0 = r12 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r4 = r11
            r7 = r13
            r8 = r14
            if (r0 == 0) goto L4e
            X.1wQ r2 = r3.A1M
            X.6Ly r1 = X.AbstractC43594JPz.A0e(r3)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.JRE.A03(r12)
            X.1xC r0 = r1.A02(r0)
            X.1xC r0 = X.AbstractC43592JPx.A0R(r0)
            X.Lxr r3 = new X.Lxr
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A02(r0, r3)
            return
        L4e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r0 = r5
            r1 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r0.Cs0(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43763JXc.A00(X.Drq, X.3o9, java.lang.String, int):void");
    }

    private final void A01(C31446Drq c31446Drq, C3o9 c3o9, String str, List list, int i) {
        C3o9 c3o92;
        JR2 jr2 = this.A02;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        if (C43687JTw.A03(abstractC59962oe.requireContext(), jr2.A0p())) {
            L3S l3s = this.A00;
            if (l3s != null) {
                c3o92 = l3s.A02;
            } else {
                c3o92 = null;
            }
            if (!c3o9.equals(c3o92)) {
                this.A00 = new L3S(c31446Drq, c3o9, str, list, i);
                this.A01 = false;
                if (C43687JTw.A03(abstractC59962oe.requireContext(), jr2.A0p())) {
                    InterfaceC50519MRw.A01(jr2.A1j).EdW(c3o9);
                    return;
                }
                return;
            }
        }
        A00(c31446Drq, c3o9, str, i);
    }

    private final void A02(C3o9 c3o9, C7T3 c7t3, boolean z) {
        boolean z2 = c3o9 instanceof DirectThreadKey;
        JR2 jr2 = this.A02;
        if (z2) {
            C81663kb B3U = jr2.A0w().B3U(JRE.A01(c3o9));
            UserSession A0p = jr2.A0p();
            C14360o3.A0B(A0p, 1);
            F3R.A00(jr2.A1L, jr2.A0p(), new P29(A0p, B3U), c7t3, !z);
            return;
        }
        jr2.A1M.A02(AbstractC43592JPx.A0R(AbstractC43594JPz.A0e(jr2).A02(JRE.A03(c3o9)).A0K(C48413LbS.A00)), new C49714Lxj(0, jr2, c7t3, z));
    }

    @Override // X.MRS
    public final void Cru() {
        L3S l3s = this.A00;
        if (l3s != null && !this.A01) {
            this.A01 = true;
            A00(l3s.A01, l3s.A02, l3s.A03, l3s.A00);
        }
    }

    @Override // X.MRS
    public final void Dhq(RectF rectF, DirectShareTarget directShareTarget, C3o9 c3o9) {
        String C7I;
        AbstractC167017dG.A1N(c3o9, directShareTarget);
        JR2 jr2 = this.A02;
        if (c3o9 instanceof DirectThreadKey) {
            C81663kb B3U = jr2.A0w().B3U(JRE.A01(c3o9));
            if (B3U != null && (C7I = B3U.C7I()) != null && !JR2.A0d(rectF, jr2, B3U)) {
                JR2.A0D(rectF, jr2, null, B3U, directShareTarget, c3o9);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(jr2.A0p()), "ig_inbox_reels_play_pile_tap");
                if (A0f.isSampled()) {
                    AbstractC31171DnF.A1F(A0f, C7I);
                    A0f.Cht();
                    return;
                }
                return;
            }
            return;
        }
        if (!(c3o9 instanceof MsysThreadId)) {
            return;
        }
        jr2.A1M.A02(AbstractC43592JPx.A0R(AbstractC43594JPz.A0e(jr2).A02(JRE.A03(c3o9))), new C49717Lxm(3, directShareTarget, rectF, jr2, c3o9));
    }

    @Override // X.MRS
    public final void Eox(C9BW c9bw, String str) {
        this.A02.A1W.put(str, c9bw);
    }

    @Override // X.MRS
    public final void Eoy(C73743Sc c73743Sc, String str) {
        this.A02.A1Y.put(str, c73743Sc);
    }

    @Override // X.MRS
    public final boolean Dhd(RectF rectF, DirectShareTarget directShareTarget, C3o9 c3o9) {
        boolean A1a = AbstractC167017dG.A1a(c3o9, directShareTarget);
        JR2.A0A(rectF, C22P.A2K, this.A02, directShareTarget, c3o9);
        return A1a;
    }
}
