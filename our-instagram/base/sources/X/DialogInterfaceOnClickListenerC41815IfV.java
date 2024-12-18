package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41815IfV implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C41551w4 A03;
    public final /* synthetic */ C141596ac A04;
    public final /* synthetic */ C145176gc A05;
    public final /* synthetic */ String A06;

    public DialogInterfaceOnClickListenerC41815IfV(Context context, AbstractC59962oe abstractC59962oe, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, C145176gc c145176gc, String str) {
        this.A01 = abstractC59962oe;
        this.A05 = c145176gc;
        this.A06 = str;
        this.A03 = c41551w4;
        this.A04 = c141596ac;
        this.A00 = context;
        this.A02 = c41181vS;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C37484Gf2 c37484Gf2 = new C37484Gf2(34, this.A00, this.A02);
        AbstractC59962oe abstractC59962oe = this.A01;
        C61972ry c61972ry = new C61972ry(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), null);
        C145176gc c145176gc = this.A05;
        UserSession userSession = c145176gc.A09;
        if (userSession == null) {
            str = "userSession";
        } else {
            String str2 = this.A06;
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            AbstractC37301Gc2.A1M(A0c, "media/request_story_mention/", str2);
            AbstractC31173DnH.A1N(A0c);
            C1ON A0U = AbstractC31172DnG.A0U(A0c, true);
            A0U.A00 = c37484Gf2;
            c61972ry.schedule(A0U);
            C145826hf c145826hf = c145176gc.A0L;
            if (c145826hf == null) {
                str = "reelViewerLogger";
            } else {
                C41551w4 c41551w4 = this.A03;
                C141596ac c141596ac = this.A04;
                c145826hf.A0Q(c41551w4, "tap", AbstractC111324zv.A00(2713), c141596ac.A0B, c141596ac.A0A);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
