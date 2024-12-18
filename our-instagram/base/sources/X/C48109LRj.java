package X;

import android.os.Bundle;

/* renamed from: X.LRj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48109LRj implements InterfaceC018507f {
    public final /* synthetic */ android.net.Uri A00;
    public final /* synthetic */ C45490KCf A01;

    public C48109LRj(android.net.Uri uri, C45490KCf c45490KCf) {
        this.A01 = c45490KCf;
        this.A00 = uri;
    }

    @Override // X.InterfaceC018507f
    public final AbstractC019307n D8C(Bundle bundle, int i) {
        C45490KCf c45490KCf = this.A01;
        return new C44095JeK(c45490KCf.requireContext(), this.A00, null, AbstractC166987dD.A0r(c45490KCf.A0N));
    }

    @Override // X.InterfaceC018507f
    public final /* bridge */ /* synthetic */ void DPn(AbstractC019307n abstractC019307n, Object obj) {
        InterfaceC197178nn interfaceC197178nn;
        InterfaceC197178nn interfaceC197178nn2;
        String Avl;
        C44262Jh8 c44262Jh8 = (C44262Jh8) obj;
        C14360o3.A0B(c44262Jh8, 1);
        C45490KCf c45490KCf = this.A01;
        C18240vB c18240vB = C45490KCf.A0O;
        InterfaceC197178nn interfaceC197178nn3 = c45490KCf.A0A;
        if (interfaceC197178nn3 != null && (interfaceC197178nn = c44262Jh8.A02) != null && !AbstractC50102Ry.A00(interfaceC197178nn3.Avl(), interfaceC197178nn.Avl()) && (interfaceC197178nn2 = c45490KCf.A0A) != null && (Avl = interfaceC197178nn2.Avl()) != null) {
            C45490KCf.A0O.ATO(new C216759iW(Avl));
        }
        c45490KCf.A0A = c44262Jh8.A02;
        c45490KCf.A07 = c44262Jh8.A01;
        c45490KCf.A01 = c44262Jh8.A00;
        c45490KCf.A0L.post(new M0D(c45490KCf));
    }
}
