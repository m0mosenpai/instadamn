package X;

import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8gE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192728gE {
    public static final SerialDescriptor[] A00 = new SerialDescriptor[0];

    public static final SerialDescriptor[] A02(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty() || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return A00;
        }
        return serialDescriptorArr;
    }

    public static final java.util.Set A00(SerialDescriptor serialDescriptor) {
        if (serialDescriptor instanceof C3Sr) {
            return ((C3Sr) serialDescriptor).BtS();
        }
        HashSet hashSet = new HashSet(serialDescriptor.B10());
        int B10 = serialDescriptor.B10();
        for (int i = 0; i < B10; i++) {
            hashSet.add(serialDescriptor.B0v(i));
        }
        return hashSet;
    }

    public static final void A01(InterfaceC16510rw interfaceC16510rw) {
        String A01 = AbstractC13230m9.A01(((C0YZ) interfaceC16510rw).A00);
        if (A01 == null) {
            A01 = "<local class name not available>";
        }
        throw new IllegalArgumentException(AnonymousClass001.A0g("Serializer for class '", A01, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
