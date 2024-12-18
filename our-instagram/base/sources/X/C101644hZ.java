package X;

import com.instagram.model.mediatype.ProductType;
import java.util.List;

/* renamed from: X.4hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101644hZ {
    public int A00;
    public int A01;
    public long A02;
    public C5H1 A03;
    public ProductType A04;
    public Boolean A05;
    public Double A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Integer A0J;
    public final String A0K;

    public C101644hZ(Integer num, String str) {
        C14360o3.A0B(num, 1);
        C14360o3.A0B(str, 2);
        this.A0J = num;
        this.A0K = str;
        this.A0I = true;
        this.A01 = -1;
        this.A00 = -1;
    }

    public final C75363a3 A00() {
        Integer num = this.A0J;
        ProductType productType = this.A04;
        String str = this.A0K;
        List list = this.A0C;
        String str2 = this.A09;
        String str3 = this.A0B;
        C5H1 c5h1 = this.A03;
        String str4 = this.A08;
        Integer num2 = this.A07;
        String str5 = this.A0A;
        List list2 = this.A0D;
        boolean z = this.A0E;
        boolean z2 = this.A0H;
        boolean z3 = this.A0G;
        boolean z4 = this.A0F;
        long j = this.A02;
        return new C75363a3(c5h1, productType, null, this.A05, this.A06, num, num2, str, str2, str3, str4, null, str5, null, null, null, list, list2, null, this.A01, this.A00, j, false, z, z2, z3, z4, false, this.A0I, false);
    }
}
