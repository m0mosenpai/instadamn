package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.ABt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22994ABt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public final int A0A;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.8RI, X.8RJ] */
    public final C8RJ A00() {
        C216599iG c216599iG = (C216599iG) this;
        final int i = c216599iG.A0A;
        ?? c8ri = new C8RI(i, c216599iG.A01, c216599iG.A05, ((AbstractC22994ABt) c216599iG).A00);
        final int i2 = c216599iG.A03;
        if (i2 > 0) {
            final int i3 = c216599iG.A05;
            final int i4 = c216599iG.A00;
            final boolean z = true;
            C8RL c8rl = new C8RL(i2, i, i3, i4, z) { // from class: X.9iI
                public final int A00;
                public final boolean A01;
                public final int A02;

                {
                    this.A00 = i3;
                    this.A02 = i4;
                    this.A01 = z;
                }

                @Override // X.C8RL, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
                    float f = A0Q.left;
                    float f2 = A0Q.top;
                    float width = A0Q.width();
                    float height = A0Q.height();
                    float width2 = A0Q.width() / 2;
                    float width3 = A0Q.width() / 2;
                    float f3 = this.A02;
                    Path A0T = AbstractC166987dD.A0T();
                    float f4 = height - (2.0f * width3);
                    float f5 = this.A00;
                    float f6 = (height - (2.0f * f3)) - f5;
                    float f7 = f5 / 2.0f;
                    float f8 = ((width - width2) + f3) - f7;
                    if (this.A01) {
                        A0T.moveTo(f + width2, f2);
                        float f9 = -width2;
                        A0T.rQuadTo(f9, 0.0f, f9, width3);
                        A0T.rLineTo(0.0f, f4);
                        A0T.rQuadTo(0.0f, width3, width2, width3);
                        A0T.rLineTo(f8, 0.0f);
                        float f10 = -f7;
                        A0T.rLineTo(0.0f, f10);
                        float f11 = -f3;
                        A0T.rQuadTo(f11, 0.0f, f11, f11);
                        A0T.rLineTo(0.0f, -f6);
                        A0T.rQuadTo(0.0f, f11, f3, f11);
                        A0T.rLineTo(0.0f, f10);
                    } else {
                        A0T.moveTo((f - f3) + f7, f2);
                        A0T.rLineTo(0.0f, f7);
                        A0T.rQuadTo(f3, 0.0f, f3, f3);
                        A0T.rLineTo(0.0f, f6);
                        A0T.rQuadTo(0.0f, f3, -f3, f3);
                        A0T.rLineTo(0.0f, f7);
                        A0T.rLineTo(f8, 0.0f);
                        float f12 = -width3;
                        A0T.rQuadTo(width2, 0.0f, width2, f12);
                        A0T.rLineTo(0.0f, -f4);
                        A0T.rQuadTo(0.0f, f12, -width2, f12);
                    }
                    A0T.close();
                    canvas.drawPath(A0T, this.A03);
                    Drawable drawable = super.A00;
                    if (drawable != null) {
                        canvas.save();
                        AbstractC167007dF.A0u(canvas, drawable, A0Q.left + (A0Q.width() / 2), A0Q.top + (A0Q.height() / 2));
                    }
                }
            };
            c8rl.A00(c216599iG.A06, 0);
            c8ri.A08(c8rl);
        }
        final int i5 = c216599iG.A04;
        if (i5 > 0) {
            final int i6 = c216599iG.A05;
            final int i7 = c216599iG.A00;
            final boolean z2 = false;
            C8RL c8rl2 = new C8RL(i5, i, i6, i7, z2) { // from class: X.9iI
                public final int A00;
                public final boolean A01;
                public final int A02;

                {
                    this.A00 = i6;
                    this.A02 = i7;
                    this.A01 = z2;
                }

                @Override // X.C8RL, android.graphics.drawable.Drawable
                public final void draw(Canvas canvas) {
                    Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
                    float f = A0Q.left;
                    float f2 = A0Q.top;
                    float width = A0Q.width();
                    float height = A0Q.height();
                    float width2 = A0Q.width() / 2;
                    float width3 = A0Q.width() / 2;
                    float f3 = this.A02;
                    Path A0T = AbstractC166987dD.A0T();
                    float f4 = height - (2.0f * width3);
                    float f5 = this.A00;
                    float f6 = (height - (2.0f * f3)) - f5;
                    float f7 = f5 / 2.0f;
                    float f8 = ((width - width2) + f3) - f7;
                    if (this.A01) {
                        A0T.moveTo(f + width2, f2);
                        float f9 = -width2;
                        A0T.rQuadTo(f9, 0.0f, f9, width3);
                        A0T.rLineTo(0.0f, f4);
                        A0T.rQuadTo(0.0f, width3, width2, width3);
                        A0T.rLineTo(f8, 0.0f);
                        float f10 = -f7;
                        A0T.rLineTo(0.0f, f10);
                        float f11 = -f3;
                        A0T.rQuadTo(f11, 0.0f, f11, f11);
                        A0T.rLineTo(0.0f, -f6);
                        A0T.rQuadTo(0.0f, f11, f3, f11);
                        A0T.rLineTo(0.0f, f10);
                    } else {
                        A0T.moveTo((f - f3) + f7, f2);
                        A0T.rLineTo(0.0f, f7);
                        A0T.rQuadTo(f3, 0.0f, f3, f3);
                        A0T.rLineTo(0.0f, f6);
                        A0T.rQuadTo(0.0f, f3, -f3, f3);
                        A0T.rLineTo(0.0f, f7);
                        A0T.rLineTo(f8, 0.0f);
                        float f12 = -width3;
                        A0T.rQuadTo(width2, 0.0f, width2, f12);
                        A0T.rLineTo(0.0f, -f4);
                        A0T.rQuadTo(0.0f, f12, -width2, f12);
                    }
                    A0T.close();
                    canvas.drawPath(A0T, this.A03);
                    Drawable drawable = super.A00;
                    if (drawable != null) {
                        canvas.save();
                        AbstractC167007dF.A0u(canvas, drawable, A0Q.left + (A0Q.width() / 2), A0Q.top + (A0Q.height() / 2));
                    }
                }
            };
            c8rl2.A00(c216599iG.A08, c216599iG.A05);
            c8ri.A09(c8rl2);
        }
        c8ri.A06(c216599iG.A02);
        return c8ri;
    }

    public AbstractC22994ABt(int i, int i2) {
        this.A0A = i;
        this.A05 = i2;
    }
}
