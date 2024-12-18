package X;

import android.view.View;

/* renamed from: X.OkS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnFocusChangeListenerC55473OkS implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnFocusChangeListenerC55473OkS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC55473OkS(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014b, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r3), r3, 36328461182254635L) != false) goto L47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.view.View.OnFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(android.view.View r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC55473OkS.onFocusChange(android.view.View, boolean):void");
    }
}
