package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.7Sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163167Sb extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QL A00;
    public final DirectMessageIdentifier A01;
    public final GifUrlImpl A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final C7QX A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C163167Sb) {
                C163167Sb c163167Sb = (C163167Sb) obj;
                if (!C14360o3.A0K(this.A02, c163167Sb.A02) || !C14360o3.A0K(this.A01, c163167Sb.A01) || !C14360o3.A0K(this.A03, c163167Sb.A03) || this.A05 != c163167Sb.A05 || !C14360o3.A0K(this.A00, c163167Sb.A00) || !C14360o3.A0K(this.A07, c163167Sb.A07) || this.A04 != c163167Sb.A04 || this.A06 != c163167Sb.A06) {
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
        GifUrlImpl gifUrlImpl = this.A02;
        int i = 0;
        if (gifUrlImpl == null) {
            hashCode = 0;
        } else {
            hashCode = gifUrlImpl.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.A01.hashCode()) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int hashCode3 = (((((i2 + i3) * 31) + this.A00.hashCode()) * 31) + this.A07.hashCode()) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        int i5 = (hashCode3 + i4) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    public C163167Sb(C7QX c7qx, C7QL c7ql, DirectMessageIdentifier directMessageIdentifier, GifUrlImpl gifUrlImpl, String str, boolean z, boolean z2, boolean z3) {
        super(c7qx);
        this.A02 = gifUrlImpl;
        this.A01 = directMessageIdentifier;
        this.A03 = str;
        this.A05 = z;
        this.A00 = c7ql;
        this.A07 = c7qx;
        this.A04 = z2;
        this.A06 = z3;
    }
}
