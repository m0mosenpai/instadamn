package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Nqc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53786Nqc {
    public static Map A00(InterfaceC109984xS interfaceC109984xS) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC109984xS.Ag0() != null) {
            A1I.put("bio", interfaceC109984xS.Ag0());
        }
        if (interfaceC109984xS.Ag3() != null) {
            A1I.put("biography", interfaceC109984xS.Ag3());
        }
        interfaceC109984xS.Aqx();
        A1I.put("content_empty", Boolean.valueOf(interfaceC109984xS.Aqx()));
        interfaceC109984xS.CPv();
        A1I.put("is_anonymous_profile_picture", Boolean.valueOf(interfaceC109984xS.CPv()));
        interfaceC109984xS.CbD();
        A1I.put("is_profile_picture_same", Boolean.valueOf(interfaceC109984xS.CbD()));
        if (interfaceC109984xS.getName() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, interfaceC109984xS.getName());
        }
        if (interfaceC109984xS.Bhz() != null) {
            A1I.put("profile_picture_url", interfaceC109984xS.Bhz());
        }
        interfaceC109984xS.BsV();
        A1I.put("selected_audience_count", Integer.valueOf(interfaceC109984xS.BsV()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
