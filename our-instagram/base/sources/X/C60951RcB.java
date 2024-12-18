package X;

import android.content.SharedPreferences;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.RcB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60951RcB extends AbstractRunnableC14200nk {
    public final /* synthetic */ C58883QEt A00;
    public final /* synthetic */ QF6 A01;

    @Override // java.lang.Runnable
    public final void run() {
        C58883QEt c58883QEt = this.A00;
        SharedPreferences sharedPreferences = C20J.A02;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("cross_app", null);
            SharedPreferences sharedPreferences2 = C20J.A02;
            if (sharedPreferences2 != null) {
                String string2 = sharedPreferences2.getString(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, null);
                SharedPreferences sharedPreferences3 = C20J.A02;
                if (sharedPreferences3 != null) {
                    String string3 = sharedPreferences3.getString("recent", null);
                    C62620SJd c62620SJd = c58883QEt.A0Y.A00;
                    SKK skk = c58883QEt.A0Z;
                    AbstractC37302Gc3.A1U(c62620SJd, skk);
                    C51760Mtj c51760Mtj = c62620SJd.A0N;
                    c51760Mtj.A00 = AbstractC63045SbP.A01(skk, string);
                    c51760Mtj.A01 = AbstractC63045SbP.A01(skk, string2);
                    c51760Mtj.A02 = AbstractC63045SbP.A01(skk, string3);
                    return;
                }
            }
        }
        C14360o3.A0F("walletContactDataStore");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60951RcB(C58883QEt c58883QEt, QF6 qf6) {
        super(2115235502);
        this.A00 = c58883QEt;
        this.A01 = qf6;
    }
}
