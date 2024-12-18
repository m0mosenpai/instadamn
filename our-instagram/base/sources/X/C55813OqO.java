package X;

import com.instagram.zero.headers.IGZeroHeadersPing;

/* renamed from: X.OqO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55813OqO implements C2JL {
    public final /* synthetic */ IGZeroHeadersPing A00;
    public final /* synthetic */ InterfaceC23621Ds A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        InterfaceC23621Ds interfaceC23621Ds = this.A01;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        interfaceC23621Ds.resumeWith(new C54834OLt("", "", message, -1, false));
    }

    public C55813OqO(IGZeroHeadersPing iGZeroHeadersPing, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        this.A02 = z;
        this.A01 = interfaceC23621Ds;
        this.A00 = iGZeroHeadersPing;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        InterfaceC23621Ds interfaceC23621Ds;
        int i;
        C54834OLt c54834OLt;
        N3Q n3q = (N3Q) obj;
        if (n3q == null || (!this.A02 && (n3q.A01.length() == 0 || n3q.A00 != 200))) {
            interfaceC23621Ds = this.A01;
            if (n3q != null) {
                i = n3q.A00;
            } else {
                i = -1;
            }
            c54834OLt = new C54834OLt("", "", "bad response", i, false);
        } else {
            interfaceC23621Ds = this.A01;
            c54834OLt = new C54834OLt(n3q.A01, AbstractC53797Nqn.A00(n3q.A03), "", n3q.A00, true);
        }
        interfaceC23621Ds.resumeWith(c54834OLt);
    }
}
