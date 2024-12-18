package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V1b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67893V1b extends C38K implements XDv, InterfaceC60122ou, C88U, GYT, InterfaceC37294Gbv {
    public static final C69926Vxr A0B = new Object();
    public static final String __redex_internal_original_name = "BlockCommentersSettingFragment";
    public C67916V2g A00;
    public SF3 A01;
    public SearchEditText A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public C65974TxR A07;
    public InterfaceC169497hP A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);
    public final String A0A = AbstractC58317Pt9.A00(693);

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C1ON AN6(UQE uqe, String str) {
        return A2K.A00(uqe, this, str);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC169497hP interfaceC169497hP = this.A08;
        if (interfaceC169497hP == null) {
            C14360o3.A0F("cache");
            throw C00O.createAndThrow();
        }
        return AbstractC55112ObW.A03((UserSession) this.A09.getValue(), new C51642MrZ(str, AbstractC111324zv.A00(2159), null, interfaceC169497hP.BjP(str).A04, null, null, 30, false, false, false));
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
        String str2 = this.A03;
        if (str.equals(str2)) {
            this.A06 = false;
            this.A04 = true;
            A01(str2, false);
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

    @Override // X.GYT
    public final void DjF() {
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ void DpU(boolean z) {
    }

    @Override // X.XDv
    public final void DyB() {
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C71198Wpn c71198Wpn;
        C14360o3.A0B(charSequence, 1);
        String A01 = AbstractC13670mt.A01(charSequence);
        if (!C14360o3.A0K(A01, this.A03)) {
            this.A03 = A01;
            this.A05 = true;
            this.A06 = true;
            if (A01 != null) {
                C67916V2g c67916V2g = this.A00;
                String str = "adapter";
                if (c67916V2g != null) {
                    c67916V2g.A01 = false;
                    boolean isEmpty = TextUtils.isEmpty(A01);
                    c67916V2g.A00 = isEmpty;
                    if (isEmpty) {
                        c71198Wpn = c67916V2g.A05;
                        c71198Wpn.A00.clear();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        List A00 = U32.A00(c67916V2g.A04, c67916V2g.A0A, A01);
                        U33.A00(A00, 3);
                        arrayList.addAll(A00);
                        InterfaceC169497hP interfaceC169497hP = c67916V2g.A07;
                        List list = interfaceC169497hP.BjP(A01).A06;
                        List list2 = list;
                        if (list == null) {
                            C71198Wpn c71198Wpn2 = c67916V2g.A05;
                            ArrayList A12 = AbstractC166997dE.A12(c71198Wpn2, 0);
                            Iterator it = c71198Wpn2.iterator();
                            while (it.hasNext()) {
                                C65741TtG c65741TtG = (C65741TtG) it.next();
                                String username = c65741TtG.A06().getUsername();
                                String fullName = c65741TtG.A06().getFullName();
                                String lowerCase = username.toLowerCase(C1Q2.A02());
                                C14360o3.A07(lowerCase);
                                String lowerCase2 = A01.toLowerCase(C1Q2.A02());
                                C14360o3.A07(lowerCase2);
                                if (!lowerCase.startsWith(lowerCase2)) {
                                    if (fullName != null) {
                                        String lowerCase3 = fullName.toLowerCase(C1Q2.A02());
                                        C14360o3.A07(lowerCase3);
                                        String lowerCase4 = A01.toLowerCase(C1Q2.A02());
                                        C14360o3.A07(lowerCase4);
                                        if (lowerCase3.startsWith(lowerCase4)) {
                                        }
                                    }
                                }
                                A12.add(c65741TtG);
                            }
                            interfaceC169497hP.AA5(A01, null, A12);
                            list2 = A12;
                        }
                        U33.A00(list2, 3);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            MSZ.A1P(it2.next(), arrayList);
                        }
                        c71198Wpn = c67916V2g.A05;
                        List list3 = c71198Wpn.A00;
                        list3.clear();
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                C14360o3.A0B(next, 0);
                                list3.add(next);
                            }
                        }
                    }
                    if (c67916V2g.A00) {
                        c67916V2g.A01 = true;
                    } else {
                        C9JQ BjP = c67916V2g.A06.BjP(A01);
                        List list4 = BjP.A06;
                        if (list4 != null) {
                            int intValue = BjP.A01.intValue();
                            if (intValue != 2) {
                                if (intValue == 1) {
                                    c71198Wpn.A00(list4);
                                }
                            } else {
                                c67916V2g.A01 = true;
                                c71198Wpn.A00(list4);
                                c67916V2g.A0C();
                            }
                        }
                    }
                    c67916V2g.A0C();
                    if (c67916V2g.A01) {
                        C67916V2g c67916V2g2 = this.A00;
                        if (c67916V2g2 != null) {
                            c67916V2g2.A02 = false;
                            c67916V2g2.A0C();
                            return;
                        }
                    } else {
                        C65974TxR c65974TxR = this.A07;
                        if (c65974TxR == null) {
                            str = "queuedTypeaheadManager";
                        } else {
                            c65974TxR.A06(A01);
                            A01(this.A03, true);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable[] compoundDrawablesRelative;
        Drawable drawable;
        Drawable mutate;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (SearchEditText) view.requireViewById(R.id.block_commenter_search_edit_text);
        ColorFilter A00 = C3DY.A00(requireContext().getColor(R.color.baseline_neutral_80));
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.setClearButtonColorFilter(A00);
        }
        SearchEditText searchEditText2 = this.A02;
        if (searchEditText2 != null && (compoundDrawablesRelative = searchEditText2.getCompoundDrawablesRelative()) != null && (drawable = compoundDrawablesRelative[0]) != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(A00);
        }
        SearchEditText searchEditText3 = this.A02;
        if (searchEditText3 != null) {
            searchEditText3.A0C = this;
        }
        C67916V2g c67916V2g = this.A00;
        if (c67916V2g != null) {
            A0U(c67916V2g);
            AbstractC05560Rg.A00(this);
            ((AbstractC05560Rg) this).A04.setOnScrollListener(new U1V(this));
            C67916V2g c67916V2g2 = this.A00;
            if (c67916V2g2 != null) {
                c67916V2g2.A0C();
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    private final void A01(CharSequence charSequence, boolean z) {
        int color;
        String string;
        boolean z2 = this.A04;
        Context requireContext = requireContext();
        if (z2) {
            color = requireContext.getColor(R.color.badge_color);
            string = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), charSequence, 2131973013);
        } else {
            color = requireContext.getColor(R.color.grey_5);
            string = requireContext().getString(2131973064);
        }
        C67916V2g c67916V2g = this.A00;
        if (c67916V2g == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        c67916V2g.A02 = true;
        c67916V2g.A09.A00 = z;
        C31699Dw4 c31699Dw4 = c67916V2g.A08;
        c31699Dw4.A01 = string;
        c31699Dw4.A00 = color;
        c67916V2g.A0C();
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return (AbstractC12990ll) this.A09.getValue();
    }

    @Override // X.XDv
    public final void CMc() {
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.A04();
        }
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ boolean Cdt() {
        return false;
    }

    @Override // X.XDv
    public final void Chg() {
        String str;
        int length;
        if (this.A06 && !this.A04) {
            C65974TxR c65974TxR = this.A07;
            if (c65974TxR != null) {
                if (!c65974TxR.A04() && (str = this.A03) != null && (length = str.length()) != 0 && length > 1) {
                    this.A05 = false;
                    C65974TxR c65974TxR2 = this.A07;
                    if (c65974TxR2 != null) {
                        c65974TxR2.A03(str);
                        A01(null, true);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("queuedTypeaheadManager");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        C68085V9q c68085V9q = (C68085V9q) interfaceC40821up;
        boolean A1R = AbstractC167007dF.A1R(0, str, c68085V9q);
        if (str.equals(this.A03)) {
            String str2 = c68085V9q.A03;
            boolean z = true;
            if (str2 == null || str2.length() == 0) {
                C0w9.A03("UserSearchResponse", "Invalid UserSearchResponse format, missing rankToken");
            }
            List list = c68085V9q.A00;
            C14360o3.A07(list);
            this.A04 = false;
            C67916V2g c67916V2g = this.A00;
            if (c67916V2g != null) {
                c67916V2g.A01 = A1R;
                c67916V2g.A05.A00(list);
                c67916V2g.A0C();
                if (this.A05) {
                    AbstractC05560Rg.A00(this);
                    ((AbstractC05560Rg) this).A04.setSelection(0);
                }
                if (!c68085V9q.A04 || !(!list.isEmpty())) {
                    z = false;
                }
                this.A06 = z;
                C67916V2g c67916V2g2 = this.A00;
                if (c67916V2g2 != null) {
                    c67916V2g2.A02 = false;
                    c67916V2g2.A0C();
                    return;
                }
            }
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XDv
    public final void El2() {
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.A06();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0A;
    }

    @Override // X.InterfaceC169477hN
    public final /* synthetic */ C24531Hw AN8(UQE uqe, String str) {
        return null;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131953909));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2086743470);
        super.onCreate(bundle);
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList(AbstractC111324zv.A00(1512));
        this.A08 = new C169487hO();
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A09;
        UserSession userSession = (UserSession) interfaceC09390do.getValue();
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList();
        }
        InterfaceC169497hP interfaceC169497hP = this.A08;
        if (interfaceC169497hP != null) {
            this.A00 = new C67916V2g(requireContext, this, this, userSession, interfaceC169497hP, parcelableArrayList);
            UserSession userSession2 = (UserSession) interfaceC09390do.getValue();
            InterfaceC169497hP interfaceC169497hP2 = this.A08;
            if (interfaceC169497hP2 != null) {
                this.A07 = AbstractC65980TxZ.A00(userSession2, this, null, this, interfaceC169497hP2, C05F.A00, 0L, 200L, false, false);
                C0f9.A09(-580102799, A02);
                return;
            }
        }
        C14360o3.A0F("cache");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(342001797);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_block_commenter, viewGroup, false);
        C0f9.A09(-259829280, A02);
        return inflate;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        int A02 = C0f9.A02(-1451009623);
        SF3 sf3 = this.A01;
        if (sf3 != null) {
            C67916V2g c67916V2g = this.A00;
            str = "adapter";
            if (c67916V2g != null) {
                java.util.Set unmodifiableSet = Collections.unmodifiableSet(c67916V2g.A0C);
                C14360o3.A07(unmodifiableSet);
                C67916V2g c67916V2g2 = this.A00;
                if (c67916V2g2 != null) {
                    java.util.Set unmodifiableSet2 = Collections.unmodifiableSet(c67916V2g2.A0D);
                    C14360o3.A07(unmodifiableSet2);
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    if ((!unmodifiableSet.isEmpty()) || (!unmodifiableSet2.isEmpty())) {
                        writableNativeMap.putArray("newlyBlockedUserDicts", C69926Vxr.A00(unmodifiableSet));
                        writableNativeMap.putArray("newlyUnblockedUserDicts", C69926Vxr.A00(unmodifiableSet2));
                    }
                    sf3.A00.invoke(writableNativeMap);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C65974TxR c65974TxR = this.A07;
        if (c65974TxR == null) {
            str = "queuedTypeaheadManager";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c65974TxR.onDestroy();
        super.onDestroy();
        C0f9.A09(738568909, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1605917648);
        SearchEditText searchEditText = this.A02;
        if (searchEditText != null) {
            searchEditText.A04();
        }
        SearchEditText searchEditText2 = this.A02;
        if (searchEditText2 != null) {
            searchEditText2.A0C = null;
        }
        this.A02 = null;
        super.onDestroyView();
        C0f9.A09(-1621359800, A02);
    }
}
