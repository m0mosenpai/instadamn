package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.comments.repository.StoryCommentsRepository;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6mF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148456mF extends AbstractC52922bZ {
    public C38321qM A00;
    public C41181vS A01;
    public Map A02;
    public boolean A03;
    public final UserSession A04;
    public final C23031Ai A05;
    public final C148426mC A06;
    public final C149766oT A07;
    public final StoryCommentsRepository A08;
    public final C17060sy A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC06180Ui A0C;
    public final C05A A0D;

    public C148456mF(UserSession userSession, C23031Ai c23031Ai, C148426mC c148426mC, C149766oT c149766oT, StoryCommentsRepository storyCommentsRepository, C17060sy c17060sy) {
        C14360o3.A0B(c17060sy, 2);
        C14360o3.A0B(c23031Ai, 5);
        C14360o3.A0B(c148426mC, 6);
        this.A04 = userSession;
        this.A09 = c17060sy;
        this.A08 = storyCommentsRepository;
        this.A07 = c149766oT;
        this.A05 = c23031Ai;
        this.A06 = c148426mC;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C9F7(16, null, this));
        this.A02 = new HashMap();
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C9E9(this, 20));
        this.A0D = C10E.A00(AbstractC144996gK.A01(userSession, null, c148426mC, c149766oT, c17060sy.A00(), C16930sl.A00, null));
        this.A0C = C10M.A00(C05F.A00, 0, 0);
    }

    public static final void A02(C148456mF c148456mF) {
        String id;
        if (C18U.A06(C06090Tz.A05, c148456mF.A07.A00, 36318221981653042L)) {
            C38321qM c38321qM = c148456mF.A00;
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                AbstractC23641Du.A05(AnonymousClass191.A00, new PZQ(c38321qM, c148456mF, id, null, 14), (C19L) c148456mF.A0B.getValue());
                return;
            }
            return;
        }
        A03(c148456mF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        if (r1.A6i(r26.A04) != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(java.util.List r27) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148456mF.A09(java.util.List):void");
    }

    public static final void A00(C9CN c9cn, C38321qM c38321qM, C148456mF c148456mF, String str, String str2) {
        C141806ax c141806ax = (C141806ax) c148456mF.A0A.getValue();
        C14360o3.A0B(c9cn, 0);
        List singletonList = Collections.singletonList(c9cn);
        C14360o3.A07(singletonList);
        c141806ax.A02(AbstractC001800i.A0S(c141806ax.A01, singletonList));
        A04(c148456mF, true);
        C05A c05a = c148456mF.A0D;
        c05a.Egh(C145006gL.A00(c9cn, null, null, null, (C145006gL) c05a.getValue(), null, null, null, 0, 0, 0, 536870773, false, true, false, false, false, false, false, false, false, false, false, false));
        C19L c19l = (C19L) c148456mF.A0B.getValue();
        C206739De c206739De = new C206739De(c148456mF, c38321qM, str, str2, null, 1);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206739De, c19l);
    }

    public static final void A01(InterfaceC57846PlC interfaceC57846PlC, C148456mF c148456mF) {
        C19L c19l = (C19L) c148456mF.A0B.getValue();
        C9D4 c9d4 = new C9D4(interfaceC57846PlC, c148456mF, (InterfaceC23621Ds) null, 26);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
    }

    public static final void A03(C148456mF c148456mF) {
        C05A c05a;
        C145006gL A00;
        if (!c148456mF.A05.A01.getBoolean("has_seen_story_comments_dialog_nux", false)) {
            if (C18U.A06(C06090Tz.A05, c148456mF.A07.A00, 2342161231194691624L)) {
                c05a = c148456mF.A0D;
                A00 = C145006gL.A00(null, null, null, null, (C145006gL) c05a.getValue(), null, null, null, 0, 0, 0, 536870895, false, false, true, false, false, false, false, false, false, false, false, false);
                c05a.Egh(A00);
                ((C141806ax) c148456mF.A0A.getValue()).A00();
            }
        }
        if (!C18U.A06(C06090Tz.A05, c148456mF.A07.A00, 36318221981784116L)) {
            c05a = c148456mF.A0D;
            if (!(!((C145006gL) c05a.getValue()).A0B.isEmpty()) && ((C145006gL) c05a.getValue()).A04 == null) {
                A00 = C145006gL.A00(null, null, null, null, (C145006gL) c05a.getValue(), null, null, null, 0, 0, 0, 536870879, false, false, false, true, false, false, false, false, false, false, false, false);
                c05a.Egh(A00);
                ((C141806ax) c148456mF.A0A.getValue()).A00();
            }
        }
        c05a = c148456mF.A0D;
        A00 = C145006gL.A00(null, null, null, null, (C145006gL) c05a.getValue(), null, null, null, 0, 0, 0, 536870831, false, false, false, false, true, false, false, false, false, false, false, false);
        c05a.Egh(A00);
        ((C141806ax) c148456mF.A0A.getValue()).A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r0.A4t() != true) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C148456mF r25, boolean r26) {
        /*
            r4 = r25
            X.05A r2 = r4.A0D
            java.lang.Object r7 = r2.getValue()
            X.6gL r7 = (X.C145006gL) r7
            if (r26 == 0) goto L64
            java.lang.String r8 = ""
        Le:
            X.6oT r0 = r4.A07
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 2342161231196264512(0x2081073b00251840, double:4.0640782722822026E-152)
            boolean r23 = X.C18U.A06(r3, r5, r0)
            X.1qM r0 = r4.A00
            if (r0 == 0) goto L62
            X.3bi r3 = r0.A1x()
        L25:
            X.3bi r0 = X.EnumC76383bi.A0A
            r1 = 1
            r24 = 0
            if (r3 != r0) goto L2e
            r24 = 1
        L2e:
            X.1qM r0 = r4.A00
            if (r0 == 0) goto L3a
            boolean r0 = r0.A4t()
            r25 = 1
            if (r0 == r1) goto L3c
        L3a:
            r25 = 0
        L3c:
            X.6mC r6 = r4.A06
            r11 = 0
            r3 = 0
            r14 = 352523663(0x1503158f, float:2.6472246E-26)
            r4 = r3
            r5 = r3
            r9 = r3
            r10 = r3
            r12 = r11
            r13 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r1
            r26 = r11
            X.6gL r0 = X.C145006gL.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.Egh(r0)
            return
        L62:
            r3 = 0
            goto L25
        L64:
            java.lang.Object r0 = r2.getValue()
            X.6gL r0 = (X.C145006gL) r0
            java.lang.CharSequence r8 = r0.A08
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148456mF.A04(X.6mF, boolean):void");
    }

    public final void A05() {
        String id;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        C38321qM c38321qM = this.A00;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            if (c38321qM.A1x() == EnumC76383bi.A0A) {
                userSession = this.A04;
                c06090Tz = C06090Tz.A05;
                j = 36320279271317763L;
            } else {
                userSession = this.A07.A00;
                c06090Tz = C06090Tz.A05;
                j = 36318221981849653L;
            }
            boolean A06 = C18U.A06(c06090Tz, userSession, j);
            A01(C56525P7x.A00, this);
            A01(new C56521P7t(id, A06), this);
            ((C141806ax) this.A0A.getValue()).A00();
        }
    }

    public final void A06() {
        ReelViewerFragment reelViewerFragment;
        C41551w4 c41551w4;
        C41181vS AuU;
        C148426mC c148426mC = this.A06;
        InterfaceC1118853a interfaceC1118853a = c148426mC.A01;
        if (interfaceC1118853a != null && (c41551w4 = (reelViewerFragment = (ReelViewerFragment) interfaceC1118853a).A0a) != null && (AuU = interfaceC1118853a.AuU()) != null) {
            C141596ac C00 = ((C146226iL) reelViewerFragment.A1C).A0C.C00(AuU);
            C145826hf c145826hf = c148426mC.A00;
            if (c145826hf != null) {
                c145826hf.A0Q(c41551w4, "tap", "story_comment_button", C00.A0B, C00.A0A);
            }
        }
        A02(this);
    }

    public final void A07() {
        List A04 = AbstractC144996gK.A04(this.A00);
        if (A04 == null) {
            A04 = C16930sl.A00;
        }
        C05A c05a = this.A0D;
        c05a.Egh(C145006gL.A00(null, null, null, null, (C145006gL) c05a.getValue(), null, null, null, 0, 0, 0, 536870839, false, !A04.isEmpty(), false, false, false, false, false, false, false, false, false, false));
        A01(C56526P7y.A00, this);
        if (!A04.equals(((C145006gL) c05a.getValue()).A0B)) {
            A09(A04);
        } else {
            ((C141806ax) this.A0A.getValue()).A01();
        }
    }

    public final void A08() {
        C05A c05a = this.A0D;
        A01(new C56520P7s(((C145006gL) c05a.getValue()).A07, ((C145006gL) c05a.getValue()).A0A), this);
    }
}
