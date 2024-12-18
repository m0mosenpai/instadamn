package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class LGA {
    public C59722oF A00;
    public final C0f6 A01;
    public final InterfaceC11560jF A02;
    public final C1O2 A03;
    public final C59562nz A04;
    public final C43601zh A05;
    public final UserSession A06;
    public final ImageUrl A07;

    public static final void A00(LGA lga, String str, String str2, int i) {
        String str3;
        C59562nz c59562nz = lga.A04;
        ImageUrl imageUrl = lga.A07;
        String Ar1 = imageUrl.Ar1();
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        c59562nz.A0D(null, Ar1, str3, 0, 0, false, false);
        InterfaceC11560jF interfaceC11560jF = lga.A02;
        if (interfaceC11560jF != null) {
            interfaceC11560jF.Cjv(imageUrl, str, str2, i);
        }
        lga.A00 = null;
    }

    public final void finalize() {
        if (this.A00 == null) {
        } else {
            throw new IllegalThreadStateException("byte array not cleaned up");
        }
    }

    public LGA(C0f6 c0f6, InterfaceC11560jF interfaceC11560jF, C1O2 c1o2, C59562nz c59562nz, C43601zh c43601zh, C59722oF c59722oF, UserSession userSession, ImageUrl imageUrl) {
        this.A06 = userSession;
        this.A03 = c1o2;
        this.A04 = c59562nz;
        this.A07 = imageUrl;
        this.A00 = c59722oF;
        this.A02 = interfaceC11560jF;
        this.A05 = c43601zh;
        this.A01 = c0f6;
    }
}
