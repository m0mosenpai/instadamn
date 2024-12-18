package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MiJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51114MiJ extends AbstractC155316yK {
    public RecyclerView A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C55095Ob6 A03;
    public final /* synthetic */ PEV A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51114MiJ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, PEV pev, C55095Ob6 c55095Ob6) {
        super(PEV.A0D);
        C14360o3.A0B(c55095Ob6, 4);
        this.A04 = pev;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
        this.A03 = c55095Ob6;
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C51084Mhj c51084Mhj = new C51084Mhj(this.A04);
        ((C3F0) c51084Mhj).A00 = false;
        recyclerView.setItemAnimator(c51084Mhj);
        this.A00 = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C51906Mwo c51906Mwo = (C51906Mwo) getItem(i);
        if (c51906Mwo != null && (c3oo instanceof InterfaceC58295Psn)) {
            ((InterfaceC57985PnV) c3oo).ADV(c51906Mwo);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51380Mmf((ViewGroup) AbstractC31175DnJ.A07(A0E, viewGroup, R.layout.layout_cowatch_playback_vertical_grid, false), this.A01, this.A02, this.A03);
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        PEV pev;
        C51906Mwo c51906Mwo;
        InterfaceC58104PpT interfaceC58104PpT;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof InterfaceC58295Psn) && (c51906Mwo = (pev = this.A04).A01) != null && (interfaceC58104PpT = c51906Mwo.A05) != null && pev.A06.size() <= 1) {
            InterfaceC58295Psn interfaceC58295Psn = (InterfaceC58295Psn) c3oo;
            interfaceC58295Psn.Eh4(pev.A00);
            interfaceC58295Psn.E4Z(interfaceC58104PpT, pev.A04, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onViewDetachedFromWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof InterfaceC58295Psn) {
            InterfaceC58295Psn interfaceC58295Psn = (InterfaceC58295Psn) c3oo;
            interfaceC58295Psn.Eok("hide");
            interfaceC58295Psn.EEE();
            interfaceC58295Psn.Eh4(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof InterfaceC58295Psn) {
            InterfaceC58295Psn interfaceC58295Psn = (InterfaceC58295Psn) c3oo;
            interfaceC58295Psn.onDestroy();
            interfaceC58295Psn.EEE();
            interfaceC58295Psn.Eh4(null);
        }
    }
}
