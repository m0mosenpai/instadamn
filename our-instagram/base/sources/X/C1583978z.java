package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.78z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583978z extends C0T6 implements InterfaceC129555tK {
    public final long A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1583978z) {
                C1583978z c1583978z = (C1583978z) obj;
                if (this.A00 != c1583978z.A00 || !C14360o3.A0K(this.A02, c1583978z.A02) || !C14360o3.A0K(this.A04, c1583978z.A04) || !C14360o3.A0K(this.A01, c1583978z.A01) || !C14360o3.A0K(this.A03, c1583978z.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int hashCode2 = ((((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31;
        ImageUrl imageUrl = this.A01;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public C1583978z(ImageUrl imageUrl, String str, String str2, List list, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A04 = list;
        this.A01 = imageUrl;
        this.A03 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
