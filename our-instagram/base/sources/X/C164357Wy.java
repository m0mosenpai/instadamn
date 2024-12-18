package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164357Wy {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final C164337Ww A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final UserSession A05;
    public final C164327Wv A06;
    public final InterfaceC16820sZ A07;

    public C164357Wy(AbstractC59962oe abstractC59962oe, UserSession userSession, C164337Ww c164337Ww, C164327Wv c164327Wv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(interfaceC16820sZ, 5);
        C14360o3.A0B(interfaceC16820sZ2, 6);
        C14360o3.A0B(interfaceC16820sZ3, 7);
        this.A05 = userSession;
        this.A01 = abstractC59962oe;
        this.A02 = c164337Ww;
        this.A06 = c164327Wv;
        this.A03 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A07 = interfaceC16820sZ3;
    }

    public final void A00(boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.A04.invoke();
        if (recyclerView != null) {
            if (z) {
                recyclerView.A0o(0);
            } else {
                recyclerView.A0n(0);
            }
            this.A06.A00();
        }
    }

    public final boolean A01() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A07.invoke();
        if (linearLayoutManager == null) {
            return false;
        }
        int A1c = linearLayoutManager.A1c();
        if (A1c == -1) {
            A1c = linearLayoutManager.A1a();
        }
        if (A1c != 0) {
            return false;
        }
        return true;
    }

    public final boolean A02(int i) {
        C7U0 c7u0 = (C7U0) this.A03.invoke();
        if (this.A00) {
            if (this.A04.invoke() != null) {
                int height = (int) (((View) r0).getHeight() - AbstractC13880nE.A04(this.A01.requireContext(), 125));
                Object invoke = this.A07.invoke();
                if (invoke != null) {
                    ((LinearLayoutManager) invoke).A1p(i, height);
                    this.A00 = false;
                    c7u0.Avk().EJh();
                    return true;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (A01() && !this.A02.A00) {
            A00(false);
            return true;
        }
        return false;
    }
}
