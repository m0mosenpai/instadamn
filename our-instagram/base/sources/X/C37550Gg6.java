package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Gg6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37550Gg6 extends AbstractC1337162c {
    public final JPb A00;
    public final C25348BJr A01;

    @Override // X.AbstractC1337262d
    public final boolean A02() {
        return false;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.immersive_catch_up_completed_item_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C27344C4z.class;
    }

    public C37550Gg6(JPb jPb, C25348BJr c25348BJr) {
        super(jPb, c25348BJr);
        this.A01 = c25348BJr;
        this.A00 = jPb;
    }

    @Override // X.AbstractC1337162c
    public final /* bridge */ /* synthetic */ void A03(C3OO c3oo, C62a c62a) {
    }
}
