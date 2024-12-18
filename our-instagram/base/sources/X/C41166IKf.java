package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

/* renamed from: X.IKf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C41166IKf {
    public ProductCheckoutPropertiesIntf A00;
    public ProductImageContainer A01;
    public ProductImageContainer A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public final FBProductItemDetailsDict A0D;

    public C41166IKf(FBProductItemDetailsDict fBProductItemDetailsDict) {
        this.A0D = fBProductItemDetailsDict;
        this.A00 = fBProductItemDetailsDict.AnN();
        this.A03 = fBProductItemDetailsDict.BCz();
        this.A04 = fBProductItemDetailsDict.BNr();
        this.A05 = fBProductItemDetailsDict.BNs();
        this.A01 = fBProductItemDetailsDict.BPX();
        this.A06 = fBProductItemDetailsDict.Baz();
        this.A07 = fBProductItemDetailsDict.Bb3();
        this.A08 = fBProductItemDetailsDict.Bb5();
        this.A09 = fBProductItemDetailsDict.getProductId();
        this.A0A = fBProductItemDetailsDict.BhE();
        this.A0B = fBProductItemDetailsDict.C2g();
        this.A0C = fBProductItemDetailsDict.C2h();
        this.A02 = fBProductItemDetailsDict.C85();
    }
}
