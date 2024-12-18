package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.LeK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48582LeK implements InterfaceC150196pR, C7OC {
    public final AbstractC59962oe A00;
    public final /* synthetic */ C45486KCa A01;

    @Override // X.InterfaceC150206pS
    public final boolean Cb5(boolean z) {
        return false;
    }

    @Override // X.InterfaceC150196pR
    public final void CxL(View view, InterfaceC148316m1 interfaceC148316m1) {
    }

    public C48582LeK(C45486KCa c45486KCa) {
        this.A01 = c45486KCa;
        this.A00 = c45486KCa;
    }

    private final void A00(View view, C148336m3 c148336m3) {
        C45486KCa c45486KCa = this.A01;
        if (c45486KCa.isAdded()) {
            AbstractC148206lq abstractC148206lq = c45486KCa.A02;
            if (abstractC148206lq != null) {
                abstractC148206lq.A05(c148336m3);
            }
            LQ6 lq6 = c45486KCa.A03;
            if (lq6 == null) {
                C14360o3.A0F("emojiSearchBarController");
                throw C00O.createAndThrow();
            }
            lq6.A01.A03();
            Context context = c45486KCa.getContext();
            if (context != null) {
                C3DN A01 = C3DN.A00.A01(context);
                if (A01 != null) {
                    A01.A0B();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            MOV mov = c45486KCa.A01;
            if (mov != null) {
                mov.DDN(view, c148336m3.A02, c148336m3.A01);
            }
        }
    }

    @Override // X.InterfaceC150206pS
    public final long Ayc() {
        return 0L;
    }

    @Override // X.InterfaceC150206pS
    public final AbstractC59962oe Baj() {
        return this.A00;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CXU() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CYO() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CZ3() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CdE() {
        return false;
    }

    @Override // X.InterfaceC150196pR
    public final void CxM(Drawable drawable, View view, InterfaceC148316m1 interfaceC148316m1) {
        AbstractC167017dG.A1N(interfaceC148316m1, view);
        if (interfaceC148316m1.CBc() == EnumC148326m2.A04) {
            C148336m3 B1F = interfaceC148316m1.B1F();
            if (B1F != null) {
                A00(view, B1F);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        AbstractC167017dG.A1N(c148336m3, view);
        A00(view, c148336m3);
    }
}
