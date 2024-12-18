package X;

import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ip8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42346Ip8 implements InterfaceC13000lm {
    public Map A00;
    public final C1QT A01;
    public final UserSession A02;

    public C42346Ip8(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C1QS.A00(userSession);
        this.A00 = AbstractC06930Yk.A0E();
    }

    public final void A02(EnumC39554HdQ enumC39554HdQ) {
        C14360o3.A0B(enumC39554HdQ, 0);
        if (this.A00.containsKey(enumC39554HdQ)) {
            this.A01.flowEndCancel(A00(enumC39554HdQ, this), CancelReason.USER_CANCELLED);
            this.A00 = AbstractC06930Yk.A09(enumC39554HdQ, this.A00);
        }
    }

    public final void A05(String str, String str2, boolean z, String str3) {
        String str4;
        C14360o3.A0B(str2, 2);
        EnumC39554HdQ enumC39554HdQ = EnumC39554HdQ.A03;
        if (this.A00.containsKey(enumC39554HdQ)) {
            A02(enumC39554HdQ);
        }
        this.A01.flowStart(A00(enumC39554HdQ, this), new UserFlowConfig("shopping_creation", false));
        if (str != null) {
            A03(enumC39554HdQ, "shopping_session_id", str);
        }
        if (z) {
            str4 = "seller";
        } else {
            str4 = "creator";
        }
        A03(enumC39554HdQ, MSV.A00(1701), str4);
        if (str != null) {
            A03(enumC39554HdQ, "shopping_session_id", str);
        }
        A03(enumC39554HdQ, MSV.A00(512), str3);
        A04(null, str2, null, null, null, true);
    }

    public static final long A00(EnumC39554HdQ enumC39554HdQ, C42346Ip8 c42346Ip8) {
        if (!c42346Ip8.A00.containsKey(enumC39554HdQ)) {
            c42346Ip8.A00 = AbstractC06930Yk.A0C(c42346Ip8.A00, AbstractC167007dF.A0p(enumC39554HdQ, c42346Ip8.A01.generateNewFlowId(enumC39554HdQ.A00)));
        }
        return AbstractC25232BEp.A0t(AbstractC37300Gc1.A0Q(enumC39554HdQ, c42346Ip8.A00));
    }

    public final void A01(int i, int i2, String str) {
        EnumC39554HdQ enumC39554HdQ = EnumC39554HdQ.A03;
        if (this.A00.containsKey(enumC39554HdQ)) {
            A04(null, null, str, null, null, false);
            if (this.A00.containsKey(enumC39554HdQ)) {
                this.A01.flowAnnotate(A00(enumC39554HdQ, this), "product_count", i);
            }
            if (this.A00.containsKey(enumC39554HdQ)) {
                this.A01.flowAnnotate(A00(enumC39554HdQ, this), "collection_count", i2);
            }
            this.A01.flowEndSuccess(A00(enumC39554HdQ, this));
            this.A00 = AbstractC06930Yk.A09(enumC39554HdQ, this.A00);
        }
    }

    public final void A03(EnumC39554HdQ enumC39554HdQ, String str, String str2) {
        if (this.A00.containsKey(enumC39554HdQ)) {
            this.A01.flowAnnotate(A00(enumC39554HdQ, this), str, str2);
        }
    }

    public final void A04(Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        EnumC39554HdQ enumC39554HdQ = EnumC39554HdQ.A03;
        if (this.A00.containsKey(enumC39554HdQ)) {
            long A00 = A00(enumC39554HdQ, this);
            if (z) {
                str5 = "shopping_creation_navigate_start";
            } else {
                str5 = "shopping_creation_navigate_end";
            }
            PointEditor markPointWithEditor = this.A01.markPointWithEditor(A00, str5);
            if (str != null) {
                markPointWithEditor.addPointData("start_source_type", str);
            }
            if (str2 != null) {
                markPointWithEditor.addPointData("end_source_type", str2);
            }
            if (str3 != null) {
                markPointWithEditor.addPointData("merchant_id", str3);
            }
            if (str4 != null) {
                markPointWithEditor.addPointData("product_id", str4);
            }
            if (bool != null) {
                markPointWithEditor.addPointData("is_checkout_enabled", bool.booleanValue());
            }
            markPointWithEditor.pointEditingCompleted();
        }
    }

    public final void A06(boolean z) {
        String str;
        EnumC39554HdQ enumC39554HdQ = EnumC39554HdQ.A03;
        if (this.A00.containsKey(enumC39554HdQ)) {
            if (z) {
                str = "shopping_creation_variant_navigate_start";
            } else {
                str = "shopping_creation_variant_navigate_end";
            }
            if (this.A00.containsKey(enumC39554HdQ)) {
                this.A01.flowMarkPoint(A00(enumC39554HdQ, this), str, null);
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Iterator A15 = AbstractC166997dE.A15(this.A00);
        while (A15.hasNext()) {
            A02((EnumC39554HdQ) AbstractC166987dD.A1K(A15).getKey());
        }
    }
}
