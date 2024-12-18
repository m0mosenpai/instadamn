package X;

import android.graphics.Rect;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2W3, reason: invalid class name */
/* loaded from: classes.dex */
public class C2W3 implements C2W5 {
    public final C2XE A00;
    public final C2W1 A01;
    public final C78573fP A02;
    public final List A03;

    public C2W3(C2XE c2xe, C2W1 c2w1, C78573fP c78573fP) {
        C14360o3.A0B(c2xe, 1);
        this.A00 = c2xe;
        this.A01 = c2w1;
        this.A02 = c78573fP;
        this.A03 = new ArrayList();
    }

    @Override // X.C2W5
    public final /* bridge */ /* synthetic */ C2WC Bmi() {
        return null;
    }

    public final int A00() {
        return C2WL.A00(this.A02.A0K.getLayoutBorder(EnumC77763e0.LEFT));
    }

    public final int A01() {
        return C2WL.A00(this.A02.A0K.getLayoutBorder(EnumC77763e0.RIGHT));
    }

    public final int A02() {
        return (int) Float.intBitsToFloat((int) (this.A02.A02 >> 32));
    }

    public C2W1 A04() {
        return this.A01;
    }

    public void A05() {
        C78573fP c78573fP = this.A02;
        c78573fP.A03 = null;
        ((YogaNodeJNIBase) c78573fP.A0K).mData = null;
        List list = this.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C2W3) list.get(i)).A05();
        }
    }

    @Override // X.C2W5
    public final /* bridge */ /* synthetic */ C2W5 AnV(int i) {
        return (C2W3) this.A03.get(i);
    }

    @Override // X.C2W5
    public final int Ang() {
        return this.A03.size();
    }

    @Override // X.C2W5
    public final Object BMS() {
        return this.A02.A0B;
    }

    @Override // X.C2W5
    public final int Bat() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.BOTTOM));
    }

    @Override // X.C2W5
    public final int Bau() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.LEFT));
    }

    @Override // X.C2W5
    public final int Baw() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.RIGHT));
    }

    @Override // X.C2W5
    public final int Bax() {
        return C2WL.A00(this.A02.A0K.getLayoutPadding(EnumC77763e0.TOP));
    }

    @Override // X.C2W5
    public int CI4(int i) {
        float f;
        float[] fArr = ((YogaNodeJNIBase) ((C2W3) this.A03.get(i)).A02.A0K).arr;
        if (fArr != null) {
            f = fArr[3];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    @Override // X.C2W5
    public int CIb(int i) {
        float f;
        float[] fArr = ((YogaNodeJNIBase) ((C2W3) this.A03.get(i)).A02.A0K).arr;
        if (fArr != null) {
            f = fArr[4];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    @Override // X.C2W5
    public final int getHeight() {
        float f;
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        if (fArr != null) {
            f = fArr[2];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    @Override // X.C2W5
    public final int getWidth() {
        float f;
        float[] fArr = ((YogaNodeJNIBase) this.A02.A0K).arr;
        if (fArr != null) {
            f = fArr[1];
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final Rect A03() {
        C2WG c2wg;
        C2WG c2wg2;
        C2WG c2wg3;
        C2WG c2wg4;
        boolean z = false;
        if ((A04().A06 & 33554432) != 0) {
            z = true;
        }
        if (z) {
            C2W1 A04 = A04();
            AbstractC78533fL abstractC78533fL = this.A02.A0K;
            EnumC78563fO layoutDirection = abstractC78533fL.getLayoutDirection();
            C14360o3.A07(layoutDirection);
            boolean z2 = false;
            if (AbstractC78553fN.A00(layoutDirection) == 1) {
                z2 = true;
            }
            int i = 0;
            if (C2W1.A00(A04) && (c2wg4 = A04.A0E) != null) {
                i = C2WL.A00(C76983ck.A00(c2wg4, EnumC77763e0.LEFT, z2));
            }
            C2W1 A042 = A04();
            int i2 = 0;
            if (C2W1.A00(A042) && (c2wg3 = A042.A0E) != null) {
                i2 = C2WL.A00(c2wg3.A02(EnumC77763e0.TOP));
            }
            C2W1 A043 = A04();
            EnumC78563fO layoutDirection2 = abstractC78533fL.getLayoutDirection();
            C14360o3.A07(layoutDirection2);
            boolean z3 = false;
            if (AbstractC78553fN.A00(layoutDirection2) == 1) {
                z3 = true;
            }
            int i3 = 0;
            if (C2W1.A00(A043) && (c2wg2 = A043.A0E) != null) {
                i3 = C2WL.A00(C76983ck.A00(c2wg2, EnumC77763e0.RIGHT, z3));
            }
            C2W1 A044 = A04();
            int i4 = 0;
            if (C2W1.A00(A044) && (c2wg = A044.A0E) != null) {
                i4 = C2WL.A00(c2wg.A02(EnumC77763e0.BOTTOM));
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                return new Rect(i, i2, i3, i4);
            }
        }
        return null;
    }
}
