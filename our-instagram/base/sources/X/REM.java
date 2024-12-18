package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.paymentmethods.api.FbPayShopPay;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class REM extends Q8X {
    public C2GT A00;
    public FBPayLoggerData A01;
    public FbPayShopPay A02;
    public final C58252li A03 = AbstractC58318PtA.A0I();
    public final C2GS A04 = AbstractC58318PtA.A0J();
    public final InterfaceC58362lv A05 = new C63627SqZ(this, 19);
    public final C2GC A06;
    public final SMF A07;
    public final SMH A08;

    public static ImmutableList A00(REM rem) {
        String str;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i = 0;
        RDs rDs = new RDs(0);
        rDs.A07 = 2131969397;
        FbPayShopPay fbPayShopPay = rem.A02;
        boolean z = fbPayShopPay.A02;
        if (z) {
            str = null;
        } else {
            str = fbPayShopPay.A01;
        }
        rDs.A0F = str;
        int i2 = 0;
        if (z) {
            i2 = 2131973942;
        }
        rDs.A06 = i2;
        if (z) {
            i = R.attr.fbpay_error_text_color;
        }
        rDs.A05 = i;
        rDs.A00 = R.attr.fbpay_shop_pay_hub_icon;
        builder.add((Object) new RDx(rDs));
        RDn rDn = new RDn();
        int i3 = 2131961590;
        if (rem.A02.A02) {
            i3 = 2131965729;
        }
        rDn.A00 = i3;
        rDn.A01 = ViewOnClickListenerC63508Sob.A00(rem, 54);
        SE4 se4 = new SE4();
        Integer num = C05F.A01;
        se4.A00 = num;
        ((AbstractC61568Rpr) rDn).A02 = new SW2(se4);
        RDy.A00(rDn, builder);
        RDr rDr = new RDr();
        rDr.A02 = 2131972212;
        rDr.A01 = R.attr.fbpay_error_text_color;
        rDr.A03 = ViewOnClickListenerC63508Sob.A00(rem, 55);
        builder.add((Object) RE0.A00(rDr, num));
        return builder.build();
    }

    public static void A01(REM rem, Map map) {
        map.put("credential_type", "shop_pay");
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(Long.parseLong(rem.A02.A00)));
    }

    public REM(C2GC c2gc, SMF smf, SMH smh) {
        this.A07 = smf;
        this.A08 = smh;
        this.A06 = c2gc;
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A01 = AbstractC58320PtC.A0Z(bundle);
        Parcelable parcelable = bundle.getParcelable("shop_pay_credential");
        parcelable.getClass();
        this.A02 = (FbPayShopPay) parcelable;
        C58252li c58252li = this.A07.A03;
        C63627SqZ.A02(c58252li, super.A03, this, 20);
        C58252li c58252li2 = this.A03;
        C63627SqZ.A02(c58252li, c58252li2, this, 21);
        c58252li2.A0B(A00(this));
        SMH smh = this.A08;
        String A00 = this.A01.A00();
        A00.getClass();
        smh.A00(A00);
        LinkedHashMap A08 = AbstractC58442PvL.A08(this.A01);
        A08.put("view_name", "edit_shoppay");
        AbstractC58318PtA.A1X(A08);
        this.A06.Chz("client_load_credential_success", A08);
    }
}
