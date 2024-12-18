package X;

import X.AbstractC12120kG;
import X.AbstractC167017dG;
import X.C0f9;
import X.C3F5;
import X.C70593Ew;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class NI5 extends OXZ {
    public int A00;
    public int A01;
    public C54680ODg A02;
    public boolean A03;
    public int A04;
    public InterfaceC16820sZ A05;
    public final int A06;
    public final Context A07;
    public final Handler A08;
    public final C8SB A09;
    public final RecyclerView A0A;
    public final UserSession A0B;
    public final C55098Ob9 A0C;
    public final C51161Mj4 A0D;
    public final ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 A0E;
    public final C55590OmT A0F;
    public final EnumC53170NfR A0G;
    public final C8Ba A0H;
    public final ClipsCreationViewModel A0I;
    public final C187358Sd A0J;
    public final C50868Mdz A0K;
    public final Runnable A0L;
    public final InterfaceC58114Ppd A0M;
    public final C51096Mhw A0N;
    public final C1828989k A0O;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.3Fe, com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1] */
    public NI5(final Context context, RecyclerView recyclerView, UserSession userSession, C51161Mj4 c51161Mj4, C8Ba c8Ba, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C50868Mdz c50868Mdz, C1828989k c1828989k, int i) {
        AbstractC167007dF.A1I(userSession, 1, recyclerView);
        this.A0B = userSession;
        this.A07 = context;
        this.A0J = c187358Sd;
        this.A0I = clipsCreationViewModel;
        this.A0O = c1828989k;
        this.A0K = c50868Mdz;
        this.A0D = c51161Mj4;
        this.A0A = recyclerView;
        this.A0H = c8Ba;
        this.A06 = i;
        ?? r1 = new CustomScrollingLinearLayoutManager(context) { // from class: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1
            @Override // X.AbstractC70663Fe
            public final void A0q(View view, int i2, int i3) {
                boolean z = ((CustomScrollingLinearLayoutManager) this).A01;
                ((CustomScrollingLinearLayoutManager) this).A01 = true;
                super.A0q(view, 0, 0);
                ((CustomScrollingLinearLayoutManager) this).A01 = z;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i2) {
                String str;
                AbstractC167017dG.A1P(c70593Ew, c3f5);
                int i3 = 0;
                try {
                    i3 = super.A1K(c70593Ew, c3f5, this.A09(i2));
                    return i3;
                } catch (IllegalStateException e) {
                    e = e;
                    str = "scrollHorizontallyBy failed due to MID 2ff29f0d4f81f32502aab9ce8039e5a2";
                    AbstractC12120kG.A07("ClipsStackedTimelineVideoTrackController", str, e);
                    return i3;
                } catch (NullPointerException e2) {
                    e = e2;
                    str = "scrollHorizontallyBy failed";
                    AbstractC12120kG.A07("ClipsStackedTimelineVideoTrackController", str, e);
                    return i3;
                }
            }

            @Override // com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat, androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
                int A03 = C0f9.A03(-148820240);
                AbstractC167017dG.A1N(c70593Ew, c3f5);
                try {
                    super.A1R(c70593Ew, c3f5);
                } catch (IndexOutOfBoundsException e) {
                    AbstractC12120kG.A07("ClipsStackedTimelineVideoTrackController", "onLayoutChildren failed", e);
                }
                C0f9.A0A(-1098862906, A03);
            }
        };
        this.A0E = r1;
        this.A08 = new Handler(context.getMainLooper());
        this.A0L = new RunnableC56879PLy(this);
        this.A00 = -1;
        this.A0G = EnumC53170NfR.A06;
        this.A0C = new C55098Ob9(userSession, c50868Mdz, new C57521Pfv(this, 10), new C57521Pfv(this, 11), MSW.A1F(this, 14));
        r1.A13(false);
        recyclerView.setLayoutManager(r1);
        recyclerView.setAdapter(c51161Mj4);
        recyclerView.setItemAnimator(null);
        this.A02 = new C54680ODg(context);
        C55590OmT c55590OmT = new C55590OmT(recyclerView, new C56296OzH(this, 2), true, false);
        this.A0F = c55590OmT;
        recyclerView.A12(c55590OmT);
        A0K(context, c50868Mdz, new C57521Pfv(this, 9));
        c51161Mj4.A01 = new C56298OzJ(this);
        c51161Mj4.A03 = new C30192DRx(this, 32);
        C185368Kc c185368Kc = clipsCreationViewModel.A0L.A00;
        c51161Mj4.A04 = (c185368Kc != null ? c185368Kc.A03 : null) == EnumC189548aZ.A07;
        C56281Oys c56281Oys = new C56281Oys(this);
        this.A0M = c56281Oys;
        C51096Mhw c51096Mhw = new C51096Mhw(userSession, c56281Oys, clipsCreationViewModel, c187358Sd);
        this.A0N = c51096Mhw;
        this.A09 = new C8SB(c51096Mhw);
        A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r2 == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(java.util.List r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            X.0sZ r2 = r8.A05
            if (r2 == 0) goto L15
            android.os.Handler r1 = r8.A08
            X.PLz r0 = new X.PLz
            r0.<init>()
            r1.removeCallbacks(r0)
            r0 = 0
            r8.A05 = r0
        L15:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A0A
            boolean r0 = r0.A1D()
            if (r0 == 0) goto L31
            r0 = 18
            X.Pbe r2 = new X.Pbe
            r2.<init>(r0, r9, r8)
            android.os.Handler r1 = r8.A08
            X.PLz r0 = new X.PLz
            r0.<init>()
            r1.post(r0)
            r8.A05 = r2
        L30:
            return
        L31:
            android.content.Context r7 = r8.A07
            X.Mj4 r6 = r8.A0D
            java.util.List r5 = r6.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 r0 = r8.A0E
            int r4 = r0.A1a()
            r3 = 0
            r0 = -1
            if (r4 == r0) goto L58
            int r0 = r9.size()
            if (r4 >= r0) goto L58
            r2 = 0
            r1 = 0
        L49:
            if (r3 >= r4) goto L5a
            int r0 = A00(r7, r5, r3)
            int r2 = r2 + r0
            int r0 = A00(r7, r9, r3)
            int r1 = r1 + r0
            int r3 = r3 + 1
            goto L49
        L58:
            r2 = 0
            goto L5b
        L5a:
            int r2 = r2 - r1
        L5b:
            X.Mdz r5 = r8.A0K
            boolean r0 = r5.A07
            if (r0 != 0) goto L64
            r4 = 1
            if (r2 != 0) goto L65
        L64:
            r4 = 0
        L65:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1F(r9)
            java.util.List r1 = r6.A02
            r6.A02 = r3
            X.Mhl r0 = new X.Mhl
            r0.<init>(r1, r3)
            r1 = 1
            X.2za r0 = X.AbstractC66552zX.A00(r0)
            r0.A03(r6)
            if (r4 == 0) goto L30
            X.8Sd r0 = r8.A0J
            X.8Sf r0 = r0.A0E()
            boolean r0 = r0 instanceof X.C187528Su
            if (r0 == 0) goto L30
            r5.A08 = r1
            float r0 = (float) r2
            r8.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI5.A0P(java.util.List):void");
    }

    public static final void A01(NI5 ni5, int i, long j, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = ni5.A04;
            C54680ODg c54680ODg = ni5.A02;
            int i4 = c54680ODg.A00;
            int i5 = c54680ODg.A03;
            i3 = ((i4 - (i + i5)) / 2) - c54680ODg.A02;
            if (i3 < i5) {
                i3 = i5;
            }
        } else {
            C54680ODg c54680ODg2 = ni5.A02;
            int i6 = c54680ODg2.A00;
            int i7 = c54680ODg2.A03;
            i2 = ((i6 - (i + i7)) / 2) - c54680ODg2.A02;
            if (i2 < i7) {
                i2 = i7;
            }
            i3 = ni5.A04;
        }
        AbstractC13880nE.A0f(ni5.A0A, i2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z) {
            ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
        }
        ofFloat.addUpdateListener(new C55237Of9(ni5, i2, i3, 0));
        if (j > 0) {
            ofFloat.setDuration(j);
        }
        ofFloat.start();
    }

    public final void A0N(int i) {
        C54680ODg c54680ODg = this.A02;
        if (i < 2) {
            i = 2;
        }
        int i2 = c54680ODg.A05;
        int i3 = c54680ODg.A00;
        int i4 = c54680ODg.A03;
        int i5 = ((i3 - ((i2 + i4) * i)) / 2) - c54680ODg.A02;
        if (i5 < i4) {
            i5 = i4;
        }
        this.A04 = i5;
        AbstractC13880nE.A0f(this.A0A, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (X.MSW.A06(r0) == 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(int r7) {
        /*
            r6 = this;
            X.Mdz r1 = r6.A0K
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A0E
            X.84B r0 = X.MSY.A0N(r0)
            if (r0 == 0) goto Lbb
            int r0 = X.MSW.A06(r0)
            r2 = 1
            if (r0 != r2) goto Lbb
        L11:
            X.87H r0 = r1.A0K
            r0.A01()
            boolean r0 = r6.A0M()
            if (r0 != 0) goto L26
            X.8Sd r1 = r6.A0J
            X.NHi r0 = new X.NHi
            r0.<init>(r7)
            r1.A0G(r0)
        L26:
            com.instagram.common.session.UserSession r0 = r6.A0B
            X.24l r5 = X.MSW.A0S(r0)
            X.0wW r0 = r5.A02
            X.1Mh r4 = X.C25531Mh.A08(r0)
            boolean r0 = X.AbstractC25226BEj.A1Z(r4)
            if (r0 == 0) goto L83
            java.lang.String r0 = "IG_CAMERA_CLIPS_DELETE_SEGMENT_BUTTON_TAP"
            r4.A0s(r0)
            java.lang.String r0 = "CLIPS_DELETE_SEGMENT_BUTTON_TAP"
            r4.A0q(r0)
            X.C448124l.A00(r4, r5)
            X.22M r3 = r5.A04
            int r1 = r3.A01
            r0 = 2
            if (r1 == r0) goto L4d
            r0 = 1
        L4d:
            r4.A0V(r0)
            java.lang.Long r1 = X.AbstractC37302Gc3.A0T()
            java.lang.String r0 = "capture_format_index"
            r4.A0Q(r0, r1)
            X.MSY.A19(r4, r5)
            X.AbstractC167007dF.A14(r4, r3)
            X.AbstractC50524MSc.A0G(r4, r7)
            X.5Hg r0 = r5.A0J()
            r4.A0a(r0)
            java.lang.String r1 = r3.A0O
            java.lang.String r0 = "discovery_session_id"
            r4.A0R(r0, r1)
            java.lang.String r1 = r3.A0P
            java.lang.String r0 = "search_session_id"
            r4.A0R(r0, r1)
            java.lang.Boolean r1 = X.AbstractC166997dE.A0b()
            java.lang.String r0 = "is_timeline"
            r4.A0O(r0, r1)
            X.AbstractC167017dG.A1D(r4)
        L83:
            android.content.Context r0 = r6.A07
            X.8hC r3 = X.AbstractC31171DnF.A0I(r0)
            r0 = 2131955411(0x7f130ed3, float:1.9547349E38)
            if (r2 == 0) goto L91
            r0 = 2131955414(0x7f130ed6, float:1.9547355E38)
        L91:
            r3.A0A(r0)
            r0 = 2131955410(0x7f130ed2, float:1.9547347E38)
            if (r2 == 0) goto L9c
            r0 = 2131955413(0x7f130ed5, float:1.9547353E38)
        L9c:
            r3.A09(r0)
            r2 = 2131960921(0x7f132459, float:1.9558524E38)
            r1 = 0
            X.Ofq r0 = new X.Ofq
            r0.<init>(r6, r7, r1)
            r3.A0L(r0, r2)
            r2 = 2131964718(0x7f13332e, float:1.9566226E38)
            r1 = 1
            X.Ofq r0 = new X.Ofq
            r0.<init>(r6, r7, r1)
            r3.A0H(r0, r2)
            X.AbstractC166987dD.A1W(r3)
            return
        Lbb:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI5.A0O(int):void");
    }

    public final boolean A0Q() {
        AbstractC187378Sf A0E = this.A0J.A0E();
        if (!(A0E instanceof C187508Ss) && !(A0E instanceof C187558Sy) && !(A0E instanceof C187568Sz) && !(A0E instanceof C187548Sw) && !(A0E instanceof C187518St) && !(A0E instanceof C8TB) && !(A0E instanceof C187538Sv)) {
            return true;
        }
        return false;
    }

    public static int A00(Context context, List list, int i) {
        O29 o29 = (O29) list.get(i);
        if (o29 instanceof C52423NHt) {
            return ((C52423NHt) o29).A00;
        }
        if (o29 instanceof C52426NHw) {
            C52426NHw c52426NHw = (C52426NHw) o29;
            return AbstractC53880NsC.A00(context, c52426NHw.A03) - AbstractC53880NsC.A00(context, c52426NHw.A04);
        }
        return 0;
    }
}
