package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.ENd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32356ENd extends AbstractC60672pq implements InterfaceC1570173f, InterfaceC60122ou, InterfaceC169467hM {
    public static final String __redex_internal_original_name = "DiscoverPeopleSearchFragment";
    public InterfaceC190488c6 A00;
    public GFV A01;
    public C65974TxR A02;
    public EQM A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public C38E A07;
    public String A08;
    public final List A0B = AbstractC166987dD.A1E();
    public boolean A09 = true;
    public final InterfaceC37181GZs A0A = new GFT(this, 1);
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        InterfaceC09390do interfaceC09390do = this.A0C;
        Location A00 = AbstractC55112ObW.A00(AbstractC166987dD.A0r(interfaceC09390do));
        boolean z = this.A05;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String moduleName = getModuleName();
        if (z) {
            C14360o3.A0C(A0r, AbstractC58317Pt9.A00(46));
            String str4 = null;
            C25621Ms A0M = AbstractC31177DnL.A0M(A0r);
            A0M.A0B(AbstractC111324zv.A00(2352));
            A0M.A9s("query", str);
            A0M.A0D("count", 30);
            A0M.A9s(AbstractC111324zv.A00(545), String.valueOf(C23831Eq.A00()));
            A0M.A9s("search_surface", moduleName);
            if (A00 != null) {
                str3 = Double.valueOf(A00.getLatitude()).toString();
            } else {
                str3 = null;
            }
            A0M.A0H("lat", str3);
            if (A00 != null) {
                str4 = Double.valueOf(A00.getLongitude()).toString();
            }
            A0M.A0H("lng", str4);
            return AbstractC31172DnG.A0R(null, A0M, C33137Ejg.class, FXO.class, false);
        }
        return IS1.A00(A00, A0r, str, moduleName);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.InterfaceC1570173f
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        AbstractC167017dG.A1N(reel, gradientSpinnerAvatarView);
        List A1J = AbstractC166987dD.A1J(reel);
        C38E c38e = this.A07;
        if (c38e == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A08;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                c38e.A0C = str2;
                C31559Dtj.A00(getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 2);
                c38e.A0A(reel, C3G2.A0m, gradientSpinnerAvatarView, A1J, A1J, A1J);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1570173f
    public final void DHp(User user, int i) {
        C14360o3.A0B(user, 0);
        if (!this.A05) {
            AbstractC31171DnF.A16(this);
            if (user.A0M() == C05F.A01) {
                if (user.B7L() == FollowStatus.A05) {
                    EQM eqm = this.A03;
                    if (eqm != null) {
                        if (!eqm.A0B) {
                            A01(this, user);
                            return;
                        }
                    }
                    C14360o3.A0F("userListAdapter");
                    throw C00O.createAndThrow();
                }
                if (user.B7L() != FollowStatus.A06) {
                    return;
                }
                EQM eqm2 = this.A03;
                if (eqm2 != null) {
                    if (!user.equals(eqm2.A07)) {
                        return;
                    }
                    EQM eqm3 = this.A03;
                    if (eqm3 != null) {
                        eqm3.A0B = false;
                        eqm3.A07 = null;
                        A00(this);
                        List list = this.A0B;
                        list.remove(user);
                        list.add(0, user);
                        EQM eqm4 = this.A03;
                        if (eqm4 != null) {
                            eqm4.A05(list);
                            return;
                        }
                    }
                }
                C14360o3.A0F("userListAdapter");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.InterfaceC1570173f
    public final void DT1(User user) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C9QE.A01(uqe, abstractC115105If, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.InterfaceC1570173f
    public final void Dy8(User user, int i) {
        C14360o3.A0B(user, 0);
        Dy9(requireView(), user, i);
    }

    @Override // X.InterfaceC1570173f
    public final void Dy9(View view, User user, int i) {
        C14360o3.A0B(user, 0);
        InterfaceC09390do interfaceC09390do = this.A0C;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "search_in_dp_user_row", getModuleName());
        C140966Yy A0j = AbstractC25233BEq.A0j(this, interfaceC09390do);
        A0j.A0F = true;
        C31368DqX.A02(A0j, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131960985);
        interfaceC56362iU.EkT(new ViewOnClickListenerC35666Fp0(this, 67), true);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        EQM eqm = this.A03;
        if (eqm == null) {
            str = "userListAdapter";
        } else {
            setAdapter(eqm);
            getScrollingViewProxy().AAJ(new JXT(view, 2));
            ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.action_bar_search_hints_text_layout);
            AbstractC13880nE.A0a(A0C, 12);
            AbstractC13880nE.A0c(A0C, 12);
            View childAt = A0C.getChildAt(0);
            C14360o3.A0C(childAt, AbstractC111324zv.A00(2800));
            SearchEditText searchEditText = (SearchEditText) childAt;
            ColorFilter A09 = AbstractC31174DnI.A09(requireContext(), AbstractC31174DnI.A05(this));
            Drawable drawable = searchEditText.getCompoundDrawablesRelative()[0];
            if (drawable != null) {
                drawable.mutate();
                drawable.setAlpha(51);
                drawable.setColorFilter(A09);
            }
            GFV gfv = this.A01;
            if (gfv == null) {
                str = "searchBarController";
            } else {
                gfv.A00(searchEditText, true);
                if (this.A05 && this.A09) {
                    C25621Ms A0D = AbstractC31179DnN.A0D(AbstractC166987dD.A0o(this.A0C));
                    A0D.A0B("discover/non_profiled/");
                    EV0.A01(this, AbstractC25227BEk.A0e(A0D, EAL.class, C34737FSc.class), 20);
                    this.A09 = false;
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C32356ENd c32356ENd) {
        EQM eqm = c32356ENd.A03;
        if (eqm == null) {
            C14360o3.A0F("userListAdapter");
            throw C00O.createAndThrow();
        }
        ESB esb = eqm.A0Q;
        esb.A00 = c32356ENd;
        esb.A01 = true;
    }

    public static final void A01(C32356ENd c32356ENd, User user) {
        C1ON A02 = AbstractC35238FgX.A02(AbstractC166987dD.A0r(c32356ENd.A0C), AbstractC13670mt.A06("friendships/%s/following/", user.getId()), "search_in_dp");
        C31456Ds0.A00(A02, user, c32356ENd, 26);
        c32356ENd.schedule(A02);
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        C65974TxR c65974TxR;
        if (this.A06 && (c65974TxR = this.A02) != null && !c65974TxR.A04()) {
            EQM eqm = this.A03;
            if (eqm == null) {
                C14360o3.A0F("userListAdapter");
                throw C00O.createAndThrow();
            }
            eqm.A0C = false;
            eqm.A04 = new GHR(this, null, null);
            eqm.A0A = true;
            eqm.A03();
            AbstractC31171DnF.A16(this);
        }
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        String str2;
        if (this.A06) {
            GFV gfv = this.A01;
            if (gfv == null) {
                str2 = "searchBarController";
            } else if (gfv.A01.length() > 0) {
                EQM eqm = this.A03;
                str2 = "userListAdapter";
                if (eqm != null) {
                    if (!eqm.A0C) {
                        eqm.A0C = true;
                        eqm.A03();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C65974TxR c65974TxR;
        C33137Ejg c33137Ejg = (C33137Ejg) interfaceC40821up;
        C14360o3.A0B(c33137Ejg, 1);
        if (this.A06 && (c65974TxR = this.A02) != null && !c65974TxR.A04()) {
            EQM eqm = this.A03;
            String str2 = "userListAdapter";
            if (eqm != null) {
                eqm.A0C = false;
                GFV gfv = this.A01;
                if (gfv == null) {
                    str2 = "searchBarController";
                } else {
                    if (gfv.A01.length() > 0) {
                        Collection collection = c33137Ejg.A01;
                        if (collection == null) {
                            collection = C16930sl.A00;
                        }
                        eqm.A05(collection);
                        getScrollingViewProxy().EMV(false);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        EQM eqm = this.A03;
        if (eqm != null && eqm.A0B) {
            return "search_in_dp_following_list";
        }
        return "search_in_dp";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return C1GJ.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (X.C18U.A06(r5, X.AbstractC166987dD.A0o(r2), 36318655771842941L) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r28.A05 != false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.2sz] */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = -1694575997(0xffffffff9afed283, float:-1.0539204E-22)
            int r1 = X.C0f9.A02(r0)
            r6 = r28
            r0 = r29
            super.onCreate(r0)
            java.lang.String r3 = X.AbstractC167017dG.A0j()
            X.0do r2 = r6.A0C
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r2)
            X.8c6 r0 = X.AbstractC190468c4.A00(r6, r0, r3)
            r6.A00 = r0
            X.0ll r0 = X.AbstractC166987dD.A0o(r2)
            X.0Tz r5 = X.C06090Tz.A06
            r3 = 36318655771908478(0x8107a00001197e, double:3.0314023814188404E-306)
            boolean r0 = X.C18U.A06(r5, r0, r3)
            if (r0 != 0) goto L3f
            X.0ll r0 = X.AbstractC166987dD.A0o(r2)
            r3 = 36318655771842941(0x8107a00000197d, double:3.0314023813773945E-306)
            boolean r3 = X.C18U.A06(r5, r0, r3)
            r0 = 0
            if (r3 == 0) goto L40
        L3f:
            r0 = 1
        L40:
            r6.A05 = r0
            X.0ll r5 = X.AbstractC166987dD.A0o(r2)
            X.0Tz r0 = X.C06090Tz.A05
            r3 = 36314584142908135(0x8103ec00010ae7, double:3.0288274668438894E-306)
            boolean r0 = X.C18U.A06(r0, r5, r3)
            if (r0 != 0) goto L58
            boolean r3 = r6.A05
            r0 = 0
            if (r3 == 0) goto L59
        L58:
            r0 = 1
        L59:
            r6.A06 = r0
            if (r0 == 0) goto L71
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r2)
            r5 = 0
            X.7hO r8 = new X.7hO
            r8.<init>()
            r10 = 0
            java.lang.Integer r9 = X.C05F.A00
            r7 = r5
            X.TxR r0 = X.AbstractC65980TxZ.A01(r4, r5, r6, r7, r8, r9, r10)
            r6.A02 = r0
        L71:
            X.GZs r4 = r6.A0A
            r3 = 2131960984(0x7f132498, float:1.9558652E38)
            X.GFV r0 = new X.GFV
            r0.<init>(r4, r3)
            r6.A01 = r0
            android.content.Context r5 = r6.requireContext()
            com.instagram.common.session.UserSession r9 = X.AbstractC166987dD.A0r(r2)
            r7 = 0
            r0 = 2
            X.C14360o3.A0B(r9, r0)
            X.GHn r11 = new X.GHn
            r11.<init>()
            r19 = 0
            r25 = 1
            X.EQM r4 = new X.EQM
            r8 = r6
            r10 = r7
            r12 = r7
            r13 = r6
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r20 = r19
            r21 = r19
            r22 = r19
            r23 = r19
            r24 = r19
            r26 = r19
            r27 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6.A03 = r4
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r2)
            X.38C r2 = new X.38C
            r2.<init>(r6)
            X.38E r0 = new X.38E
            r0.<init>(r6, r3, r2)
            r6.A07 = r0
            java.lang.String r0 = X.AbstractC166997dE.A0n()
            r6.A08 = r0
            r0 = -402160181(0xffffffffe80785cb, float:-2.55995E24)
            X.C0f9.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32356ENd.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(816900989);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_recyclerview_with_progress_and_search, false);
        C0f9.A09(-852546869, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1479382056);
        EQM eqm = this.A03;
        if (eqm == null) {
            C14360o3.A0F("userListAdapter");
            throw C00O.createAndThrow();
        }
        C161887My c161887My = eqm.A06;
        if (c161887My != null) {
            c161887My.A01();
        }
        super.onDestroy();
        C0f9.A09(-953815234, A02);
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31179DnN.A12(recyclerView);
        recyclerView.A0S = true;
        recyclerView.setItemAnimator(null);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }
}
