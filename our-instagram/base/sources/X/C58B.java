package X;

import android.content.Context;

/* renamed from: X.58B, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C58B {
    public static final C58G A00(Context context) {
        final float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        C58E A00 = C58C.A00.A00(f);
        if (A00 == null) {
            A00 = new C58E(f) { // from class: X.5TW
                public final float A00;

                public final boolean equals(Object obj) {
                    return this == obj || ((obj instanceof C5TW) && Float.compare(this.A00, ((C5TW) obj).A00) == 0);
                }

                public final int hashCode() {
                    return Float.floatToIntBits(this.A00);
                }

                public final String toString() {
                    return AnonymousClass001.A0F("LinearFontScaleConverter(fontScale=", ')', this.A00);
                }

                @Override // X.C58E
                public final float AK5(float f3) {
                    return f3 / this.A00;
                }

                @Override // X.C58E
                public final float AK9(float f3) {
                    return f3 * this.A00;
                }

                {
                    this.A00 = f;
                }
            };
        }
        return new C58G(A00, f2, f);
    }
}
