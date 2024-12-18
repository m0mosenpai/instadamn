package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.gradient.IGGradientView;

/* renamed from: X.GwO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38503GwO extends C3OO {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final RecyclerView A04;
    public final InterfaceC56392iX A05;
    public final IGGradientView A06;
    public final IGGradientView A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38503GwO(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        InterfaceC56392iX A00 = AbstractC56372iV.A00(view.requireViewById(R.id.hscroll_header));
        this.A05 = A00;
        A00.EZv(new C42365IpS(this, 2));
        this.A04 = AbstractC31176DnK.A0F(view);
        this.A07 = (IGGradientView) view.requireViewById(R.id.fade_gradient_top);
        this.A06 = (IGGradientView) view.requireViewById(R.id.fade_gradient_bottom);
    }
}
