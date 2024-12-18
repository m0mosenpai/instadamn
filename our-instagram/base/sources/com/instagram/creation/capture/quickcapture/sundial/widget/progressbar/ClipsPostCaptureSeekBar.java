package com.instagram.creation.capture.quickcapture.sundial.widget.progressbar;

import X.AbstractC111324zv;
import X.AbstractC13600mm;
import X.AbstractC63123SdR;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C191428du;
import X.C56302iJ;
import X.InterfaceC184998Io;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.nestablescrollingview.NestableRecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ClipsPostCaptureSeekBar extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public UserSession A04;
    public CreationActionBar A05;
    public TargetViewSizeProvider A06;
    public InterfaceC184998Io A07;
    public NestableRecyclerView A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final C191428du A0C;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsPostCaptureSeekBar(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static /* synthetic */ void getViewMode$annotations() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float width = getWidth();
        int i = this.A09;
        Paint paint = this.A0A;
        paint.setColor(i);
        float f = this.A01;
        float f2 = f / 2.0f;
        canvas.drawRoundRect(0.0f, f2, 0.0f + width, (f * 3.0f) / 2.0f, f2, f2, paint);
        this.A0C.draw(canvas);
        int i2 = this.A03;
        int i3 = this.A02;
        canvas.drawCircle(getWidth() * AbstractC13600mm.A00(i2 / i3, 0.0f, 1.0f), f, 0.0f, this.A0B);
    }

    public final void setCreationActionBar(CreationActionBar creationActionBar) {
        C14360o3.A0B(creationActionBar, 0);
        this.A05 = creationActionBar;
    }

    public final void setTargetViewSizeProvider(TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(targetViewSizeProvider, 0);
        this.A06 = targetViewSizeProvider;
    }

    public final void setUserSession(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        this.A04 = userSession;
    }

    public static final void A00(ClipsPostCaptureSeekBar clipsPostCaptureSeekBar) {
        C191428du c191428du = clipsPostCaptureSeekBar.A0C;
        int i = clipsPostCaptureSeekBar.A01;
        int i2 = i / 2;
        int i3 = clipsPostCaptureSeekBar.A03;
        int i4 = clipsPostCaptureSeekBar.A02;
        c191428du.setBounds(0, i2, (int) (clipsPostCaptureSeekBar.getWidth() * AbstractC13600mm.A00(i3 / i4, 0.0f, 1.0f)), (i * 3) / 2);
        c191428du.A00 = i2;
    }

    public final int getAdditionalMargin() {
        return this.A00;
    }

    public final CreationActionBar getCreationActionBar() {
        CreationActionBar creationActionBar = this.A05;
        if (creationActionBar != null) {
            return creationActionBar;
        }
        C14360o3.A0F("creationActionBar");
        throw C00O.createAndThrow();
    }

    public final int getMaxDurationInMs() {
        return this.A02;
    }

    public final int getPlaybackPositionInMs() {
        return this.A03;
    }

    public final TargetViewSizeProvider getTargetViewSizeProvider() {
        TargetViewSizeProvider targetViewSizeProvider = this.A06;
        if (targetViewSizeProvider != null) {
            return targetViewSizeProvider;
        }
        C14360o3.A0F("targetViewSizeProvider");
        throw C00O.createAndThrow();
    }

    public final NestableRecyclerView getTimedStickersContainer() {
        return this.A08;
    }

    public final UserSession getUserSession() {
        UserSession userSession = this.A04;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            A00(this);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A01 * 2, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void setPlaybackPositionInMs(int i) {
        this.A03 = Math.min(i, this.A02);
        A00(this);
        invalidate();
    }

    public final void setTimedStickersContainer(NestableRecyclerView nestableRecyclerView) {
        NestableRecyclerView nestableRecyclerView2;
        this.A08 = nestableRecyclerView;
        if (getTargetViewSizeProvider().CV5() && (nestableRecyclerView2 = this.A08) != null) {
            ViewGroup.LayoutParams layoutParams = nestableRecyclerView2.getLayoutParams();
            if (layoutParams != null) {
                C56302iJ c56302iJ = (C56302iJ) layoutParams;
                c56302iJ.A0G = R.id.clips_post_capture_seek_bar;
                nestableRecyclerView2.setLayoutParams(c56302iJ);
                return;
            }
            throw new NullPointerException(AbstractC111324zv.A00(0));
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-1907730703);
        this.A0C.A00(i, i2);
        C0f9.A0D(949966870, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1276885831);
        C14360o3.A0B(motionEvent, 0);
        C0f9.A0C(-538180318, A05);
        return false;
    }

    public final void setAdditionalMargin(int i) {
        this.A00 = i;
    }

    public final void setListener(InterfaceC184998Io interfaceC184998Io) {
        this.A07 = interfaceC184998Io;
    }

    public final void setMaxDurationInMs(int i) {
        this.A02 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsPostCaptureSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Resources resources = getResources();
        resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A0C = new C191428du(context, context.getColor(R.color.audio_bar_action_color_enabled), context.getColor(R.color.audio_bar_action_color_enabled));
        this.A09 = context.getColor(R.color.clips_progress_bar_background_color);
        int color = context.getColor(R.color.audio_bar_action_color_enabled);
        this.A0A = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(color);
        this.A0B = paint;
        this.A01 = dimensionPixelSize;
        this.A02 = 15000;
    }

    public /* synthetic */ ClipsPostCaptureSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipsPostCaptureSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
