package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.4WV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WV {
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C4B6[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4WV c4wv = (C4WV) obj;
            if (!this.A03.equals(c4wv.A03) || !Arrays.equals(this.A04, c4wv.A04)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = ((527 + this.A03.hashCode()) * 31) + Arrays.hashCode(this.A04);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    public C4WV(String str, C4B6... c4b6Arr) {
        String str2;
        int length = c4b6Arr.length;
        C4B8.A03(length > 0);
        this.A03 = str;
        this.A04 = c4b6Arr;
        this.A01 = length;
        int A00 = C2IH.A00(c4b6Arr[0].A0W);
        this.A02 = A00 == -1 ? C2IH.A00(c4b6Arr[0].A0S) : A00;
        C4B6[] c4b6Arr2 = this.A04;
        C4B6 c4b6 = c4b6Arr2[0];
        String str3 = c4b6.A0V;
        String str4 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = c4b6.A0E;
        int i2 = i | Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        for (int i3 = 1; i3 < c4b6Arr2.length; i3++) {
            String str5 = c4b6Arr2[i3].A0V;
            if (!str4.equals((str5 == null || str5.equals("und")) ? "" : str5)) {
                str2 = "languages";
            } else {
                int i4 = c4b6Arr2[i3].A0E;
                if (i2 != (i4 | Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET)) {
                    str3 = Integer.toBinaryString(i);
                    str5 = Integer.toBinaryString(i4);
                    str2 = "role flags";
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Different ");
            sb.append(str2);
            sb.append(" combined in one TrackGroup: '");
            sb.append(str3);
            sb.append("' (track 0) and '");
            sb.append(str5);
            sb.append("' (track ");
            sb.append(i3);
            sb.append(")");
            AbstractC46512Bo.A05("TrackGroup", "", new IllegalStateException(sb.toString()));
            return;
        }
    }
}
