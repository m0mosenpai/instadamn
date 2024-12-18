package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.2mJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58602mJ {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final C1QO A00() {
        Integer num;
        if (this.A02 && ((num = this.A00) == C05F.A0C || num == C05F.A01)) {
            return C1QO.A09;
        }
        return C1QO.A0F;
    }

    public C58602mJ(Integer num) {
        Integer num2;
        if (C05F.A01 == num) {
            this.A01 = "hide_hero";
            this.A02 = true;
            this.A03 = true;
            num2 = C05F.A0C;
        } else {
            this.A01 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            num2 = C05F.A00;
        }
        this.A00 = num2;
    }
}
