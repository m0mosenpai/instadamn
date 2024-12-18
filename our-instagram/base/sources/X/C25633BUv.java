package X;

import com.facebook.litho.ComponentTree;

/* renamed from: X.BUv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25633BUv {
    public C170697jM A00;
    public ComponentTree A02;
    public final /* synthetic */ C25634BUw A04;
    public final int A03 = C25634BUw.A09.getAndIncrement();
    public boolean A01 = true;

    public C25633BUv(C25634BUw c25634BUw) {
        this.A04 = c25634BUw;
    }

    public final ComponentTree A00() {
        C2XV.A00();
        ComponentTree componentTree = this.A02;
        if (componentTree == null) {
            C25634BUw c25634BUw = this.A04;
            C75713ac A02 = ComponentTree.A02(this.A00.A00, c25634BUw.A03, null);
            A02.A07 = Boolean.valueOf(c25634BUw.A06);
            A02.A03 = null;
            ComponentTree A00 = A02.A00();
            this.A02 = A00;
            this.A01 = false;
            return A00;
        }
        return componentTree;
    }
}
