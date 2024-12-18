package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.U8k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66311U8k extends Drawable implements Drawable.Callback {
    public int A00;
    public Drawable A01;
    public InterfaceC161177Kc A03;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public float A09;
    public final Context A0A;
    public String A04 = "";
    public EnumC53112NeP A02 = EnumC53112NeP.A03;
    public final C69523Vqn A0C = new C69523Vqn(this);
    public final U99 A0B = new U99(this);

    public static final void A00(C66311U8k c66311U8k) {
        InterfaceC58682mR interfaceC58682mR;
        c66311U8k.A06 = false;
        Object obj = c66311U8k.A01;
        if (obj != null && (obj instanceof InterfaceC58682mR) && (interfaceC58682mR = (InterfaceC58682mR) obj) != null) {
            interfaceC58682mR.stop();
        }
        InterfaceC161177Kc interfaceC161177Kc = c66311U8k.A03;
        if (interfaceC161177Kc != null) {
            EnumC53112NeP enumC53112NeP = c66311U8k.A02;
            C69523Vqn c69523Vqn = c66311U8k.A0C;
            C161167Kb c161167Kb = (C161167Kb) interfaceC161177Kc;
            synchronized (c161167Kb) {
                AbstractC167007dF.A1K(enumC53112NeP, c69523Vqn);
                C69071VhM c69071VhM = (C69071VhM) c161167Kb.A03.get(enumC53112NeP);
                if (c69071VhM != null) {
                    AnonymousClass016.A17(c69071VhM.A01, new C206999Ee(c69523Vqn, 30));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        InterfaceC58682mR interfaceC58682mR;
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A01;
        if (drawable != 0) {
            if ((drawable instanceof InterfaceC58682mR) && (interfaceC58682mR = (InterfaceC58682mR) drawable) != null && interfaceC58682mR.isFinished()) {
                return;
            }
            if (this.A05) {
                A01(this);
            }
            float f = this.A08;
            float f2 = this.A09;
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (drawable.equals(this.A01)) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A05 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C66311U8k c66311U8k) {
        InterfaceC58682mR interfaceC58682mR;
        Drawable drawable = c66311U8k.A01;
        if (drawable != 0) {
            int A0F = AbstractC166997dE.A0F(c66311U8k);
            if (drawable.getBounds().isEmpty()) {
                drawable.setBounds(0, 0, 1, 1);
            }
            if ((drawable instanceof InterfaceC58682mR) && (interfaceC58682mR = (InterfaceC58682mR) drawable) != null && interfaceC58682mR.isPlaying() && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0) {
                c66311U8k.A05 = false;
                EnumC53112NeP enumC53112NeP = c66311U8k.A02;
                EnumC53112NeP enumC53112NeP2 = EnumC53112NeP.A03;
                int A0H = AbstractC166997dE.A0H(c66311U8k);
                int i = c66311U8k.A00;
                if (enumC53112NeP == enumC53112NeP2) {
                    i /= 2;
                }
                int min = Math.min(A0H - i, AbstractC69815Vw1.A00(c66311U8k.A0A, 200.0f));
                int intrinsicHeight = (drawable.getIntrinsicHeight() * min) / drawable.getIntrinsicWidth();
                c66311U8k.A08 = A0F - (min / 2);
                c66311U8k.A09 = (c66311U8k.getBounds().top - intrinsicHeight) + AbstractC69815Vw1.A00(r4, 2.0f);
                drawable.setBounds(0, 0, min, intrinsicHeight);
            }
        }
    }

    public C66311U8k(Context context) {
        this.A0A = context;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167017dG.A1N(drawable, runnable);
        if (drawable.equals(this.A01)) {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167017dG.A1N(drawable, runnable);
        if (drawable.equals(this.A01)) {
            unscheduleSelf(runnable);
        }
    }
}
