package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Dbl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30502Dbl extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30502Dbl(Object obj, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = z;
        this.A01 = i;
    }

    public static int A00(C30502Dbl c30502Dbl) {
        return AbstractC128295qy.A00(c30502Dbl.A01 | 1);
    }

    public static void A01(C5UU c5uu, Object obj, int i, int i2, boolean z) {
        c5uu.A06 = new C30502Dbl(obj, i, i2, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                BXG.A05((BXF) this.A02, A0S, A00(this), this.A03);
                break;
            case 1:
            case 2:
            default:
                AbstractC28473ChR.A05(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 3:
                AbstractC28473ChR.A06(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 4:
                AbstractC28462ChE.A04(A0S, (C25314BIj) this.A02, A00(this), this.A03);
                break;
            case 5:
                AbstractC28474ChS.A06(A0S, (InterfaceC30937Dir) this.A02, A00(this), this.A03);
                break;
            case 6:
                AbstractC28502Chv.A07(A0S, (InterfaceC16610sE) this.A02, A00(this), this.A03);
                break;
            case 7:
                AbstractC28502Chv.A01(A0S, (C51739MtM) this.A02, A00(this), this.A03);
                break;
            case 8:
                AbstractC28390Cft.A02(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 9:
                AbstractC28310Cdw.A00(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 10:
                AbstractC28310Cdw.A01(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 11:
                AbstractC28347Cf5.A01(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC28489Chh.A06(A0S, (List) this.A02, A00(this), this.A03);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC28052CYg.A01(A0S, (InterfaceC16620sF) this.A02, A00(this), this.A03);
                break;
            case 14:
                AbstractC27684CJd.A00(A0S, (InterfaceC16660sJ) this.A02, A00(this), this.A03);
                break;
            case Process.SIGTERM /* 15 */:
                CK6.A00(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 16:
                AbstractC28508Ci2.A0B(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
            case 17:
                CZ7.A00((Context) this.A02, A0S, A00(this), this.A03);
                break;
            case 18:
                CLM.A00(A0S, (InterfaceC16820sZ) this.A02, A00(this), this.A03);
                break;
        }
        return C0eB.A00;
    }
}
