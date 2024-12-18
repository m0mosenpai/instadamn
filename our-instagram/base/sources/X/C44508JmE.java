package X;

import com.instagram.barcelona.feed.post.data.PostViewStateRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.Closeable;

/* renamed from: X.JmE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44508JmE extends AbstractC52922bZ {
    public C70604Wdi A00;
    public final PostViewStateRepository A01;
    public final LEH A02;
    public final L5V A03;
    public final C47602L0n A04;
    public final C47687L3u A05;
    public final C48245LWu A06;
    public final UserSession A07;
    public final InterfaceC60442pS A08;
    public final C23031Ai A09;
    public final User A0A;
    public final InterfaceC16820sZ A0B;
    public final C05A A0C;
    public final C0UO A0D;

    public /* synthetic */ C44508JmE(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, InterfaceC16820sZ interfaceC16820sZ) {
        KZX kzx = new KZX(userSession, str, str);
        C14360o3.A0B(userSession, 0);
        LEH leh = (LEH) userSession.A01(LEH.class, new C50155MDi(userSession, 37));
        PostViewStateRepository postViewStateRepository = (PostViewStateRepository) userSession.A01(PostViewStateRepository.class, new C50154MDh(userSession, 37));
        C47602L0n c47602L0n = (C47602L0n) userSession.A01(C47602L0n.class, new C50150MDd(userSession, 4));
        int A07 = AbstractC25230BEn.A07(2, str, interfaceC60442pS);
        AbstractC25229BEm.A1I(interfaceC16820sZ, 4, leh);
        AbstractC167007dF.A1I(postViewStateRepository, 7, c47602L0n);
        this.A07 = userSession;
        this.A08 = interfaceC60442pS;
        this.A0B = interfaceC16820sZ;
        this.A02 = leh;
        this.A01 = postViewStateRepository;
        this.A04 = c47602L0n;
        User A0Y = AbstractC166997dE.A0Y(userSession);
        this.A0A = A0Y;
        this.A09 = AbstractC23021Ah.A00(userSession);
        this.A05 = new C47687L3u(userSession, interfaceC60442pS, interfaceC16820sZ, new C50259MHo(this, 16), AbstractC43592JPx.A18(this, A07));
        C48245LWu c48245LWu = new C48245LWu(this);
        this.A06 = c48245LWu;
        L5V l5v = new L5V(c48245LWu, postViewStateRepository, kzx, c47602L0n, userSession, interfaceC60442pS, A0Y, str, str, AbstractC141776au.A00(this));
        this.A03 = l5v;
        C008002u A1H = AbstractC25225BEi.A1H(new JWd((C45079Jx9) l5v.A0I.getValue(), AbstractC166997dE.A0Y(userSession).getUsername(), false));
        this.A0C = A1H;
        this.A0D = AbstractC208910l.A02(A1H);
        C141796aw A00 = AbstractC141776au.A00(this);
        MC3 mc3 = new MC3(this, (InterfaceC23621Ds) null, 7);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mc3, A00);
        addCloseable((Closeable) kzx);
        AbstractC23641Du.A05(anonymousClass191, new MC3(l5v, (InterfaceC23621Ds) null, A07), l5v.A0F);
    }
}
