package X;

import android.graphics.Bitmap;

/* renamed from: X.MvY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51830MvY extends C0T6 implements InterfaceC58034PoK {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final Bitmap A05;
    public final String A06;

    public C51830MvY() {
        this(null, null, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51830MvY) {
                C51830MvY c51830MvY = (C51830MvY) obj;
                if (!C14360o3.A0K(this.A06, c51830MvY.A06) || Float.compare(this.A04, c51830MvY.A04) != 0 || Float.compare(this.A01, c51830MvY.A01) != 0 || Float.compare(this.A00, c51830MvY.A00) != 0 || Float.compare(this.A02, c51830MvY.A02) != 0 || Float.compare(this.A03, c51830MvY.A03) != 0 || !C14360o3.A0K(this.A05, c51830MvY.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58034PoK
    public final boolean Cce() {
        return false;
    }

    @Override // X.InterfaceC58034PoK
    public final String getName() {
        return this.A06;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC53644Nnp.A00()) * 31, this.A04), this.A01), this.A00), this.A02), this.A03) + AbstractC166997dE.A0I(this.A05);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipTransformModel(name=");
        A1C.append(this.A06);
        A1C.append(", isSelected=");
        A1C.append(false);
        A1C.append(", videoAspectRatio=");
        A1C.append(this.A04);
        A1C.append(", scale=");
        A1C.append(this.A01);
        A1C.append(", rotate=");
        A1C.append(this.A00);
        A1C.append(", translateX=");
        A1C.append(this.A02);
        A1C.append(", translateY=");
        A1C.append(this.A03);
        A1C.append(", bitmap=");
        return AbstractC167017dG.A0o(this.A05, A1C);
    }

    public C51830MvY(Bitmap bitmap, String str, float f, float f2, float f3, float f4, float f5) {
        this.A06 = str;
        this.A04 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = f4;
        this.A03 = f5;
        this.A05 = bitmap;
    }
}
