package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class Y20 {
    public final String A00;
    public final LocusId A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A00;
        String str2 = ((Y20) obj).A00;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static Y20 A00(LocusId locusId) {
        C02R.A03(locusId, "locusId cannot be null");
        String A01 = AbstractC72878XqC.A01(locusId);
        if (!TextUtils.isEmpty(A01)) {
            return new Y20(A01);
        }
        throw AbstractC166987dD.A12(String.valueOf("id cannot be empty"));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00) + 31;
    }

    public final String toString() {
        return AnonymousClass001.A0g("LocusIdCompat[", AnonymousClass001.A03(this.A00.length(), "_chars"), "]");
    }

    public Y20(String str) {
        LocusId locusId;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = AbstractC72878XqC.A00(str);
            } else {
                locusId = null;
            }
            this.A01 = locusId;
            return;
        }
        throw AbstractC166987dD.A12(String.valueOf("id cannot be empty"));
    }

    public final LocusId A01() {
        return this.A01;
    }
}
