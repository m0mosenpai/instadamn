package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DST extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DST(long j, Object obj, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = j;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Object obj3 = this.A03;
        if (i != 0) {
            AbstractC28387Cfq.A00(A0S, (Modifier) obj3, AbstractC25225BEi.A04(this.A01), this.A02);
        } else {
            CXU.A01(A0S, (ImageUrl) obj3, AbstractC25225BEi.A04(this.A01), this.A02);
        }
        return C0eB.A00;
    }
}
