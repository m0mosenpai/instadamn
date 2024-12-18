package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3SK, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3SK implements SerialDescriptor {
    public final SerialDescriptor A00;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        Integer A0j = AbstractC003100w.A0j(str, 10);
        if (A0j != null) {
            return A0j.intValue();
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(str, " is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AnonymousClass001.A08(i, "Illegal index ", ", ", BtR(), " expects only non-negative indices"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3SK) {
                C3SK c3sk = (C3SK) obj;
                if (!C14360o3.A0K(this.A00, c3sk.A00) || !C14360o3.A0K(BtR(), c3sk.BtR())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List B0p(int i) {
        if (i >= 0) {
            return C16930sl.A00;
        }
        throw new IllegalArgumentException(AnonymousClass001.A08(i, "Illegal index ", ", ", BtR(), " expects only non-negative indices"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        if (i >= 0) {
            return this.A00;
        }
        throw new IllegalArgumentException(AnonymousClass001.A08(i, "Illegal index ", ", ", BtR(), " expects only non-negative indices"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return C3TH.A00;
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
        return (this.A00.hashCode() * 31) + BtR().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BtR());
        sb.append('(');
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C3SK(SerialDescriptor serialDescriptor) {
        this.A00 = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return String.valueOf(i);
    }
}
