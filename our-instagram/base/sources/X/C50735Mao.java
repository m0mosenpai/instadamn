package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.Mao, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50735Mao extends BroadcastReceiver {
    public final /* synthetic */ OMO A00;

    public C50735Mao(OMO omo) {
        this.A00 = omo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A01 = C0f9.A01(-168906908);
        C0fM.A01(this, context, intent);
        AbstractC167017dG.A1N(context, intent);
        OMO omo = this.A00;
        omo.A02 = omo.A04.isSpeakerphoneOn();
        C0f9.A0E(-910608618, A01, intent);
    }
}
