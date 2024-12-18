package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ImmutablePandoXDTLazyFloatingContextItem;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ImmutablePandoCreativeConfig;
import com.instagram.model.shopping.clips.ImmutablePandoIGTVShoppingInfo;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.JEa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43359JEa extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public static C1DY A00(Object obj, C43359JEa c43359JEa) {
        C14360o3.A0B(obj, 0);
        return new C1DY(((C42553IsX) c43359JEa.A01).A06, 6, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43359JEa(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                H7L h7l = (H7L) obj;
                C14360o3.A0B(h7l, 0);
                IGT igt = (IGT) this.A01;
                AbstractC55224Oeq.A02(igt.A00, igt.A02, h7l.A03, h7l.A06, h7l.A08);
                break;
            case 1:
                H7L h7l2 = (H7L) obj;
                C14360o3.A0B(h7l2, 0);
                IGT igt2 = (IGT) this.A01;
                UserSession userSession = igt2.A02;
                FragmentActivity fragmentActivity = igt2.A01;
                String str = h7l2.A03;
                String str2 = h7l2.A06;
                String str3 = h7l2.A08;
                AbstractC55224Oeq.A0A(fragmentActivity, userSession, str, "FEED_POST", str2, str3, true);
                AbstractC55224Oeq.A03(igt2.A00, userSession, str, "FEED_POST", str2, str3);
                break;
            case 2:
                ((C3DN) this.A01).A0Q(null);
                break;
            case 3:
                C26082BgB c26082BgB = (C26082BgB) obj;
                C14360o3.A0B(c26082BgB, 0);
                C9IC c9ic = (C9IC) this.A01;
                WeakReference weakReference = (WeakReference) c26082BgB.A00;
                c9ic.A00((EnumC85043qs) c26082BgB.A03, (C38321qM) c26082BgB.A02, weakReference, JCO.A00);
                break;
            case 4:
                int A0H = AbstractC166987dD.A0H(obj);
                C30E c30e = (C30E) ((Reference) this.A01).get();
                if (c30e != null) {
                    c30e.A0P(A0H);
                    break;
                }
                break;
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 33:
            case 39:
            case 48:
            default:
                String A0k = AbstractC37304Gc5.A0k(obj);
                if (A0k != null) {
                    return ((C42553IsX) this.A01).A06.AXG(A0k, AbstractC25225BEi.A1D(User.class));
                }
                return null;
            case 6:
                HTE hte = (HTE) obj;
                hte.E9z(A00(hte, this));
                return hte;
            case 7:
                Eh3 eh3 = (Eh3) obj;
                eh3.E8k(A00(eh3, this));
                return eh3;
            case 8:
                HN7 hn7 = (HN7) obj;
                hn7.E8i(A00(hn7, this));
                return hn7;
            case 9:
            case 21:
            case 36:
            case 47:
                C37956Gmy c37956Gmy = (C37956Gmy) obj;
                c37956Gmy.EBK(A00(c37956Gmy, this));
                return c37956Gmy;
            case 10:
                AnonymousClass533 anonymousClass533 = (AnonymousClass533) obj;
                anonymousClass533.E8n(A00(anonymousClass533, this));
                return anonymousClass533;
            case 11:
            case 20:
            case 37:
                String A0k2 = AbstractC37304Gc5.A0k(obj);
                if (A0k2 != null) {
                    return ((C42553IsX) this.A01).A06.AXG(A0k2, AbstractC25225BEi.A1D(C38321qM.class));
                }
                return null;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C1M c1m = (C1M) obj;
                c1m.EBG(A00(c1m, this));
                return c1m;
            case 14:
            case 43:
                HTK htk = (HTK) obj;
                htk.EA3(A00(htk, this));
                return htk;
            case Process.SIGTERM /* 15 */:
                C39231HQi c39231HQi = (C39231HQi) obj;
                c39231HQi.E9B(A00(c39231HQi, this));
                return c39231HQi;
            case 16:
                C37967Gn9 c37967Gn9 = (C37967Gn9) obj;
                c37967Gn9.EBI(A00(c37967Gn9, this));
                return c37967Gn9;
            case 17:
                C1P c1p = (C1P) obj;
                c1p.EBO(A00(c1p, this));
                return c1p;
            case 18:
                HVF hvf = (HVF) obj;
                hvf.EB6(A00(hvf, this));
                return hvf;
            case 22:
                HOE hoe = (HOE) obj;
                hoe.E8u(A00(hoe, this));
                return hoe;
            case 23:
                HOF hof = (HOF) obj;
                hof.E8v(A00(hof, this));
                return hof;
            case 24:
                HOG hog = (HOG) obj;
                hog.E8w(A00(hog, this));
                return hog;
            case 25:
                ImmutablePandoCreativeConfig immutablePandoCreativeConfig = (ImmutablePandoCreativeConfig) obj;
                immutablePandoCreativeConfig.EBM(A00(immutablePandoCreativeConfig, this));
                return immutablePandoCreativeConfig;
            case 26:
                HXO hxo = (HXO) obj;
                hxo.EC0(A00(hxo, this));
                return hxo;
            case 30:
                C39301HWq c39301HWq = (C39301HWq) obj;
                c39301HWq.EBp(A00(c39301HWq, this));
                return c39301HWq;
            case 31:
                C39294HVx c39294HVx = (C39294HVx) obj;
                c39294HVx.EBN(A00(c39294HVx, this));
                return c39294HVx;
            case 32:
                ImmutablePandoXDTLazyFloatingContextItem immutablePandoXDTLazyFloatingContextItem = (ImmutablePandoXDTLazyFloatingContextItem) obj;
                immutablePandoXDTLazyFloatingContextItem.EBF(A00(immutablePandoXDTLazyFloatingContextItem, this));
                return immutablePandoXDTLazyFloatingContextItem;
            case 34:
                C39261HTa c39261HTa = (C39261HTa) obj;
                c39261HTa.EAG(A00(c39261HTa, this));
                return c39261HTa;
            case 35:
                HVy hVy = (HVy) obj;
                hVy.EBP(A00(hVy, this));
                return hVy;
            case 38:
                ImmutablePandoIGTVShoppingInfo immutablePandoIGTVShoppingInfo = (ImmutablePandoIGTVShoppingInfo) obj;
                immutablePandoIGTVShoppingInfo.EBo(A00(immutablePandoIGTVShoppingInfo, this));
                return immutablePandoIGTVShoppingInfo;
            case 40:
                C37966Gn8 c37966Gn8 = (C37966Gn8) obj;
                c37966Gn8.EBH(A00(c37966Gn8, this));
                return c37966Gn8;
            case Seq.NULL_REFNUM /* 41 */:
                C25599BTm c25599BTm = (C25599BTm) obj;
                c25599BTm.E9D(A00(c25599BTm, this));
                return c25599BTm;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C39241HQx c39241HQx = (C39241HQx) obj;
                c39241HQx.E9E(A00(c39241HQx, this));
                return c39241HQx;
            case 44:
                C38009Gnv c38009Gnv = (C38009Gnv) obj;
                c38009Gnv.E9P(A00(c38009Gnv, this));
                return c38009Gnv;
            case 45:
                C1Q c1q = (C1Q) obj;
                c1q.EBU(A00(c1q, this));
                return c1q;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                HRr hRr = (HRr) obj;
                hRr.E9d(A00(hRr, this));
                return hRr;
            case 49:
                HP1 hp1 = (HP1) obj;
                hp1.E94(A00(hp1, this));
                return hp1;
        }
        return C0eB.A00;
    }
}
