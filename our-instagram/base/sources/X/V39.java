package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.hashtag.HashtagImpl;

/* loaded from: classes11.dex */
public final class V39 extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final XLQ A03;
    public final InterfaceC72020XFi A04;

    public V39(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, XLQ xlq, InterfaceC72020XFi interfaceC72020XFi) {
        C14360o3.A0B(interfaceC72020XFi, 5);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A03 = xlq;
        this.A04 = interfaceC72020XFi;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1735264627);
        C14360o3.A0B(view, 1);
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.search.common.model.SearchItemState");
        Tx0 tx0 = (Tx0) obj2;
        UserSession userSession = this.A02;
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.search.common.model.HashtagSearchEntry");
        C68090V9z c68090V9z = (C68090V9z) obj;
        XLQ xlq = this.A03;
        InterfaceC72020XFi interfaceC72020XFi = this.A04;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.HashtagRowViewBinder.Holder");
        C69652Vst c69652Vst = (C69652Vst) tag;
        boolean A1M = AbstractC167007dF.A1M(tx0.A0F ? 1 : 0);
        C14360o3.A0B(userSession, 0);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323350171102393L);
        AbstractC25233BEq.A0v(1, context, interfaceC11380iw, c68090V9z);
        C14360o3.A0B(c69652Vst, 7);
        HashtagImpl hashtagImpl = c68090V9z.A00;
        ImageView imageView = c69652Vst.A04;
        C70182WFk.A01(context, imageView, interfaceC11380iw, hashtagImpl, !AbstractC167007dF.A1T(hashtagImpl.A07));
        C70182WFk.A02(imageView);
        if (xlq != null) {
            WNX.A00(c69652Vst.A02, xlq, tx0, c68090V9z, 50);
        }
        if (interfaceC72020XFi != null) {
            interfaceC72020XFi.EDz(c69652Vst.A02, c68090V9z, tx0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC13670mt.A06("#%s", hashtagImpl.A0D));
        AbstractC85513rg.A00(userSession).A01(spannableStringBuilder);
        c69652Vst.A05.setText(spannableStringBuilder);
        C70182WFk.A03(hashtagImpl, tx0, c69652Vst, A06, false);
        IgSimpleImageView A00 = c69652Vst.A00();
        if (xlq != null && A00 != null) {
            AbstractC66169U2k.A00(null, A00, c68090V9z, tx0, xlq, A1M);
        }
        C0f9.A0A(2092773447, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 874118497);
        View A00 = C70182WFk.A00(this.A00, viewGroup);
        C0f9.A0A(-1214527678, A0G);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
