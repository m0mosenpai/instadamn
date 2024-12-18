package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DbY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30489DbY extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30489DbY(Modifier modifier, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        if (2 - i2 != 0) {
            this.A03 = str;
            this.A04 = str2;
        } else {
            this.A04 = str;
            this.A03 = str2;
        }
        this.A02 = modifier;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28451Ch0.A02(A0S, (ImageUrl) this.A02, this.A04, this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            case 1:
                AbstractC28432Cgg.A03(A0S, this.A04, this.A03, (InterfaceC16820sZ) this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 2:
                AbstractC28432Cgg.A01(A0S, (Modifier) this.A02, this.A04, this.A03, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC28036CXk.A01(A0S, (Modifier) this.A02, this.A03, this.A04, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30489DbY(Object obj, String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = obj;
        this.A01 = i;
    }
}
