package X;

import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.DbZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30490DbZ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30490DbZ(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    public static int A00(C30490DbZ c30490DbZ) {
        return AbstractC128295qy.A00(c30490DbZ.A01 | 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC28453Ch3.A02((CW4) this.A03, AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A05, (InterfaceC16610sE) this.A04, A00(this), this.A02);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C6OA.A00((C6O2) this.A03, A0S, this.A05, this.A04, this.A02, A00(this));
                break;
            case 2:
                CBM.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A05, (InterfaceC1127857k) this.A04, (InterfaceC16620sF) this.A03, A00(this), this.A02);
                break;
            case 3:
                C6NH.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (C6NA) this.A05, (InterfaceC16620sF) this.A03, A00(this), this.A02);
                break;
            case 4:
                AbstractC28450Cgz.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16660sJ) this.A03, (InterfaceC16660sJ) this.A05, A00(this), this.A02);
                break;
            case 5:
                AbstractC27489CBk.A00(AbstractC25226BEj.A0S(obj, obj2), (C07R) this.A03, (C07X) this.A04, (InterfaceC16820sZ) this.A05, A00(this), this.A02);
                break;
            case 6:
                AbstractC28473ChR.A04(AbstractC25226BEj.A0S(obj, obj2), (C26017Bf6) this.A05, (C28370CfW) this.A03, (InterfaceC16620sF) this.A04, this.A02, A00(this));
                break;
            case 7:
            case 8:
                AbstractC28460ChC.A05(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16620sF) this.A05, (C5Hc) this.A03, A00(this), this.A02);
                break;
            case 9:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A05;
                AbstractC27540CDk.A00(A0S2, (Modifier) this.A04, (EnumC27359C5o) this.A03, interfaceC16820sZ, A00(this), this.A02);
                break;
            case 10:
                AbstractC27545CDp.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C26032BfL) this.A05, (InterfaceC16820sZ) this.A04, A00(this), this.A02);
                break;
            case 11:
                CE0.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16820sZ) this.A05, (InterfaceC16610sE) this.A03, A00(this), this.A02);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                CE5.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (MUD) this.A05, (InterfaceC16660sJ) this.A04, A00(this), this.A02);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                CE7.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16620sF) this.A05, (InterfaceC16610sE) this.A03, A00(this), this.A02);
                break;
            case 14:
                CES.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (InterfaceC132315yA) this.A05, (InterfaceC16820sZ) this.A04, A00(this), this.A02);
                break;
            case Process.SIGTERM /* 15 */:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                C5Hc c5Hc = (C5Hc) this.A05;
                CEW.A00(A0S3, (Modifier) this.A03, (InterfaceC16660sJ) this.A04, c5Hc, A00(this), this.A02);
                break;
            case 16:
                C6G1.A00(AbstractC25226BEj.A0S(obj, obj2), (C6Fz) this.A05, (Boolean) this.A04, (InterfaceC16620sF) this.A03, A00(this), this.A02);
                break;
            case 17:
                AbstractC27582CFb.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (MUW) this.A03, (InterfaceC16820sZ) this.A05, A00(this), this.A02);
                break;
            case 18:
                CGA.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC30989Djo) this.A03, this.A05, A00(this), this.A02);
                break;
            case Process.SIGSTOP /* 19 */:
                AbstractC28505Chy.A0B(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC30801Dgc) this.A05, (Integer) this.A04, (InterfaceC16820sZ) this.A03, A00(this), this.A02);
                break;
            case 20:
            case 21:
                AbstractC28504Chx.A03(AbstractC25226BEj.A0S(obj, obj2), (C27934CSt) this.A03, (CharSequence) this.A05, (InterfaceC16660sJ) this.A04, A00(this), this.A02);
                break;
            case 22:
                AbstractC28303Cdp.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (C5C8) this.A03, (InterfaceC16660sJ) this.A05, A00(this), this.A02);
                break;
            case 23:
                AbstractC27638CHj.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (Badge.AchievementBadge) this.A03, (InterfaceC16660sJ) this.A05, A00(this), this.A02);
                break;
            case 24:
                AbstractC27640CHl.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (Badge.ChallengeBadge) this.A03, (InterfaceC16660sJ) this.A05, A00(this), this.A02);
                break;
            case 25:
                AbstractC27650CHv.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (AchievementIntf) this.A03, (InterfaceC16820sZ) this.A05, A00(this), this.A02);
                break;
            case 26:
                CI1.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (AchievementIntf) this.A03, (InterfaceC16660sJ) this.A05, A00(this), this.A02);
                break;
            case 27:
                CI5.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (Badge) this.A03, (InterfaceC16660sJ) this.A05, A00(this), this.A02);
                break;
            case 28:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04;
                CI9.A00(A0S4, (BP5) this.A03, (C26904Bu7) this.A05, interfaceC16820sZ2, A00(this), this.A02);
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                AbstractC28420CgR.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C51758Mth) this.A05, (InterfaceC16660sJ) this.A04, A00(this), this.A02);
                break;
            case 30:
                AbstractC28056CYk.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C2DC) this.A05, (InterfaceC16820sZ) this.A04, A00(this), this.A02);
                break;
            case 31:
            case 32:
            default:
                C5Tl A0S5 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A04;
                int i = this.A02;
                AbstractC28507Ci0.A08(A0S5, (Modifier) this.A03, (List) this.A05, interfaceC16820sZ3, i, A00(this));
                break;
            case 33:
                AbstractC27686CJf.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (C27872CQj) this.A04, (InterfaceC16600sD) this.A05, A00(this), this.A02);
                break;
            case 34:
                C5Tl A0S6 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC28398Cg4.A01(A0S6, (IGRevShareProductType) this.A05, (List) this.A03, interfaceC16660sJ, this.A02, A00(this));
                break;
            case 35:
                C5Tl A0S7 = AbstractC25226BEj.A0S(obj, obj2);
                C26001Bep c26001Bep = (C26001Bep) this.A04;
                AbstractC28063CYr.A01(A0S7, (Modifier) this.A05, (C26839Bt1) this.A03, c26001Bep, A00(this), this.A02);
                break;
            case 36:
                AbstractC28063CYr.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (C51758Mth) this.A05, (C26839Bt1) this.A03, A00(this), this.A02);
                break;
            case 37:
                AbstractC28328CeG.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, (Integer) this.A04, (Integer) this.A05, A00(this), this.A02);
                break;
            case 38:
                C5Tl A0S8 = AbstractC25226BEj.A0S(obj, obj2);
                C75 c75 = (C75) this.A05;
                AbstractC28401Cg7.A01(A0S8, (Modifier) this.A03, (ImmutableList) this.A04, c75, A00(this), this.A02);
                break;
            case 39:
                AbstractC28490Chi.A02(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (MUW) this.A03, (InterfaceC16820sZ) this.A05, A00(this), this.A02);
                break;
        }
        return C0eB.A00;
    }
}
