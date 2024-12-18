package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.IqW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42429IqW implements JIF {
    public float A00;
    public float A01;
    public RecyclerView A02;
    public C51755Mte A03;
    public Parcelable A04;
    public ViewGroup A05;
    public final FragmentActivity A06;
    public final InterfaceC59992oh A07;
    public final InterfaceC43407JFx A08;
    public final C38363Gtz A09;
    public final C40960ICh A0A;
    public final Context A0B;
    public final C57112jm A0C;

    @Override // X.JIF
    public final void onDestroyView() {
        throw C00O.createAndThrow();
    }

    @Override // X.JIF
    public final void AJJ(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, C3FQ c3fq) {
        this.A01 = AbstractC38152GqJ.A00(this.A05, viewOnTouchListenerC60632pm, interfaceC65252xN, c3fq, 0);
    }

    @Override // X.JIF
    public final void AJK(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, XAp xAp) {
        xAp.DKL(this.A00);
        viewOnTouchListenerC60632pm.A04(C56352iT.A0t.A03(this.A06).A0P, new C42140Ilo(this, xAp), C3HB.A00(this.A0B));
    }

    @Override // X.JIF
    public final void EMG() {
        RecyclerView recyclerView = this.A02;
        C14360o3.A0B(recyclerView, 0);
        recyclerView.A0o(0);
    }

    @Override // X.JIF
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("");
        C38363Gtz c38363Gtz = this.A09;
        int itemCount = c38363Gtz.getItemCount();
        RecyclerView recyclerView = this.A02;
        if (itemCount > 0) {
            recyclerView.setVisibility(0);
            this.A02.setAdapter(c38363Gtz);
            if (this.A05.getParent() == null) {
                interfaceC56362iU.A7x(this.A05);
                return;
            }
            return;
        }
        recyclerView.setVisibility(8);
    }

    @Override // X.JIF
    public final void onPause() {
        AbstractC70663Fe abstractC70663Fe = this.A02.A0D;
        abstractC70663Fe.getClass();
        this.A04 = abstractC70663Fe.A1M();
    }

    @Override // X.JIF
    public final void onResume() {
        Parcelable parcelable = this.A04;
        if (parcelable != null) {
            AbstractC70663Fe abstractC70663Fe = this.A02.A0D;
            abstractC70663Fe.getClass();
            abstractC70663Fe.A1P(parcelable);
        }
    }

    public C42429IqW(Context context, FragmentActivity fragmentActivity, InterfaceC59992oh interfaceC59992oh, InterfaceC43407JFx interfaceC43407JFx, C40960ICh c40960ICh) {
        this.A0B = context;
        this.A06 = fragmentActivity;
        this.A07 = interfaceC59992oh;
        this.A0A = c40960ICh;
        this.A08 = interfaceC43407JFx;
        C57112jm A0N = AbstractC31180DnO.A0N();
        this.A0C = A0N;
        this.A09 = new C38363Gtz(new InterfaceC43408JFy() { // from class: X.IqV
            @Override // X.InterfaceC43408JFy
            public final void DeK(Refinement refinement, int i) {
                C42429IqW c42429IqW = C42429IqW.this;
                if (!refinement.equals(null)) {
                    C38934HCh c38934HCh = c42429IqW.A0A.A00;
                    Keyword keyword = refinement.A00.A02;
                    if (keyword != null) {
                        C38934HCh.A04(keyword, c38934HCh);
                    }
                }
                c42429IqW.A08.ClG(refinement, i);
            }
        }, new IEU(A0N, interfaceC43407JFx));
    }

    @Override // X.JIF
    public final String Arb() {
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.2oo, X.2oh] */
    @Override // X.JIF
    public final void D8R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.refinement_ribbon);
        this.A05 = viewGroup2;
        RecyclerView A0G = AbstractC31172DnG.A0G(viewGroup2, R.id.destination_hscroll);
        this.A02 = A0G;
        AbstractC38152GqJ.A01(A0G);
        this.A0C.A06(this.A02, C71163Hc.A00(this.A07));
    }
}
