package com.instagram.ui.mediaactions;

import X.AbstractC13880nE;
import X.C05F;
import X.C14360o3;
import X.C23831Eq;
import X.C44332JiX;
import X.C4SA;
import X.C57012jc;
import X.C8S8;
import X.EnumC74373Vt;
import X.InterfaceC105204oa;
import X.InterfaceC74323Vo;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MediaActionsView extends FrameLayout implements InterfaceC74323Vo {
    public int A00;
    public ObjectAnimator A01;
    public TransitionDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewStub A07;
    public ViewStub A08;
    public ViewStub A09;
    public ViewStub A0A;
    public ProgressBar A0B;
    public TextView A0C;
    public TextView A0D;
    public C57012jc A0E;
    public InterfaceC105204oa A0F;
    public Integer A0G;
    public boolean A0H;
    public float A0I;
    public int A0J;
    public ViewStub A0K;
    public ViewStub A0L;
    public EnumC74373Vt A0M;
    public final ViewStub A0N;

    public MediaActionsView(Context context) {
        this(context, null);
    }

    private void setProgress(int i) {
        A02(i, false);
    }

    @Override // X.InterfaceC74323Vo
    public final void EJr() {
        A02(0, false);
    }

    @Override // android.view.View, X.InterfaceC74323Vo
    public void setVisibility(int i) {
        C4SA.A00(this.A06, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, true, true);
        View view = this.A04;
        RectF rectF = AbstractC13880nE.A01;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private void A00() {
        if (this.A0D == null) {
            ViewStub viewStub = this.A0L;
            viewStub.getClass();
            TextView textView = (TextView) viewStub.inflate();
            this.A0D = textView;
            this.A0I = textView.getX();
            this.A0D.setText(C23831Eq.A02(0L));
            TextView textView2 = this.A0D;
            C44332JiX c44332JiX = new C44332JiX(getContext().getColor(R.color.design_dark_default_color_on_background));
            RectF rectF = AbstractC13880nE.A01;
            C14360o3.A0B(textView2, 0);
            textView2.setBackground(c44332JiX);
        }
    }

    private void A01() {
        if (this.A04 == null) {
            View inflate = this.A0N.inflate();
            this.A04 = inflate;
            this.A02 = (TransitionDrawable) inflate.getBackground();
            View requireViewById = this.A04.requireViewById(R.id.video_states);
            this.A06 = requireViewById;
            this.A09 = (ViewStub) requireViewById.requireViewById(R.id.retry_stub);
            this.A0E = new C57012jc((ViewStub) this.A06.requireViewById(R.id.video_icon_viewstub));
            this.A07 = (ViewStub) this.A06.requireViewById(R.id.caminner_viewstub);
            this.A0C = (TextView) this.A06.requireViewById(R.id.countdown_timer);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A07, "alpha", 1.0f, 0.0f);
            this.A01 = ofFloat;
            ofFloat.setDuration(750L);
            this.A01.setRepeatMode(2);
            this.A01.setRepeatCount(-1);
            this.A01.setInterpolator(new AccelerateInterpolator());
            this.A08 = (ViewStub) this.A04.findViewById(R.id.progress_bar_stub);
            this.A0L = (ViewStub) this.A04.findViewById(R.id.time_pill_stub);
            this.A0A = (ViewStub) this.A04.findViewById(R.id.video_controls_nux_stub);
            this.A0K = (ViewStub) this.A04.findViewById(R.id.thumbnail_preview_stub);
        }
    }

    private void A02(int i, boolean z) {
        ProgressBar progressBar = this.A0B;
        if (progressBar != null && progressBar.getProgress() != i) {
            this.A0B.setProgress(i, z);
            A00();
            this.A0D.getClass();
            this.A0D.setText(C23831Eq.A02(i));
            TextView textView = this.A0D;
            A00();
            this.A04.getClass();
            float width = (this.A04.getWidth() * 0.06999999f) / 2.0f;
            int width2 = this.A04.getWidth();
            this.A0D.getClass();
            textView.setX(Math.min(Math.max((((i / this.A00) * (this.A04.getWidth() * 0.93f)) + width) - (this.A0D.getWidth() / 2), width), (width2 - r0.getWidth()) - width));
        }
    }

    private void A03(boolean z) {
        ProgressBar progressBar = this.A0B;
        if (progressBar != null && this.A04 != null) {
            AbstractC13880nE.A0X(progressBar, 80);
            this.A04.getHeight();
            getContext().getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
            int max = this.A0B.getMax();
            int i = this.A00;
            if (max != i) {
                this.A0B.setMax(i);
            }
            A02(this.A0J, z);
        }
    }

    @Override // X.InterfaceC74323Vo
    public final void DKh() {
        if (this.A04 != null) {
            C4SA.A00(this.A05, 100, false, true);
        }
    }

    @Override // X.InterfaceC74323Vo
    public final void Dm7() {
        ViewStub viewStub;
        if (this.A04 != null) {
            View view = this.A05;
            if (view == null && (viewStub = this.A0A) != null) {
                view = viewStub.inflate();
                this.A05 = view;
            }
            C4SA.A00(view, 100, true, true);
        }
    }

    @Override // X.InterfaceC74323Vo
    public final void FBn(int i, int i2) {
        if (this.A0G == C05F.A01) {
            this.A0J = i;
            this.A00 = i2;
            A03(true);
        }
    }

    public void setProgressBar(ProgressBar progressBar, InterfaceC105204oa interfaceC105204oa) {
        ProgressBar progressBar2 = this.A0B;
        if (progressBar2 != null && progressBar2.getId() != progressBar.getId()) {
            this.A0B.setVisibility(8);
        }
        this.A0F = interfaceC105204oa;
        this.A0B = progressBar;
        this.A08 = null;
    }

    public void setShouldAlwaysShowCollapsedProgressBar(boolean z) {
        ViewStub viewStub;
        if (!z) {
            if (this.A0G == C05F.A00) {
                C4SA.A00(this.A0B, 100, false, true);
                return;
            }
            return;
        }
        ProgressBar progressBar = this.A0B;
        if (progressBar != null && progressBar.getVisibility() == 0) {
            return;
        }
        if (this.A0B == null && (viewStub = this.A08) != null) {
            viewStub.setLayoutResource(R.layout.view_media_actions_progress_bar);
            this.A0B = (ProgressBar) this.A08.inflate();
            A03(false);
        }
        C4SA.A00(this.A0B, 100, true, true);
    }

    @Override // X.InterfaceC74323Vo
    public void setShouldShowCountdownTimer(boolean z) {
        this.A0H = z;
        A01();
        this.A0C.getClass();
        clearAnimation();
        TextView textView = this.A0C;
        int i = 8;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    @Override // X.InterfaceC74323Vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVideoIconState(X.EnumC74373Vt r10) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.mediaactions.MediaActionsView.setVideoIconState(X.3Vt):void");
    }

    private float getTimePillScalePivotX() {
        A00();
        this.A0D.getClass();
        return ((this.A0D.getX() - this.A0I) / this.A0D.getWidth()) + 0.5f;
    }

    @Override // X.InterfaceC74323Vo
    public final void EcU(int i, boolean z) {
        A01();
        this.A0C.getClass();
        String A02 = C23831Eq.A02(i);
        if (z) {
            A02 = String.format(Locale.getDefault(), this.A0C.getResources().getString(2131976738), A02);
        }
        this.A0C.setText(A02);
        this.A0C.requestLayout();
    }

    public void setVideoControlsDelegate(InterfaceC105204oa interfaceC105204oa) {
        this.A0F = interfaceC105204oa;
    }

    @Override // X.InterfaceC74323Vo
    public final void AJM(Integer num, boolean z, boolean z2) {
        this.A0G = num;
    }

    public MediaActionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0H = true;
        this.A0M = EnumC74373Vt.A05;
        this.A0G = C05F.A00;
        this.A0N = (ViewStub) LayoutInflater.from(context).inflate(R.layout.view_media_actions, this).requireViewById(R.id.video_actions_view_stub);
    }

    public MediaActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
