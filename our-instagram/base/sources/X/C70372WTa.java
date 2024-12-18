package X;

import android.view.View;

/* renamed from: X.WTa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70372WTa implements XCz {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C66351UBk A01;

    public C70372WTa(View view, C66351UBk c66351UBk) {
        this.A01 = c66351UBk;
        this.A00 = view;
    }

    @Override // X.XCz
    public final void DnG() {
        AbstractC70006VzQ.A00(this.A01, 0.0f);
    }

    @Override // X.XCz
    public final void DnH(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            AbstractC70006VzQ.A00(this.A01, (i * 1.0f) / height);
        }
    }

    @Override // X.XCz
    public final void DnI(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            AbstractC70006VzQ.A00(this.A01, (i * 1.0f) / height);
        }
    }
}
