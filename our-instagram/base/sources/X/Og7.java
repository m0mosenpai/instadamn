package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class Og7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ InterfaceC58312Pt4 A03;
    public final /* synthetic */ C55909Os0 A04;

    public Og7(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, C41181vS c41181vS, InterfaceC58312Pt4 interfaceC58312Pt4, C55909Os0 c55909Os0) {
        this.A04 = c55909Os0;
        this.A03 = interfaceC58312Pt4;
        this.A02 = c41181vS;
        this.A00 = onDismissListener;
        this.A01 = interfaceC11380iw;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.UDB, X.0SG, X.N25] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        List BQh;
        C55909Os0 c55909Os0 = this.A04;
        CharSequence charSequence = C55909Os0.A0V(c55909Os0)[i];
        CharSequence charSequence2 = c55909Os0.A03;
        if (charSequence2 != null && charSequence2.equals(charSequence)) {
            this.A03.DKe();
            C18920wW c18920wW = c55909Os0.A0A;
            C14360o3.A0B(c18920wW, 0);
            AbstractC31175DnJ.A1N(c18920wW, "recommended_user_see_fewer_suggestions_tapped");
        } else if (MSY.A1U(c55909Os0.A05, charSequence, 2131972401)) {
            C41181vS c41181vS = this.A02;
            C105794pq c105794pq = c41181vS.A0D;
            C18C.A07(c105794pq, AbstractC111324zv.A00(43));
            if (c105794pq != null && (BQh = c105794pq.A00.BQh()) != null && BQh.size() == 1) {
                C55909Os0.A04(this.A00, this.A01, this.A03, c55909Os0);
            } else {
                InterfaceC11380iw interfaceC11380iw = this.A01;
                UserSession userSession = c55909Os0.A0B;
                DialogInterface.OnDismissListener onDismissListener = this.A00;
                InterfaceC58312Pt4 interfaceC58312Pt4 = this.A03;
                DialogInterface dialogInterface2 = C55909Os0.A0X;
                AbstractC167017dG.A1S(interfaceC58312Pt4, dialogInterface2);
                ?? udb = new UDB();
                udb.A04 = c41181vS;
                udb.A02 = interfaceC11380iw;
                udb.A03 = userSession;
                udb.A00 = onDismissListener;
                udb.A05 = interfaceC58312Pt4;
                udb.A01 = dialogInterface2;
                udb.A0B(c55909Os0.A07, "threads_in_stories_report_bottom_sheet");
            }
        }
        c55909Os0.A01 = null;
    }
}
