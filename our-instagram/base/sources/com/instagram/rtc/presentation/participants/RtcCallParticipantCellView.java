package com.instagram.rtc.presentation.participants;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC31172DnG;
import X.C05F;
import X.C14360o3;
import X.C55720Oom;
import X.C57433PeV;
import X.C57524Pfy;
import X.C57553PgR;
import X.C57753Pjg;
import X.InterfaceC09390do;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.JQ0;
import X.Ok3;
import X.UAG;
import X.ViewOnLayoutChangeListenerC55476OkV;
import X.XB0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class RtcCallParticipantCellView extends ConstraintLayout {
    public TextView A00;
    public ImageUrl A01;
    public Integer A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16620sF A04;
    public Drawable A05;
    public InterfaceC16660sJ A06;
    public final View.OnLayoutChangeListener A07;
    public final View A08;
    public final View A09;
    public final FrameLayout A0A;
    public final IgTextView A0B;
    public final CircularImageView A0C;
    public final IgImageView A0D;
    public final IgdsMediaButton A0E;
    public final C55720Oom A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A02 = C05F.A0N;
        this.A03 = C57433PeV.A00;
        this.A0M = C57524Pfy.A00(context, 5);
        this.A0J = C57524Pfy.A00(context, 2);
        this.A0I = C57524Pfy.A00(context, 1);
        this.A0L = C57524Pfy.A00(context, 4);
        this.A0K = C57524Pfy.A00(context, 3);
        this.A0H = C57524Pfy.A00(context, 0);
        this.A0G = C57553PgR.A01(context, 49);
        this.A07 = new ViewOnLayoutChangeListenerC55476OkV(this, 8);
        View.inflate(context, R.layout.layout_call_participant_item, this);
        this.A0C = (CircularImageView) findViewById(R.id.call_participant_avatar);
        IgImageView A0a = AbstractC31172DnG.A0a(this, R.id.call_participant_mute_indicator);
        this.A0D = A0a;
        A0a.setImageAlpha(80);
        this.A09 = findViewById(R.id.call_video_loading_spinner);
        this.A08 = findViewById(R.id.cell_outline_view);
        this.A0B = AbstractC31172DnG.A0Y(this, R.id.call_participant_text);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) findViewById(R.id.call_participant_screen_share_button);
        this.A0E = igdsMediaButton;
        igdsMediaButton.setOnClickListener(new Ok3(this, 29));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.call_participant_renderer_container);
        this.A0A = frameLayout;
        C55720Oom c55720Oom = new C55720Oom(context);
        this.A0F = c55720Oom;
        View A0d = AbstractC166987dD.A0d(c55720Oom.A0A);
        frameLayout.addView(A0d, -1, -1);
        c55720Oom.A04 = new C57753Pjg(A0d, 28);
        UAG uag = c55720Oom.A01;
        if (uag != null) {
            uag.setMirror(false);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        if (interfaceC16660sJ != null) {
            AbstractC25227BEk.A1Q(interfaceC16660sJ, AbstractC167007dF.A1N(i));
        }
    }

    public final void setFrameRenderListener(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        C55720Oom c55720Oom = this.A0F;
        c55720Oom.A03 = interfaceC16820sZ;
        UAG uag = c55720Oom.A01;
        if (uag != null) {
            uag.A03 = interfaceC16820sZ;
        }
    }

    public final void setOnVisibilityChangedListener(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A06 = interfaceC16660sJ;
    }

    public final void setScreenShareStopClickListener$fbandroid_java_com_instagram_rtc_presentation_participants_participants(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A03 = interfaceC16820sZ;
    }

    public final void setVideoSizeChangeListener(XB0 xb0) {
        C14360o3.A0B(xb0, 0);
        C55720Oom c55720Oom = this.A0F;
        c55720Oom.A02 = xb0;
        UAG uag = c55720Oom.A01;
        if (uag != null) {
            uag.setVideoSizeChangeListener(xb0);
        }
    }

    private final Drawable getGrayGradientDrawable() {
        return AbstractC166987dD.A0a(this.A0G);
    }

    private final Drawable getMuteIndicatorBadgeDrawable() {
        return AbstractC166987dD.A0a(this.A0H);
    }

    private final int getMuteIndicatorBadgeSize() {
        return AbstractC167027dH.A01(this.A0I);
    }

    private final int getMuteIndicatorCompactSize() {
        return AbstractC167027dH.A01(this.A0J);
    }

    private final Drawable getMuteIndicatorDrawable() {
        return AbstractC166987dD.A0a(this.A0K);
    }

    private final int getMuteIndicatorMargin() {
        return AbstractC167027dH.A01(this.A0L);
    }

    private final int getMuteIndicatorSize() {
        return AbstractC167027dH.A01(this.A0M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundBitmap(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable(getResources(), BlurUtil.blur(bitmap, 0.1f, 3));
        } else {
            bitmapDrawable = null;
        }
        this.A05 = bitmapDrawable;
        Integer num = this.A02;
        if (num == C05F.A00) {
            A01(this, false, true);
        } else {
            if (num != C05F.A01) {
                return;
            }
            A01(this, true, true);
        }
    }

    public final InterfaceC16820sZ getScreenShareStopClickListener$fbandroid_java_com_instagram_rtc_presentation_participants_participants() {
        return this.A03;
    }

    public final void setAutoAdjustScalingType(boolean z) {
        C55720Oom c55720Oom = this.A0F;
        if (c55720Oom.A06 != z) {
            c55720Oom.A06 = z;
            UAG uag = c55720Oom.A01;
            if (uag != null) {
                uag.setAutoAdjustScalingType(z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.rtc.presentation.participants.RtcCallParticipantCellView r4, boolean r5, boolean r6) {
        /*
            java.lang.Integer r2 = X.MSX.A0Z(r5)
            r3 = 0
            if (r6 != 0) goto L1a
            java.lang.Integer r0 = r4.A02
            if (r2 != r0) goto L1a
            android.graphics.drawable.Drawable r0 = r4.A05
            if (r0 == 0) goto L16
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            r0 = 0
            if (r1 != 0) goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == r5) goto L1a
        L19:
            return
        L1a:
            r4.A02 = r2
            android.graphics.drawable.Drawable r0 = r4.A05
            r4.setBackground(r0)
            android.graphics.drawable.Drawable r2 = r4.getBackground()
            if (r2 == 0) goto L19
            if (r5 == 0) goto L3a
            android.content.Context r1 = r4.getContext()
            r0 = 2130970247(0x7f040687, float:1.7549199E38)
            int r1 = X.AbstractC167007dF.A09(r1, r0)
            java.lang.Integer r0 = X.C05F.A08
            android.graphics.ColorFilter r3 = X.AbstractC46530KiV.A00(r0, r1)
        L3a:
            r2.setColorFilter(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.presentation.participants.RtcCallParticipantCellView.A01(com.instagram.rtc.presentation.participants.RtcCallParticipantCellView, boolean, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ RtcCallParticipantCellView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
