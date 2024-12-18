package X;

import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mg9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51002Mg9 extends AbstractC52922bZ {
    public boolean A00;
    public final C191138dB A01;
    public final QuickSnapArchiveRepository A02;
    public final QuickSnapRepository A03;
    public final QuickSnapMediaSaver A04;
    public final String A05;
    public final InterfaceC19390xP A06;
    public final InterfaceC06180Ui A07;
    public final C05A A08;
    public final C0UO A09;
    public final UserSession A0A;

    public C51002Mg9(UserSession userSession, C191138dB c191138dB, QuickSnapArchiveRepository quickSnapArchiveRepository, QuickSnapRepository quickSnapRepository, QuickSnapMediaSaver quickSnapMediaSaver, String str) {
        AbstractC167017dG.A1R(str, quickSnapRepository);
        this.A0A = userSession;
        this.A05 = str;
        this.A03 = quickSnapRepository;
        this.A02 = quickSnapArchiveRepository;
        this.A01 = c191138dB;
        this.A04 = quickSnapMediaSaver;
        C008002u A1H = AbstractC25225BEi.A1H(new C51755Mte((C54721OEy) null, (DefaultConstructorMarker) null, 1, 44));
        this.A08 = A1H;
        this.A09 = A1H;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A07 = A00;
        this.A06 = A00;
        if (str.length() == 0) {
            A00(new P7U(false), this);
            return;
        }
        C141796aw A002 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new PZX(this, null, 38), A002);
    }

    public static final void A00(InterfaceC57842Pl8 interfaceC57842Pl8, C51002Mg9 c51002Mg9) {
        AbstractC166987dD.A1Z(new PZX(c51002Mg9, interfaceC57842Pl8, (InterfaceC23621Ds) null, 39), AbstractC141776au.A00(c51002Mg9));
    }
}
