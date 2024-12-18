package X;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.7iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170467iz extends LinearLayoutManager {
    @Override // X.AbstractC70663Fe
    public final C3OP A0g() {
        if (((LinearLayoutManager) this).A01 == 1) {
            return new C3OP(-1, -2);
        }
        return new C3OP(-2, -1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A1J() {
        if (((LinearLayoutManager) this).A01 == 0) {
            return false;
        }
        return super.A1J();
    }
}
