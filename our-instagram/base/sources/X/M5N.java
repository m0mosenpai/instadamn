package X;

import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class M5N implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ JoN A01;
    public final /* synthetic */ C75k A02;

    public M5N(JoN joN, C75k c75k, int i) {
        this.A02 = c75k;
        this.A00 = i;
        this.A01 = joN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75k c75k = this.A02;
        InterfaceC09390do interfaceC09390do = c75k.A04;
        C3OO A0V = ((RecyclerView) interfaceC09390do.getValue()).A0V(this.A00);
        if (A0V != null) {
            AbstractC31171DnF.A06(A0V).startAnimation(AnimationUtils.loadAnimation(c75k.A03, R.anim.bounce));
        }
        ((RecyclerView) interfaceC09390do.getValue()).A15(this.A01);
    }
}
