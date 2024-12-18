package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.collect.ImmutableSet;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResharedContent;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EMC extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC132405yL, InterfaceC60122ou, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "DirectSearchInboxSeeAllResharedContentFragment";
    public C32873EdF A00;
    public FQR A01;
    public ArrayList A03;
    public int A04;
    public int A05;
    public int A06;
    public RecyclerView A07;
    public ShimmerFrameLayout A08;
    public C57112jm A09;
    public C36303Fzy A0A;
    public C36305G0a A0B;
    public C153766vl A0C;
    public C62832tM A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public final int A0J = 9;
    public String A02 = "";
    public final C1I4 A0K = new E0L(this, 15);
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkK(DirectSearchResult directSearchResult, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void CkL(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC153556vQ
    public final void D1P() {
    }

    @Override // X.InterfaceC153566vR
    public final void D51(View view) {
    }

    @Override // X.InterfaceC153546vP
    public final void D52(View view) {
    }

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        String str;
        String str2;
        C14360o3.A0B(c120985dq, 0);
        InterfaceC09390do interfaceC09390do = this.A0I;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0u, AbstractC166987dD.A0r(interfaceC09390do));
        C62832tM c62832tM = this.A0D;
        if (c62832tM == null) {
            str = "clipsGridItemsStore";
        } else {
            String str3 = this.A0E;
            str = "gridKey";
            if (str3 != null) {
                ArrayList A01 = A01();
                C125905mf A00 = InterfaceC111084zP.A00.A00(true);
                A00.A00 = null;
                c62832tM.A03(A00.A00(), EnumC125615m7.A03, str3, A01, true, true);
                C38321qM c38321qM = c120985dq.A02;
                List list = c120985dq.A08;
                if (c38321qM != null && list != null) {
                    Dld(null, new DirectSearchResharedContent(AbstractC166987dD.A0r(interfaceC09390do), c38321qM, AbstractC001800i.A0k(list)), "inbox_search", i, i, this.A06, this.A05, this.A04);
                }
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                FragmentActivity requireActivity = requireActivity();
                C38321qM c38321qM2 = c120985dq.A02;
                if (c38321qM2 != null) {
                    str2 = c38321qM2.getId();
                } else {
                    str2 = null;
                }
                c116875Qr.A1D = str2;
                String str4 = this.A0E;
                if (str4 != null) {
                    c116875Qr.A1G = str4;
                    c116875Qr.A1C = AbstractC31173DnH.A0t(interfaceC09390do);
                    c116875Qr.A1d = false;
                    String str5 = this.A0G;
                    if (str5 == null) {
                        str = "query";
                    } else {
                        c116875Qr.A03(new SearchContext(null, null, str5, null, null, null, null, null));
                        c116875Qr.A0x = this.A02;
                        AbstractC31173DnH.A1J(requireActivity, c116875Qr, A0r);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        return false;
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC132405yL
    public final void D9q(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final /* synthetic */ void DAs(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dle(RectF rectF, View view, C31446Drq c31446Drq, DirectShareTarget directShareTarget, String str, List list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqk(View view, C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, boolean z) {
        C38321qM c38321qM;
        String id;
        String str2;
        AbstractC25229BEm.A1I(directSearchResult, 0, view);
        if ((directSearchResult instanceof DirectSearchResharedContent) && (c38321qM = ((DirectSearchResharedContent) directSearchResult).A01) != null && (id = c38321qM.getId()) != null) {
            C32873EdF c32873EdF = this.A00;
            if (c32873EdF == null) {
                str2 = "impressionHelper";
            } else {
                C36443G5s A00 = A00(c32873EdF, id, i, i2, i3, i4);
                C36305G0a c36305G0a = this.A0B;
                if (c36305G0a == null) {
                    c36305G0a = new C36305G0a(new C36444G5t(this, 4));
                    this.A0B = c36305G0a;
                }
                C59072n8 A002 = C59062n7.A00(A00, null, A00.A0A);
                A002.A00(c36305G0a);
                C59062n7 A01 = A002.A01();
                C57112jm c57112jm = this.A09;
                if (c57112jm == null) {
                    str2 = "viewpointManager";
                } else {
                    c57112jm.A05(view, A01);
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC132405yL
    public final void Dql(RectF rectF, C22P c22p, DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC132405yL
    public final void Dqm(View view) {
    }

    @Override // X.InterfaceC153586vT
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(true);
        String str = this.A0H;
        if (str == null) {
            C14360o3.A0F(DialogModule.KEY_TITLE);
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(str);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SEE_ALL_RESHARED_CONTENT_FRAGMENT";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            super.onViewCreated(r7, r8)
            android.content.Context r2 = r6.requireContext()
            r0 = 3
            com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager
            r1.<init>(r2, r0)
            X.6vl r0 = r6.A0C
            java.lang.String r3 = "clipsGridAdapter"
            if (r0 == 0) goto L9a
            X.0do r0 = r0.A0P
            java.lang.Object r0 = r0.getValue()
            X.6wP r0 = (X.AbstractC154146wP) r0
            r1.A01 = r0
            r0 = 2131430131(0x7f0b0af3, float:1.8481954E38)
            android.view.View r0 = r7.requireViewById(r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r6.A08 = r0
            r0 = 2131430130(0x7f0b0af2, float:1.8481952E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.AbstractC31172DnG.A0G(r7, r0)
            r6.A07 = r0
            java.lang.String r5 = "clipsRecyclerView"
            if (r0 == 0) goto L78
            r0.setLayoutManager(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A07
            if (r1 == 0) goto L78
            X.6vl r0 = r6.A0C
            if (r0 == 0) goto L9a
            X.2zD r0 = r0.A0I
            r1.setAdapter(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A07
            if (r1 == 0) goto L78
            X.1I4 r0 = r6.A0K
            r1.A14(r0)
            X.6vl r0 = r6.A0C
            if (r0 == 0) goto L9a
            java.util.List r0 = X.C153766vl.A00(r0)
            int r0 = r0.size()
            java.lang.String r2 = "clipsGridShimmerContainer"
            if (r0 != 0) goto L8e
            X.6vl r1 = r6.A0C
            if (r1 == 0) goto L9a
            int r0 = r6.A0J
            r1.A04(r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r6.A08
            if (r0 == 0) goto L96
            r0.A02()
        L72:
            X.2jm r3 = r6.A09
            if (r3 != 0) goto L80
            java.lang.String r5 = "viewpointManager"
        L78:
            X.C14360o3.A0F(r5)
        L7b:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L80:
            X.3Hc r2 = X.C71163Hc.A00(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r6.A07
            if (r1 == 0) goto L78
            X.2jp[] r0 = new X.InterfaceC57142jp[r4]
            r3.A08(r1, r2, r0)
            return
        L8e:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r6.A08
            if (r0 == 0) goto L96
            r0.A05()
            goto L72
        L96:
            X.C14360o3.A0F(r2)
            goto L7b
        L9a:
            X.C14360o3.A0F(r3)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMC.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final C36443G5s A00(C32873EdF c32873EdF, String str, int i, int i2, int i3, int i4) {
        C83693oE A0N = AbstractC31171DnF.A0N(str);
        ArrayList A1E = AbstractC166987dD.A1E();
        Integer num = C05F.A1F;
        String str2 = this.A0G;
        if (str2 == null) {
            C14360o3.A0F("query");
            throw C00O.createAndThrow();
        }
        return new C36443G5s(null, null, A0N, num, str, str2, c32873EdF.A01, this.A0F, null, A1E, i2, i3, i4, i, false, false);
    }

    public static final void A02(EMC emc) {
        C153766vl c153766vl = emc.A0C;
        String str = "clipsGridAdapter";
        if (c153766vl != null) {
            c153766vl.A02();
            ShimmerFrameLayout shimmerFrameLayout = emc.A08;
            if (shimmerFrameLayout == null) {
                str = "clipsGridShimmerContainer";
            } else {
                shimmerFrameLayout.A05();
                UserSession A0r = AbstractC166987dD.A0r(emc.A0I);
                ArrayList A01 = emc.A01();
                Map emptyMap = Collections.emptyMap();
                C153766vl c153766vl2 = emc.A0C;
                if (c153766vl2 != null) {
                    ArrayList A00 = AbstractC37873GlS.A00(A0r, c153766vl2.A0L, null, A01, emptyMap);
                    C153766vl c153766vl3 = emc.A0C;
                    if (c153766vl3 != null) {
                        FQR fqr = emc.A01;
                        if (fqr == null) {
                            str = "resharedContentProvider";
                        } else {
                            Integer num = fqr.A00;
                            if (num != null) {
                                c153766vl3.A05(A00, AbstractC167007dF.A1X(num, C05F.A0Y));
                                return;
                            }
                            str = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC132405yL
    public final void Dld(C31446Drq c31446Drq, DirectSearchResult directSearchResult, String str, int i, int i2, int i3, int i4, int i5) {
        C38321qM c38321qM;
        String id;
        AbstractC167017dG.A1S(directSearchResult, str);
        if ((directSearchResult instanceof DirectSearchResharedContent) && (c38321qM = ((DirectSearchResharedContent) directSearchResult).A01) != null && (id = c38321qM.getId()) != null) {
            C32873EdF c32873EdF = this.A00;
            if (c32873EdF != null) {
                C36443G5s A00 = A00(c32873EdF, id, i5, i, i2, i4);
                C36303Fzy c36303Fzy = this.A0A;
                if (c36303Fzy != null) {
                    c36303Fzy.A08(A00, directSearchResult, i5, i, i2, i3);
                    C36303Fzy c36303Fzy2 = this.A0A;
                    if (c36303Fzy2 != null) {
                        c36303Fzy2.A09(directSearchResult);
                        C32873EdF c32873EdF2 = this.A00;
                        if (c32873EdF2 != null) {
                            c32873EdF2.A03(A00);
                            C32873EdF c32873EdF3 = this.A00;
                            if (c32873EdF3 != null) {
                                c32873EdF3.A02();
                                return;
                            }
                        }
                    }
                }
                C14360o3.A0F("directInboxSearchLogger");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("impressionHelper");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC132405yL
    public final void DpP(C31446Drq c31446Drq, DirectSearchResult directSearchResult, Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView, int i, int i2, int i3, int i4, int i5) {
        C0w9.A01.EmN(__redex_internal_original_name, "Story ring should not be accessible here.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    private final ArrayList A01() {
        DirectSearchResharedContent directSearchResharedContent;
        C38321qM c38321qM;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList arrayList = this.A03;
        if (arrayList == null) {
            C14360o3.A0F("resharedContentResults");
            throw C00O.createAndThrow();
        }
        Iterator A13 = AbstractC166997dE.A13(arrayList);
        while (A13.hasNext()) {
            DirectSearchResult directSearchResult = (DirectSearchResult) AbstractC166997dE.A0l(A13);
            if ((directSearchResult instanceof DirectSearchResharedContent) && (c38321qM = (directSearchResharedContent = (DirectSearchResharedContent) directSearchResult).A01) != null) {
                C120985dq A02 = C128085qc.A02(c38321qM);
                ImmutableSet A03 = ImmutableSet.A03(directSearchResharedContent.A02);
                C14360o3.A07(A03);
                A02.A08 = AbstractC166987dD.A1F(A03);
                A02.A04 = Integer.valueOf(this.A04);
                A02.A05 = Integer.valueOf(this.A05);
                A1E.add(A02);
            }
        }
        return A1E;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1508965237);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0H = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE", "");
        this.A0G = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        this.A0F = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MNET_REQUEST_ID");
        this.A04 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION", 0);
        this.A06 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", 0);
        this.A05 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SECTION_POSITION", 0);
        this.A02 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", "0");
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_RESHARED_CONTENT");
        if (parcelableArrayList == null) {
            parcelableArrayList = AbstractC166987dD.A1E();
        }
        this.A03 = parcelableArrayList;
        InterfaceC09390do interfaceC09390do = this.A0I;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C61972ry c61972ry = new C61972ry(requireContext(), AbstractC018607g.A00(this), null);
        FG4 fg4 = new FG4(this);
        String str2 = this.A0G;
        if (str2 == null) {
            str = "query";
        } else {
            FQR fqr = new FQR(A0r, c61972ry, fg4, str2);
            this.A01 = fqr;
            fqr.A00(this.A02);
            this.A0A = C36303Fzy.A00(AbstractC166987dD.A0r(interfaceC09390do));
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            C36303Fzy c36303Fzy = this.A0A;
            if (c36303Fzy == null) {
                str = "directInboxSearchLogger";
            } else {
                this.A00 = C32873EdF.A00(A0r2, c36303Fzy);
                C57112jm A00 = C57112jm.A00();
                this.A09 = A00;
                C153746vj c153746vj = new C153746vj(null, AbstractC166987dD.A0r(interfaceC09390do), A00, this, null);
                C153736vi c153736vi = new C153736vi(0.5625f, false, false);
                c153736vi.A01 = true;
                this.A0C = new C153766vl(requireContext(), null, this, c153746vj, this, AbstractC31175DnJ.A0K(interfaceC09390do, 1), this, c153736vi, null, null, null, false, false);
                this.A0E = AbstractC166997dE.A0n();
                this.A0D = AbstractC62822tL.A00(AbstractC166987dD.A0r(interfaceC09390do));
                C0f9.A09(-3854932, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-724967786);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inbox_search_see_all_reshared_content_fragment, viewGroup, false);
        UserSession A0r = AbstractC166987dD.A0r(this.A0I);
        ArrayList A01 = A01();
        Map emptyMap = Collections.emptyMap();
        C153766vl c153766vl = this.A0C;
        if (c153766vl != null) {
            ArrayList A00 = AbstractC37873GlS.A00(A0r, c153766vl.A0L, null, A01, emptyMap);
            C153766vl c153766vl2 = this.A0C;
            if (c153766vl2 != null) {
                c153766vl2.A05(A00, false);
                C0f9.A09(-2139743414, A02);
                return inflate;
            }
        }
        C14360o3.A0F("clipsGridAdapter");
        throw C00O.createAndThrow();
    }
}
