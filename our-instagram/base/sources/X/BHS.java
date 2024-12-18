package X;

import android.content.res.Resources;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BHS extends C5QE {
    public final int A00;
    public final Object[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
                BHS bhs = (BHS) obj;
                if (this.A00 != bhs.A00 || !Arrays.equals(this.A01, bhs.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static BHS A00(Object[] objArr, int i) {
        return new BHS(objArr, i);
    }

    @Override // X.C5QE
    public final CharSequence A02(Resources resources) {
        String string;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (length == 0) {
            string = resources.getString(this.A00);
        } else {
            string = resources.getString(this.A00, Arrays.copyOf(objArr, length));
        }
        C14360o3.A07(string);
        return string;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public BHS(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
