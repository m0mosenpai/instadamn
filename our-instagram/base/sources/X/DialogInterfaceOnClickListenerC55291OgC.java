package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.core.app.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OgC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55291OgC implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public DialogInterfaceOnClickListenerC55291OgC(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A06 = str;
        this.A01 = obj;
        this.A03 = obj5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                List list = (List) this.A03;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(new PendingRecipient(AbstractC25226BEj.A15(it)));
                }
                C83693oE c83693oE = new C83693oE(this.A06);
                C7T2 c7t2 = (C7T2) this.A04;
                Context context = (Context) this.A01;
                UserSession userSession = (UserSession) this.A05;
                DirectShareTarget directShareTarget = new DirectShareTarget(c83693oE, c7t2.C7m(context, userSession), A0q, true);
                C56139Ovz A01 = MWJ.A01(((AbstractC27671Vv) this.A02).A00(context, userSession).A06);
                if (A01 != null) {
                    C55207OeK c55207OeK = A01.A09.A0Z;
                    List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                    ArrayList A10 = AbstractC31174DnI.A10(unmodifiableList);
                    Iterator it2 = unmodifiableList.iterator();
                    while (it2.hasNext()) {
                        String valueOf = String.valueOf(((PendingRecipient) it2.next()).A08);
                        if (valueOf != null) {
                            A10.add(valueOf);
                        }
                    }
                    C14360o3.A0B(A10, 0);
                    C55207OeK.A02(c55207OeK, new BQB(18, c55207OeK, A10, true));
                }
                dialogInterface.dismiss();
                return;
            case 1:
                ((C47Z) this.A03).A3k = null;
                C55908Orz c55908Orz = (C55908Orz) this.A05;
                Activity activity = c55908Orz.A01;
                UserSession userSession2 = c55908Orz.A07;
                AbstractC54129NwR.A00(activity, userSession2, (C105814ps) this.A02, (Reel) this.A04);
                C9GR.A07(activity, 2131954765);
                ((StoryDraftsCreationViewModel) MSW.A0F(new C8CG(activity, (InterfaceC11380iw) this.A01, userSession2), c55908Orz.A03).A00(StoryDraftsCreationViewModel.class)).A03(this.A06);
                return;
            default:
                C57312k6 A00 = C07Y.A00((ComponentActivity) this.A02);
                UserSession userSession3 = (UserSession) this.A05;
                C57157PZb.A01(this.A03, userSession3, A00, 19);
                InterfaceC11380iw interfaceC11380iw = AbstractC206099Aq.A00;
                C65761Ttc A002 = FDN.A00(interfaceC11380iw, userSession3);
                C69436VnL A03 = ((C71603Jf) this.A04).A03(0L);
                String str = this.A06;
                C65761Ttc.A02(A002, A03, "ig_quiet_mode_upsell_enable_flow_dialog_turn_on", str);
                Context context2 = (Context) this.A01;
                AbstractC166987dD.A10(userSession3).A1A(true);
                C9GR.A07(context2, 2131971420);
                C65761Ttc.A02(FDN.A00(interfaceC11380iw, userSession3), new C71603Jf(userSession3).A03(0L), "ig_quiet_mode_enable_flow_toast_shown", str);
                return;
        }
    }
}
