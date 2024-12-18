package X;

import android.view.View;

/* renamed from: X.43f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C908843f {
    public C43d A00;
    public final View A01;
    public final C33R A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C908843f(View view) {
        C43d c43d;
        this.A01 = view;
        if (view instanceof C43d) {
            c43d = (C43d) view;
        } else {
            c43d = null;
        }
        this.A00 = c43d;
        this.A02 = new C33R() { // from class: X.43g
            @Override // X.C33R
            public final void DSJ(C75113Zb c75113Zb, int i) {
                C43d c43d2;
                C14360o3.A0B(c75113Zb, 0);
                if (i == 24 && (c43d2 = C908843f.this.A00) != null) {
                    c43d2.setBufferEnabled(c75113Zb.A0l.A00());
                }
            }
        };
    }
}
