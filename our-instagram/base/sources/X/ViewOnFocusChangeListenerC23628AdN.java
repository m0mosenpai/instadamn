package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.AdN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23628AdN implements InterfaceC60072op, TextWatcher, View.OnFocusChangeListener, InterfaceC185958Mp, InterfaceC60152ox, TextView.OnEditorActionListener, C8BD {
    public ConstrainedEditText A00;
    public int A01;
    public IgTextView A02;
    public final Context A03;
    public final View A04;
    public final C8D9 A05;
    public final ViewOnTouchListenerC1829889t A06;
    public final InterfaceC143326dX A07;
    public final C1810281e A08;
    public final EyedropperColorPickerTool A09;
    public final View A0A;
    public final UserSession A0B;
    public final C3I9 A0C;
    public final A5D A0D;

    public ViewOnFocusChangeListenerC23628AdN(View view, UserSession userSession, C3I9 c3i9, A5D a5d, C8D9 c8d9, ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t, InterfaceC143326dX interfaceC143326dX, C1810281e c1810281e) {
        AbstractC167027dH.A0a(1, view, userSession, c8d9, viewOnTouchListenerC1829889t);
        AbstractC167007dF.A1I(c1810281e, 6, c3i9);
        this.A0B = userSession;
        this.A05 = c8d9;
        this.A06 = viewOnTouchListenerC1829889t;
        this.A0D = a5d;
        this.A08 = c1810281e;
        this.A07 = interfaceC143326dX;
        this.A0C = c3i9;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A03 = A0L;
        boolean A1Z = AbstractC166997dE.A1Z(AbstractC166997dE.A0Y(userSession).A0J(), true);
        View A0U = AbstractC167017dG.A0U(view, R.id.hall_pass_creation_stub);
        C14360o3.A07(A0U);
        this.A04 = A0U;
        this.A09 = (EyedropperColorPickerTool) AbstractC166997dE.A0R(view, R.id.eyedropper_color_picker_tool);
        View requireViewById = A0U.requireViewById(R.id.hall_pass_next_button);
        C14360o3.A0A(requireViewById);
        C3P9 A0s = AbstractC166987dD.A0s(requireViewById);
        A0s.A06 = false;
        C216559iC.A02(A0s, this, 11);
        requireViewById.setEnabled(false);
        AJq.A01(requireViewById, false);
        this.A0A = requireViewById;
        View requireViewById2 = A0U.requireViewById(R.id.hall_pass_composer);
        ConstrainedEditText constrainedEditText = (ConstrainedEditText) requireViewById2;
        constrainedEditText.setHint(constrainedEditText.getContext().getString(2131963416));
        constrainedEditText.addTextChangedListener(this);
        constrainedEditText.addTextChangedListener(new C221519qG(constrainedEditText));
        constrainedEditText.setOnFocusChangeListener(this);
        constrainedEditText.setOnEditorActionListener(this);
        C14360o3.A07(requireViewById2);
        this.A00 = constrainedEditText;
        View requireViewById3 = A0U.requireViewById(R.id.hall_pass_subtitle);
        IgTextView igTextView = (IgTextView) requireViewById3;
        igTextView.setText(A1Z ? 2131963434 : 2131963442);
        C14360o3.A07(requireViewById3);
        this.A02 = igTextView;
        this.A01 = A0L.getColor(R.color.igds_gradient_lavender);
        C3P9 A0s2 = AbstractC166987dD.A0s(AbstractC166997dE.A0S(A0U, R.id.hall_pass_cancel_button));
        A0s2.A06 = false;
        C216559iC.A02(A0s2, this, 12);
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C14360o3.A0B(editable, 0);
        View view = this.A0A;
        boolean A1O = AbstractC167007dF.A1O(editable.length());
        view.setEnabled(A1O);
        AJq.A01(view, A1O);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            A00(this);
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C14360o3.A0B(view, 0);
        C3I9 c3i9 = this.A0C;
        if (z) {
            c3i9.A9e(this);
            AbstractC13880nE.A0R(view);
        } else {
            c3i9.EFx(this);
            AbstractC13880nE.A0O(view);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(ViewOnFocusChangeListenerC23628AdN viewOnFocusChangeListenerC23628AdN) {
        AnonymousClass229.A01(viewOnFocusChangeListenerC23628AdN.A0B).A1j(null, "SHARED_LISTS_NEXT_BUTTON", null);
        A5D a5d = viewOnFocusChangeListenerC23628AdN.A0D;
        String obj = AbstractC001900j.A0B(AbstractC167007dF.A0g(viewOnFocusChangeListenerC23628AdN.A00)).toString();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("#%06X", Integer.valueOf(viewOnFocusChangeListenerC23628AdN.A01 & 16777215));
        C14360o3.A07(formatStrLocaleSafe);
        C8Y8 c8y8 = (C8Y8) a5d.A00.A1z.get();
        if (c8y8 != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString(AbstractC111324zv.A00(424), obj);
            A0b.putString(AbstractC111324zv.A00(2431), formatStrLocaleSafe);
            A0b.putString(AbstractC111324zv.A00(4526), "CREATION");
            UserSession userSession = c8y8.A05;
            AbstractC59962oe abstractC59962oe = c8y8.A02;
            AbstractC167017dG.A1N(userSession, abstractC59962oe);
            C6XJ c6xj = new C6XJ(abstractC59962oe.getRootActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(967));
            c6xj.A07();
            c6xj.A0D(abstractC59962oe, 9414);
        }
    }

    public static final void A01(ViewOnFocusChangeListenerC23628AdN viewOnFocusChangeListenerC23628AdN) {
        AbstractC125325le.A04(null, new View[]{viewOnFocusChangeListenerC23628AdN.A04, viewOnFocusChangeListenerC23628AdN.A09}, false);
        viewOnFocusChangeListenerC23628AdN.A05.A03(true, false);
        viewOnFocusChangeListenerC23628AdN.A00.requestFocus();
    }

    public final void A02(int i) {
        this.A01 = i;
        int A04 = AbstractC13950nL.A04(i);
        ConstrainedEditText constrainedEditText = this.A00;
        constrainedEditText.setTextColor(A04);
        constrainedEditText.setHintTextColor(AbstractC13950nL.A07(A04, 0.7f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AbstractC167017dG.A06(this.A03));
        gradientDrawable.setColor(this.A01);
        constrainedEditText.setBackground(gradientDrawable);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFL() {
        AbstractC166997dE.A1J(this.A04, this.A09, false);
        this.A05.A02(false);
        this.A00.clearFocus();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int i2;
        ConstrainedEditText constrainedEditText = this.A00;
        constrainedEditText.DOK(i, z);
        this.A02.setY(constrainedEditText.getY() + AbstractC166987dD.A08(constrainedEditText) + this.A03.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        int i3 = 0;
        if (i > 0) {
            i2 = C1812982h.A00;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = (-i) + i2;
        }
        C8D9 c8d9 = this.A05;
        float f = i3;
        c8d9.A00.setTranslationY(f);
        c8d9.A02.setTranslationY(f);
        this.A09.setTranslationY(f);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        this.A08.A04(C8UR.A00);
        return true;
    }

    @Override // X.InterfaceC185958Mp
    public final void DFI() {
        A01(this);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        A02(i);
        A01(this);
    }
}
