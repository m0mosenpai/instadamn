package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.Mic, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51133Mic extends C2UU {
    public List A00 = AbstractC166987dD.A1E();
    public final Context A01;
    public final InterfaceC58161PqQ A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        OUX oux = (OUX) this.A00.get(i);
        boolean A1Y = AbstractC43593JPy.A1Y(getItemCount());
        AbstractC54914OQl.A01(this.A01, oux, this.A02, (C51228MkD) c3oo, A1Y);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AbstractC54914OQl.A00(this.A01, viewGroup, false);
    }

    public C51133Mic(Context context, InterfaceC58161PqQ interfaceC58161PqQ) {
        this.A01 = context;
        this.A02 = interfaceC58161PqQ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1581021844);
        int size = this.A00.size();
        C0f9.A0A(1202324648, A03);
        return size;
    }
}
