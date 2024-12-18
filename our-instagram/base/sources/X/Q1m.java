package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes10.dex */
public final class Q1m extends BroadcastReceiver {
    public final C62665SLb A00;
    public final R29 A01;
    public final C11900jp A02;

    public Q1m(C62665SLb c62665SLb, R29 r29, C11900jp c11900jp) {
        this.A00 = c62665SLb;
        this.A02 = c11900jp;
        this.A01 = r29;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1072907436);
        R29 r29 = this.A01;
        ((SP6) r29).A00 = System.currentTimeMillis();
        if (getResultCode() == -1) {
            String resultData = getResultData();
            Bundle resultExtras = getResultExtras(true);
            r29.A00 = new C19U(resultData, resultExtras.getLong("timestamp", Long.MAX_VALUE), resultExtras.getString("origin"));
            this.A00.A00(r29);
        } else {
            ((SP6) r29).A01 = C05F.A0C;
        }
        C11880jn c11880jn = this.A00.A01;
        if (c11880jn != null) {
            c11880jn.A01();
        }
        C11900jp c11900jp = this.A02;
        if (c11900jp != null) {
            c11900jp.A03(r29);
        }
        C0f9.A0E(1383884498, A04, intent);
    }
}
