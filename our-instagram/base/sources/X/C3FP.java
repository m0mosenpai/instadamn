package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3FP, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3FP implements C3FQ {
    public InterfaceC65242xM A00;
    public InterfaceC65242xM A01;
    public final RecyclerView A03;
    public final List A04 = new ArrayList();
    public final AbstractC61812ri A02 = new C3FS(this);

    @Override // X.C3FQ
    public final int BDJ() {
        return 0;
    }

    @Override // X.C3FQ
    public final boolean CXX() {
        return false;
    }

    @Override // X.C3FQ
    public final void EMU(Fragment fragment) {
        EMV(true);
    }

    @Override // X.C3FQ
    public final void EdY(int i) {
        EdZ(i, 0);
    }

    @Override // X.C3FQ
    public final void Egn(boolean z) {
        this.A03.setVerticalScrollBarEnabled(true);
    }

    @Override // X.C3FQ
    public final void AAJ(C1I2 c1i2) {
        this.A03.A14(c1i2);
    }

    @Override // X.C3FQ
    public final void AI0() {
        this.A03.A0a();
    }

    @Override // X.C3FQ
    public final InterfaceC65242xM AZU() {
        InterfaceC65242xM interfaceC65242xM = this.A00;
        if (interfaceC65242xM == null && (interfaceC65242xM = this.A01) == null) {
            Object obj = this.A03.A0A;
            if (obj instanceof InterfaceC65242xM) {
                this.A00 = (InterfaceC65242xM) obj;
            } else if (obj instanceof C66362zD) {
                WlQ wlQ = new WlQ(this);
                this.A01 = wlQ;
                return wlQ;
            }
        }
        return interfaceC65242xM;
    }

    @Override // X.C3FQ
    public final View AnU(int i) {
        return this.A03.getChildAt(i);
    }

    @Override // X.C3FQ
    public final View AnW(int i) {
        RecyclerView recyclerView = this.A03;
        recyclerView.A0D.getClass();
        return recyclerView.A0D.A0d(i);
    }

    @Override // X.C3FQ
    public final int AnZ() {
        return this.A03.getChildCount();
    }

    @Override // X.C3FQ
    public final int Ayo() {
        if (this.A03.A12.size() > 0) {
            C0K8.A0E("RecyclerViewProxy", "recyclerview doesn't support getDividerHeight with Item Decoration");
            return 0;
        }
        return 0;
    }

    @Override // X.C3FQ
    public final int B6q() {
        int A01;
        AbstractC70663Fe abstractC70663Fe = this.A03.A0D;
        if (abstractC70663Fe == null || (A01 = AbstractC72193Ls.A01(abstractC70663Fe)) == -1) {
            return 0;
        }
        return A01;
    }

    @Override // X.C3FQ
    public final void BA7(Rect rect) {
        this.A03.getGlobalVisibleRect(rect);
    }

    @Override // X.C3FQ
    public final int BM3() {
        int A02;
        AbstractC70663Fe abstractC70663Fe = this.A03.A0D;
        if (abstractC70663Fe == null || (A02 = AbstractC72193Ls.A02(abstractC70663Fe)) == -1) {
            return -1;
        }
        return A02;
    }

    @Override // X.C3FQ
    public final int BMa(View view) {
        C3OO A0X = this.A03.A0X(view);
        if (A0X != null) {
            return A0X.getLayoutPosition();
        }
        return -1;
    }

    @Override // X.C3FQ
    public final /* bridge */ /* synthetic */ ViewGroup CFj() {
        return this.A03;
    }

    @Override // X.C3FQ
    public final boolean CQ5() {
        return AbstractC110854yx.A04(this.A03);
    }

    @Override // X.C3FQ
    public final boolean CQ6() {
        return AbstractC110854yx.A05(this.A03);
    }

    @Override // X.C3FQ
    public final boolean CV1() {
        return this.A03.isFocused();
    }

    @Override // X.C3FQ
    public final void EGF(C1I2 c1i2) {
        this.A03.A15(c1i2);
    }

    @Override // X.C3FQ
    public final void EMV(boolean z) {
        RecyclerView recyclerView = this.A03;
        C14360o3.A0B(recyclerView, 0);
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((abstractC70663Fe instanceof LinearLayoutManager) && ((LinearLayoutManager) abstractC70663Fe).A1a() == -1) {
            return;
        }
        AbstractC110854yx.A01(recyclerView, z);
    }

    @Override // X.C3FQ
    public final void EPJ(InterfaceC65242xM interfaceC65242xM) {
        C2UU c2uu;
        RecyclerView recyclerView = this.A03;
        if (interfaceC65242xM == null) {
            c2uu = null;
        } else {
            c2uu = (C2UU) interfaceC65242xM.getAdapter();
        }
        recyclerView.setAdapter(c2uu);
        this.A00 = interfaceC65242xM;
    }

    @Override // X.C3FQ
    public final void EcF(C42068Ikb c42068Ikb) {
        this.A03.A0H = c42068Ikb;
    }

    @Override // X.C3FQ
    public final void EdZ(int i, int i2) {
        AbstractC70663Fe abstractC70663Fe = this.A03.A0D;
        if (abstractC70663Fe != null) {
            AbstractC72193Ls.A05(abstractC70663Fe, i, i2);
        }
    }

    @Override // X.C3FQ
    public final void EmD(int i) {
        this.A03.A0o(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.4yt, X.4ys, X.4yu] */
    @Override // X.C3FQ
    public final void EmE(int i, int i2) {
        RecyclerView recyclerView = this.A03;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != 0) {
            ?? c110814yt = new C110814yt(recyclerView.getContext());
            c110814yt.A00 = -1.0f;
            c110814yt.A01 = i2;
            c110814yt.A00 = i;
            abstractC70663Fe.A10(c110814yt);
        }
    }

    @Override // X.C3FQ
    public final void Eog() {
        this.A03.A0k();
    }

    @Override // X.C3FQ
    public final Context getContext() {
        return this.A03.getContext();
    }

    @Override // X.C3FQ
    public final int getCount() {
        C2UU c2uu = this.A03.A0A;
        if (c2uu != null) {
            return c2uu.getItemCount();
        }
        return 0;
    }

    @Override // X.C3FQ
    public final ViewParent getParent() {
        return this.A03.getParent();
    }

    public C3FP(RecyclerView recyclerView) {
        this.A03 = recyclerView;
    }

    @Override // X.C3FQ
    public final void EmF(int i, int i2, int i3) {
        EmE(i, i2);
    }
}
