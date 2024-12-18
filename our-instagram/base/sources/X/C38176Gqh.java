package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Gqh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38176Gqh {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C38177Gqi A03;
    public final InterfaceC43545JLf A04;

    public /* synthetic */ C38176Gqh(UserSession userSession) {
        EnumC37328GcW enumC37328GcW = EnumC37328GcW.A05;
        InterfaceC43545JLf A00 = C37327GcV.A00(userSession, enumC37328GcW);
        AbstractC167017dG.A1P(userSession, A00);
        this.A02 = userSession;
        this.A04 = A00;
        C38177Gqi c38177Gqi = new C38177Gqi();
        this.A03 = c38177Gqi;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A00 = AbstractC25225BEi.A07(c06090Tz, userSession, 36594530111260419L);
        this.A01 = AbstractC25225BEi.A07(c06090Tz, userSession, 36594530111325956L);
        A00.ED1(enumC37328GcW, AbstractC166987dD.A1J(c38177Gqi));
    }

    public static final C128005qU A00(List list) {
        if (list.size() == 3) {
            ArrayList A1E = AbstractC166987dD.A1E();
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C127995qS c127995qS = new C127995qS(AbstractC127905qJ.A02(1, 1), null, (C38321qM) list.get(i));
                C5qT c5qT = new C5qT(0, i);
                A1E.add(c127995qS);
                A1I.put(c127995qS, c5qT);
            }
            return new C128005qU(null, A1E, A1I, 1);
        }
        throw AbstractC31172DnG.A0u();
    }
}
