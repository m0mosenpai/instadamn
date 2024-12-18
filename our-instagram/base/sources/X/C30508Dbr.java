package X;

import android.text.Spanned;
import androidx.compose.ui.Modifier;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostItem;
import go.Seq;
import java.util.List;

/* renamed from: X.Dbr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30508Dbr extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30508Dbr(List list, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(2);
        this.A00 = i2;
        if (17 - i2 != 0) {
            this.A03 = list;
            this.A02 = interfaceC16660sJ;
        } else {
            this.A02 = list;
            this.A03 = interfaceC16660sJ;
        }
        this.A01 = i;
    }

    public static int A00(C30508Dbr c30508Dbr) {
        return AbstractC128295qy.A00(c30508Dbr.A01 | 1);
    }

    public static void A01(C5UU c5uu, Object obj, Object obj2, int i, int i2) {
        c5uu.A06 = new C30508Dbr(i, i2, obj, obj2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28509Ci3.A0C(A0S, (C26081BgA) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 1:
                AbstractC28509Ci3.A02(A0S, (Modifier) this.A02, (ImageUrl) this.A03, A00(this));
                break;
            case 2:
                AbstractC28065CYt.A01(A0S, (C54601OAc) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 3:
                AbstractC28065CYt.A00(A0S, (Modifier) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 4:
                AbstractC28326CeE.A00(A0S, (InterfaceC55362gb) this.A03, (C4NJ) this.A02, A00(this));
                break;
            case 5:
                AbstractC28326CeE.A01(A0S, (InterfaceC55362gb) this.A03, (C4NJ) this.A02, A00(this));
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                AbstractC28326CeE.A02(A0S, (InterfaceC55362gb) this.A03, (C4NJ) this.A02, A00(this));
                break;
            case 10:
                AbstractC28400Cg6.A02(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 11:
                AbstractC28400Cg6.A03(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC28444Cgs.A01(A0S, (UQE) this.A02, (N84) this.A03, A00(this));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC28444Cgs.A03(A0S, (UQE) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 14:
                CYz.A01((C5Hc) this.A02, (InterfaceC16660sJ) this.A03, A0S, A00(this));
                break;
            case Process.SIGTERM /* 15 */:
                AbstractC28508Ci2.A06(A0S, (C38687GzS) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 16:
                AbstractC28508Ci2.A0C(A0S, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 17:
                BY0.A05(A0S, (List) this.A02, (InterfaceC16660sJ) this.A03, A00(this));
                break;
            case 18:
                AbstractC25709BXu.A00(A0S, (C51759Mti) this.A02, (EnumC72392Xce) this.A03, A00(this));
                break;
            case Process.SIGSTOP /* 19 */:
            case 20:
                AbstractC28490Chi.A05(A0S, (CWE) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 21:
                CZ3.A01(A0S, (C27916CSb) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 22:
                CZ3.A00(A0S, (WallMenuConfig) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 23:
                CKU.A00(A0S, (C27878CQp) this.A02, (InterfaceC16820sZ) this.A03, A00(this));
                break;
            case 24:
                CZ4.A00(A0S, (WallInfo) this.A03, (C25883Bcj) this.A02, A00(this));
                break;
            case 25:
                CZ4.A01(A0S, (WallInfo) this.A03, (C25883Bcj) this.A02, A00(this));
                break;
            case 26:
                AbstractC28403Cg9.A01(A0S, (InterfaceC74953Yl) this.A02, (WallPostItem) this.A03, A00(this));
                break;
            case 27:
                AbstractC28403Cg9.A00((InterfaceC119655bO) this.A03, A0S, (InterfaceC16820sZ) this.A02, A00(this));
                break;
            case 28:
                AbstractC28447Cgv.A02(A0S, (C26084BgD) this.A03, (C25882Bci) this.A02, A00(this));
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                AbstractC28334CeM.A00(A0S, (Modifier) this.A02, (User) this.A03, A00(this));
                break;
            case 30:
                AbstractC28334CeM.A02(A0S, (List) this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 31:
                AbstractC28491Chj.A05(A0S, (C27911CRw) this.A02, (InterfaceC30854DhT) this.A03, A00(this));
                break;
            case 32:
                AbstractC28491Chj.A06(A0S, (C27911CRw) this.A02, (C26235Bj4) this.A03, A00(this));
                break;
            case 33:
                AbstractC28491Chj.A01(A0S, (C26236Bj5) this.A03, (C27911CRw) this.A02, A00(this));
                break;
            case 34:
                AbstractC28491Chj.A04(A0S, (C27911CRw) this.A03, (AbstractC27912CRx) this.A02, A00(this));
                break;
            case 35:
                AbstractC28491Chj.A00((Spanned) this.A03, A0S, (Modifier) this.A02, A00(this));
                break;
            case 36:
                AbstractC28491Chj.A07(A0S, (C27911CRw) this.A02, (C5Hc) this.A03, A00(this));
                break;
            case 37:
                AbstractC28491Chj.A02(A0S, (C26236Bj5) this.A03, (C27911CRw) this.A02, A00(this));
                break;
            case 38:
                AbstractC28478ChW.A00(A0S, (Modifier) this.A03, (ImageUrl) this.A02, A00(this));
                break;
            case 39:
            case 40:
                AbstractC28339CeR.A01(A0S, (C26054Bfh) this.A03, (MOE) this.A02, A00(this));
                break;
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
                CLL.A00(A0S, (C26052Bff) this.A03, (InterfaceC16820sZ) this.A02, A00(this));
                break;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30508Dbr(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }
}
