package X;

import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.IkC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLongClickListenerC42043IkC implements View.OnLongClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public ViewOnLongClickListenerC42043IkC(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00 != 0) {
            return ((InterfaceC58311Pt3) this.A02).Dho(null, (C5HW) this.A03, this.A01);
        }
        JHJ jhj = (JHJ) this.A03;
        if (jhj != null) {
            jhj.DeB(AbstractC37301Gc2.A0i((Reel) this.A02), this.A01);
            return true;
        }
        return true;
    }
}
