package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class AjJ implements InterfaceC58176Pqg {
    public UserSession A00;
    public final Context A02;
    public final YPq A04;
    public AtomicBoolean A01 = AbstractC166997dE.A17();
    public final ReentrantLock A05 = new ReentrantLock(true);
    public final C178117vk A03 = new C178117vk();

    @Override // X.InterfaceC58176Pqg
    public final void A7K() {
        ReentrantLock reentrantLock = this.A05;
        if (!reentrantLock.isHeldByCurrentThread()) {
            reentrantLock.lock();
            this.A03.A01();
        }
    }

    @Override // X.InterfaceC58176Pqg
    public final EGLSurface ANY(Object obj) {
        return this.A03.A00(obj);
    }

    @Override // X.InterfaceC58176Pqg
    public final void AP2() {
        if (this.A01.compareAndSet(true, false)) {
            C209139Mv c209139Mv = (C209139Mv) this.A04;
            java.util.Set set = c209139Mv.A06;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c209139Mv.A00.A00((BCA) it.next());
            }
            set.clear();
            java.util.Set set2 = c209139Mv.A07;
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC199658sH) it2.next()).cleanup();
            }
            set2.clear();
            Map map = c209139Mv.A03;
            Iterator it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                ((InterfaceC199658sH) it3.next()).cleanup();
            }
            map.clear();
            java.util.Set set3 = c209139Mv.A04;
            Iterator it4 = set3.iterator();
            while (it4.hasNext()) {
                ((BCA) it4.next()).AHR(c209139Mv);
            }
            set3.clear();
            java.util.Set set4 = c209139Mv.A05;
            Iterator it5 = set4.iterator();
            while (it5.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it5);
                List A0m = AbstractC167007dF.A0m(A1B, "x", 0);
                C209149Mw c209149Mw = c209139Mv.A00;
                int A0C = AbstractC167007dF.A0C(A0m, 0);
                int A0C2 = AbstractC167007dF.A0C(A0m, 1);
                Object obj = c209139Mv.A02.get(A1B);
                if (obj != null) {
                    int A0H = AbstractC166987dD.A0H(obj);
                    int i = A0H;
                    StringBuilder sb = c209149Mw.A01;
                    sb.setLength(0);
                    sb.append(A0C);
                    sb.append("x");
                    sb.append(A0C2);
                    Object obj2 = c209149Mw.A03.get(AbstractC166987dD.A19(sb));
                    if (obj2 != null) {
                        List list = (List) obj2;
                        while (list.size() > 0) {
                            A0H--;
                            if (i > 0) {
                                ((InterfaceC199658sH) list.remove(0)).cleanup();
                                i = A0H;
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            c209139Mv.A02.clear();
            set4.clear();
            EEF();
            C178117vk c178117vk = this.A03;
            try {
                EGL14.eglDestroyContext(c178117vk.A01, c178117vk.A00);
                EGL14.eglDestroySurface(c178117vk.A01, c178117vk.A02);
                EGL14.eglTerminate(c178117vk.A01);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.InterfaceC58176Pqg
    public final YPq Bob() {
        return this.A04;
    }

    @Override // X.InterfaceC58176Pqg
    public final void EEF() {
        ReentrantLock reentrantLock = this.A05;
        if (reentrantLock.isHeldByCurrentThread()) {
            EGLDisplay eGLDisplay = this.A03.A01;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                C178117vk.A05.A01("eglMakeCurrent");
            }
            reentrantLock.unlock();
        }
    }

    public AjJ(Context context, UserSession userSession) {
        this.A02 = context;
        this.A00 = userSession;
        this.A04 = new C209139Mv(context);
    }

    @Override // X.InterfaceC58176Pqg
    public final void Ehf(C55003OVg c55003OVg) {
        SurfaceTexture A00 = c55003OVg.A00();
        C178117vk c178117vk = this.A03;
        c178117vk.A02();
        c178117vk.A02 = c178117vk.A00(A00);
        GLES20.glDisable(2929);
        this.A01.set(true);
        A7K();
    }
}
