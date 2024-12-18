package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.8YH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YH {
    public ObjectAnimator A00;
    public ViewStub A01;
    public boolean A02;
    public ViewGroup A03;
    public ProgressBar A04;
    public TextView A05;
    public TextView A06;

    public final void A03(Context context, C169297h3 c169297h3, final C8YF c8yf, String str, String str2) {
        C14360o3.A0B(c169297h3, 4);
        ViewStub viewStub = this.A01;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.offensive_content_warning);
            ViewStub viewStub2 = this.A01;
            if (viewStub2 != null) {
                View inflate = viewStub2.inflate();
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                A00((ViewGroup) inflate, this);
                this.A01 = null;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        final String string = context.getString(2131965052);
        C14360o3.A07(string);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.textColorLink});
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.color.badge_color);
        obtainStyledAttributes.recycle();
        final int color = context.getColor(resourceId);
        final Integer num = C05F.A01;
        spannableStringBuilder2.setSpan(new EPU(num, string, color) { // from class: X.9fw
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                C8YF.this.DOg();
            }
        }, 0, spannableStringBuilder2.length(), 18);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableStringBuilder2);
        TextView textView = this.A06;
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setText(spannableStringBuilder);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(str2);
            C0fQ.A00(new ARC(c8yf), textView2);
            AbstractC56952jT.A01(textView2);
        }
        if (c169297h3.A01 != -1) {
            A01(c169297h3);
        }
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public static final void A00(ViewGroup viewGroup, C8YH c8yh) {
        c8yh.A03 = viewGroup;
        if (viewGroup != null) {
            c8yh.A06 = (TextView) viewGroup.requireViewById(R.id.warning_text);
            c8yh.A05 = (TextView) viewGroup.requireViewById(R.id.warning_undo_button);
            boolean z = c8yh.A02;
            int i = R.id.progress_bar_top;
            if (z) {
                i = R.id.progress_bar_bottom;
            }
            ProgressBar progressBar = (ProgressBar) viewGroup.requireViewById(i);
            c8yh.A04 = progressBar;
            if (progressBar != null) {
                progressBar.setVisibility(0);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final void A01(C169297h3 c169297h3) {
        int min;
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.A00 = null;
        ProgressBar progressBar = this.A04;
        if (progressBar != null) {
            int i = c169297h3.A02;
            if (i == 0) {
                min = 100;
            } else {
                C169297h3.A00(c169297h3);
                min = Math.min((c169297h3.A00 * 100) / i, 100);
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, ReactProgressBarViewManager.PROP_PROGRESS, min, 100);
            this.A00 = ofInt;
            if (ofInt != null) {
                C169297h3.A00(c169297h3);
                ofInt.setDuration(Math.max(i - c169297h3.A00, 0));
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.start();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        long j = c169297h3.A01;
        if (j == 0 || j == -1) {
            c169297h3.A01 = System.currentTimeMillis();
        }
    }

    public final void A02() {
        if (this.A01 == null) {
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.A00 = null;
        }
    }

    public final void A04(C169297h3 c169297h3) {
        ObjectAnimator objectAnimator = this.A00;
        if (objectAnimator != null) {
            long j = c169297h3.A01;
            if (j != 0 && j != -1) {
                C169297h3.A00(c169297h3);
                c169297h3.A01 = -1L;
            }
            objectAnimator.cancel();
            this.A00 = null;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A05(C169297h3 c169297h3) {
        if (this.A00 == null) {
            A01(c169297h3);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
