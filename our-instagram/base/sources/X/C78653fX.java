package X;

import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.3fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78653fX extends C2W3 {
    @Override // X.C2W3
    public final /* bridge */ /* synthetic */ C2W1 A04() {
        C2W1 c2w1 = this.A01;
        C14360o3.A0C(c2w1, "null cannot be cast to non-null type com.facebook.litho.NestedTreeHolder");
        return c2w1;
    }

    @Override // X.C2W3, X.C2W5
    public final int CI4(int i) {
        float f;
        if (i <= 0) {
            C2W3 c2w3 = this.A02.A04;
            if (c2w3 != null) {
                float[] fArr = ((YogaNodeJNIBase) c2w3.A02.A0K).arr;
                if (fArr != null) {
                    f = fArr[3];
                } else {
                    f = 0.0f;
                }
                return (int) f;
            }
            return 0;
        }
        throw new IllegalArgumentException("NestedTreeHolder Result has only one child");
    }

    @Override // X.C2W3, X.C2W5
    public final int CIb(int i) {
        float f;
        if (i <= 0) {
            C2W3 c2w3 = this.A02.A04;
            if (c2w3 != null) {
                float[] fArr = ((YogaNodeJNIBase) c2w3.A02.A0K).arr;
                if (fArr != null) {
                    f = fArr[4];
                } else {
                    f = 0.0f;
                }
                return (int) f;
            }
            return 0;
        }
        throw new IllegalArgumentException("NestedTreeHolder Result has only one child");
    }

    @Override // X.C2W3
    public final void A05() {
        super.A05();
        C2W3 c2w3 = this.A02.A04;
        if (c2w3 != null) {
            c2w3.A05();
        }
    }
}
