package X;

import java.util.UUID;

/* renamed from: X.7ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167827ec extends C0T6 implements InterfaceC166277bw {
    public final long A00;
    public final String A01;
    public final UUID A02;
    public final boolean A03;

    public C167827ec(String str, UUID uuid, long j, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(uuid, 4);
        this.A01 = str;
        this.A03 = z;
        this.A00 = j;
        this.A02 = uuid;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167827ec) {
                C167827ec c167827ec = (C167827ec) obj;
                if (!C14360o3.A0K(this.A01, c167827ec.A01) || this.A03 != c167827ec.A03 || this.A00 != c167827ec.A00 || !C14360o3.A0K(this.A02, c167827ec.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        long j = this.A00;
        return ((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode();
    }
}
