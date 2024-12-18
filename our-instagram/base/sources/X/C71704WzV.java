package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WzV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71704WzV implements SerialDescriptor {
    public final InterfaceC09390do A00;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        return ((SerialDescriptor) this.A00.getValue()).B0t(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        return ((SerialDescriptor) this.A00.getValue()).B0p(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        return ((SerialDescriptor) this.A00.getValue()).B0r(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return ((SerialDescriptor) this.A00.getValue()).B0v(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return ((SerialDescriptor) this.A00.getValue()).B10();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return ((SerialDescriptor) this.A00.getValue()).BKw();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return ((SerialDescriptor) this.A00.getValue()).BtR();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        return ((SerialDescriptor) this.A00.getValue()).CSy(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C16930sl.A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public C71704WzV(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = AbstractC09440dt.A01(interfaceC16820sZ);
    }
}
