package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.api.schemas.TrackData;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.GtV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38335GtV extends AbstractC52922bZ implements InterfaceC58066Por {
    public C50679MYx A00;
    public AudioFilterType A01;
    public AudioPageAssetModel A02;
    public List A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C2GT A07;
    public final MusicPageTabType A08;
    public final C154846xZ A09;
    public final UserSession A0A;
    public final C52678NSa A0B;
    public final IKW A0C;
    public final String A0D;
    public final String A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC24731Iq A0G;
    public final InterfaceC24731Iq A0H;
    public final InterfaceC19390xP A0I;
    public final InterfaceC19390xP A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final AbstractC018607g A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C05A A0T;

    public final void A02(Context context, AudioFilterType audioFilterType, UserSession userSession, int i, boolean z) {
        InterfaceC88553xD interfaceC88553xD;
        IGL igl;
        TrackData trackData;
        MusicAssetModel A00;
        if (context != null) {
            MusicDataSource musicDataSource = null;
            this.A0K.Egh(null);
            AudioFilterType audioFilterType2 = AudioFilterType.A0A;
            if (audioFilterType != audioFilterType2) {
                AbstractC166997dE.A1Y(this.A0M, true);
            }
            C38639Gyg c38639Gyg = (C38639Gyg) this.A06.A02();
            if (c38639Gyg != null) {
                interfaceC88553xD = c38639Gyg.A01;
            } else {
                interfaceC88553xD = null;
            }
            C38959HDl c38959HDl = (C38959HDl) this.A04.A02();
            if (c38959HDl != null) {
                igl = c38959HDl.A05;
            } else {
                igl = null;
            }
            if (interfaceC88553xD != null && igl != null) {
                if (interfaceC88553xD.Ae7() == AudioType.A04) {
                    A00 = MusicAssetModel.A00(igl.A01, interfaceC88553xD.CQ9());
                } else {
                    MusicInfoImpl musicInfoImpl = igl.A00;
                    if (musicInfoImpl != null) {
                        trackData = musicInfoImpl.A00;
                    } else {
                        trackData = null;
                    }
                    A00 = AbstractC37941Gme.A00(trackData);
                }
                if (audioFilterType == audioFilterType2) {
                    if (A00 != null) {
                        musicDataSource = A00.A05;
                    }
                    A01(musicDataSource, this, 1.0f, i, z);
                } else {
                    if (A00 == null) {
                        return;
                    }
                    WlS wlS = new WlS(context, audioFilterType, userSession, A00, this, i, z);
                    C8KO c8ko = new C8KO(context, userSession, new C42735IvV(), 0);
                    String str = A00.A0H;
                    C14360o3.A07(str);
                    c8ko.A04(A00, wlS, str, 0, A00.A00, false);
                }
            }
        }
    }

    public final void A04(InterfaceC88553xD interfaceC88553xD, String str) {
        AbstractC167017dG.A1N(str, interfaceC88553xD);
        AbstractC166987dD.A1Z(new PZQ(interfaceC88553xD, this, str, null, 47), AbstractC141776au.A00(this));
    }

    @Override // X.InterfaceC58066Por
    public final void DqJ(boolean z) {
    }

    public C38335GtV(AbstractC018607g abstractC018607g, MusicPageTabType musicPageTabType, C154846xZ c154846xZ, UserSession userSession, C52678NSa c52678NSa, IKW ikw, String str, String str2) {
        C14360o3.A0B(abstractC018607g, 4);
        AbstractC167007dF.A1I(musicPageTabType, 6, c52678NSa);
        this.A0A = userSession;
        this.A0D = str;
        this.A0Q = abstractC018607g;
        this.A0C = ikw;
        this.A08 = musicPageTabType;
        this.A09 = c154846xZ;
        this.A0B = c52678NSa;
        this.A0E = str2;
        C008002u A00 = C10E.A00(null);
        this.A0L = A00;
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A0P = A1A;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A0O = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0N = A1H2;
        C008002u A002 = C10E.A00(null);
        this.A0T = A002;
        C008002u A003 = C10E.A00(null);
        this.A0K = A003;
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A0M = A1H3;
        C008002u A1H4 = AbstractC25225BEi.A1H(Float.valueOf(1.0f));
        this.A0S = A1H4;
        C008002u A1H5 = AbstractC25225BEi.A1H(false);
        this.A0R = A1H5;
        this.A0F = J8Z.A00(this, 19);
        C15200pa A01 = C10Q.A01(new C43173J6t(this, null, 1), A1H, A1H2, A00, c52678NSa.A03(str, false));
        C141796aw A004 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        C16930sl c16930sl = C16930sl.A00;
        AnonymousClass059 A012 = AbstractC208910l.A01(new C38646Gyn(null, null, null, null, null, c16930sl, true, true, false, false), A004, A01, c10h);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, A012);
        this.A04 = AbstractC58232lf.A00(anonymousClass191, A00);
        this.A06 = AbstractC58232lf.A00(anonymousClass191, new MV5(34, this, new InterfaceC19390xP[]{A00, A002, A003, A1H3, A1H4, A1H5}));
        this.A03 = c16930sl;
        C15180pY A02 = C10Q.A02(new C43174J6u(this, null), C0JE.A00(new C57156PZa(ikw, null, 10)), A1H, A1A, A1H2, A00);
        this.A07 = AbstractC58232lf.A00(anonymousClass191, AbstractC208910l.A01(new C38653Gyu(null, null, MusicPageTabType.A04, null, null, null, null, c16930sl, true, true, false, false), AbstractC141776au.A00(this), A02, c10h));
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A0H = c24721Ip;
        this.A0J = AbstractC07080Za.A03(c24721Ip);
        C24721Ip c24721Ip2 = new C24721Ip(Integer.MAX_VALUE);
        this.A0G = c24721Ip2;
        this.A0I = AbstractC07080Za.A03(c24721Ip2);
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new C15340po(new C43170J6p(this, null), C10Q.A03(new C57176PZz(7, null), AnonymousClass111.A02(new MU8(ikw, (InterfaceC23621Ds) null, 45), ikw.A09), ikw.A01)));
    }

    public static C38653Gyu A00(C38335GtV c38335GtV) {
        return (C38653Gyu) c38335GtV.A07.A02();
    }

    public static final void A01(MusicDataSource musicDataSource, C38335GtV c38335GtV, float f, int i, boolean z) {
        c38335GtV.A0K.Egh(musicDataSource);
        c38335GtV.A0T.Egh(Integer.valueOf(i));
        c38335GtV.A0S.Egh(Float.valueOf(f));
        AbstractC166997dE.A1Y(c38335GtV.A0R, z);
    }

    public final void A03(AudioPageAssetModel audioPageAssetModel) {
        if (audioPageAssetModel != null) {
            this.A02 = audioPageAssetModel;
            AbstractC166987dD.A1Z(new D51(this, (InterfaceC23621Ds) null, 39), AbstractC141776au.A00(this));
        }
        AbstractC166997dE.A1Y(this.A0P, AbstractC167007dF.A1W(audioPageAssetModel));
        IKW ikw = this.A0C;
        AbstractC018607g abstractC018607g = this.A0Q;
        C14360o3.A0B(abstractC018607g, 1);
        Integer num = ikw.A00;
        Integer num2 = C05F.A0C;
        if (num == num2 || num == C05F.A01) {
            InterfaceC09390do interfaceC09390do = ikw.A08;
            if (interfaceC09390do.getValue() == EnumC125615m7.A04 || interfaceC09390do.getValue() == EnumC125615m7.A02) {
                AbstractC166997dE.A1Y(ikw.A01, AbstractC167007dF.A1X(ikw.A00, num2));
                return;
            }
        }
        if (audioPageAssetModel != null) {
            C05A c05a = ikw.A09;
            Context context = ikw.A02;
            UserSession userSession = ikw.A04;
            c05a.Egh(new AbstractC153666vb(context, abstractC018607g, new C42196Imi(ikw.A03, audioPageAssetModel, 0, true, false), AbstractC31171DnF.A0D("audio_page"), userSession));
        }
        Object value = ikw.A09.getValue();
        if (value != null) {
            ikw.A00 = C05F.A01;
            AbstractC37302Gc3.A1N((AbstractC153666vb) value);
            return;
        }
        throw AbstractC166987dD.A14("Called fetch without initializing fetcher");
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        IKW ikw = this.A0C;
        ikw.A06.A07(ikw.A07);
    }

    @Override // X.InterfaceC58066Por
    public final void DEM(Integer num, String str, boolean z) {
        AbstractC167017dG.A1P(num, str);
        AbstractC54180NxH.A00(num, str, z);
        AbstractC166987dD.A1Z(new PZK(this, null, 20, z), AbstractC141776au.A00(this));
    }
}
