package X;

import android.view.View;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* loaded from: classes8.dex */
public final class LQI implements View.OnLongClickListener {
    public final /* synthetic */ ConstrainedImageView A00;
    public final /* synthetic */ C83863oV A01;
    public final /* synthetic */ C148176ln A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public LQI(ConstrainedImageView constrainedImageView, C83863oV c83863oV, C148176ln c148176ln, boolean z, boolean z2) {
        this.A04 = z;
        this.A02 = c148176ln;
        this.A03 = z2;
        this.A01 = c83863oV;
        this.A00 = constrainedImageView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        boolean z = false;
        C14360o3.A0B(view, 0);
        if (this.A04) {
            C148176ln c148176ln = this.A02;
            C148176ln.A02(view, c148176ln.A01, c148176ln);
        } else {
            if (this.A03) {
                C148176ln.A09(this.A02);
                return false;
            }
            String str = this.A01.A02;
            if (C168157fA.A03(str) && AbstractC170297ii.A00(C168157fA.A01(str))) {
                C148176ln c148176ln2 = this.A02;
                z = true;
                new ViewOnTouchListenerC48079LQe(c148176ln2.A0E, c148176ln2.A0F, this.A00, C168157fA.A01(str), new C49648Lwf(c148176ln2, 2), AbstractC167017dG.A0C(c148176ln2.A0A), true);
                C23031Ai c23031Ai = c148176ln2.A0N.A05;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A4g;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 303)) {
                    AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 303, true);
                    return true;
                }
            }
        }
        return z;
    }
}
