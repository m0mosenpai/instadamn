package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.response.HashtagCollection;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* loaded from: classes11.dex */
public final class V1W extends C38K implements InterfaceC11380iw, InterfaceC60442pS, InterfaceC60072op, AbsListView.OnScrollListener, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FollowingHashtagsFragment";
    public UserSession A00;
    public UserSession A01;
    public C67917V2h A02;
    public C63822v3 A03;
    public TypeaheadHeader A04;
    public String A05;
    public Eg7 A06;
    public boolean A07;
    public final C61372qz A0B = new C61372qz();
    public final C70930WkZ A0A = new C70930WkZ(this, 2);
    public final C68849Vd5 A09 = new C68849Vd5(this);
    public final C68851Vd7 A0F = new C68851Vd7(this);
    public final InterfaceC63862v7 A08 = new C70925WkU(this, 1);
    public final GZS A0C = new C71103Wo0(this);
    public final GYX A0D = new C71104Wo1(this, 2);
    public final C68850Vd6 A0E = new C68850Vd6(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.A07) {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131963461);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "following_hashtags";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            typeaheadHeader.A02();
            typeaheadHeader.setDelegate(this.A0C);
            typeaheadHeader.A03(AbstractC166997dE.A0p(requireContext(), 2131973015));
            C67917V2h c67917V2h = this.A02;
            if (c67917V2h == null) {
                str = "adapter";
            } else {
                A0U(c67917V2h);
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                UserSession userSession = this.A01;
                if (userSession == null) {
                    str = "viewerUserSession";
                } else {
                    C68850Vd6 c68850Vd6 = this.A0E;
                    AbstractC05560Rg.A00(this);
                    ListView listView = ((AbstractC05560Rg) this).A04;
                    C14360o3.A07(listView);
                    if (this.A05 == null) {
                        str = "userId";
                    } else {
                        this.A06 = new Eg7(listView, this, userSession, c68850Vd6);
                        C61372qz c61372qz = this.A0B;
                        c61372qz.A03(typeaheadHeader.A04);
                        Eg7 eg7 = this.A06;
                        if (eg7 == null) {
                            str = "impressionLogger";
                        } else {
                            c61372qz.A03(eg7);
                            AbstractC05560Rg.A00(this);
                            ((AbstractC05560Rg) this).A04.setOnScrollListener(this);
                            AbstractC05560Rg.A00(this);
                            ((AbstractC05560Rg) this).A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (X.AbstractC1120253r.A03(r3) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C19260xA A01(com.instagram.model.hashtag.Hashtag r3, X.V1W r4) {
        /*
            X.0xA r2 = new X.0xA
            r2.<init>()
            java.lang.String r1 = r4.A05
            if (r1 != 0) goto L13
            java.lang.String r0 = "userId"
        Lb:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L13:
            com.instagram.common.session.UserSession r0 = r4.A01
            if (r0 != 0) goto L1a
            java.lang.String r0 = "viewerUserSession"
            goto Lb
        L1a:
            java.lang.String r0 = r0.userId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L34
            boolean r0 = X.AbstractC1120253r.A03(r3)
            if (r0 == 0) goto L51
        L28:
            com.instagram.model.hashtag.HashtagFollowStatus r0 = com.instagram.model.hashtag.HashtagFollowStatus.A04
        L2a:
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "hashtag_follow_status_owner"
            X.C19260xA.A00(r2, r1, r0)
            return r2
        L34:
            X.V2h r0 = r4.A02
            if (r0 != 0) goto L3b
            java.lang.String r0 = "adapter"
            goto Lb
        L3b:
            java.util.List r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.next()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L41
        L51:
            com.instagram.model.hashtag.HashtagFollowStatus r0 = com.instagram.model.hashtag.HashtagFollowStatus.A05
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1W.A01(com.instagram.model.hashtag.Hashtag, X.V1W):X.0xA");
    }

    public static final void A02(V1W v1w) {
        String str;
        C67917V2h c67917V2h = v1w.A02;
        if (c67917V2h == null) {
            str = "adapter";
        } else {
            c67917V2h.A03.clear();
            c67917V2h.A06 = false;
            C67917V2h.A00(c67917V2h);
            C63822v3 c63822v3 = v1w.A03;
            if (c63822v3 == null) {
                str = "hashtagApi";
            } else {
                UserSession userSession = v1w.A01;
                if (userSession == null) {
                    str = "viewerUserSession";
                } else {
                    C68851Vd7 c68851Vd7 = v1w.A0F;
                    String A06 = AbstractC13670mt.A06("tags/suggested/", new Object[0]);
                    C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                    A0M.A0B(A06);
                    C1ON A0S = AbstractC31172DnG.A0S(A0M, HashtagCollection.class, C69966Vyh.class);
                    A0S.A00 = new C67954V3t(10, c63822v3, c68851Vd7);
                    C1GJ.A00(c63822v3.A00, c63822v3.A01, A0S);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1087447340);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        UserSession userSession = this.A00;
        String str = "userSession";
        if (userSession != null) {
            this.A03 = new C63822v3(requireContext, A00, this, userSession);
            this.A05 = requireArguments.getString("FollowingHashtagsFragment.UserId", "");
            String string = requireArguments.getString("FollowingHashtagsFragment.UserName", "");
            this.A07 = requireArguments.getBoolean("FollowingHashtagsFragment.IsStandalone");
            this.A01 = AbstractC31176DnK.A0S(this);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                Context requireContext2 = requireContext();
                C70930WkZ c70930WkZ = this.A0A;
                String str2 = this.A05;
                if (str2 != null) {
                    UserSession userSession3 = this.A01;
                    if (userSession3 != null) {
                        C67917V2h c67917V2h = new C67917V2h(requireContext2, c70930WkZ, this, userSession2, this.A0D, string, str2.equals(userSession3.userId));
                        this.A02 = c67917V2h;
                        c67917V2h.A03.clear();
                        c67917V2h.A06 = false;
                        C67917V2h.A00(c67917V2h);
                        C63822v3 c63822v3 = this.A03;
                        if (c63822v3 == null) {
                            str = "hashtagApi";
                        } else {
                            UserSession userSession4 = this.A01;
                            if (userSession4 != null) {
                                C68849Vd5 c68849Vd5 = this.A09;
                                String str3 = this.A05;
                                if (str3 != null) {
                                    String A06 = AbstractC13670mt.A06("users/%s/following_tags_info/", str3);
                                    C25621Ms A0M = AbstractC31177DnL.A0M(userSession4);
                                    A0M.A0B(A06);
                                    C1ON A0S = AbstractC31172DnG.A0S(A0M, HashtagCollection.class, C69966Vyh.class);
                                    A0S.A00 = new C67954V3t(9, c63822v3, c68849Vd5);
                                    C1GJ.A00(c63822v3.A00, c63822v3.A01, A0S);
                                    C0f9.A09(-1208511742, A02);
                                    return;
                                }
                            }
                        }
                    }
                    str = "viewerUserSession";
                }
                str = "userId";
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1426820359);
        C14360o3.A0B(layoutInflater, 0);
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        this.A04 = new TypeaheadHeader(context);
        View inflate = layoutInflater.inflate(R.layout.layout_listview_with_progress, viewGroup, false);
        C0f9.A09(-1428848322, A02);
        return inflate;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1968897846);
        super.onDestroyView();
        C61372qz c61372qz = this.A0B;
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            C31571Dtx c31571Dtx = typeaheadHeader.A04;
            C14360o3.A0B(c31571Dtx, 0);
            c61372qz.A02.remove(c31571Dtx);
            this.A04 = null;
            C0f9.A09(-1423784707, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(243743431, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-106324210);
        super.onPause();
        TypeaheadHeader typeaheadHeader = this.A04;
        if (typeaheadHeader != null) {
            typeaheadHeader.A01();
        }
        C0f9.A09(-1958649133, A02);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, -1052695877);
        this.A0B.onScroll(absListView, i, i2, i3);
        C0f9.A0A(2121228504, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, 1849014406);
        this.A0B.onScrollStateChanged(absListView, i);
        C0f9.A0A(1916670053, A0N);
    }
}
