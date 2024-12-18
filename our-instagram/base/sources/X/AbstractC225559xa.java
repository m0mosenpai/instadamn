package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225559xa {
    public static Map A00(InterfaceC2042691z interfaceC2042691z) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC2042691z.getCommentId() != null) {
            A1I.put("comment_id", interfaceC2042691z.getCommentId());
        }
        if (interfaceC2042691z.getCommenterUsername() != null) {
            A1I.put("commenter_username", interfaceC2042691z.getCommenterUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
