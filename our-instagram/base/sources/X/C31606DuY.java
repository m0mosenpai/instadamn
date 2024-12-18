package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.DuY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31606DuY implements InterfaceC50462MPq {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C43945Jbu A02;
    public final C2DS A03;
    public final C31594DuM A04;
    public final C18920wW A07;
    public final C31601DuT A08;
    public final InterfaceC59832oQ A09;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C37013GSs(this, 31));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C37013GSs(this, 30));
    public final String A0A = AbstractC167017dG.A0j();

    public static final void A00(C31446Drq c31446Drq, C31606DuY c31606DuY, DirectThreadKey directThreadKey, Integer num, Integer num2, String str) {
        List emptyList;
        if (!c31606DuY.A00.isResumed()) {
            C0w9.A03("DirectInboxNavigationController", AbstractC43591JPw.A00(838));
            return;
        }
        C81663kb B3U = c31606DuY.A03.B3U(directThreadKey);
        if (B3U != null) {
            emptyList = B3U.BSH();
        } else {
            Integer A0Y = AbstractC31179DnN.A0Y(directThreadKey);
            boolean A1Z = AbstractC25229BEm.A1Z(directThreadKey.A00);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Could not find thread with threadKey thread. threadKeyIsNull:false, threadIdIsNull:");
            A1C.append(A1Z);
            C0w9.A04("DirectInboxController_missingThread_openThreadFragmentFromEntryPoint", AbstractC167017dG.A0n(A0Y, AbstractC43591JPw.A00(515), A1C), 1);
            emptyList = Collections.emptyList();
        }
        C14360o3.A0A(emptyList);
        c31606DuY.Crw(c31446Drq, directThreadKey, num, num2, str, C4GO.A01(emptyList));
        C75R.A07(c31606DuY.A07, c31606DuY.A01, B3U, emptyList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0072, code lost:
    
        if (r0 != false) goto L12;
     */
    @Override // X.InterfaceC50462MPq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Crw(X.C31446Drq r13, X.C3o9 r14, java.lang.Integer r15, java.lang.Integer r16, java.lang.String r17, java.util.List r18) {
        /*
            r12 = this;
            r7 = 0
            X.C14360o3.A0B(r14, r7)
            com.instagram.common.session.UserSession r6 = r12.A01
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36328942219444111(0x8110fb000e3f8f, double:3.037907572260574E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            if (r0 == 0) goto L1c
            X.2oe r0 = r12.A00
            android.content.Context r0 = r0.requireContext()
            X.AbstractC46760KmH.A00(r0, r6)
        L1c:
            X.DuT r0 = r12.A08
            X.JR2 r0 = r0.A00
            r0.A0z()
            X.2oe r9 = r12.A00
            android.content.Context r0 = r9.requireContext()
            X.JSB r8 = X.AbstractC43636JRu.A00(r0, r6)
            r0 = 43
            X.MHM r1 = new X.MHM
            r1.<init>(r6, r0)
            java.lang.Class<X.Jd3> r0 = X.C44016Jd3.class
            java.lang.Object r4 = r6.A01(r0, r1)
            X.Jd3 r4 = (X.C44016Jd3) r4
            boolean r0 = r14 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto Le5
            java.lang.String r3 = X.AbstractC31172DnG.A15(r14)
        L44:
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            r1 = r17
            X.1nl r2 = X.C36881nl.A01(r0, r9, r6, r1)
            r2.A00 = r9
            r2.A09(r14)
            r10 = r18
            java.util.ArrayList r0 = X.AbstractC166987dD.A1F(r10)
            r2.A0B(r0)
            r0 = 36311560486191708(0x81012c0005025c, double:3.0269152941611327E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            r11 = 0
            if (r0 != 0) goto L74
            r0 = 36311560487174763(0x81012c0014026b, double:3.0269152947828206E-306)
            boolean r0 = X.C18U.A06(r5, r6, r0)
            r5 = 0
            if (r0 == 0) goto L75
        L74:
            r5 = 1
        L75:
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            X.2oQ r0 = r12.A09
            r2.A0z = r5
            r2.A00 = r9
            r2.A02 = r1
            r2.A0A = r0
            r2.A0H = r15
            X.Jbu r0 = r12.A02
            java.lang.String r0 = r0.A01
            r2.A0b = r0
            int r0 = r13.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            r1 = 1
            r2.A0s = r1
            java.lang.String r5 = r13.A02
            boolean r0 = r8.A04(r5)
            if (r0 != 0) goto Lae
            if (r3 == 0) goto Laf
            int r0 = r3.length()
            if (r0 == 0) goto Laf
            java.util.Set r0 = r4.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Laf
        Lae:
            r11 = 1
        Laf:
            r2.A0v = r11
            int r0 = r10.size()
            if (r0 != r1) goto Le3
            java.lang.Object r0 = r10.get(r7)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r0
            java.lang.String r1 = r0.getId()
            X.FtI r0 = new X.FtI
            r0.<init>(r1)
        Lc6:
            r2.A03 = r0
            r2.A05 = r9
            X.Lhs r0 = new X.Lhs
            r0.<init>(r13, r12, r8)
            r2.A06 = r0
            r2.A0X = r5
            java.lang.String r0 = r12.A0A
            r2.A0e = r0
            java.lang.String r0 = r13.A01
            r2.A0P = r0
            r0 = r16
            r2.A0F = r0
            r2.A06()
            return
        Le3:
            r0 = 0
            goto Lc6
        Le5:
            r3 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31606DuY.Crw(X.Drq, X.3o9, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List):void");
    }

    @Override // X.InterfaceC50462MPq
    public final void Cs0(C31446Drq c31446Drq, C3o9 c3o9, Integer num, String str, int i) {
        boolean A00;
        C14360o3.A0B(c3o9, 0);
        DirectThreadKey A01 = JRE.A01(c3o9);
        Integer valueOf = Integer.valueOf(i);
        DirectThreadKey A012 = JRE.A01(c3o9);
        UserSession userSession = this.A01;
        FGZ fgz = new FGZ(userSession);
        C81663kb B3U = this.A03.B3U(A012);
        if (B3U != null && B3U.BI1() != 6 && B3U.BI1() != 8) {
            int C7g = B3U.C7g();
            C51593Mql C58 = B3U.C58();
            if (C4GR.A04(C7g) && C58 != null && C58.A01 == 1) {
                AbstractC59962oe abstractC59962oe = this.A00;
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                String C7I = B3U.C7I();
                C51593Mql C582 = B3U.C58();
                if (C582 != null && C582.A01 == 1) {
                    AbstractC192798gL A05 = C192108fB.A05(fgz.A00, "com.instagram.mwb.channels.takedown.show_bottomsheet.action", AbstractC167017dG.A0r(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7I));
                    C32393EOu.A00(A05, requireActivity, abstractC59962oe, fgz, 5);
                    C1GJ.A06(A05, -5, 3, true, true);
                    return;
                }
            } else {
                int C7g2 = B3U.C7g();
                C51593Mql C583 = B3U.C58();
                if (C4GR.A04(C7g2) && C583 != null && C583.A01 == 3) {
                    if (C18U.A06(C06090Tz.A05, fgz.A00, 36328559966436999L)) {
                        FragmentActivity requireActivity2 = this.A00.requireActivity();
                        WTZ wtz = new WTZ(new UP2(null, requireActivity2.getString(2131963927)), false, null, 50, 1.0f, false, false, false, true);
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        if (AbstractC31171DnF.A0j(0).nextClearBit(0) >= 0) {
                            C16920sk c16920sk = C16920sk.A00;
                            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                            C63719SsZ c63719SsZ = new C63719SsZ("com.bloks.www.bloks.mwb.igd.channels.geoblocking.transperancy.bottom_sheet", null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, 0L, true);
                            AnonymousClass637 A002 = VRA.A00(userSession, false);
                            C14360o3.A0B(A002, 1);
                            c63719SsZ.E2V(requireActivity2, wtz, A002);
                            return;
                        }
                        throw AbstractC31172DnG.A0v();
                    }
                }
                if (B3U.CVQ()) {
                    C31286Dp8 c31286Dp8 = (C31286Dp8) this.A06.getValue();
                    Context requireContext = this.A00.requireContext();
                    List BSH = B3U.BSH();
                    A00 = c31286Dp8.A00(requireContext, new G7A(c31446Drq, this, A012, valueOf, num), c3o9, B3U.Asv(), BSH, B3U.BI1(), B3U.C7g(), 0, B3U.CX1(), c3o9 instanceof MsysThreadId);
                } else if (((C31280Dp2) this.A05.getValue()).A01(new G1S(c31446Drq, this, A012, valueOf, num), B3U)) {
                    return;
                } else {
                    A00 = this.A04.A00(this.A00, new G77(2, num, A012, valueOf, this, c31446Drq), A012, "inbox");
                }
                if (A00) {
                    return;
                }
            }
        }
        A00(c31446Drq, this, A01, valueOf, num, str);
    }

    public C31606DuY(AbstractC59962oe abstractC59962oe, C18920wW c18920wW, UserSession userSession, C31601DuT c31601DuT, C43945Jbu c43945Jbu, C2DS c2ds, C31594DuM c31594DuM, InterfaceC59832oQ interfaceC59832oQ) {
        this.A01 = userSession;
        this.A03 = c2ds;
        this.A00 = abstractC59962oe;
        this.A02 = c43945Jbu;
        this.A07 = c18920wW;
        this.A04 = c31594DuM;
        this.A09 = interfaceC59832oQ;
        this.A08 = c31601DuT;
    }
}
