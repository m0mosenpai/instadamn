package com.facebook.video.heroplayer.warmup;

import X.C459529d;
import X.C46602By;
import X.C4ST;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes3.dex */
public class WarmupPool$4 extends ResultReceiver {
    public final /* synthetic */ C4ST A00;
    public final /* synthetic */ C459529d A01;
    public final /* synthetic */ C46602By A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarmupPool$4(C4ST c4st, C459529d c459529d, C46602By c46602By) {
        super(null);
        this.A02 = c46602By;
        this.A01 = c459529d;
        this.A00 = c4st;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C459529d c459529d = this.A01;
        C4ST c4st = this.A00;
        c459529d.A09(c4st.A03, false);
        c4st.A02();
    }
}
