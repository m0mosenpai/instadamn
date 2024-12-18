package X;

import X.AbstractC167017dG;
import X.C14360o3;
import X.C3F5;
import X.C70593Ew;
import X.NI6;
import X.OXZ;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1;
import java.util.List;

/* loaded from: classes9.dex */
public final class NI6 extends OXZ {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Context A07;
    public final LinearLayout A08;
    public final RecyclerView A09;
    public final UserSession A0A;
    public final C55098Ob9 A0B;
    public final C51165Mj8 A0C;
    public final ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1 A0D;
    public final EnumC53170NfR A0E;
    public final OFW A0F;
    public final C187418Sj A0G;
    public final C187358Sd A0H;
    public final C50868Mdz A0I;
    public final NIX A0J;
    public final boolean A0K;
    public final Handler A0L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.3Fe, com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1] */
    public NI6(final Context context, LinearLayout linearLayout, UserSession userSession, OFW ofw, C187418Sj c187418Sj, C187358Sd c187358Sd, C50868Mdz c50868Mdz, NIX nix, int i, int i2, boolean z, boolean z2) {
        RecyclerView recyclerView;
        C14360o3.A0B(ofw, 10);
        this.A0A = userSession;
        this.A07 = context;
        this.A0I = c50868Mdz;
        this.A0H = c187358Sd;
        this.A0G = c187418Sj;
        this.A0J = nix;
        this.A01 = i;
        this.A0K = z;
        this.A08 = linearLayout;
        this.A0F = ofw;
        this.A06 = i2;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_timedelements_recyclerview, (ViewGroup) linearLayout, false);
        if (inflate instanceof RecyclerView) {
            recyclerView = (RecyclerView) inflate;
        } else {
            recyclerView = 0;
        }
        this.A09 = recyclerView;
        C51165Mj8 c51165Mj8 = new C51165Mj8(context, MSW.A1F(c50868Mdz, 12), i2, z2, c50868Mdz.A0l);
        this.A0C = c51165Mj8;
        this.A0E = EnumC53170NfR.A04;
        this.A04 = true;
        ?? r9 = new CustomScrollingLinearLayoutManager(context) { // from class: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineTimedElementsController$scrollingLinearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final void A1S(C3F5 c3f5) {
                C14360o3.A0B(c3f5, 0);
                super.A1S(c3f5);
                NI6 ni6 = this;
                if ((ni6.A04 || ni6.A05) && A1a() == 0) {
                    ni6.A04 = false;
                    ni6.A05 = false;
                    int i3 = ni6.A0I.A03;
                    if (i3 != 0) {
                        ((OXZ) ni6).A00 = 0;
                        ni6.A0G(i3);
                    }
                }
                ni6.A02 = ni6.A0C.A03;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
            public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i3) {
                AbstractC167017dG.A1P(c70593Ew, c3f5);
                return super.A1K(c70593Ew, c3f5, this.A09(i3));
            }
        };
        this.A0D = r9;
        this.A00 = -1;
        this.A0B = new C55098Ob9(userSession, c50868Mdz, new C57521Pfv(this, 7), new C57521Pfv(this, 8), MSW.A1F(this, 13));
        this.A0L = new Handler(context.getMainLooper());
        c51165Mj8.A01 = this;
        c51165Mj8.A08 = z;
        c51165Mj8.A05 = true;
        c51165Mj8.A00 = MSW.A04(c50868Mdz.A0E);
        c51165Mj8.notifyDataSetChanged();
        c51165Mj8.A06 = AbstractC13620mo.A02(context);
        c51165Mj8.A04 = C18U.A06(C06090Tz.A05, userSession, 36322113220585477L);
        if (recyclerView != 0) {
            recyclerView.setLayoutManager(r9);
            recyclerView.setAdapter(c51165Mj8);
            recyclerView.setItemAnimator(null);
            recyclerView.A10(new C51181MjP(c51165Mj8.A03));
            C55590OmT c55590OmT = new C55590OmT(recyclerView, new C56296OzH(this, 1), true, true);
            c55590OmT.A03.setIsLongpressEnabled(false);
            recyclerView.A12(c55590OmT);
            A0K(context, c50868Mdz, new C57521Pfv(this, 4));
            c51165Mj8.A02 = new C56300OzL(recyclerView, this);
            linearLayout.addView(recyclerView);
            recyclerView.setVisibility(0);
        }
        A0F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r12.A0K != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r5 < r13.size()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI6.A0P(java.util.List):void");
    }

    public static final void A00(NI6 ni6) {
        NID nid;
        RecyclerView recyclerView = ni6.A09;
        if (recyclerView != null && !recyclerView.A1D()) {
            int i = 0;
            for (Object obj : ni6.A0C.A03) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                O7N o7n = (O7N) obj;
                if (o7n instanceof C52422NHs) {
                    C51832Mva c51832Mva = ((C52422NHs) o7n).A04;
                    if (c51832Mva.A0A == C05F.A15) {
                        int i3 = ((OXZ) ni6).A00;
                        int i4 = ni6.A06 / 2;
                        int i5 = 0;
                        if (i3 > i4) {
                            i5 = i3 - i4;
                        }
                        c51832Mva.A00 = i5;
                        C3OO A0V = recyclerView.A0V(i);
                        if ((A0V instanceof NID) && (nid = (NID) A0V) != null) {
                            int i6 = ((OXZ) ni6).A00;
                            int i7 = 0;
                            if (i6 > i4) {
                                i7 = i6 - i4;
                            }
                            TextView textView = nid.A00;
                            AbstractC31177DnL.A0x(textView, AbstractC167017dG.A06(((AbstractC51365MmQ) nid).A00) + i7, textView.getPaddingTop());
                        }
                    }
                }
                i = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2 >= r1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.NI6 r5) {
        /*
            X.Mdz r0 = r5.A0I
            java.util.ArrayList r3 = r0.A0H()
            X.Mj8 r4 = r5.A0C
            java.util.List r0 = r4.A03
            int r1 = r0.size()
            int r2 = r5.A00
            if (r2 < 0) goto L15
            r0 = 1
            if (r2 < r1) goto L16
        L15:
            r0 = 0
        L16:
            r1 = 0
            if (r0 == 0) goto L37
            java.util.List r0 = r4.A03
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r2)
            boolean r0 = r0 instanceof X.C52422NHs
            if (r0 == 0) goto L37
            int r0 = r5.A00
            X.Mva r2 = r4.A00(r0)
            if (r2 == 0) goto L37
            int r0 = r2.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A02
            java.util.List r1 = X.AbstractC43594JPz.A11(r1, r0)
        L37:
            X.Ob9 r0 = r5.A0B
            r0.A02()
            r0.A04(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI6.A01(X.NI6):void");
    }

    public static final void A03(NI6 ni6, int i, int i2) {
        AbstractC51365MmQ abstractC51365MmQ;
        RecyclerView recyclerView = ni6.A09;
        C3OO c3oo = null;
        if (recyclerView != null) {
            c3oo = recyclerView.A0V(ni6.A00);
        }
        if ((c3oo instanceof NID) && (abstractC51365MmQ = (AbstractC51365MmQ) c3oo) != null) {
            C50809McW c50809McW = abstractC51365MmQ.A01;
            c50809McW.A0H = i;
            c50809McW.A0G = i2;
        }
    }

    public final void A0N() {
        C51165Mj8 c51165Mj8 = this.A0C;
        C16930sl c16930sl = C16930sl.A00;
        RecyclerView recyclerView = this.A09;
        boolean z = true;
        if (recyclerView == null || !recyclerView.A1D()) {
            z = false;
        }
        c51165Mj8.A02(c16930sl, z);
        AbstractC167007dF.A0x(recyclerView);
        if (!c51165Mj8.A0A && !c51165Mj8.A07) {
            C50868Mdz c50868Mdz = this.A0I;
            if (!c50868Mdz.A0Z() && !c50868Mdz.A0Y()) {
                c50868Mdz.A0K();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(java.lang.Integer r11, float r12, float r13) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NI6.A0O(java.lang.Integer, float, float):void");
    }

    public final boolean A0Q() {
        AbstractC187378Sf A0E = this.A0H.A0E();
        if (!(A0E instanceof C187508Ss) && !(A0E instanceof C187528Su) && !(A0E instanceof C187558Sy) && !(A0E instanceof C187568Sz) && !(A0E instanceof C187548Sw) && !(A0E instanceof C187518St) && !(A0E instanceof C8TB) && !(A0E instanceof C187538Sv)) {
            return true;
        }
        return false;
    }

    public static final void A02(NI6 ni6, int i) {
        EnumC191648eM enumC191648eM;
        if (ni6.A0Q()) {
            C51165Mj8 c51165Mj8 = ni6.A0C;
            if (!c51165Mj8.A0A) {
                boolean z = ni6.A0K;
                if (!z) {
                    UserSession userSession = ni6.A0A;
                    if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36322113220519940L)) {
                        if (((AbstractC50863Mdu) ni6.A0J).A01.A0H(ni6.A01, (i - 2) / 2).A0A == C05F.A15) {
                            return;
                        }
                    }
                }
                ni6.A0D();
                c51165Mj8.A09 = true;
                NIX nix = ni6.A0J;
                C55228Oey c55228Oey = ((AbstractC50863Mdu) nix).A01;
                C51832Mva A0G = c55228Oey.A0G();
                if (A0G != null) {
                    EnumC53185Nfh enumC53185Nfh = A0G.A09;
                    EnumC53185Nfh enumC53185Nfh2 = EnumC53185Nfh.A09;
                    C1818484t c1818484t = nix.A07;
                    if (enumC53185Nfh == enumC53185Nfh2) {
                        enumC191648eM = EnumC191648eM.A0P;
                    } else {
                        enumC191648eM = EnumC191648eM.A0K;
                    }
                    c1818484t.A01(enumC191648eM);
                }
                nix.A0E.Egh(EnumC53130Nej.A02);
                if (AbstractC25225BEi.A1a(c55228Oey.A04, C55228Oey.A0C) && MSZ.A06(c55228Oey) == ni6.A01) {
                    ni6.A00 = (MSZ.A07(c55228Oey) * 2) + 2;
                }
                nix.A0S();
                if (z) {
                    int i2 = ni6.A01;
                    c55228Oey.A0T(i2, true);
                    nix.A0T(i2);
                } else {
                    int i3 = ni6.A01;
                    c55228Oey.A0R(i3, (i - 2) / 2, true);
                    nix.A0I(i3);
                }
                A01(ni6);
            }
        }
    }
}
