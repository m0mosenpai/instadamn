package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;

/* loaded from: classes9.dex */
public final class NPZ extends AbstractC52333NDx {
    public final C8SF A00;
    public final JPS A01;
    public final N73 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NPZ(C8SF c8sf, JPS jps, N73 n73, InterfaceC153826vr interfaceC153826vr) {
        super(interfaceC153826vr);
        C14360o3.A0B(jps, 3);
        this.A00 = c8sf;
        this.A02 = n73;
        this.A01 = jps;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.media_kit_selectable_grid_item, viewGroup, false);
        AbstractC43593JPy.A1B(inflate, -2);
        return new C52511NLe(inflate);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52606NPb c52606NPb = (C52606NPb) interfaceC66482zP;
        HKN hkn = (HKN) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c52606NPb, hkn);
        ?? obj = new Object();
        C56051OuQ c56051OuQ = new C56051OuQ(0, hkn, obj);
        Medium medium = c52606NPb.A00.A00.A00;
        if (medium != null) {
            obj.A00 = A1R;
            this.A00.A04(medium, c56051OuQ);
        }
        ViewOnClickListenerC55465OkK.A01(((C38160GqR) hkn).A00, 64, c52606NPb, this);
        AbstractC40615HzZ.A00(hkn, c52606NPb, super.A01, super.A02, super.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52606NPb.class;
    }
}
