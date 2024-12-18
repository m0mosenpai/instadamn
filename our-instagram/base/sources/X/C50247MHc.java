package X;

import android.os.Bundle;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.MHc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50247MHc extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50247MHc(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C50247MHc(obj, i));
    }

    public static C50247MHc A01(Object obj, int i) {
        return new C50247MHc(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Bundle A04;
        String str;
        Integer num;
        UserSession userSession;
        KP1 kp1;
        InterfaceC09390do interfaceC09390do;
        InterfaceC09390do interfaceC09390do2;
        EnumC46208Kck enumC46208Kck;
        InterfaceC09390do interfaceC09390do3;
        KPU A00;
        String str2;
        C45793KOy c45793KOy;
        C45793KOy c45793KOy2;
        C45793KOy c45793KOy3;
        switch (this.A00) {
            case 0:
            case 9:
            case 16:
            case 24:
            case 36:
                return this.A01;
            case 1:
            case 10:
            case 17:
            case 25:
            case 37:
                return AbstractC25226BEj.A1C(this.A01);
            case 2:
            case 11:
            case 18:
            case 26:
            case 38:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 3:
                return ((KP1) this.A01).A01.invoke();
            case 4:
                KCM kcm = (KCM) this.A01;
                return new C45585KFz(AbstractC166987dD.A0r(kcm.A00), LLQ.A02(kcm));
            case 5:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "BUNDLE_HAS_IMPLICIT_BACKUP";
                return Boolean.valueOf(A04.getBoolean(str, false));
            case 6:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "BUNDLE_IS_HARDBLOCK_RELEASE";
                return Boolean.valueOf(A04.getBoolean(str, false));
            case 7:
                KP1 kp12 = (KP1) this.A01;
                C44477Jlj c44477Jlj = (C44477Jlj) kp12.A03.getValue();
                num = C05F.A15;
                userSession = c44477Jlj.A00;
                kp1 = kp12;
                AbstractC46742Klz.A00(userSession, num).A05(num);
                kp1.A0E();
                return C0eB.A00;
            case 8:
            case 14:
            case 31:
                return AbstractC166997dE.A0S(JQ0.A0F(this.A01), R.id.cell_container);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((KP0) this.A01).A02.invoke();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                KP0 kp0 = (KP0) this.A01;
                C44472Jle c44472Jle = (C44472Jle) kp0.A04.getValue();
                num = C05F.A15;
                userSession = c44472Jle.A00;
                kp1 = kp0;
                AbstractC46742Klz.A00(userSession, num).A05(num);
                kp1.A0E();
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return new KFf(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case Process.SIGSTOP /* 19 */:
            case 30:
                return C6CE.A00(AbstractC166987dD.A0r(((KCM) this.A01).A00));
            case 20:
                interfaceC09390do = ((C45793KOy) this.A01).A05;
                A00 = C44462JlU.A00(interfaceC09390do);
                str2 = "RESTORE_TRY_ANOTHER_WAY_IMPRESSION";
                A00.A05(str2);
                return C0eB.A00;
            case 21:
                interfaceC09390do2 = ((C45793KOy) this.A01).A05;
                A00 = C44462JlU.A00(interfaceC09390do2);
                str2 = "RESTORE_TRY_ANOTHER_WAY_CANCEL_TAP";
                A00.A05(str2);
                return C0eB.A00;
            case 22:
                C45793KOy c45793KOy4 = (C45793KOy) this.A01;
                C44462JlU.A00(c45793KOy4.A05).A05("RESTORE_TRY_ANOTHER_WAY_OTC_TAP");
                boolean A1b = AbstractC43594JPz.A1b(c45793KOy4.A04);
                c45793KOy = c45793KOy4;
                if (A1b) {
                    enumC46208Kck = EnumC46208Kck.A0L;
                    c45793KOy2 = c45793KOy4;
                    AbstractC43592JPx.A1K(c45793KOy2, enumC46208Kck, AbstractC43593JPy.A0U(c45793KOy2));
                    return C0eB.A00;
                }
                enumC46208Kck = EnumC46208Kck.A0K;
                c45793KOy2 = c45793KOy;
                AbstractC43592JPx.A1K(c45793KOy2, enumC46208Kck, AbstractC43593JPy.A0U(c45793KOy2));
                return C0eB.A00;
            case 23:
                C45793KOy c45793KOy5 = (C45793KOy) this.A01;
                interfaceC09390do3 = c45793KOy5.A05;
                c45793KOy3 = c45793KOy5;
                C44462JlU.A00(interfaceC09390do3).A05("RESTORE_TRY_ANOTHER_WAY_PIN_TAP");
                AbstractC43592JPx.A1K(c45793KOy3, EnumC46208Kck.A0N, AbstractC43593JPy.A0U(c45793KOy3));
                return C0eB.A00;
            case 27:
                return ((C45793KOy) this.A01).A01.invoke();
            case 28:
            case 40:
                KCM kcm2 = (KCM) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(kcm2.A00);
                return new C45591KGf(AbstractC25231BEo.A0L(kcm2), A0r, AbstractC47844LBm.A01(kcm2), LLQ.A02(kcm2));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case Seq.NULL_REFNUM /* 41 */:
                A04 = AbstractC31179DnN.A04(this.A01);
                str = "BUNDLE_WAS_TABLE_DROPPED";
                return Boolean.valueOf(A04.getBoolean(str, false));
            case 32:
                interfaceC09390do = ((C45794KOz) this.A01).A06;
                A00 = C44462JlU.A00(interfaceC09390do);
                str2 = "RESTORE_TRY_ANOTHER_WAY_IMPRESSION";
                A00.A05(str2);
                return C0eB.A00;
            case 33:
                interfaceC09390do2 = ((C45794KOz) this.A01).A06;
                A00 = C44462JlU.A00(interfaceC09390do2);
                str2 = "RESTORE_TRY_ANOTHER_WAY_CANCEL_TAP";
                A00.A05(str2);
                return C0eB.A00;
            case 34:
                C45794KOz c45794KOz = (C45794KOz) this.A01;
                C44462JlU.A00(c45794KOz.A06).A05("RESTORE_TRY_ANOTHER_WAY_OTC_TAP");
                boolean A1b2 = AbstractC43594JPz.A1b(c45794KOz.A05);
                c45793KOy = c45794KOz;
                if (A1b2) {
                    enumC46208Kck = EnumC46208Kck.A0M;
                    c45793KOy2 = c45794KOz;
                    AbstractC43592JPx.A1K(c45793KOy2, enumC46208Kck, AbstractC43593JPy.A0U(c45793KOy2));
                    return C0eB.A00;
                }
                enumC46208Kck = EnumC46208Kck.A0K;
                c45793KOy2 = c45793KOy;
                AbstractC43592JPx.A1K(c45793KOy2, enumC46208Kck, AbstractC43593JPy.A0U(c45793KOy2));
                return C0eB.A00;
            case 35:
                C45794KOz c45794KOz2 = (C45794KOz) this.A01;
                interfaceC09390do3 = c45794KOz2.A06;
                c45793KOy3 = c45794KOz2;
                C44462JlU.A00(interfaceC09390do3).A05("RESTORE_TRY_ANOTHER_WAY_PIN_TAP");
                AbstractC43592JPx.A1K(c45793KOy3, EnumC46208Kck.A0N, AbstractC43593JPy.A0U(c45793KOy3));
                return C0eB.A00;
            case 39:
                return ((C45794KOz) this.A01).A01.invoke();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC124995l5.A00(AbstractC47843LBl.A00((UserSession) this.A01, "EncryptedBackupsGDriveRestoreViewModel"));
            case 43:
                return AbstractC46739Klw.A00((UserSession) this.A01);
            case 44:
                return AbstractC47843LBl.A00((UserSession) this.A01, "EncryptedBackupsGDriveSetupViewModel");
            case 45:
                return C6CE.A00(((C43909JbK) this.A01).A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return C3LB.A00(((C43909JbK) this.A01).A00);
            case 47:
                UserSession userSession2 = (UserSession) this.A01;
                C006802i c006802i = C006802i.A0p;
                InterfaceC02900Bo A0m = AbstractC43592JPx.A0m(userSession2, c006802i);
                C6CF A002 = C6CE.A00(userSession2);
                AbstractC167017dG.A1R(A0m, A002);
                return new AbstractC2056898s(c006802i, A002, A0m);
            case 48:
                UserSession userSession3 = (UserSession) this.A01;
                C006802i c006802i2 = C006802i.A0p;
                InterfaceC02900Bo A0m2 = AbstractC43592JPx.A0m(userSession3, c006802i2);
                C6CF A003 = C6CE.A00(userSession3);
                AbstractC167017dG.A1R(A0m2, A003);
                return new AbstractC2056898s(c006802i2, A003, A0m2);
            case 49:
                UserSession userSession4 = (UserSession) this.A01;
                C006802i c006802i3 = C006802i.A0p;
                InterfaceC02900Bo A0m3 = AbstractC43592JPx.A0m(userSession4, c006802i3);
                C6CF A004 = C6CE.A00(userSession4);
                AbstractC167017dG.A1R(A0m3, A004);
                return new AbstractC2056898s(c006802i3, A004, A0m3);
        }
    }
}
