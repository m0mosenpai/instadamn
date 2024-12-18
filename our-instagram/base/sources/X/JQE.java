package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.appreciation.graphql.FetchAppreciationCreatorInsightsQueryResponseImpl;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class JQE extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQE(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = z;
        this.A00 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        boolean z;
        int i2;
        switch (this.A02) {
            case 0:
                JQE jqe = new JQE((C47702L4j) this.A03, interfaceC23621Ds, this.A01);
                jqe.A00 = obj;
                return jqe;
            case 1:
                obj4 = this.A03;
                z = this.A01;
                obj5 = this.A00;
                i2 = 1;
                return new JQE(obj4, obj5, interfaceC23621Ds, i2, z);
            case 2:
                obj2 = this.A03;
                obj3 = this.A00;
                i = 2;
                break;
            case 3:
                obj5 = this.A00;
                z = this.A01;
                obj4 = this.A03;
                i2 = 3;
                return new JQE(obj4, obj5, interfaceC23621Ds, i2, z);
            case 4:
                obj2 = this.A03;
                obj3 = this.A00;
                i = 4;
                break;
            case 5:
                obj4 = this.A03;
                obj5 = this.A00;
                z = this.A01;
                i2 = 5;
                return new JQE(obj4, obj5, interfaceC23621Ds, i2, z);
            default:
                obj4 = this.A03;
                obj5 = this.A00;
                z = this.A01;
                i2 = 6;
                return new JQE(obj4, obj5, interfaceC23621Ds, i2, z);
        }
        JQE jqe2 = new JQE(obj2, obj3, interfaceC23621Ds, i);
        jqe2.A01 = AbstractC166987dD.A1a(obj);
        return jqe2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C2JS c2js;
        ?? r7;
        Collection collection;
        ?? r1;
        FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings lifetimeEstimatedEarnings;
        C2JS A04;
        ImmutableList requiredCompactedTreeListField;
        ImmutableList optionalCompactedTreeListField;
        FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media.MediaGiftEarnings mediaGiftEarnings;
        String optionalStringField;
        Integer A0i;
        C2JS optionalTreeField;
        Object value;
        C5Hc A00;
        boolean z;
        boolean z2;
        InterfaceC50393MMv interfaceC50393MMv;
        Object value2;
        C51760Mtj c51760Mtj;
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                C2JS c2js2 = (C2JS) this.A00;
                C47702L4j c47702L4j = (C47702L4j) this.A03;
                C4OF c4of = C2JS.Companion;
                C2JS optionalTreeField2 = c2js2.getOptionalTreeField(0, "viewer", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.class, 317146606);
                if (optionalTreeField2 != null && (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.class, -507660251)) != null) {
                    c2js = optionalTreeField.getOptionalTreeField(0, "content_appreciation_insights", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.class, -1737055912);
                } else {
                    c2js = null;
                }
                if (this.A01) {
                    if (c2js != null && (optionalCompactedTreeListField = c2js.getOptionalCompactedTreeListField(1, "top_earning_content(session_id:$session_id,top_content_count:5)", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.class, -962291286)) != null) {
                        r7 = AbstractC166987dD.A1E();
                        Iterator it = optionalCompactedTreeListField.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media A0E = ((FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent) next).A0E();
                            if (A0E != null && (mediaGiftEarnings = (FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media.MediaGiftEarnings) A0E.getOptionalTreeField(3, "media_gift_earnings", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.TopEarningContent.Media.MediaGiftEarnings.class, 1942040202)) != null && (optionalStringField = mediaGiftEarnings.getOptionalStringField(1, "amount_with_offset")) != null && (A0i = AbstractC003100w.A0i(optionalStringField)) != null && A0i.intValue() > 0) {
                                r7.add(next);
                            }
                        }
                    }
                    r7 = C16930sl.A00;
                } else {
                    InterfaceC57806PkY interfaceC57806PkY = (InterfaceC57806PkY) c47702L4j.A03.getValue();
                    if (MU9.A01(interfaceC57806PkY, 1)) {
                        r7 = (List) ((C38688GzT) ((MU9) interfaceC57806PkY).A01).A00;
                    }
                    r7 = C16930sl.A00;
                }
                InterfaceC57806PkY interfaceC57806PkY2 = (InterfaceC57806PkY) c47702L4j.A03.getValue();
                if (MU9.A01(interfaceC57806PkY2, 1)) {
                    collection = (Collection) ((C38688GzT) ((MU9) interfaceC57806PkY2).A01).A02;
                } else {
                    collection = C16930sl.A00;
                }
                FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo pageInfo = null;
                if (c2js != null && (A04 = c2js.A04(FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.class, "monthly_metrics(before:$before_date,last:$count,session_id:$session_id)", -1275275814)) != null && (requiredCompactedTreeListField = A04.getRequiredCompactedTreeListField(0, "edges", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.Edges.class, -1186689805)) != null) {
                    r1 = AbstractC166987dD.A1E();
                    Iterator it2 = requiredCompactedTreeListField.iterator();
                    while (it2.hasNext()) {
                        C2JS optionalTreeField3 = ((C2JS) it2.next()).getOptionalTreeField(0, "node", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.Edges.Node.class, 1191000141);
                        if (optionalTreeField3 != null) {
                            r1.add(optionalTreeField3);
                        }
                    }
                } else {
                    r1 = C16930sl.A00;
                }
                ArrayList A0S = AbstractC001800i.A0S(r1, collection);
                if (c2js != null) {
                    lifetimeEstimatedEarnings = (FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings) c2js.getOptionalTreeField(0, "lifetime_estimated_earnings(session_id:$session_id)", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.LifetimeEstimatedEarnings.class, 2086930639);
                    C2JS A042 = c2js.A04(FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.class, "monthly_metrics(before:$before_date,last:$count,session_id:$session_id)", -1275275814);
                    if (A042 != null) {
                        pageInfo = (FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo) A042.getOptionalTreeField(1, "page_info", FetchAppreciationCreatorInsightsQueryResponseImpl.Viewer.User.ContentAppreciationInsights.MonthlyMetrics.PageInfo.class, -2144576818);
                    }
                } else {
                    lifetimeEstimatedEarnings = null;
                }
                return new C38688GzT(lifetimeEstimatedEarnings, pageInfo, (List) r7, A0S);
            case 1:
                AbstractC09560e7.A00(obj);
                C44461JlT c44461JlT = (C44461JlT) this.A03;
                C05A c05a = c44461JlT.A05;
                boolean z3 = this.A01;
                C41121vL c41121vL = (C41121vL) this.A00;
                do {
                    value = c05a.getValue();
                    C50726MaR c50726MaR = (C50726MaR) value;
                    A00 = C44461JlT.A00(c44461JlT, AbstractC001800i.A0U(c41121vL.A00.values()), z3);
                    z = c50726MaR.A04;
                    z2 = c50726MaR.A03;
                    interfaceC50393MMv = (InterfaceC50393MMv) c50726MaR.A01;
                    C14360o3.A0B(interfaceC50393MMv, 3);
                    C14360o3.A0B(A00, 4);
                } while (!c05a.AIi(value, new C50726MaR(interfaceC50393MMv, A00, z, z3, z2)));
                return C0eB.A00;
            case 2:
                AbstractC09560e7.A00(obj);
                boolean z4 = this.A01;
                C25325BIu c25325BIu = (C25325BIu) this.A03;
                MRC mrc = (MRC) this.A00;
                c25325BIu.A00.A01(mrc.B6n(), mrc.BM2(), mrc.getItemCount() - 1, !z4);
                return C0eB.A00;
            case 3:
                AbstractC09560e7.A00(obj);
                User user = (User) this.A00;
                user.A11(this.A01);
                AbstractC25651Mw.A00(((C27259C1c) this.A03).A00).E4s(new C70063Cq(user, false, false, true, false));
                return C0eB.A00;
            case 4:
                AbstractC09560e7.A00(obj);
                if (!this.A01) {
                    C05A c05a2 = ((C44480Jlm) this.A03).A01;
                    QJ0 qj0 = (QJ0) this.A00;
                    do {
                        value2 = c05a2.getValue();
                        c51760Mtj = (C51760Mtj) value2;
                    } while (!c05a2.AIi(value2, C51760Mtj.A01(qj0, (List) c51760Mtj.A02, (List) c51760Mtj.A01)));
                }
                return C0eB.A00;
            case 5:
                AbstractC09560e7.A00(obj);
                C1X6.A02((C1X6) this.A03, (C61922rt) this.A00, this.A01);
                return C0eB.A00;
            default:
                AbstractC09560e7.A00(obj);
                C93864Jw c93864Jw = (C93864Jw) this.A03;
                C1WO c1wo = c93864Jw.A02;
                UserSession userSession = c93864Jw.A01;
                byte[] bArr = (byte[]) this.A00;
                boolean z5 = this.A01;
                AbstractC167017dG.A1N(userSession, bArr);
                c1wo.A00.A05.A0G(userSession, bArr, 4, z5);
                return C0eB.A00;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((JQE) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQE(C47702L4j c47702L4j, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A03 = c47702L4j;
        this.A01 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JQE(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = obj2;
    }
}
