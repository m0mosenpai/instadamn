package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.TightTextView;

/* loaded from: classes9.dex */
public final class NX8 extends AbstractC50789Mc6 {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public UserSession A03;
    public IgTextView A04;
    public TightTextView A05;
    public C38321qM A06;
    public final PointF A07;
    public final boolean A08;

    @Override // X.AbstractC50789Mc6
    public final void A03() {
    }

    @Override // X.AbstractC50789Mc6
    public final boolean A06() {
        return false;
    }

    @Override // X.AbstractC50789Mc6
    public final boolean A07(int i, int i2) {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        return false;
    }

    @Override // X.AbstractC50789Mc6
    public final void A05(CharSequence charSequence, int i) {
        if (this.A08) {
            super.A05(charSequence, i);
        }
    }

    @Override // X.AbstractC50789Mc6
    public CharSequence getText() {
        return this.A05.getText();
    }

    @Override // X.AbstractC50789Mc6
    public C57482kN getTextLayoutParams() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TightTextView tightTextView = this.A05;
        return AbstractC37303Gc4.A0C(alignment, tightTextView.getPaint(), tightTextView, tightTextView.getMaxWidth());
    }

    @Override // X.AbstractC50789Mc6
    public int getTextLineHeight() {
        return this.A05.getLineHeight();
    }

    @Override // X.AbstractC50789Mc6
    public void setText(CharSequence charSequence) {
        if (this.A08) {
            super.setText(charSequence);
        }
    }

    public NX8(Context context, PointF pointF, UserSession userSession, C38321qM c38321qM, boolean z) {
        super(context);
        this.A07 = pointF;
        this.A08 = z;
        this.A03 = userSession;
        this.A06 = c38321qM;
        Context context2 = getContext();
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A00 = linearLayout;
        linearLayout.setOrientation(1);
        this.A05 = new TightTextView(context2);
        this.A02 = new ImageView(context2);
        this.A01 = new ImageView(context2);
        boolean z2 = this.A08;
        if (z2) {
            ViewGroup viewGroup = this.A00;
            boolean z3 = AbstractC41736Ie8.A00;
            Context context3 = viewGroup.getContext();
            Drawable mutate = context3.getDrawable(R.drawable.tag_bubble_new).mutate();
            AbstractC25231BEo.A0x(context3, mutate, R.color.design_dark_default_color_on_background);
            viewGroup.setBackground(mutate);
            IgTextView igTextView = new IgTextView(context2);
            this.A04 = igTextView;
            igTextView.setText(context2.getResources().getText(2131953388));
            this.A04.setTextSize(2, context2.getResources().getInteger(R.integer.tag_text_size));
            AbstractC166987dD.A1O(context2, this.A04, AbstractC53242c7.A0C(context2));
            this.A04.setGravity(16);
            AbstractC41736Ie8.A03(this.A05, this.A00.getPaddingLeft(), false);
            ImageView imageView = this.A02;
            Context context4 = imageView.getContext();
            Drawable mutate2 = context4.getDrawable(R.drawable.tag_carrot).mutate();
            AbstractC25231BEo.A0x(context4, mutate2, R.color.design_dark_default_color_on_background);
            imageView.setBackground(mutate2);
            imageView.setPadding(0, 0, 0, 0);
            ImageView imageView2 = this.A01;
            Context context5 = imageView2.getContext();
            Drawable mutate3 = context5.getDrawable(R.drawable.tag_carrot).mutate();
            AbstractC25231BEo.A0x(context5, mutate3, R.color.design_dark_default_color_on_background);
            imageView2.setBackground(mutate3);
            imageView2.setPadding(0, 0, 0, 0);
            imageView2.setRotation(180.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.A00.addView(this.A04, layoutParams);
            this.A00.addView(this.A05, layoutParams);
        } else {
            ImageView imageView3 = new ImageView(context2);
            AbstractC166997dE.A19(context2, imageView3, R.drawable.tag_hint_with_shadow);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.A00.addView(this.A05, layoutParams2);
            this.A00.addView(imageView3, layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
        addView(this.A00, layoutParams3);
        addView(this.A02, layoutParams3);
        addView(this.A01, layoutParams3);
        ViewGroup viewGroup2 = this.A00;
        TightTextView tightTextView = this.A05;
        OXO oxo = new OXO(this.A07, viewGroup2, this.A02, this.A01, tightTextView, this.A03, this.A06, this, 0, 0, false);
        super.A02 = oxo;
        if (!z2) {
            oxo.A02();
        }
    }

    @Override // X.AbstractC50789Mc6
    public String getTaggedId() {
        return ((com.instagram.tagging.model.Tag) AbstractC31172DnG.A0x(this)).getId();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A05 = C0f9.A05(387851292);
        if (this.A08) {
            OXO oxo = super.A02;
            C18C.A07(oxo, "mTagViewDelegate not initialized");
            z = oxo.A06(motionEvent);
            i = 1090000207;
        } else {
            z = false;
            i = -1455276053;
        }
        C0f9.A0C(i, A05);
        return z;
    }
}
