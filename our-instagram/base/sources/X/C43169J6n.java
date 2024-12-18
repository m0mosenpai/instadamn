package X;

import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.taggingfeed.SourceType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.J6n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43169J6n extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43169J6n(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = 1;
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = z;
        this.A00 = interfaceC11380iw;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        boolean z;
        int i;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 0;
                C43169J6n c43169J6n = new C43169J6n(obj2, str, interfaceC23621Ds, i, z);
                c43169J6n.A00 = obj;
                return c43169J6n;
            case 1:
                return new C43169J6n((InterfaceC11380iw) this.A00, (UserSession) this.A02, this.A03, interfaceC23621Ds, this.A04);
            default:
                obj2 = this.A02;
                str = this.A03;
                z = this.A04;
                i = 2;
                C43169J6n c43169J6n2 = new C43169J6n(obj2, str, interfaceC23621Ds, i, z);
                c43169J6n2.A00 = obj;
                return c43169J6n2;
        }
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        C1YP c1yp;
        AbstractC29601bb abstractC29601bb;
        InterfaceC37561ot acquire;
        String str2;
        C4SX c4sx;
        switch (this.A01) {
            case 0:
                AbstractC09560e7.A00(obj);
                SecurityAlertLocalDataSource securityAlertLocalDataSource = (SecurityAlertLocalDataSource) this.A02;
                String str3 = this.A03;
                boolean z = this.A04;
                try {
                    InterfaceC50511MRo A01 = securityAlertLocalDataSource.A02.A01();
                    boolean A1M = AbstractC167007dF.A1M(z ? 1 : 0);
                    C49276LqW c49276LqW = (C49276LqW) A01;
                    c1yp = c49276LqW.A02;
                    c1yp.assertNotSuspendingTransaction();
                    abstractC29601bb = c49276LqW.A04;
                    acquire = abstractC29601bb.acquire();
                    acquire.ADi(1, A1M ? 1L : 0L);
                    acquire.ADp(2, str3);
                    try {
                        c1yp.beginTransaction();
                    } catch (Throwable th) {
                        abstractC29601bb.release(acquire);
                        throw th;
                    }
                } catch (Throwable th2) {
                    obj2 = new C09540e5(th2);
                }
                try {
                    acquire.ATb();
                    c1yp.setTransactionSuccessful();
                    abstractC29601bb.release(acquire);
                    obj2 = C0eB.A00;
                    boolean z2 = !(obj2 instanceof C09540e5);
                    securityAlertLocalDataSource.A03.F8m("setIsConfirmedPeerDeviceChangeAlert");
                    return Boolean.valueOf(z2);
                } finally {
                    c1yp.endTransaction();
                }
            case 1:
                AbstractC09560e7.A00(obj);
                UserSession userSession = (UserSession) this.A02;
                String str4 = this.A03;
                boolean A05 = C2TN.A05(userSession, str4);
                if (this.A04) {
                    if (A05) {
                        str = "opal_self_profile";
                    } else {
                        str = "opal_profile";
                    }
                } else if (A05) {
                    str = AbstractC111324zv.A00(5274);
                } else {
                    str = "profile";
                }
                AbstractC34277F9x.A00((InterfaceC11380iw) this.A00, userSession, "impression", AbstractC111324zv.A00(491), str, str4, null);
                break;
            default:
                AbstractC09560e7.A00(obj);
                MU9 mu9 = (MU9) this.A00;
                C41691IdK c41691IdK = (C41691IdK) this.A02;
                String str5 = this.A03;
                boolean z3 = this.A04;
                C41691IdK.A01(c41691IdK, str5, new DHP(25, mu9, z3));
                C41234IMz c41234IMz = c41691IdK.A03;
                C38892HAo c38892HAo = (C38892HAo) mu9.A01;
                C14360o3.A0B(c38892HAo, 0);
                List list = c38892HAo.A02;
                if (list != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj3 : list) {
                        if (((C38619GyM) obj3).A02 == ProductTaggingFeedComponentType.A05) {
                            A1E.add(obj3);
                        }
                    }
                    int size = A1E.size();
                    C14360o3.A0B(str5, 1);
                    ShoppingTaggingFeedArguments shoppingTaggingFeedArguments = c41234IMz.A02;
                    C38685GzQ c38685GzQ = c38892HAo.A00;
                    if (c38685GzQ != null) {
                        C38686GzR c38686GzR = (C38686GzR) c38685GzQ.A01;
                        InterfaceC02590Ai A00 = AbstractC37305Gc6.A00(AbstractC37300Gc1.A0C(c41234IMz.A03), shoppingTaggingFeedArguments, "instagram_shopping_product_tagging_feed_load_success");
                        C38686GzR.A00(A00, c38686GzR);
                        A00.A7v("is_initial_load", Boolean.valueOf(z3));
                        A00.A9K("result_count", AbstractC31171DnF.A0V(size));
                        A00.A7v("has_more_results", Boolean.valueOf(c38892HAo.A03));
                        A00.AAk("displayed_section_groups", (List) c38686GzR.A00);
                        String str6 = c38686GzR.A02;
                        if (str6 != null) {
                            c4sx = new C4SX(Long.valueOf(AbstractC167027dH.A03(str6)));
                        } else {
                            c4sx = null;
                        }
                        A00.AAK(c4sx, "merchant_id");
                        A00.AAP("search_text", str5);
                        A00.AAQ((C0Zx) c41234IMz.A04.getValue(), "suggested_tags_info");
                        AbstractC37304Gc5.A14(A00, shoppingTaggingFeedArguments);
                        if (z3) {
                            C42346Ip8 A002 = I6K.A00(c41691IdK.A02);
                            C38685GzQ c38685GzQ2 = c38892HAo.A00;
                            if (c38685GzQ2 != null) {
                                A002.A04(null, null, ((SourceType) ((C38686GzR) c38685GzQ2.A01).A01).A00, null, null, false);
                                break;
                            }
                        }
                    }
                    str2 = "meta";
                } else {
                    str2 = "feed";
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43169J6n) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43169J6n(Object obj, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = z;
    }
}
