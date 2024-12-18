package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.DGl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29897DGl extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29897DGl(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C29897DGl A00(C5Tl c5Tl, Object obj, Object obj2, int i) {
        C29897DGl c29897DGl = new C29897DGl(i, obj, obj2);
        c5Tl.FBy(c29897DGl);
        return c29897DGl;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v78, types: [X.LAy, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        String str;
        Object invoke;
        C07N c07n;
        Object invoke2;
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                return AbstractC25231BEo.A0V(this.A02);
            case 4:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = ((C26087BgG) this.A02).A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 5:
                C26803BsR c26803BsR = (C26803BsR) this.A02;
                C28484Chc A0q = AbstractC25226BEj.A0q(c26803BsR.A01);
                boolean A1P = AbstractC167007dF.A1P(((C26035BfO) AbstractC25226BEj.A1B(this.A01)).A00, R.drawable.instagram_arrow_right_pano_filled_24);
                InterfaceC09390do interfaceC09390do = c26803BsR.A04;
                String A03 = C25879Bce.A03(interfaceC09390do);
                String A02 = C25879Bce.A02(interfaceC09390do);
                C25531Mh A00 = C28484Chc.A00(A0q);
                if (AbstractC25226BEj.A1Z(A00)) {
                    if (A1P) {
                        str = "edit_ai_details_avatar_generate_clicked";
                    } else {
                        str = "edit_ai_details_avatar_regenerate_clicked";
                    }
                    AbstractC25229BEm.A1C(A00, AbstractC25233BEq.A0m(A00, str, A03), A02);
                }
                InterfaceC09390do interfaceC09390do2 = c26803BsR.A02;
                AbstractC25226BEj.A0r(interfaceC09390do2).A06.markerStart(673058094);
                AbstractC25226BEj.A0r(interfaceC09390do2).A06.markerPoint(673058094, "avatar_gen_request_sent");
                C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do);
                String str2 = ((C26035BfO) A0n.A0Q.getValue()).A02;
                if (str2.length() > 0) {
                    A0n.A00.A08(str2);
                }
                return C0eB.A00;
            case 8:
                new BP5((UserSession) this.A02, null).A03(C8p.A05);
                ((InterfaceC16620sF) this.A01).invoke(null, null);
                return C0eB.A00;
            case 10:
                InterfaceC16570sA interfaceC16570sA = (InterfaceC16570sA) this.A01;
                C26070Bfy c26070Bfy = (C26070Bfy) this.A02;
                interfaceC16570sA.invoke(c26070Bfy.A03, c26070Bfy.A02, c26070Bfy.A04, c26070Bfy.A01, c26070Bfy.A05, c26070Bfy.A07);
                return C0eB.A00;
            case 11:
                C26779Bs0 c26779Bs0 = (C26779Bs0) this.A02;
                String str3 = ((C26063Bfr) AbstractC25226BEj.A1B(this.A01)).A03;
                if (str3 == null) {
                    str3 = "";
                }
                AbstractC12990ll A0o = AbstractC166987dD.A0o(c26779Bs0.A04);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC25225BEi.A15(c26779Bs0.A02));
                A0b.putString("search_box_placeholder_text", str3);
                A0b.putString(AbstractC50531MSk.A01(), AbstractC25225BEi.A15(c26779Bs0.A05));
                A0b.putParcelable("utm_metadata", (UtmMetadata) c26779Bs0.A06.getValue());
                AbstractC25230BEn.A1A(c26779Bs0, C6XJ.A03(c26779Bs0.getActivity(), A0b, A0o, ModalActivity.class, AbstractC111324zv.A00(1481)));
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 33:
            case 34:
            case 37:
            case 38:
            case 39:
            case Seq.NULL_REFNUM /* 41 */:
            case 45:
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke2 = interfaceC16820sZ2.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke2;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case 18:
            case Process.SIGSTOP /* 19 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                obj = this.A01;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 20:
                UserSession userSession = (UserSession) this.A02;
                C25531Mh A002 = C28370CfW.A00(new C28370CfW(userSession, null, null));
                if (AbstractC25226BEj.A1Z(A002)) {
                    AbstractC25230BEn.A1E(A002, "your_ais_empty_state_create_clicked", null);
                }
                AbstractC25225BEi.A1U(this.A01, userSession);
                return C0eB.A00;
            case 21:
                return new C48123LRx((Context) this.A01, (AbstractC12990ll) this.A02);
            case 22:
                Object obj2 = this.A02;
                Integer num = null;
                Integer num2 = (Integer) this.A01;
                if (num2 != null) {
                    num = num2;
                }
                return new C71353Hw(num, obj2, null, null);
            case 23:
                return new C43261yt((UserSession) this.A02, (C42621xq) this.A01);
            case 24:
                UserSession userSession2 = (UserSession) this.A02;
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                return new W4R(userSession2, context);
            case 25:
                C1S9.A0A((InterfaceC74743Xi) this.A01, (C1S9) this.A02);
                return C0eB.A00;
            case 26:
                return new C43291yw((Context) this.A01, (UserSession) this.A02);
            case 27:
                AnonymousClass142.A01((Context) this.A01, (AnonymousClass142) this.A02, DA5.A00, DA6.A00);
                return C0eB.A00;
            case 28:
                AnonymousClass142.A00((Context) this.A01);
                return C0eB.A00;
            case 30:
                C45515KDg c45515KDg = (C45515KDg) this.A02;
                CreatorLoggingData creatorLoggingData = (CreatorLoggingData) this.A01;
                ((LLN) c45515KDg.A00.getValue()).A07(Boolean.valueOf(creatorLoggingData.A01), Boolean.valueOf(creatorLoggingData.A02), null, null, C05F.A1I, C05F.A06, creatorLoggingData.A00, null, AbstractC06930Yk.A0E());
                return C0eB.A00;
            case 32:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((KC4) this.A02).A0B);
                C50679MYx c50679MYx = ((C45410K8x) ((AbstractC46366Kfo) this.A01)).A04;
                C14360o3.A0B(c50679MYx, 0);
                AbstractC166987dD.A1Z(new MCH(c50679MYx, A0Z, (InterfaceC23621Ds) null, 31), AbstractC141776au.A00(A0Z));
                return C0eB.A00;
            case 35:
                return new Ld3((L97) this.A01, new Object(), (AppreciationGiftingDataSource) this.A02);
            case 36:
                return new Ld1((L97) this.A01, (C47836LAy) this.A02);
            case 43:
                AbstractC25651Mw.A00((AbstractC12990ll) this.A02).A02((InterfaceC41501vz) this.A01, C8B8.class);
                return C0eB.A00;
            case 44:
                ((InterfaceC24741Ir) this.A01).F8s(this.A02);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C28898Cp6((C23299AUk) this.A02, (C1Z9) this.A01);
        }
    }
}
