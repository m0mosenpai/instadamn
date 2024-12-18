package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KjS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC46589KjS {
    public static Map A00(InterfaceC99294cv interfaceC99294cv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC99294cv.B2F() != null) {
            A1I.put("enqueued_for_federation", interfaceC99294cv.B2F());
        }
        if (interfaceC99294cv.B5T() != null) {
            A1I.put("federated_like_count", interfaceC99294cv.B5T());
        }
        if (interfaceC99294cv.B5V() != null) {
            A1I.put("fediverse_reply_count", interfaceC99294cv.B5V());
        }
        if (interfaceC99294cv.CUd() != null) {
            A1I.put("is_federated", interfaceC99294cv.CUd());
        }
        if (interfaceC99294cv.BNE() != null) {
            A1I.put("liked_instance_count", interfaceC99294cv.BNE());
        }
        if (interfaceC99294cv.BnF() != null) {
            A1I.put("reply_instance_count", interfaceC99294cv.BnF());
        }
        if (interfaceC99294cv.BnL() != null) {
            A1I.put("reply_owner_profile_pic_uris", interfaceC99294cv.BnL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
