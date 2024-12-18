package X;

import com.instagram.api.schemas.ProductCardSubtitleType;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Iox, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42335Iox implements InterfaceC66482zP {
    public final int A00;
    public final ProductCardSubtitleType A01;
    public final EnumC39622HeW A02;
    public final C41690IdJ A03;
    public final C38670GzB A04;
    public final C153126ug A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final java.util.Set A0A;

    public /* synthetic */ C42335Iox(ProductCardSubtitleType productCardSubtitleType, EnumC39622HeW enumC39622HeW, C41690IdJ c41690IdJ, C38670GzB c38670GzB, C153126ug c153126ug, String str, String str2, java.util.Set set, int i, int i2) {
        String str3;
        List list = null;
        str = (i2 & 32) != 0 ? null : str;
        str2 = (i2 & 64) != 0 ? null : str2;
        productCardSubtitleType = (i2 & 128) != 0 ? null : productCardSubtitleType;
        set = (i2 & 256) != 0 ? null : set;
        if ((i2 & 512) != 0) {
            str3 = String.valueOf(i);
        } else {
            str3 = null;
        }
        if ((i2 & 4096) != 0) {
            EnumC39541HdD enumC39541HdD = EnumC39541HdD.A02;
            list = AbstractC16960so.A1Q(enumC39541HdD, enumC39541HdD);
        }
        AbstractC25229BEm.A1J(enumC39622HeW, 2, str3);
        C14360o3.A0B(list, 13);
        this.A05 = c153126ug;
        this.A02 = enumC39622HeW;
        this.A04 = c38670GzB;
        this.A00 = i;
        this.A03 = c41690IdJ;
        this.A07 = str;
        this.A08 = str2;
        this.A01 = productCardSubtitleType;
        this.A0A = set;
        this.A06 = str3;
        this.A09 = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C42335Iox) {
            C42335Iox c42335Iox = (C42335Iox) obj;
            if (C14360o3.A0K(this.A05, c42335Iox.A05) && this.A02 == c42335Iox.A02 && C14360o3.A0K(this.A04, c42335Iox.A04) && this.A00 == c42335Iox.A00 && this.A01 == c42335Iox.A01 && C14360o3.A0K(this.A0A, c42335Iox.A0A) && C14360o3.A0K(this.A06, c42335Iox.A06) && C14360o3.A0K(this.A09, c42335Iox.A09)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0T(this.A02.name(), this.A06, '_');
    }

    public final int hashCode() {
        C153126ug c153126ug = this.A05;
        EnumC39622HeW enumC39622HeW = this.A02;
        C38670GzB c38670GzB = this.A04;
        Integer valueOf = Integer.valueOf(this.A00);
        ProductCardSubtitleType productCardSubtitleType = this.A01;
        java.util.Set set = this.A0A;
        String str = this.A06;
        Boolean A0a = AbstractC166997dE.A0a();
        return Arrays.hashCode(new Object[]{c153126ug, enumC39622HeW, c38670GzB, valueOf, null, productCardSubtitleType, set, str, A0a, A0a, this.A09, null, null, null, null});
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
