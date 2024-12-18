package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.List;

/* loaded from: classes6.dex */
public final class E02 extends C2UU {
    public final UserSession A00;
    public final InterfaceC16660sJ A04;
    public final List A01 = AbstractC166987dD.A1E();
    public final C19270xB A03 = AbstractC31171DnF.A0D("direct_recipients_pogs_adapter");
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37054GUk(this, 22));

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        DirectShareTarget directShareTarget;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof E3W) && (directShareTarget = (DirectShareTarget) AbstractC001800i.A0O(this.A01, i)) != null) {
            E3W e3w = (E3W) c3oo;
            PendingRecipient pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(AbstractC31175DnJ.A0f(directShareTarget));
            if (pendingRecipient != null) {
                e3w.A03.A04(pendingRecipient.A03, e3w.A02);
                e3w.A01.setText(AbstractC101904i3.A03(directShareTarget, e3w.A04));
                FpQ.A01(e3w.A00, 59, e3w, directShareTarget);
            }
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        AnonymousClass172 anonymousClass172 = (AnonymousClass172) this.A02.getValue();
        return new E3W(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.direct_recipient_pog, false), this.A03, anonymousClass172, this.A04);
    }

    public E02(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        this.A00 = userSession;
        this.A04 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-304813874);
        int size = this.A01.size();
        C0f9.A0A(-314365021, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int i2;
        List A18;
        PendingRecipient pendingRecipient;
        Long A0j;
        int A03 = C0f9.A03(1363029818);
        DirectShareTarget directShareTarget = (DirectShareTarget) AbstractC001800i.A0O(this.A01, i);
        long j = 0;
        if (directShareTarget != null && (A18 = AbstractC31172DnG.A18(directShareTarget)) != null && (pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(A18)) != null) {
            String str = pendingRecipient.A0B;
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                j = A0j.longValue();
            }
            i2 = -1139738791;
        } else {
            i2 = 1615489647;
        }
        C0f9.A0A(i2, A03);
        return j;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-674672279, C0f9.A03(2071250855));
        return 1;
    }
}
