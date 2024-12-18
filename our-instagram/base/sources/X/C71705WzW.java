package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WzW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71705WzW implements SerialDescriptor {
    public final String A00;
    public final InterfaceC16510rw A01;
    public final SerialDescriptor A02;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        return this.A02.B0p(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        return this.A02.B0r(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        return this.A02.B0t(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return this.A02.B0v(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return this.A02.B10();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return this.A02.BKw();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        return this.A02.CSy(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CZW() {
        return this.A02.CZW();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.A02.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.A02.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        C71705WzW c71705WzW;
        if (obj instanceof C71705WzW) {
            c71705WzW = (C71705WzW) obj;
        } else {
            c71705WzW = null;
        }
        if (c71705WzW == null || !C14360o3.A0K(this.A02, c71705WzW.A02)) {
            return false;
        }
        return AbstractC25231BEo.A1Z(c71705WzW.A01, this.A01, false);
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContextDescriptor(kClass: ");
        sb.append(this.A01);
        sb.append(", original: ");
        return AbstractC167017dG.A0o(this.A02, sb);
    }

    public C71705WzW(InterfaceC16510rw interfaceC16510rw, SerialDescriptor serialDescriptor) {
        this.A02 = serialDescriptor;
        this.A01 = interfaceC16510rw;
        StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptor.BtR());
        sb.append('<');
        sb.append(AbstractC13230m9.A01(((C0YZ) interfaceC16510rw).A00));
        sb.append('>');
        this.A00 = sb.toString();
    }
}
