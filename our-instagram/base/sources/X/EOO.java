package X;

import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EOO extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC60122ou, InterfaceC60152ox {
    public static final String __redex_internal_original_name = "PartialContactImportSelectionFragment";
    public int A00;
    public IgLinearLayout A01;
    public C147036jf A02;
    public C31823Dyh A03;
    public InterfaceC37264GbH A04;
    public GFV A05;
    public ProgressButton A06;
    public SearchEditText A07;
    public SpinnerImageView A08;
    public String A09;
    public Map A0A;
    public C3I9 A0B;
    public final ArrayList A0C;
    public final HashSet A0D;
    public final InterfaceC09390do A0E;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131969326);
        if (C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(this.A0E), 2342165281348200550L)) {
            ((C56352iT) interfaceC56362iU).Ehb(ViewOnClickListenerC35679FpE.A00(this, 40), null, null, 2131974116);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "partial_ci_selection";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String A19;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList arrayList = this.A0C;
        arrayList.add(new C36181Fxv(new FF4(this)));
        InterfaceC09390do interfaceC09390do = this.A0E;
        LinkedHashMap A02 = AbstractC35171FfO.A02(requireContext(), new C35233FgQ(this, this, AbstractC166987dD.A0r(interfaceC09390do), null, null).A02, false, false);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A14 = AbstractC166997dE.A14(A02);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (!((FNN) A1K.getValue()).A04.isEmpty() && (str2 = ((FNN) A1K.getValue()).A00) != null && str2.length() != 0) {
                AbstractC31177DnL.A1S(A1K, A1I);
            }
        }
        this.A0A = A1I;
        Character ch = null;
        for (FNN fnn : AbstractC001800i.A0g(A1I.values(), new C31460Ds4((InterfaceC16620sF) GWJ.A00, 2))) {
            String str3 = fnn.A00;
            if (str3 != null && str3.length() != 0) {
                List list = fnn.A04;
                ArrayList A10 = AbstractC31174DnI.A10(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A10.add(PhoneNumberUtils.formatNumber(AbstractC166987dD.A1B(it), C1Q2.A02().getCountry()));
                }
                List list2 = fnn.A03;
                if (list2.size() > 0) {
                    StringBuilder A0y = AbstractC31174DnI.A0y(A10);
                    A0y.append('\n');
                    A19 = AbstractC166997dE.A0v(list2, A0y);
                } else {
                    A19 = AbstractC166987dD.A19(A10);
                }
                C32082E8g c32082E8g = new C32082E8g(new FIM(fnn, this), str3, AbstractC002300n.A0d(AbstractC002300n.A0d(A19, "[", "", false), "]", "", false));
                char upperCase = (char) Character.toUpperCase(str3.codePointAt(0));
                if (ch == null || upperCase != ch.charValue()) {
                    arrayList.add(new E8T(upperCase));
                    ch = Character.valueOf(upperCase);
                }
                arrayList.add(c32082E8g);
            }
        }
        getRecyclerView().setItemAnimator(null);
        E0L.A00(getRecyclerView(), this, 3);
        this.A01 = (IgLinearLayout) view.requireViewById(R.id.footer_container);
        this.A08 = AbstractC31180DnO.A0V(view);
        A0B(arrayList);
        ProgressButton progressButton = (ProgressButton) view.requireViewById(R.id.sync_contacts_button);
        this.A06 = progressButton;
        if (progressButton != null) {
            progressButton.setEnabled(false);
        }
        ProgressButton progressButton2 = this.A06;
        if (progressButton2 != null) {
            progressButton2.setText(AbstractC166997dE.A0N(this).getString(2131969327));
        }
        boolean A06 = C18U.A06(C06090Tz.A06, AbstractC166987dD.A0o(interfaceC09390do), 2342165281348200550L);
        String str4 = this.A09;
        if (A06) {
            str = "skip_on_top";
        } else {
            str = "skip_on_botttom";
        }
        String A0T = AnonymousClass001.A0T(str4, str, '_');
        ProgressButton progressButton3 = this.A06;
        if (progressButton3 != null) {
            C0fQ.A00(new ViewOnClickListenerC35671Fp6(A0T, this, 3), progressButton3);
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.skip_button);
        if (A06) {
            A0S.setVisibility(8);
        } else {
            C0fQ.A00(new ViewOnClickListenerC35671Fp6(A0T, this, 4), A0S);
        }
        SearchEditText searchEditText = (SearchEditText) AbstractC166997dE.A0S(view, R.id.partial_ci_search_bar).requireViewById(R.id.action_bar_search_edit_text);
        this.A07 = searchEditText;
        String str5 = "searchEditText";
        if (searchEditText != null) {
            ViewOnFocusChangeListenerC35694FpU.A00(searchEditText, 3, this);
            GFV gfv = this.A05;
            if (gfv == null) {
                str5 = "searchBarController";
            } else {
                SearchEditText searchEditText2 = this.A07;
                if (searchEditText2 != null) {
                    gfv.A00(searchEditText2, true);
                    return;
                }
            }
        }
        C14360o3.A0F(str5);
        throw C00O.createAndThrow();
    }

    public static final void A00(EOO eoo) {
        if (eoo.A00 >= 3) {
            ProgressButton progressButton = eoo.A06;
            if (progressButton != null) {
                progressButton.setText(AbstractC166997dE.A0r(AbstractC166997dE.A0N(eoo), Integer.valueOf(eoo.A00), 2131969328));
            }
            ProgressButton progressButton2 = eoo.A06;
            if (progressButton2 != null) {
                progressButton2.setEnabled(true);
                return;
            }
            return;
        }
        ProgressButton progressButton3 = eoo.A06;
        if (progressButton3 != null) {
            progressButton3.setEnabled(false);
        }
        ProgressButton progressButton4 = eoo.A06;
        if (progressButton4 == null) {
            return;
        }
        progressButton4.setText(AbstractC166997dE.A0N(eoo).getString(2131969327));
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (i == 0) {
            AbstractC167007dF.A0w(this.A01);
            SearchEditText searchEditText = this.A07;
            if (searchEditText == null) {
                C14360o3.A0F("searchEditText");
                throw C00O.createAndThrow();
            }
            searchEditText.clearFocus();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new Object(), new Object(), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(GVL.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        SearchEditText searchEditText = this.A07;
        if (searchEditText != null) {
            if (!searchEditText.hasFocus()) {
                SearchEditText searchEditText2 = this.A07;
                if (searchEditText2 != null) {
                    Editable text = searchEditText2.getText();
                    if (text != null && text.length() != 0) {
                        SearchEditText searchEditText3 = this.A07;
                        if (searchEditText3 != null) {
                            searchEditText3.setText((CharSequence) null);
                        }
                    }
                }
            }
            return true;
        }
        C14360o3.A0F("searchEditText");
        throw C00O.createAndThrow();
    }

    public EOO() {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        this.A0A = c16920sk;
        this.A0C = AbstractC166987dD.A1E();
        this.A0D = AbstractC166987dD.A1H();
        this.A0E = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(835451291);
        super.onCreate(bundle);
        this.A09 = requireArguments().getString("partial_ci_variant", null);
        this.A04 = AbstractC34275F9v.A00(this);
        this.A05 = new GFV(new GFT(this, 0), 2131972993);
        this.A02 = new C147036jf(this, AbstractC166987dD.A0r(this.A0E));
        C3I8 A01 = C3I7.A01(this, false, true);
        this.A0B = A01;
        A01.A9e(this);
        this.A03 = (C31823Dyh) AbstractC31175DnJ.A0A(this).A00(C31823Dyh.class);
        C0f9.A09(404327244, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2092148689);
        this.A06 = null;
        this.A01 = null;
        this.A08 = null;
        C3I9 c3i9 = this.A0B;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this);
        super.onDestroyView();
        C0f9.A09(-1934523567, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1159256494);
        super.onStart();
        C3I9 c3i9 = this.A0B;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.Dnr(requireActivity());
        C0f9.A09(1820578926, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-659976449);
        super.onStop();
        C3I9 c3i9 = this.A0B;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.onStop();
        C0f9.A09(217628435, A02);
    }
}
