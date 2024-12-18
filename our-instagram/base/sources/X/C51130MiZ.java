package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.MiZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51130MiZ extends C2UU {
    public List A00 = C16930sl.A00;
    public final InterfaceC11380iw A01;
    public final String A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C14360o3.A0B(c3oo, 0);
        Object obj = this.A00.get(i);
        if (MUW.A02(obj, 6)) {
            obj = (C50679MYx) ((MUW) obj).A01;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.ThemedImageURL");
        C50679MYx c50679MYx = (C50679MYx) obj;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(c50679MYx, 0);
        if (AbstractC72723Nt.A00(AbstractC31172DnG.A05(c3oo))) {
            str = c50679MYx.A00;
        } else {
            str = c50679MYx.A01;
        }
        AbstractC25235BEs.A1I(interfaceC11380iw, AbstractC167007dF.A0T(c3oo.itemView, R.id.image), str);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        boolean A0K = C14360o3.A0K(this.A02, "insights");
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        int i3 = R.layout.value_props_monetization_h_scroll_card;
        if (A0K) {
            i3 = R.layout.value_props_insights_h_scroll_card;
        }
        return new C3OO(AbstractC25226BEj.A0R(A0P, viewGroup, i3, false));
    }

    public C51130MiZ(String str, InterfaceC11380iw interfaceC11380iw) {
        this.A02 = str;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(312805426);
        int size = this.A00.size();
        C0f9.A0A(1979494799, A03);
        return size;
    }
}
