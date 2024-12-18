package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.EZp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32665EZp extends AbstractRunnableC14200nk {
    public final /* synthetic */ C62862tP A00;
    public final /* synthetic */ C34523FJj A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32665EZp(C62862tP c62862tP, C34523FJj c34523FJj, String str) {
        super(58704531, 3, false, false);
        this.A01 = c34523FJj;
        this.A02 = str;
        this.A00 = c62862tP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34523FJj c34523FJj = this.A01;
        String str = this.A02;
        Context context = C1LZ.A00().A00;
        if (str.length() != 0) {
            C1XJ c1xj = C1XJ.A00;
            UserSession userSession = c34523FJj.A00;
            c1xj.A0g(context, userSession, str);
            C1XJ.A00.A0f(context, userSession, str);
        }
        C62862tP c62862tP = this.A00;
        Context context2 = C1LZ.A00().A00;
        C36026FvO c36026FvO = new C36026FvO(7);
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        new BitSet(0);
        FTe.A00(c36026FvO, "com.bloks.www.bloks.commerce.cart.globalstatepublish.async", A1G, A1G2).A00(context2, c62862tP);
        HashMap A1G3 = AbstractC166987dD.A1G();
        HashMap A0h = AbstractC31177DnL.A0h();
        A1G3.put("merchant_id", str);
        FTe.A00(c36026FvO, "com.bloks.www.bloks.commerce.cart.globalstatepublish.secondary.async", A1G3, A0h).A00(context2, c62862tP);
        HashMap A1G4 = AbstractC166987dD.A1G();
        HashMap A0h2 = AbstractC31177DnL.A0h();
        A1G4.put("merchant_id", str);
        A1G4.put("is_empty_cart", false);
        A1G4.put("is_one_page_cart", AbstractC166997dE.A0b());
        FTe.A00(c36026FvO, "com.bloks.www.bloks.commerce.cart.promotion.async", A1G4, A0h2).A00(context2, c62862tP);
    }
}
