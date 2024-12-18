package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BbJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25802BbJ extends C193578hc {
    public final InterfaceC74953Yl A00;
    public final List A01;
    public final InterfaceC09390do A02;
    public final C05A A03;
    public final C0UO A04;
    public final UserSession A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25802BbJ(Application application, UserSession userSession, C8CW c8cw, String str) {
        super(application);
        AbstractC167017dG.A1P(application, userSession);
        this.A05 = userSession;
        this.A02 = DH0.A00(c8cw, new C8CY(c8cw.A00), 17);
        C008002u A1H = AbstractC25225BEi.A1H(new C51756Mtf((Object) null, 39));
        this.A03 = A1H;
        this.A01 = AbstractC16960so.A1Q("I’d rather be", "My happy place", "My job in another life", "Manifesting for 2024", "Where you want to go this summer", "Mentally I'm here", "Vibes this week ", "Mood today", "You in your worst nightmare", "A photo of you in a place you love", "You in one photo");
        this.A04 = A1H;
        this.A00 = AbstractC25230BEn.A0U(CH8.A00(AbstractC25227BEk.A0S(str == null ? "" : str)));
        AbstractC25231BEo.A1H(this, AbstractC141776au.A00(this), 26);
    }
}
