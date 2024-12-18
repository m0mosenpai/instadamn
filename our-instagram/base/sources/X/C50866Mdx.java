package X;

import android.app.Application;
import com.facebook.cvat.ctsmartcreation.detectors.ctjumpcutdetector.CTJumpcutDetectorSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mdx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50866Mdx extends C193578hc {
    public O1O A00;
    public Zbg A01;
    public final OUF A02;
    public final InterfaceExecutorServiceC73393Qq A03;
    public final UserSession A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final C50665MYi A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50866Mdx(Application application, UserSession userSession) {
        super(application);
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        C50665MYi c50665MYi = new C50665MYi(userSession);
        this.A09 = c50665MYi;
        this.A02 = new OUF(new OTZ(c50665MYi, C05F.A0u, AbstractC167017dG.A0j()));
        this.A06 = AbstractC09440dt.A01(C57345Pd5.A00);
        this.A03 = MoreExecutors.listeningDecorator(new C14140ne(643412514, 3, false, true));
        this.A05 = C57521Pfv.A00(this, 26);
        this.A0B = C57521Pfv.A00(this, 27);
        this.A0A = C57521Pfv.A00(this, 25);
        this.A08 = C57521Pfv.A00(this, 29);
        this.A07 = C57521Pfv.A00(this, 28);
    }

    public static final void A02(C50866Mdx c50866Mdx, C115475Kh c115475Kh, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, int i) {
        CTJumpcutDetectorSettings cTJumpcutDetectorSettings;
        int i2 = c115475Kh.A09;
        int i3 = c115475Kh.A08;
        float abs = Math.abs(c115475Kh.A00);
        try {
            cTJumpcutDetectorSettings = new CTJumpcutDetectorSettings();
            cTJumpcutDetectorSettings.setMinSilenceDurationSec(MSZ.A03(c50866Mdx.A08));
            cTJumpcutDetectorSettings.setMinAudioDurationSec(MSZ.A03(c50866Mdx.A07));
        } catch (Exception unused) {
            cTJumpcutDetectorSettings = null;
        }
        OUF ouf = c50866Mdx.A02;
        EnumC53167NfO enumC53167NfO = EnumC53167NfO.A04;
        Zbe zbe = new Zbe(cTJumpcutDetectorSettings, c115475Kh.A0G.A0F);
        C54717OEu c54717OEu = new C54717OEu(c50866Mdx, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16620sF, abs, i, i2, i3);
        long nanoTime = System.nanoTime();
        Object obj = ouf.A01.get(enumC53167NfO);
        if (obj != null) {
            InterfaceC58099PpO AMW = ((InterfaceC57903Pm7) obj).AMW();
            O1O o1o = new O1O(zbe);
            ouf.A02.put(o1o, AMW);
            ouf.A03.execute(new RunnableC57078PTr(zbe, AMW, ouf, o1o, c54717OEu, AbstractC167017dG.A0r("type_name", enumC53167NfO.toString()), nanoTime));
            c50866Mdx.A00 = o1o;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
