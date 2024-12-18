package X;

import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* loaded from: classes11.dex */
public final class WYJ implements C4BQ {
    public final /* synthetic */ C4SS A00;
    public final /* synthetic */ WYP A01;

    public WYJ(C4SS c4ss, WYP wyp) {
        this.A01 = wyp;
        this.A00 = c4ss;
    }

    @Override // X.C4BQ
    public final void CmU(String str) {
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A01.A09;
        String str2 = this.A00.A0K.A0G;
        if (str2 != null) {
            serviceEventCallbackImpl.callback(new C97144Xz(str2, "MEDIA_CODEC_RENDERER_UPGRADE", AbstractC111324zv.A00(319), str));
        }
    }
}
