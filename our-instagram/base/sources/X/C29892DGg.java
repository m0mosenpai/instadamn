package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.gltf.jni.GltfRenderSession;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.zero.cma.CampaignAPITokenFetcher;
import com.instagram.zero.dogfooding.IgZeroDogfoodingInit;
import com.instagram.zero.dogfooding.easydogfooding.IgZeroDogfoodingEasyRepository;
import com.meta.compose.component.swipeable.SwipeableState;
import com.meta.compose.material.bottomsheet.AnchoredDraggableState;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DGg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29892DGg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29892DGg(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C29892DGg A00(Object obj, int i) {
        return new C29892DGg(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0YY, X.0sZ] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        String str;
        WorldLocationPagesInfo CHs;
        String worldId;
        Object value;
        User user;
        C5C3 c5c3;
        InterfaceC58259Ps3 interfaceC58259Ps3;
        C5Hc c5Hc;
        boolean z;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        boolean z4;
        boolean z5;
        C25868BcP c25868BcP;
        InterfaceC30837DhC interfaceC30837DhC;
        Object obj2;
        AnchoredDraggableState anchoredDraggableState;
        Object A02;
        switch (this.A00) {
            case 0:
                ((C26776Brx) this.A01).A00 = null;
                return C0eB.A00;
            case 1:
                C26776Brx c26776Brx = (C26776Brx) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c26776Brx.A04);
                Parcelable parcelable = c26776Brx.requireArguments().getParcelable("arg_wall_post_item");
                if (parcelable != null) {
                    return new C27033BwD(A0r, (WallPostItem) parcelable, c26776Brx.requireArguments().getBoolean("arg_preview_launch_in_reply_mode", false));
                }
                throw AbstractC166997dE.A0g();
            case 2:
            case 6:
            case Process.SIGSTOP /* 19 */:
            case 37:
            case 38:
                return this.A01;
            case 3:
            case 7:
            case 20:
                return AbstractC25226BEj.A1C(this.A01);
            case 4:
            case 8:
            case 21:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 5:
                AbstractC52113N4l abstractC52113N4l = (AbstractC52113N4l) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(abstractC52113N4l.A06);
                EnumC53206Ng4 enumC53206Ng4 = (EnumC53206Ng4) abstractC52113N4l.A04.getValue();
                InterfaceC09390do interfaceC09390do = abstractC52113N4l.A05;
                return new NDO(A0r2, enumC53206Ng4, ((C51014MgM) interfaceC09390do.getValue()).A01, ((C51014MgM) interfaceC09390do.getValue()).A04);
            case 9:
                ((InterfaceC31058Dl0) this.A01).CMV();
                return C0eB.A00;
            case 10:
                c25868BcP = (C25868BcP) this.A01;
                interfaceC30837DhC = C29439CyF.A00;
                C25868BcP.A00(interfaceC30837DhC, c25868BcP);
                return C0eB.A00;
            case 11:
                c25868BcP = (C25868BcP) this.A01;
                interfaceC30837DhC = C29440CyG.A00;
                C25868BcP.A00(interfaceC30837DhC, c25868BcP);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c25868BcP = (C25868BcP) this.A01;
                interfaceC30837DhC = C29438CyE.A00;
                C25868BcP.A00(interfaceC30837DhC, c25868BcP);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A01;
                AbstractC166987dD.A1Z(new D4r(abstractC52922bZ, null, 5), AbstractC141776au.A00(abstractC52922bZ));
                return C0eB.A00;
            case 14:
                C05A c05a = ((C25868BcP) this.A01).A06;
                do {
                    value = c05a.getValue();
                    C26019Bf8 c26019Bf8 = (C26019Bf8) value;
                    user = c26019Bf8.A01;
                    c5c3 = c26019Bf8.A00;
                    interfaceC58259Ps3 = c26019Bf8.A03;
                    c5Hc = c26019Bf8.A06;
                    z = c26019Bf8.A07;
                    str2 = c26019Bf8.A04;
                    z2 = c26019Bf8.A0B;
                    str3 = c26019Bf8.A05;
                    z3 = c26019Bf8.A0A;
                    z4 = c26019Bf8.A09;
                    z5 = c26019Bf8.A08;
                    AbstractC167017dG.A1N(user, c5c3);
                    AbstractC167007dF.A1G(c5Hc, 3, str2);
                } while (!c05a.AIi(value, new C26019Bf8(c5c3, user, null, interfaceC58259Ps3, str2, str3, c5Hc, z, z2, z3, z4, z5)));
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                C25884Bck c25884Bck = (C25884Bck) this.A01;
                List list = c25884Bck.A05;
                List list2 = c25884Bck.A06;
                list2.clear();
                list2.addAll(list);
                C25884Bck.A03(c25884Bck, C30179DRk.A01(c25884Bck, 31));
                return C0eB.A00;
            case 16:
                return AnonymousClass189.A00(((C25884Bck) this.A01).A01);
            case 17:
                return new GltfRenderSession(true);
            case 18:
                C52128N5b c52128N5b = (C52128N5b) this.A01;
                UserSession A0r3 = AbstractC166987dD.A0r(c52128N5b.A08);
                C38321qM c38321qM = c52128N5b.A02;
                if (c38321qM == null) {
                    C14360o3.A0F("entryMedia");
                    throw C00O.createAndThrow();
                }
                InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM);
                if (A0t != null && (CHs = A0t.CHs()) != null && (worldId = CHs.getWorldId()) != null) {
                    return new C52310NCz(A0r3, c52128N5b, worldId);
                }
                throw AbstractC166987dD.A14("Must supply World ID");
            case 22:
                return new CampaignAPITokenFetcher((UserSession) this.A01);
            case 23:
                return new OBL((UserSession) this.A01);
            case 24:
                return new IgZeroDogfoodingInit((AbstractC12990ll) this.A01);
            case 25:
                return new IgZeroDogfoodingEasyRepository((UserSession) this.A01);
            case 26:
                C28187Cba c28187Cba = (C28187Cba) this.A01;
                C27904CRp c27904CRp = c28187Cba.A00;
                int i = c27904CRp.A01.A00;
                if (i >= 2 && (obj2 = c28187Cba.A05.get()) != null) {
                    C17u A0C = C17s.A0C(0, i);
                    ArrayList A0q = AbstractC167017dG.A0q(A0C);
                    Iterator it = A0C.iterator();
                    while (it.hasNext()) {
                        A0q.add(c28187Cba.A07.invoke(obj2, Integer.valueOf(((AbstractC16880sg) it).A00()), c27904CRp));
                    }
                    return A0q;
                }
                return C16930sl.A00;
            case 27:
                C4EG c4eg = new C4EG((AbstractC12990ll) this.A01);
                C24231Gs.A00().A01(c4eg.A02);
                AbstractC166987dD.A1Z(new C206649Cv(c4eg, null, 49), c4eg.A03);
                return c4eg;
            case 28:
                return ((SwipeableState) this.A01).A05.getValue();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((AnchoredDraggableState) this.A01).A04.getValue();
            case 30:
                AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) this.A01;
                return AbstractC166987dD.A1L(anchoredDraggableState2.A04.getValue(), anchoredDraggableState2.A08.getValue());
            case 31:
                anchoredDraggableState = (AnchoredDraggableState) this.A01;
                Object value2 = anchoredDraggableState.A06.getValue();
                if (value2 != null) {
                    return value2;
                }
                float B72 = anchoredDraggableState.A03.B72();
                if (!Float.isNaN(B72)) {
                    Object value3 = anchoredDraggableState.A05.getValue();
                    C28003CWa A01 = AnchoredDraggableState.A01(anchoredDraggableState);
                    float A00 = A01.A00(value3);
                    if (A00 == B72 || Float.isNaN(A00)) {
                        return value3;
                    }
                    if (A00 < B72) {
                        A02 = A01.A02(B72, true);
                    } else {
                        A02 = A01.A02(B72, false);
                    }
                    if (A02 == null) {
                        return value3;
                    }
                    return A02;
                }
                return anchoredDraggableState.A05.getValue();
            case 32:
                AnchoredDraggableState anchoredDraggableState3 = (AnchoredDraggableState) this.A01;
                InterfaceC74953Yl interfaceC74953Yl = anchoredDraggableState3.A04;
                float A002 = ((C28003CWa) interfaceC74953Yl.getValue()).A00(anchoredDraggableState3.A05.getValue());
                float A003 = ((C28003CWa) interfaceC74953Yl.getValue()).A00(anchoredDraggableState3.A07.getValue()) - A002;
                float abs = Math.abs(A003);
                float f = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float A03 = (anchoredDraggableState3.A03() - A002) / A003;
                    if (A03 < 1.0E-6f) {
                        f = 0.0f;
                    } else if (A03 <= 0.999999f) {
                        f = A03;
                    }
                }
                return Float.valueOf(f);
            case 33:
                anchoredDraggableState = (AnchoredDraggableState) this.A01;
                Object value4 = anchoredDraggableState.A06.getValue();
                if (value4 != null) {
                    return value4;
                }
                float B722 = anchoredDraggableState.A03.B72();
                if (!Float.isNaN(B722)) {
                    return AnchoredDraggableState.A02(anchoredDraggableState, anchoredDraggableState.A05.getValue(), B722, 0.0f);
                }
                return anchoredDraggableState.A05.getValue();
            case 34:
                AbstractC166987dD.A1Y(this.A01);
                return AbstractC166997dE.A0b();
            case 35:
                return Float.valueOf(((InterfaceC1128957x) this.A01).EqT(125.0f));
            case 36:
                C26565BoO c26565BoO = (C26565BoO) this.A01;
                interfaceC16660sJ = c26565BoO.A01;
                obj = c26565BoO.A00;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 39:
                C26397Blg c26397Blg = (C26397Blg) this.A01;
                AbstractC35103FdE.A02(c26397Blg.A00, c26397Blg.A01, c26397Blg.A02, "suma", c26397Blg.A03, false);
                return C0eB.A00;
            case 40:
                ((CWZ) this.A01).A04(DQB.A00);
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                C26398Blh c26398Blh = (C26398Blh) this.A01;
                AbstractC35103FdE.A02(c26398Blh.A00, c26398Blh.A01, c26398Blh.A02, "vertical_overflow_full_sheet", C16930sl.A00, false);
                return AbstractC25225BEi.A0f(new C0YY(0));
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                ((C168127f7) this.A01).A01();
                return C0eB.A00;
            case 43:
            case 45:
                ((CWZ) this.A01).A03(null);
                return C0eB.A00;
            case 44:
                C26470Bmr c26470Bmr = (C26470Bmr) this.A01;
                if (c26470Bmr.A04.intValue() == 1) {
                    str = "accounts_center_overflow_menu";
                } else {
                    str = "overflow_menu_half_sheet";
                }
                AbstractC35103FdE.A02(c26470Bmr.A03, c26470Bmr.A05, c26470Bmr.A06, str, C16930sl.A00, true);
                return C25676BWm.A00();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C26554BoD c26554BoD = (C26554BoD) this.A01;
                AbstractC35103FdE.A02(c26554BoD.A00, c26554BoD.A01, c26554BoD.A02, AbstractC43591JPw.A00(1155), C16930sl.A00, true);
                return C25676BWm.A00();
            case 47:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = C6Z.A04;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 48:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = C6Z.A02;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
            case 49:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                obj = C6Z.A03;
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
        }
    }
}
