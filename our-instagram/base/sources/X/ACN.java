package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;

/* loaded from: classes4.dex */
public final class ACN {
    public int A00;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final ImageView A06;
    public final ConstrainedEditText A07;
    public final boolean A09;
    public final int A0A;
    public final Runnable A08 = new Runnable() { // from class: X.As4
        @Override // java.lang.Runnable
        public final void run() {
            ACN.this.A01(false);
        }
    };
    public Integer A01 = C05F.A00;

    public final void A00(Integer num, boolean z) {
        ImageView imageView;
        Context context;
        int i;
        if (this.A09 && this.A01 != num) {
            this.A01 = num;
            int intValue = num.intValue();
            if (intValue != 0) {
                imageView = this.A06;
                if (intValue != 1) {
                    imageView.setImageResource(R.drawable.instagram_text_bg_frost_filled_44);
                    context = imageView.getContext();
                    i = 2131975306;
                } else {
                    imageView.setImageResource(R.drawable.instagram_text_bg_filled_44);
                    context = imageView.getContext();
                    i = 2131975308;
                }
            } else {
                imageView = this.A06;
                imageView.setImageResource(R.drawable.instagram_text_bg_outline_44);
                context = imageView.getContext();
                i = 2131975307;
            }
            AbstractC166997dE.A18(context, imageView, i);
            A01(z);
            Integer num2 = this.A01;
            Integer num3 = C05F.A00;
            ConstrainedEditText constrainedEditText = this.A07;
            if (num2 == num3) {
                constrainedEditText.setShadowLayer(this.A04, 0.0f, this.A03, this.A05);
            } else {
                constrainedEditText.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                AbstractC139116Rs.A00(constrainedEditText, this.A02, true);
            }
        }
    }

    public final void A01(boolean z) {
        boolean z2;
        int i;
        int A08;
        if (this.A09) {
            ConstrainedEditText constrainedEditText = this.A07;
            Editable text = constrainedEditText.getText();
            if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text.toString().trim())) {
                int i2 = this.A00;
                Integer num = this.A01;
                Integer num2 = C05F.A0C;
                if (num == num2 && i2 == -1) {
                    i2 = this.A0A;
                }
                C14360o3.A0B(num, 3);
                float textSize = constrainedEditText.getTextSize();
                float f = textSize * 0.3f;
                float f2 = textSize * 0.2f;
                float f3 = textSize / 4.0f;
                constrainedEditText.onPreDraw();
                Editable text2 = constrainedEditText.getText();
                Layout layout = constrainedEditText.getLayout();
                if (text2 != null && layout != null) {
                    if (!z) {
                        ViewTreeObserverOnPreDrawListenerC139186Rz[] viewTreeObserverOnPreDrawListenerC139186RzArr = (ViewTreeObserverOnPreDrawListenerC139186Rz[]) C4GL.A06(text2, ViewTreeObserverOnPreDrawListenerC139186Rz.class);
                        int length = viewTreeObserverOnPreDrawListenerC139186RzArr.length;
                        int i3 = 0;
                        z2 = false;
                        i = 0;
                        while (i3 < length) {
                            ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz = viewTreeObserverOnPreDrawListenerC139186RzArr[i3];
                            i = viewTreeObserverOnPreDrawListenerC139186Rz.A00;
                            text2.removeSpan(viewTreeObserverOnPreDrawListenerC139186Rz);
                            i3++;
                            z2 = true;
                        }
                    } else {
                        C4GL.A05(text2, ViewTreeObserverOnPreDrawListenerC139186Rz.class);
                        z2 = false;
                        i = 0;
                    }
                    if (num != C05F.A00) {
                        if (!z2) {
                            if (num == num2) {
                                i = AbstractC13950nL.A03(i2);
                            } else {
                                i = i2;
                            }
                        }
                        ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz2 = new ViewTreeObserverOnPreDrawListenerC139186Rz(AbstractC139126Rt.A02(layout, f, f2, f2, f3, 1.0f), f3, i);
                        text2.setSpan(viewTreeObserverOnPreDrawListenerC139186Rz2, 0, text2.length(), 18);
                        if (z) {
                            C4GL.A05(text2, C190868ci.class);
                            if (num == C05F.A01 && (A08 = AbstractC13950nL.A08(i, 1.0f)) != -1) {
                                text2.setSpan(new C190868ci(AbstractC166997dE.A0L(constrainedEditText), new TextColors(TextShadow.A03, A08)), 0, text2.length(), 18);
                            }
                        }
                        Object tag = constrainedEditText.getTag(R.id.text_background_predraw_listener_tag);
                        ViewTreeObserver viewTreeObserver = constrainedEditText.getViewTreeObserver();
                        if (tag != null) {
                            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserverOnPreDrawListenerC139186Rz) tag);
                        }
                        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC139186Rz2);
                        constrainedEditText.setTag(R.id.text_background_predraw_listener_tag, viewTreeObserverOnPreDrawListenerC139186Rz2);
                    }
                }
            }
        }
    }

    public ACN(ImageView imageView, ConstrainedEditText constrainedEditText, float f, float f2, float f3, int i, int i2) {
        this.A07 = constrainedEditText;
        this.A06 = imageView;
        this.A0A = i;
        this.A05 = i2;
        this.A04 = f;
        this.A03 = f2;
        this.A02 = f3;
        boolean A1W = AbstractC167007dF.A1W(imageView);
        this.A09 = A1W;
        if (A1W) {
            C216559iC.A02(AbstractC166987dD.A0s(imageView), this, 35);
        }
    }
}
