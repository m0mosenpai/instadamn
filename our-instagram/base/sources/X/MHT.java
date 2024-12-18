package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MHT extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHT(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new MHT(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        View A0F;
        int i;
        EnumC46208Kck enumC46208Kck;
        switch (this.A00) {
            case 0:
                return new C45566KFg(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case 1:
            case 17:
            case 24:
            case 30:
                return this.A01;
            case 2:
            case 18:
            case 25:
            case 31:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case Process.SIGSTOP /* 19 */:
            case 26:
            case 32:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 4:
                return new C45567KFh(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case 5:
            case 28:
                return C56352iT.A0t.A03(((Fragment) this.A01).getActivity());
            case 6:
                A0F = JQ0.A0F(this.A01);
                i = R.id.body_text;
                return AbstractC166997dE.A0S(A0F, i);
            case 7:
                A0F = JQ0.A0F(this.A01);
                i = R.id.bottom_action;
                return AbstractC166997dE.A0S(A0F, i);
            case 8:
                A0F = JQ0.A0F(this.A01);
                i = R.id.action_container;
                return AbstractC166997dE.A0S(A0F, i);
            case 9:
                A0F = JQ0.A0F(this.A01);
                i = R.id.confirmation_code_edit_text;
                return AbstractC166997dE.A0S(A0F, i);
            case 10:
                A0F = JQ0.A0F(this.A01);
                i = R.id.cta_loading_spinner;
                return AbstractC166997dE.A0S(A0F, i);
            case 11:
                return C6CE.A00(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0F = JQ0.A0F(this.A01);
                i = R.id.error_text;
                return AbstractC166997dE.A0S(A0F, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((KCM) this.A01).onBackPressed();
                return C0eB.A00;
            case 14:
                C45815KPu c45815KPu = (C45815KPu) this.A01;
                if (AbstractC43594JPz.A1b(c45815KPu.A0D)) {
                    enumC46208Kck = EnumC46208Kck.A0M;
                } else {
                    enumC46208Kck = EnumC46208Kck.A0J;
                }
                AbstractC43592JPx.A1K(c45815KPu, enumC46208Kck, AbstractC43593JPy.A0U(c45815KPu));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                A0F = JQ0.A0F(this.A01);
                i = R.id.headline;
                return AbstractC166997dE.A0S(A0F, i);
            case 16:
            case 23:
            case 35:
                A0F = JQ0.A0F(this.A01);
                i = R.id.cell_container;
                return AbstractC166997dE.A0S(A0F, i);
            case 20:
                return ((C45815KPu) this.A01).A01.invoke();
            case 21:
                KCM kcm = (KCM) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(kcm.A00);
                Integer A02 = LLQ.A02(kcm);
                return new C45594KGi(AbstractC25231BEo.A0L(kcm), C12L.A00, A0r, new C49490Lu3(kcm, 4), A02);
            case 22:
                return Boolean.valueOf(AbstractC31179DnN.A04(this.A01).getBoolean("BUNDLE_WAS_TABLE_DROPPED", false));
            case 27:
                return new C45568KFi(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return C3I7.A01(this.A01, false, true);
            case 33:
                return ((C45817KPw) this.A01).A04.invoke();
            case 34:
                KCM kcm2 = (KCM) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(kcm2.A00);
                return new C45602KGq(AbstractC25231BEo.A0L(kcm2), A0r2, new C49490Lu3(kcm2, 5), LLQ.A02(kcm2));
            case 36:
                return C6CE.A00(((C44501Jm7) this.A01).A01);
            case 37:
                return new JZL(this.A01, 1);
            case 38:
                return C6CE.A00(((C44460JlS) this.A01).A05);
            case 39:
                return AbstractC47843LBl.A00((UserSession) this.A01, "EncryptedBackupsPinSetupViewModel");
            case 40:
                UserSession userSession = ((C48519LdH) this.A01).A08;
                return userSession.A01(KPT.class, new MHK(userSession, 0));
            case Seq.NULL_REFNUM /* 41 */:
                return AbstractC46737Klu.A00(((C48519LdH) this.A01).A08);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                UserSession userSession2 = ((C48519LdH) this.A01).A08;
                C006802i c006802i = C006802i.A0p;
                return new KPP(c006802i, C6CE.A00(userSession2), AbstractC43592JPx.A0m(userSession2, c006802i));
            case 43:
                return C6CE.A00(((C48519LdH) this.A01).A08);
            case 44:
                C48519LdH c48519LdH = (C48519LdH) this.A01;
                if (c48519LdH.A04) {
                    C6CD c6cd = C6CC.A03;
                    UserSession userSession3 = c48519LdH.A08;
                    String A022 = c6cd.A02(userSession3);
                    C45319K3w A00 = C6CD.A00(userSession3);
                    if (A00 == null || AbstractC43592JPx.A02(A00) <= 0 || String.valueOf(A00.mResultSet.getLong(0, 1)) == null) {
                        InterfaceC09390do interfaceC09390do = c48519LdH.A0A;
                        if (AbstractC43592JPx.A0b(interfaceC09390do).A0A()) {
                            AbstractC43592JPx.A0b(interfaceC09390do).A05("MISSING_EB_BACKUP_ID");
                        }
                    }
                    if (A022 == null) {
                        C0K8.A0E("EncryptedBackupsStatusRepository", "Eb device id is null after onboarding, unable to trigger snapshot");
                        InterfaceC09390do interfaceC09390do2 = c48519LdH.A0A;
                        if (AbstractC43592JPx.A0b(interfaceC09390do2).A0A()) {
                            AbstractC43592JPx.A0b(interfaceC09390do2).A05("MISSING_EB_DEVICE_ID");
                            AbstractC43592JPx.A0b(interfaceC09390do2).A04(C05F.A01);
                        }
                    } else {
                        c48519LdH.A04 = false;
                        AbstractC25651Mw.A00(userSession3).E4s(new Object());
                    }
                }
                return C0eB.A00;
            case 45:
                return AbstractC46736Klt.A00(((C48519LdH) this.A01).A08);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return C3LB.A00(((C48519LdH) this.A01).A08);
            case 47:
                UserSession userSession4 = ((C48519LdH) this.A01).A08;
                return userSession4.A01(KPG.class, C50247MHc.A01(userSession4, 49));
            case 48:
                UserSession userSession5 = ((C48519LdH) this.A01).A08;
                return userSession5.A01(Ld4.class, C50255MHk.A02(userSession5, 44));
            case 49:
                return ((C46054Ka9) this.A01).A00.invoke();
        }
    }
}
