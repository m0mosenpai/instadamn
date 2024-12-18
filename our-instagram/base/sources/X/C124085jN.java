package X;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124085jN extends AbstractC81363k6 implements InterfaceC81443kE {
    public final Map A00;

    @Override // X.InterfaceC81443kE
    public final Object BEG(C38321qM c38321qM) {
        return this.A00.get(c38321qM);
    }

    @Override // X.InterfaceC81443kE
    public final Map BRm() {
        return this.A00;
    }

    public C124085jN(View view) {
        super(view);
        this.A00 = new HashMap();
    }
}
