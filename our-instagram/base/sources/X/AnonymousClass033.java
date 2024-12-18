package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.033, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass033 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass033(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return new C11880jn((Context) this.A01, (AbstractC12990ll) this.A02);
        }
        ((C13070lt) this.A03).A02.A0C((ViewGroup) this.A01, this.A02);
        return C0eB.A00;
    }
}
