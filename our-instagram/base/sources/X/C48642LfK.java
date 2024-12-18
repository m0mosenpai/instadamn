package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.LfK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48642LfK implements InterfaceC58169PqZ {
    public View A00;
    public RecyclerView A01;
    public final UserSession A02;
    public final C47705L4m A03;
    public final C52467NJl A04;
    public final C81X A05;
    public final AbstractC59962oe A06;

    public C48642LfK(AbstractC59962oe abstractC59962oe, UserSession userSession, C47705L4m c47705L4m, C52467NJl c52467NJl) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, c47705L4m, c52467NJl);
        this.A06 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = c47705L4m;
        this.A04 = c52467NJl;
        this.A05 = C81X.A1d;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        String str = "musicSuggestionsRecyclerView";
        if (!IRU.A01(SoundPlatformProduct.A0F, this.A02)) {
            C47705L4m c47705L4m = this.A03;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                c47705L4m.A07.invoke(new M3Z(recyclerView, c47705L4m));
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C47705L4m c47705L4m2 = this.A03;
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            InterfaceC16660sJ interfaceC16660sJ = c47705L4m2.A07;
            interfaceC16660sJ.invoke(new M3Y(recyclerView2, c47705L4m2));
            View view = this.A00;
            if (view == null) {
                str = "musicRowView";
            } else {
                RecyclerView recyclerView3 = this.A01;
                if (recyclerView3 != null) {
                    interfaceC16660sJ.invoke(new M5F(view, recyclerView3, c47705L4m2));
                    AbstractC59962oe abstractC59962oe = this.A06;
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(new C57173PZr(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 20), C07Y.A00(viewLifecycleOwner));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        String str;
        Context requireContext = this.A06.requireContext();
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setOrientation(1);
        AbstractC31174DnI.A1D(linearLayout, -1, -2);
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.add_music_row, (ViewGroup) linearLayout, false);
        this.A00 = inflate;
        if (inflate == null) {
            str = "musicRowView";
        } else {
            linearLayout.addView(inflate);
            View inflate2 = LayoutInflater.from(requireContext).inflate(R.layout.add_music_suggestions, (ViewGroup) linearLayout, false);
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) inflate2;
            this.A01 = recyclerView;
            if (recyclerView == null) {
                str = "musicSuggestionsRecyclerView";
            } else {
                linearLayout.addView(recyclerView);
                return linearLayout;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A05;
    }
}
