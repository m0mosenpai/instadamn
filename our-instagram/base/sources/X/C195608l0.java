package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.8l0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195608l0 extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final GalleryItem A03;
    public final ImageUrl A04;
    public final String A05;
    public final String A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;
    public final boolean A09;

    public C195608l0(GalleryItem galleryItem, ImageUrl imageUrl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(imageUrl, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(galleryItem, 6);
        C14360o3.A0B(interfaceC16660sJ, 10);
        this.A05 = str;
        this.A04 = imageUrl;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = galleryItem;
        this.A02 = i3;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195608l0) {
                C195608l0 c195608l0 = (C195608l0) obj;
                if (!C14360o3.A0K(this.A05, c195608l0.A05) || !C14360o3.A0K(this.A04, c195608l0.A04) || !C14360o3.A0K(this.A06, c195608l0.A06) || this.A01 != c195608l0.A01 || this.A00 != c195608l0.A00 || !C14360o3.A0K(this.A03, c195608l0.A03) || this.A02 != c195608l0.A02 || this.A08 != c195608l0.A08 || this.A09 != c195608l0.A09 || !C14360o3.A0K(this.A07, c195608l0.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31) + this.A02) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        return ((i2 + i3) * 31) + this.A07.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
