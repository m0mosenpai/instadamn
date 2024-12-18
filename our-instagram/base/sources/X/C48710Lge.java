package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;

/* renamed from: X.Lge, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48710Lge implements C7ZM {
    public InterfaceC16820sZ A00;
    public InterfaceC16820sZ A01;
    public InterfaceC16820sZ A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final C7ZM A06;

    @Override // X.C7ZM
    public final void D81(Bundle bundle, C7U1 c7u1) {
        C14360o3.A0B(c7u1, 0);
        this.A04 = false;
        if (this.A03) {
            this.A00 = new ME5(48, c7u1, this, bundle);
            this.A01 = null;
            this.A02 = null;
        } else {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.D81(bundle, c7u1);
        }
    }

    @Override // X.C7ZM
    public final void D8T(C7U0 c7u0) {
        C14360o3.A0B(c7u0, 0);
        this.A04 = false;
        boolean z = this.A03;
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (z) {
            if (interfaceC16820sZ != null) {
                this.A01 = new C37018GSz(16, this, c7u0);
                this.A02 = null;
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A06.D8T(c7u0);
    }

    @Override // X.C7ZM
    public final void E0V(View view, RecyclerView recyclerView, C7U0 c7u0, MessageListLayoutManager messageListLayoutManager) {
        C14360o3.A0B(view, 0);
        AbstractC167027dH.A13(recyclerView, messageListLayoutManager, c7u0);
        this.A04 = false;
        boolean z = this.A03;
        InterfaceC16820sZ interfaceC16820sZ = this.A00;
        if (z) {
            if (interfaceC16820sZ != null) {
                if (this.A01 != null) {
                    this.A02 = new MEB(19, c7u0, messageListLayoutManager, this, view, recyclerView);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        InterfaceC16820sZ interfaceC16820sZ2 = this.A01;
        if (interfaceC16820sZ2 != null) {
            interfaceC16820sZ2.invoke();
        }
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A06.E0V(view, recyclerView, c7u0, messageListLayoutManager);
    }

    @Override // X.C7ZM
    public final void onDestroy() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null) {
            this.A06.onDestroy();
        }
    }

    @Override // X.C7ZM
    public final void onDestroyView() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null && this.A01 == null && this.A02 == null) {
            this.A06.onDestroyView();
        }
    }

    @Override // X.C7ZM
    public final void onPause() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null && this.A01 == null && this.A02 == null) {
            this.A06.onPause();
        }
    }

    @Override // X.C7ZM
    public final void onResume() {
        this.A04 = true;
        if (!this.A03) {
            InterfaceC16820sZ interfaceC16820sZ = this.A00;
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
            }
            InterfaceC16820sZ interfaceC16820sZ2 = this.A01;
            if (interfaceC16820sZ2 != null) {
                interfaceC16820sZ2.invoke();
            }
            InterfaceC16820sZ interfaceC16820sZ3 = this.A02;
            if (interfaceC16820sZ3 != null) {
                interfaceC16820sZ3.invoke();
            }
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.onResume();
        }
    }

    @Override // X.C7ZM
    public final void onStop() {
        this.A04 = false;
        if (!this.A03 && this.A00 == null && this.A01 == null && this.A02 == null) {
            this.A06.onStop();
        }
    }

    @Override // X.C7ZM
    public final void Cws() {
        this.A05.postDelayed(new RunnableC49860M0f(this), 1000L);
    }

    @Override // X.C7ZM
    public final void D8i() {
        if (this.A03) {
            this.A03 = false;
            if (this.A04) {
                InterfaceC16820sZ interfaceC16820sZ = this.A00;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                InterfaceC16820sZ interfaceC16820sZ2 = this.A01;
                if (interfaceC16820sZ2 != null) {
                    interfaceC16820sZ2.invoke();
                }
                InterfaceC16820sZ interfaceC16820sZ3 = this.A02;
                if (interfaceC16820sZ3 != null) {
                    interfaceC16820sZ3.invoke();
                }
                this.A00 = null;
                this.A01 = null;
                this.A02 = null;
                this.A06.onResume();
            }
        }
    }

    public /* synthetic */ C48710Lge(C7ZM c7zm) {
        Handler A0J = AbstractC167007dF.A0J();
        this.A06 = c7zm;
        this.A05 = A0J;
        this.A03 = true;
    }
}
