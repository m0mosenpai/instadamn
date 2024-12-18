package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65102x8 implements InterfaceC63392uM {
    public final UserSession A00;
    public final C57112jm A01;
    public final C63622uj A02 = new C63622uj();
    public final C65112x9 A03;
    public final InterfaceC60442pS A04;

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(interfaceC75123Zc, 1);
        String id = interfaceC73233Pz.getId();
        if (id != null) {
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(interfaceC73233Pz, interfaceC75123Zc, id);
            c59072n8.A00(this.A03);
            this.A02.A01(c59072n8.A01(), id);
        }
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        InterfaceC75123Zc interfaceC75123Zc;
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(view, 1);
        String id = interfaceC73233Pz.getId();
        if (id != null) {
            C57112jm c57112jm = this.A01;
            C63622uj c63622uj = this.A02;
            c57112jm.A05(view, c63622uj.A00(id));
            C41102IHt c41102IHt = new C41102IHt(this.A00, this.A04);
            Object obj = c63622uj.A00(id).A04;
            if (obj instanceof InterfaceC75123Zc) {
                interfaceC75123Zc = (InterfaceC75123Zc) obj;
            } else {
                interfaceC75123Zc = null;
            }
            C42521Is0 c42521Is0 = (C42521Is0) interfaceC73233Pz;
            C14360o3.A0B(c42521Is0, 1);
            String str = c42521Is0.A00.A06;
            if (str != null) {
                BFT bft = new BFT(view, c41102IHt.A03, "feed_engagement_unit", c41102IHt.A01.getModuleName(), str);
                c41102IHt.A02.A00(new ICP(C28071Xl.A00(view.getContext(), c41102IHt.A00)), new J2J(c41102IHt, c42521Is0, interfaceC75123Zc), bft);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2x9] */
    public C65102x8(final UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = userSession;
        this.A04 = interfaceC60442pS;
        this.A01 = c57112jm;
        this.A03 = new InterfaceC43071ya(userSession) { // from class: X.2x9
            public double A00;
            public boolean A01;
            public final UserSession A02;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                double B0m = interfaceC57162jr.B0m(c59062n7);
                double CGk = interfaceC57162jr.CGk(c59062n7);
                this.A00 = Math.max(this.A00, CGk);
                int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (this.A01) {
                            C9C4 c9c4 = ((C42521Is0) c59062n7.A03).A00.A00;
                            C14360o3.A0C(c9c4, "null cannot be cast to non-null type com.instagram.api.schemas.NotesResponse");
                            int size = ((List) c9c4.A01).size();
                            AbstractC135966Db.A01(this.A02).A0R(Double.valueOf(B0m), Double.valueOf(this.A00), Integer.valueOf(((InterfaceC75123Zc) c59062n7.A04).getPosition()), size, size);
                            this.A01 = false;
                            this.A00 = 0.0d;
                        }
                        C135976Dc A01 = AbstractC135966Db.A01(this.A02);
                        A01.A08();
                        A01.A04 = false;
                        A01.A0C.clear();
                        A01.A09.clear();
                        A01.A03.clear();
                        A01.A0D.clear();
                        A01.A01 = null;
                        return;
                    }
                    if (B0m < 250.0d || CGk < 0.5d) {
                        return;
                    }
                    this.A01 = true;
                    return;
                }
                AbstractC135966Db.A01(this.A02).A04 = true;
            }

            {
                this.A02 = userSession;
            }
        };
    }
}
