package X;

import android.view.View;

/* renamed from: X.9FK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FK extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FK(int i, Object obj, Object obj2, Object obj3) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            View view = (View) obj;
            C39447HbZ c39447HbZ = (C39447HbZ) obj2;
            IKE ike = (IKE) obj3;
            C14360o3.A0B(view, 0);
            C14360o3.A0B(c39447HbZ, 1);
            C14360o3.A0B(ike, 2);
            return Boolean.valueOf(((C39D) this.A01).E2P(view, (C38321qM) this.A02, ike, (C75113Zb) this.A03, c39447HbZ));
        }
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        C14360o3.A0B(obj3, 2);
        Object obj4 = this.A03;
        C77133cz.A00("setupAutomatedLogging", new C29722D8s(6, obj2, obj, this.A02, obj3, this.A01, obj4));
        return C0eB.A00;
    }
}
