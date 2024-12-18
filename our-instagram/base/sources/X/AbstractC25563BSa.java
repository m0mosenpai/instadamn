package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BSa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25563BSa {
    public static final BSZ A00(UserSession userSession, Integer num) {
        Integer num2;
        int i;
        boolean z;
        long j;
        InterfaceC19630xq interfaceC19630xq;
        String str;
        C84993qn A00 = AbstractC84983qm.A00(userSession);
        if (num.intValue() != 1) {
            num2 = C05F.A0C;
            InterfaceC09390do interfaceC09390do = A00.A07;
            i = 0;
            z = AbstractC25226BEj.A10(interfaceC09390do).A01.getBoolean("content_note_has_tapped_to_reply", false);
            j = AbstractC25226BEj.A10(interfaceC09390do).A01.getLong("content_note_tap_to_reply_nux_last_shown_timestamp", 0L);
            interfaceC19630xq = AbstractC25226BEj.A10(interfaceC09390do).A01;
            str = "content_note_tap_to_reply_nux_shown_count";
        } else {
            num2 = C05F.A01;
            InterfaceC09390do interfaceC09390do2 = A00.A07;
            i = 0;
            z = AbstractC25226BEj.A10(interfaceC09390do2).A01.getBoolean("content_note_has_double_tapped_to_like", false);
            j = AbstractC25226BEj.A10(interfaceC09390do2).A01.getLong("content_note_double_tap_to_like_nux_last_shown_timestamp", 0L);
            interfaceC19630xq = AbstractC25226BEj.A10(interfaceC09390do2).A01;
            str = "content_note_double_tap_to_like_nux_shown_count";
        }
        return new BSZ(num2, interfaceC19630xq.getInt(str, i), j, z);
    }
}
