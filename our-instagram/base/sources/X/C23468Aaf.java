package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.Aaf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23468Aaf implements InterfaceC174927qS {
    public int A00;
    public int A01;
    public Context A02;
    public View A03;
    public C175007qa A04;

    @Override // X.InterfaceC174927qS
    public final void Bfi(AbstractC184688Hj abstractC184688Hj, int i, int i2) {
    }

    @Override // X.InterfaceC174927qS
    public final Bitmap Bfm() {
        return null;
    }

    @Override // X.InterfaceC174927qS
    public final boolean CWm() {
        return true;
    }

    @Override // X.InterfaceC174927qS
    public final void Ea1(C174797qF c174797qF) {
    }

    @Override // X.InterfaceC174927qS
    public final void Eg8(Matrix matrix) {
    }

    @Override // X.InterfaceC174927qS
    public final void EgA(boolean z) {
    }

    @Override // X.InterfaceC174927qS
    public final void release() {
    }

    @Override // X.InterfaceC174927qS
    public final int Ak8() {
        return this.A00;
    }

    @Override // X.InterfaceC174927qS
    public final int Ak9() {
        return this.A01;
    }

    @Override // X.InterfaceC174927qS
    public final boolean CQM() {
        View view = this.A03;
        if (view != null) {
            int width = view.getWidth();
            int height = this.A03.getHeight();
            if (width > 0 && height > 0) {
                this.A01 = width;
                this.A00 = height;
            }
        }
        if (this.A01 > 0 && this.A00 > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.A00 <= 0) goto L6;
     */
    @Override // X.InterfaceC174927qS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ER0(int r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.A01
            if (r0 <= 0) goto L9
            int r1 = r2.A00
            r0 = 1
            if (r1 > 0) goto La
        L9:
            r0 = 0
        La:
            r2.A01 = r3
            r2.A00 = r4
            if (r0 != 0) goto L19
            X.7qa r1 = r2.A04
            boolean r0 = r1.A0G
            if (r0 != 0) goto L19
            r1.A03()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23468Aaf.ER0(int, int):void");
    }

    @Override // X.InterfaceC174927qS
    public final Context getContext() {
        View view = this.A03;
        if (view != null) {
            return view.getContext();
        }
        return this.A02;
    }

    @Override // X.InterfaceC174927qS
    public final int getHeight() {
        View view = this.A03;
        if (view != null && view.getHeight() > 0) {
            return this.A03.getHeight();
        }
        return this.A00;
    }

    @Override // X.InterfaceC174927qS
    public final View getView() {
        return this.A03;
    }

    @Override // X.InterfaceC174927qS
    public final int getWidth() {
        View view = this.A03;
        if (view != null && view.getWidth() > 0) {
            return this.A03.getWidth();
        }
        return this.A01;
    }

    @Override // X.InterfaceC174927qS
    public final void EQz(C175007qa c175007qa) {
        this.A04 = c175007qa;
    }

    @Override // X.InterfaceC174927qS
    public final void Eh1(View view) {
        this.A03 = view;
    }
}
