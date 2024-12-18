package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class HDB extends C38K implements InterfaceC71989XEc, AbsListView.OnScrollListener, GZU, InterfaceC60122ou, InterfaceC37188GZz {
    public static final String __redex_internal_original_name = "ReelUserListFragment";
    public C7E1 A00;
    public UserSession A01;
    public Reel A02;
    public C41181vS A03;
    public OJL A04;
    public FR7 A05;
    public C31543DtT A06;
    public C38E A08;
    public String A09;
    public final C61372qz A0A = new C61372qz();
    public boolean A07 = true;

    @Override // X.InterfaceC71989XEc
    public final void Cw7(C69141ViW c69141ViW) {
    }

    @Override // X.InterfaceC71989XEc
    public final void Czl(C38266GsB c38266GsB) {
    }

    @Override // X.InterfaceC71989XEc
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        List singletonList = Collections.singletonList(reel);
        C38E c38e = this.A08;
        c38e.A0C = this.A09;
        C42790IwS.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 8);
        c38e.A0A(reel, C3G2.A1g, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
    }

    @Override // X.InterfaceC71989XEc
    public final void DTP(C38266GsB c38266GsB, C41181vS c41181vS, User user) {
    }

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
    }

    @Override // X.InterfaceC71989XEc
    public final void DtW(C69141ViW c69141ViW) {
    }

    @Override // X.InterfaceC71989XEc
    public final void DtX(User user) {
        String str;
        FR7 fr7 = this.A05;
        if (fr7 == null) {
            fr7 = new FR7(this, this.A01);
            this.A05 = fr7;
        }
        if (this instanceof C39526Hcs) {
            str = "quick_reactions_list";
        } else {
            str = "poll_voters_list";
        }
        Reel reel = this.A02;
        reel.getClass();
        fr7.A01(this, user, str, false, reel.A0d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.HDB r2) {
        /*
            X.DtT r1 = r2.A06
            boolean r0 = r1.isLoading()
            if (r0 == 0) goto Lf
            boolean r0 = r1.CLJ()
            r1 = 1
            if (r0 == 0) goto L10
        Lf:
            r1 = 0
        L10:
            android.view.View r0 = r2.mView
            X.AbstractC31557Dth.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDB.A01(X.HDB):void");
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A01;
    }

    public final void A0b() {
        if (this instanceof C39526Hcs) {
            C39526Hcs c39526Hcs = (C39526Hcs) this;
            if (((HDB) c39526Hcs).A03 != null) {
                c39526Hcs.A0c();
                ((HDB) c39526Hcs).A06.A01 = false;
                UserSession userSession = ((HDB) c39526Hcs).A01;
                C38321qM c38321qM = ((HDB) c39526Hcs).A03.A0b;
                c38321qM.getClass();
                String id = c38321qM.getId();
                String str = c39526Hcs.A00;
                String str2 = ((HDB) c39526Hcs).A06.A00;
                C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
                A0N.A0L("media/%s/list_reel_media_reactor/", id);
                A0N.A0S(HB7.class, C41334IRf.class);
                if (str != null) {
                    A0N.A9s(AbstractC43591JPw.A00(454), str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    A0N.A9s("max_id", str2);
                }
                C1ON A0N2 = A0N.A0N();
                C39030HGg.A00(A0N2, c39526Hcs, 44);
                c39526Hcs.schedule(A0N2);
                return;
            }
            return;
        }
        C39525Hcr c39525Hcr = (C39525Hcr) this;
        if (((HDB) c39525Hcr).A03 == null) {
            return;
        }
        c39525Hcr.A0c();
        ((HDB) c39525Hcr).A06.A01 = false;
        UserSession userSession2 = ((HDB) c39525Hcr).A01;
        C38321qM c38321qM2 = ((HDB) c39525Hcr).A03.A0b;
        c38321qM2.getClass();
        String id2 = c38321qM2.getId();
        C101394gx A00 = AbstractC140306Wi.A00(((HDB) c39525Hcr).A03);
        A00.getClass();
        C1ON A04 = C25401Lu.A04(userSession2, id2, AbstractC37865GlK.A00(A00), ((HDB) c39525Hcr).A06.A00, c39525Hcr.A00);
        C39030HGg.A00(A04, c39525Hcr, 43);
        c39525Hcr.schedule(A04);
    }

    public final void A0c() {
        this.A06.A02 = true;
        AbstractC31175DnJ.A0j(getActivity(), true);
        if (A0d()) {
            A01(this);
        }
    }

    public final boolean A0d() {
        List list;
        if (this instanceof C39526Hcs) {
            list = ((HED) this.A00).A02;
        } else {
            list = ((HEG) this.A00).A04;
        }
        return list.isEmpty();
    }

    @Override // X.InterfaceC37188GZz
    public final boolean CL7() {
        return !this.A00.isEmpty();
    }

    @Override // X.InterfaceC71989XEc
    public final void DAN(C38266GsB c38266GsB, C41181vS c41181vS, User user, boolean z) {
        String str;
        C28501Zl c28501Zl = C28531Zo.A04.A02;
        UserSession userSession = this.A01;
        if (this instanceof C39526Hcs) {
            str = AbstractC111324zv.A00(2964);
        } else {
            str = "reel_dashboard_viewer";
        }
        C34725FRo A06 = c28501Zl.A06(this, userSession, str);
        AbstractC37304Gc5.A1Q(A06, c41181vS, user, z);
        C3DN A01 = C3DN.A00.A01(getContext());
        A01.getClass();
        A01.A0J(A06.A00());
    }

    @Override // X.InterfaceC71989XEc
    public final void DXH(C38266GsB c38266GsB) {
        User user = c38266GsB.A0L;
        user.getClass();
        OJL ojl = this.A04;
        if (ojl == null) {
            ojl = new OJL(getRootActivity());
            this.A04 = ojl;
        }
        Reel reel = this.A02;
        reel.getClass();
        ojl.A00(reel, new C42802Iwe(3, this, c38266GsB), user, getModuleName());
    }

    @Override // X.GZU
    public final void Dda() {
        C0fA.A00(this.A00, -2079118201);
    }

    @Override // X.InterfaceC71989XEc
    public final void E17(C38266GsB c38266GsB) {
        String str;
        User user = c38266GsB.A0L;
        user.getClass();
        UserSession userSession = this.A01;
        String id = user.getId();
        if (this instanceof C39526Hcs) {
            str = "reel_aggregated_quick_reactions_list";
        } else {
            str = "reel_poll_voters_list";
        }
        C31368DqX A0J = AbstractC37304Gc5.A0J(this, userSession, id, str);
        C31368DqX.A01(AbstractC25225BEi.A0r(requireActivity(), this.A01), this.A01, AbstractC31364DqT.A02(), A0J);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Context requireContext;
        int i;
        if (this instanceof C39526Hcs) {
            getContext().getClass();
            requireContext = getContext();
            i = 2131971789;
        } else {
            requireContext = requireContext();
            i = 2131971772;
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, requireContext.getString(i));
    }

    @Override // X.C38K, X.C38L
    public final void A0V(Bundle bundle) {
        super.A0V(bundle);
        A0b();
    }

    @Override // X.InterfaceC37188GZz
    public final void Chd() {
        A0b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C7E1 heg;
        int A02 = C0f9.A02(-1214012997);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0S(this);
        String string = requireArguments().getString("ReelUserListFragment.REEL_ID");
        String string2 = requireArguments().getString("ReelUserListFragment.REEL_ITEM_ID");
        Reel A0I = AbstractC37301Gc2.A0I(this.A01, string);
        this.A02 = A0I;
        if (A0I != null) {
            Iterator it = A0I.A0O(this.A01).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41181vS c41181vS = (C41181vS) it.next();
                if (c41181vS.A0j.equals(string2)) {
                    this.A03 = c41181vS;
                    break;
                }
            }
        }
        this.A06 = new C31543DtT(this, this.A01, this);
        if (this instanceof C39526Hcs) {
            getContext().getClass();
            heg = new HED(getContext(), this, this.A01, this, this.A06);
        } else {
            heg = new HEG(requireContext(), this, this.A01, this, this.A06);
        }
        this.A00 = heg;
        this.A08 = new C38E(this, this.A01, AbstractC37301Gc2.A0L(this));
        this.A09 = AbstractC166997dE.A0n();
        C0f9.A09(340247950, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1812562060);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_listview_with_progress);
        C0f9.A09(-1387615917, A02);
        return A0A;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-975003195);
        super.onResume();
        if (!C06P.A00(AbstractC31174DnI.A0I(this)) && this.A03 == null) {
            AbstractC25226BEj.A1Q(this);
        }
        FragmentActivity requireActivity = requireActivity();
        C1OU c1ou = C1OU.$redex_init_class;
        C3M4 A05 = C3M4.A05(requireActivity);
        if (A05 != null && A05.A0a() && A05.A0G == C3G2.A1g) {
            A05.A0Y(this);
        }
        C0f9.A09(-454150987, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(1191363420);
        this.A0A.onScroll(absListView, i, i2, i3);
        C0f9.A0A(1868924716, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(-1096431186);
        this.A0A.onScrollStateChanged(absListView, i);
        C0f9.A0A(-765893075, A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1763527925);
        super.onStart();
        A01(this);
        C0f9.A09(1279270517, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A.A01(this.A06);
        AbstractC37300Gc1.A02(this).setOnScrollListener(this);
        A0U(this.A00);
    }
}
