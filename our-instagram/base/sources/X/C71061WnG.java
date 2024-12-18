package X;

import com.instagram.business.promote.model.PendingLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import java.util.List;

/* renamed from: X.WnG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71061WnG implements XDS {
    public final /* synthetic */ C69341Vln A00;
    public final /* synthetic */ PromoteData A01;
    public final /* synthetic */ PromoteState A02;
    public final /* synthetic */ List A03;

    @Override // X.XDS
    public final /* synthetic */ void DC5() {
    }

    @Override // X.XDS
    public final /* synthetic */ void DCA() {
    }

    public C71061WnG(C69341Vln c69341Vln, PromoteData promoteData, PromoteState promoteState, List list) {
        this.A00 = c69341Vln;
        this.A02 = promoteState;
        this.A01 = promoteData;
        this.A03 = list;
    }

    @Override // X.XDS
    public final void Dbr(int i) {
        List list;
        IgFormField igFormField;
        int i2;
        C69341Vln c69341Vln = this.A00;
        String str = c69341Vln.A05;
        if ("budget_slider".equals(str)) {
            PromoteState promoteState = this.A02;
            PromoteData promoteData = this.A01;
            Object obj = promoteData.A1n.get(i);
            C14360o3.A07(obj);
            promoteState.A07(promoteData, ((Number) obj).intValue());
            UserSession userSession = promoteData.A0y;
            C14360o3.A06(userSession);
            if (WG1.A04(userSession) && C18U.A06(C06090Tz.A05, userSession, 36330136219501270L) && (igFormField = c69341Vln.A01) != null) {
                i2 = promoteData.A07 / promoteData.A06;
            } else {
                return;
            }
        } else {
            if ("duration_slider".equals(str)) {
                PromoteData promoteData2 = this.A01;
                if (!promoteData2.A2w) {
                    boolean isEmpty = promoteData2.A1o.isEmpty();
                    PromoteState promoteState2 = this.A02;
                    if (!isEmpty) {
                        list = promoteData2.A1o;
                    } else {
                        list = this.A03;
                    }
                    Object obj2 = list.get(i);
                    C14360o3.A07(obj2);
                    promoteState2.A08(promoteData2, ((Number) obj2).intValue());
                    UserSession userSession2 = promoteData2.A0y;
                    C14360o3.A06(userSession2);
                    if (!WG1.A04(userSession2) || !C18U.A06(C06090Tz.A05, userSession2, 36330136219566807L) || (igFormField = c69341Vln.A02) == null) {
                        return;
                    } else {
                        i2 = promoteData2.A0A;
                    }
                }
            }
            if (!"radius_slider".equals(str)) {
                return;
            }
            PromoteState promoteState3 = this.A02;
            PromoteData promoteData3 = this.A01;
            int A01 = AbstractC31176DnK.A01(WG3.A02, i);
            PendingLocation pendingLocation = promoteData3.A0o;
            if (A01 == pendingLocation.A00) {
                return;
            }
            pendingLocation.A00 = A01;
            PromoteState.A01(promoteState3, C05F.A0u);
            return;
        }
        igFormField.setTextProperty(String.valueOf(i2));
    }
}
