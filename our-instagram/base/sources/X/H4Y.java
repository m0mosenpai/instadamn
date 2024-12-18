package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H4Y extends C0T6 implements JL2 {
    public final float A00;
    public final int A01;
    public final String A02;

    public H4Y(String str, int i, float f) {
        C14360o3.A0B(str, 3);
        this.A01 = i;
        this.A00 = f;
        this.A02 = str;
    }

    @Override // X.JL2
    public final H4Y Ey3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4Y) {
                H4Y h4y = (H4Y) obj;
                if (this.A01 != h4y.A01 || Float.compare(this.A00, h4y.A00) != 0 || !C14360o3.A0K(this.A02, h4y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL2
    public final float B7f() {
        return this.A00;
    }

    @Override // X.JL2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTPollCreateModeStickerTally", AbstractC40148HrH.A00(this));
    }

    @Override // X.JL2
    public final int getCount() {
        return this.A01;
    }

    @Override // X.JL2
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A00(this.A01 * 31, this.A00));
    }
}
