package X;

import android.view.DragEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.OkO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnDragListenerC55469OkO implements View.OnDragListener {
    public final /* synthetic */ O26 A00;

    public ViewOnDragListenerC55469OkO(O26 o26) {
        this.A00 = o26;
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        int i;
        Object localState = dragEvent.getLocalState();
        if ((localState instanceof View) && localState != null) {
            O26 o26 = this.A00;
            int action = dragEvent.getAction();
            if (Integer.valueOf(action) != null && action == 5 && o26 != null) {
                C14360o3.A0A(view);
                C14360o3.A0B(view, 1);
                C56050OuP c56050OuP = o26.A00;
                int i2 = ((AbstractC51134Mid) c56050OuP.A0J).A00;
                if (c56050OuP.A05 != null) {
                    int A02 = RecyclerView.A02(view);
                    if (Integer.valueOf(A02) != null && i2 != A02) {
                        if (c56050OuP.A02 == -1) {
                            c56050OuP.A02 = i2;
                        }
                        c56050OuP.A01 = A02;
                        if (i2 >= 0) {
                            c56050OuP.A0K.Cpx(i2, A02);
                        }
                    }
                }
            }
            if (dragEvent.getAction() == 4 && o26 != null) {
                C56050OuP c56050OuP2 = o26.A00;
                int i3 = c56050OuP2.A02;
                if (i3 != c56050OuP2.A01 && i3 >= 0 && i3 < MSW.A06(c56050OuP2.A03()) && (i = c56050OuP2.A01) >= 0 && i < MSW.A06(c56050OuP2.A03())) {
                    c56050OuP2.A0K.DTw(c56050OuP2.A02, c56050OuP2.A01);
                } else {
                    MSX.A1M(c56050OuP2.A0Q, false);
                }
                c56050OuP2.A02 = -1;
                c56050OuP2.A01 = -1;
                c56050OuP2.A0M.A04(-1);
                return true;
            }
            return true;
        }
        return true;
    }
}
