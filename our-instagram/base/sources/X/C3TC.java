package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3TC, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3TC {
    public static final SerialDescriptor A00(SerialDescriptor serialDescriptor, C73803Sk c73803Sk) {
        C14360o3.A0B(serialDescriptor, 0);
        if (C14360o3.A0K(serialDescriptor.BKw(), C3TO.A00)) {
            InterfaceC16510rw A00 = AbstractC68610VXl.A00(serialDescriptor);
            if (A00 != null) {
                c73803Sk.A00.get(A00);
            }
        } else if (serialDescriptor.isInline()) {
            return A00(serialDescriptor.B0r(0), c73803Sk);
        }
        return serialDescriptor;
    }

    public static final C3T5 A01(SerialDescriptor serialDescriptor, AbstractC73763Sg abstractC73763Sg) {
        C14360o3.A0B(abstractC73763Sg, 0);
        C3RG BKw = serialDescriptor.BKw();
        if (BKw instanceof C3TG) {
            return C3T5.A07;
        }
        if (!C14360o3.A0K(BKw, C3TH.A00)) {
            if (C14360o3.A0K(BKw, C3TI.A00)) {
                SerialDescriptor A00 = A00(serialDescriptor.B0r(0), abstractC73763Sg.A02);
                C3RG BKw2 = A00.BKw();
                if (!(BKw2 instanceof C3RF) && !C14360o3.A0K(BKw2, C4DE.A00)) {
                    if (!abstractC73763Sg.A00.A05) {
                        throw WG2.A04(A00);
                    }
                } else {
                    return C3T5.A05;
                }
            } else {
                return C3T5.A06;
            }
        }
        return C3T5.A04;
    }
}
