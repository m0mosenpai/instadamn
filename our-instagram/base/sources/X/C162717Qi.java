package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7Qi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162717Qi extends C0T6 implements InterfaceC129555tK {
    public final ImageUrl A00;
    public final AbstractC162707Qh A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162717Qi) {
                C162717Qi c162717Qi = (C162717Qi) obj;
                if (!C14360o3.A0K(this.A00, c162717Qi.A00) || !C14360o3.A0K(this.A01, c162717Qi.A01) || this.A02 != c162717Qi.A02) {
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
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return hashCode2 + i;
    }

    public C162717Qi(ImageUrl imageUrl, AbstractC162707Qh abstractC162707Qh, boolean z) {
        this.A00 = imageUrl;
        this.A01 = abstractC162707Qh;
        this.A02 = z;
    }
}
