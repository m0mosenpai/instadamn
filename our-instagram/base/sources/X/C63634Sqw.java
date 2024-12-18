package X;

import android.content.Context;

/* renamed from: X.Sqw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63634Sqw implements InterfaceC65302Tha {
    public final Context A00;
    public final InterfaceC65302Tha A01;

    public C63634Sqw(Context context) {
        C63633Sqv c63633Sqv = new C63633Sqv();
        this.A00 = context.getApplicationContext();
        this.A01 = c63633Sqv;
    }

    @Override // X.InterfaceC65302Tha
    public final /* bridge */ /* synthetic */ InterfaceC65627Tpn ALx() {
        return new C63635Sqx(this.A00, this.A01.ALx());
    }
}
