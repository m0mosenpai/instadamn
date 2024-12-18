package X;

import android.content.Context;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Su8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63814Su8 implements InterfaceC65477Tku {
    public final Context A00;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        Number number;
        android.net.Uri uri = (android.net.Uri) obj;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384 && (number = (Number) c63729Ssj.A00(C63752St7.A04)) != null && number.longValue() == -1) {
            C63726Ssg c63726Ssg = new C63726Ssg(uri);
            Context context = this.A00;
            return new SFV(c63726Ssg, C63770StQ.A00(context, uri, new C63783Std(context.getContentResolver())));
        }
        return null;
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        if (AbstractC61683Rrx.A00(uri) && uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            return true;
        }
        return false;
    }

    public C63814Su8(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
