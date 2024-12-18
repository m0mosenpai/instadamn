package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159497Dk {
    public final Context A00;
    public final UserSession A01;
    public final C2DS A02;

    public static final void A00(C159497Dk c159497Dk, C83693oE c83693oE, MessageIdentifier messageIdentifier) {
        String str = c83693oE.A00;
        if (str != null) {
            String str2 = messageIdentifier.A01;
            String A00 = messageIdentifier.A00();
            C1GK A01 = C1GJ.A01();
            C25621Ms c25621Ms = new C25621Ms(c159497Dk.A01, -2);
            c25621Ms.A05();
            c25621Ms.A0L("direct_v2/threads/%s/pin_message/", str);
            c25621Ms.A9s("pin_message_item_id", str2);
            c25621Ms.A9s("client_context", A00);
            c25621Ms.A0R(C40781ul.class, C55702hA.class);
            A01.schedule(c25621Ms.A0N());
        }
    }

    public C159497Dk(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = AbstractC28761aE.A00(userSession);
    }
}
