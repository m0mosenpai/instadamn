package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.api.schemas.BoostUpsellBannerPayloadSchema;
import com.instagram.common.session.UserSession;

/* renamed from: X.BkI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26311BkI extends AbstractC51572Yf {
    public final UserSession A00;
    public final InterfaceC16820sZ A01;

    public C26311BkI(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        BoostUpsellBannerPayloadSchema boostUpsellBannerPayloadSchema;
        C14360o3.A0B(c76223bS, 0);
        C51755Mte c51755Mte = (C51755Mte) this.A01.invoke();
        if (c51755Mte != null) {
            C51760Mtj c51760Mtj = (C51760Mtj) c51755Mte.A00;
            if (!AbstractC25231BEo.A1b((InterfaceC16820sZ) c51760Mtj.A02) && (boostUpsellBannerPayloadSchema = (BoostUpsellBannerPayloadSchema) AbstractC25226BEj.A1C(c51760Mtj.A00)) != null) {
                String Ah2 = boostUpsellBannerPayloadSchema.Ah2();
                String Anr = boostUpsellBannerPayloadSchema.Anr();
                String actionUrl = boostUpsellBannerPayloadSchema.getActionUrl();
                if (Ah2 != null && Anr != null && actionUrl != null) {
                    C2XE c2xe = c76223bS.A05;
                    Context A0E = AbstractC25225BEi.A0E(c2xe);
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(Ah2);
                    AnonymousClass773.A05(A0H, new C52790NXz(A0E, this, actionUrl, AbstractC167007dF.A09(A0E, R.attr.igds_color_link)), Anr);
                    C75933ay c75933ay = C51722Yv.A02;
                    Integer num = C05F.A01;
                    C51722Yv A0d = AbstractC25230BEn.A0d(null, num, 1.0f, 1);
                    Integer num2 = C05F.A0C;
                    C51722Yv A0d2 = AbstractC25230BEn.A0d(A0d, num2, 1.0f, 1);
                    int A09 = AbstractC25228BEl.A09(c76223bS, AbstractC53242c7.A07(A0E));
                    long A092 = AbstractC77623dm.A09(c76223bS);
                    Typeface create = Typeface.create("sans-serif-medium", 0);
                    C14360o3.A07(create);
                    Typeface A03 = AbstractC14710oj.A03(A0E, create, num);
                    Integer num3 = C05F.A00;
                    long A0D = AbstractC25229BEm.A0D();
                    C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0H, 0);
                    AbstractC25233BEq.A19(c76223bS, A0a, A09, A092);
                    A0a.A0S(0);
                    AbstractC25234BEr.A0n(A03, c76223bS, A0a, A0D);
                    A0a.A0X(num3);
                    AbstractC25234BEr.A1H(A0a, num3, false);
                    A0a.A0E();
                    AbstractC25233BEq.A1D(A0d2, A0a, false);
                    C2WH A0I = AbstractC76963ci.A0I(AbstractC25232BEp.A11(A0a.A0A(), c2xe), c76223bS, C9CU.A00(C9CU.A00(null, C05F.A0E, 0, AbstractC77623dm.A07(c76223bS)), C05F.A0F, 0, AbstractC77623dm.A07(c76223bS)));
                    C2WH A0M = AbstractC76963ci.A0M(c76223bS, AbstractC25232BEp.A16(AbstractC25230BEn.A0d(AbstractC25233BEq.A0Y(null, c76223bS, num, R.dimen.ads_disclosure_footer_top_divider_height, 0), num2, 100.0f, 0), num3, AbstractC25225BEi.A0i(AbstractC25232BEp.A03(A0E, c76223bS, R.attr.igds_color_elevated_separator))));
                    C2WF A032 = AbstractC76963ci.A03(AbstractC25232BEp.A11(A0M, c2xe), c76223bS, AbstractC25233BEq.A0S(null, AbstractC25227BEk.A0a(0, AbstractC77623dm.A07(c76223bS)), 0, AbstractC77623dm.A07(c76223bS)));
                    UserSession userSession = this.A00;
                    String str = (String) AbstractC25226BEj.A1C(c51760Mtj.A01);
                    C70399WUb A00 = C70399WUb.A00(userSession);
                    VG4 vg4 = VG4.A0n;
                    String obj = VG4.A0Z.toString();
                    if (str == null) {
                        str = "";
                    }
                    A00.A02 = str;
                    A00.A01 = obj;
                    A00.A0I(vg4, obj);
                    C51722Yv A0d3 = AbstractC25230BEn.A0d(null, num3, 100.0f, 0);
                    C2Z0 A0I2 = AbstractC25233BEq.A0I(A0M, A0I, c2xe);
                    A0I2.A00(A032);
                    return AbstractC76963ci.A01(A0I2, c76223bS, A0d3);
                }
            }
        }
        return null;
    }
}
