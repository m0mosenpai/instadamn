package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.DIh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29943DIh extends C0YY implements InterfaceC16660sJ {
    public static final C29943DIh A00 = new C29943DIh();

    public C29943DIh() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewParent parent = AbstractC25228BEl.A0R(obj).getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        return parent;
    }
}
