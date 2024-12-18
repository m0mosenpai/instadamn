package X;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;
import com.instagram.ui.widget.typeaheadpill.TypeaheadPill;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.G6x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36473G6x implements InterfaceC37232Gah {
    public DirectShareTarget A00;
    public int A01;
    public final Handler A02;
    public final View A03;
    public final ViewGroup A04;
    public final HorizontalScrollView A05;
    public final ViewOnFocusChangeListenerC35694FpU A06;
    public final SearchWithDeleteEditText A07;
    public final List A08;
    public final java.util.Set A09;
    public final boolean A0A;
    public final int A0B;
    public final View.OnClickListener A0C;
    public final UserSession A0D;
    public final GYV A0E;
    public final TypeaheadPill A0F;
    public final Runnable A0G;

    public C36473G6x(ViewGroup viewGroup, ViewOnFocusChangeListenerC35694FpU viewOnFocusChangeListenerC35694FpU, UserSession userSession, boolean z, boolean z2) {
        int A06 = AbstractC167007dF.A06(1, userSession, viewOnFocusChangeListenerC35694FpU);
        C14360o3.A0B(viewGroup, 7);
        this.A0D = userSession;
        this.A06 = viewOnFocusChangeListenerC35694FpU;
        this.A0A = z;
        ViewGroup A0C = AbstractC31176DnK.A0C(viewGroup, R.id.recipients_container);
        this.A04 = A0C;
        TypeaheadPill typeaheadPill = (TypeaheadPill) AbstractC166997dE.A0R(viewGroup, R.id.recipient_picker_typeahead_pill);
        this.A0F = typeaheadPill;
        SearchWithDeleteEditText searchWithDeleteEditText = typeaheadPill.A04;
        this.A07 = searchWithDeleteEditText;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) AbstractC166997dE.A0R(viewGroup, R.id.recipients_scroll_container);
        this.A05 = horizontalScrollView;
        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.search_tap_padding);
        this.A03 = A0S;
        this.A01 = -1;
        this.A08 = AbstractC166987dD.A1E();
        this.A02 = new HandlerC31740Dwt(this, A06);
        this.A09 = AbstractC31171DnF.A0l();
        this.A0E = new GI4(this);
        this.A0C = new ViewOnClickListenerC35666Fp0(this, 57);
        this.A0G = new GLV(this);
        this.A0B = AbstractC31171DnF.A02(AbstractC25228BEl.A0M(searchWithDeleteEditText), R.dimen.abc_action_bar_elevation_material);
        if (!z2) {
            AbstractC31176DnK.A1D(viewGroup, R.id.direct_share_search_bar_label);
        }
        ViewOnClickListenerC35666Fp0.A00(A0C, 55, this);
        typeaheadPill.A00 = new GI9(this);
        typeaheadPill.setVisibility(0);
        horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        horizontalScrollView.setFadingEdgeLength(30);
        searchWithDeleteEditText.A0D = new C36752GHz(this);
        ViewOnFocusChangeListenerC35694FpU.A00(searchWithDeleteEditText, 7, this);
        searchWithDeleteEditText.A00 = new GI0(this);
        searchWithDeleteEditText.setOnFocusChangeListener(viewOnFocusChangeListenerC35694FpU);
        searchWithDeleteEditText.addTextChangedListener(C106904rr.A00(userSession));
        ViewOnClickListenerC35666Fp0.A00(A0S, 56, this);
        if (z) {
            Context context = typeaheadPill.getContext();
            int A04 = AbstractC166997dE.A04(context, R.dimen.abc_action_bar_elevation_material);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness);
            TextView textView = typeaheadPill.A03;
            textView.setPadding(textView.getPaddingLeft(), A04, textView.getPaddingRight(), dimensionPixelSize);
            textView.setHeight(context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin));
            AbstractC31177DnL.A0x(searchWithDeleteEditText, searchWithDeleteEditText.getPaddingLeft(), AbstractC167017dG.A05(context));
        }
        A00(this);
    }

    @Override // X.InterfaceC37232Gah
    public final void Efx(int i) {
        this.A01 = 0;
    }

    @Override // X.InterfaceC37232Gah
    public final void FCP(String str, List list, boolean z, boolean z2) {
        C31782Dy1 c31782Dy1;
        String A03;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        List list2 = this.A08;
        list2.clear();
        list2.addAll(list);
        ViewGroup viewGroup = this.A04;
        int childCount = viewGroup.getChildCount();
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        Context context = searchWithDeleteEditText.getContext();
        viewGroup.removeViews(0, viewGroup.getChildCount() - 2);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            DirectShareTarget directShareTarget = (DirectShareTarget) obj;
            boolean z3 = this.A0A;
            if (z3) {
                C14360o3.A0A(context);
                c31782Dy1 = new C31782Dy1(context, R.attr.TokenTextViewPillStyleRedesign);
                c31782Dy1.A02 = false;
            } else {
                C14360o3.A0A(context);
                c31782Dy1 = new C31782Dy1(context);
            }
            int i3 = this.A01;
            if (i3 != -1) {
                c31782Dy1.setBackgroundResource(i3);
            }
            c31782Dy1.setGravity(17);
            if (this.A09.contains(directShareTarget.A09())) {
                A03 = directShareTarget.A0J;
                if (A03 == null) {
                    A03 = "";
                }
            } else {
                A03 = AbstractC101904i3.A03(directShareTarget, C17060sy.A01.A01(this.A0D));
            }
            c31782Dy1.setText(A03);
            c31782Dy1.A00 = this.A0E;
            c31782Dy1.setOnFocusChangeListener(this.A06);
            C0fQ.A00(this.A0C, c31782Dy1);
            c31782Dy1.setTag(directShareTarget);
            viewGroup.addView(c31782Dy1, i);
            ViewGroup.LayoutParams layoutParams = c31782Dy1.getLayoutParams();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(this.A0B);
            }
            if (!z3) {
                c31782Dy1.setPaddingRelative((int) AbstractC31173DnH.A00(context, R.dimen.account_discovery_bottom_gap), AbstractC31171DnF.A02(context.getResources(), R.dimen.album_music_sticker_text_vertical_padding), (int) AbstractC31173DnH.A00(context, R.dimen.account_discovery_bottom_gap), AbstractC31171DnF.A02(context.getResources(), R.dimen.account_discovery_bottom_gap));
            }
            i = i2;
        }
        if (z) {
            AI3();
        }
        if (AbstractC166987dD.A1b(list2)) {
            searchWithDeleteEditText.setHint("");
        } else {
            searchWithDeleteEditText.setHint(2131960407);
        }
        A00(this);
        if (viewGroup.getChildCount() > childCount) {
            this.A02.post(this.A0G);
        }
    }

    public static final void A00(C36473G6x c36473G6x) {
        if (AbstractC166987dD.A1b(c36473G6x.A08)) {
            SearchWithDeleteEditText searchWithDeleteEditText = c36473G6x.A07;
            if (!searchWithDeleteEditText.hasFocus()) {
                Editable text = searchWithDeleteEditText.getText();
                C14360o3.A07(text);
                if (text.length() == 0) {
                    c36473G6x.A03.setVisibility(0);
                    searchWithDeleteEditText.setVisibility(8);
                    return;
                }
            }
        }
        A01(c36473G6x);
    }

    public static final void A01(C36473G6x c36473G6x) {
        c36473G6x.A03.setVisibility(8);
        c36473G6x.A07.setVisibility(0);
    }

    @Override // X.InterfaceC37232Gah
    public final void AHQ() {
        this.A02.removeCallbacksAndMessages(null);
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        searchWithDeleteEditText.setOnFocusChangeListener(null);
        searchWithDeleteEditText.A00 = null;
        searchWithDeleteEditText.removeTextChangedListener(C106904rr.A00(this.A0D));
    }

    @Override // X.InterfaceC37232Gah
    public final boolean AHn() {
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        if (searchWithDeleteEditText.hasFocus()) {
            searchWithDeleteEditText.clearFocus();
            this.A02.sendEmptyMessageDelayed(1, 20L);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37232Gah
    public final void AI3() {
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        searchWithDeleteEditText.setTag("");
        searchWithDeleteEditText.setText("");
        searchWithDeleteEditText.setTag(null);
    }

    @Override // X.InterfaceC37232Gah
    public final String BrI() {
        return AbstractC167007dF.A0g(this.A07);
    }

    @Override // X.InterfaceC37232Gah
    public final boolean CKx() {
        return this.A07.hasFocus();
    }

    @Override // X.InterfaceC37232Gah
    public final void CMc() {
        AbstractC13880nE.A0O(this.A07);
    }

    @Override // X.InterfaceC37232Gah
    public final void E0x() {
        C31703Dw8.A00(this.A07, this, 4);
    }

    @Override // X.InterfaceC37232Gah
    public final void EJ5() {
        this.A07.requestFocus();
    }

    @Override // X.InterfaceC37232Gah
    public final void EK2() {
        TypeaheadPill typeaheadPill = this.A0F;
        if (typeaheadPill != null) {
            typeaheadPill.A01();
            this.A00 = null;
            ((C35151Fet) this.A06.A01).A05.DdN(null);
        }
    }

    @Override // X.InterfaceC37232Gah
    public final void EdJ(String str) {
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        searchWithDeleteEditText.setText(str);
        Pattern pattern = AbstractC13670mt.A01;
        searchWithDeleteEditText.setSelection(str.length());
        A01(this);
    }

    @Override // X.InterfaceC37232Gah
    public final void El3() {
        AbstractC13880nE.A0T(this.A07);
    }

    @Override // X.InterfaceC37232Gah
    public final void FCm(DirectShareTarget directShareTarget) {
        String A0A;
        TypeaheadPill typeaheadPill = this.A0F;
        if (directShareTarget.A0S()) {
            A0A = AbstractC31173DnH.A0n(this.A0D, C17060sy.A01);
        } else {
            A0A = directShareTarget.A0A();
        }
        if (!typeaheadPill.A02(A0A)) {
            String str = directShareTarget.A0J;
            if (str == null) {
                str = "";
            }
            if (!typeaheadPill.A02(str)) {
                EK2();
                return;
            }
        }
        this.A00 = directShareTarget;
        ((C35151Fet) this.A06.A01).A05.DdN(directShareTarget);
        this.A02.post(this.A0G);
        this.A07.requestFocus();
    }

    @Override // X.InterfaceC37232Gah
    public final void DyP(List list) {
        DirectShareTarget directShareTarget = (DirectShareTarget) AbstractC001800i.A0J(list);
        if (directShareTarget != null && !this.A08.contains(directShareTarget)) {
            FCm(directShareTarget);
        } else {
            EK2();
        }
    }
}
