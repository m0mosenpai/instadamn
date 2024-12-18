package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3RP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3RP implements SerialDescriptor {
    public final String A00;
    public final SerialDescriptor A01;
    public final SerialDescriptor A02;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor B0r(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.A02;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.A01;
        }
        throw new IllegalArgumentException(AnonymousClass001.A08(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B0t(String str) {
        C14360o3.A0B(str, 0);
        Integer A0j = AbstractC003100w.A0j(str, 10);
        if (A0j != null) {
            return A0j.intValue();
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(str, " is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean CSy(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AnonymousClass001.A08(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3RP) {
                C3RP c3rp = (C3RP) obj;
                if (!C14360o3.A0K(this.A00, c3rp.A00) || !C14360o3.A0K(this.A01, c3rp.A01) || !C14360o3.A0K(this.A02, c3rp.A02)) {
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
        throw new IllegalArgumentException(AnonymousClass001.A08(i, "Illegal index ", ", ", this.A00, " expects only non-negative indices"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int B10() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final C3RG BKw() {
        return C3TI.A00;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String BtR() {
        return this.A00;
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
        return (((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('(');
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C3RP(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.A00 = str;
        this.A01 = serialDescriptor;
        this.A02 = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String B0v(int i) {
        return String.valueOf(i);
    }
}
