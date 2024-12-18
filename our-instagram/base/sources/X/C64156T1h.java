package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.T1h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64156T1h implements InterfaceC08240bm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IntentFilter A01;
    public final /* synthetic */ KF6 A02;
    public final /* synthetic */ ConfirmationCodeEditText A03;

    public C64156T1h(IntentFilter intentFilter, KF6 kf6, ConfirmationCodeEditText confirmationCodeEditText, int i) {
        this.A02 = kf6;
        this.A00 = i;
        this.A03 = confirmationCodeEditText;
        this.A01 = intentFilter;
    }

    @Override // X.InterfaceC08240bm
    public final ArrayList BIr() {
        return AbstractC166987dD.A1F(Collections.singletonList(this.A01));
    }

    @Override // X.InterfaceC08240bm
    public final void Dd8(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        String stringExtra;
        if (C08310bt.A02().A00(context, intent, this) && (stringExtra = intent.getStringExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)) != null && stringExtra.length() == this.A00) {
            this.A03.setText(stringExtra);
        }
    }
}
