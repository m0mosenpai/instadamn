package X;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;
import java.util.Iterator;

/* renamed from: X.58q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnDragListenerC1130358q implements View.OnDragListener, InterfaceC1130458r {
    public final InterfaceC16610sE A03;
    public final C1130658t A02 = new C1130658t(C1130558s.A00);
    public final C012504o A00 = new C012504o(0);
    public final Modifier A01 = new DragAndDropModifierOnDragListener$modifier$1(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        COP cop = new COP(dragEvent);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                C1130658t c1130658t = this.A02;
                ?? obj = new Object();
                DHZ dhz = new DHZ(11, obj, c1130658t, cop);
                if (dhz.invoke(c1130658t) == BHM.ContinueTraversal) {
                    BFZ.A03(c1130658t, dhz);
                }
                z = obj.A00;
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return z;
            case 2:
                this.A02.DTz(cop);
                return false;
            case 3:
                return this.A02.DCZ(cop);
            case 4:
                this.A02.DDh(cop);
                return false;
            case 5:
            default:
                return z;
            case 6:
                this.A02.DF2(cop);
                return false;
        }
    }

    public ViewOnDragListenerC1130358q(InterfaceC16610sE interfaceC16610sE) {
        this.A03 = interfaceC16610sE;
    }
}
