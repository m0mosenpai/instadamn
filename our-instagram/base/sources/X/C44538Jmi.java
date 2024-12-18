package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageRepository;
import java.io.File;
import java.util.List;

/* renamed from: X.Jmi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44538Jmi extends AbstractC52922bZ {
    public static final InterfaceC09390do A0A = C1XM.A00(C50203MFk.A00);
    public final UserSession A00;
    public final ImageUrl A01;
    public final C34427FFr A02;
    public final ThreadDetailCustomGroupNameAndImageRepository A03;
    public final InterfaceC83733oI A04;
    public final String A05;
    public final C05A A06;
    public final C0UO A07;
    public final boolean A08;
    public final List A09;

    public final void A00(File file) {
        Object value;
        C05A c05a = this.A06;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C32072E6y.A00((C32072E6y) value, null, file, null, null, null, 222, true)));
    }

    public C44538Jmi(UserSession userSession, ImageUrl imageUrl, C34427FFr c34427FFr, InterfaceC83733oI interfaceC83733oI, String str, List list, boolean z) {
        AbstractC167027dH.A13(userSession, interfaceC83733oI, str);
        AbstractC167007dF.A1H(list, 5, c34427FFr);
        this.A00 = userSession;
        this.A04 = interfaceC83733oI;
        this.A05 = str;
        this.A01 = imageUrl;
        this.A09 = list;
        this.A08 = z;
        this.A02 = c34427FFr;
        C008002u A1H = AbstractC25225BEi.A1H(new C32072E6y(imageUrl, str, list, z));
        this.A06 = A1H;
        this.A07 = A1H;
        this.A03 = new ThreadDetailCustomGroupNameAndImageRepository(userSession);
    }
}
