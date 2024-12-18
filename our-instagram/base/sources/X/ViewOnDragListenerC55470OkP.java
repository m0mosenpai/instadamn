package X;

import android.view.View;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.OkP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnDragListenerC55470OkP implements View.OnDragListener {
    public final View A00;
    public final OFW A01;

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0470, code lost:
    
        if (r6 >= r7) goto L214;
     */
    @Override // android.view.View.OnDragListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDrag(android.view.View r20, android.view.DragEvent r21) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnDragListenerC55470OkP.onDrag(android.view.View, android.view.DragEvent):boolean");
    }

    public ViewOnDragListenerC55470OkP(View view, OFW ofw) {
        this.A00 = view;
        this.A01 = ofw;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((View) next).getVisibility() == 0) {
            abstractCollection.add(next);
        }
    }
}
