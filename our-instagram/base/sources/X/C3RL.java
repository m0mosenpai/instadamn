package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3RL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RL extends C3RM {
    public final SerialDescriptor A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RL(C3R9 c3r9, C3R9 c3r92) {
        super(c3r9, c3r92);
        C14360o3.A0B(c3r9, 1);
        C14360o3.A0B(c3r92, 2);
        SerialDescriptor descriptor = c3r9.getDescriptor();
        SerialDescriptor descriptor2 = c3r92.getDescriptor();
        C14360o3.A0B(descriptor, 1);
        C14360o3.A0B(descriptor2, 2);
        this.A00 = new C3RP("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }
}
