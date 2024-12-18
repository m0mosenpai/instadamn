package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.FaR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34941FaR {
    public final InterfaceC02550Ad A00;
    public final FRT A01;

    public static final void A00(C34941FaR c34941FaR, String str, int i) {
        EnumC72433Xdd enumC72433Xdd;
        EnumC33519Ers enumC33519Ers;
        C25531Mh A0J = C25531Mh.A0J(c34941FaR.A00);
        if (AbstractC25226BEj.A1Z(A0J)) {
            A0J.A0Z(39);
            A0J.A0X(i);
            FRT frt = c34941FaR.A01;
            if (frt.A01.intValue() != 0) {
                enumC72433Xdd = EnumC72433Xdd.A05;
            } else {
                enumC72433Xdd = EnumC72433Xdd.A06;
            }
            A0J.A0M(enumC72433Xdd, "thread_type");
            if (frt.A00.intValue() != 0) {
                enumC33519Ers = EnumC33519Ers.A06;
            } else {
                enumC33519Ers = EnumC33519Ers.A05;
            }
            A0J.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            if (str != null) {
                A0J.A0R("prompt_id", str);
            }
            A0J.Cht();
        }
    }

    public C34941FaR(FoaUserSession foaUserSession, FRT frt) {
        AbstractC167017dG.A1P(foaUserSession, frt);
        this.A01 = frt;
        this.A00 = AbstractC12220kQ.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }
}
