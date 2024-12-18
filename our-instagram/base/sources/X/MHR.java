package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressLinkMessageSender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressStorySender;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MHR extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHR(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new MHR(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342164439534413233L);
            case 1:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 36321430320850355L);
            case 2:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 36320283565826329L);
            case 3:
                return Boolean.valueOf(C6X6.A03((UserSession) this.A01));
            case 4:
                return AbstractC166997dE.A0i(C06090Tz.A05, (AbstractC12990ll) this.A01, 36601758542598504L);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case 10:
                C49235Lpq c49235Lpq = (C49235Lpq) this.A01;
                return AbstractC31174DnI.A0g(C1AT.A01(c49235Lpq.A00), C1AV.A3X, c49235Lpq);
            case 11:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C49235Lpq) this.A01).A00, 36321430321309113L);
            case Process.SIGTERM /* 15 */:
                return AbstractC28761aE.A00(((C35721ls) this.A01).A00);
            case 16:
                return AbstractC28761aE.A00(((C35791lz) this.A01).A00);
            case 17:
                return new C47410Kwz(((C34431jh) this.A01).A00);
            case 18:
                return new ArmadilloExpressLinkMessageSender(((C34431jh) this.A01).A00);
            case Process.SIGSTOP /* 19 */:
                return new C47413Kx2(((C34431jh) this.A01).A00);
            case 20:
                return new Kx4(((C34431jh) this.A01).A00);
            case 21:
                return new C47415Kx6(((C34431jh) this.A01).A00);
            case 22:
                return new C47416Kx7(((C34431jh) this.A01).A00);
            case 23:
                return new ArmadilloExpressStorySender(((C34431jh) this.A01).A00);
            case 24:
                return new LE3(((C35201kz) this.A01).A00);
            case 25:
                return new ArmadilloExpressNoteReplySender(((C33831ij) this.A01).A00);
            case 26:
                return new ArmadilloExpressNoteReplySender(((C33791if) this.A01).A00);
            case 27:
                return new ArmadilloExpressNoteReplySender(((C33871in) this.A01).A00);
            case 28:
                return new ArmadilloExpressNoteReplySender(((C33751ib) this.A01).A00);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new Kx5(((C33631iP) this.A01).A00);
            case 30:
                return C25A.A00((UserSession) this.A01);
            case 31:
                return AnonymousClass257.A00((UserSession) this.A01);
            case 32:
                UserSession userSession = (UserSession) this.A01;
                return new C47586Kzw(userSession, AbstractC46925Kp6.A00(userSession));
            case 33:
                UserSession userSession2 = (UserSession) this.A01;
                return new C47744L6l(C20Y.A00(userSession2), userSession2);
            case 34:
                return new ArmadilloExpressLinkMessageSender(((C34251jP) this.A01).A00);
            case 35:
                return new C47414Kx3(((C1d2) this.A01).A00);
            case 36:
                return AbstractC34063F1q.A00(((C33921is) this.A01).A00);
            case 37:
                return AbstractC34062F1p.A00(((C33921is) this.A01).A00);
            case 38:
                return C7FP.A00(AbstractC31171DnF.A0D("mutation_processor"), ((C33921is) this.A01).A00);
            case 39:
                return AbstractC28761aE.A00(((C33551iH) this.A01).A00);
            case 40:
                ((InterfaceC37261GbE) this.A01).DUq(null, null);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                return C006802i.A0p;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                String str = ((C30011cH) this.A01).A04;
                C14360o3.A07(str);
                return str;
            case 43:
                return new C47977LIp((UserSession) this.A01);
            case 44:
                return new C47810L9s((UserSession) this.A01);
            case 45:
                return new LAC((UserSession) this.A01);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C28455Ch5(((LAC) this.A01).A00);
            case 47:
                return new LAA((UserSession) this.A01);
            case 48:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A01;
                return new C44322JiE(AbstractC25651Mw.A00(abstractC12990ll), new M8T(abstractC12990ll, 15));
            case 49:
                return new C34548FKi((UserSession) this.A01);
        }
    }
}
