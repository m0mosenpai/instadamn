package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9TN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9TN extends ScaleGestureDetector.SimpleOnScaleGestureListener implements View.OnTouchListener, InterfaceGestureDetectorOnGestureListenerC149756oS {
    public float A00;
    public float[] A01;
    public final TextureView A02;
    public final C8JS A03;
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final UserSession A06;
    public final BDO A07;

    public C9TN(Context context, TextureView textureView, UserSession userSession, BDO bdo, C8JS c8js) {
        AbstractC167007dF.A1F(c8js, 2, userSession);
        this.A03 = c8js;
        this.A02 = textureView;
        this.A06 = userSession;
        this.A07 = bdo;
        this.A05 = new ScaleGestureDetector(context, this);
        this.A04 = new GestureDetector(context, this);
        this.A01 = new float[9];
        this.A00 = 1.0f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2 < 1.0f) goto L6;
     */
    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            float r5 = r7.getScaleFactor()
            float r3 = r6.A00
            float r2 = r3 * r5
            r6.A00 = r2
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L1a
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e
        L1a:
            r6.A00 = r1
            float r5 = r1 / r3
        L1e:
            X.8JS r4 = r6.A03
            android.graphics.Matrix r3 = r4.A0A
            android.view.TextureView r2 = r6.A02
            float r1 = r2.getPivotX()
            float r0 = r2.getPivotY()
            r3.postScale(r5, r5, r1, r0)
            r6.A00()
            android.graphics.Matrix r0 = r4.A0A
            r2.setTransform(r0)
            r2.invalidate()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9TN.onScale(android.view.ScaleGestureDetector):boolean");
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        if (motionEvent2.getPointerCount() == 1) {
            this.A07.Diu(-f);
        } else if (motionEvent2.getPointerCount() == 2) {
            float f3 = -f;
            TextureView textureView = this.A02;
            float A07 = AbstractC166987dD.A07(textureView);
            float A072 = AbstractC166987dD.A07(textureView);
            C8JS c8js = this.A03;
            if (A072 * c8js.A00 * c8js.A04 * this.A00 <= A07) {
                f3 = 0.0f;
            }
            float f4 = -f2;
            if (AbstractC166987dD.A08(textureView) * c8js.A01 * c8js.A05 * this.A00 <= AbstractC166987dD.A08(textureView)) {
                f4 = 0.0f;
            }
            c8js.A0A.postTranslate(f3, f4);
            A00();
            textureView.setTransform(c8js.A0A);
            textureView.invalidate();
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        this.A04.onTouchEvent(motionEvent);
        if (this.A07.CWH()) {
            this.A05.onTouchEvent(motionEvent);
        }
        return false;
    }

    private final void A00() {
        C8JS c8js = this.A03;
        Matrix matrix = c8js.A0A;
        Matrix matrix2 = matrix;
        if (c8js.A04 != 1.0f || c8js.A05 != 1.0f) {
            matrix2 = new Matrix(matrix);
            float f = c8js.A04;
            float f2 = c8js.A05;
            TextureView textureView = this.A02;
            matrix2.preScale(f, f2, textureView.getPivotX(), textureView.getPivotY());
        }
        float[] fArr = this.A01;
        matrix2.getValues(fArr);
        float f3 = fArr[2];
        float f4 = fArr[5];
        TextureView textureView2 = this.A02;
        float A07 = AbstractC166987dD.A07(textureView2);
        float A072 = AbstractC166987dD.A07(textureView2) * c8js.A00 * c8js.A04 * this.A00;
        float f5 = 0.0f;
        float f6 = A07 - A072;
        float f7 = 0.0f;
        if (A072 <= A07) {
            f7 = f6;
            f6 = 0.0f;
        }
        if (f3 < f6) {
            f5 = (-f3) + f6;
        } else if (f3 > f7) {
            f5 = (-f3) + f7;
        }
        float A08 = AbstractC166987dD.A08(textureView2);
        float A082 = AbstractC166987dD.A08(textureView2) * c8js.A01 * c8js.A05 * this.A00;
        float f8 = 0.0f;
        float f9 = A08 - A082;
        float f10 = 0.0f;
        if (A082 <= A08) {
            f10 = f9;
            f9 = 0.0f;
        }
        if (f4 < f9) {
            f8 = (-f4) + f9;
        } else if (f4 > f10) {
            f8 = (-f4) + f10;
        }
        if (f5 == 0.0f && f8 == 0.0f) {
            return;
        }
        c8js.A0A.postTranslate(f5, f8);
    }

    public final void A01() {
        this.A00 = 1.0f;
        C8JS c8js = this.A03;
        Matrix A0Q = AbstractC166987dD.A0Q();
        c8js.A0A = A0Q;
        float f = c8js.A00;
        float f2 = c8js.A01;
        TextureView textureView = this.A02;
        A0Q.setScale(f, f2, textureView.getPivotX(), textureView.getPivotY());
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        C22C A01 = AnonymousClass229.A01(this.A06);
        EnumC50631MWs enumC50631MWs = ((C22F) A01).A04.A0C;
        if (A01.A0J() != null && enumC50631MWs != null) {
            A01.A1R(enumC50631MWs, "MULTITOUCH_ON_IMPORT_PREVIEW_PLAYER");
        }
        C8JS c8js = this.A03;
        float f = this.A00;
        float f2 = f * c8js.A00;
        float f3 = f * c8js.A01;
        c8js.A02 = f2;
        c8js.A03 = f3;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.A07.Dmn();
        return false;
    }
}
