package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.L2f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47646L2f {
    public int A00;
    public boolean A01;
    public final UserSession A02;
    public final List A03;

    public C47646L2f(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A03 = A1E;
        A1E.add(EnumC44049Jda.A06);
        if (C2E9.A03(userSession)) {
            A1E.add(EnumC44049Jda.A04);
        }
        if (C2E9.A0B(userSession)) {
            A1E.add(EnumC44049Jda.A05);
        }
        if (C2E9.A0F(userSession)) {
            A1E.add(EnumC44049Jda.A07);
        }
    }
}
