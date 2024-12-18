package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Dbj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30500Dbj extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30500Dbj(String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = str;
        this.A01 = i;
    }

    public static int A00(C30500Dbj c30500Dbj) {
        return AbstractC128295qy.A00(c30500Dbj.A01 | 1);
    }

    public static void A01(C5UU c5uu, String str, int i, int i2) {
        c5uu.A06 = new C30500Dbj(str, i, i2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC28432Cgg.A04(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 1:
                AbstractC27588CFh.A00(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 2:
                AbstractC28475ChT.A06(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 3:
                AbstractC28387Cfq.A03(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 4:
                AbstractC28488Chg.A06(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 5:
                AbstractC28488Chg.A07(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 6:
                AbstractC28439Cgn.A02(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 7:
                AbstractC28439Cgn.A03(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 8:
                AbstractC28395Cg1.A02(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 9:
                AbstractC28395Cg1.A03(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 10:
                AbstractC25259BFx.A0B(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 11:
                AbstractC28509Ci3.A0G(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC28509Ci3.A0H(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                AbstractC28509Ci3.A0I(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case 14:
                CK8.A00(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            case Process.SIGTERM /* 15 */:
                CKB.A00(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
            default:
                AbstractC28478ChW.A05(this.A02, AbstractC25226BEj.A0S(obj, obj2), A00(this));
                break;
        }
        return C0eB.A00;
    }
}
