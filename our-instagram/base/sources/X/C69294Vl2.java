package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Vl2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69294Vl2 {
    public final long A00;
    public final C18920wW A01;
    public final Hashtag A02;
    public final String A03;
    public final String A04;

    public C69294Vl2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Hashtag hashtag, String str, String str2, long j) {
        AbstractC25233BEq.A0w(2, userSession, str, hashtag);
        C14360o3.A0B(str2, 6);
        this.A03 = str;
        this.A02 = hashtag;
        this.A00 = j;
        this.A04 = str2;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
