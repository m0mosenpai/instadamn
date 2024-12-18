package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7OA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7OA {
    public final C18920wW A00;
    public final Integer A01;
    public final List A02;

    public C7OA(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, List list) {
        C14360o3.A0B(num, 3);
        this.A01 = num;
        this.A02 = list;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static final void A00(C7OA c7oa, String str, HashMap hashMap) {
        String str2;
        C18920wW c18920wW = c7oa.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_emoji_quick_reply_events");
        if (!A00.isSampled()) {
            return;
        }
        switch (c7oa.A01.intValue()) {
            case 0:
                str2 = "V1";
                break;
            case 1:
                str2 = "V2";
                break;
            default:
                str2 = "DISABLED";
                break;
        }
        hashMap.put("ui_type", str2);
        A00.AAP("action", str);
        A00.A9M("event_data", hashMap);
        A00.AAk(AbstractC43591JPw.A00(444), c7oa.A02);
        A00.Cht();
    }
}
