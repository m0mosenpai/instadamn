package X;

import android.view.View;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebookpay.paymentmethod.model.PaymentMethod;

/* loaded from: classes5.dex */
public final class DS0 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DS0(String str, int i) {
        super(2);
        this.A00 = i;
        this.A01 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, X.2Vj] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        switch (this.A00) {
            case 0:
                C63406Sjd c63406Sjd = (C63406Sjd) obj;
                C14360o3.A0B(c63406Sjd, 0);
                Object obj3 = c63406Sjd.A01;
                obj3.getClass();
                return Boolean.valueOf(C14360o3.A0K(((PaymentMethod) obj3).AtA(), this.A01));
            case 1:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1567722543, "com.instagram.compose.igds.components.navigation.actionbar.IgdsActionBar.<anonymous> (IgdsActionBar.kt:151)");
                    }
                    String str = this.A01;
                    if (str != null && str.length() != 0) {
                        C5WR.A10(c5Tl, str);
                    }
                    if (C0fH.A02()) {
                        i = -290552596;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-792593297, "com.instagram.compose.igds.components.navigation.actionbar.IgdsActionBar.<anonymous> (IgdsActionBar.kt:160)");
                    }
                    String str2 = this.A01;
                    if (str2 != null) {
                        C5WR.A10(c5Tl, str2);
                    }
                    if (C0fH.A02()) {
                        i = 1657366619;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                C76223bS c76223bS = (C76223bS) obj;
                long j = ((C78613fT) obj2).A00;
                C14360o3.A0B(c76223bS, 0);
                Integer num = C05F.A0D;
                C88 c88 = C88.A0i;
                String str3 = this.A01;
                C75933ay c75933ay = C51722Yv.A02;
                long A01 = C78613fT.A01(j) | 9221401712017801216L;
                Integer num2 = C05F.A00;
                C93E c93e = null;
                Integer num3 = C05F.A0Y;
                C26567BoQ c26567BoQ = new C26567BoQ(C9CU.A00(C9CU.A00(null, num2, 0, A01), num3, 0, C78613fT.A02(j) | 9221401712017801216L), c93e, c88, str3, num, 3, 112);
                ?? obj4 = new Object();
                C2XE c2xe = c76223bS.A05;
                c26567BoQ.A0J(c2xe, obj4, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                C51722Yv A00 = C9CU.A00(C9CU.A00(null, num2, 0, A01), C05F.A01, 0, obj4.A00 | 9221401712017801216L);
                long A0D = AbstractC25229BEm.A0D();
                BOO boo = new BOO(c2xe, new C51632Yl());
                boo.A0A(new C26567BoQ(C9CU.A00(AbstractC25230BEn.A0d(null, num2, 100.0f, 0), num3, 0, obj4.A00 | 9221401712017801216L), c93e, c88, str3, num, 0, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
                int A07 = AbstractC25228BEl.A07(c76223bS, 9221401712017801216L);
                C51632Yl c51632Yl = boo.A01;
                c51632Yl.A01 = A07;
                c51632Yl.A05 = true;
                c51632Yl.A06 = true;
                c51632Yl.A08 = false;
                c51632Yl.A04 = true;
                c51632Yl.A00 = AbstractC25228BEl.A07(c76223bS, A0D);
                c51632Yl.A07 = false;
                c51632Yl.A03 = null;
                AbstractC77743dy.A00(boo, A00);
                AbstractC77733dx.A00(boo.A02, boo.A03, 1);
                boo.A03();
                C14360o3.A0A(c51632Yl);
                return c51632Yl;
        }
    }
}
