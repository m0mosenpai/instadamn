package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KKz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45696KKz extends IgImageView {
    public static final java.util.Set A0J = AbstractC16830sb.A07("🏳️\u200d🌈", "🏳️\u200d⚧️", "🌈", "🦄");
    public static final java.util.Set A0K = AbstractC16830sb.A07("🔥", "🌼", "🌸", "☀️", "👹", "🍪", "❤️", "🧡", "💛", "💚", "💙", "💜", "🖤", "🤍", "✨", "🌟", "🍀", "🌞", "🎃", "❄️", "🎂", "🎈", "🎉", "🎊", "🥳");
    public float A00;
    public int A01;
    public MPB A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final ValueAnimator A08;
    public final QuickSnapReactionEmitterView A09;
    public final C49631LwO A0A;
    public final C19L A0B;
    public final boolean A0C;
    public final Paint A0D;
    public final Path A0E;
    public final GestureDetector A0F;
    public final UserSession A0G;
    public final IgSimpleImageView A0H;
    public final InterfaceC16820sZ A0I;

    public C45696KKz(Context context, UserSession userSession, IgSimpleImageView igSimpleImageView, QuickSnapReactionEmitterView quickSnapReactionEmitterView, MQF mqf, InterfaceC16820sZ interfaceC16820sZ, C19L c19l, int i) {
        super(context);
        this.A0G = userSession;
        this.A0H = igSimpleImageView;
        this.A09 = quickSnapReactionEmitterView;
        this.A0B = c19l;
        this.A06 = i;
        this.A0I = interfaceC16820sZ;
        this.A0E = AMo.A02(i);
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC43592JPx.A1E(A0R);
        A0R.setStrokeWidth(AMo.A00(context, R.dimen.abc_button_padding_horizontal_material));
        this.A0D = A0R;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(7000L);
        LMA.A01(ofFloat, this, 32);
        AbstractC43593JPy.A18(ofFloat);
        LLs.A00(ofFloat, this, 14);
        LLs.A00(ofFloat, this, 15);
        this.A08 = ofFloat;
        this.A03 = C16930sl.A00;
        this.A07 = AbstractC13690mv.A01(context, 32);
        this.A0C = AMo.A09();
        this.A0A = new C49631LwO(context, mqf);
        this.A0F = new GestureDetector(context, new C44907JuL(this, 2));
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A00 > 0.0f) {
            canvas.drawPath(getProgressPath(), this.A0D);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if (X.C18U.A06(r5, r2, 36325484770178152L) != false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setQuickSnapMedia(X.C26086BgF r10, X.InterfaceC11380iw r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45696KKz.setQuickSnapMedia(X.BgF, X.0iw):void");
    }

    public static final void A00(C45696KKz c45696KKz) {
        if (!c45696KKz.A05 && c45696KKz.A04) {
            boolean z = true;
            c45696KKz.A05 = true;
            if (c45696KKz.A00 != 0.0f) {
                z = false;
            }
            IgSimpleImageView igSimpleImageView = c45696KKz.A0H;
            igSimpleImageView.setVisibility(8);
            c45696KKz.A0I();
            Rect A0U = AbstractC166987dD.A0U();
            if (c45696KKz.getGlobalVisibleRect(A0U) && A0U.width() >= c45696KKz.getWidth()) {
                igSimpleImageView.setRotation(c45696KKz.getRotation());
                igSimpleImageView.setImageBitmap(((IgImageView) c45696KKz).A06);
                igSimpleImageView.setX(A0U.left);
                igSimpleImageView.setY(A0U.top);
                igSimpleImageView.setVisibility(0);
                c45696KKz.setVisibility(8);
                igSimpleImageView.post(new RunnableC50010M5z(igSimpleImageView, c45696KKz, z));
                return;
            }
            MPB mpb = c45696KKz.A02;
            if (mpb == null) {
                return;
            }
            mpb.D7M(z);
        }
    }

    private final void setStyle(EnumC46216Kcs enumC46216Kcs) {
        Shader linearGradient;
        Paint paint = this.A0D;
        Context A0L = AbstractC166997dE.A0L(this);
        int i = this.A06;
        int intValue = enumC46216Kcs.A01.intValue();
        int i2 = 0;
        if (intValue != 0) {
            if (intValue == 1) {
                float f = i;
                int[] iArr = enumC46216Kcs.A03;
                int length = iArr.length;
                ArrayList A17 = AbstractC25225BEi.A17(length);
                while (i2 < length) {
                    AbstractC166997dE.A1W(A17, AbstractC167007dF.A09(A0L, iArr[i2]));
                    i2++;
                }
                linearGradient = new RadialGradient(0.0f, 0.0f, f, AbstractC001800i.A0x(A17), (float[]) null, Shader.TileMode.REPEAT);
            } else {
                throw B4Z.A00();
            }
        } else {
            float f2 = i;
            int[] iArr2 = enumC46216Kcs.A03;
            int length2 = iArr2.length;
            ArrayList A172 = AbstractC25225BEi.A17(length2);
            while (i2 < length2) {
                AbstractC166997dE.A1W(A172, AbstractC167007dF.A09(A0L, iArr2[i2]));
                i2++;
            }
            linearGradient = new LinearGradient(0.0f, 0.0f, f2, f2, AbstractC001800i.A0x(A172), (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(linearGradient);
        paint.setAlpha(enumC46216Kcs.A00);
    }

    public final void A0H() {
        ValueAnimator valueAnimator = this.A08;
        if (valueAnimator.isPaused() && this.A00 > 0.0f) {
            this.A04 = true;
            valueAnimator.resume();
        } else {
            if (!this.A04 || valueAnimator.isStarted()) {
                return;
            }
            valueAnimator.start();
        }
    }

    public final void A0I() {
        ValueAnimator valueAnimator = this.A08;
        if (valueAnimator.isRunning() || this.A00 > 0.0f) {
            valueAnimator.cancel();
        }
    }

    public final void setOnConsumeListener(MPB mpb) {
        this.A02 = mpb;
    }

    private final Path getProgressPath() {
        Path A0T = AbstractC166987dD.A0T();
        PathMeasure pathMeasure = new PathMeasure(this.A0E, false);
        pathMeasure.getSegment(0.0f, this.A00 * pathMeasure.getLength(), A0T, true);
        return A0T;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A03 = AbstractC43593JPy.A03(motionEvent, 1523559547);
        boolean z = true;
        if (!this.A04) {
            this.A0I.invoke();
            i = -2117290666;
        } else {
            if (motionEvent.getActionMasked() == 1) {
                A0H();
            }
            z = this.A0F.onTouchEvent(motionEvent);
            i = 1090396836;
        }
        C0f9.A0C(i, A03);
        return z;
    }
}
