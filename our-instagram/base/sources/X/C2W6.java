package X;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.2W6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2W6 {
    public final boolean A00;
    public final Drawable A01;
    public final C78573fP A02;

    public final int A00() {
        float f;
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        if (fArr != null) {
            f = fArr[2];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final int A01() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.BOTTOM));
    }

    public final int A02() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.LEFT));
    }

    public final int A03() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.RIGHT));
    }

    public final int A04() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.TOP));
    }

    public final int A05() {
        float f;
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        if (fArr != null) {
            f = fArr[1];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final EnumC78563fO A06() {
        EnumC78563fO layoutDirection = this.A02.A0K.getLayoutDirection();
        C14360o3.A07(layoutDirection);
        return AbstractC78553fN.A01(AbstractC78553fN.A00(layoutDirection));
    }

    public C2W6(Drawable drawable, C78573fP c78573fP, boolean z) {
        this.A02 = c78573fP;
        this.A00 = z;
        this.A01 = drawable;
    }
}
