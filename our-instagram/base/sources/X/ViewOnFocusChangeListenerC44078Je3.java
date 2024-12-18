package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Je3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnFocusChangeListenerC44078Je3 extends C3PD implements View.OnFocusChangeListener, C88U {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final InterfaceC50496MQz A03;
    public final SearchEditText A04;
    public final UserSession A05;
    public final MOQ A06;
    public final AnimatedHintsTextLayout A07;

    public ViewOnFocusChangeListenerC44078Je3(View view, UserSession userSession, InterfaceC50496MQz interfaceC50496MQz, MOQ moq) {
        View requireViewById;
        View A0U;
        AbstractC167017dG.A1R(userSession, view);
        this.A05 = userSession;
        this.A02 = view;
        this.A06 = moq;
        this.A00 = true;
        Context context = view.getContext();
        AnimatedHintsTextLayout animatedHintsTextLayout = null;
        if (A00() && (A0U = AbstractC167017dG.A0U(view, R.id.row_search_with_hints_stub)) != null && (A0U instanceof AnimatedHintsTextLayout)) {
            animatedHintsTextLayout = (AnimatedHintsTextLayout) A0U;
        }
        this.A07 = animatedHintsTextLayout;
        view.requireViewById(R.id.row_search_edit_text).setVisibility(AbstractC31175DnJ.A01(A00() ? 1 : 0));
        if (A00()) {
            requireViewById = view.requireViewById(R.id.row_search_hints_edit_text);
        } else {
            requireViewById = view.requireViewById(R.id.row_search_edit_text);
        }
        C14360o3.A07(requireViewById);
        SearchEditText searchEditText = (SearchEditText) requireViewById;
        this.A04 = searchEditText;
        View requireViewById2 = view.requireViewById(R.id.back_button_ui_refresh_v2);
        this.A01 = requireViewById2;
        searchEditText.A0B = new C49664Lwv(this, 0);
        AbstractC13880nE.A0U(view, AbstractC167017dG.A03(context) - context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin));
        int A09 = AbstractC167007dF.A09(context, R.attr.assetSearchIconColor);
        searchEditText.setClearButtonEnabled(true);
        searchEditText.setClearButtonColorFilter(C3DY.A00(A09));
        searchEditText.setSearchIconEnabled(true);
        searchEditText.setCompoundDrawableTintList(ColorStateList.valueOf(A09));
        C3P9 A0s = AbstractC166987dD.A0s(requireViewById2);
        A0s.A04 = this;
        A0s.A07 = true;
        A0s.A0D = true;
        A0s.A00();
        view.setVisibility(0);
        this.A03 = interfaceC50496MQz;
        searchEditText.setAllowTextSelection(true);
        searchEditText.A0C = this;
        searchEditText.setOnFocusChangeListener(this);
        A04();
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C14360o3.A0B(view, 0);
        if (view == this.A01) {
            A01();
            return true;
        }
        return false;
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C14360o3.A0B(str, 1);
        this.A03.CxR(str);
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 1);
        this.A03.CxQ(charSequence.toString());
    }

    private final boolean A00() {
        if (C18U.A06(C06090Tz.A05, this.A05, 36323904221884083L)) {
            Integer Acu = this.A06.Acu();
            if (Acu == C05F.A00 || Acu == C05F.A0Y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A02() {
        SearchEditText searchEditText = this.A04;
        if (searchEditText.isFocused()) {
            searchEditText.clearFocus();
            AbstractC13880nE.A0O(searchEditText);
        }
    }

    public final void A03() {
        SearchEditText searchEditText = this.A04;
        searchEditText.A05();
        searchEditText.A06();
        A04();
        AbstractC31171DnF.A14(searchEditText);
    }

    public final void A04() {
        SearchEditText searchEditText;
        int i;
        AnimatedHintsTextLayout animatedHintsTextLayout;
        String[] strArr;
        String str;
        int intValue = this.A06.Acu().intValue();
        if (intValue != 0) {
            if (intValue != 4) {
                if (intValue != 2) {
                    if (intValue == 8) {
                        searchEditText = this.A04;
                        i = 2131953522;
                    }
                } else {
                    searchEditText = this.A04;
                    i = 2131973014;
                }
                searchEditText.setHint(i);
            }
            if (A00()) {
                animatedHintsTextLayout = this.A07;
                if (animatedHintsTextLayout == null) {
                    return;
                }
                strArr = new String[3];
                strArr[0] = "sticker one";
                strArr[1] = "sticker two";
                str = "sticker three";
                strArr[2] = str;
                animatedHintsTextLayout.setHints(AbstractC16960so.A1Q(strArr));
                return;
            }
            searchEditText = this.A04;
            i = 2131972993;
            searchEditText.setHint(i);
        }
        if (A00()) {
            animatedHintsTextLayout = this.A07;
            if (animatedHintsTextLayout == null) {
                return;
            }
            strArr = new String[3];
            strArr[0] = "music one";
            strArr[1] = "music two";
            str = "music three";
            strArr[2] = str;
            animatedHintsTextLayout.setHints(AbstractC16960so.A1Q(strArr));
            return;
        }
        searchEditText = this.A04;
        i = 2131973027;
        searchEditText.setHint(i);
    }

    public final void A05(boolean z) {
        C66023TyL c66023TyL;
        View view = this.A02;
        if (view instanceof ViewGroup) {
            if (z) {
                c66023TyL = null;
            } else {
                c66023TyL = new C66023TyL();
            }
            AbstractC66022TyK.A02((ViewGroup) view, c66023TyL);
        }
        this.A01.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r6.A04.getVisibility() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(boolean r7, boolean r8) {
        /*
            r6 = this;
            android.view.View r5 = r6.A02
            int r0 = r5.getVisibility()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L13
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A04
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L14
        L13:
            r2 = 0
        L14:
            if (r8 == 0) goto L25
            if (r2 != 0) goto L25
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            if (r7 == 0) goto L33
            r1 = 0
        L1f:
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.AbstractC66022TyK.A02(r0, r1)
        L25:
            if (r7 == 0) goto L39
            if (r2 != 0) goto L32
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A04
            android.view.View[] r0 = new android.view.View[]{r5, r0}
            X.AbstractC125325le.A07(r0, r4)
        L32:
            return
        L33:
            X.TyL r1 = new X.TyL
            r1.<init>()
            goto L1f
        L39:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A04
            android.view.View[] r0 = new android.view.View[]{r5, r0}
            X.AbstractC125325le.A05(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC44078Je3.A06(boolean, boolean):void");
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchEditText searchEditText = this.A04;
        searchEditText.setSearchIconEnabled(!z);
        if (z) {
            this.A03.CxP();
            if (this.A00) {
                A05(true);
                return;
            }
            return;
        }
        AbstractC13880nE.A0O(searchEditText);
        String A0g = AbstractC167007dF.A0g(searchEditText);
        if ((A0g != null && A0g.length() != 0) || !this.A03.EiJ()) {
            return;
        }
        A01();
    }

    public final void A01() {
        A02();
        if (this.A00) {
            A05(false);
        }
        this.A03.CxO();
        A04();
        AbstractC31171DnF.A14(this.A04);
    }
}
