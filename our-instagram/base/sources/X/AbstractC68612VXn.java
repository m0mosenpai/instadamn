package X;

import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.VXn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68612VXn {
    public static final void A00(SerialDescriptor serialDescriptor, int i, int i2) {
        StringBuilder sb;
        String str;
        ArrayList A12 = AbstractC166997dE.A12(serialDescriptor, 2);
        int i3 = (i ^ (-1)) & i2;
        int i4 = 0;
        do {
            if ((i3 & 1) != 0) {
                A12.add(serialDescriptor.B0v(i4));
            }
            i3 >>>= 1;
            i4++;
        } while (i4 < 32);
        String BtR = serialDescriptor.BtR();
        C14360o3.A0B(BtR, 2);
        if (A12.size() == 1) {
            sb = new StringBuilder();
            sb.append("Field '");
            sb.append((String) A12.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(BtR);
            str = "', but it was missing";
        } else {
            sb = new StringBuilder();
            sb.append("Fields ");
            sb.append(A12);
            sb.append(" are required for type with serial name '");
            sb.append(BtR);
            str = "', but they were missing";
        }
        throw new C4D2(AbstractC166997dE.A0x(str, sb), null, A12);
    }
}
