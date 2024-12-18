package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192718gD implements SerialDescriptor, C3Sr {
    public final SerialDescriptor A00;
    public final String A01;
    public final java.util.Set A02;

    public C192718gD(SerialDescriptor serialDescriptor) {
        C14360o3.A0B(serialDescriptor, 1);
        this.A00 = serialDescriptor;
        this.A01 = AnonymousClass001.A0C(serialDescriptor.BtR(), '?');
        this.A02 = AbstractC192728gE.A00(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        return this.A00.B0p(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        return this.A00.B0r(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.B0t(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return this.A00.B0v(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return this.A00.B10();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return this.A00.BKw();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        return this.A00.CSy(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return true;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C192718gD) && C14360o3.A0K(this.A00, ((C192718gD) obj).A00));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.A00.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.A00.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return this.A01;
    }

    @Override // X.C3Sr
    public final java.util.Set BtS() {
        return this.A02;
    }

    public final int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('?');
        return sb.toString();
    }
}
