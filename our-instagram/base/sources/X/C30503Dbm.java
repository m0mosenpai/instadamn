package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Dbm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30503Dbm extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30503Dbm(Object obj, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    public static int A00(C30503Dbm c30503Dbm) {
        return AbstractC128295qy.A00(c30503Dbm.A01 | 1);
    }

    public static void A01(C5UU c5uu, Object obj, String str, int i, int i2) {
        c5uu.A06 = new C30503Dbm(obj, str, i, i2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.A00) {
            case 0:
                CD2.A00(AbstractC25226BEj.A0S(obj, obj2), (C28370CfW) this.A02, this.A03, A00(this));
                break;
            case 1:
                CXP.A01(AbstractC25226BEj.A0S(obj, obj2), (C28370CfW) this.A02, this.A03, A00(this));
                break;
            case 2:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A02;
                String str = this.A03;
                int A00 = A00(this);
                A0S.Enr(1737382226);
                if ((A00 & 6) == 0) {
                    i = AbstractC25232BEp.A0H(A0S, interfaceC16820sZ) | A00;
                } else {
                    i = A00;
                }
                if ((A00 & 48) == 0) {
                    i |= AbstractC25232BEp.A0S(A0S, str);
                }
                if ((i & 19) == 18 && A0S.Bxj()) {
                    A0S.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(-1937494717, "com.instagram.barcelona.common.ui.toast.BdsToastButton (BdsToastMessage.kt:160)");
                    }
                    C5WR.A09(A0S, AbstractC118635Yc.A02(A0S, AbstractC118175Wb.A0A(Modifier.A00, 20.0f, 5.0f), AbstractC25225BEi.A0W(0), interfaceC16820sZ), AbstractC25226BEj.A0h(A0S), str, (i >> 3) & 14);
                    if (C0fH.A02()) {
                        C0fH.A00(-791792341);
                    }
                }
                C5UU ASZ = A0S.ASZ();
                if (ASZ != null) {
                    A01(ASZ, interfaceC16820sZ, str, A00, 2);
                    break;
                }
                break;
            case 3:
                AbstractC28505Chy.A0C(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC30801Dgc) this.A02, this.A03, A00(this));
                break;
            case 4:
                BI4.A0D(AbstractC25226BEj.A0S(obj, obj2), (InterfaceC31096Dle) this.A02, this.A03, A00(this));
                break;
            case 5:
                AbstractC28475ChT.A05(AbstractC25226BEj.A0S(obj, obj2), (C2DC) this.A02, this.A03, A00(this));
                break;
            case 6:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28437Cgl.A03((InterfaceC16820sZ) this.A02, this.A03, A0S2, A00(this));
                break;
            case 7:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28437Cgl.A04((InterfaceC16820sZ) this.A02, this.A03, A0S3, A00(this));
                break;
            case 8:
                AbstractC28476ChU.A03(AbstractC25226BEj.A0S(obj, obj2), (ImageUrl) this.A02, this.A03, A00(this));
                break;
            case 9:
                AbstractC28466ChI.A05((InterfaceC16820sZ) this.A02, this.A03, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 10:
                AbstractC28466ChI.A03(AbstractC25226BEj.A0S(obj, obj2), (BI3) this.A02, this.A03, A00(this));
                break;
            case 11:
                AbstractC28466ChI.A04(AbstractC25226BEj.A0S(obj, obj2), this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28498Chr.A08((InterfaceC16820sZ) this.A02, this.A03, A0S4, A00(this));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC28508Ci2.A0A(AbstractC25226BEj.A0S(obj, obj2), this.A03, (InterfaceC16660sJ) this.A02, A00(this));
                break;
            case 14:
                CKW.A00(AbstractC25226BEj.A0S(obj, obj2), (GifUrlImpl) this.A02, this.A03, A00(this));
                break;
            case Process.SIGTERM /* 15 */:
                C5Tl A0S5 = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC28478ChW.A06((InterfaceC16820sZ) this.A02, this.A03, A0S5, A00(this));
                break;
            default:
                CLK.A00(AbstractC25226BEj.A0S(obj, obj2), (C211819a8) this.A02, this.A03, A00(this));
                break;
        }
        return C0eB.A00;
    }
}
