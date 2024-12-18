package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190388bw extends C4A7 {
    public C38687GzS A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C190388bw(UserSession userSession) {
        super("GroupMention", C4A8.A01(1746325272, 3));
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final InterfaceC19390xP A00(String str) {
        C38687GzS c38687GzS = this.A00;
        if (c38687GzS != null && C14360o3.A0K(c38687GzS.A01, str)) {
            C217859kI c217859kI = (C217859kI) c38687GzS.A00;
            if (c217859kI.A06.size() + c217859kI.A05.size() > 1) {
                List singletonList = Collections.singletonList(c217859kI);
                C14360o3.A07(singletonList);
                return new C16440rp(singletonList);
            }
        }
        return C0JE.A01(new PZL((InterfaceC23621Ds) null, this, 2));
    }
}
