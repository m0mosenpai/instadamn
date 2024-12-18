package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.neko.playables.activity.PlayableAdActivity;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PbT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57245PbT extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57245PbT(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean A06;
        FollowRequestsRepository followRequestsRepository;
        InterfaceC16660sJ interfaceC16660sJ;
        EnumC33370Ep3 enumC33370Ep3;
        C06090Tz c06090Tz;
        long j;
        switch (this.A00) {
            case 0:
            case 1:
                return AbstractC25235BEs.A0U(this.A01);
            case 2:
                return this.A01;
            case 3:
                return AbstractC25226BEj.A1C(this.A01);
            case 4:
                return AbstractC167027dH.A0B(this.A01);
            case 5:
                NQI nqi = (NQI) this.A01;
                return new ND9(nqi.requireContext(), AbstractC166987dD.A0r(nqi.A0A), nqi, nqi.A00);
            case 6:
                NQI nqi2 = (NQI) this.A01;
                return AbstractC50522MSa.A0V(nqi2, nqi2.A0A);
            case 7:
                NQI nqi3 = (NQI) this.A01;
                return AbstractC50522MSa.A0W(nqi3, nqi3.A0A);
            case 8:
                return new NBB(AbstractC166987dD.A0r(((NQI) this.A01).A0A));
            case 9:
                return AbstractC166997dE.A0X(((C54692ODs) this.A01).A01, R.id.music_note_spotify_account_linking_footer_stub);
            case 10:
                return AbstractC166997dE.A0X(((C54692ODs) this.A01).A01, R.id.music_note_share_from_Spotify_footer_stub);
            case 11:
                return AbstractC166997dE.A0i(C06090Tz.A05, ((C50668MYm) this.A01).A00, 36606916796880406L);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                HMZ hmz = (HMZ) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                A06 = AbstractC185298Jv.A02(hmz.A0B);
                return Boolean.valueOf(A06);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                HMZ hmz2 = (HMZ) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                A06 = C36A.A00(hmz2.A0A, hmz2.A0B);
                return Boolean.valueOf(A06);
            case 14:
                HMZ hmz3 = (HMZ) this.A01;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                UserSession userSession = hmz3.A0B;
                MusicProduct musicProduct = hmz3.A0A;
                AbstractC167017dG.A1N(userSession, musicProduct);
                if (musicProduct == MusicProduct.A06) {
                    c06090Tz = C06090Tz.A05;
                    j = 36604056349316124L;
                } else if (musicProduct == MusicProduct.A0G) {
                    c06090Tz = C06090Tz.A05;
                    j = 36604056349185050L;
                } else if (AbstractC65993Txo.A02(musicProduct)) {
                    c06090Tz = C06090Tz.A05;
                    j = 36604056349381661L;
                } else if (musicProduct == MusicProduct.A0H) {
                    c06090Tz = C06090Tz.A05;
                    j = 36604056349250587L;
                } else {
                    if (musicProduct == MusicProduct.A07) {
                        c06090Tz = C06090Tz.A05;
                        j = 36604056349512734L;
                    }
                    return EnumC53227NgP.A04;
                }
                long A01 = C18U.A01(c06090Tz, userSession, j);
                for (EnumC53227NgP enumC53227NgP : EnumC53227NgP.values()) {
                    if (enumC53227NgP.A00 == A01) {
                        return enumC53227NgP;
                    }
                }
                return EnumC53227NgP.A04;
            case Process.SIGTERM /* 15 */:
                C50979Mfm c50979Mfm = (C50979Mfm) this.A01;
                A06 = C36A.A00(c50979Mfm.A06, c50979Mfm.A07);
                return Boolean.valueOf(A06);
            case 16:
                Bundle A0A = AbstractC31173DnH.A0A((Activity) this.A01);
                if (A0A != null) {
                    return A0A;
                }
                throw AbstractC166997dE.A0g();
            case 17:
                return C023409i.A0A.A06((Bundle) ((PlayableAdActivity) this.A01).A00.getValue());
            case 18:
                A06 = C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 36319905607524147L);
                return Boolean.valueOf(A06);
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 22:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A08;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 20:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A04;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 23:
            case 24:
            case 25:
            default:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A03;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 26:
            case 27:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A02;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 28:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A06;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A09;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 30:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A0A;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 31:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                enumC33370Ep3 = EnumC33370Ep3.A07;
                interfaceC16660sJ.invoke(enumC33370Ep3);
                return C0eB.A00;
            case 32:
            case 34:
                ((InterfaceC58121Ppk) this.A01).DAq();
                return C0eB.A00;
            case 33:
                ((InterfaceC58121Ppk) this.A01).DXG();
                return C0eB.A00;
            case 35:
                UserSession userSession2 = (UserSession) this.A01;
                ActivityFeedRepository A00 = C4DU.A00(userSession2, new C4DT(userSession2));
                if (C18U.A06(C06090Tz.A05, userSession2, 36324917834166877L)) {
                    ((C4DW) A00.A04).A00.evictAll();
                }
                A00.A03(true);
                return C0eB.A00;
            case 36:
                return new C50579MUm((UserSession) this.A01);
            case 37:
                UserSession userSession3 = (UserSession) this.A01;
                return new C50576MUh(C1DS.A00(userSession3), userSession3);
            case 38:
                A06 = C18U.A06(C06090Tz.A05, ((C50576MUh) this.A01).A02, 36330449752048503L);
                return Boolean.valueOf(A06);
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
                followRequestsRepository = ((N83) this.A01).A03;
                followRequestsRepository.A04(null);
                return C0eB.A00;
            case 40:
                N83 n83 = (N83) this.A01;
                return new CWX(n83.A02, n83);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C54432O3m((N81) this.A01);
            case 43:
                N82 n82 = (N82) this.A01;
                return new C54781OIv(n82, n82.A03);
            case 44:
                followRequestsRepository = ((N82) this.A01).A01;
                followRequestsRepository.A04(null);
                return C0eB.A00;
            case 45:
                C26777Bry c26777Bry = (C26777Bry) this.A01;
                return C62862tP.A02(c26777Bry, c26777Bry.A01, AbstractC166987dD.A0o(c26777Bry.A07), null);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C26777Bry c26777Bry2 = (C26777Bry) this.A01;
                return new O8I(c26777Bry2.A01, AbstractC166987dD.A0r(c26777Bry2.A07));
            case 47:
                ((N2B) ((C26777Bry) this.A01).A04.getValue()).A01.A05();
                return C0eB.A00;
            case 48:
                C26777Bry c26777Bry3 = (C26777Bry) this.A01;
                c26777Bry3.A03.getValue();
                N86.A00(C26777Bry.A00(c26777Bry3));
                return C0eB.A00;
            case 49:
                return new N2B(AbstractC166987dD.A0r(((C26777Bry) this.A01).A07));
        }
    }
}
