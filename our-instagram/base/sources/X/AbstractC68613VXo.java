package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.VXo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68613VXo {
    public static final int A00(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        C14360o3.A0B(serialDescriptorArr, 1);
        int hashCode = (serialDescriptor.BtR().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int B10 = serialDescriptor.B10();
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = B10;
            if (B10 <= 0) {
                break;
            }
            int i4 = 0;
            B10--;
            int i5 = i2 * 31;
            String BtR = serialDescriptor.B0r(serialDescriptor.B10() - i3).BtR();
            if (BtR != null) {
                i4 = BtR.hashCode();
            }
            i2 = i5 + i4;
        }
        int B102 = serialDescriptor.B10();
        while (true) {
            int i6 = B102;
            if (B102 > 0) {
                B102--;
                i = (i * 31) + AbstractC25235BEs.A06(serialDescriptor.B0r(serialDescriptor.B10() - i6).BKw());
            } else {
                return (((hashCode * 31) + i2) * 31) + i;
            }
        }
    }
}
