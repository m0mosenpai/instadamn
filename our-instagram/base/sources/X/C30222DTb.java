package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.User;

/* renamed from: X.DTb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30222DTb extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A05;
                CEG.A00(A0S, (Modifier) this.A04, (ThreadHeaderStyle) this.A03, str, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                AbstractC28033CXh.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, this.A05, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                String str2 = this.A05;
                AbstractC27581CFa.A00(A0S2, (MediaType) this.A03, str2, (InterfaceC16820sZ) this.A04, this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 3:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                String str3 = this.A05;
                CYR.A01(A0S3, (Modifier) this.A04, (BP5) this.A03, str3, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 4:
                BG8.A08(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A03, this.A05, (InterfaceC16660sJ) this.A04, this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 5:
                AbstractC28480ChY.A05(AbstractC25226BEj.A0S(obj, obj2), (User) this.A03, this.A05, (InterfaceC16820sZ) this.A04, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                View view = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                AbstractC167007dF.A1K(view, motionEvent);
                return Boolean.valueOf(((JII) this.A03).DbG(motionEvent, view, (ProductFeedItem) this.A04, this.A05, this.A02, this.A01, false));
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30222DTb(Object obj, Object obj2, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
    }
}
