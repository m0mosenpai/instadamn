package X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.7BE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BE extends C1P1 {
    public C1P1 A00;
    public C4KH A01;
    public InterfaceC08830cm A02;
    public int A03;

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(560285391);
        C14360o3.A0B(abstractC115105If, 0);
        Throwable A01 = abstractC115105If.A01();
        if (((A01 != null && !(A01 instanceof C7J3)) || ((abstractC115105If instanceof C115115Ig) && ((InterfaceC40801un) ((C115115Ig) abstractC115105If).A00).getStatusCode() >= 500)) && (i = this.A03) < 4) {
            this.A03 = i + 1;
            int A00 = this.A01.A00() * CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            C1ON c1on = (C1ON) this.A02.get();
            c1on.A00 = this;
            C1GJ.A05(c1on, 805, 3, A00, true, false);
        } else {
            this.A00.onFail(abstractC115105If);
        }
        C0f9.A0A(1764205270, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1540233378);
        C14360o3.A0B(abstractC115105If, 0);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(-87629064, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1807903395);
        this.A00.onFinish();
        C0f9.A0A(1368837776, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(138718765);
        this.A00.onStart();
        C0f9.A0A(-1638107670, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1421399941);
        int A032 = C0f9.A03(-572895912);
        C14360o3.A0B(obj, 0);
        this.A00.onSuccess(obj);
        C0f9.A0A(771770941, A032);
        C0f9.A0A(-1879786206, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-308698948);
        int A032 = C0f9.A03(-1543002152);
        C14360o3.A0B(obj, 0);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(-61503714, A032);
        C0f9.A0A(383399479, A03);
    }
}
