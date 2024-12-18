package X;

import android.os.Bundle;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.MDn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50160MDn extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50160MDn(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return new C47406Kwv((UserSession) this.A01);
            case 1:
                ((C189478aR) this.A01).A07();
                break;
            case 2:
                return new C47584Kzu((UserSession) this.A01);
            case 3:
                C64451TEn c64451TEn = new C64451TEn();
                C25O.A00((UserSession) this.A01).A00(c64451TEn);
                return c64451TEn;
            case 4:
                return new C36280FzX((UserSession) this.A01);
            case 5:
                C31641Dv7 c31641Dv7 = (C31641Dv7) this.A01;
                C14360o3.A0B(c31641Dv7, 1);
                return new XO5(c31641Dv7);
            case 6:
                return new FGO((UserSession) this.A01);
            case 7:
            case 11:
            case 17:
                return this.A01;
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 18:
                return AbstractC25226BEj.A1C(this.A01);
            case 9:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGSTOP /* 19 */:
                return AbstractC167027dH.A0B(this.A01);
            case 10:
                EI7 ei7 = (EI7) this.A01;
                return new KG2(ei7.requireActivity(), AbstractC166987dD.A0r(ei7.A00));
            case 14:
                EJ7 ej7 = (EJ7) this.A01;
                Bundle bundle = ej7.mArguments;
                if (bundle != null) {
                    if (bundle.containsKey("messaging_user_fbid")) {
                        long j = bundle.getLong("messaging_user_fbid");
                        return new KGQ(AbstractC166987dD.A0r(ej7.A00), AbstractC153636vY.A01(bundle, AbstractC50531MSk.A02(0, 9, 46)), j);
                    }
                    String A01 = AbstractC153636vY.A01(bundle, "device");
                    long j2 = bundle.getLong("create_time_stamp");
                    return new C27042BwM(AbstractC166987dD.A0r(ej7.A00), A01, AbstractC153636vY.A01(bundle, "location"), j2);
                }
                throw AbstractC166987dD.A14("Arguments must not be null in KeyAlertDetailFragment");
            case Process.SIGTERM /* 15 */:
                ((MR5) this.A01).DtP();
                break;
            case 16:
                ((MR5) this.A01).DI5();
                break;
            case 20:
                return new C45573KFn(AbstractC166987dD.A0r(((EJ3) this.A01).A00));
            case 21:
                return new C47408Kwx((UserSession) this.A01);
            case 22:
                UserSession userSession = (UserSession) this.A01;
                return new C49295Lqp(userSession, AbstractC44138Jf3.A00(userSession));
            case 23:
                return new Ld6((UserSession) this.A01);
            case 24:
                return new C44139Jf4((UserSession) this.A01);
            case 25:
                return C7X2.A00(((C44139Jf4) this.A01).A01);
            case 26:
                return new C47752L6w((UserSession) this.A01);
            case 27:
                UserSession userSession2 = (UserSession) this.A01;
                return new JX0(userSession2, new M8T(userSession2, 10), new M8T(userSession2, 11));
            case 28:
                return ((JX0) this.A01).A00.get();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((JX0) this.A01).A01.get();
            case 30:
                final C40121td c40121td = (C40121td) this.A01;
                return new C7Ef(c40121td) { // from class: X.7Ee
                    public final C40121td A00;

                    @Override // X.C7Ef
                    public final void AGg(AbstractC46459KhJ abstractC46459KhJ) {
                        if (abstractC46459KhJ instanceof KWj) {
                            this.A00.A0K(((KWj) abstractC46459KhJ).A00.A35, null, false, true, true);
                        }
                    }

                    @Override // X.C7Ef
                    public final void FDE(AbstractC46459KhJ abstractC46459KhJ, DirectThreadKey directThreadKey) {
                        if (abstractC46459KhJ instanceof KWj) {
                            C47Z c47z = ((KWj) abstractC46459KhJ).A00;
                            C55h c55h = c47z.A1R;
                            if (c55h != null) {
                                c55h.A00 = true;
                            }
                            c47z.A5h = true;
                            C40121td c40121td2 = this.A00;
                            c40121td2.A0C(c47z);
                            c40121td2.A0G(c47z, true, true);
                        }
                    }

                    {
                        this.A00 = c40121td;
                    }
                };
            case 31:
                UserSession userSession3 = (UserSession) this.A01;
                return new C49296Lqq(userSession3, C6JW.A00(userSession3, "MsysSendShareManager"), new C47764L7k(userSession3));
            case 32:
                return new C47779L8e(((C30691dY) this.A01).A00);
            case 33:
            case 36:
            case 38:
            case 40:
                return C25A.A00((UserSession) this.A01);
            case 34:
            case 37:
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
            default:
                return AnonymousClass257.A00((UserSession) this.A01);
            case 35:
                UserSession userSession4 = (UserSession) this.A01;
                return new C47587Kzx(userSession4, AbstractC46925Kp6.A00(userSession4));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return F2C.A00(((C34011j1) this.A01).A00);
            case 43:
                return C7FP.A00(AbstractC31171DnF.A0D("mutation_processor"), ((C34011j1) this.A01).A00);
            case 44:
                return new C47411Kx0(((C33711iX) this.A01).A00);
            case 45:
                return new C47412Kx1(((C33671iT) this.A01).A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 36322353740785843L);
            case 47:
                return AbstractC28761aE.A00((UserSession) this.A01);
            case 48:
                C28811aJ A00 = C28811aJ.A00((UserSession) this.A01);
                C14360o3.A07(A00);
                return A00;
            case 49:
                C120005by A002 = C120005by.A00((UserSession) this.A01);
                C14360o3.A07(A002);
                return A002;
        }
        return C0eB.A00;
    }
}
