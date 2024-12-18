package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41816IfW implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C41592Iaf A04;
    public final /* synthetic */ JI5 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public DialogInterfaceOnClickListenerC41816IfW(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C38321qM c38321qM, C41592Iaf c41592Iaf, JI5 ji5, String str, String str2) {
        this.A04 = c41592Iaf;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = c38321qM;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A05 = ji5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C41592Iaf c41592Iaf = this.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41592Iaf.A01, "instagram_shopping_merchant_product_tag_removed");
        A0f.A9K("product_id", Long.valueOf(c41592Iaf.A00));
        A0f.AAK(C4SX.A00(c41592Iaf.A03), "merchant_id");
        AbstractC37301Gc2.A1B(A0f, c41592Iaf.A04);
        AbstractC37303Gc4.A0f(A0f, c41592Iaf.A02);
        A0f.Cht();
        String str = this.A07;
        String str2 = this.A06;
        C38321qM c38321qM = this.A03;
        UserSession userSession = this.A02;
        Context context = this.A00;
        AbstractC018607g abstractC018607g = this.A01;
        JI5 ji5 = this.A05;
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        String A38 = c38321qM.A38();
        if (A38 != null) {
            AbstractC31173DnH.A1Q(A0q, "commerce/media/%s/remove_product_tag_from_influencer/", new Object[]{A38});
            A0q.A05();
            A0q.A0R(N3N.class, C41349IRu.class);
            A0q.A9s("product_id", str);
            C1ON A0T = AbstractC31172DnG.A0T(A0q, "merchant_id", str2);
            A0T.A00 = new C39028HGe(context, c38321qM, ji5, str, 4);
            C1GJ.A00(context, abstractC018607g, A0T);
            dialogInterface.dismiss();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
