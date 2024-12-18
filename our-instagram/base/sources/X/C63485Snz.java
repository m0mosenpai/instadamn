package X;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.Snz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63485Snz implements KeyListener {
    public final KeyListener A00;

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.A00.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.A00.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[ORIG_RETURN, RETURN] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            r2 = 67
            r1 = 1
            r0 = 0
            if (r6 == r2) goto L1f
            r0 = 112(0x70, float:1.57E-43)
            if (r6 != r0) goto L15
            boolean r0 = X.C63272SgW.A00(r5, r7, r1)
        Le:
            if (r0 == 0) goto L15
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
        L13:
            r0 = 1
        L14:
            return r0
        L15:
            android.text.method.KeyListener r0 = r3.A00
            boolean r1 = r0.onKeyDown(r4, r5, r6, r7)
            r0 = 0
            if (r1 == 0) goto L14
            goto L13
        L1f:
            boolean r0 = X.C63272SgW.A00(r5, r7, r0)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63485Snz.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.A00.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.A00.onKeyUp(view, editable, i, keyEvent);
    }

    public C63485Snz(KeyListener keyListener) {
        this.A00 = keyListener;
    }
}
