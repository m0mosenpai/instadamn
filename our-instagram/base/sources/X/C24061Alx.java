package X;

import android.util.DisplayMetrics;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Alx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24061Alx implements InterfaceC1810781j {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C8XV A02;
    public final C1810281e A03;
    public final InterfaceC09390do A04;

    public C24061Alx(AbstractC59962oe abstractC59962oe, UserSession userSession, C8XV c8xv, C1810281e c1810281e) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, c1810281e, c8xv);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A03 = c1810281e;
        this.A02 = c8xv;
        B8R b8r = new B8R(this, 23);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8R(new B8R(abstractC59962oe, 20), 21));
        this.A04 = new C60842q8(new B8R(A00, 22), b8r, new B61(34, null, A00), new C0YZ(C9U1.class));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 5), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        C9U1 c9u1;
        ImageUrl imageUrl;
        Object b8u;
        if (obj == EnumC1810181d.A0l && (obj3 instanceof C188208Vl)) {
            c9u1 = (C9U1) this.A04.getValue();
            JIN jin = ((C188208Vl) obj3).A00;
            c9u1.A00 = jin.AsT();
            imageUrl = jin.AsT();
            b8u = new BAO(33, jin, c9u1);
        } else {
            if (obj != EnumC1810181d.A0n || !(obj3 instanceof C8WM)) {
                return;
            }
            c9u1 = (C9U1) this.A04.getValue();
            imageUrl = ((C8WM) obj3).A00.BVf().A04;
            C14360o3.A0B(imageUrl, 0);
            if (C14360o3.A0K(c9u1.A00, imageUrl)) {
                C9U1.A00(C218679ld.A00, c9u1);
                return;
            } else {
                c9u1.A00 = imageUrl;
                b8u = new B8U(c9u1, 28);
            }
        }
        DisplayMetrics displayMetrics = c9u1.A02;
        String A01 = C50472Tr.A01();
        int i = c9u1.A01;
        G0F g0f = new G0F(b8u, 0);
        C14360o3.A0B(imageUrl, 1);
        C14120nc.A00().ATO(new C217329jR(displayMetrics, imageUrl, g0f, A01, 15, -16777216, i));
    }
}
