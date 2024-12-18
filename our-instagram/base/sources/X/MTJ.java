package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* loaded from: classes9.dex */
public class MTJ extends JQS {
    public final C69613Av A00;
    public final int A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTJ(UserSession userSession, String str, int i) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = i;
        this.A00 = A02(str);
    }

    @Override // X.AbstractC69603Au
    @Deprecated(message = "Use the qplEventId field directly", replaceWith = @ReplaceWith(expression = "qplEventId", imports = {}))
    public final int A01() {
        return this.A01;
    }
}
