package X;

import android.view.ViewGroup;

/* renamed from: X.0SI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SI extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C13070lt A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ C15370ps A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SI(ViewGroup viewGroup, C13070lt c13070lt, Object obj, C15370ps c15370ps) {
        super(0);
        this.A01 = c13070lt;
        this.A00 = viewGroup;
        this.A02 = obj;
        this.A03 = c15370ps;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C13070lt c13070lt = this.A01;
        C06v c06v = c13070lt.A02;
        ViewGroup viewGroup = this.A00;
        Object obj = this.A02;
        Object A02 = c06v.A02(viewGroup, obj);
        c13070lt.A00 = A02;
        if (A02 != null) {
            this.A03.A00 = new C017606w(0, viewGroup, c13070lt);
            AbstractC10360h2.A0H(2);
            return C0eB.A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to start transition ");
        sb.append(obj);
        sb.append(" for container ");
        sb.append(viewGroup);
        sb.append('.');
        throw new IllegalStateException(sb.toString());
    }
}
