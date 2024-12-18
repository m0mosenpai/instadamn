package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class Li6 implements AnonymousClass797 {
    public final /* synthetic */ AnonymousClass795 A00;

    public /* synthetic */ Li6(AnonymousClass795 anonymousClass795) {
        this.A00 = anonymousClass795;
    }

    @Override // X.AnonymousClass797
    public final InterfaceC129555tK AXe(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im) {
        C83403nh c83403nh = c160787Im.A0e;
        C1120954b c1120954b = c83403nh.A12;
        c1120954b.getClass();
        C9BH c9bh = c1120954b.A00;
        c9bh.getClass();
        GifUrlImpl gifUrlImpl = (GifUrlImpl) c9bh.A00;
        DirectMessageIdentifier A0V = c83403nh.A0V();
        String A0z = AbstractC43593JPy.A0z(c160787Im.A0K);
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(c1120954b.A03);
        C17050sx A01 = AbstractC09440dt.A01(new M8X(0));
        C2EY c2ey = C2EY.A0K;
        return new C163167Sb(C7QM.A00(context, userSession, anonymousClass988, c160787Im, c2ey), C7QK.A04(userSession, anonymousClass988, c160787Im, c7im, c2ey, A01), A0V, gifUrlImpl, A0z, equals, false, bool.equals(c1120954b.A02));
    }
}
