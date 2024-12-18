package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Vm5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69359Vm5 {
    public C38132Gpz A00;
    public final C57112jm A01;
    public final C66148U1p A02;
    public final C42379Ipg A03;
    public final C70842Wi8 A04;
    public final Hashtag A05;

    public C69359Vm5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, JI3 ji3, C41587Iaa c41587Iaa, Hashtag hashtag) {
        C38132Gpz c38132Gpz;
        AbstractC37302Gc3.A1U(userSession, hashtag);
        this.A01 = c57112jm;
        this.A05 = hashtag;
        this.A03 = new C42379Ipg(c41587Iaa, null);
        this.A02 = new C66148U1p(interfaceC11380iw, userSession, new C70883Wjc(this));
        this.A04 = new C70842Wi8(c41587Iaa);
        if (ji3 != null) {
            c38132Gpz = new C38132Gpz(ji3);
        } else {
            c38132Gpz = null;
        }
        this.A00 = c38132Gpz;
    }
}
