package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IMs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41227IMs {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41588Iab A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;

    public C41227IMs(UserSession userSession, C41588Iab c41588Iab, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A03 = c75113Zb;
        this.A01 = c41588Iab;
        this.A02 = c38321qM;
        this.A00 = userSession;
    }

    public final void A00(Integer num, String str) {
        C41588Iab.A00(this.A01, num, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, str);
        this.A03.A2V = false;
    }

    public final void A01(Integer num, List list, int i, boolean z) {
        C38321qM c38321qM = this.A02;
        List A0Y = AbstractC37300Gc1.A0Y(c38321qM);
        C14360o3.A0C(A0Y, AbstractC111324zv.A00(4998));
        C15500q5.A02(A0Y).addAll(list);
        c38321qM.A44(null);
        c38321qM.A0C.EZH(Boolean.valueOf(z));
        AbstractC37301Gc2.A1O(this.A00, c38321qM);
        C41588Iab.A00(this.A01, num, "success", null);
        C11T.A02(new J5G(c38321qM, this.A03, i));
    }
}
