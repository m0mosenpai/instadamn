package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.List;

/* renamed from: X.FbP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34992FbP {
    public static final C34992FbP A00 = new Object();

    public final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, List list, int i) {
        double A002 = AbstractC31177DnL.A00(abstractC12990ll);
        double A003 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_aymh_account_disambiguation_outcome");
        AbstractC31179DnN.A15(A0f);
        AbstractC31177DnL.A1B(A0f, A002, A003);
        A0f.AAk(AbstractC43591JPw.A00(735), list);
        A0f.A9K("size", AbstractC31171DnF.A0V(list.size()));
        A0f.AAP("account_attempted", str2);
        A0f.AAP("outcome", str3);
        A0f.A9K("attempt_order", AbstractC31171DnF.A0V(i));
        AbstractC31177DnL.A1G(A0f, "error", str4, A003);
        AbstractC35274Fh9.A0D(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A0f.Cht();
    }
}
