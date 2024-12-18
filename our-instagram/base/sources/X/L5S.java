package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.barcelona.search.data.SearchTopicsRepository;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L5S {
    public final C68080V9l A00;
    public final KZ3 A01;
    public final PostViewStateRepository A02;
    public final C47517Kyk A03;
    public final C136566Gk A04;
    public final C47518Kyl A05;
    public final LEH A06;
    public final SearchTopicsRepository A07;
    public final C47603L0o A08;
    public final UserSession A09;
    public final C1DX A0A;
    public final InterfaceC60442pS A0B;
    public final Integer A0C;
    public final String A0D;
    public final InterfaceC16660sJ A0E;
    public final InterfaceC16660sJ A0F;
    public final C19L A0G;

    public L5S(C47603L0o c47603L0o, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Integer num, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, C19L c19l) {
        AbstractC43594JPz.A1P(interfaceC16660sJ2, str);
        C47517Kyk c47517Kyk = new C47517Kyk(userSession, interfaceC60442pS);
        C14360o3.A0B(userSession, 0);
        LEH leh = (LEH) userSession.A01(LEH.class, new C50155MDi(userSession, 37));
        PostViewStateRepository postViewStateRepository = (PostViewStateRepository) userSession.A01(PostViewStateRepository.class, new C50154MDh(userSession, 37));
        KZ3 kz3 = (KZ3) userSession.A01(KZ3.class, new C50154MDh(userSession, 35));
        C68080V9l c68080V9l = (C68080V9l) userSession.A01(C68080V9l.class, new C50154MDh(userSession, 18));
        C1DX A00 = C1DW.A00(userSession);
        AbstractC167017dG.A1U(leh, postViewStateRepository);
        AbstractC167007dF.A1J(kz3, 8, c68080V9l);
        C14360o3.A0B(A00, 10);
        this.A0E = interfaceC16660sJ;
        this.A0F = interfaceC16660sJ2;
        this.A08 = c47603L0o;
        this.A0D = str;
        this.A03 = c47517Kyk;
        this.A06 = leh;
        this.A02 = postViewStateRepository;
        this.A01 = kz3;
        this.A00 = c68080V9l;
        this.A0A = A00;
        this.A09 = userSession;
        this.A0B = interfaceC60442pS;
        this.A0C = num;
        this.A0G = c19l;
        this.A04 = AbstractC136556Gj.A00(userSession);
        this.A05 = (C47518Kyl) userSession.A01(C47518Kyl.class, MEp.A00);
        this.A07 = (SearchTopicsRepository) userSession.A01(SearchTopicsRepository.class, new C50150MDd(userSession, 3));
    }
}
