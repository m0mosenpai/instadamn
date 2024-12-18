package X;

import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.settings2.core.viewmodel.SettingsScreenViewModel;
import java.util.List;

/* renamed from: X.Dba, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30491Dba extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30491Dba(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A05 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = i;
    }

    public static int A00(C30491Dba c30491Dba) {
        return AbstractC128295qy.A00(c30491Dba.A01 | 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC27506CCb.A00(AbstractC25226BEj.A0S(obj, obj2), (C26048Bfb) this.A05, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 1:
                AbstractC28381Cfk.A03(AbstractC25226BEj.A0S(obj, obj2), (C51748MtX) this.A05, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16620sF) this.A02, A00(this));
                break;
            case 2:
                CXQ.A00(AbstractC25226BEj.A0S(obj, obj2), (C50726MaR) this.A05, (C28370CfW) this.A02, (InterfaceC16620sF) this.A03, (InterfaceC16610sE) this.A04, A00(this));
                break;
            case 3:
                AbstractC27556CEb.A00(AbstractC25226BEj.A0S(obj, obj2), (C136946Hx) this.A04, (C75363a3) this.A05, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 4:
                AbstractC28435Cgj.A03(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC74963Ym) this.A04, (Modifier) this.A03, (C2DC) this.A02, (C2DC) this.A05, A00(this));
                break;
            case 5:
                CY6.A01((InterfaceC119655bO) this.A05, AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 6:
                AbstractC28502Chv.A04(AbstractC25226BEj.A0S(obj, obj2), (C51739MtM) this.A05, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                break;
            case 7:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC27630CHb.A00(A0S, (ImmutableList) this.A02, (C26071Bg0) this.A05, (C27829COs) this.A03, interfaceC16660sJ, A00(this));
                break;
            case 8:
                AbstractC28441Cgp.A02(AbstractC25226BEj.A0S(obj, obj2), (EnumC27380C6j) this.A05, (C25984BeY) this.A02, (InterfaceC16660sJ) this.A03, (InterfaceC16610sE) this.A04, A00(this));
                break;
            case 9:
                AbstractC28394Cg0.A01(AbstractC25226BEj.A0S(obj, obj2), (C44527JmX) this.A02, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16660sJ) this.A05, A00(this));
                break;
            case 10:
                AbstractC28497Chq.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (C148336m3) this.A03, (C148336m3) this.A02, (InterfaceC16660sJ) this.A05, A00(this));
                break;
            case 11:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                List list = (List) this.A04;
                AbstractC28497Chq.A06(A0S2, (C44502Jm8) this.A05, (L7D) this.A02, list, (List) this.A03, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                FPE fpe = (FPE) this.A02;
                AbstractC28489Chh.A01(A0S3, (AbstractC59962oe) this.A03, (L7D) this.A04, (C44538Jmi) this.A05, fpe, A00(this));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC28051CYf.A01((C28729CmL) this.A04, AbstractC25226BEj.A0S(obj, obj2), (C51760Mtj) this.A05, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 14:
                AbstractC28500Cht.A07(AbstractC25226BEj.A0S(obj, obj2), (C6V) this.A04, (C45994KXi) this.A05, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case Process.SIGTERM /* 15 */:
                AbstractC28466ChI.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (EnumC33510Erj) this.A03, (QIw) this.A02, (InterfaceC16660sJ) this.A05, A00(this));
                break;
            case 16:
                AbstractC25259BFx.A08(AbstractC25226BEj.A0S(obj, obj2), (BIN) this.A02, (Integer) this.A03, (InterfaceC16660sJ) this.A04, (InterfaceC16660sJ) this.A05, A00(this));
                break;
            case 17:
                AbstractC28399Cg5.A03(AbstractC25226BEj.A0S(obj, obj2), (C26037BfQ) this.A05, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 18:
                AbstractC28323CeB.A00(AbstractC25226BEj.A0S(obj, obj2), (C51757Mtg) this.A05, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A02, (InterfaceC16660sJ) this.A04, A00(this));
                break;
            case Process.SIGSTOP /* 19 */:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                AbstractC28400Cg6.A00(A0S4, (C97T) this.A02, (C3EZ) this.A04, (C3EW) this.A03, interfaceC16820sZ, A00(this));
                break;
            case 20:
                CK9.A00(AbstractC25226BEj.A0S(obj, obj2), (CPM) this.A05, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 21:
                AbstractC28330CeI.A02(AbstractC25226BEj.A0S(obj, obj2), (Integer) this.A04, (Integer) this.A05, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 22:
                C5Tl A0S5 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A03;
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A02;
                AbstractC28402Cg8.A01(A0S5, (ImmutableList) this.A04, (SchoolInfo) this.A05, interfaceC16820sZ2, interfaceC16820sZ3, A00(this));
                break;
            case 23:
                AbstractC28508Ci2.A07(AbstractC25226BEj.A0S(obj, obj2), (C51635MrS) this.A05, (InterfaceC16820sZ) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 24:
                C5Tl A0S6 = AbstractC25226BEj.A0S(obj, obj2);
                C26228Bis c26228Bis = (C26228Bis) this.A05;
                BY0.A04(A0S6, (InterfaceC30953DjA) this.A02, c26228Bis, (SettingsScreenViewModel) this.A04, (InterfaceC16660sJ) this.A03, A00(this));
                break;
            case 25:
                C5Tl A0S7 = AbstractC25226BEj.A0S(obj, obj2);
                C26229Bit c26229Bit = (C26229Bit) this.A05;
                CKK.A00(A0S7, (InterfaceC30953DjA) this.A02, (SettingsScreenViewModel) this.A04, c26229Bit, (InterfaceC16660sJ) this.A03, A00(this));
                break;
            case 26:
                AbstractC28471ChN.A03(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC30953DjA) this.A03, (InterfaceC30953DjA) this.A02, (SettingsScreenViewModel) this.A04, (C26231Biv) this.A05, A00(this));
                break;
            case 27:
                AbstractC28446Cgu.A01(AbstractC25226BEj.A0S(obj, obj2), (C26019Bf8) this.A05, (InterfaceC16660sJ) this.A04, (InterfaceC16620sF) this.A03, (InterfaceC16620sF) this.A02, A00(this));
                break;
            case 28:
                AbstractC28446Cgu.A02(AbstractC25226BEj.A0S(obj, obj2), (C26019Bf8) this.A05, (InterfaceC16620sF) this.A04, (InterfaceC16620sF) this.A03, (InterfaceC16620sF) this.A02, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                AbstractC27709CKc.A00(AbstractC25226BEj.A0S(obj, obj2), (C75363a3) this.A05, (L86) this.A04, (InterfaceC16820sZ) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 30:
                AbstractC28408CgE.A01(AbstractC25226BEj.A0S(obj, obj2), (MUW) this.A05, (InterfaceC58202Pr8) this.A04, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            default:
                C5Tl A0S8 = AbstractC25226BEj.A0S(obj, obj2);
                C211819a8 c211819a8 = (C211819a8) this.A03;
                C5Hb c5Hb = (C5Hb) this.A04;
                AbstractC28408CgE.A03(A0S8, (InterfaceC58202Pr8) this.A05, c211819a8, (InterfaceC16660sJ) this.A02, c5Hb, A00(this));
                break;
        }
        return C0eB.A00;
    }
}
