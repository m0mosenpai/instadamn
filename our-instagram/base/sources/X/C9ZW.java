package X;

import java.io.File;

/* renamed from: X.9ZW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZW extends C0T6 {
    public float A00;
    public final int A01;
    public final int A02;
    public final EnumC222609s1 A03;
    public final AbstractC193598he A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZW) {
                C9ZW c9zw = (C9ZW) obj;
                if (!C14360o3.A0K(this.A05, c9zw.A05) || this.A03 != c9zw.A03 || !C14360o3.A0K(this.A04, c9zw.A04) || this.A02 != c9zw.A02 || this.A01 != c9zw.A01 || Float.compare(this.A00, c9zw.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        AbstractC193598he abstractC193598he = this.A04;
        if (abstractC193598he instanceof C8ZT) {
            return ((File) abstractC193598he.A00()).getPath();
        }
        return null;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A05))) + this.A02) * 31) + this.A01) * 31) + Float.floatToIntBits(this.A00);
    }

    public C9ZW(EnumC222609s1 enumC222609s1, AbstractC193598he abstractC193598he, String str, float f, int i, int i2) {
        AbstractC167017dG.A1P(str, enumC222609s1);
        this.A05 = str;
        this.A03 = enumC222609s1;
        this.A04 = abstractC193598he;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }
}
