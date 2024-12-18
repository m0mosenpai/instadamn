package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3TZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3TZ extends C3SI {
    public final InterfaceC16510rw A00;
    public final SerialDescriptor A01;

    public C3TZ(InterfaceC16510rw interfaceC16510rw, C3R9 c3r9) {
        super(c3r9);
        this.A00 = interfaceC16510rw;
        SerialDescriptor descriptor = c3r9.getDescriptor();
        C14360o3.A0B(descriptor, 1);
        this.A01 = new C3SK(descriptor);
    }
}
