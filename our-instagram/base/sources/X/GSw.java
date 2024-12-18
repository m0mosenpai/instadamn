package X;

import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes6.dex */
public final class GSw extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSw(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C25671My A00;
        InterfaceC41141vN c154976xm;
        View view;
        switch (this.A00) {
            case 4:
                String string = AbstractC31179DnN.A04(this.A01).getString("arg_media_id");
                if (string != null) {
                    return string;
                }
                throw AbstractC166997dE.A0g();
            case 5:
            case 31:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 49:
                return this.A01;
            case 6:
            case 43:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 44:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                N4P n4p = (N4P) this.A01;
                return new C28890Coy(AbstractC166987dD.A0r(n4p.A02), AbstractC25225BEi.A15(n4p.A01), AbstractC166997dE.A0p(n4p.requireActivity(), 2131969888));
            case 9:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 10:
                C56494P6k c56494P6k = (C56494P6k) this.A01;
                return C0ST.A01(new C31199Dni(24, c56494P6k.A00.Aaz(), c56494P6k));
            case 11:
                return new A66(C1AT.A01((UserSession) this.A01));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new FHB((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new AnonymousClass487((UserSession) this.A01);
            case 14:
                return new MZJ((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return C1AT.A01((UserSession) this.A01).A04(C1AV.A2q, MZJ.class);
            case 16:
                return C0ST.A01(new MZP(((InterfaceC100484fC) ((MZJ) this.A01).A03.getValue()).Aaz(), 8));
            case 17:
                return C1AT.A01((UserSession) this.A01).A02(C1AV.A2q, MZJ.class);
            case 18:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 36325759647954247L);
            case Process.SIGSTOP /* 19 */:
                return new C3KV((AbstractC12990ll) this.A01);
            case 20:
                return new C70683Wf4((UserSession) this.A01);
            case 21:
                return new C12B(((AbstractC12280kW) this.A01).context);
            case 22:
                UserSession userSession = ((C31822Dyg) this.A01).A00;
                C14360o3.A0B(userSession, 0);
                return userSession.A01(NSM.class, new C50157MDk(userSession, 20));
            case 23:
                return new FHC((UserSession) this.A01);
            case 24:
                return new C154706xL((UserSession) this.A01);
            case 25:
                return new FRl((UserSession) this.A01);
            case 26:
                UserDetailFragment userDetailFragment = (UserDetailFragment) this.A01;
                userDetailFragment.A0o();
                AnonymousClass708 anonymousClass708 = userDetailFragment.A0x;
                if (anonymousClass708 != null) {
                    anonymousClass708.BiC().DSz(AbstractC43591JPw.A00(616), false);
                }
                return C0eB.A00;
            case 27:
                ((C72q) this.A01).A04();
                return C0eB.A00;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
                return ((EditProfileFieldsController) this.A01).A02;
            case 32:
                UserSession userSession2 = (UserSession) this.A01;
                AbstractC25651Mw.A00(userSession2).E4s(new C154976xm(EnumC125765mR.A04, userSession2.userId));
                FA7.A00(userSession2).A01(EnumC33422Ept.A0A, null);
                return C0eB.A00;
            case 33:
                FA7.A00((UserSession) this.A01).A04(EnumC33422Ept.A0A, "");
                return C0eB.A00;
            case 34:
                UserSession userSession3 = (UserSession) this.A01;
                A00 = AbstractC25651Mw.A00(userSession3);
                c154976xm = new C154976xm(EnumC125765mR.A04, userSession3.userId);
                break;
            case 35:
            case 36:
                UserSession userSession4 = (UserSession) this.A01;
                A00 = AbstractC25651Mw.A00(userSession4);
                c154976xm = new C154096wJ(userSession4.userId, true, false);
                break;
            case 37:
                C151696sF c151696sF = (C151696sF) this.A01;
                InterfaceC56392iX interfaceC56392iX = c151696sF.A0A;
                if (interfaceC56392iX != null) {
                    view = interfaceC56392iX.getView();
                } else {
                    view = null;
                }
                c151696sF.A05(view, true);
                return C0eB.A00;
            case 38:
                return AbstractC31174DnI.A0n(AbstractC31179DnN.A04(this.A01), "ARGUMENT_NAVIGATING_FROM_FORCED_MIGRATION_BOTTOM_SHEET");
            case 39:
                UserSession userSession5 = ((MV1) this.A01).A00;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession5, 36316370849632560L)) {
                    return AnonymousClass701.A04;
                }
                if (C18U.A06(c06090Tz, userSession5, 36316370849501486L)) {
                    return AnonymousClass701.A03;
                }
                if (C18U.A06(c06090Tz, userSession5, 36316370849370412L)) {
                    return AnonymousClass701.A02;
                }
                return AnonymousClass701.A05;
            case 40:
                return new FHE(((C31814DyY) this.A01).A01);
            case Seq.NULL_REFNUM /* 41 */:
                return new C31814DyY(AbstractC166987dD.A0r(((EIO) this.A01).A03));
            case 45:
                C53Z c53z = (C53Z) this.A01;
                ImmutableList immutableList = C32363ENk.A02;
                return new EWC(c53z.getSession(), AbstractC153636vY.A01(c53z.requireArguments(), "ContactOptionsFragment.USER_ID"));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new EVv(AbstractC166987dD.A0r(((C32279EJq) this.A01).A0C));
            case 47:
            case 48:
                C32279EJq.A02((C32279EJq) this.A01);
                return C0eB.A00;
        }
        A00.E4s(c154976xm);
        return C0eB.A00;
    }
}
