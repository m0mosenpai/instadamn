package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class Q2O extends Drawable implements Animatable, Drawable.Callback {
    public static final List A0i = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final Executor A0j = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new TVJ());
    public int A00;
    public Bitmap A01;
    public Canvas A02;
    public Matrix A03;
    public Matrix A04;
    public Paint A05;
    public Rect A06;
    public Rect A07;
    public Rect A08;
    public RectF A09;
    public RectF A0A;
    public RectF A0B;
    public EnumC61089Rf3 A0C;
    public AbstractC61274Rkk A0D;
    public InterfaceC65194Tfc A0E;
    public SQ2 A0F;
    public EnumC61098RfC A0G;
    public AbstractC61275Rkl A0H;
    public SIb A0I;
    public C62909SWq A0J;
    public C58808QAr A0K;
    public Integer A0L;
    public String A0M;
    public String A0N;
    public Map A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public float A0b;
    public final ChoreographerFrameCallbackC58691Q0f A0c;
    public final Runnable A0d;
    public final ArrayList A0e;
    public final Semaphore A0f;
    public final ValueAnimator.AnimatorUpdateListener A0g;
    public final Matrix A0h;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private void A00(Canvas canvas) {
        C58808QAr c58808QAr = this.A0K;
        SQ2 sq2 = this.A0F;
        if (c58808QAr != null && sq2 != null) {
            Matrix matrix = this.A0h;
            matrix.reset();
            if (!getBounds().isEmpty()) {
                matrix.preScale(r5.width() / sq2.A05.width(), r5.height() / sq2.A05.height());
                matrix.preTranslate(r5.left, r5.top);
            }
            c58808QAr.AQR(canvas, matrix, this.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d2, code lost:
    
        if ((!((android.view.ViewGroup) r1).getClipChildren()) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.graphics.Canvas r9, X.Q2O r10, X.C58808QAr r11) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2O.A01(android.graphics.Canvas, X.Q2O, X.QAr):void");
    }

    public static void A02(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static void A03(Q2O q2o) {
        SQ2 sq2 = q2o.A0F;
        if (sq2 != null) {
            C63136Sdh c63136Sdh = AbstractC62868SUs.A00;
            Rect rect = sq2.A05;
            List emptyList = Collections.emptyList();
            Integer num = C05F.A00;
            C58808QAr c58808QAr = new C58808QAr(sq2, q2o, new SOF(sq2, null, null, null, new Ss5(), null, null, num, num, num, "__container", null, emptyList, Collections.emptyList(), Collections.emptyList(), 0.0f, 0.0f, rect.width(), rect.height(), 0, 0, 0, -1L, -1L, false), sq2.A08);
            q2o.A0K = c58808QAr;
            if (q2o.A0W) {
                c58808QAr.A0E(true);
            }
            q2o.A0K.A01 = q2o.A0Q;
        }
    }

    public static void A04(Q2O q2o) {
        boolean z;
        SQ2 sq2 = q2o.A0F;
        if (sq2 != null) {
            EnumC61098RfC enumC61098RfC = q2o.A0G;
            int i = sq2.A04;
            int ordinal = enumC61098RfC.ordinal();
            if (ordinal != 1 && (ordinal == 2 || i > 4)) {
                z = true;
            } else {
                z = false;
            }
            q2o.A0a = z;
        }
    }

    public static boolean A05(Q2O q2o) {
        SQ2 sq2 = q2o.A0F;
        if (sq2 == null) {
            return false;
        }
        float f = q2o.A0b;
        float A00 = q2o.A0c.A00();
        q2o.A0b = A00;
        if (Math.abs(A00 - f) * sq2.A00() < 50.0f) {
            return false;
        }
        return true;
    }

    public final void A06() {
        ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
        if (choreographerFrameCallbackC58691Q0f.A08) {
            choreographerFrameCallbackC58691Q0f.cancel();
            if (!isVisible()) {
                this.A0L = C05F.A00;
            }
        }
        this.A0F = null;
        this.A0K = null;
        this.A0J = null;
        this.A0b = -3.4028235E38f;
        choreographerFrameCallbackC58691Q0f.A07 = null;
        choreographerFrameCallbackC58691Q0f.A03 = -2.1474836E9f;
        choreographerFrameCallbackC58691Q0f.A02 = 2.1474836E9f;
        invalidateSelf();
    }

    public final void A07() {
        this.A0e.clear();
        ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
        Choreographer.getInstance().removeFrameCallback(choreographerFrameCallbackC58691Q0f);
        choreographerFrameCallbackC58691Q0f.A08 = false;
        Iterator it = choreographerFrameCallbackC58691Q0f.A0C.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(choreographerFrameCallbackC58691Q0f);
        }
        if (!isVisible()) {
            this.A0L = C05F.A00;
        }
    }

    public final void A08() {
        Integer num;
        float A02;
        float A01;
        if (this.A0K == null) {
            this.A0e.add(new C63654SrN(this, 0));
            return;
        }
        A04(this);
        if (this.A0Z || this.A0S || this.A0c.getRepeatCount() == 0) {
            if (isVisible()) {
                ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
                choreographerFrameCallbackC58691Q0f.A08 = true;
                boolean A1P = AbstractC25230BEn.A1P((choreographerFrameCallbackC58691Q0f.A04 > 0.0f ? 1 : (choreographerFrameCallbackC58691Q0f.A04 == 0.0f ? 0 : -1)));
                Iterator it = choreographerFrameCallbackC58691Q0f.A0B.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(choreographerFrameCallbackC58691Q0f, A1P);
                }
                if (choreographerFrameCallbackC58691Q0f.A04 < 0.0f) {
                    A02 = choreographerFrameCallbackC58691Q0f.A01();
                } else {
                    A02 = choreographerFrameCallbackC58691Q0f.A02();
                }
                choreographerFrameCallbackC58691Q0f.A06((int) A02);
                choreographerFrameCallbackC58691Q0f.A06 = 0L;
                choreographerFrameCallbackC58691Q0f.A05 = 0;
                choreographerFrameCallbackC58691Q0f.A05();
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            this.A0L = num;
        }
        if (this.A0Z || this.A0S) {
            return;
        }
        Iterator it2 = A0i.iterator();
        while (true) {
            if (it2.hasNext()) {
                SFO A012 = this.A0F.A01(AbstractC166987dD.A1B(it2));
                if (A012 != null) {
                    A01 = A012.A01;
                    break;
                }
            } else {
                ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f2 = this.A0c;
                if (choreographerFrameCallbackC58691Q0f2.A04 < 0.0f) {
                    A01 = choreographerFrameCallbackC58691Q0f2.A02();
                } else {
                    A01 = choreographerFrameCallbackC58691Q0f2.A01();
                }
            }
        }
        A0D((int) A01);
        this.A0c.A03();
        if (isVisible()) {
            return;
        }
        this.A0L = C05F.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0059 A[LOOP:0: B:36:0x0053->B:38:0x0059, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            r3 = this;
            X.QAr r0 = r3.A0K
            if (r0 != 0) goto L10
            java.util.ArrayList r2 = r3.A0e
            r1 = 1
            X.SrN r0 = new X.SrN
            r0.<init>(r3, r1)
            r2.add(r0)
        Lf:
            return
        L10:
            A04(r3)
            boolean r0 = r3.A0Z
            if (r0 != 0) goto L23
            boolean r0 = r3.A0S
            if (r0 != 0) goto L23
            X.Q0f r0 = r3.A0c
            int r0 = r0.getRepeatCount()
            if (r0 != 0) goto L77
        L23:
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L73
            X.Q0f r2 = r3.A0c
            r0 = 1
            r2.A08 = r0
            r2.A05()
            r0 = 0
            r2.A06 = r0
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L63
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L4d
            float r0 = r2.A01()
        L4a:
            r2.A06(r0)
        L4d:
            java.util.Set r0 = r2.A0C
            java.util.Iterator r1 = r0.iterator()
        L53:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorPauseListener r0 = (android.animation.Animator.AnimatorPauseListener) r0
            r0.onAnimationResume(r2)
            goto L53
        L63:
            float r0 = r2.A01()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L4d
            float r0 = r2.A02()
            goto L4a
        L70:
            java.lang.Integer r0 = X.C05F.A00
            goto L75
        L73:
            java.lang.Integer r0 = X.C05F.A0C
        L75:
            r3.A0L = r0
        L77:
            boolean r0 = r3.A0Z
            if (r0 != 0) goto Lf
            boolean r0 = r3.A0S
            if (r0 != 0) goto Lf
            X.Q0f r2 = r3.A0c
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9e
            float r0 = r2.A02()
        L8c:
            int r0 = (int) r0
            r3.A0D(r0)
            r2.A03()
            boolean r0 = r3.isVisible()
            if (r0 != 0) goto Lf
            java.lang.Integer r0 = X.C05F.A00
            r3.A0L = r0
            return
        L9e:
            float r0 = r2.A01()
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q2O.A09():void");
    }

    public final void A0A(float f) {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            this.A0e.add(new C63656SrP(this, f, 0));
            return;
        }
        ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
        choreographerFrameCallbackC58691Q0f.A07(choreographerFrameCallbackC58691Q0f.A03, AbstractC58321PtD.A01(sq2.A00, sq2.A03, f));
    }

    public final void A0B(float f) {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            this.A0e.add(new C63656SrP(this, f, 2));
        } else {
            A0F((int) AbstractC58321PtD.A01(sq2.A00, sq2.A03, f));
        }
    }

    public final void A0C(float f) {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            this.A0e.add(new C63656SrP(this, f, 1));
            return;
        }
        this.A0c.A06(AbstractC58321PtD.A01(sq2.A00, sq2.A03, f));
    }

    public final void A0D(int i) {
        if (this.A0F == null) {
            this.A0e.add(new C63657SrQ(this, i, 0));
        } else {
            this.A0c.A06(i);
        }
    }

    public final void A0E(int i) {
        if (this.A0F == null) {
            this.A0e.add(new C63657SrQ(this, i, 2));
            return;
        }
        ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
        choreographerFrameCallbackC58691Q0f.A07(choreographerFrameCallbackC58691Q0f.A03, i + 0.99f);
    }

    public final void A0F(int i) {
        if (this.A0F == null) {
            this.A0e.add(new C63657SrQ(this, i, 1));
        } else {
            this.A0c.A07(i, (int) r2.A02);
        }
    }

    public final void A0G(final int i, final int i2) {
        if (this.A0F == null) {
            this.A0e.add(new InterfaceC65306Thi() { // from class: X.SrO
                @Override // X.InterfaceC65306Thi
                public final void ELA(SQ2 sq2) {
                    Q2O.this.A0G(i, i2);
                }
            });
        } else {
            this.A0c.A07(i, i2 + 0.99f);
        }
    }

    public final void A0H(final C63221SfR c63221SfR, final C62961SZe c62961SZe, final Object obj) {
        C58808QAr c58808QAr = this.A0K;
        if (c58808QAr == null) {
            this.A0e.add(new InterfaceC65306Thi() { // from class: X.SrS
                @Override // X.InterfaceC65306Thi
                public final void ELA(SQ2 sq2) {
                    Q2O.this.A0H(c63221SfR, c62961SZe, obj);
                }
            });
            return;
        }
        if (c63221SfR == C63221SfR.A02) {
            c58808QAr.AAj(c62961SZe, obj);
        } else {
            InterfaceC65467Tkj interfaceC65467Tkj = c63221SfR.A00;
            if (interfaceC65467Tkj != null) {
                interfaceC65467Tkj.AAj(c62961SZe, obj);
            } else {
                ArrayList A1E = AbstractC166987dD.A1E();
                c58808QAr.EKH(c63221SfR, new C63221SfR(new String[0]), A1E, 0);
                for (int i = 0; i < A1E.size(); i++) {
                    ((C63221SfR) A1E.get(i)).A00.AAj(c62961SZe, obj);
                }
                if (!AbstractC25226BEj.A1b(A1E)) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj != InterfaceC65609To0.A0S) {
            return;
        }
        A0C(this.A0c.A00());
    }

    public final void A0I(String str) {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            this.A0e.add(new C63658SrR(this, str, 2));
            return;
        }
        SFO A01 = sq2.A01(str);
        if (A01 != null) {
            A0E((int) (A01.A01 + A01.A00));
            return;
        }
        throw AbstractC58320PtC.A0l("Cannot find marker with name ", str, ".");
    }

    public final void A0J(String str) {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            this.A0e.add(new C63658SrR(this, str, 1));
            return;
        }
        SFO A01 = sq2.A01(str);
        if (A01 != null) {
            int i = (int) A01.A01;
            A0G(i, ((int) A01.A00) + i);
            return;
        }
        throw AbstractC58320PtC.A0l("Cannot find marker with name ", str, ".");
    }

    public final void A0K(String str) {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            this.A0e.add(new C63658SrR(this, str, 0));
            return;
        }
        SFO A01 = sq2.A01(str);
        if (A01 != null) {
            A0F((int) A01.A01);
            return;
        }
        throw AbstractC58320PtC.A0l("Cannot find marker with name ", str, ".");
    }

    public final boolean A0L() {
        EnumC61089Rf3 enumC61089Rf3 = this.A0C;
        if (enumC61089Rf3 == null) {
            enumC61089Rf3 = S9I.A00;
        }
        return AbstractC167007dF.A1X(enumC61089Rf3, EnumC61089Rf3.ENABLED);
    }

    public final boolean A0M(SQ2 sq2) {
        float f;
        float f2;
        boolean z = false;
        if (this.A0F != sq2) {
            z = true;
            this.A0U = true;
            A06();
            this.A0F = sq2;
            A03(this);
            ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
            boolean A1Z = AbstractC25229BEm.A1Z(choreographerFrameCallbackC58691Q0f.A07);
            choreographerFrameCallbackC58691Q0f.A07 = sq2;
            if (A1Z) {
                f = Math.max(choreographerFrameCallbackC58691Q0f.A03, sq2.A03);
                f2 = Math.min(choreographerFrameCallbackC58691Q0f.A02, sq2.A00);
            } else {
                f = (int) sq2.A03;
                f2 = (int) sq2.A00;
            }
            choreographerFrameCallbackC58691Q0f.A07(f, f2);
            float f3 = choreographerFrameCallbackC58691Q0f.A00;
            choreographerFrameCallbackC58691Q0f.A00 = 0.0f;
            choreographerFrameCallbackC58691Q0f.A01 = 0.0f;
            choreographerFrameCallbackC58691Q0f.A06((int) f3);
            choreographerFrameCallbackC58691Q0f.A04();
            A0C(choreographerFrameCallbackC58691Q0f.getAnimatedFraction());
            ArrayList arrayList = this.A0e;
            Iterator it = AbstractC166987dD.A1F(arrayList).iterator();
            while (it.hasNext()) {
                InterfaceC65306Thi interfaceC65306Thi = (InterfaceC65306Thi) it.next();
                if (interfaceC65306Thi != null) {
                    interfaceC65306Thi.ELA(sq2);
                }
                it.remove();
            }
            arrayList.clear();
            sq2.A0D.A00 = this.A0X;
            A04(this);
            Drawable.Callback callback = getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(this);
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C58808QAr c58808QAr = this.A0K;
        if (c58808QAr != null) {
            boolean A0L = A0L();
            if (A0L) {
                try {
                    this.A0f.acquire();
                    if (A05(this)) {
                        A0C(this.A0c.A00());
                    }
                } catch (InterruptedException unused) {
                    if (!A0L) {
                        return;
                    }
                } catch (Throwable th) {
                    if (A0L) {
                        this.A0f.release();
                        if (c58808QAr.A00 != this.A0c.A00()) {
                            A0j.execute(this.A0d);
                        }
                    }
                    throw th;
                }
            }
            if (this.A0Y) {
                try {
                    if (this.A0a) {
                        A01(canvas, this, c58808QAr);
                    } else {
                        A00(canvas);
                    }
                } catch (Throwable unused2) {
                }
            } else if (this.A0a) {
                A01(canvas, this, c58808QAr);
            } else {
                A00(canvas);
            }
            this.A0U = false;
            if (A0L) {
                this.A0f.release();
                if (c58808QAr.A00 != this.A0c.A00()) {
                    A0j.execute(this.A0d);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            return -1;
        }
        return sq2.A05.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        SQ2 sq2 = this.A0F;
        if (sq2 == null) {
            return -1;
        }
        return sq2.A05.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (!this.A0U) {
            this.A0U = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = this.A0c;
        if (choreographerFrameCallbackC58691Q0f == null) {
            return false;
        }
        return choreographerFrameCallbackC58691Q0f.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        SQZ.A00("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A0e.clear();
        this.A0c.A03();
        if (!isVisible()) {
            this.A0L = C05F.A00;
        }
    }

    public Q2O() {
        ChoreographerFrameCallbackC58691Q0f choreographerFrameCallbackC58691Q0f = new ChoreographerFrameCallbackC58691Q0f();
        this.A0c = choreographerFrameCallbackC58691Q0f;
        this.A0Z = true;
        this.A0S = false;
        this.A0Y = false;
        this.A0L = C05F.A00;
        this.A0e = AbstractC166987dD.A1E();
        this.A0V = false;
        this.A0Q = true;
        this.A00 = 255;
        this.A0P = false;
        this.A0G = EnumC61098RfC.AUTOMATIC;
        this.A0a = false;
        this.A0h = AbstractC166987dD.A0Q();
        this.A0U = false;
        BFF bff = new BFF(this, 0);
        this.A0g = bff;
        this.A0f = new Semaphore(1);
        this.A0d = new Runnable() { // from class: X.TJS
            @Override // java.lang.Runnable
            public final void run() {
                Q2O q2o = Q2O.this;
                C58808QAr c58808QAr = q2o.A0K;
                if (c58808QAr != null) {
                    try {
                        q2o.A0f.acquire();
                        c58808QAr.A0A(q2o.A0c.A00());
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        q2o.A0f.release();
                        throw th;
                    }
                    q2o.A0f.release();
                }
            }
        };
        this.A0b = -3.4028235E38f;
        choreographerFrameCallbackC58691Q0f.addUpdateListener(bff);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Integer num;
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            Integer num2 = this.A0L;
            if (num2 == C05F.A01) {
                A08();
            } else if (num2 == C05F.A0C) {
                A09();
                return visible;
            }
        } else {
            if (this.A0c.A08) {
                A07();
                num = C05F.A0C;
            } else if (!z3) {
                num = C05F.A00;
            }
            this.A0L = num;
            return visible;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        A08();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
