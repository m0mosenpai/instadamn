package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;

/* renamed from: X.8RR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RR implements C8RS {
    public int A00;
    public ValueAnimator A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final ConstraintLayout A07;
    public final Fragment A08;
    public final UserSession A09;
    public final CameraToolMenuItem A0A;
    public final CameraToolMenuItem A0B;
    public final CameraToolMenuItem A0C;
    public final C8R0 A0D;
    public final C8JS A0E;
    public final ClipsTrimFilmstrip A0F;
    public final C49602Pt A0G;
    public final View A0H;
    public final Animation A0I;
    public final Animation A0J;
    public final TextView A0K;
    public final C8RY A0L;
    public final InterfaceC184088Ex A0M;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.8RY] */
    public C8RR(ConstraintLayout constraintLayout, Fragment fragment, UserSession userSession, C8R0 c8r0, C8JS c8js, C49602Pt c49602Pt) {
        C14360o3.A0B(constraintLayout, 2);
        C14360o3.A0B(userSession, 5);
        this.A08 = fragment;
        this.A07 = constraintLayout;
        this.A0G = c49602Pt;
        this.A0D = c8r0;
        this.A09 = userSession;
        this.A0E = c8js;
        InterfaceC184088Ex interfaceC184088Ex = new InterfaceC184088Ex() { // from class: X.8RT
            @Override // X.InterfaceC184088Ex
            public final void DOq(int i) {
                C8RR.this.A0D.Dvs(i);
            }

            @Override // X.InterfaceC184088Ex
            public final void DhS(int i) {
                C8RR.this.A0D.Dvq(i);
            }

            @Override // X.InterfaceC184088Ex
            public final void Djy(int i) {
                C8RR.this.A0D.Djz(i);
            }

            @Override // X.InterfaceC184088Ex
            public final void DuJ(boolean z) {
                if (z) {
                    C8RR c8rr = C8RR.this;
                    c8rr.A03 = true;
                    C8RR.A00(c8rr);
                }
                C8RR.this.A0D.DGx();
            }

            @Override // X.InterfaceC184088Ex
            public final void DuL(boolean z) {
                C8RR.this.A0D.DGy();
            }
        };
        this.A0M = interfaceC184088Ex;
        View findViewById = constraintLayout.findViewById(R.id.trim_confirm_button);
        C14360o3.A07(findViewById);
        TextView textView = (TextView) findViewById;
        this.A0K = textView;
        this.A02 = C05F.A00;
        C3P9 c3p9 = new C3P9(textView);
        c3p9.A07 = true;
        c3p9.A04 = new C3PD() { // from class: X.8RU
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C8RR c8rr = C8RR.this;
                if (c8rr.A02 != C05F.A00 || c8rr.A03) {
                    c8rr.A0D.D6z();
                    return true;
                }
                return true;
            }
        };
        c3p9.A00();
        Integer num = C05F.A01;
        AbstractC56952jT.A04(textView, num);
        View findViewById2 = constraintLayout.findViewById(R.id.trim_cancel_button);
        this.A0H = findViewById2;
        C3P9 c3p92 = new C3P9(findViewById2);
        c3p92.A07 = true;
        c3p92.A04 = new C3PD() { // from class: X.8RV
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C8RR.this.A0D.D1v();
                return true;
            }
        };
        c3p92.A00();
        AbstractC56952jT.A04(findViewById2, num);
        CameraToolMenuItem cameraToolMenuItem = (CameraToolMenuItem) constraintLayout.requireViewById(R.id.scale_button);
        this.A0C = cameraToolMenuItem;
        C0fQ.A00(new View.OnClickListener() { // from class: X.8RW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(326721975);
                C8RR c8rr = C8RR.this;
                if (c8rr.A0E == null || r2.A09 / r2.A08 > 0.5625f) {
                    boolean z = !c8rr.A04;
                    c8rr.A04 = z;
                    CameraToolMenuItem cameraToolMenuItem2 = c8rr.A0C;
                    cameraToolMenuItem2.A04(z, true);
                    cameraToolMenuItem2.setSelected(c8rr.A04);
                }
                c8rr.A0D.DiM();
                C0f9.A0C(-468059876, A05);
            }
        }, cameraToolMenuItem);
        AbstractC56952jT.A04(cameraToolMenuItem, num);
        CameraToolMenuItem cameraToolMenuItem2 = (CameraToolMenuItem) constraintLayout.requireViewById(R.id.trim_music_button);
        this.A0B = cameraToolMenuItem2;
        C0fQ.A00(new View.OnClickListener() { // from class: X.8RX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-851387331);
                C8RR.this.A0D.DUH();
                C0f9.A0C(714306726, A05);
            }
        }, cameraToolMenuItem2);
        AbstractC56952jT.A04(cameraToolMenuItem2, num);
        final CameraToolMenuItem cameraToolMenuItem3 = (CameraToolMenuItem) constraintLayout.requireViewById(R.id.background_picker_button);
        this.A0A = cameraToolMenuItem3;
        AbstractC56952jT.A04(cameraToolMenuItem3, num);
        this.A0L = new Object(cameraToolMenuItem3) { // from class: X.8RY
            public final Context A00;
            public final CameraToolMenuItem A01;

            {
                C14360o3.A0B(cameraToolMenuItem3, 1);
                this.A01 = cameraToolMenuItem3;
                this.A00 = cameraToolMenuItem3.getContext();
                Drawable drawable = cameraToolMenuItem3.A05;
                drawable = drawable == null ? cameraToolMenuItem3.A04 : drawable;
                C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-16777216, -16777216});
                gradientDrawable.setShape(1);
                gradientDrawable.setGradientType(0);
                layerDrawable.setDrawableByLayerId(R.id.fill, gradientDrawable);
                Context context = this.A00;
                float A04 = AbstractC13880nE.A04(context, 34);
                float A042 = AbstractC13880nE.A04(context, 2);
                float A043 = AbstractC13880nE.A04(context, 2);
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.shadow);
                C14360o3.A0C(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) findDrawableByLayerId).setGradientRadius((A04 + (2.0f * A043)) / 2.0f);
                int i = (int) A043;
                layerDrawable.setLayerInset(1, i, i, i, i);
                int i2 = (int) (A043 + A042);
                layerDrawable.setLayerInset(2, i2, i2, i2, i2);
                layerDrawable.invalidateSelf();
            }
        };
        Resources resources = constraintLayout.getContext().getResources();
        this.A06 = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A05 = resources.getDimensionPixelSize(R.dimen.abc_star_medium);
        ClipsTrimFilmstrip clipsTrimFilmstrip = (ClipsTrimFilmstrip) constraintLayout.requireViewById(R.id.clips_review_filmstrip_view);
        this.A0F = clipsTrimFilmstrip;
        clipsTrimFilmstrip.A02 = interfaceC184088Ex;
        AbstractC13880nE.A0n(clipsTrimFilmstrip, constraintLayout);
        int integer = fragment.requireContext().getResources().getInteger(android.R.integer.config_mediumAnimTime);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A0I = alphaAnimation;
        long j = integer;
        alphaAnimation.setDuration(j);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A0J = alphaAnimation2;
        alphaAnimation2.setDuration(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r3.A03 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C8RR r3) {
        /*
            android.widget.TextView r2 = r3.A0K
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto Le
            boolean r0 = r3.A03
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L10
        Le:
            r1 = 1065353216(0x3f800000, float:1.0)
        L10:
            r2.setAlpha(r1)
            java.lang.Integer r0 = r3.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L37
            r0 = 2
            if (r1 == r0) goto L33
            r0 = 0
            if (r1 == r0) goto L33
            r0 = 3
            if (r1 == r0) goto L2f
            r0 = 4
            if (r1 != r0) goto L3b
            r0 = 2131961124(0x7f132524, float:1.9558936E38)
        L2b:
            r2.setText(r0)
            return
        L2f:
            r0 = 2131968535(0x7f134217, float:1.9573967E38)
            goto L2b
        L33:
            r0 = 2131976728(0x7f136218, float:1.9590585E38)
            goto L2b
        L37:
            r0 = 2131952265(0x7f130289, float:1.9540968E38)
            goto L2b
        L3b:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RR.A00(X.8RR):void");
    }

    @Override // X.C8RS
    public final void CMH(boolean z) {
        this.A02 = C05F.A00;
        this.A03 = false;
        this.A04 = false;
        CameraToolMenuItem cameraToolMenuItem = this.A0C;
        cameraToolMenuItem.A04(false, false);
        cameraToolMenuItem.setSelected(this.A04);
        cameraToolMenuItem.setVisibility(8);
        this.A0A.setVisibility(8);
        this.A0B.setVisibility(8);
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.A01 = null;
        }
        C8JS c8js = this.A0E;
        if (c8js != null) {
            c8js.A0B = false;
        }
        AbstractC125325le.A05(new View[]{this.A07}, z);
    }

    @Override // X.C8RS
    public final void DzG(int i, int i2, int i3) {
        if (this.A00 > 0) {
            this.A0F.setSeekPosition(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (r0 != 0) goto L9;
     */
    @Override // X.C8RS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EkC(X.C115525Km r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RR.EkC(X.5Km, boolean, boolean):void");
    }
}
