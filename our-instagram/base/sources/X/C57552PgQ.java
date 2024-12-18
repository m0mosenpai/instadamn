package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57552PgQ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57552PgQ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57552PgQ(obj, i));
    }

    public static C57552PgQ A01(Object obj, int i) {
        return new C57552PgQ(obj, i);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession;
        String str;
        String str2;
        String str3;
        EnumC53251Ngp enumC53251Ngp;
        switch (this.A00) {
            case 0:
            case 4:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            case 20:
            case 23:
            case 28:
            case 31:
            case 37:
            case 40:
            case 45:
            case 48:
                return AbstractC25226BEj.A1C(this.A01);
            case 1:
            case 5:
            case 9:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 17:
            case 21:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 32:
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 2:
            case 6:
            case 14:
            case 26:
            case 35:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return new C50849Mdg(abstractC59962oe.requireArguments(), abstractC59962oe, abstractC59962oe);
            case 3:
            case 7:
            case 11:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
            case 22:
            case 27:
            case 30:
            case 36:
            case 39:
            case 44:
            case 47:
                return this.A01;
            case 10:
            case 18:
            case 34:
            case 43:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C50850Mdh(abstractC59962oe2.requireArguments(), abstractC59962oe2, abstractC59962oe2);
            case 25:
                N6D n6d = (N6D) this.A01;
                userSession = n6d.A02().A02;
                str = n6d.A02().A00;
                if (str == null) {
                    str = "";
                }
                LeadForm leadForm = n6d.A02().A03.A01;
                str2 = null;
                if (leadForm != null) {
                    str3 = leadForm.A03;
                } else {
                    str3 = null;
                }
                XIGIGBoostCallToAction xIGIGBoostCallToAction = n6d.A02().A03.A00;
                if (xIGIGBoostCallToAction != null) {
                    str2 = xIGIGBoostCallToAction.A00;
                }
                enumC53251Ngp = n6d.A02().A05;
                break;
            case 33:
                N67 n67 = (N67) this.A01;
                userSession = n67.A01().A06;
                str = n67.A01().A02;
                if (str == null) {
                    str = "";
                }
                LeadForm leadForm2 = n67.A01().A08.A01;
                str2 = null;
                if (leadForm2 != null) {
                    str3 = leadForm2.A03;
                } else {
                    str3 = null;
                }
                XIGIGBoostCallToAction xIGIGBoostCallToAction2 = n67.A01().A08.A00;
                if (xIGIGBoostCallToAction2 != null) {
                    str2 = xIGIGBoostCallToAction2.A00;
                }
                enumC53251Ngp = n67.A01().A0A;
                break;
        }
        return new NDU(userSession, enumC53251Ngp, str, str3, str2);
    }
}
