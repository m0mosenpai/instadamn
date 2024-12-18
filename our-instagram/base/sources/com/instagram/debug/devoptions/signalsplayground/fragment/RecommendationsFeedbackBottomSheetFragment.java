package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC55110ObT;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C0f9;
import X.C14360o3;
import X.C51D;
import X.EnumC27385C6o;
import X.InterfaceC09390do;
import X.InterfaceC56392iX;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.form.IgFormField;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class RecommendationsFeedbackBottomSheetFragment extends AbstractC59962oe implements C51D {
    public static final int $stable = 8;
    public static final Companion Companion = new Object();
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String moduleName = "recommendations_feedback_bottom_sheet";

    /* loaded from: classes6.dex */
    public final class Companion {
        public final RecommendationsFeedbackBottomSheetFragment newInstance() {
            return new RecommendationsFeedbackBottomSheetFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ boolean collapseToPartialStateOnClickXButton() {
        return false;
    }

    @Override // X.C51D
    public /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public /* synthetic */ void onDragStarted() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        final IgFormField igFormField = (IgFormField) AbstractC166987dD.A0c(view, R.id.feedback_form);
        igFormField.setInputType(131073);
        AbstractC55110ObT.A00(igFormField);
        final IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166987dD.A0c(view, R.id.submit_feedback_cta);
        igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        igdsBottomButtonLayout.setPrimaryActionOnClickListener(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsFeedbackBottomSheetFragment$onViewCreated$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(-1604352072);
                IgFormField.this.getText().toString();
                Fragment requireParentFragment = this.requireParentFragment();
                C14360o3.A0C(requireParentFragment, AbstractC111324zv.A00(1142));
                AbstractC167007dF.A16(((BottomSheetFragment) requireParentFragment).A02);
                C0f9.A0C(-450172426, A05);
            }
        });
        igFormField.A0H(new TextWatcher() { // from class: com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsFeedbackBottomSheetFragment$onViewCreated$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                C14360o3.A0B(editable, 0);
                IgdsBottomButtonLayout.this.setPrimaryButtonEnabled(AbstractC167007dF.A1O(editable.length()));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    @Override // X.C51D
    public /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    @Override // X.C51D
    public /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // X.C51E
    public /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1098530077);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_inspiration_signals_playground_recommendations_feedback_bottom_sheet, false);
        C0f9.A09(-796734110, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
