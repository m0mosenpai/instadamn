package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8g7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192658g7 implements SerialDescriptor {
    public static final C192658g7 A01 = new Object();
    public static final C3RG A00 = C192668g8.A00;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return "kotlin.Nothing";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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

    public final int hashCode() {
        return (-1818355776) + (A00.hashCode() * 31);
    }
}
