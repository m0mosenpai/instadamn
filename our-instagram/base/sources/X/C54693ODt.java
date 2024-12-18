package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.ODt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54693ODt {
    public final C58252li A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final O8E A03;
    public final String A04;
    public final String A05;

    public C54693ODt(MusicProduct musicProduct, UserSession userSession, O8E o8e, String str, String str2) {
        AbstractC167027dH.A0a(1, userSession, musicProduct, str, str2);
        this.A02 = userSession;
        this.A01 = musicProduct;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = o8e;
        C58252li c58252li = new C58252li();
        this.A00 = c58252li;
        C55562Olw.A00(o8e.A00, c58252li, MSW.A1E(c58252li, 33), 63);
    }
}
