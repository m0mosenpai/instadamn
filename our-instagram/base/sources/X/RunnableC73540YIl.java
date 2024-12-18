package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.YIl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73540YIl implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AudioManager A01;
    public final /* synthetic */ C147426kS A02;
    public final /* synthetic */ C72699XlS A03;
    public final /* synthetic */ String A04;

    public RunnableC73540YIl(AudioManager audioManager, C147426kS c147426kS, C72699XlS c72699XlS, String str, int i) {
        this.A01 = audioManager;
        this.A00 = i;
        this.A02 = c147426kS;
        this.A04 = str;
        this.A03 = c72699XlS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioManager audioManager = this.A01;
        int i = this.A00;
        audioManager.adjustStreamVolume(3, i, 0);
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        C147426kS c147426kS = this.A02;
        ((Handler) c147426kS.A06.getValue()).post(new RunnableC73533YId(c147426kS, this.A03, streamVolume, streamMaxVolume));
        boolean A00 = C4AJ.A00(c147426kS.A03, Integer.valueOf(streamVolume), true, false);
        C147436kT c147436kT = c147426kS.A04;
        C72786Xn6 c72786Xn6 = (C72786Xn6) c147436kT.A02.get(this.A04);
        if (c72786Xn6 != null) {
            InterfaceC678133v interfaceC678133v = c72786Xn6.A01;
            float f = 0.0f;
            if (A00) {
                f = 1.0f;
            }
            interfaceC678133v.EhH(f);
            YQT yqt = c72786Xn6.A03;
            yqt.EPx(A00);
            if (i == 1) {
                yqt.Cjg();
            } else {
                yqt.Cjf();
            }
        }
    }
}
