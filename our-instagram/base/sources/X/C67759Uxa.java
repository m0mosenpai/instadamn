package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* renamed from: X.Uxa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67759Uxa extends AbstractC66307U8g {
    public static final VK3 A05 = new C66380UEo(1);
    public float A00;
    public VKG A01;
    public boolean A02;
    public final C65726Tt0 A03;
    public final C65717Tsq A04;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            VKG vkg = this.A01;
            AbstractC69617VsK abstractC69617VsK = this.A09;
            if (abstractC69617VsK.A01 == 0 && abstractC69617VsK.A00 == 0) {
                f = 1.0f;
            } else {
                f = super.A00;
            }
            vkg.A00.A00();
            vkg.A02(canvas, f);
            Paint paint = this.A08;
            vkg.A03(canvas, paint);
            vkg.A04(canvas, paint, 0.0f, this.A00, AbstractC69853Vwe.A01(abstractC69617VsK.A05[0], super.A01));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.A01();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        VKG vkg = this.A01;
        if (vkg instanceof C67760Uxb) {
            return -1;
        }
        C67756UxX c67756UxX = (C67756UxX) vkg.A00;
        return c67756UxX.A02 + (c67756UxX.A01 * 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.A03.A01();
        this.A00 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.A02;
        C65726Tt0 c65726Tt0 = this.A03;
        if (z) {
            c65726Tt0.A01();
            this.A00 = i / 10000.0f;
            invalidateSelf();
            return true;
        }
        c65726Tt0.A03 = this.A00 * 10000.0f;
        c65726Tt0.A07 = true;
        c65726Tt0.A09(i);
        return true;
    }

    public C67759Uxa(Context context, AbstractC69617VsK abstractC69617VsK, VKG vkg) {
        super(context, abstractC69617VsK);
        this.A02 = false;
        this.A01 = vkg;
        vkg.A01 = this;
        C65717Tsq c65717Tsq = new C65717Tsq();
        this.A04 = c65717Tsq;
        c65717Tsq.A01(1.0f);
        c65717Tsq.A02(50.0f);
        C65726Tt0 c65726Tt0 = new C65726Tt0(A05, this);
        this.A03 = c65726Tt0;
        c65726Tt0.A01 = c65717Tsq;
        if (super.A00 != 1.0f) {
            super.A00 = 1.0f;
            invalidateSelf();
        }
    }

    @Override // X.AbstractC66307U8g
    public final boolean A02(boolean z, boolean z2, boolean z3) {
        boolean A02 = super.A02(z, z2, z3);
        float f = Settings.Global.getFloat(this.A07.getContentResolver(), "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.A02 = true;
            return A02;
        }
        this.A02 = false;
        this.A04.A02(50.0f / f);
        return A02;
    }
}
