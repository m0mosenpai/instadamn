package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.W4m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70114W4m {
    public WGV A00;
    public C69489VoC A01;
    public C66036TyY A02;
    public C69223Vjq A03;
    public Boolean A04;
    public boolean A06;
    public final Context A07;
    public final XC9 A08;
    public final C58647PzK A09;
    public final InterfaceC58019Po5 A0A;
    public final C70129W5q A0B;
    public final X9U A0C;
    public final X9V A0D;
    public final InterfaceC58105PpU A0E;
    public final InterfaceC71972XDf A0F;
    public final InterfaceC71895X9c A0H;
    public HashMap A05 = new HashMap();
    public final List A0I = new ArrayList();
    public final C69068VhJ A0G = new Object();
    public final AtomicBoolean A0J = new AtomicBoolean();

    public static void A00(C70114W4m c70114W4m, Throwable th, long j) {
        Throwable exc;
        C69223Vjq c69223Vjq = c70114W4m.A03;
        if (th instanceof Exception) {
            exc = th;
        } else {
            exc = new Exception(th);
        }
        try {
            try {
                C70114W4m c70114W4m2 = (C70114W4m) c69223Vjq.A03.A00;
                if (c70114W4m2 != null) {
                    c70114W4m2.A01();
                }
            } catch (Exception e) {
                AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", "frameRetriever?.release() failed", e);
            }
            c69223Vjq.A03.A00 = null;
            AbstractC12120kG.A09("ClipsDefaultCoverPhotoGenerator", "generateDefaultCoverPhotoFromMediaComposition onFrameExtractionFailed", exc);
            C11T.A02(new RunnableC71494Wuu(c69223Vjq.A00, c69223Vjq.A01));
            if (c70114W4m.A01.A07 != null) {
                if ((th instanceof ExecutionException) && th.getCause() != null) {
                    th = th.getCause();
                }
                C70129W5q c70129W5q = new C70129W5q();
                c70129W5q.A04 = j;
                c70114W4m.A01.A07.DEg(c70129W5q, new Exception(th));
            }
            c70114W4m.A04 = Boolean.FALSE;
        } catch (Throwable th2) {
            c69223Vjq.A03.A00 = null;
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.Tyj, java.lang.Object] */
    public final void A01() {
        ?? obj = new Object();
        C66036TyY c66036TyY = this.A02;
        if (c66036TyY != null) {
            try {
                c66036TyY.AVe();
            } catch (Throwable th) {
                C66046Tyj.A00(obj, th);
            }
        }
        try {
            C69068VhJ c69068VhJ = this.A0G;
            Surface surface = c69068VhJ.A01;
            if (surface != null) {
                surface.release();
                c69068VhJ.A01 = null;
            }
            SurfaceTexture surfaceTexture = c69068VhJ.A00;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                c69068VhJ.A00 = null;
            }
            AnonymousClass810 anonymousClass810 = c69068VhJ.A02;
            if (anonymousClass810 != null) {
                anonymousClass810.A01();
                c69068VhJ.A02 = null;
            }
            this.A05.clear();
        } catch (Throwable th2) {
            C66046Tyj.A00(obj, th2);
        }
        try {
            WGV wgv = this.A00;
            if (wgv != null) {
                wgv.A0A();
            }
        } catch (Throwable th3) {
            C66046Tyj.A00(obj, th3);
        }
        obj.A01();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VhJ] */
    public C70114W4m(Context context, XC9 xc9, C58647PzK c58647PzK, InterfaceC58019Po5 interfaceC58019Po5, C70129W5q c70129W5q, X9U x9u, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, InterfaceC71972XDf interfaceC71972XDf, C69489VoC c69489VoC, InterfaceC71895X9c interfaceC71895X9c, C69223Vjq c69223Vjq) {
        this.A0H = interfaceC71895X9c;
        this.A0D = x9v;
        this.A0A = interfaceC58019Po5;
        this.A0E = interfaceC58105PpU;
        this.A01 = c69489VoC;
        this.A09 = c58647PzK;
        this.A0B = c70129W5q;
        this.A0C = x9u;
        this.A07 = context;
        this.A0F = interfaceC71972XDf;
        this.A03 = c69223Vjq;
        this.A08 = xc9;
    }
}
