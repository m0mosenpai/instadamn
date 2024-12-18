package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import java.util.LinkedList;

/* renamed from: X.BYv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C25735BYv extends View {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public LinearGradient A0A;
    public RadialGradient A0B;
    public RadialGradient A0C;
    public C28278CdN A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public long A0K;
    public C28278CdN A0L;
    public C76 A0M;
    public final float A0N;
    public final int A0O;
    public final Matrix A0P;
    public final Matrix A0Q;
    public final Paint A0R;
    public final Path A0S;
    public final ChoreographerFrameCallbackC28589CjU A0T;
    public final LinkedList A0U;
    public final float[] A0V;
    public final Path A0W;
    public final float[] A0X;
    public static final int[] A0c = {Color.rgb(1, 126, 221), Color.rgb(95, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 193), Color.rgb(95, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION, 193), Color.rgb(8, 167, 242), Color.rgb(0, 95, 227), Color.rgb(236, 125, 217), Color.rgb(252, 145, 217), Color.rgb(228, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, 216), Color.rgb(68, 109, 223), Color.rgb(1, 85, 221)};
    public static final float[] A0Z = {0.03f, 0.31f, 0.36f, 0.41f, 0.57f, 0.64f, 0.66f, 0.7f, 0.84f, 0.95f};
    public static final int[] A0b = {0, 0, Color.argb(100, 255, 255, 255), 0, Color.argb(100, 255, 255, 255)};
    public static final float[] A0Y = {0.0f, 0.7f, 0.7f, 0.85f, 1.0f};
    public static final int[] A0d = {0, 0, Color.argb(65, 0, 97, 229), 0};
    public static final float[] A0a = {0.0f, 0.7f, 0.85f, 1.0f};

    public C25735BYv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1R(A0R);
        A0R.setAntiAlias(true);
        this.A0R = A0R;
        this.A0M = C76.A05;
        this.A0D = new C28278CdN(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        this.A0L = new C28278CdN(0.5f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        this.A0H = 1.0f;
        this.A0N = 0.1f;
        this.A05 = 1.0f;
        this.A0Q = new Matrix();
        this.A0P = new Matrix();
        this.A0S = AbstractC166987dD.A0T();
        this.A0W = AbstractC166987dD.A0T();
        this.A0I = 1.0f;
        this.A0U = new LinkedList();
        this.A0O = 10;
        this.A0V = new float[]{1.0f, 1.0f, 1.0f};
        this.A0X = new float[]{1.0f, 1.0f, 1.0f};
        this.A0F = 1.0f;
        this.A0J = 1.0f;
        this.A0T = new ChoreographerFrameCallbackC28589CjU(this);
        getWidth();
        getHeight();
        A00();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        AbstractC25235BEs.A1D(canvas, new D8X(canvas, this, AbstractC166987dD.A07(this) / 2.0f, AbstractC166987dD.A08(this) / 2.0f, (this.A0D.A04 * 0.05f) + 1.0f));
        this.A0Q.reset();
        this.A0P.reset();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (i != 4 && i != 8) {
            if (!this.A0E) {
                Choreographer.getInstance().postFrameCallback(this.A0T);
                this.A0E = true;
                return;
            }
            return;
        }
        if (!this.A0E) {
            return;
        }
        Choreographer.getInstance().removeFrameCallback(this.A0T);
        this.A0E = false;
    }

    public final void setSpeechIndicatorState(C76 c76) {
        C14360o3.A0B(c76, 0);
        setState(c76);
    }

    private final void A00() {
        int[] iArr = A0c;
        float[] fArr = A0Z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A0A = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, iArr, fArr, tileMode);
        this.A0B = new RadialGradient(0.0f, 0.0f, 50.0f, A0b, A0Y, tileMode);
        this.A0C = new RadialGradient(0.0f, 0.0f, 50.0f, A0d, A0a, tileMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C25735BYv r16, long r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25735BYv.A01(X.BYv, long):void");
    }

    private final void setState(C76 c76) {
        C28278CdN c28278CdN;
        if (this.A0M != c76) {
            this.A0M = c76;
            switch (c76.ordinal()) {
                case 0:
                    c28278CdN = new C28278CdN(0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                    break;
                case 1:
                case 5:
                    c28278CdN = new C28278CdN(0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                    break;
                case 2:
                    c28278CdN = new C28278CdN(1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0013f, 0.0f, 1.0f);
                    break;
                case 3:
                    c28278CdN = new C28278CdN(1.0f, 0.3f, 2.0f, 0.0f, 0.0f, 3.0f, 0.001f, 1.0f, 1.0f);
                    break;
                case 4:
                    c28278CdN = new C28278CdN(1.0f, 0.0f, 4.0f, 0.3f, 1.0f, 0.0f, 0.001f, 0.0f, 1.0f);
                    break;
                default:
                    throw B4Z.A00();
            }
            this.A0L = c28278CdN;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1297412515);
        super.onDetachedFromWindow();
        if (this.A0E) {
            Choreographer.getInstance().removeFrameCallback(this.A0T);
            this.A0E = false;
        }
        C0f9.A0D(-1665155838, A06);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1428374511);
        super.onSizeChanged(i, i2, i3, i4);
        A01(this, this.A0K);
        A00();
        invalidate();
        C0f9.A0D(-1743219331, A06);
    }
}
