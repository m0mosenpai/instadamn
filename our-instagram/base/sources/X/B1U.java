package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes4.dex */
public final class B1U implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ CameraSpec A02;
    public final /* synthetic */ C22832A5b A03;
    public final /* synthetic */ C49602Pt A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public B1U(Context context, UserSession userSession, CameraSpec cameraSpec, C22832A5b c22832A5b, C49602Pt c49602Pt, String str, List list) {
        this.A06 = list;
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = c49602Pt;
        this.A05 = str;
        this.A02 = cameraSpec;
        this.A03 = c22832A5b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Object c09540e5;
        String str;
        String str2;
        String str3;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            Medium A0l = AbstractC166987dD.A0l(it);
            Callable A00 = AbstractC23025ADh.A00(this.A00, A0l, this.A01, this.A02, this.A04, this.A05, false);
            if (A00 != null) {
                boolean Cff = A0l.Cff();
                C22832A5b c22832A5b = this.A03;
                if (c22832A5b != null) {
                    C8JT c8jt = c22832A5b.A00;
                    C183348Bh c183348Bh = c8jt.A1h;
                    C22P c22p = c8jt.A16;
                    boolean CWT = c8jt.CWT();
                    if (Cff) {
                        str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                    } else {
                        str3 = "photo";
                    }
                    c183348Bh.A07(c22p, str3, 0, false, CWT);
                }
                try {
                    c09540e5 = (C195868lW) A00.call();
                } catch (Throwable th) {
                    c09540e5 = new C09540e5(th);
                }
                if (!(c09540e5 instanceof C09540e5)) {
                    if (c22832A5b != null) {
                        C183348Bh c183348Bh2 = c22832A5b.A00.A1h;
                        if (Cff) {
                            str2 = "video_import_success";
                        } else {
                            str2 = "photo_import_success";
                        }
                        c183348Bh2.A0J(str2);
                    }
                    C14360o3.A0A(c09540e5);
                    A1E.add(c09540e5);
                }
                Throwable A002 = C09550e6.A00(c09540e5);
                if (A002 != null) {
                    if (c22832A5b != null) {
                        C183348Bh c183348Bh3 = c22832A5b.A00.A1h;
                        if (Cff) {
                            str = "load video from medium failed";
                        } else {
                            str = "photo import failed";
                        }
                        c183348Bh3.A0I(str);
                    }
                    throw new Exception(A002);
                }
            }
        }
        return A1E;
    }
}
