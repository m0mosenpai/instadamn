package com.instagram.nux.aymh.accountprovider;

import X.AbstractC167017dG;
import X.AbstractC31189DnY;
import X.B4Z;
import X.C14360o3;
import X.C58581Pxz;
import X.E6N;
import X.FWG;
import X.InterfaceC65287ThK;
import X.InterfaceC65441TkD;
import X.QJ0;
import X.RVZ;
import X.UQE;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.reflect.Type;

/* loaded from: classes10.dex */
public final class AccountSerializer implements InterfaceC65441TkD {
    @Override // X.InterfaceC65441TkD
    public final /* bridge */ /* synthetic */ JsonElement serialize(Object obj, Type type, InterfaceC65287ThK interfaceC65287ThK) {
        String str;
        JsonElement A01;
        JsonObject jsonObject;
        String str2;
        String str3;
        E6N e6n = (E6N) obj;
        AbstractC167017dG.A1O(e6n, interfaceC65287ThK);
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, e6n.A03);
        jsonObject2.addProperty("userId", e6n.A04);
        Integer num = e6n.A01;
        jsonObject2.addProperty("accountSource", FWG.A00(num));
        ImageUrl imageUrl = e6n.A00;
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = null;
        }
        Gson gson = ((C58581Pxz) interfaceC65287ThK).A00.A00;
        if (str == null) {
            A01 = RVZ.A00;
        } else {
            A01 = gson.A01(str, str.getClass());
        }
        jsonObject2.add("profileImageUrl", A01);
        new JsonObject();
        switch (num.intValue()) {
            case 0:
            case 6:
            case 7:
            case 9:
                Object obj2 = e6n.A02;
                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.nux.aymh.accountprovider.credentials.UsernameAndPasswordCredentials");
                UQE uqe = (UQE) obj2;
                jsonObject = new JsonObject();
                jsonObject.addProperty(AbstractC31189DnY.A01(), uqe.A01);
                str2 = uqe.A00;
                str3 = "password";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                Object obj3 = e6n.A02;
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.nux.aymh.accountprovider.credentials.TokenCredentials");
                QJ0 qj0 = (QJ0) obj3;
                jsonObject = new JsonObject();
                jsonObject.addProperty("loginUserId", qj0.A04);
                jsonObject.addProperty("accessToken", qj0.A01);
                jsonObject.addProperty("deviceBasedLoginToken", qj0.A02);
                jsonObject.addProperty("fbId", qj0.A03);
                str2 = String.valueOf(qj0.A00);
                str3 = "accountType";
                break;
            default:
                throw B4Z.A00();
        }
        jsonObject.addProperty(str3, str2);
        jsonObject2.add("authorizationData", jsonObject);
        return jsonObject2;
    }
}
