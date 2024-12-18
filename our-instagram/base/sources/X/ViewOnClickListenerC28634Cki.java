package X;

import android.view.View;

/* renamed from: X.Cki, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28634Cki implements View.OnClickListener {
    public final /* synthetic */ C143556du A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC28634Cki(C143556du c143556du, String str, String str2) {
        this.A00 = c143556du;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-698527276);
        InterfaceC144586fe interfaceC144586fe = this.A00.A0E;
        if (interfaceC144586fe != null) {
            interfaceC144586fe.D1d(this.A01, this.A02);
            C0f9.A0C(-924455045, A05);
        } else {
            IllegalArgumentException A0n = AbstractC25227BEk.A0n();
            C0f9.A0C(1999027247, A05);
            throw A0n;
        }
    }
}
