package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.MDo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50161MDo extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50161MDo(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C50930Mez c50930Mez;
        EnumC46178KcG enumC46178KcG;
        String string;
        switch (this.A00) {
            case 0:
                NK2 nk2 = (NK2) this.A01;
                return AbstractC153926w1.A01(nk2.A00, nk2.A01, nk2.A04().A0N);
            case 1:
                return AbstractC153926w1.A00(((TrialUseCase) this.A01).A00);
            case 2:
                return new C56146OwA((UserSession) this.A01);
            case 3:
            case 8:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A02;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case 4:
            case 9:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A06;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case 5:
            case 10:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A05;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case 6:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A04;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A03;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case 14:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A08;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                c50930Mez = (C50930Mez) this.A01;
                enumC46178KcG = EnumC46178KcG.A07;
                c50930Mez.A03.F8s(enumC46178KcG);
                return C0eB.A00;
            case 16:
                ((C14510oO) this.A01).A00 = true;
                return C0eB.A00;
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 25:
                return AbstractC25235BEs.A0U(this.A01);
            case 18:
                KCP kcp = (KCP) this.A01;
                return new C45583KFx(AbstractC166987dD.A0r(kcp.A0O), kcp.A0J);
            case 20:
            case 30:
            case 37:
            case 44:
            case 48:
                return this.A01;
            case 21:
            case 31:
            case 38:
            case 45:
            default:
                return AbstractC25226BEj.A1C(this.A01);
            case 22:
            case 32:
            case 39:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC167027dH.A0B(this.A01);
            case 23:
            case 26:
                KB4 kb4 = (KB4) this.A01;
                return new C45583KFx(kb4.A0A(), AbstractC43841Ja4.A04(kb4.requireContext()));
            case 24:
                KB4 kb42 = (KB4) this.A01;
                return new C45584KFy(kb42.A0A(), AbstractC43841Ja4.A04(kb42.requireContext()));
            case 27:
                new Thread((RunnableC208819Lp) this.A01).start();
                return C0eB.A00;
            case 28:
                return new C26990BvV(AbstractC166987dD.A0r(((C26753Bra) this.A01).A02));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 35:
            case Seq.NULL_REFNUM /* 41 */:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    return bundle.getString("entrypoint");
                }
                return null;
            case 33:
                C26748BrV c26748BrV = (C26748BrV) this.A01;
                return new C27040BwK(c26748BrV, AbstractC166987dD.A0r(c26748BrV.A04), AbstractC25225BEi.A15(c26748BrV.A01), AbstractC25225BEi.A15(c26748BrV.A02));
            case 34:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null && (string = bundle2.getString(MSV.A00(374))) != null) {
                    return string;
                }
                throw AbstractC166997dE.A0g();
            case 36:
                Bundle bundle3 = ((Fragment) this.A01).mArguments;
                if (bundle3 != null) {
                    return bundle3.getString("media_id");
                }
                return null;
            case 40:
                C26756Brd c26756Brd = (C26756Brd) this.A01;
                return new C27009Bvo(AbstractC166987dD.A0r(c26756Brd.A04), AbstractC25225BEi.A15(c26756Brd.A02));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return AbstractC43593JPy.A0n(AbstractC25226BEj.A1B(this.A01), C27144ByC.A00);
            case 43:
                ((C26756Brd) this.A01).A04.getValue();
                return C006802i.A0p;
            case 47:
                C26862BtO c26862BtO = (C26862BtO) this.A01;
                return new C27010Bvp(c26862BtO, AbstractC166987dD.A0r(c26862BtO.A0A));
        }
    }
}
