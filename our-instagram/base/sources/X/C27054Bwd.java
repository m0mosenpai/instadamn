package X;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Bwd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27054Bwd extends C5QE {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    @Override // X.C5QE
    public final CharSequence A02(Resources resources) {
        String quantityString;
        Object[] objArr = this.A02;
        int length = objArr.length;
        if (length == 0) {
            quantityString = resources.getQuantityString(this.A01, this.A00);
        } else {
            int i = 0;
            while (objArr[i] instanceof C5QE) {
                i++;
                if (i >= length) {
                    ArrayList A17 = AbstractC25225BEi.A17(length);
                    int i2 = 0;
                    do {
                        Object obj = objArr[i2];
                        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.mvvm.StringWrapper");
                        C5QE c5qe = (C5QE) obj;
                        AbstractC167017dG.A1N(resources, c5qe);
                        A17.add(c5qe.A01(resources));
                        i2++;
                    } while (i2 < length);
                    CharSequence[] charSequenceArr = (CharSequence[]) A17.toArray(new CharSequence[0]);
                    String quantityString2 = resources.getQuantityString(this.A01, this.A00, Arrays.copyOf(charSequenceArr, charSequenceArr.length));
                    C14360o3.A0A(quantityString2);
                    return quantityString2;
                }
            }
            quantityString = resources.getQuantityString(this.A01, this.A00, Arrays.copyOf(objArr, length));
        }
        C14360o3.A07(quantityString);
        return quantityString;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                C27054Bwd c27054Bwd = (C27054Bwd) obj;
                if (this.A01 != c27054Bwd.A01 || this.A00 != c27054Bwd.A00 || !Arrays.equals(this.A02, c27054Bwd.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + Arrays.hashCode(this.A02);
    }

    public C27054Bwd(Object[] objArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = objArr;
    }
}
