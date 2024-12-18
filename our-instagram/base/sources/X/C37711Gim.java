package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gim, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37711Gim implements JIH {
    public InterfaceC41501vz A00;
    public boolean A01;
    public boolean A02;
    public C120985dq A03;
    public final Activity A04;
    public final ClipsViewerConfig A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C23031Ai A08;
    public final InterfaceC31048Dkm A09;
    public final JPb A0A;
    public final InterfaceC16820sZ A0B;

    public C37711Gim(Activity activity, ClipsViewerConfig clipsViewerConfig, JPb jPb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C23031Ai c23031Ai, InterfaceC31048Dkm interfaceC31048Dkm, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c23031Ai, 4);
        this.A04 = activity;
        this.A07 = userSession;
        this.A0B = interfaceC16820sZ;
        this.A08 = c23031Ai;
        this.A06 = interfaceC11380iw;
        this.A05 = clipsViewerConfig;
        this.A0A = jPb;
        this.A09 = interfaceC31048Dkm;
        interfaceC31048Dkm.A99(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        if (X.C18U.A06(r7, r2, 36318209095571483L) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        r8 = r0.getId();
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        r1.A06("ig_media_id", r8);
        r1.A09(java.lang.Boolean.valueOf(r18));
        r1.A05("impression_count", 1L);
        X.AbstractC201108us.A00(r9, r6, r10, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ef, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JIH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DzP(X.C120985dq r20, java.lang.Integer r21, int r22) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37711Gim.DzP(X.5dq, java.lang.Integer, int):void");
    }

    public static final void A02(View view, EnumC58132lV enumC58132lV, C149686oL c149686oL, C37711Gim c37711Gim, Integer num) {
        if (num != null) {
            c149686oL = new C149686oL(AbstractC166997dE.A0q(view.getResources(), num.intValue()));
        } else if (c149686oL == null) {
            throw AbstractC166997dE.A0g();
        }
        C5SU c5su = new C5SU(c37711Gim.A04, c149686oL);
        c5su.A03(view);
        c5su.A05 = enumC58132lV;
        c5su.A00 = 5000;
        c5su.A0A = true;
        view.postDelayed(new J44(c5su.A00()), 500L);
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public static final View A00(View view) {
        View findViewWithTag = view.findViewWithTag(Integer.valueOf(R.id.direct_share_button));
        if (findViewWithTag == null) {
            View findViewWithTag2 = view.findViewWithTag("clips_ufi_share_button_component");
            if (findViewWithTag2 == null) {
                return null;
            }
            return findViewWithTag2;
        }
        return findViewWithTag;
    }

    public static final View A01(View view) {
        View findViewWithTag = view.findViewWithTag(Integer.valueOf(R.id.more_button));
        if (findViewWithTag == null) {
            View findViewWithTag2 = view.findViewWithTag(AbstractC111324zv.A00(4111));
            if (findViewWithTag2 == null) {
                return null;
            }
            return findViewWithTag2;
        }
        return findViewWithTag;
    }

    public static void A03(View view, C37711Gim c37711Gim, int i) {
        A02(view, EnumC58132lV.A02, null, c37711Gim, Integer.valueOf(i));
    }

    public final void A04(View view, C120985dq c120985dq, InterfaceC60442pS interfaceC60442pS, String str) {
        C38321qM c38321qM;
        View A01;
        long j;
        Long A0j;
        boolean A1a = AbstractC167017dG.A1a(interfaceC60442pS, c120985dq);
        C14360o3.A0B(str, 3);
        if (view != null && !this.A02 && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A07;
            if (C76493bt.A0M(c120985dq, userSession) && AbstractC37724Giz.A03(userSession, c38321qM)) {
                C23031Ai c23031Ai = this.A08;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A2J;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 433) && !this.A01 && (A01 = A01(view)) != null) {
                    A03(A01, this, 2131966891);
                    c38321qM.A38();
                    int A06 = this.A0A.C09(c120985dq).A06();
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_viewer_link_impression");
                    if (A0f.isSampled()) {
                        AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                        String A2u = c38321qM.A2u();
                        if (A2u != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                            j = A0j.longValue();
                        } else {
                            j = 0;
                        }
                        AbstractC37303Gc4.A0c(A0f, A06, j);
                        AbstractC25233BEq.A17(A0f, "viewer_session_id", str);
                        AbstractC37300Gc1.A0e(BQL.A0E, A0f);
                        AbstractC25225BEi.A1M(EnumC120795dP.A0n, A0f);
                        A0f.Cht();
                    }
                    AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 433, A1a);
                    this.A02 = A1a;
                }
            }
        }
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }
}
