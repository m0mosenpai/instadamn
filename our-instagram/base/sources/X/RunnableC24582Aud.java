package X;

import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Aud, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24582Aud implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C214829fK A01;

    public RunnableC24582Aud(ViewGroup viewGroup, C214829fK c214829fK) {
        this.A01 = c214829fK;
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C81Y c81y;
        String str;
        C214829fK c214829fK = this.A01;
        if (c214829fK.mView != null) {
            ViewGroup viewGroup = this.A00;
            String str2 = c214829fK.A06;
            String str3 = null;
            if (str2 == null) {
                str = "mediaType";
            } else {
                if (str2.equals("image")) {
                    i = 1;
                } else {
                    boolean equals = str2.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
                    i = 0;
                    if (equals) {
                        i = 3;
                    }
                }
                File file = c214829fK.A03;
                if (file == null) {
                    str = "presetMediumFile";
                } else {
                    Medium A03 = C8IU.A03(file, i, 0);
                    C81J c81j = new C81J();
                    InterfaceC25214BDm interfaceC25214BDm = c214829fK.A08;
                    interfaceC25214BDm.getClass();
                    c81j.A0l = interfaceC25214BDm;
                    InterfaceC09390do interfaceC09390do = c214829fK.A09;
                    C81J.A0L(c81j, interfaceC09390do);
                    C81J.A03(c214829fK.getRootActivity(), c214829fK, c81j);
                    C81J.A0C((UserSession) interfaceC09390do.getValue(), C81O.A02, C208509Kk.A00, c81j);
                    c81j.A3h = true;
                    c81j.A0R = c214829fK.volumeKeyPressController;
                    C81I c81i = c214829fK.A02;
                    c81i.getClass();
                    c81j.A0t = c81i;
                    viewGroup.getClass();
                    c81j.A09 = viewGroup;
                    C22P c22p = c214829fK.A00;
                    if (c22p == null) {
                        str = "entryPoint";
                    } else {
                        c81j.A0B = c22p;
                        c81j.A0O = c214829fK;
                        c81j.A3H = true;
                        c81j.A3y = true;
                        c81j.A0P = A03;
                        c81j.A0w = null;
                        c81j.A0y = C81K.A02;
                        c81j.A3g = true;
                        c81j.A3Q = false;
                        c81j.A3H = true;
                        c81j.A3G = false;
                        if (c214829fK.A07 && (str3 = c214829fK.A05) == null) {
                            str = "effectId";
                        } else {
                            c81j.A2G = str3;
                            c81j.A2E = c214829fK.A04;
                            c81j.A36 = false;
                            c81j.A3D = false;
                            C14360o3.A07(c81j);
                            c214829fK.A01 = new C81Y(c81j);
                            if (c214829fK.mLifecycleRegistry.A07().A00(C07S.RESUMED) && (c81y = c214829fK.A01) != null) {
                                c81y.A01();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
