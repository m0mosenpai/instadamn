package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class D8A extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8A(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AbstractC12990ll abstractC12990ll;
        C06090Tz c06090Tz;
        long j;
        InterfaceC74953Yl interfaceC74953Yl;
        boolean z;
        switch (this.A00) {
            case 0:
                return AbstractC166997dE.A0S(((C27938CSx) this.A01).A00, R.id.superlative_post_image);
            case 1:
                return AbstractC166997dE.A0S(((C27938CSx) this.A01).A00, R.id.superlative_post_touch_interceptor_view);
            case 2:
                return new C142726cY((UserSession) this.A01);
            case 3:
                return C97S.A00(AbstractC166987dD.A0r(((C26788BsC) this.A01).A06));
            case 4:
                C26788BsC c26788BsC = (C26788BsC) this.A01;
                return C3EV.A00(c26788BsC.requireContext(), AbstractC166987dD.A0r(c26788BsC.A06));
            case 5:
                return new C3EZ(AbstractC166987dD.A0r(((C26788BsC) this.A01).A06));
            case 6:
            case 7:
                AbstractC25226BEj.A1P((Fragment) this.A01);
                return C0eB.A00;
            case 8:
            case 9:
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                z = false;
                AbstractC25227BEk.A1A(interfaceC74953Yl, z);
                return C0eB.A00;
            case 10:
            case 11:
            default:
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                z = true;
                AbstractC25227BEk.A1A(interfaceC74953Yl, z);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266322420L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326528447428540L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 14:
                return AbstractC25229BEm.A0m(C06090Tz.A05, (AbstractC12990ll) this.A01, 36608003424196265L);
            case Process.SIGTERM /* 15 */:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325321561158651L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 16:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326528446904249L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 17:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326816209844365L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 18:
                List A0m = AbstractC167007dF.A0m(C18U.A04(C06090Tz.A05, (AbstractC12990ll) this.A01, 36889478400705373L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0);
                ArrayList A0q = AbstractC167017dG.A0q(A0m);
                Iterator it = A0m.iterator();
                while (it.hasNext()) {
                    A0q.add(AbstractC25228BEl.A1A(AbstractC166987dD.A1B(it)));
                }
                return A0q;
            case Process.SIGSTOP /* 19 */:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326528447231930L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 20:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326528447363003L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 21:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326816210106512L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 22:
                if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342169537661253565L)) {
                    return EnumC09460dv.A04;
                }
                return EnumC09460dv.A03;
            case 23:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36327146922195264L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 24:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326816210172049L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 25:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326816210237586L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 26:
                return AbstractC25229BEm.A0m(C06090Tz.A05, (AbstractC12990ll) this.A01, 36608003424982699L);
            case 27:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36326816210303123L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 28:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36329212801466550L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36329212801532087L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 30:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36329560693817751L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 31:
                return Boolean.valueOf(AbstractC167007dF.A1O(AbstractC25225BEi.A07(C06090Tz.A05, (AbstractC12990ll) this.A01, 36604880988673187L)));
            case 32:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36314107402127839L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 33:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266650105L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 34:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36330299429307183L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 35:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266519031L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 36:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266584568L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 37:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266453494L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 38:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266387957L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 39:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266125809L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case 40:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266191346L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case Seq.NULL_REFNUM /* 41 */:
                abstractC12990ll = (AbstractC12990ll) this.A01;
                c06090Tz = C06090Tz.A05;
                j = 36325317266256883L;
                return AbstractC166997dE.A0c(c06090Tz, abstractC12990ll, j);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C49052My((UserSession) this.A01);
            case 43:
                C27966CUm c27966CUm = (C27966CUm) this.A01;
                return AbstractC12220kQ.A01(c27966CUm.A00, c27966CUm.A01);
            case 44:
                C26850BtC c26850BtC = (C26850BtC) this.A01;
                return new OIc(AbstractC60952qJ.A01(AbstractC25225BEi.A15(c26850BtC.A03), false, true), AbstractC166987dD.A0r(c26850BtC.A05), AbstractC25225BEi.A15(c26850BtC.A04));
            case 45:
                BJ5 bj5 = (BJ5) this.A01;
                return new C27966CUm(bj5.A01, bj5.A00, "");
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C27966CUm(AbstractC60952qJ.A01(AbstractC111324zv.A00(1199), false, true), ((BF5) this.A01).A00, "");
            case 47:
                AbstractC167017dG.A0y((Activity) this.A01, C3DN.A00);
                return C0eB.A00;
            case 48:
                C25841Bbw c25841Bbw = (C25841Bbw) this.A01;
                return new C27966CUm(c25841Bbw.A02, c25841Bbw.A00, c25841Bbw.A03);
            case 49:
                C25841Bbw c25841Bbw2 = (C25841Bbw) this.A01;
                return new OIc(c25841Bbw2.A02, c25841Bbw2.A00, c25841Bbw2.A03);
        }
    }
}
