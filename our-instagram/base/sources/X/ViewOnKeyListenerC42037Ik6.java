package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Ik6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnKeyListenerC42037Ik6 implements View.OnKeyListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C126545np A01;
    public final /* synthetic */ C6T7 A02;

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            C126545np c126545np = this.A01;
            if (c126545np.getVisibility() == 0) {
                ViewGroup viewGroup = this.A00;
                C6T7 c6t7 = this.A02;
                c126545np.setVisibility(8);
                viewGroup.removeView(c126545np);
                c6t7.A03();
                return true;
            }
            return false;
        }
        return false;
    }

    public ViewOnKeyListenerC42037Ik6(ViewGroup viewGroup, C126545np c126545np, C6T7 c6t7) {
        this.A01 = c126545np;
        this.A00 = viewGroup;
        this.A02 = c6t7;
    }
}
