package X;

import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import java.util.List;

/* renamed from: X.FeX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35130FeX {
    public Address A00;
    public PublicPhoneContact A01;
    public EnumC222416a A02;
    public EnumC222416a A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;

    public static BusinessInfo A00(BusinessInfo businessInfo, boolean z) {
        C35130FeX c35130FeX = new C35130FeX(businessInfo);
        c35130FeX.A0S = z;
        return new BusinessInfo(c35130FeX);
    }

    public C35130FeX(BusinessInfo businessInfo) {
        this.A0Q = false;
        this.A0S = false;
        this.A0R = false;
        if (businessInfo != null) {
            this.A09 = businessInfo.A09;
            this.A0A = businessInfo.A0A;
            this.A0B = businessInfo.A0B;
            this.A01 = businessInfo.A01;
            this.A0J = businessInfo.A0J;
            this.A0L = businessInfo.A0L;
            this.A00 = businessInfo.A00;
            this.A0M = businessInfo.A0M;
            this.A0K = businessInfo.A0K;
            this.A05 = businessInfo.A05;
            this.A04 = businessInfo.A04;
            this.A06 = businessInfo.A06;
            this.A07 = businessInfo.A07;
            this.A08 = businessInfo.A08;
            this.A0N = businessInfo.A0N;
            this.A0C = businessInfo.A0C;
            this.A0D = businessInfo.A0D;
            this.A0E = businessInfo.A0E;
            this.A0F = businessInfo.A0F;
            this.A0Q = businessInfo.A0Q;
            this.A0S = businessInfo.A0S;
            this.A0R = businessInfo.A0R;
            this.A0O = businessInfo.A0O;
            this.A0P = businessInfo.A0P;
            this.A02 = businessInfo.A02;
            this.A03 = businessInfo.A03;
            this.A0G = businessInfo.A0G;
            this.A0I = businessInfo.A0I;
            this.A0H = businessInfo.A0H;
        }
    }

    public C35130FeX() {
        this.A0Q = false;
        this.A0S = false;
        this.A0R = false;
    }
}
