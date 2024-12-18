package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.KDk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45519KDk extends AbstractC43842Ja5 implements InterfaceC60122ou, InterfaceC37145GYg {
    public static final String __redex_internal_original_name = "BrandedContentSeeAllListFragment";
    public List A01 = C16930sl.A00;
    public String A00 = "unknown";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37145GYg
    public final /* synthetic */ void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        C193328hC A0O;
        int i;
        int i2;
        C14360o3.A0B(user, 0);
        if (user.A03.Afn() == BrandedContentBrandTaggingRequestApprovalStatus.A07) {
            A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131972184);
            A0O.A09(2131972183);
            i = 2131972202;
            i2 = 3;
        } else {
            if (user.A03.AcS() != BrandedContentBrandTaggingRequestApprovalStatus.A08) {
                return;
            }
            A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131954178);
            A0O.A09(2131954177);
            i = 2131954176;
            i2 = 4;
        }
        A0O.A0L(new DialogInterfaceOnClickListenerC48021LMq(i2, user, this), i);
        A0O.A0Q(null, EnumC193348hE.A04, 2131954179);
        AbstractC166987dD.A1W(A0O);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        String str = this.A00;
        if (C14360o3.A0K(str, "approve_creators")) {
            i = 2131953125;
        } else {
            if (C14360o3.A0K(str, "request_approvals")) {
                i = 2131954193;
            }
            interfaceC56362iU.EkS(true);
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e A[LOOP:0: B:6:0x0038->B:8:0x003e, LOOP_END] */
    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r11 = 0
            X.C14360o3.A0B(r14, r11)
            super.onViewCreated(r14, r15)
            r0 = 2131440847(0x7f0b34cf, float:1.8503689E38)
            X.AbstractC31176DnK.A1D(r14, r0)
            r0 = 2131431456(0x7f0b1020, float:1.8484642E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r14, r0)
            r2.setVisibility(r11)
            java.lang.String r1 = r13.A00
            java.lang.String r0 = "approve_creators"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L58
            r0 = 2131953124(0x7f1305e4, float:1.954271E38)
            X.AbstractC25227BEk.A12(r2, r13, r0)
            r0 = 2131953113(0x7f1305d9, float:1.9542688E38)
        L2a:
            java.lang.String r3 = r13.getString(r0)
        L2e:
            java.util.List r0 = r13.A01
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L38:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r8 = r1.next()
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            java.lang.Integer r9 = X.C05F.A0N
            X.BQO r5 = X.MVZ.A00(r3)
            r6 = 0
            r12 = 1
            r10 = 1784(0x6f8, float:2.5E-42)
            X.E8p r4 = new X.E8p
            r7 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.add(r4)
            goto L38
        L58:
            java.lang.String r0 = "request_approvals"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L6a
            r0 = 2131954192(0x7f130a10, float:1.9544876E38)
            X.AbstractC25227BEk.A12(r2, r13, r0)
            r0 = 2131969455(0x7f1345af, float:1.9575833E38)
            goto L2a
        L6a:
            java.lang.String r3 = ""
            goto L2e
        L6d:
            r13.A0B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45519KDk.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C45519KDk c45519KDk, Integer num, String str) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(c45519KDk, AbstractC166987dD.A0o(c45519KDk.A02)), "ig_branded_content_allowlisted_accounts_action_complete");
        A0f.A9K("creator_ig_id", AbstractC25228BEl.A13(str));
        A0f.A9K(TraceFieldType.ErrorCode, AbstractC25234BEr.A0X(A0f, num, "action", "remove"));
        A0f.Cht();
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EXW(this, this, this, AbstractC166987dD.A0r(this.A02)));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(MJH.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }
}
