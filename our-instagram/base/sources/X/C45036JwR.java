package X;

import java.lang.ref.WeakReference;

/* renamed from: X.JwR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45036JwR extends C0T6 {
    public Integer A00;
    public WeakReference A01;
    public WeakReference A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45036JwR) {
                C45036JwR c45036JwR = (C45036JwR) obj;
                if (!C14360o3.A0K(this.A01, c45036JwR.A01) || Float.compare(this.A03, c45036JwR.A03) != 0 || !C14360o3.A0K(this.A02, c45036JwR.A02) || this.A00 != c45036JwR.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A01), this.A03));
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "HIGHLIGHTED";
                break;
            case 2:
                str = "HIGHLIGHTED_EXPANDED";
                break;
            default:
                str = "NOT_HIGHLIGHTED";
                break;
        }
        return A0J + AbstractC25226BEj.A02(str, intValue);
    }

    public C45036JwR(Integer num, WeakReference weakReference, WeakReference weakReference2, float f) {
        this.A01 = weakReference;
        this.A03 = f;
        this.A02 = weakReference2;
        this.A00 = num;
    }
}
