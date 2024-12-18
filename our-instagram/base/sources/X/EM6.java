package X;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EM6 extends AbstractC59962oe implements AnonymousClass309, InterfaceC60072op, InterfaceC60122ou, InterfaceC60152ox, InterfaceC43452JHq, InterfaceC72503Mx {
    public static final String __redex_internal_original_name = "SavedTabbedFeedFragment";
    public MTJ A03;
    public C25671My A04;
    public UserSession A05;
    public C64842wi A07;
    public C64742wY A08;
    public FOR A09;
    public EnumC39551HdN A0A;
    public GI1 A0B;
    public SavedCollection A0C;
    public EnumC39557HdT A0D;
    public EnumC33416Epn A0E;
    public INJ A0F;
    public FRS A0G;
    public C41198ILm A0H;
    public EmptyStateView A0I;
    public C131325wL A0K;
    public String A0L;
    public String A0M;
    public boolean A0P;
    public C3I9 A0V;
    public C57012jc A0W;
    public C57012jc A0X;
    public C57012jc A0Y;
    public C154796xU A0Z;
    public FN7 A0a;
    public final InterfaceC1571373s A0i = new GHN(this, 3);
    public final InterfaceC41501vz A0e = new C36155FxU(this, 10);
    public final InterfaceC41501vz A0d = new C36155FxU(this, 11);
    public final FHL A0f = new FHL(this);
    public final FHM A0g = new FHM(this);
    public final JIB A0h = new GFQ(this);
    public final Handler A0c = AbstractC167007dF.A0J();
    public int A00 = -1;
    public boolean A0Q = false;
    public boolean A0T = false;
    public boolean A0S = false;
    public IgEditText A06 = null;
    public View A01 = null;
    public View A02 = null;
    public View A0U = null;
    public IgBouncyUfiButtonImageView A0J = null;
    public boolean A0b = false;
    public boolean A0R = false;
    public boolean A0N = false;
    public boolean A0O = false;

    public static void A03(EM6 em6) {
        UserSession userSession;
        boolean A1V;
        String A06;
        HL9 hl9 = new HL9(em6, 1);
        C154796xU c154796xU = em6.A0Z;
        boolean A1X = AbstractC31178DnM.A1X(C06090Tz.A05, em6.A05, 36313003594942052L);
        if (em6.A0E == EnumC33416Epn.A05) {
            userSession = em6.A05;
            A1V = AbstractC25229BEm.A1Z(em6.A0C);
            C14360o3.A0B(userSession, 1);
            A06 = "feed/saved/all/";
        } else {
            String str = em6.A0L;
            userSession = em6.A05;
            A1V = AbstractC167007dF.A1V(userSession);
            A06 = AbstractC13670mt.A06("feed/collection/%s/all/", str);
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B(A06);
        A0M.A02 = new C25581Mo(new C07510aQ(userSession), FXJ.class);
        A0M.A0A = AnonymousClass001.A0R(A06, null);
        A0M.A04();
        A0M.A0I("include_collection_info", A1V);
        A0M.A0I("include_clips_subtab", A1X);
        c154796xU.A03(AbstractC31172DnG.A0T(A0M, "clips_subtab_first", "false"), hl9);
        A08(em6);
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A02(EM6 em6) {
        INJ inj = em6.A0F;
        if (inj != null) {
            LinearLayout linearLayout = inj.A00;
            boolean z = inj.A01;
            int i = 4;
            if (z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            GI1 gi1 = em6.A0B;
            if (gi1.A05) {
                gi1.A05 = false;
                gi1.A02();
            }
            FragmentActivity activity = em6.getActivity();
            if (activity != null) {
                AbstractC31175DnJ.A0i(activity);
            }
        }
    }

    public static void A04(EM6 em6) {
        if (em6.A0W != null) {
            C57012jc c57012jc = em6.A0Y;
            if (em6.A0C != null && A0A(em6) && c57012jc != null) {
                em6.A09 = new FOR(c57012jc.A01());
            } else {
                SavedCollection savedCollection = em6.A0C;
                if (savedCollection == null || savedCollection.A07 != EnumC33416Epn.A0A || em6.A0A != EnumC39551HdN.A07) {
                    return;
                } else {
                    em6.A0a = new FN7(em6.A0W.A01());
                }
            }
            A05(em6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.EM6 r23) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.A05(X.EM6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.EM6 r6) {
        /*
            com.instagram.ui.emptystaterow.EmptyStateView r4 = r6.A0I
            if (r4 == 0) goto L67
            boolean r3 = r6.A0P
            boolean r2 = r6.A0T
            r1 = 30
            X.FpL r0 = new X.FpL
            r0.<init>(r6, r1)
            X.AbstractC40788I5q.A00(r0, r4, r3, r2)
            com.instagram.save.model.SavedCollection r5 = r6.A0C
            if (r5 == 0) goto L5f
            com.instagram.common.session.UserSession r0 = r6.A05
            java.lang.String r0 = r0.userId
            boolean r0 = r5.A07(r0)
            if (r0 == 0) goto L93
            com.instagram.ui.emptystaterow.EmptyStateView r4 = r6.A0I
            boolean r0 = r6.A0T
            if (r0 == 0) goto L7b
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r6)
            r1 = 2131972750(0x7f13528e, float:1.9582516E38)
        L2d:
            java.lang.String r0 = r5.A0G
            java.lang.String r0 = X.AbstractC166997dE.A0r(r2, r0, r1)
        L33:
            X.6up r3 = X.EnumC153216up.A02
            r4.A0W(r3, r0)
            boolean r0 = r6.A0T
            if (r0 == 0) goto L68
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r6)
            r1 = 2131972746(0x7f13528a, float:1.9582508E38)
        L43:
            java.lang.String r0 = r5.A0G
            java.lang.String r0 = X.AbstractC166997dE.A0r(r2, r0, r1)
            r4.A0V(r3, r0)
            X.Epn r1 = r6.A0E
            X.Epn r0 = X.EnumC33416Epn.A0A
            if (r1 != r0) goto L5f
            com.instagram.ui.emptystaterow.EmptyStateView r1 = r6.A0I
            r0 = 2131972732(0x7f13527c, float:1.958248E38)
            r1.A0Q(r3, r0)
            X.73s r0 = r6.A0i
            r1.A0O(r0, r3)
        L5f:
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r6.A0I
            r0.A0I()
            A08(r6)
        L67:
            return
        L68:
            com.instagram.common.session.UserSession r0 = r6.A05
            boolean r0 = X.AbstractC35085Fcw.A01(r0)
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r6)
            r1 = 2131972745(0x7f135289, float:1.9582506E38)
            if (r0 == 0) goto L43
            r1 = 2131972747(0x7f13528b, float:1.958251E38)
            goto L43
        L7b:
            boolean r0 = r6.A0P
            if (r0 == 0) goto L87
            android.content.res.Resources r2 = X.AbstractC166997dE.A0N(r6)
            r1 = 2131972749(0x7f13528d, float:1.9582514E38)
            goto L2d
        L87:
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r6)
            r0 = 2131972748(0x7f13528c, float:1.9582512E38)
            java.lang.String r0 = r1.getString(r0)
            goto L33
        L93:
            com.instagram.ui.emptystaterow.EmptyStateView r2 = r6.A0I
            r1 = 2131972751(0x7f13528f, float:1.9582518E38)
            X.6up r0 = X.EnumC153216up.A02
            r2.A0T(r0, r1)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.A06(X.EM6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.EM6 r6) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.A07(X.EM6):void");
    }

    public static void A08(EM6 em6) {
        if (em6.A0I != null) {
            Integer num = em6.A0Z.A03.A03;
            Integer num2 = C05F.A00;
            boolean A1X = AbstractC167007dF.A1X(num, num2);
            Integer num3 = C05F.A01;
            boolean A1X2 = AbstractC167007dF.A1X(num, num3);
            boolean z = !em6.A0B.A03();
            if (!A1X && !A1X2 && !z) {
                em6.A0I.setVisibility(8);
                return;
            }
            em6.A0I.setVisibility(0);
            EmptyStateView emptyStateView = em6.A0I;
            Integer num4 = em6.A0Z.A03.A03;
            if (num4 == num2) {
                emptyStateView.A0L();
            } else if (num4 == num3) {
                emptyStateView.A0J();
            } else {
                emptyStateView.A0P(EnumC153216up.A02);
                emptyStateView.A0I();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r1.A07(r4.A05.userId) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0A(X.EM6 r4) {
        /*
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            r3 = 0
            if (r1 == 0) goto L3f
            com.instagram.common.session.UserSession r0 = r4.A05
            boolean r0 = X.AbstractC35085Fcw.A01(r0)
            if (r0 == 0) goto L40
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.String r0 = r0.userId
            boolean r0 = r1.A07(r0)
            if (r0 != 0) goto L1b
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r1.A05
            if (r0 == 0) goto L40
        L1b:
            r2 = 1
        L1c:
            com.instagram.common.session.UserSession r0 = r4.A05
            boolean r0 = X.AbstractC35085Fcw.A00(r0)
            if (r0 == 0) goto L2f
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.String r0 = r0.userId
            boolean r1 = r1.A07(r0)
            r0 = 1
            if (r1 == 0) goto L30
        L2f:
            r0 = 0
        L30:
            if (r2 != 0) goto L35
            r2 = 0
            if (r0 == 0) goto L36
        L35:
            r2 = 1
        L36:
            X.Epn r1 = r4.A0E
            X.Epn r0 = X.EnumC33416Epn.A05
            if (r1 == r0) goto L3f
            if (r2 == 0) goto L3f
            r3 = 1
        L3f:
            return r3
        L40:
            r2 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.A0A(X.EM6):boolean");
    }

    public final void A0B() {
        INJ inj = this.A0F;
        if (inj != null) {
            inj.A02(this.A0B.A04());
            AbstractC31178DnM.A0v(this);
        }
    }

    @Override // X.InterfaceC43452JHq
    public final void CvM() {
        if (this.A0C != null) {
            ArrayList A01 = this.A0B.A01();
            WFV wfv = new WFV(requireActivity(), this.A05, this, null);
            SavedCollection savedCollection = this.A0C;
            C42813Iwp c42813Iwp = new C42813Iwp(2, this, A01);
            wfv.A05((C38321qM) AbstractC166997dE.A0k(A01), new C42812Iwo(2, this, A01), c42813Iwp, savedCollection);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        FragmentActivity requireActivity;
        int A0F;
        if (this.mView != null && this.A06 != null && this.A01 != null && this.A0U != null && this.A0X != null && this.A0R && AbstractC35085Fcw.A02(this.A05)) {
            if (i > 100) {
                this.A06.requestFocus();
                if (getRootActivity() instanceof InterfaceC53712dA) {
                    this.A01.setTranslationY((this.mView.getTop() - i) - AbstractC13880nE.A04(this.mView.getContext(), 56));
                } else {
                    this.A0X.A01().setVisibility(8);
                }
                this.A0U.setVisibility(0);
                this.A0b = true;
                C56352iT.A0t.A04(this).A0T();
                int rgb = Color.rgb(0, 0, 0);
                requireActivity = requireActivity();
                A0F = AbstractC167017dG.A02(rgb, 80);
            } else {
                this.A0R = false;
                this.A06.clearFocus();
                this.A01.setVisibility(8);
                this.A0U.setVisibility(8);
                this.A0b = false;
                C56352iT.A0t.A04(this).A0T();
                if (!(getRootActivity() instanceof InterfaceC53712dA)) {
                    this.A0X.A01().setVisibility(0);
                }
                requireActivity = requireActivity();
                A0F = AbstractC53242c7.A0F(requireContext(), R.attr.statusBarBackgroundColor);
            }
            AbstractC56402iY.A02(requireActivity, A0F);
        }
    }

    @Override // X.InterfaceC43452JHq
    public final void DTv() {
        if (this.A0C != null) {
            final ArrayList A01 = this.A0B.A01();
            final Runnable runnable = new Runnable() { // from class: X.GOq
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC31181DnP.A0z(EM6.this, A01);
                }
            };
            WFV wfv = new WFV(requireActivity(), this.A05, this, null);
            SavedCollection savedCollection = this.A0C;
            XB3 xb3 = new XB3() { // from class: X.GFN
                @Override // X.XB3
                public final void Cpy(SavedCollection savedCollection2) {
                    EM6 em6 = EM6.this;
                    List list = A01;
                    Runnable runnable2 = runnable;
                    em6.A0G.A02(new DialogInterfaceOnClickListenerC35448Fk5(11, em6, runnable2, savedCollection2, list), savedCollection2.A0G, list.size());
                }
            };
            wfv.A06((C38321qM) AbstractC166997dE.A0k(A01), new XB2() { // from class: X.GFM
                @Override // X.XB2
                public final void ALn(String str, int i) {
                    EM6 em6 = EM6.this;
                    List list = A01;
                    Runnable runnable2 = runnable;
                    FRS frs = em6.A0G;
                    str.getClass();
                    frs.A02(new DialogInterfaceOnClickListenerC35360Fib(em6, list, runnable2, str, i, 2), str, list.size());
                }
            }, xb3, savedCollection);
        }
    }

    @Override // X.InterfaceC43452JHq
    public final void Det() {
        this.A0G.A00(DialogInterfaceOnClickListenerC35455FkC.A00(this, this.A0B.A01(), 55));
    }

    @Override // X.InterfaceC43452JHq
    public final void Dwk() {
        ArrayList A01 = this.A0B.A01();
        this.A0G.A01(DialogInterfaceOnClickListenerC35455FkC.A00(this, A01, 54), A01.size());
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A04(AbstractC37486Gf4.A00, this.A0L);
        SavedCollection savedCollection = this.A0C;
        if (savedCollection != null) {
            c11520jB.A04(AbstractC37486Gf4.A01, savedCollection.A0G);
        }
        return c11520jB;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        int i;
        SavedCollection savedCollection = this.A0C;
        if (savedCollection != null && savedCollection.A06() && !savedCollection.A07(this.A05.userId)) {
            i = 2370;
        } else {
            i = 2369;
        }
        return AbstractC111324zv.A00(i);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0B.A05) {
            A02(this);
            return true;
        }
        return this.A0S;
    }

    public static int A00(List list) {
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1H.add(AbstractC31172DnG.A0i(it).getId());
        }
        return A1H.size();
    }

    public static void A01(EM6 em6) {
        Context requireContext = em6.requireContext();
        AbstractC35254Fgn.A06(requireContext, requireContext.getString(2131976159), requireContext.getString(2131961880));
    }

    public static void A09(EM6 em6, int i) {
        if (A0A(em6)) {
            em6.A00 -= i;
            return;
        }
        SavedCollection savedCollection = em6.A0C;
        if (savedCollection == null) {
            return;
        }
        savedCollection.A0E = Integer.valueOf(AbstractC167017dG.A0K(savedCollection.A0E) - i);
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            boolean r0 = r4.isAdded()
            if (r0 == 0) goto La4
            r0 = 1
            r5.EkS(r0)
            X.GI1 r0 = r4.A0B
            boolean r0 = r0.A05
            if (r0 == 0) goto L13
            X.AbstractC31179DnN.A1G(r5)
        L13:
            boolean r0 = r4.A0T
            r3 = 0
            if (r0 == 0) goto La5
            r0 = 2131971126(0x7f134c36, float:1.9579223E38)
        L1b:
            r5.Efu(r0)
        L1e:
            boolean r0 = r4.A0b
            if (r0 == 0) goto L34
            int r1 = android.graphics.Color.rgb(r3, r3, r3)
            r0 = 80
            int r1 = X.AbstractC167017dG.A02(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r5.EPD(r0)
        L34:
            X.HdN r1 = r4.A0A
            X.HdN r0 = X.EnumC39551HdN.A06
            if (r1 != r0) goto L6d
            X.GI1 r0 = r4.A0B
            boolean r0 = r0.A05
            if (r0 != 0) goto L6d
            X.ILm r0 = r4.A0H
            X.JIB r2 = r0.A02
            com.instagram.save.model.SavedCollection r0 = r2.Ap1()
            if (r0 == 0) goto L6d
            X.Epn r1 = r0.A07
            X.Epn r0 = X.EnumC33416Epn.A05
            if (r1 != r0) goto L56
            boolean r0 = r2.CL7()
            if (r0 == 0) goto L6d
        L56:
            boolean r0 = r4.A0T
            if (r0 != 0) goto L6d
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            java.lang.Integer r0 = X.C05F.A00
            r2.A02(r0)
            r1 = 31
            X.FpL r0 = new X.FpL
            r0.<init>(r4, r1)
            X.AbstractC31176DnK.A1B(r0, r2, r5)
        L6d:
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            if (r1 == 0) goto La4
            boolean r0 = r1.A06()
            if (r0 == 0) goto La4
            boolean r0 = r4.A0O
            if (r0 == 0) goto La4
            com.instagram.user.model.User r0 = r1.A08
            if (r0 == 0) goto La4
            java.lang.String r1 = r0.getId()
            com.instagram.common.session.UserSession r0 = r4.A05
            boolean r0 = X.AbstractC31172DnG.A1Z(r0, r1)
            if (r0 == 0) goto La4
            boolean r0 = A0A(r4)
            if (r0 == 0) goto La4
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            java.lang.Integer r0 = X.C05F.A0N
            r2.A02(r0)
            r1 = 32
            X.FpL r0 = new X.FpL
            r0.<init>(r4, r1)
            X.AbstractC31176DnK.A1B(r0, r2, r5)
        La4:
            return
        La5:
            X.GI1 r1 = r4.A0B
            boolean r0 = r1.A05
            if (r0 == 0) goto Lcb
            boolean r0 = r1.A04()
            if (r0 == 0) goto Lcb
            X.GI1 r0 = r4.A0B
            java.util.ArrayList r0 = r0.A01()
            int r2 = r0.size()
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r4)
            r0 = 2131820951(0x7f110197, float:1.9274631E38)
            java.lang.String r0 = X.AbstractC167017dG.A0k(r1, r2, r0)
        Lc6:
            r5.setTitle(r0)
            goto L1e
        Lcb:
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto Ldb
            X.Epn r1 = r0.A07
            X.Epn r0 = X.EnumC33416Epn.A0A
            if (r1 != r0) goto Le0
            X.HdN r1 = r4.A0A
            X.HdN r0 = X.EnumC39551HdN.A07
            if (r1 != r0) goto Le0
        Ldb:
            r0 = 2131972712(0x7f135268, float:1.958244E38)
            goto L1b
        Le0:
            boolean r0 = A0A(r4)
            if (r0 != 0) goto Ldb
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.String r0 = r0.A0G
            goto Lc6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005b, code lost:
    
        if (X.C18U.A06(r7, r8, 36329698132836852L) != false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1639614600);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_save_collection_tabbed_viewpager);
        C0f9.A09(1946826500, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1020104158);
        super.onDestroy();
        C42345Ip7 A00 = FXK.A00(this.A05);
        A00.A01.clear();
        A00.A00 = false;
        C25671My c25671My = this.A04;
        c25671My.A02(this.A0e, C36110Fwk.class);
        c25671My.A02(this.A0d, C36116Fwq.class);
        unregisterLifecycleListener(this.A08);
        C0f9.A09(-1946316983, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            r13 = this;
            r0 = -1945377505(0xffffffff8c0be51f, float:-1.0777119E-31)
            int r1 = X.C0f9.A02(r0)
            super.onDestroyView()
            com.instagram.common.session.UserSession r4 = r13.A05
            java.lang.String r7 = r13.getModuleName()
            java.lang.String r8 = r13.A0M
            com.instagram.save.model.SavedCollection r3 = r13.A0C
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            boolean r2 = X.AbstractC167007dF.A1V(r8)
            java.lang.Integer r5 = X.C05F.A01
            r9 = 0
            if (r3 == 0) goto L96
            java.lang.Integer r0 = r3.A01(r4)
            java.lang.String r10 = X.AbstractC35089Fd0.A01(r0)
            java.lang.String r11 = r3.A0F
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r3.A05
            if (r0 == 0) goto L8d
            java.lang.Integer r6 = X.C05F.A0C
        L31:
            java.lang.String r12 = r3.A0G
        L33:
            X.AbstractC35088Fcz.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.GI1 r2 = r13.A0B
            com.google.android.material.tabs.TabLayout r0 = r2.A03
            if (r0 == 0) goto L3f
            r0.setupWithViewPager(r9)
        L3f:
            r2.A03 = r9
            r2.A01 = r9
            r2.A02 = r9
            r13.A0I = r9
            r13.A0F = r9
            r13.A0W = r9
            r13.A0Y = r9
            r13.A0a = r9
            boolean r0 = A0A(r13)
            if (r0 == 0) goto L81
            com.instagram.common.session.UserSession r0 = r13.A05
            boolean r0 = X.AbstractC35085Fcw.A02(r0)
            if (r0 == 0) goto L81
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            int r2 = X.AbstractC56402iY.A00(r0)
            android.content.Context r0 = r13.requireContext()
            r3 = 2130971254(0x7f040a76, float:1.7551241E38)
            int r0 = X.AbstractC53242c7.A0F(r0, r3)
            if (r2 == r0) goto L81
            androidx.fragment.app.FragmentActivity r2 = r13.requireActivity()
            android.content.Context r0 = r13.requireContext()
            int r0 = X.AbstractC53242c7.A0F(r0, r3)
            X.AbstractC56402iY.A02(r2, r0)
        L81:
            X.5wL r0 = r13.A0K
            r0.A01(r9)
            r0 = 1207065139(0x47f25a33, float:124084.4)
            X.C0f9.A09(r0, r1)
            return
        L8d:
            boolean r0 = r3.A06()
            if (r0 != r2) goto L99
            java.lang.Integer r6 = X.C05F.A00
            goto L31
        L96:
            java.lang.String r10 = "null"
            r11 = r9
        L99:
            r6 = r9
            if (r3 != 0) goto L31
            r12 = r9
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM6.onDestroyView():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(2037219426);
        super.onPause();
        A02(this);
        this.A0V.EFx(this);
        C0f9.A09(-1487082882, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-972832836);
        this.A0V.A9e(this);
        super.onResume();
        C0f9.A09(-621434008, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1704373293);
        super.onStart();
        this.A0V.Dnr(getActivity());
        C0f9.A09(134716865, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1171234918);
        super.onStop();
        this.A0V.onStop();
        C0f9.A09(-293783900, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        GI1 gi1 = this.A0B;
        C14360o3.A0B(view, 0);
        gi1.A03 = (TabLayout) view.requireViewById(R.id.save_collection_tab_layout);
        gi1.A01 = view.requireViewById(R.id.save_collection_tabs_bottom_divider);
        gi1.A02 = (ViewPager) view.requireViewById(R.id.save_collection_viewpager);
        Context context = view.getContext();
        gi1.A00 = AbstractC167007dF.A09(context, R.attr.glyphColorPrimary);
        TabLayout tabLayout = gi1.A03;
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(gi1.A02);
        }
        TabLayout tabLayout2 = gi1.A03;
        if (tabLayout2 != null) {
            tabLayout2.A0C = gi1.A00;
            AbstractC31172DnG.A1B(context, tabLayout2, AbstractC53242c7.A0D(context));
        }
        ViewPager viewPager = gi1.A02;
        if (viewPager != null) {
            viewPager.setAdapter(gi1.A06);
        }
        gi1.A04 = AbstractC166987dD.A1G();
        GI1.A00(gi1);
        this.A0I = (EmptyStateView) view.requireViewById(R.id.empty);
        INJ inj = new INJ(AbstractC31172DnG.A0B(view, R.id.bulk_actions_container), true);
        this.A0F = inj;
        if (!this.A0T) {
            inj.A01(requireContext(), this.A0E, this);
        }
        this.A0W = AbstractC31177DnL.A0U(view, R.id.save_collection_header_stub);
        this.A0Y = AbstractC31177DnL.A0U(view, R.id.public_save_collection_header_stub);
        this.A0X = AbstractC31177DnL.A0U(view, R.id.public_collections_composer_container);
        A04(this);
        A06(this);
        A07(this);
        FN7 fn7 = this.A0a;
        if (fn7 != null && fn7.A03.getVisibility() == 0) {
            UserSession userSession = this.A05;
            String moduleName = getModuleName();
            SavedCollection savedCollection = this.A0C;
            if (savedCollection != null) {
                str = AbstractC35089Fd0.A01(savedCollection.A01(this.A05));
            } else {
                str = null;
            }
            C14360o3.A0B(userSession, 0);
            AbstractC35088Fcz.A01(userSession, C05F.A0C, moduleName, null, str);
            C64742wY c64742wY = this.A08;
            C64842wi c64842wi = this.A07;
            c64742wY.A00(fn7.A03, QPTooltipAnchor.A1D, c64842wi);
            this.A07.DiZ();
        }
    }
}
