package X;

import android.view.Surface;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class YBF implements AndroidVideoInput {
    public final Map A01 = Collections.synchronizedMap(AbstractC166987dD.A1G());
    public final List A00 = Collections.synchronizedList(AbstractC166987dD.A1E());

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final boolean enableCaptureRenderer() {
        return false;
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final X7X getFrameSchedulerFactory() {
        return null;
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void setOutputSurface(SurfaceTextureHolder surfaceTextureHolder, boolean z) {
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void pauseOutputSurface(int i) {
        YCI yci = (YCI) this.A01.get(Integer.valueOf(i));
        if (yci != null) {
            yci.A00();
        }
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void removeErrorListener(InterfaceC57904Pm8 interfaceC57904Pm8) {
        this.A00.remove(interfaceC57904Pm8);
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void resumeOutputSurface(int i) {
        YCI yci = (YCI) this.A01.get(Integer.valueOf(i));
        if (yci != null) {
            yci.A06 = false;
        }
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void setErrorListener(InterfaceC57904Pm8 interfaceC57904Pm8) {
        List list = this.A00;
        C14360o3.A06(list);
        synchronized (list) {
            if (interfaceC57904Pm8 != null) {
                if (!list.contains(interfaceC57904Pm8)) {
                    list.add(interfaceC57904Pm8);
                }
            }
        }
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void setOutputSurface(int i, SurfaceHolder surfaceHolder) {
        C72740XmC c72740XmC;
        InterfaceC174857qL interfaceC174857qL;
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i);
        YCI yci = (YCI) map.get(valueOf);
        if (surfaceHolder == null || surfaceHolder.getSurface() == null) {
            if (yci != null) {
                yci.A00();
                Surface surface = yci.A05;
                if (surface != null) {
                    surface.release();
                }
                yci.A00 = -1;
                yci.A01 = -1;
                return;
            }
            if (surfaceHolder == null) {
                return;
            }
        }
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        Surface surface2 = surfaceHolder.getSurface();
        int width = surfaceHolder.getWidth();
        int height = surfaceHolder.getHeight();
        if (yci != null) {
            Surface surface3 = yci.A05;
            if (surface3 != null) {
                surface3.release();
            }
            yci.A00 = -1;
            yci.A01 = -1;
            yci.A05 = surface2;
            yci.A01 = width;
            yci.A00 = height;
            C72691XlK c72691XlK = yci.A02;
            if (c72691XlK != null && (c72740XmC = c72691XlK.A00.A00) != null) {
                C73314Y4c c73314Y4c = c72740XmC.A01;
                Map map2 = c73314Y4c.A0A;
                YQR yqr = c72740XmC.A00;
                InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) map2.get(yqr);
                if (interfaceC185788Ly != null && (interfaceC174857qL = c73314Y4c.A08.A04.A04) != null) {
                    interfaceC174857qL.EG2(interfaceC185788Ly);
                }
                if (c73314Y4c.A06) {
                    C73314Y4c.A00(yqr, c73314Y4c);
                }
            }
            if (!yci.A06) {
                return;
            }
            yci.A06 = false;
            return;
        }
        map.put(valueOf, new YCI(surface2, width, height));
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void startRenderingToOutput() {
        Map map = this.A01;
        C14360o3.A06(map);
        synchronized (map) {
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                ((YCI) A16.next()).A06 = false;
            }
        }
    }

    @Override // com.facebook.mediastreaming.opt.source.video.AndroidVideoInput
    public final void stopRenderingToOutput() {
        Map map = this.A01;
        C14360o3.A06(map);
        synchronized (map) {
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                ((YCI) A16.next()).A00();
            }
        }
    }
}
