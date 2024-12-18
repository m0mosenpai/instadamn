package X;

import android.content.Context;

/* renamed from: X.LuS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49513LuS implements InterfaceC65242xM {
    public final C66362zD A00;

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final int getCount() {
        return this.A00.getItemCount();
    }

    @Override // X.InterfaceC65242xM
    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        C14360o3.A07(A04);
        return A04;
    }

    public C49513LuS(Context context, InterfaceC50485MQn interfaceC50485MQn) {
        C66392zG A00 = C66362zD.A00(context);
        A00.A0C.addAll(interfaceC50485MQn.AN4());
        C66362zD A002 = A00.A00();
        this.A00 = A002;
        interfaceC50485MQn.EPI(A002);
    }
}
