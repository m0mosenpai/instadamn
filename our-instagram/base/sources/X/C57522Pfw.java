package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.share.facebook.upsell.data.CLNoticeRepository;
import go.Seq;

/* renamed from: X.Pfw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57522Pfw extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57522Pfw(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C57522Pfw A00(Object obj, int i) {
        return new C57522Pfw(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        EnumC201878wK enumC201878wK;
        AudioOverlayTrack audioOverlayTrack;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(AbstractC31172DnG.A1X(AbstractC31179DnN.A04(this.A01), "standalone_mode"));
            case 1:
                C50724MaP c50724MaP = (C50724MaP) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c50724MaP.A0i);
                AnonymousClass841 anonymousClass841 = c50724MaP.A0G;
                if (anonymousClass841 == null) {
                    str = "creationCameraSession";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new NCT(A0r, anonymousClass841, AbstractC167007dF.A1Z(c50724MaP.A0j));
            case 2:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC25231BEo.A1H(abstractC52922bZ, AbstractC141776au.A00(abstractC52922bZ), 48);
                return C0eB.A00;
            case 3:
                return AbstractC166997dE.A0S(((Fragment) this.A01).requireView(), R.id.potato_capture_container);
            case 4:
            case 6:
            case 7:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            default:
                return AbstractC25235BEs.A0U(this.A01);
            case 5:
            case 8:
            case 30:
            case 32:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 44:
                return AbstractC50523MSb.A0A(this.A01);
            case 9:
                return new NB8(AbstractC31179DnN.A04(this.A01).getBoolean("HIDE_FROM_PROFILE_GRID"));
            case 10:
                return this.A01;
            case 11:
                return AbstractC25226BEj.A1C(this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return AbstractC167027dH.A0B(this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                NJL njl = (NJL) this.A01;
                if (njl.A0b) {
                    UserSession userSession = njl.A08;
                    if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36318441026230418L)) {
                        return new CLNoticeRepository(AbstractC166987dD.A0O(njl.A06.requireActivity()), userSession, "IG_REELS_PANAVISION_COMPOSER");
                    }
                    return null;
                }
                return new CLNoticeRepository(AbstractC166987dD.A0O(njl.A06.requireActivity()), njl.A08, "IG_REELS_COMPOSER");
            case 14:
                return new C52276NBr(((NJL) this.A01).A08, C05F.A01);
            case Process.SIGTERM /* 15 */:
                NJL njl2 = (NJL) this.A01;
                AbstractC59962oe abstractC59962oe = njl2.A06;
                return new OVl(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), njl2.A08);
            case 16:
                String str2 = ((NJL) this.A01).A09;
                if (str2 != null) {
                    return str2;
                }
                return "";
            case 17:
                return new NB6(((NJL) this.A01).A08);
            case 18:
                NJL njl3 = (NJL) this.A01;
                if (njl3.A0R.getValue() == EnumC53133Nem.A02) {
                    return new C54818OKt(njl3.A08, njl3.A06.requireContext());
                }
                return null;
            case Process.SIGSTOP /* 19 */:
                NJL njl4 = (NJL) this.A01;
                return new O7X(njl4.A08, njl4.A06.requireActivity());
            case 20:
                NJL njl5 = (NJL) this.A01;
                return new P0K(njl5.A06, njl5.A07, njl5.A08);
            case 21:
                NJL njl6 = (NJL) this.A01;
                return new C54970OTc(njl6.A06.requireActivity(), njl6.A08);
            case 22:
                NJL njl7 = (NJL) this.A01;
                UserSession userSession2 = njl7.A08;
                C22P c22p = ((C22F) AnonymousClass229.A01(userSession2)).A04.A09;
                C14360o3.A07(c22p);
                return new OXR(AbstractC53855Nrj.A00(c22p), njl7.A07, userSession2);
            case 23:
                NJL njl8 = (NJL) this.A01;
                return new P0I((OXR) njl8.A0L.getValue(), njl8.A07, njl8.A08);
            case 24:
                NJL njl9 = (NJL) this.A01;
                return new C52278NBt(njl9.A08, njl9.A0b);
            case 25:
                return new NB2(((NJL) this.A01).A08);
            case 26:
                Bundle bundle = ((NJL) this.A01).A05;
                if (bundle.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_IN_EDIT_DRAFT_MODE ")) {
                    return EnumC53133Nem.A03;
                }
                if (bundle.getBoolean("ClipsConstants.ARG_CLIPS_SHARE_SHEET_IS_IN_EDIT_DRAFT_LANDED_FROM_POST_CAP_MODE")) {
                    return EnumC53133Nem.A04;
                }
                return EnumC53133Nem.A02;
            case 27:
                NJL njl10 = (NJL) this.A01;
                AbstractC59962oe abstractC59962oe2 = njl10.A06;
                return new C50851Mdi(abstractC59962oe2.requireActivity(), abstractC59962oe2.requireActivity(), njl10.A08, AbstractC25225BEi.A15(njl10.A0F));
            case 28:
                C1XJ c1xj = C1XJ.A00;
                if (c1xj != null) {
                    NJL njl11 = (NJL) this.A01;
                    UserSession userSession3 = njl11.A08;
                    return c1xj.A04(((C22F) AnonymousClass229.A01(userSession3)).A04.A09, njl11.A07, userSession3, njl11.A0A);
                }
                return null;
            case 45:
                return new NB1(((NJL) this.A01).A08);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new NB9(((NJL) this.A01).A08);
            case 47:
                NJL njl12 = (NJL) this.A01;
                UserSession userSession4 = njl12.A08;
                CLNoticeRepository cLNoticeRepository = (CLNoticeRepository) njl12.A0C.getValue();
                if (njl12.A0b) {
                    enumC201878wK = EnumC201878wK.A03;
                } else {
                    enumC201878wK = EnumC201878wK.A02;
                }
                InterfaceC09390do interfaceC09390do = njl12.A0S;
                String str3 = null;
                if (((ClipsSharingDraftViewModel) interfaceC09390do.getValue()).A07() && (audioOverlayTrack = ((ClipsSharingDraftViewModel) interfaceC09390do.getValue()).A03().A0N) != null) {
                    str3 = audioOverlayTrack.A0E != null ? "original" : "song";
                }
                return new ND3(userSession4, enumC201878wK, cLNoticeRepository, str3);
            case 48:
                return new NB7(AbstractC166987dD.A0r(((N6J) this.A01).A0U));
            case 49:
                N6J n6j = (N6J) this.A01;
                OFX ofx = n6j.A06;
                str = "viewHolder";
                if (ofx != null) {
                    ofx.A08.A00.setVisibility(0);
                    OFX ofx2 = n6j.A06;
                    if (ofx2 != null) {
                        ofx2.A07.A00.setVisibility(8);
                        return C0eB.A00;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
