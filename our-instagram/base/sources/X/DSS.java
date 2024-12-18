package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DSS extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSS(Object obj, float f, int i, int i2) {
        super(2);
        this.A01 = i2;
        this.A00 = f;
        this.A03 = obj;
        this.A02 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A01;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        switch (i) {
            case 0:
                AbstractC28397Cg3.A01(A0S, (Modifier) this.A03, this.A00, AbstractC25225BEi.A04(this.A02));
                break;
            case 1:
                CZ6.A00((Bitmap) this.A03, A0S, this.A00, AbstractC25225BEi.A04(this.A02));
                break;
            default:
                CZ6.A01(A0S, (ImageUrl) this.A03, this.A00, AbstractC25225BEi.A04(this.A02));
                break;
        }
        return C0eB.A00;
    }
}
