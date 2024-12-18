package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.businessextension.jscalls.GetNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.GetUserContextJSBridgeCall;
import com.facebook.businessextension.jscalls.HideAutofillBarJSBridgeCall;
import com.facebook.businessextension.jscalls.InitJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.GetPromoExtensionNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.promoautofill.RequestPromoExtensionPromoCodeAutofillJSBridgeCall;

/* renamed from: X.SlH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63476SlH implements Parcelable.Creator, InterfaceC65623TpI {
    public final int A00;

    public C63476SlH(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new BrowserLiteJSBridgeCall(parcel);
            case 1:
                return new BrowserLiteJSBridgeCall(parcel);
            case 2:
                return new BrowserLiteJSBridgeCall(parcel);
            case 3:
                return new BrowserLiteJSBridgeCall(parcel);
            case 4:
                return new BrowserLiteJSBridgeCall(parcel);
            case 5:
                return new BrowserLiteJSBridgeCall(parcel);
            case 6:
                C14360o3.A0B(parcel, 0);
                return new BrowserLiteJSBridgeCall(parcel);
            default:
                C14360o3.A0B(parcel, 0);
                return new BrowserLiteJSBridgeCall(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new GetNonceJSBridgeCall[i];
            case 1:
                return new GetUserContextJSBridgeCall[i];
            case 2:
                return new HideAutofillBarJSBridgeCall[i];
            case 3:
                return new InitJSBridgeCall[i];
            case 4:
                return new RequestAutofillJSBridgeCall[i];
            case 5:
                return new SaveAutofillDataJSBridgeCall[i];
            case 6:
                return new GetPromoExtensionNonceJSBridgeCall[i];
            default:
                return new RequestPromoExtensionPromoCodeAutofillJSBridgeCall[i];
        }
    }
}
