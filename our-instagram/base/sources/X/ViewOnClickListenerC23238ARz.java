package X;

import android.view.View;

/* renamed from: X.ARz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23238ARz implements View.OnClickListener {
    public final /* synthetic */ AlD A00;
    public final /* synthetic */ InterfaceC144906gA A01;

    public ViewOnClickListenerC23238ARz(AlD alD, InterfaceC144906gA interfaceC144906gA) {
        this.A01 = interfaceC144906gA;
        this.A00 = alD;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-165728368);
        InterfaceC144906gA interfaceC144906gA = this.A01;
        String str = this.A00.A00.A08;
        if (str == null) {
            str = "";
        }
        interfaceC144906gA.DYh(str);
        C0f9.A0C(-582546623, A05);
    }
}
