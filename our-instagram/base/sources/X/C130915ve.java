package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130915ve implements C5H9, InterfaceC82723ma {
    public double A00;
    public double A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public InterfaceC37891pS A0B;
    public C130935vh A0C;
    public Boolean A0D;
    public Integer A0E;
    public String A0F;
    public List A0G;
    public List A0H;
    public List A0I;
    public boolean A0J;
    public final Reel A0K;
    public final int A0L;
    public final int A0M;
    public final UserSession A0N;
    public final String A0O;
    public final String A0P;

    public C130915ve(UserSession userSession, Reel reel, String str, String str2, int i, int i2) {
        C14360o3.A0B(userSession, 1);
        this.A0N = userSession;
        this.A0P = str2;
        this.A0O = str;
        this.A0K = reel;
        this.A0L = i;
        this.A0M = i2;
        this.A09 = -1;
        this.A00 = -1.0d;
        this.A01 = -1.0d;
        this.A06 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A04 = -1.0f;
        this.A0A = -1;
        this.A07 = -1;
        this.A08 = -1;
    }

    @Override // X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        int i;
        String AZM;
        InterfaceC37891pS interfaceC37891pS;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c82713mZ, 2);
        Reel reel = this.A0K;
        UserSession userSession = this.A0N;
        if (!reel.A15(userSession) && (i = this.A0L) < reel.A0O(userSession).size()) {
            if ((!AbstractC130925vf.A0W(reel) || !str.equals(AnonymousClass001.A0R("instagram_ad_", "hide_response"))) && reel.A0A(userSession, i).CY4()) {
                C38321qM c38321qM = reel.A0A(userSession, i).A0b;
                if (c38321qM != null) {
                    c82713mZ.A0G(userSession, c38321qM);
                }
                c82713mZ.A8G = C3R6.A02(reel.A0A(userSession, i).A0c());
                if (c38321qM != null) {
                    C32U.A0A(userSession, c82713mZ, c38321qM);
                }
            }
            c82713mZ.A6j = reel.getId();
            c82713mZ.A6n = this.A0O;
            c82713mZ.A7X = this.A0P;
            Long valueOf = Long.valueOf(i);
            c82713mZ.A4A = valueOf;
            c82713mZ.A26 = Boolean.valueOf(this.A0J);
            c82713mZ.A4B = Long.valueOf(reel.A0O(userSession).size());
            c82713mZ.A12 = this.A0C;
            if (reel.A0g != null) {
                c82713mZ.A3a = Long.valueOf(r0.intValue());
            }
            if (this.A0J) {
                c82713mZ.A4G = Long.valueOf(this.A0A);
                c82713mZ.A0X(this.A0I);
            }
            c82713mZ.A0j = reel.A06();
            List list = reel.A0w;
            if (list != null) {
                if (!list.isEmpty()) {
                    c82713mZ.A7u = list;
                }
                c82713mZ.A4G = valueOf;
                c82713mZ.A4B = Long.valueOf(AbstractC130925vf.A03(list));
                c82713mZ.A4A = Long.valueOf(AbstractC130925vf.A04(list, i));
            }
            boolean CdW = reel.A0A(userSession, i).CdW();
            Long valueOf2 = Long.valueOf(this.A0M);
            if (CdW) {
                c82713mZ.A3N = valueOf2;
            } else {
                c82713mZ.A4M = valueOf2;
            }
            Boolean bool = this.A0D;
            if (bool != null) {
                c82713mZ.A13 = bool;
            }
            double d = this.A00;
            if (d != -1.0d) {
                c82713mZ.A2Z = Double.valueOf(d);
            }
            double d2 = this.A01;
            if (d2 != -1.0d) {
                c82713mZ.A2c = Double.valueOf(d2);
            }
            float f = this.A06;
            if (f != -1.0f) {
                float f2 = this.A05;
                if (f2 != -1.0f) {
                    float f3 = this.A04;
                    if (f3 != -1.0f) {
                        float f4 = this.A03;
                        if (f4 != -1.0f) {
                            float f5 = this.A02;
                            if (f5 != -1.0f) {
                                c82713mZ.A05(f, f2, f4, f5, f3);
                            }
                        }
                    }
                }
            }
            InterfaceC37891pS interfaceC37891pS2 = this.A0B;
            if (interfaceC37891pS2 != null && (AZM = interfaceC37891pS2.AZM()) != null && (interfaceC37891pS = this.A0B) != null) {
                int BHS = interfaceC37891pS.BHS();
                c82713mZ.A4V = AZM;
                c82713mZ.A3h = Long.valueOf(BHS);
            }
            List list2 = this.A0G;
            if (list2 != null) {
                c82713mZ.A81 = list2;
            }
            Integer num = this.A0E;
            if (num != null) {
                c82713mZ.A2x = num;
            }
            C3R6.A04(reel.A0B, c82713mZ);
            List list3 = this.A0H;
            if (list3 != null) {
                c82713mZ.A7l = new ArrayList(list3);
                c82713mZ.A0S = list3.size();
            }
            int i2 = this.A07;
            if (i2 != -1) {
                c82713mZ.A0R = i2;
            }
            int i3 = this.A08;
            if (i3 != -1) {
                c82713mZ.A0T = i3;
            }
            int i4 = this.A09;
            if (i4 != -1) {
                c82713mZ.A4E = Long.valueOf(i4);
            }
            String str2 = this.A0F;
            if (str2 != null) {
                c82713mZ.A4W = str2;
            }
        }
    }

    @Override // X.InterfaceC82723ma
    public final /* bridge */ /* synthetic */ Object Ed9(float f, float f2, float f3, float f4, float f5) {
        this.A06 = f;
        this.A05 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A04 = f5;
        return this;
    }
}
