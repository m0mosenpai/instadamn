package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.JlR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44459JlR extends C193578hc {
    public static final C19270xB A0B = AbstractC31171DnF.A0D("FanClubContentPreviewPickerViewModel");
    public final UserSession A00;
    public final Ld8 A01;
    public final PendingMediaStore A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44459JlR(Application application, UserSession userSession, Ld8 ld8, PendingMediaStore pendingMediaStore, String str) {
        super(application);
        AbstractC167027dH.A0a(1, application, userSession, pendingMediaStore, ld8);
        C14360o3.A0B(str, 5);
        this.A00 = userSession;
        this.A02 = pendingMediaStore;
        this.A01 = ld8;
        this.A03 = str;
        this.A04 = AbstractC09440dt.A01(new J7K(this, 5));
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        C008002u A002 = C10E.A00(null);
        this.A09 = A002;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A07 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A06 = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A05 = A1H3;
        C31199Dni c31199Dni = new C31199Dni(17, new InterfaceC19390xP[]{A00, ld8.A04, A002, A1H, A1H2, A1H3}, this);
        this.A0A = AbstractC208910l.A01(new C39131HKk(C16930sl.A00, false), AbstractC141776au.A00(this), c31199Dni, C10I.A00);
    }
}
