package com.instagram.fbpay.w3c.views;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC58442PvL;
import X.C14240no;
import X.C14360o3;
import X.C62697SMl;
import X.MSW;
import X.MSY;
import X.RE7;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class PaymentMethodsActivity extends BaseFragmentActivity {
    public final FBPayLoggerData A00;

    public PaymentMethodsActivity() {
        C62697SMl c62697SMl = new C62697SMl();
        c62697SMl.A00(AbstractC58442PvL.A02());
        String lowerCase = "IAB_AUTOFILL".toLowerCase();
        C14360o3.A07(lowerCase);
        c62697SMl.A01 = lowerCase;
        c62697SMl.A05 = "offline_offsite";
        this.A00 = new FBPayLoggerData(c62697SMl);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("viewmodel_class", RE7.class);
        A0b.putParcelable("logger_data", this.A00);
        A0b.putString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY, "IAB_AUTOFILL");
        Fragment fragment = new Fragment();
        fragment.setArguments(A0b);
        C14240no A0G = MSY.A0G(this);
        A0G.A09(fragment, R.id.layout_container_main);
        A0G.A00();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0Q(this);
    }
}
