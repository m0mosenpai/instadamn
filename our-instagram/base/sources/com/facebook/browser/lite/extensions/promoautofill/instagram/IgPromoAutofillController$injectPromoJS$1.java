package com.facebook.browser.lite.extensions.promoautofill.instagram;

import X.C0f9;
import X.C14360o3;
import X.C58882QEs;
import X.C63959Swj;
import X.QF6;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: classes10.dex */
public final class IgPromoAutofillController$injectPromoJS$1 extends Binder implements AutofillScriptCallback {
    public final /* synthetic */ C58882QEs A00;
    public final /* synthetic */ QF6 A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IgPromoAutofillController$injectPromoJS$1(C58882QEs c58882QEs, QF6 qf6) {
        this();
        this.A01 = qf6;
        this.A02 = "https://connect.facebook.net/en_US/promo.v2.js";
        this.A00 = c58882QEs;
        C0f9.A0A(199720894, C0f9.A03(-1708043018));
    }

    @Override // com.facebook.browser.lite.ipc.AutofillScriptCallback
    public final void D1B(String str) {
        int A03 = C0f9.A03(743888134);
        QF6 qf6 = this.A01;
        String str2 = this.A02;
        C14360o3.A0B(str2, 0);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("(function(d, s, id){    var sdkURL = \"%s\";    var js, fjs = d.getElementsByTagName(s)[0];    if (d.getElementById(id)) {return;}    js = d.createElement(s); js.id = id;    js.src = sdkURL;    fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'promo-autofill-sdk'));", str2);
        C14360o3.A0A(formatStrLocaleSafe);
        qf6.A0F(new C63959Swj(this.A00, 5), formatStrLocaleSafe, true);
        C0f9.A0A(-936142725, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1605374822, C0f9.A03(1505159352));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-295573265);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                if (i == 1) {
                    D1B(parcel.readString());
                    i3 = -379189614;
                    C0f9.A0A(i3, A03);
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                i3 = -1864008284;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(1012021015, A03);
        return onTransact;
    }

    public IgPromoAutofillController$injectPromoJS$1() {
        int A03 = C0f9.A03(-1631264194);
        attachInterface(this, "com.facebook.browser.lite.ipc.AutofillScriptCallback");
        C0f9.A0A(-737463034, A03);
    }
}
