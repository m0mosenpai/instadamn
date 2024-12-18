package X;

import android.content.Intent;

/* loaded from: classes10.dex */
public final class TQA implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AbstractServiceC58445PvQ A02;

    public TQA(Intent intent, Intent intent2, AbstractServiceC58445PvQ abstractServiceC58445PvQ) {
        this.A02 = abstractServiceC58445PvQ;
        this.A00 = intent;
        this.A01 = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC58445PvQ abstractServiceC58445PvQ = this.A02;
        abstractServiceC58445PvQ.A01(this.A00);
        AbstractServiceC58445PvQ.A00(this.A01, abstractServiceC58445PvQ);
    }
}
