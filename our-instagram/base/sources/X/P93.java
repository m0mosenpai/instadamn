package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes9.dex */
public final class P93 implements GZN {
    public final /* synthetic */ C55908Orz A00;

    @Override // X.GZN
    public final void DlA(List list) {
        C14360o3.A0B(list, 0);
        C55908Orz c55908Orz = this.A00;
        boolean A1a = AbstractC166987dD.A1a(list.get(0));
        Context context = c55908Orz.A02;
        C121275eQ A02 = AbstractC50633MWu.A02(context, c55908Orz.A07, c55908Orz.A0A, C55908Orz.__redex_internal_original_name, true, A1a);
        A02.A00 = new C43922JbX(c55908Orz, 17);
        AbstractC63248Sg4.A02(c55908Orz.A04);
        C1GJ.A00(context, c55908Orz.A05, A02);
    }

    @Override // X.GZN
    public final void onCancel() {
    }

    public P93(C55908Orz c55908Orz) {
        this.A00 = c55908Orz;
    }
}
