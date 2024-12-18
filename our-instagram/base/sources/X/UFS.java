package X;

import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class UFS extends AbstractC52922bZ {
    public C2GS A00;
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C152406tQ A07;
    public final InterfaceC16660sJ A08;

    public static C62735SOb A00(EnumC129485tD enumC129485tD, UFS ufs, String str) {
        return new C62735SOb(ufs.A04(enumC129485tD, true), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
    
        if (r0.A01 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1 != true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.UFS r8) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFS.A02(X.UFS):void");
    }

    public final OtcOptionState A06() {
        return (OtcOptionState) this.A07.A00("OTC_SESSION_STATE_KEY");
    }

    public final void A07() {
        if (this.A04) {
            OtcOptionState A06 = A06();
            if (A06 != null) {
                String str = A06.A01;
                EnumC129485tD enumC129485tD = EnumC129485tD.A0J;
                EnumC68133VCr enumC68133VCr = EnumC68133VCr.A04;
                this.A07.A01("OTC_SESSION_STATE_KEY", new OtcOptionState(EnumC68133VCr.A03, str, "NEW_PAYPAL_CHECKOUT", AbstractC25233BEq.A0p(EnumC129485tD.A05, enumC68133VCr, new C09530e4(enumC129485tD, enumC68133VCr))));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void A09(boolean z) {
        EnumC68133VCr enumC68133VCr;
        if (this.A02) {
            this.A03 = z;
            boolean A0B = A0B();
            boolean z2 = !this.A03;
            if (A0B) {
                A08(z2);
                return;
            }
            if (!this.A02) {
                return;
            }
            OtcOptionState A06 = A06();
            if (A06 != null) {
                C16920sk A0E = AbstractC06930Yk.A0E();
                if (z2) {
                    enumC68133VCr = EnumC68133VCr.A03;
                } else {
                    enumC68133VCr = EnumC68133VCr.A02;
                }
                String str = A06.A01;
                String str2 = A06.A02;
                C14360o3.A0B(A0E, 1);
                this.A07.A01("OTC_SESSION_STATE_KEY", new OtcOptionState(enumC68133VCr, str, str2, A0E));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.2GT, X.2GS] */
    public UFS(C152406tQ c152406tQ, ECPPaymentRequest eCPPaymentRequest) {
        this.A07 = c152406tQ;
        this.A01 = eCPPaymentRequest;
        ?? c2gt = new C2GT(C63406Sjd.A03(null));
        this.A00 = c2gt;
        this.A08 = new X58(this, 2);
        this.A06 = C75M.A01(c2gt, C71799X5a.A00);
        this.A05 = C75M.A01(this.A00, X5Z.A00);
        if (this.A01 != null) {
            A02(this);
        }
    }

    public static LinkedHashMap A01(UFS ufs) {
        C70073W1q A05 = ufs.A05();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C70199WGm.A08(A05, linkedHashMap);
        return linkedHashMap;
    }

    public final EnumC68133VCr A03(EnumC129485tD enumC129485tD) {
        OtcOptionState A06 = A06();
        if (A06 != null) {
            EnumC68133VCr enumC68133VCr = (EnumC68133VCr) A06.A03.get(enumC129485tD);
            if (enumC68133VCr == null) {
                return A06.A00;
            }
            return enumC68133VCr;
        }
        return EnumC68133VCr.A02;
    }

    public final OtcInput A04(EnumC129485tD enumC129485tD, boolean z) {
        OtcOptionState A06 = A06();
        if (A06 == null) {
            return null;
        }
        if (enumC129485tD == null) {
            if (!A0B()) {
                return null;
            }
        } else {
            Object obj = A06.A03.get(enumC129485tD);
            if (obj == null) {
                obj = A06.A00;
            }
            if (obj != EnumC68133VCr.A03 && (obj != EnumC68133VCr.A04 || !z)) {
                return null;
            }
        }
        return new OtcInput(A06.A01, A06.A02);
    }

    public final C70073W1q A05() {
        String str;
        boolean A0B = A0B();
        OtcOptionState A06 = A06();
        if (A06 != null) {
            str = A06.A02;
        } else {
            str = null;
        }
        return new C70073W1q(A0B, str);
    }

    public final void A08(boolean z) {
        EnumC68133VCr enumC68133VCr;
        String A0p = AbstractC25231BEo.A0p();
        C16920sk A0E = AbstractC06930Yk.A0E();
        if (z) {
            enumC68133VCr = EnumC68133VCr.A03;
        } else {
            enumC68133VCr = EnumC68133VCr.A02;
        }
        this.A07.A01("OTC_SESSION_STATE_KEY", new OtcOptionState(enumC68133VCr, A0p, "CARD", A0E));
    }

    public final boolean A0A() {
        String str;
        OtcOptionState A06 = A06();
        if (A06 != null && A06.A04) {
            OtcOptionState A062 = A06();
            if (A062 != null) {
                str = A062.A02;
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, "CARD")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0B() {
        OtcOptionState A06 = A06();
        if (A06 != null && A06.A04) {
            return true;
        }
        return false;
    }
}
