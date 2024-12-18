package X;

import com.instagram.model.shopping.ProductGroup;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.IeT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41753IeT {
    public ProductGroup A00;
    public C4NL A01;
    public C41595Iai A02;
    public IIQ A03;
    public C41723Idu A04;
    public IH4 A05;
    public IH5 A06;
    public C41578IaR A07;
    public Product A08;
    public Product A09;
    public String A0A;
    public Map A0B;
    public Map A0C;
    public Map A0D;
    public Map A0E;
    public boolean A0F;
    public boolean A0G;

    public static void A01(C38321qM c38321qM, EnumC39541HdD enumC39541HdD, C41753IeT c41753IeT, C41617Ib7 c41617Ib7) {
        c41617Ib7.A01 = enumC39541HdD;
        c41617Ib7.A00 = c38321qM;
        c41753IeT.A04 = new C41723Idu(c41617Ib7);
    }

    public static void A02(C41595Iai c41595Iai, C41753IeT c41753IeT, boolean z) {
        c41753IeT.A02 = new C41595Iai(c41595Iai.A00, c41595Iai.A01, c41595Iai.A02, EnumC39591He1.A06, c41595Iai.A04, c41595Iai.A05, z);
    }

    public static void A03(C41753IeT c41753IeT) {
        c41753IeT.A02 = C41595Iai.A07;
        c41753IeT.A0E = new HashMap();
        c41753IeT.A04 = C41723Idu.A06;
        c41753IeT.A05 = new IH4(new HashMap(), new HashMap(), new HashMap());
        c41753IeT.A06 = new IH5(null, new LinkedHashMap(), new LinkedHashMap());
        c41753IeT.A07 = C41578IaR.A02;
        c41753IeT.A0C = new HashMap();
        c41753IeT.A0B = new HashMap();
        c41753IeT.A03 = new IIQ(null, null, EnumC39591He1.A08, null);
        c41753IeT.A0D = new HashMap();
    }

    public C41753IeT(C41726Idx c41726Idx) {
        A03(this);
        this.A0G = c41726Idx.A0G;
        this.A0F = c41726Idx.A0F;
        this.A02 = c41726Idx.A02;
        this.A0E = new HashMap(c41726Idx.A0E);
        this.A04 = c41726Idx.A04;
        this.A05 = c41726Idx.A05;
        this.A06 = c41726Idx.A06;
        this.A07 = c41726Idx.A07;
        this.A00 = c41726Idx.A00;
        this.A08 = c41726Idx.A08;
        this.A09 = c41726Idx.A09;
        this.A0A = c41726Idx.A0A;
        this.A0C = new HashMap(c41726Idx.A0C);
        this.A0B = new HashMap(c41726Idx.A0B);
        this.A03 = c41726Idx.A03;
        this.A0D = new HashMap(c41726Idx.A0D);
        this.A01 = c41726Idx.A01;
    }

    public static C41753IeT A00(JI6 ji6) {
        return new C41753IeT(ji6.C02());
    }

    public C41753IeT() {
        A03(this);
    }
}
