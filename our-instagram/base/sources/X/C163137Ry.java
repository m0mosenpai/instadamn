package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163137Ry extends C4F4 {
    public final long A00;
    public final C7IH A01;
    public final C2EY A02;
    public final MessageIdentifier A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163137Ry) {
                C163137Ry c163137Ry = (C163137Ry) obj;
                if (!C14360o3.A0K(this.A03, c163137Ry.A03) || !C14360o3.A0K(this.A04, c163137Ry.A04) || this.A00 != c163137Ry.A00 || this.A02 != c163137Ry.A02 || !C14360o3.A0K(this.A01, c163137Ry.A01) || this.A05 != c163137Ry.A05) {
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
        int hashCode;
        MessageIdentifier messageIdentifier = this.A03;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        int i3 = (i2 + i) * 31;
        long j = this.A00;
        int hashCode2 = (((((i3 + ((int) (j ^ (j >>> 32)))) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i4 = 1237;
        if (this.A05) {
            i4 = 1231;
        }
        return hashCode2 + i4;
    }

    public C163137Ry(C7IH c7ih, C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j, boolean z) {
        this.A03 = messageIdentifier;
        this.A04 = str;
        this.A00 = j;
        this.A02 = c2ey;
        this.A01 = c7ih;
        this.A05 = z;
    }
}
