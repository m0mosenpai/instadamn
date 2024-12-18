package X;

import androidx.paging.PagingDataAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GRX implements InterfaceC09250da, InterfaceC16660sJ {
    public boolean A00;
    public final int A01;
    public final Object A02;

    public GRX(C32324ELs c32324ELs, int i, boolean z) {
        this.A01 = i;
        this.A02 = c32324ELs;
        this.A00 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgdsButton igdsButton;
        switch (this.A01) {
            case 0:
                C54830OLp c54830OLp = (C54830OLp) obj;
                C14360o3.A0B(c54830OLp, 0);
                if (this.A00) {
                    this.A00 = false;
                    break;
                } else if (c54830OLp.A04.A02 instanceof C51057MhB) {
                    PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A02;
                    if (pagingDataAdapter.mStateRestorationPolicy == EnumC65362xY.PREVENT && !pagingDataAdapter.A00) {
                        pagingDataAdapter.setStateRestorationPolicy(EnumC65362xY.ALLOW);
                    }
                    pagingDataAdapter.A01.A01.A04.A00.remove(this);
                    break;
                }
                break;
            case 1:
                C32324ELs c32324ELs = (C32324ELs) this.A02;
                boolean z = this.A00;
                C43707JUs c43707JUs = (C43707JUs) obj;
                String str = c43707JUs.A1K;
                if (z) {
                    C32324ELs.A0C(c32324ELs, str, true);
                    C32324ELs.A0A(c32324ELs, c43707JUs);
                    break;
                } else {
                    C32324ELs.A0C(c32324ELs, str, true);
                    if (c32324ELs.A0J == null || c32324ELs.A0K == null) {
                        C32324ELs.A0A(c32324ELs, c43707JUs);
                    }
                    AbstractC31171DnF.A1L(c32324ELs);
                    UserSession userSession = c32324ELs.A04;
                    EVU evu = c32324ELs.A0A;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = evu.A0N().iterator();
                    while (it.hasNext()) {
                        DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                        if (A0m.A0P == null) {
                            A1E.add(((PendingRecipient) AbstractC166987dD.A16(AbstractC31172DnG.A18(A0m))).getId());
                        }
                    }
                    EVU evu2 = c32324ELs.A0A;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it2 = evu2.A0N().iterator();
                    while (it2.hasNext()) {
                        DirectShareTarget A0m2 = AbstractC31172DnG.A0m(it2);
                        if (A0m2.A0I()) {
                            A1E2.add(A0m2.A0L);
                        }
                    }
                    C1ON A0E = DirectThreadApi.A0E(userSession, c43707JUs.A1E, A1E, A1E2);
                    UserSession userSession2 = c32324ELs.A04;
                    C14360o3.A0B(userSession2, 0);
                    ((FPW) userSession2.A01(FPW.class, new C37055GUl(userSession2, 42))).A00(A0E, new GRT(2, c43707JUs, c32324ELs), new GRT(3, c43707JUs, c32324ELs));
                    break;
                }
                break;
            default:
                C32324ELs c32324ELs2 = (C32324ELs) this.A02;
                boolean z2 = this.A00;
                if (z2) {
                    C36299Fzu c36299Fzu = c32324ELs2.A09;
                    if (c36299Fzu != null) {
                        C34628FNl A00 = C32324ELs.A00(c32324ELs2);
                        C25531Mh A002 = C36299Fzu.A00(c36299Fzu);
                        if (AbstractC25226BEj.A1Z(A002)) {
                            C36299Fzu.A04(A002, c36299Fzu);
                            AbstractC31174DnI.A1J(A002, "thread_create_error");
                            A002.A0o("direct_invite_skip_button");
                            C36299Fzu.A05(A002, c36299Fzu, "invite_people");
                            A002.A0v(C36299Fzu.A03(A00, c36299Fzu));
                            A002.Cht();
                        }
                    }
                } else {
                    C32324ELs.A0C(c32324ELs2, null, false);
                }
                IgdsButton igdsButton2 = c32324ELs2.A0E;
                if (igdsButton2 != null && c32324ELs2.A0D != null) {
                    igdsButton2.setEnabled(true);
                    c32324ELs2.A0D.setEnabled(true);
                }
                if (z2) {
                    igdsButton = c32324ELs2.A0E;
                } else {
                    igdsButton = c32324ELs2.A0D;
                }
                if (igdsButton != null) {
                    igdsButton.setLoading(false);
                }
                C0K8.A0C(C32324ELs.__redex_internal_original_name, "Creation of social channel flow api has failed");
                break;
        }
        return C0eB.A00;
    }

    public GRX(PagingDataAdapter pagingDataAdapter) {
        this.A01 = 0;
        this.A02 = pagingDataAdapter;
        this.A00 = true;
    }
}
