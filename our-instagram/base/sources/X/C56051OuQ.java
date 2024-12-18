package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.instagram.common.gallery.Medium;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.OuQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56051OuQ implements InterfaceC193488hT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56051OuQ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
                return ((C14510oO) this.A02).A00;
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        boolean z2;
        TextView textView;
        C52511NLe c52511NLe;
        switch (this.A00) {
            case 0:
                z2 = false;
                AbstractC167007dF.A1D(medium, 0, bitmap);
                C52511NLe c52511NLe2 = (C52511NLe) this.A01;
                textView = c52511NLe2.A00;
                c52511NLe = c52511NLe2;
                break;
            case 1:
                C14360o3.A0B(bitmap, 2);
                C51302MlP c51302MlP = (C51302MlP) this.A01;
                Object obj = this.A02;
                IgImageButton igImageButton = c51302MlP.A00;
                igImageButton.setImageBitmap(bitmap);
                ViewOnClickListenerC55465OkK.A01(c51302MlP.A01, 67, obj, c51302MlP);
                ViewOnClickListenerC55465OkK.A01(igImageButton, 68, obj, c51302MlP);
                return;
            case 2:
                C14360o3.A0B(bitmap, 2);
                ((InterfaceC74953Yl) this.A01).Egh(bitmap);
                ((C14510oO) this.A02).A00 = false;
                return;
            case 3:
                z2 = false;
                AbstractC167007dF.A1D(medium, 0, bitmap);
                C52512NLf c52512NLf = (C52512NLf) this.A01;
                textView = c52512NLf.A00;
                c52511NLe = c52512NLf;
                break;
            default:
                return;
        }
        textView.setVisibility(AbstractC167007dF.A05(medium.Cff() ? 1 : 0));
        if (textView.getVisibility() == 0) {
            textView.setText(medium.B8m());
        }
        ((C38160GqR) c52511NLe).A00.setImageBitmap(bitmap);
        ((C14510oO) this.A02).A00 = z2;
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }
}
