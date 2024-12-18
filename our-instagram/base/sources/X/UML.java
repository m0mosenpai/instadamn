package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.io.Closeable;

/* loaded from: classes11.dex */
public abstract class UML extends UMM implements Closeable, InterfaceC59242nQ, Drawable.Callback, InterfaceC162877Qy, InterfaceC59312na, InterfaceC162887Qz {
    public static final C17u A02 = new C17u(0, 3);
    public Rect A00;
    public InterfaceC107934tc A01;

    public UML() {
        super(new Drawable[4], 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A06(float f) {
        Animatable animatable;
        Animatable animatable2;
        Drawable A022 = A02(2);
        if (A022 != 0) {
            boolean z = A022 instanceof Animatable;
            if (f >= 0.999f) {
                if (z && (animatable2 = (Animatable) A022) != null) {
                    animatable2.stop();
                }
            } else if (z && (animatable = (Animatable) A022) != null) {
                animatable.start();
            }
            A022.setLevel(Math.round(f * 10000.0f));
        }
    }

    @Override // X.InterfaceC59242nQ
    public final boolean CL2() {
        return A02(1) != null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Animatable animatable;
        Object A022 = A02(0);
        if ((A022 instanceof Animatable) && (animatable = (Animatable) A022) != null) {
            animatable.stop();
        }
        C17u c17u = A02;
        int i = c17u.A00;
        int i2 = c17u.A01;
        if (i > i2) {
            return;
        }
        while (true) {
            A03(null, i);
            if (i != i2) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void A05() {
        ((UMM) this).A02++;
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        int[] iArr = this.A08;
        iArr[0] = 0;
        invalidateSelf();
        zArr[2] = false;
        iArr[2] = 0;
        invalidateSelf();
        A04(1);
        ((UMM) this).A02--;
        invalidateSelf();
    }

    public final void A07(int i) {
        ((UMM) this).A01 = i;
        if (((UMM) this).A03 == 1) {
            ((UMM) this).A03 = 0;
        }
        ((UMM) this).A02++;
        ((UMM) this).A03 = 0;
        boolean[] zArr = this.A0A;
        zArr[0] = false;
        invalidateSelf();
        ((UMM) this).A03 = 0;
        zArr[2] = false;
        invalidateSelf();
        ((UMM) this).A03 = 0;
        zArr[1] = true;
        invalidateSelf();
        ((UMM) this).A02--;
        invalidateSelf();
    }

    @Override // X.AbstractC66312U8l, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        InterfaceC107934tc interfaceC107934tc = this.A01;
        if (interfaceC107934tc != null) {
            interfaceC107934tc.E1A(z);
        }
        return super.setVisible(z, z2);
    }

    @Override // X.InterfaceC59242nQ
    public final void EhD(InterfaceC107934tc interfaceC107934tc) {
        this.A01 = interfaceC107934tc;
    }
}
