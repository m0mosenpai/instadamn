package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.4fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100804fj extends C73833Sq {
    @Override // X.C73833Sq
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C100804fj) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C14360o3.A0K(BtR(), serialDescriptor.BtR()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((C73833Sq) obj).A06.getValue()) && B10() == serialDescriptor.B10()) {
                int B10 = B10();
                for (int i = 0; i < B10; i++) {
                    if (C14360o3.A0K(B0r(i).BtR(), serialDescriptor.B0r(i).BtR()) && C14360o3.A0K(B0r(i).BKw(), serialDescriptor.B0r(i).BKw())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C73833Sq
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
