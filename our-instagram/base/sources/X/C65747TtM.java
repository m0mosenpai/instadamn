package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Queue;

/* renamed from: X.TtM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65747TtM implements InterfaceC13250mB {
    public final /* synthetic */ ComponentCallbacks2C142736cZ A00;

    public C65747TtM(ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ) {
        this.A00 = componentCallbacks2C142736cZ;
    }

    @Override // X.InterfaceC13250mB
    public final void DLv(ViewGroup viewGroup, View view, int i) {
        C14360o3.A0B(view, 0);
        ComponentCallbacks2C142736cZ componentCallbacks2C142736cZ = this.A00;
        Queue queue = componentCallbacks2C142736cZ.A06;
        queue.offer(view);
        if (queue.size() == componentCallbacks2C142736cZ.A03) {
            componentCallbacks2C142736cZ.A02 = false;
        }
    }
}
