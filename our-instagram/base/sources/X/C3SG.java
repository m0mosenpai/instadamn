package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3SG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SG extends C3SH {
    public final SerialDescriptor A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3SG(C3R9 c3r9) {
        super(c3r9);
        C14360o3.A0B(c3r9, 1);
        SerialDescriptor descriptor = c3r9.getDescriptor();
        C14360o3.A0B(descriptor, 1);
        this.A00 = new C3SK(descriptor);
    }
}
