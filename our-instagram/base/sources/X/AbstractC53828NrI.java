package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;

/* renamed from: X.NrI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53828NrI {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1oD] */
    public static final Object A00(C6FQ c6fq) {
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        if (C37161oE.A00 == null) {
            C37161oE.A00 = new Object();
        }
        C37161oE.A00();
        C14360o3.A0B(A0S, 0);
        DiversityInfoRepository A00 = AbstractC54281Nz1.A00(A0S);
        String str = A0S.userId;
        C14360o3.A0B(str, 0);
        AbstractC54280Nz0.A00(A00.A00).A00.remove(str);
        PZ1.A01(A00, str, A00.A02, 43);
        return null;
    }
}
