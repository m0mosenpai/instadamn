package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.9LJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9LJ implements BEd {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public Path A0A;
    public Drawable A0B;
    public C131375wS A0C;
    public C8FD A0D;
    public C89G A0E;
    public CharSequence A0F;
    public Integer A0G;
    public Object A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
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
    public boolean A0b;
    public boolean A0c;
    public final float A0d;
    public final int A0e;
    public final int A0f;
    public final C55982hj A0h;
    public final boolean A0j;
    public final boolean A0k;
    public final float A0l;
    public final int A0m;
    public final UserSession A0q;
    public final Rect A0g = AbstractC166987dD.A0U();
    public final Rect A0o = AbstractC166987dD.A0U();
    public final RectF A0p = AbstractC166987dD.A0X();
    public final Matrix A0n = AbstractC166987dD.A0Q();
    public final float[] A0r = new float[2];
    public final String A0i = AbstractC166987dD.A19(C0HM.A00());

    public C9LJ(Context context, Drawable drawable, UserSession userSession, int i, boolean z, boolean z2) {
        this.A0B = drawable;
        this.A0q = userSession;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C55942hf.A02(10.0d));
        A0R.A00 = 0.01d;
        A0R.A02 = 0.01d;
        A0R.A02();
        A0R.A0A(this);
        this.A0h = A0R;
        this.A0d = 0.95f;
        this.A0l = 1.1f;
        this.A0m = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        this.A0E = new C24156Anf(2);
        this.A0G = C05F.A00;
        this.A04 = 1.0f;
        this.A00 = 1.0f;
        this.A07 = 1.0f;
        this.A06 = 0.05f;
        this.A05 = 20.0f;
        this.A0O = true;
        this.A0N = true;
        this.A0K = true;
        this.A0Q = true;
        this.A0R = true;
        this.A0P = true;
        this.A0S = true;
        this.A0T = true;
        this.A0B.setCallback(this);
        Object obj = this.A0B;
        if (obj instanceof C5RT) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.intf.DynamicDrawable");
            ((C5RT) obj).EYL(this);
        }
        this.A0f = i;
        this.A09 = i;
        this.A0e = i;
        this.A0j = z;
        this.A0k = z2;
    }

    public static final void A03(C9LJ c9lj) {
        Integer num;
        BD3 bd3;
        c9lj.A0U = false;
        A05(c9lj);
        C8FD c8fd = c9lj.A0D;
        if (c8fd != null && (bd3 = c8fd.A02) != null) {
            bd3.DIZ(false);
        }
        C8FD c8fd2 = c9lj.A0D;
        if (c8fd2 != null) {
            num = c8fd2.A03;
        } else {
            num = null;
        }
        if (num == C05F.A00) {
            if (c9lj.A0T) {
                c9lj.A0W = false;
                C55982hj c55982hj = c9lj.A0h;
                c55982hj.A06 = true;
                c55982hj.A06(c9lj.A0d);
            }
            c9lj.Ed5(c9lj.A07);
        }
    }

    @Override // X.BEd
    public final void CAX(Matrix matrix) {
        C14360o3.A0B(matrix, 0);
        float f = this.A03;
        float BdX = BdX();
        float BdY = BdY();
        float f2 = this.A04 * this.A00;
        float f3 = this.A01;
        float f4 = this.A02;
        matrix.reset();
        matrix.preRotate(f, BdX, BdY);
        matrix.preScale(f2, f2, BdX, BdY);
        matrix.preTranslate(f3, f4);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj == this.A0h) {
            if (this.A0W) {
                this.A0W = false;
                EED();
                return;
            }
            if (this.A0b) {
                this.A0b = false;
                AEC();
            } else {
                if (c55982hj.A09.A00 != 1.0d) {
                    return;
                }
                C131375wS c131375wS = this.A0C;
                if (c131375wS != null) {
                    InterfaceC187268Rt interfaceC187268Rt = c131375wS.A00.A09;
                    if (interfaceC187268Rt == null) {
                        return;
                    }
                    ((C187258Rs) interfaceC187268Rt).A00.A07(null);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj == this.A0h) {
            this.A00 = (float) c55982hj.A09.A00;
            A04(this);
            this.A0E.DiN(this.A04 * this.A00);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        Rect rect = this.A0g;
        if (!C14360o3.A0K(rect, drawable.getBounds())) {
            rect.set(drawable.getBounds());
            if (!A06(this.A01, this.A02, this.A04, this.A03)) {
                EZk(0.0f);
                EZl(0.0f);
                Ed5(1.0f);
                Ecu(0.0f);
            }
        }
        A04(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public static final Rect A00(C9LJ c9lj) {
        int i;
        int width;
        int height;
        Rect rect = c9lj.A0o;
        boolean z = c9lj.A0Y;
        C131375wS c131375wS = c9lj.A0C;
        if (z) {
            if (c131375wS != null) {
                C14360o3.A0B(rect, 0);
                InteractiveDrawableContainer interactiveDrawableContainer = c131375wS.A00;
                i = interactiveDrawableContainer.A0d;
                width = interactiveDrawableContainer.getWidth() - i;
                height = interactiveDrawableContainer.getHeight() - i;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (c131375wS != null) {
            i = 0;
            C14360o3.A0B(rect, 0);
            InteractiveDrawableContainer interactiveDrawableContainer2 = c131375wS.A00;
            width = interactiveDrawableContainer2.getWidth();
            height = interactiveDrawableContainer2.getHeight();
        } else {
            throw AbstractC166987dD.A14("Required value was null.");
        }
        rect.set(i, i, width, height);
        return rect;
    }

    public static final RectF A01(C9LJ c9lj, float f, float f2, float f3, float f4) {
        RectF rectF = c9lj.A0p;
        rectF.set(c9lj.A0B.getBounds());
        Matrix matrix = c9lj.A0n;
        matrix.reset();
        float BdX = c9lj.BdX() + (f - c9lj.A01);
        float BdY = c9lj.BdY() + (f2 - c9lj.A02);
        matrix.preRotate(f4 % 360.0f, BdX, BdY);
        matrix.preScale(f3, f3, BdX, BdY);
        matrix.preTranslate(f, f2);
        matrix.mapRect(rectF, rectF);
        return rectF;
    }

    public static final void A02(C9LJ c9lj) {
        C8FD c8fd = c9lj.A0D;
        if (c8fd != null) {
            c9lj.A0U = true;
            A05(c9lj);
            c9lj.Ecu(0.0f);
            c9lj.EZk(0.0f);
            c9lj.EZl(c8fd.A00);
            c9lj.Ed5(c8fd.A01);
            BD3 bd3 = c8fd.A02;
            if (bd3 != null) {
                bd3.DIZ(true);
            }
        }
    }

    public static final void A04(C9LJ c9lj) {
        C131375wS c131375wS = c9lj.A0C;
        if (c131375wS != null) {
            c131375wS.A00.postInvalidate();
        }
    }

    public static final void A05(C9LJ c9lj) {
        Integer num;
        boolean z = !c9lj.A0U;
        c9lj.A0T = z;
        c9lj.A0P = z;
        c9lj.A0S = z;
        C8FD c8fd = c9lj.A0D;
        if (c8fd != null) {
            num = c8fd.A03;
        } else {
            num = null;
        }
        if (num == C05F.A00) {
            c9lj.A0R = z;
            c9lj.A0Q = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r5.A0Y != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A06(float r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            boolean r0 = r5.A0Z
            if (r0 != 0) goto L9
            boolean r1 = r5.A0Y
            r0 = 0
            if (r1 == 0) goto La
        L9:
            r0 = 1
        La:
            r4 = 1
            if (r0 == 0) goto L23
            boolean r0 = A07(r5, r6, r7, r8, r9)
            if (r0 != 0) goto L23
            com.instagram.common.session.UserSession r3 = r5.A0q
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322766055549433(0x810b5d000029f9, double:3.034001741344164E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L23
            r4 = 0
        L23:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LJ.A06(float, float, float, float):boolean");
    }

    @Override // X.BEd
    public final void AEC() {
        C55982hj c55982hj = this.A0h;
        if (!c55982hj.A0C()) {
            this.A0b = true;
        } else {
            c55982hj.A08(this.A0d, true);
            c55982hj.A06(this.A0l);
        }
    }

    @Override // X.BEd
    public final int AJl(float f, float f2) {
        Matrix matrix = this.A0n;
        matrix.reset();
        float f3 = this.A04 * this.A00;
        matrix.preScale(f3, f3, BdX(), BdY());
        matrix.preTranslate(this.A01, this.A02);
        RectF rectF = this.A0p;
        rectF.set(this.A0B.getBounds());
        matrix.mapRect(rectF, rectF);
        float[] fArr = this.A0r;
        fArr[0] = f;
        fArr[1] = f2;
        matrix.reset();
        matrix.preRotate(-this.A03, BdX(), BdY());
        matrix.mapPoints(fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        if (rectF.contains(f4, f5)) {
            return 0;
        }
        float f6 = this.A0m;
        rectF.inset(-Math.max(0.0f, (f6 - rectF.width()) / 2.0f), -Math.max(0.0f, (f6 - rectF.height()) / 2.0f));
        if (rectF.contains(f4, f5)) {
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BD4
    public final Drawable Afg() {
        Drawable drawable = this.A0B;
        if (drawable instanceof C5RO) {
            C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.timedstickers.intf.BaseTimedStickerDrawable");
            return ((C5RO) drawable).Afg();
        }
        return drawable;
    }

    @Override // X.BEd
    public final float BdX() {
        return this.A01 + this.A0B.getBounds().exactCenterX();
    }

    @Override // X.BEd
    public final float BdY() {
        return this.A02 + this.A0B.getBounds().exactCenterY();
    }

    @Override // X.BD4
    public final Object C4x() {
        Object obj = this.A0H;
        if (obj != null) {
            return obj;
        }
        C14360o3.A0F("tag");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    @Override // X.BEd
    public final void Cp4(boolean z) {
        if (this.A0L) {
            if (!this.A0c || z) {
                Object obj = this.A0B;
                ?? obj2 = new Object();
                obj2.A00 = obj;
                if (obj instanceof C5RO) {
                    obj = ((C5RO) obj).Afg();
                    obj2.A00 = obj;
                }
                if (obj instanceof C194808jg) {
                    obj = ((C194808jg) obj).A04();
                    obj2.A00 = obj;
                }
                if ((obj instanceof C5RP) && ((C5RP) obj).isLoading()) {
                    ((C5RP) obj2.A00).A9I(new C23669Ae4(3, obj2, this));
                } else {
                    AbstractC62819SSr.A00((Drawable) obj2.A00, this);
                }
                this.A0c = true;
            }
        }
    }

    @Override // X.BEd
    public final void EED() {
        C55982hj c55982hj = this.A0h;
        if (!c55982hj.A0C()) {
            this.A0W = true;
        } else {
            c55982hj.A06 = false;
            c55982hj.A03();
        }
    }

    @Override // X.BEd
    public final void EZk(float f) {
        if (A06(f, this.A02, this.A04, this.A03)) {
            this.A01 = f;
            A04(this);
            this.A0E.DWV(this.A01);
        }
    }

    @Override // X.BEd
    public final void EZl(float f) {
        if (A06(this.A01, f, this.A04, this.A03)) {
            this.A02 = f;
            A04(this);
            this.A0E.DWW(this.A02);
        }
    }

    @Override // X.BEd
    public final void Ecu(float f) {
        if (A06(this.A01, this.A02, this.A04, f)) {
            this.A03 = f;
            A04(this);
            this.A0E.DhY(this.A03);
        }
    }

    @Override // X.BEd
    public final void Ed5(float f) {
        BD3 bd3;
        if (A06(this.A01, this.A02, f, this.A03)) {
            this.A04 = f;
            this.A04 = Math.min(this.A05, Math.max(f, this.A06));
            A04(this);
            this.A0E.DiN(this.A04 * this.A00);
            C8FD c8fd = this.A0D;
            if (c8fd != null && (bd3 = c8fd.A02) != null) {
                bd3.DiN(this.A04 * this.A00);
            }
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        BEd bEd = (BEd) obj;
        C14360o3.A0B(bEd, 0);
        int i = this.A08;
        C9LJ c9lj = (C9LJ) bEd;
        int i2 = c9lj.A08;
        if (i == i2) {
            i = this.A09;
            i2 = c9lj.A09;
        }
        return i - i2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof BEd) && this.A0f == ((C9LJ) ((BD4) obj)).A0f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A0f;
    }

    public static final boolean A07(C9LJ c9lj, float f, float f2, float f3, float f4) {
        RectF A01 = A01(c9lj, f, f2, f3, f4);
        Rect A00 = A00(c9lj);
        if (A01.left >= A00.left && A01.right <= A00.right && A01.top >= A00.top && A01.bottom <= A00.bottom) {
            return true;
        }
        return false;
    }

    @Override // X.BEd
    public final void Are(Path path, RectF rectF) {
        boolean A1a = AbstractC167017dG.A1a(path, rectF);
        Rect A0W = AbstractC166987dD.A0W(this.A0B);
        Matrix matrix = this.A0n;
        CAX(matrix);
        if (this.A0A != null) {
            matrix.preTranslate(A0W.left, A0W.top);
            Path path2 = this.A0A;
            if (path2 != null) {
                path2.transform(matrix, path);
            }
            path.computeBounds(rectF, A1a);
            return;
        }
        rectF.set(A0W);
        matrix.mapRect(rectF);
    }
}
