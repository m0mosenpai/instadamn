package com.instagram.nux.aymh.accountprovider;

import X.AbstractC31189DnY;
import X.B4Z;
import X.C05F;
import X.C14360o3;
import X.E6N;
import X.FWG;
import X.InterfaceC65286ThJ;
import X.InterfaceC65440TkC;
import X.MSV;
import X.QJ0;
import X.RVZ;
import X.UQE;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes10.dex */
public final class AccountDeserializer implements InterfaceC65440TkC {
    @Override // X.InterfaceC65440TkC
    public final /* bridge */ /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, InterfaceC65286ThJ interfaceC65286ThJ) {
        String str;
        String str2;
        SimpleImageUrl simpleImageUrl;
        String str3;
        Object uqe;
        String str4;
        String str5;
        String asString;
        C14360o3.A0B(jsonElement, 0);
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        C14360o3.A0A(asJsonObject);
        String asString2 = asJsonObject.get("accountSource").getAsString();
        C14360o3.A07(asString2);
        for (Integer num : C05F.A00(10)) {
            if (C14360o3.A0K(FWG.A00(num), asString2)) {
                JsonElement jsonElement2 = asJsonObject.get(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
                if (jsonElement2 != null && !(jsonElement2 instanceof RVZ)) {
                    str = jsonElement2.getAsString();
                } else {
                    str = null;
                }
                JsonElement jsonElement3 = asJsonObject.get("userId");
                if (jsonElement3 != null && !(jsonElement3 instanceof RVZ)) {
                    str2 = jsonElement3.getAsString();
                } else {
                    str2 = null;
                }
                JsonElement jsonElement4 = asJsonObject.get("profileImageUrl");
                if (jsonElement4 != null && (asString = jsonElement4.getAsString()) != null) {
                    simpleImageUrl = new SimpleImageUrl(asString);
                } else {
                    simpleImageUrl = null;
                }
                JsonElement jsonElement5 = asJsonObject.get("authorizationData");
                switch (num.intValue()) {
                    case 0:
                    case 6:
                    case 7:
                    case 9:
                        C14360o3.A0C(jsonElement5, "null cannot be cast to non-null type com.google.gson.JsonObject");
                        JsonObject jsonObject = (JsonObject) jsonElement5;
                        String asString3 = jsonObject.get(AbstractC31189DnY.A01()).getAsString();
                        JsonElement jsonElement6 = jsonObject.get("password");
                        if (jsonElement6 != null) {
                            str3 = jsonElement6.getAsString();
                        } else {
                            str3 = null;
                        }
                        C14360o3.A0A(asString3);
                        uqe = new UQE(asString3, str3, 7);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                        C14360o3.A0C(jsonElement5, "null cannot be cast to non-null type com.google.gson.JsonObject");
                        JsonObject jsonObject2 = (JsonObject) jsonElement5;
                        String asString4 = jsonObject2.get("loginUserId").getAsString();
                        JsonElement jsonElement7 = jsonObject2.get("accessToken");
                        String str6 = null;
                        if (jsonElement7 != null) {
                            str4 = jsonElement7.getAsString();
                        } else {
                            str4 = null;
                        }
                        JsonElement jsonElement8 = jsonObject2.get("deviceBasedLoginToken");
                        if (jsonElement8 != null) {
                            str5 = jsonElement8.getAsString();
                        } else {
                            str5 = null;
                        }
                        JsonElement jsonElement9 = jsonObject2.get("fbId");
                        if (jsonElement9 != null) {
                            str6 = jsonElement9.getAsString();
                        }
                        Map map = FxcalAccountType.A01;
                        String asString5 = jsonObject2.get("accountType").getAsString();
                        C14360o3.A07(asString5);
                        FxcalAccountType fxcalAccountType = (FxcalAccountType) FxcalAccountType.A01.get(asString5);
                        C14360o3.A0A(asString4);
                        uqe = new QJ0(fxcalAccountType, asString4, str4, str5, str6);
                        break;
                    default:
                        throw B4Z.A00();
                }
                return new E6N(simpleImageUrl, num, uqe, str, str2);
            }
        }
        throw new NoSuchElementException(MSV.A00(6));
    }
}
