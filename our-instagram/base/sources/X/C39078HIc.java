package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.HIc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39078HIc extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final JPm A03;
    public final Integer A04;

    public C39078HIc(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPm jPm, Integer num) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = jPm;
        this.A04 = num;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42335Iox c42335Iox = (C42335Iox) interfaceC66482zP;
        C38441GvO c38441GvO = (C38441GvO) c3oo;
        AbstractC167007dF.A1K(c42335Iox, c38441GvO);
        IS8.A01(this.A00, this.A01, this.A02, c38441GvO, this.A03, null, c42335Iox, this.A04, null, c42335Iox.A00, false);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(layoutInflater, 1);
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        return AbstractC37300Gc1.A03(IS8.A00(context).getTag(), "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productfeed.ProductFeedGridRowViewBinder.Holder");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42335Iox.class;
    }
}
