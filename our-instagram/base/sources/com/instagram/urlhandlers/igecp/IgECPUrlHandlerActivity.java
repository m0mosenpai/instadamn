package com.instagram.urlhandlers.igecp;

import X.AbstractC001900j;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31198Dnh;
import X.AbstractC43593JPy;
import X.AbstractC58317Pt9;
import X.AbstractC58442PvL;
import X.C00O;
import X.C023409i;
import X.C05F;
import X.C06090Tz;
import X.C0HM;
import X.C0f9;
import X.C14360o3;
import X.C16910sj;
import X.C18U;
import X.C25531Mh;
import X.C2FP;
import X.C43204J8b;
import X.C69641Vsi;
import X.C70150W8q;
import X.DHZ;
import X.MSY;
import X.S8X;
import X.VEY;
import X.Wap;
import android.os.Bundle;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.logging.LoggingPolicy;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes11.dex */
public final class IgECPUrlHandlerActivity extends IgFragmentActivity {
    public final C70150W8q A00 = new Object();

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return C023409i.A0A.A08(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EcpUIConfiguration ecpUIConfiguration;
        LoggingPolicy loggingPolicy;
        int A00 = C0f9.A00(-1564255181);
        super.onCreate(bundle);
        C70150W8q c70150W8q = this.A00;
        C43204J8b c43204J8b = new C43204J8b(this, 22);
        if (!C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36313415911868362L)) {
            c43204J8b.invoke();
        } else {
            c70150W8q.A00 = new C69641Vsi(null, this, null);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                extras.getParcelable(AbstractC111324zv.A00(210));
            }
            C2FP.A07();
            String stringExtra = getIntent().getStringExtra(AbstractC58317Pt9.A00(304));
            if (stringExtra != null) {
                if (AbstractC001900j.A0a(stringExtra, AbstractC111324zv.A00(1014), false)) {
                    loggingPolicy = null;
                    ecpUIConfiguration = new EcpUIConfiguration(null, VEY.A0T, VEY.A0U, VEY.A0Z, VEY.A0a, VEY.A0V, VEY.A0b, VEY.A0D, null, new ItemDetails(C05F.A00, null));
                } else if (AbstractC001900j.A0a(stringExtra, S8X.A01, false)) {
                    VEY vey = VEY.A0D;
                    loggingPolicy = null;
                    ecpUIConfiguration = new EcpUIConfiguration(null, vey, VEY.A0B, VEY.A0E, VEY.A0F, VEY.A0A, VEY.A0c, vey, null, new ItemDetails(C05F.A00, null));
                } else {
                    throw new UnsupportedOperationException("Unsupported app for ECP deeplink");
                }
                String A02 = AbstractC58442PvL.A02();
                String stringExtra2 = getIntent().getStringExtra("product_id");
                if (stringExtra2 != null) {
                    String stringExtra3 = getIntent().getStringExtra("receiver_id");
                    if (stringExtra3 != null) {
                        String stringExtra4 = getIntent().getStringExtra("order_id");
                        if (stringExtra4 != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(AbstractC31198Dnh.A00(), A02);
                            bundle2.putString("product_id", stringExtra2);
                            bundle2.putString("receiver_id", stringExtra3);
                            bundle2.putString("order_id", stringExtra4);
                            bundle2.putParcelable("ECP_UI_CONFIGURATION", ecpUIConfiguration);
                            long parseLong = Long.parseLong(stringExtra2);
                            C16910sj c16910sj = C16910sj.A00;
                            Wap.A02(new C25531Mh(MSY.A0H(C2FP.A01().A04.A00, "user_click_ecpentry_atomic"), 399), new LoggingContext(loggingPolicy, A02, c16910sj, c16910sj, parseLong, false), null, "deeplink_checkout_entry", 11);
                            C69641Vsi c69641Vsi = c70150W8q.A00;
                            if (c69641Vsi == null) {
                                C14360o3.A0F("ecpCheckoutHelper");
                                throw C00O.createAndThrow();
                            }
                            AbstractC43593JPy.A1E(this, c69641Vsi.A00(bundle2, null, null, null, ecpUIConfiguration, new PaymentReceiverInfo(stringExtra3, null, null, null), null, null, A02, stringExtra2, C0HM.A00().toString(), stringExtra4, "DEFAULT_VALUE", null, true, false), new DHZ(38, c43204J8b, c70150W8q, this), 2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        C0f9.A07(1775979009, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return C023409i.A0A.A08(this);
    }
}
