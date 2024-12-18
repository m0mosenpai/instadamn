package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1;

/* renamed from: X.Mdt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50862Mdt extends C193578hc {
    public String A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final C05A A04;
    public final int A05;
    public final C156186zn A06;
    public final String A07;
    public final boolean A08;

    public final void A0E() {
        C05A c05a = this.A04;
        Object value = c05a.getValue();
        C52664NRl c52664NRl = C52664NRl.A00;
        if (!C14360o3.A0K(value, c52664NRl) && this.A00 != null) {
            c05a.Egh(c52664NRl);
            C156186zn c156186zn = this.A06;
            Context A0G = MSZ.A0G(this);
            UserSession userSession = this.A02;
            String str = this.A03;
            String str2 = this.A07;
            Integer valueOf = Integer.valueOf(this.A05);
            String str3 = this.A00;
            Boolean A0b = AbstractC166997dE.A0b();
            Boolean valueOf2 = Boolean.valueOf(this.A08);
            AbstractC166987dD.A1Z(new StoryHighlightsRepository$fetchMoreStoryHighlights$1(A0G, userSession, c156186zn, A0b, valueOf2, valueOf, str, str2, str3, null, false), ((C4A7) c156186zn).A01);
        }
    }

    public final void A0F() {
        C156186zn c156186zn = this.A06;
        Context A0G = MSZ.A0G(this);
        UserSession userSession = this.A02;
        String str = this.A03;
        c156186zn.A00(A0G, userSession, C6r8.A00, AbstractC166997dE.A0b(), AbstractC166997dE.A0a(), Boolean.valueOf(this.A08), Integer.valueOf(this.A05), str, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50862Mdt(Application application, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, boolean z) {
        super(application);
        AbstractC167017dG.A1P(userSession, str);
        AbstractC167017dG.A1T(interfaceC11380iw, application);
        this.A02 = userSession;
        this.A03 = str;
        this.A05 = i;
        this.A08 = z;
        this.A01 = interfaceC11380iw;
        C156186zn c156186zn = new C156186zn(3, false);
        this.A06 = c156186zn;
        this.A04 = C10E.A00(C52662NRj.A00);
        this.A07 = AbstractC167017dG.A0j();
        AbstractC25232BEp.A1J(this, new PZI(this, null, 0), c156186zn.A01);
    }
}
