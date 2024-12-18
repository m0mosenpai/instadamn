package X;

import android.content.Context;
import android.location.Location;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;

/* loaded from: classes9.dex */
public final class PTX implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C196748n4 A02;
    public final /* synthetic */ C50692MZl A03;
    public final /* synthetic */ String A04;

    public PTX(Context context, C196748n4 c196748n4, C50692MZl c50692MZl, String str, int i) {
        this.A03 = c50692MZl;
        this.A01 = context;
        this.A04 = str;
        this.A00 = i;
        this.A02 = c196748n4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C50692MZl c50692MZl = this.A03;
        Object obj = this.A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.intf.NavigationDelegate");
        InterfaceC50446MPa interfaceC50446MPa = (InterfaceC50446MPa) obj;
        String str2 = this.A04;
        Location location = c50692MZl.A00;
        int i = this.A00;
        Number number = (Number) this.A02.A03(C196748n4.A0K);
        if (number != null && number.intValue() == 1) {
            str = "front";
        } else {
            str = "back";
        }
        MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) interfaceC50446MPa;
        if (C06P.A01(mediaCaptureActivity.getSupportFragmentManager())) {
            String A0x = AbstractC43593JPy.A0x();
            C14360o3.A0B(A0x, 0);
            C47Z A01 = AbstractC209399Nx.A01(A0x);
            A01.A44 = AbstractC209829Ps.A00(str2);
            A01.A3L = str2;
            A01.A2W = str;
            mediaCaptureActivity.EnO(A01);
            AnonymousClass841 A0L = MSX.A0L(mediaCaptureActivity);
            A0L.ETx(i);
            CreationSession creationSession = ((MX5) A0L).A01;
            MediaSession mediaSession = creationSession.A07;
            if (mediaSession != null) {
                mediaSession.EYV(location);
            }
            creationSession.A02 = 1;
            A0L.Eab(A01.A35);
            C55772hI.A00(mediaCaptureActivity.A04).A09(mediaCaptureActivity, "camera_capture");
            MediaCaptureActivity.A03(mediaCaptureActivity);
        }
    }
}
