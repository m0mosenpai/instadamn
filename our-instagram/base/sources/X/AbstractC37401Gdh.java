package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37401Gdh {
    public static Map A00(InterfaceC87573vP interfaceC87573vP) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC87573vP.Ais() != null) {
            A1I.put("business_response_time_in_sec", AbstractC166997dE.A0f(interfaceC87573vP.Ais()));
        }
        if (interfaceC87573vP.Ait() != null) {
            A1I.put("business_responsiveness_time_text", interfaceC87573vP.Ait());
        }
        if (interfaceC87573vP.CHV() != null) {
            A1I.put("welcome_message_text", interfaceC87573vP.CHV());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
