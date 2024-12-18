package X;

import com.facebook.cvat.ctaudioeligibilitychecker.CTAudioEligibilityChecker;
import com.facebookpay.logging.LoggingContext;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class MIG extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIG(Object obj, Object obj2, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
        this.A01 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        boolean z;
        java.util.Set set;
        java.util.Set set2;
        C25531Mh c25531Mh;
        C0Zx c0Zx;
        LoggingContext loggingContext;
        Boolean valueOf;
        String str;
        String str2;
        String str3;
        switch (this.A00) {
            case 1:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                AbstractC43594JPz.A1E(c0Zx, (LoggingContext) this.A02);
                String str4 = this.A03;
                if (str4 == null) {
                    str4 = "";
                }
                c0Zx.A06("receiver_id", str4);
                c0Zx.A03("is_ecp_available", Boolean.valueOf(this.A04));
                AbstractC43592JPx.A1N(c0Zx, "checkout_setup_mutation");
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 2:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                c0Zx.A06("target_name", this.A03);
                valueOf = Boolean.valueOf(this.A04);
                str = "otc_toggle_state_on";
                c0Zx.A03(str, valueOf);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 3:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                JQ0.A1B(c0Zx, this.A02);
                str2 = this.A03;
                str3 = "target_name";
                c0Zx.A06(str3, str2);
                c0Zx.A03("is_checked", Boolean.valueOf(this.A04));
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 4:
            case 5:
            default:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                JQ0.A1B(c0Zx, this.A02);
                str2 = this.A03;
                str3 = "view_name";
                c0Zx.A06(str3, str2);
                c0Zx.A03("is_checked", Boolean.valueOf(this.A04));
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 6:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                loggingContext = (LoggingContext) this.A02;
                AbstractC43594JPz.A1E(c0Zx, loggingContext);
                AbstractC43592JPx.A1N(c0Zx, this.A03);
                valueOf = Boolean.valueOf(this.A04);
                str = "is_default_otc_toggle_state_on";
                c0Zx.A03(str, valueOf);
                AbstractC43593JPy.A1L(c0Zx, loggingContext);
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 7:
                c25531Mh = (C25531Mh) obj;
                c0Zx = new C0Zx();
                JQ0.A1B(c0Zx, this.A02);
                str2 = this.A03;
                str3 = "view_name";
                c0Zx.A06(str3, str2);
                c0Zx.A03("is_checked", Boolean.valueOf(this.A04));
                AbstractC43592JPx.A1M(c25531Mh, c0Zx);
                AbstractC43593JPy.A1M(c25531Mh, this.A01);
                return c25531Mh;
            case 8:
                HashMap hashMap = (HashMap) obj;
                C14360o3.A0B(hashMap, 0);
                CTAudioEligibilityChecker cTAudioEligibilityChecker = new CTAudioEligibilityChecker(hashMap);
                String str5 = this.A03;
                boolean analyzeAudioEligibility = cTAudioEligibilityChecker.analyzeAudioEligibility(str5);
                LE9 le9 = (LE9) this.A02;
                if (analyzeAudioEligibility && this.A04) {
                    C14120nc.A00().ATO(new KMO(le9.A00, str5, new C50368MLv(this.A01, 10)));
                } else {
                    AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, analyzeAudioEligibility);
                }
                return C0eB.A00;
            case 9:
                C9BW c9bw = (C9BW) obj;
                C14360o3.A0B(c9bw, 0);
                C9C7 c9c7 = (C9C7) c9bw.A01;
                if (C14360o3.A0K(((C9CQ) c9c7.A02).A04, this.A03) && c9c7.A01 == EnumC64262vl.A05 && ((!this.A04 || c9c7.A05 == EnumC64222vh.A06) && (((set = (java.util.Set) this.A01) == null || set.contains(c9c7.A04)) && ((set2 = (java.util.Set) this.A02) == null || !set2.contains(c9c7.A04))))) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                C38321qM A0H = AbstractC37301Gc2.A0H(obj);
                boolean z2 = this.A04;
                HZ4 hz4 = (HZ4) this.A02;
                if (z2) {
                    HZ4.A02(hz4);
                } else {
                    HZ4.A00(A0H, hz4);
                }
                Long l = ((C38819H7k) this.A01).A02;
                C38321qM A02 = AbstractC82403m3.A02(A0H, String.valueOf(l));
                C38A c38a = hz4.A03;
                String valueOf2 = String.valueOf(l);
                if (z2) {
                    featuredProductPermissionStatus = FeaturedProductPermissionStatus.A04;
                } else {
                    featuredProductPermissionStatus = FeaturedProductPermissionStatus.A09;
                }
                JI6 ji6 = hz4.A04;
                String str6 = JQ0.A0a(ji6).A0H;
                String A0d = AbstractC37302Gc3.A0d(JQ0.A0a(ji6));
                C14360o3.A0A(A0d);
                c38a.A00(A02, featuredProductPermissionStatus, valueOf2, str6, A0d, this.A03);
                return C0eB.A00;
        }
    }
}
