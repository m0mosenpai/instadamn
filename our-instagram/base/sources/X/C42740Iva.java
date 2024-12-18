package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iva, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42740Iva implements InterfaceC37176GZn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C42740Iva(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.InterfaceC37176GZn
    public final void Das() {
        if (this.A00 != 0) {
            UserSession userSession = ((C37518Gfa) this.A03).A00;
            Context context = (Context) this.A01;
            C55101ObE c55101ObE = new C55101ObE(userSession, context);
            EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0q;
            C38321qM c38321qM = (C38321qM) this.A02;
            c55101ObE.A04(enumC39652Hih, c38321qM.A2u());
            C41627IbI.A00(context, c38321qM, new C41627IbI(userSession), true);
            return;
        }
        H8D h8d = (H8D) this.A03;
        C55101ObE c55101ObE2 = (C55101ObE) this.A01;
        Context context2 = ((C76223bS) this.A02).A05.A0C;
        C14360o3.A07(context2);
        H8D.A03(context2, h8d, c55101ObE2);
    }

    @Override // X.InterfaceC37176GZn
    public final void Djb() {
        if (this.A00 == 0) {
            H8D.A04((H8D) this.A03, (C55101ObE) this.A01);
        }
    }

    @Override // X.InterfaceC37176GZn
    public final void DxT() {
        if (this.A00 == 0) {
            H8D h8d = (H8D) this.A03;
            C55101ObE c55101ObE = (C55101ObE) this.A01;
            Context context = ((C76223bS) this.A02).A05.A0C;
            C14360o3.A07(context);
            H8D.A03(context, h8d, c55101ObE);
        }
    }
}
