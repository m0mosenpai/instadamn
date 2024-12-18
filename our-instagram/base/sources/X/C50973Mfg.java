package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.HashMap;

/* renamed from: X.Mfg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50973Mfg extends AbstractC52922bZ {
    public final int A00;
    public final Application A01;
    public final UserSession A02;
    public final ClipsCreationViewModel A03;
    public final C187418Sj A04;
    public final C187358Sd A05;
    public final HashMap A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;

    public C50973Mfg(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187418Sj c187418Sj, C187358Sd c187358Sd, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        AbstractC25234BEr.A0j(2, userSession, clipsCreationViewModel, c187358Sd, c187418Sj);
        C14360o3.A0B(interfaceC16820sZ, 8);
        this.A01 = application;
        this.A02 = userSession;
        this.A03 = clipsCreationViewModel;
        this.A05 = c187358Sd;
        this.A04 = c187418Sj;
        this.A00 = i;
        this.A08 = z;
        this.A07 = interfaceC16820sZ;
        this.A06 = AbstractC166987dD.A1G();
    }

    public final NIW A00(String str) {
        HashMap hashMap = this.A06;
        if (!hashMap.containsKey(str)) {
            Application application = this.A01;
            UserSession userSession = this.A02;
            ClipsCreationViewModel clipsCreationViewModel = this.A03;
            C187358Sd c187358Sd = this.A05;
            hashMap.put(str, new NIW(application, userSession, clipsCreationViewModel, this.A04, c187358Sd, str, this.A07, this.A00, this.A08));
        }
        Object obj = hashMap.get(str);
        if (obj != null) {
            return (NIW) obj;
        }
        throw AbstractC166997dE.A0g();
    }
}
