package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57544PgI extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57544PgI(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57544PgI(obj, i));
    }

    public static C57544PgI A01(Object obj, int i) {
        return new C57544PgI(obj, i);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        P4W p4w;
        switch (this.A00) {
            case 0:
                return new String[((InterfaceC19390xP[]) this.A01).length];
            case 1:
            case 4:
            case 7:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 25:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 33:
            case 37:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
            default:
                return this.A01;
            case 2:
            case 5:
            case 8:
            case 14:
            case 17:
            case 20:
            case 26:
            case 30:
            case 34:
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
            case 6:
            case 9:
            case Process.SIGTERM /* 15 */:
            case 18:
            case 21:
            case 27:
            case 31:
            case 35:
            case 39:
            case 43:
            case 47:
                return AbstractC167027dH.A0B(this.A01);
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 32:
            case 44:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                return new C50849Mdg(abstractC59962oe.requireArguments(), abstractC59962oe, abstractC59962oe);
            case 11:
                p4w = ((NP0) ((C52572NNs) this.A01).A04.getValue()).A04;
                break;
            case 22:
            case 24:
            case 36:
            case 40:
            case 48:
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                return new C50850Mdh(abstractC59962oe2.requireArguments(), abstractC59962oe2, abstractC59962oe2);
            case 23:
                p4w = MSW.A0g(((N6C) this.A01).A0G).A0C;
                break;
            case 28:
                AbstractC59962oe abstractC59962oe3 = (AbstractC59962oe) this.A01;
                return new C50848Mdf(abstractC59962oe3.requireArguments(), abstractC59962oe3, abstractC59962oe3);
        }
        return new C52283NBy(p4w, "organic_lead_gen_consumer");
    }
}
