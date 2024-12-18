package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KTI extends AbstractC129515tG implements InterfaceC129555tK {
    public final ImageUrl A00;
    public final C7QL A01;
    public final C45081JxB A02;
    public final CharSequence A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final C7QX A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTI(ImageUrl imageUrl, C7QX c7qx, C7QL c7ql, C45081JxB c45081JxB, CharSequence charSequence, String str, String str2, String str3, String str4, boolean z) {
        super(c7qx);
        C14360o3.A0B(str, 3);
        AbstractC167017dG.A1T(str3, str4);
        this.A02 = c45081JxB;
        this.A00 = imageUrl;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = charSequence;
        this.A08 = z;
        this.A01 = c7ql;
        this.A09 = c7qx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTI) {
                KTI kti = (KTI) obj;
                if (!C14360o3.A0K(this.A02, kti.A02) || !C14360o3.A0K(this.A00, kti.A00) || !C14360o3.A0K(this.A04, kti.A04) || !C14360o3.A0K(this.A05, kti.A05) || !C14360o3.A0K(this.A06, kti.A06) || !C14360o3.A0K(this.A07, kti.A07) || !C14360o3.A0K(this.A03, kti.A03) || this.A08 != kti.A08 || !C14360o3.A0K(this.A01, kti.A01) || !C14360o3.A0K(this.A09, kti.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A09, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A06, (AbstractC166997dE.A0K(this.A04, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31))))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ProductShareContentViewModel(imageFields=");
        A1C.append(this.A02);
        A1C.append(", merchantProfilePicUrl=");
        A1C.append(this.A00);
        A1C.append(", merchantUsername=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(3407));
        A1C.append(this.A05);
        A1C.append(", productId=");
        A1C.append(this.A06);
        A1C.append(", productName=");
        A1C.append(this.A07);
        A1C.append(MSV.A00(135));
        A1C.append((Object) this.A03);
        A1C.append(", checkoutSignalingEnabled=");
        A1C.append(this.A08);
        A1C.append(", themeModel=");
        A1C.append(this.A01);
        A1C.append(", gestureDetectionModel=");
        return AbstractC167017dG.A0o(this.A09, A1C);
    }
}
