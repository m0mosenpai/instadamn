package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7Il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160777Il {
    public final UserSession A00;
    public final AbstractC13660ms A01;
    public final C93384Gr A02;

    public final ArrayList A00() {
        String A0h;
        ArrayList arrayList = new ArrayList();
        AbstractC13660ms abstractC13660ms = this.A01;
        for (int i = abstractC13660ms.A01 - 1; -1 < i; i--) {
            if (abstractC13660ms.A04(i) instanceof C160787Im) {
                Object A04 = abstractC13660ms.A04(i);
                C14360o3.A0C(A04, "null cannot be cast to non-null type com.instagram.direct.messagethread.rowdata.DirectMessageRowData");
                C83403nh c83403nh = ((C160787Im) A04).A0e;
                C14360o3.A07(c83403nh);
                if (!C77S.A00(c83403nh, this.A02, this.A00.userId, true) && (A0h = c83403nh.A0h()) != null) {
                    arrayList.add(A0h);
                }
            }
        }
        return arrayList;
    }

    public C160777Il(UserSession userSession, AbstractC13660ms abstractC13660ms, C93384Gr c93384Gr) {
        this.A00 = userSession;
        this.A02 = c93384Gr;
        this.A01 = abstractC13660ms;
    }
}
