package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3RH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RH implements SerialDescriptor {
    public final String A00;
    public final C3RF A01;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3RH) {
                C3RH c3rh = (C3RH) obj;
                if (!C14360o3.A0K(this.A00, c3rh.A00) || !C14360o3.A0K(this.A01, c3rh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* bridge */ /* synthetic */ C3RG BKw() {
        return this.A01;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return this.A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C16930sl.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return AnonymousClass001.A0S("PrimitiveDescriptor(", this.A00, ')');
    }

    public C3RH(String str, C3RF c3rf) {
        this.A00 = str;
        this.A01 = c3rf;
    }
}
