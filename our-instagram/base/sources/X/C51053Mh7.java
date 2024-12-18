package X;

import com.facebook.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;
import com.instagram.mediakit.repository.MediaKitRepository;
import com.instagram.monetization.repository.MonetizationRepository;
import java.util.ArrayList;

/* renamed from: X.Mh7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51053Mh7 extends AbstractC52922bZ implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitViewModel";
    public OTU A00;
    public boolean A01;
    public final C41761wQ A02;
    public final UserSession A03;
    public final C2DS A04;
    public final ODC A05;
    public final OH7 A06;
    public final MediaKitRepository A07;
    public final ODD A08;
    public final C56389P2a A09;
    public final MonetizationRepository A0A;
    public final ArrayList A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;
    public final InterfaceC19390xP A0F;
    public final C05A A0G;
    public final C05A A0H;
    public final C05A A0I;
    public final C0UO A0J;
    public final C0UO A0K;
    public final C0UO A0L;
    public final C0UO A0M;
    public final C0UO A0N;
    public final InterfaceC11380iw A0O;
    public final C54780OIu A0P;

    public C51053Mh7(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2DS c2ds, C54780OIu c54780OIu, ODC odc, OH7 oh7, MediaKitRepository mediaKitRepository, MonetizationRepository monetizationRepository) {
        AbstractC25234BEr.A1R(odc, mediaKitRepository, monetizationRepository, oh7, c2ds);
        AbstractC167007dF.A1I(interfaceC11380iw, 7, c54780OIu);
        this.A03 = userSession;
        this.A05 = odc;
        this.A07 = mediaKitRepository;
        this.A0A = monetizationRepository;
        this.A06 = oh7;
        this.A04 = c2ds;
        this.A0O = interfaceC11380iw;
        this.A0P = c54780OIu;
        this.A02 = AbstractC31173DnH.A0S();
        this.A08 = OPO.A00(userSession);
        this.A09 = new C56389P2a(userSession, this, mediaKitRepository, this);
        C008002u A1H = AbstractC25225BEi.A1H(EnumC53120NeX.A03);
        this.A0H = A1H;
        AnonymousClass059 A02 = AbstractC208910l.A02(A1H);
        this.A0L = A02;
        C008002u A00 = C10E.A00(P5H.A00);
        this.A0G = A00;
        this.A0J = AbstractC208910l.A02(A00);
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A0C = c24721Ip;
        this.A0E = AbstractC07080Za.A03(c24721Ip);
        C0UO c0uo = mediaKitRepository.A0D;
        C15340po A1I = MSW.A1I(new C50534MSn(this, null, 31), new MZP(c0uo, 6));
        C141796aw A002 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        this.A0M = AbstractC208910l.A01(null, A002, A1I, c10h);
        C0UO c0uo2 = mediaKitRepository.A0C;
        C141796aw A003 = AbstractC141776au.A00(this);
        C16930sl c16930sl = C16930sl.A00;
        this.A0K = AbstractC208910l.A01(c16930sl, A003, c0uo2, c10h);
        C008002u A004 = C10E.A00(C56461P4y.A00);
        this.A0I = A004;
        this.A0N = AbstractC208910l.A01(c16930sl, AbstractC141776au.A00(this), C10Q.A00(new C57202Pam(this, 1), A004, c0uo, A02), c10h);
        C24721Ip c24721Ip2 = new C24721Ip(Integer.MAX_VALUE);
        this.A0D = c24721Ip2;
        this.A0F = AbstractC07080Za.A03(c24721Ip2);
        this.A0B = AbstractC166987dD.A1E();
        odc.A01 = C14360o3.A0K(odc.A03.userId, null);
        MediaKitRepository mediaKitRepository2 = this.A07;
        AbstractC25232BEp.A1J(this, new C50534MSn(this, null, 29), mediaKitRepository2.A05);
        AbstractC25232BEp.A1J(this, new PZW(this, null, 28), mediaKitRepository2.A06);
        C141796aw A005 = AbstractC141776au.A00(this);
        PZF pzf = new PZF(this, null, 22);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzf, A005);
        this.A02.A02(((C2DU) this.A04).A0C.A09(EnumC46982Dm.A04), new PKD(this, 3));
        if (this.A05.A04) {
            MonetizationRepository monetizationRepository2 = this.A0A;
            if (!monetizationRepository2.A0B.containsKey(UserMonetizationProductType.A07)) {
                AbstractC25232BEp.A1J(this, new C50534MSn(this, null, 32), monetizationRepository2.A0F);
                AbstractC23641Du.A05(anonymousClass191, new PZF(this, null, 24), AbstractC141776au.A00(this));
                return;
            }
        }
        A02();
    }

    public static final void A00(EnumC53252Ngq enumC53252Ngq, C51053Mh7 c51053Mh7) {
        boolean z;
        InterfaceC57838Pl4[] interfaceC57838Pl4Arr;
        InterfaceC57838Pl4 p5l;
        C51851Mvt A00;
        OH7 oh7 = c51053Mh7.A06;
        MediaKitRepository mediaKitRepository = c51053Mh7.A07;
        if (MediaKitRepository.A00(mediaKitRepository) != null && ((A00 = MediaKitRepository.A00(mediaKitRepository)) == null || A00.A03 == null)) {
            z = true;
        } else {
            z = false;
        }
        if (oh7.A00(enumC53252Ngq, z)) {
            int ordinal = enumC53252Ngq.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    interfaceC57838Pl4Arr = new InterfaceC57838Pl4[1];
                    MediaKitInfoSheetConfig mediaKitInfoSheetConfig = MediaKitInfoSheetConfig.A0D;
                    mediaKitInfoSheetConfig.A09 = new C57247PbV(c51053Mh7, 20);
                    mediaKitInfoSheetConfig.A00 = new ViewOnClickListenerC55461OkG(mediaKitInfoSheetConfig, 65);
                    p5l = new P5X(mediaKitInfoSheetConfig);
                }
                AbstractC31177DnL.A1N(oh7.A00, enumC53252Ngq.A00, true);
            }
            interfaceC57838Pl4Arr = new InterfaceC57838Pl4[1];
            OJU oju = new OJU(2131966777, 2131966776);
            oju.A02 = Integer.valueOf(R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
            oju.A00(EnumC193348hE.A03, new C57247PbV(c51053Mh7, 18), 2131966724);
            p5l = new P5L(oju);
            interfaceC57838Pl4Arr[0] = p5l;
            c51053Mh7.A03(interfaceC57838Pl4Arr);
            AbstractC31177DnL.A1N(oh7.A00, enumC53252Ngq.A00, true);
        }
    }

    public final void A02() {
        ODC odc = this.A05;
        if (odc.A04) {
            MonetizationRepository monetizationRepository = this.A0A;
            UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.A07;
            boolean A04 = monetizationRepository.A04(userMonetizationProductType);
            boolean A05 = monetizationRepository.A05(userMonetizationProductType);
            odc.A02 = A04;
            odc.A00 = A05;
        }
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return this.A0P;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0O.getModuleName();
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A02.A01();
    }

    public static void A01(InterfaceC57838Pl4 interfaceC57838Pl4, C51053Mh7 c51053Mh7) {
        c51053Mh7.A03(interfaceC57838Pl4);
    }

    public final void A03(InterfaceC57838Pl4... interfaceC57838Pl4Arr) {
        AbstractC166987dD.A1Z(new PYh(interfaceC57838Pl4Arr, this, null, 1), AbstractC37302Gc3.A08(this, interfaceC57838Pl4Arr));
    }
}
