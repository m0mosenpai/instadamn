package X;

import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Azt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24894Azt implements Runnable {
    public final /* synthetic */ HandlerC25861Nt A00;
    public final /* synthetic */ CameraSpec A01;
    public final /* synthetic */ C8JT A02;
    public final /* synthetic */ C69415Vmz A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public RunnableC24894Azt(HandlerC25861Nt handlerC25861Nt, CameraSpec cameraSpec, C8JT c8jt, C69415Vmz c69415Vmz, File file, List list, boolean z) {
        this.A02 = c8jt;
        this.A06 = z;
        this.A05 = list;
        this.A04 = file;
        this.A01 = cameraSpec;
        this.A03 = c69415Vmz;
        this.A00 = handlerC25861Nt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8KC c198888qo;
        C8JT c8jt = this.A02;
        C8IW c8iw = c8jt.A0C;
        if (c8iw != null) {
            c8iw.A01 = false;
        }
        if (this.A06) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            List list = this.A05;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C195868lW c195868lW = ((C69168Vix) it.next()).A02;
                    CameraAREffect cameraAREffect = c195868lW.A0P;
                    if (cameraAREffect != null) {
                        builder.add((Object) cameraAREffect);
                        if (!c195868lW.A18) {
                            AbstractC166987dD.A11(c195868lW.A0k).delete();
                        }
                    }
                } catch (RuntimeException unused) {
                    AbstractC12120kG.A07("ClipsCaptureControllerImpl", "unable to delete file for layout video", null);
                }
            }
            File file = this.A04;
            Medium A03 = C8IU.A03(file, 3, 0);
            CameraSpec cameraSpec = this.A01;
            int i = cameraSpec.A03;
            int i2 = cameraSpec.A02;
            A03.A0B = i;
            A03.A04 = i2;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0q.add(((C69168Vix) it2.next()).A02.A02().A03);
            }
            A03.A0G.A03 = AbstractC178007vZ.A02(c8jt.A1D, "", AbstractC001800i.A0X(A0q));
            C195868lW c195868lW2 = new C195868lW(A03, i, i2, 0);
            int i3 = (int) this.A03.A06;
            c195868lW2.A07 = i3;
            c195868lW2.A0H = 0;
            c195868lW2.A06 = i3;
            C14360o3.A07(file.getAbsolutePath());
            C8JT.A0J(builder.build(), null, c8jt.A1m.A00(), c8jt, c195868lW2, file, null, C05F.A01, null, i3, 0, 0, i3, false, true);
            c8jt.A1F.A0N(C81W.A0z);
            if (c8jt.A1g()) {
                c198888qo = new C198898qp(false);
            } else if (C8JT.A05(c8jt) != null) {
                c198888qo = C9PB.A00;
            } else if (C8JT.A1X(c8jt)) {
                c198888qo = new C198888qo(false);
            }
            C8JT.A0O(c198888qo, c8jt);
        } else {
            String absolutePath = this.A04.getAbsolutePath();
            C14360o3.A07(absolutePath);
            C8JT.A16(c8jt, null, absolutePath, "onMergingStarted failed", false, false);
            if (c8iw != null) {
                C211709Ze c211709Ze = C211709Ze.A02;
                C14360o3.A0B(c211709Ze, 0);
                c8iw.A03.A0A(c211709Ze);
            }
            c8jt.A1h.A0B("onMergingStarted failed");
        }
        this.A00.getLooper().quitSafely();
    }
}
