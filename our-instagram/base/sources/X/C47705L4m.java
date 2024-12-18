package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.L4m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47705L4m {
    public AudioOverlayTrack A00;
    public final UserSession A01;
    public final MOW A02;
    public final C52458NJc A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16660sJ A07;

    public C47705L4m(AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass840 anonymousClass840, MOW mow, C52458NJc c52458NJc, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = c52458NJc;
        this.A02 = mow;
        this.A07 = interfaceC16660sJ;
        this.A05 = AbstractC09440dt.A01(new ME5(31, anonymousClass840, this, abstractC59962oe));
        this.A04 = AbstractC09440dt.A01(new ME0(0, this, abstractC59962oe));
        this.A06 = AbstractC09440dt.A01(new ME0(1, this, abstractC59962oe));
    }
}
