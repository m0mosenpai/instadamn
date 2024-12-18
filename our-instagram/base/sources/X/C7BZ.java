package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7BZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BZ extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final MessageIdentifier A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7BZ) {
                C7BZ c7bz = (C7BZ) obj;
                if (!C14360o3.A0K(this.A01, c7bz.A01) || this.A00 != c7bz.A00 || this.A02 != c7bz.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode + i;
    }

    public C7BZ(MessageIdentifier messageIdentifier, int i, boolean z) {
        this.A01 = messageIdentifier;
        this.A00 = i;
        this.A02 = z;
    }
}
