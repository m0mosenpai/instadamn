package com.instagram.igtv.widget;

import X.AbstractC018607g;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC50524MSc;
import X.AbstractC56952jT;
import X.C00O;
import X.C14360o3;
import X.C168607fu;
import X.C3I7;
import X.C3I9;
import X.C55346Oi6;
import X.C55515Ol8;
import X.C61972ry;
import X.InterfaceC57829Pkv;
import X.InterfaceC60152ox;
import X.InterfaceC60602pj;
import X.N6s;
import X.ViewOnClickListenerC55455Ok9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.widget.TitleDescriptionEditor;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public class TitleDescriptionEditor extends ConstraintLayout implements InterfaceC60602pj, InterfaceC60152ox {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public TextWatcher A07;
    public TextWatcher A08;
    public View.OnClickListener A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ViewGroup A0D;
    public FrameLayout A0E;
    public FrameLayout A0F;
    public IgImageView A0G;
    public C3I9 A0H;
    public InterfaceC57829Pkv A0I;
    public IgAutoCompleteTextView A0J;
    public IgAutoCompleteTextView A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.view.View, X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static void A00(TitleDescriptionEditor titleDescriptionEditor, boolean z) {
        IgAutoCompleteTextView igAutoCompleteTextView = titleDescriptionEditor.A0J;
        if (titleDescriptionEditor.A0I != null && igAutoCompleteTextView.getLayout() != null && titleDescriptionEditor.A0M) {
            ScrollView scrollView = ((N6s) titleDescriptionEditor.A0I).A02;
            if (scrollView == null) {
                C14360o3.A0F("scrollView");
                throw C00O.createAndThrow();
            }
            int height = (scrollView.getHeight() - titleDescriptionEditor.A04) - titleDescriptionEditor.A05;
            int scrollY = scrollView.getScrollY();
            int selectionEnd = igAutoCompleteTextView.getSelectionEnd();
            Layout layout = igAutoCompleteTextView.getLayout();
            int lineForOffset = layout.getLineForOffset(selectionEnd);
            int lineTop = layout.getLineTop(lineForOffset) + igAutoCompleteTextView.getPaddingTop();
            int lineBottom = layout.getLineBottom(lineForOffset) + igAutoCompleteTextView.getPaddingTop();
            int top = igAutoCompleteTextView.getTop() - titleDescriptionEditor.A05;
            int i = (lineTop + top) - titleDescriptionEditor.A06;
            int baseline = ((top + lineBottom) + titleDescriptionEditor.A0J.getBaseline()) - (titleDescriptionEditor.A0D.getHeight() - (layout.getLineBottom(0) * 2));
            titleDescriptionEditor.A02 = baseline;
            int height2 = (height - baseline) - titleDescriptionEditor.A0D.getHeight();
            int min = Math.min(i, scrollY) + height2;
            titleDescriptionEditor.A00 = min;
            if (i >= scrollY) {
                int i2 = titleDescriptionEditor.A01;
                if (min < i2) {
                    i = i2 - height2;
                } else {
                    return;
                }
            }
            if (z) {
                scrollView.smoothScrollTo(0, i);
            } else {
                scrollView.scrollTo(0, i);
            }
        }
    }

    private void A01(IgAutoCompleteTextView igAutoCompleteTextView) {
        InterfaceC57829Pkv interfaceC57829Pkv = this.A0I;
        if (interfaceC57829Pkv != null) {
            N6s n6s = (N6s) interfaceC57829Pkv;
            C168607fu A01 = C168607fu.A0I.A01(n6s.requireContext(), n6s, new C61972ry(n6s.requireContext(), AbstractC018607g.A00(n6s), null), AbstractC166987dD.A0r(n6s.A07), null, "igtv_edit_page", false);
            igAutoCompleteTextView.A07 = true;
            igAutoCompleteTextView.setAdapter(A01);
        }
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        String str;
        InterfaceC57829Pkv interfaceC57829Pkv = this.A0I;
        if (interfaceC57829Pkv != null) {
            final FragmentActivity A09 = AbstractC31171DnF.A09(interfaceC57829Pkv);
            N6s n6s = (N6s) interfaceC57829Pkv;
            final ScrollView scrollView = n6s.A02;
            if (scrollView == null) {
                str = "scrollView";
            } else {
                View view = n6s.A00;
                if (view == null) {
                    str = "scrollViewContent";
                } else {
                    this.A04 = i;
                    view.setPadding(0, this.A05, 0, i + this.A03);
                    post(new Runnable() { // from class: X.PSb
                        @Override // java.lang.Runnable
                        public final void run() {
                            TitleDescriptionEditor titleDescriptionEditor = this;
                            ScrollView scrollView2 = scrollView;
                            Activity activity = A09;
                            if (!titleDescriptionEditor.A0L && titleDescriptionEditor.A04 != 0) {
                                int height = titleDescriptionEditor.A0K.getHeight() - titleDescriptionEditor.A0K.getBaseline();
                                titleDescriptionEditor.A0K.setDropDownVerticalOffset(height);
                                int height2 = (((scrollView2.getHeight() - titleDescriptionEditor.A04) - titleDescriptionEditor.A05) - titleDescriptionEditor.A0F.getHeight()) - height;
                                if (height2 > 0) {
                                    titleDescriptionEditor.A0K.setDropDownHeight(height2);
                                }
                                titleDescriptionEditor.A0L = true;
                            }
                            activity.getClass();
                            View currentFocus = activity.getCurrentFocus();
                            if (currentFocus != null && currentFocus.equals(titleDescriptionEditor.A0J)) {
                                TitleDescriptionEditor.A00(titleDescriptionEditor, true);
                            }
                        }
                    });
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public String getDescriptionText() {
        return AbstractC167007dF.A0g(this.A0J);
    }

    public IgImageView getMediaPreview() {
        return this.A0G;
    }

    public String getTitleText() {
        return AbstractC167007dF.A0g(this.A0K);
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        C3I9 c3i9 = this.A0H;
        if (c3i9.isStarted()) {
            c3i9.onStop();
            this.A0H.EFx(this);
        }
        this.A0K.removeTextChangedListener(this.A08);
        this.A0J.removeTextChangedListener(this.A07);
        AbstractC13880nE.A0O(this.A0J);
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        FragmentActivity A09;
        InterfaceC57829Pkv interfaceC57829Pkv = this.A0I;
        if (interfaceC57829Pkv != null && (A09 = AbstractC31171DnF.A09(interfaceC57829Pkv)) != null) {
            this.A0H.Dnr(A09);
            this.A0H.A9e(this);
        }
        this.A0K.addTextChangedListener(this.A08);
        this.A0J.addTextChangedListener(this.A07);
    }

    public void setDescriptionHint(int i) {
        this.A0J.setHint(i);
    }

    public void setDescriptionText(String str) {
        this.A0J.setText(str);
    }

    public void setMaxTitleLength(int i) {
        this.A0K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setTitleHint(int i) {
        this.A0K.setHint(i);
    }

    public void setTitleText(String str) {
        this.A0K.setText(str);
    }

    public void setTitleVisibility(boolean z) {
        int i = 0;
        this.A0F.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        View view = this.A0A;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public TitleDescriptionEditor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC50524MSc.A0J(this);
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        this.A0K = (IgAutoCompleteTextView) requireViewById(R.id.title_text);
        this.A0J = (IgAutoCompleteTextView) requireViewById(R.id.description_text);
        Resources resources = getResources();
        this.A01 = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * 2;
        A01(this.A0K);
        A01(this.A0J);
        this.A08 = new C55346Oi6(this, 14);
        this.A07 = new C55346Oi6(this, 15);
        this.A0J.setOnItemClickListener(new C55515Ol8(this, 2));
        this.A0C = requireViewById(R.id.title_error);
        this.A0B = requireViewById(R.id.title_error_icon);
        this.A0D = AbstractC31173DnH.A0F(this, R.id.text_container);
        this.A0E = (FrameLayout) requireViewById(R.id.preview_container);
        this.A0G = AbstractC31172DnG.A0Z(this, R.id.preview);
        this.A0F = (FrameLayout) requireViewById(R.id.title_container);
        this.A0A = requireViewById(R.id.title_description_divider);
        this.A0E.setOnClickListener(ViewOnClickListenerC55455Ok9.A00(this, 43));
        if (this.A0N) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(R.dimen.clips_minicountdown_view_parent_view_ratio, typedValue, true);
            int A0A = AbstractC13880nE.A0A(getContext());
            int i = (int) (A0A * typedValue.getFloat());
            AbstractC13880nE.A0g(this.A0E, i);
            AbstractC13880nE.A0g(this.A0D, A0A - i);
            AbstractC56952jT.A01(this.A0E);
        } else {
            this.A0E.setVisibility(8);
        }
        this.A06 = Math.round(AbstractC13880nE.A04(getContext(), 14));
        this.A0H = C3I7.A01(this, false, false);
    }

    public void setAdjustScrollOnTextChange(boolean z) {
        this.A0M = z;
    }

    public void setDelegate(InterfaceC57829Pkv interfaceC57829Pkv) {
        this.A0I = interfaceC57829Pkv;
    }

    public void setFooterHeightPx(int i) {
        this.A03 = i;
    }

    public void setMediaPreviewClickListener(View.OnClickListener onClickListener) {
        this.A09 = onClickListener;
    }

    public void setScrollContentTopPadding(int i) {
        this.A05 = i;
    }

    public TitleDescriptionEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC50524MSc.A0J(this);
    }

    public TitleDescriptionEditor(Context context) {
        super(context);
        AbstractC50524MSc.A0J(this);
    }
}
