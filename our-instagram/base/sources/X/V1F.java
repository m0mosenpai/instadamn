package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes11.dex */
public final class V1F extends AbstractC59962oe implements XDv, InterfaceC60122ou, XBI, InterfaceC37294Gbv {
    public static final String __redex_internal_original_name = "FindFriendsSearchFragment";
    public ListView A00;
    public C38E A01;
    public C52198N8n A02;
    public C65960TxC A03;
    public C65974TxR A04;
    public C66151U1s A05;
    public SearchEditText A06;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public View A0E;
    public InterfaceC41501vz A0F;
    public InterfaceC41501vz A0G;
    public InterfaceC190488c6 A0H;
    public InterfaceC169497hP A0I;
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);
    public String A07 = "";
    public boolean A0D = true;
    public final InterfaceC41501vz A0M = new C70717Wfi(this, 4);
    public final XLU A0O = new VAE(this, 1);
    public final InterfaceC71958XCk A0N = new U3P(2);
    public final XB8 A0K = new C65925TwW(this, 0);
    public final XB6 A0J = new MZQ(this, 2);
    public final GYT A0P = new C71062WnJ(this, 1);

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC169497hP interfaceC169497hP = this.A0I;
        if (interfaceC169497hP == null) {
            C14360o3.A0F("cache");
            throw C00O.createAndThrow();
        }
        return AbstractC55112ObW.A03((UserSession) this.A0L.getValue(), new C51642MrZ(str, "search_find_friends_page", str2, interfaceC169497hP.BjP(str).A04, null, null, 30, false, false, false));
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
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        C14360o3.A0B(str, 0);
        String str2 = this.A07;
        if (str.equals(str2)) {
            this.A0C = false;
            this.A0A = true;
            A03(this, str2, false);
        }
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
    public final void DgJ(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgO(UQE uqe, InterfaceC40821up interfaceC40821up) {
        C9QE.A00(uqe, interfaceC40821up, this);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.XDv
    public final void El2() {
        this.A0D = true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131973006);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "find_friends";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0L;
        C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
        InterfaceC41501vz interfaceC41501vz = this.A0F;
        if (interfaceC41501vz == null) {
            str = "clearSearchesEventListener";
        } else {
            A0Q.A01(interfaceC41501vz, C70710WfZ.class);
            InterfaceC41501vz interfaceC41501vz2 = this.A0G;
            if (interfaceC41501vz2 == null) {
                str = "updatedSearchesEventListener";
            } else {
                A0Q.A01(interfaceC41501vz2, C70703WfS.class);
                SearchEditText searchEditText = (SearchEditText) view.requireViewById(R.id.search_edit_text);
                this.A06 = searchEditText;
                str = "searchEditText";
                if (searchEditText != null) {
                    searchEditText.setHint(2131973057);
                    SearchEditText searchEditText2 = this.A06;
                    if (searchEditText2 != null) {
                        searchEditText2.A0C = new C71101Wnx(this);
                        if (this.A0D) {
                            searchEditText2.requestFocus();
                            SearchEditText searchEditText3 = this.A06;
                            if (searchEditText3 != null) {
                                AbstractC13880nE.A0R(searchEditText3);
                                this.A0D = false;
                            }
                        }
                        ColorFilter A00 = C3DY.A00(AbstractC31173DnH.A03(getContext(), requireContext(), R.attr.igds_color_creation_tools_grey_05));
                        SearchEditText searchEditText4 = this.A06;
                        if (searchEditText4 != null) {
                            searchEditText4.setClearButtonColorFilter(A00);
                            SearchEditText searchEditText5 = this.A06;
                            if (searchEditText5 != null) {
                                searchEditText5.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A00);
                                C106904rr A002 = C106904rr.A00((AbstractC12990ll) interfaceC09390do.getValue());
                                SearchEditText searchEditText6 = this.A06;
                                if (searchEditText6 != null) {
                                    searchEditText6.addTextChangedListener(A002);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(V1F v1f) {
        String str;
        InterfaceC190488c6 interfaceC190488c6 = v1f.A0H;
        if (interfaceC190488c6 == null) {
            str = "searchLogger";
        } else {
            String str2 = v1f.A07;
            C65960TxC c65960TxC = v1f.A03;
            str = "dataSource";
            if (c65960TxC != null) {
                String A03 = c65960TxC.A03(str2);
                C65960TxC c65960TxC2 = v1f.A03;
                if (c65960TxC2 != null) {
                    interfaceC190488c6.Cld(U3J.A00(c65960TxC2.A01), str2, A03);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(V1F v1f) {
        String str;
        View view = v1f.A0E;
        if (view == null) {
            str = "emptyView";
        } else {
            int i = 0;
            int i2 = 8;
            if (v1f.A07.length() == 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
            ListView listView = v1f.A00;
            if (listView == null) {
                str = "listView";
            } else {
                if (v1f.A07.length() <= 0) {
                    i = 8;
                }
                listView.setVisibility(i);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(V1F v1f, CharSequence charSequence, boolean z) {
        int A03;
        String string;
        boolean z2 = v1f.A0A;
        Context requireContext = v1f.requireContext();
        Context context = v1f.getContext();
        if (z2) {
            A03 = AbstractC31173DnH.A03(context, requireContext, R.attr.igds_color_creation_tools_blue);
            string = AbstractC166997dE.A0r(AbstractC166997dE.A0N(v1f), charSequence, 2131973013);
        } else {
            A03 = AbstractC31173DnH.A03(context, requireContext, R.attr.igds_color_creation_tools_grey_05);
            string = v1f.requireContext().getString(2131973064);
        }
        C52198N8n c52198N8n = v1f.A02;
        if (c52198N8n != null) {
            C14360o3.A0B(string, 0);
            c52198N8n.A03.A00 = z;
            C31699Dw4 c31699Dw4 = c52198N8n.A02;
            c31699Dw4.A01 = string;
            c31699Dw4.A00 = A03;
            c52198N8n.A01 = true;
            C52198N8n c52198N8n2 = v1f.A02;
            if (c52198N8n2 != null) {
                c52198N8n2.A00();
                return;
            }
        }
        C14360o3.A0F("searchAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.XDv
    public final void CMc() {
        SearchEditText searchEditText = this.A06;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.A04();
    }

    @Override // X.XBI
    public final void CN3(String str) {
        String str2;
        C65960TxC c65960TxC = this.A03;
        if (c65960TxC == null) {
            str2 = "dataSource";
        } else {
            c65960TxC.A04();
            C52198N8n c52198N8n = this.A02;
            if (c52198N8n == null) {
                str2 = "searchAdapter";
            } else {
                c52198N8n.A00();
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.XDv
    public final void Chg() {
        if (this.A0C && !this.A0A) {
            C65974TxR c65974TxR = this.A04;
            if (c65974TxR != null) {
                if (!c65974TxR.A04()) {
                    String str = this.A07;
                    if (str.length() > 0) {
                        this.A0B = false;
                        C65974TxR c65974TxR2 = this.A04;
                        if (c65974TxR2 != null) {
                            c65974TxR2.A03(str);
                            A03(this, null, true);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("queuedTypeAheadManager");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        String str2;
        C68085V9q c68085V9q = (C68085V9q) interfaceC40821up;
        AbstractC167007dF.A1K(str, c68085V9q);
        if (str.equals(this.A07)) {
            String str3 = c68085V9q.A03;
            boolean z = true;
            if (str3 == null || str3.length() == 0) {
                C0w9.A03("UserSearchResponse", "Invalid UserSearchResponse format, missing rankToken");
            }
            C14360o3.A07(c68085V9q.A00);
            C65960TxC c65960TxC = this.A03;
            if (c65960TxC == null) {
                str2 = "dataSource";
            } else {
                c65960TxC.A04();
                this.A0A = false;
                if (this.A0B) {
                    ListView listView = this.A00;
                    if (listView == null) {
                        str2 = "listView";
                    } else {
                        listView.setSelection(0);
                    }
                }
                if (!c68085V9q.A04 || !(!r1.isEmpty())) {
                    z = false;
                }
                this.A0C = z;
                C52198N8n c52198N8n = this.A02;
                str2 = "searchAdapter";
                if (c52198N8n != null) {
                    c52198N8n.A01 = false;
                    c52198N8n.A00();
                    A01(this);
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XDv
    public final void DyB() {
        C38E c38e = this.A01;
        if (c38e == null) {
            C14360o3.A0F("reelViewerLauncher");
            throw C00O.createAndThrow();
        }
        C140626Xq c140626Xq = c38e.A07;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A00);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0L.getValue();
    }

    public static final void A00(AbstractC65924TwV abstractC65924TwV, Tx0 tx0, V1F v1f) {
        C70108W4f A00 = VWT.A00(abstractC65924TwV);
        A00.A07 = tx0.A09;
        A00.A01 = tx0.A05;
        C66166U2h A01 = A00.A01();
        InterfaceC190488c6 interfaceC190488c6 = v1f.A0H;
        if (interfaceC190488c6 == null) {
            C14360o3.A0F("searchLogger");
            throw C00O.createAndThrow();
        }
        String E6U = v1f.A0K.E6U();
        int i = tx0.A00;
        interfaceC190488c6.ClZ(A01, C05F.A0N, C05F.A0C, E6U, tx0.A06, i);
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1198950294);
        super.onCreate(bundle);
        String A0n = AbstractC166997dE.A0n();
        this.A09 = A0n;
        String str = "searchSessionId";
        if (A0n != null) {
            InterfaceC09390do interfaceC09390do = this.A0L;
            this.A05 = new C66151U1s(requireActivity(), this, (UserSession) interfaceC09390do.getValue(), A0n, 112, false);
            this.A0F = new C70723Wfo(this, 17);
            this.A0G = new C70723Wfo(this, 18);
            this.A0I = new C169487hO();
            AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0M, C70073Cr.class);
            String str2 = this.A09;
            if (str2 != null) {
                this.A0H = AbstractC190468c4.A00(this, (UserSession) interfaceC09390do.getValue(), str2);
                UserSession userSession = (UserSession) interfaceC09390do.getValue();
                InterfaceC169497hP interfaceC169497hP = this.A0I;
                str = "cache";
                if (interfaceC169497hP != null) {
                    this.A04 = AbstractC65980TxZ.A00(userSession, this, null, this, interfaceC169497hP, C05F.A00, 0L, 200L, false, false);
                    this.A01 = new C38E(this, (UserSession) interfaceC09390do.getValue(), new C38C(this));
                    this.A08 = AbstractC166997dE.A0n();
                    InterfaceC169497hP interfaceC169497hP2 = this.A0I;
                    if (interfaceC169497hP2 != null) {
                        XB8 xb8 = this.A0K;
                        XB6 xb6 = this.A0J;
                        this.A03 = new C65960TxC(W14.A00, xb6, xb8, new C71012WmT((UserSession) interfaceC09390do.getValue()), interfaceC169497hP2, 3, false);
                        FragmentActivity requireActivity = requireActivity();
                        C65960TxC c65960TxC = this.A03;
                        if (c65960TxC == null) {
                            str = "dataSource";
                        } else {
                            interfaceC09390do.getValue();
                            this.A02 = new C52198N8n(requireActivity, c65960TxC, xb6, xb8, new C54619OAu(requireActivity(), null, this, (UserSession) interfaceC09390do.getValue(), this.A0N, this.A0O, null, AbstractC111324zv.A00(3050), true, true, false), this.A0P);
                            C0f9.A09(-251988675, A02);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1058218771);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.find_friends_fragment, viewGroup, false);
        this.A0E = inflate.findViewById(R.id.empty_view);
        ListView listView = (ListView) inflate.requireViewById(android.R.id.list);
        C52198N8n c52198N8n = this.A02;
        if (c52198N8n == null) {
            C14360o3.A0F("searchAdapter");
            throw C00O.createAndThrow();
        }
        listView.setAdapter((ListAdapter) c52198N8n);
        listView.setOnScrollListener(new U1V(this));
        this.A00 = listView;
        C0f9.A09(-1493059228, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(-374132717);
        C65974TxR c65974TxR = this.A04;
        if (c65974TxR == null) {
            str = "queuedTypeAheadManager";
        } else {
            c65974TxR.onDestroy();
            C25671My A0Q = AbstractC31176DnK.A0Q(this.A0L);
            InterfaceC41501vz interfaceC41501vz = this.A0F;
            if (interfaceC41501vz == null) {
                str = "clearSearchesEventListener";
            } else {
                A0Q.A02(interfaceC41501vz, C70710WfZ.class);
                InterfaceC41501vz interfaceC41501vz2 = this.A0G;
                if (interfaceC41501vz2 == null) {
                    str = "updatedSearchesEventListener";
                } else {
                    A0Q.A02(interfaceC41501vz2, C70703WfS.class);
                    A0Q.A02(this.A0M, C70073Cr.class);
                    super.onDestroy();
                    C0f9.A09(1206201189, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-541384782);
        super.onPause();
        CMc();
        C0f9.A09(-1342503659, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-508563649);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a()) {
            A05.A0Y(this);
        }
        A02(this);
        C0f9.A09(-1401760749, A02);
    }
}
