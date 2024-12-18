package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation;
import com.instagram.user.model.Product;

/* renamed from: X.IbF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41625IbF {
    public long A00;
    public C9CO A01;
    public C51757Mtg A02;
    public C38675GzG A03;
    public C38678GzJ A04;
    public InterfaceC43416JGg A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final C38321qM A0B;
    public final ImageInfo A0C;
    public final InterfaceC76653cC A0D;
    public final ProductLaunchInformation A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final /* synthetic */ C64972wv A0J;

    public C41625IbF(C38321qM c38321qM, C64972wv c64972wv, Product product, String str) {
        ProductLaunchInformation productLaunchInformation = product.A01.A0F;
        ImageInfo imageInfo = product.A08;
        boolean A04 = product.A04();
        ProductLaunchInformation productLaunchInformation2 = product.A01.A0F;
        if (productLaunchInformation2 != null) {
            C14360o3.A0K(productLaunchInformation2.BBz(), AbstractC166997dE.A0b());
        }
        this.A0J = c64972wv;
        this.A0D = product;
        this.A0E = productLaunchInformation;
        this.A0C = imageInfo;
        this.A0I = A04;
        this.A0F = str;
        this.A0B = c38321qM;
        this.A0G = null;
        this.A0H = null;
        this.A09 = true;
        this.A0A = true;
    }

    public final void A00() {
        EnumC77213d7 enumC77213d7;
        C64972wv c64972wv = this.A0J;
        if (AbstractC1563570f.A00(c64972wv.A02).A03(this.A0D)) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        C64972wv.A00(enumC77213d7, this, c64972wv);
    }

    public C41625IbF(FBProductItemDetailsDict fBProductItemDetailsDict, C38321qM c38321qM, C64972wv c64972wv) {
        ImageInfo imageInfo;
        C42727IvN c42727IvN = new C42727IvN(fBProductItemDetailsDict);
        ProductImageContainer C85 = fBProductItemDetailsDict.C85();
        if (C85 != null) {
            imageInfo = C85.BGx();
        } else {
            imageInfo = null;
        }
        String Baz = fBProductItemDetailsDict.Baz();
        Baz = Baz == null ? "" : Baz;
        this.A0J = c64972wv;
        this.A0D = c42727IvN;
        this.A0E = null;
        this.A0C = imageInfo;
        this.A0I = false;
        this.A0F = null;
        this.A0B = c38321qM;
        this.A0G = Baz;
        this.A0H = "fb";
        this.A09 = true;
        this.A0A = true;
    }
}
