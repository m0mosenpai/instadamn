package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.TGi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64496TGi implements GY8 {
    public final Callback A00;

    public C64496TGi(Callback callback) {
        this.A00 = callback;
    }

    @Override // X.GY8
    public final void ESF(CountryCodeData countryCodeData) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putString("country", countryCodeData.A00);
        A0c.putString("countryCode", countryCodeData.A01);
        AbstractC58321PtD.A1K(this.A00, A0c);
    }
}
