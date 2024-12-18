package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.HashMap;

/* renamed from: X.BxQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27101BxQ extends AnonymousClass358 {
    public final C27941CTa A00;
    public final C18920wW A01;
    public final java.util.Set A02;
    public final /* synthetic */ CST A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27101BxQ(CST cst, C18920wW c18920wW, long j) {
        super(j);
        this.A03 = cst;
        this.A01 = c18920wW;
        this.A02 = AbstractC166987dD.A1H();
        this.A00 = new C27941CTa(c18920wW);
    }

    @Override // X.AnonymousClass358
    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        String str;
        String str2;
        C38321qM BQN;
        C38321qM BQN2;
        C84923qg c84923qg = (C84923qg) obj;
        C14360o3.A0B(c84923qg, 0);
        if (!c84923qg.A02() && c84923qg.A06 == EnumC84933qh.A09) {
            java.util.Set set = this.A02;
            if (!set.contains(c84923qg.A0G) && (str = c84923qg.A0G) != null && str.length() != 0) {
                set.add(str);
                C5FP c5fp = c84923qg.A0X;
                if (c5fp != null && (BQN = c5fp.BQN()) != null && BQN.A5P() && (BQN2 = c5fp.BQN()) != null) {
                    this.A00.A00(BQN2);
                }
                if (CommentRestrictStatus.A05 == c84923qg.A0U) {
                    C18920wW c18920wW = this.A01;
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("nav_chain", AbstractC25225BEi.A14());
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4635));
                    A0f.AAP("action", "impression");
                    A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "pending_comment");
                    A0f.AAP("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                    A0f.A9M("extra_values", A1G);
                    Long A00 = C75R.A00(AbstractC25231BEo.A0t(c84923qg.A08));
                    if (A00 != null) {
                        A0f.A9K(AbstractC111324zv.A00(3839), A00);
                    }
                    Long A002 = C75R.A00(c84923qg.A0G);
                    if (A002 != null) {
                        A0f.A9K("comment_id", A002);
                    }
                    Long A003 = C75R.A00(c84923qg.A0F);
                    if (A003 != null) {
                        A0f.A9K(AbstractC111324zv.A00(5040), A003);
                    }
                    C38321qM c38321qM = c84923qg.A07;
                    if (c38321qM != null) {
                        str2 = c38321qM.A38();
                    } else {
                        str2 = null;
                    }
                    Long A004 = C75R.A00(str2);
                    if (A004 != null) {
                        A0f.A9K("parent_media_id", A004);
                    }
                    A0f.Cht();
                }
            }
        }
    }
}
