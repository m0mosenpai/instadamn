package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.MemoryFile;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes12.dex */
public final class XZO extends AbstractC184988In {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public EnumC185018Iq A04;
    public InterfaceC25160BBf A05;
    public Y1s A06;
    public Y3X A07;
    public File A08;
    public boolean A09;
    public final List A0A;
    public final InterfaceC09390do A0B;
    public volatile int A0C;
    public volatile int A0D;
    public volatile long A0E;
    public volatile long A0F;
    public volatile String A0G;
    public volatile boolean A0H;
    public volatile MemoryFile[] A0I;

    @Override // X.AbstractC184988In
    public final synchronized void A08() {
        if (this.A0M.get() == 1) {
            this.A0D = this.A0C;
            this.A0H = true;
            A00(this);
        }
    }

    @Override // X.AbstractC184988In
    public final void A09(float f, float f2) {
    }

    @Override // X.AbstractC184988In
    public final void A0A(SurfaceTexture surfaceTexture, float f, int i, int i2) {
    }

    @Override // X.AbstractC184988In
    public final void A0C(C177247uK c177247uK) {
    }

    @Override // X.AbstractC184988In
    public final synchronized void A0E(final boolean z) {
        InterfaceC25160BBf interfaceC25160BBf;
        if (this.A0M.compareAndSet(1, 2)) {
            C174757qB c174757qB = super.A04;
            c174757qB.getClass();
            if (c174757qB.CWZ() && (interfaceC25160BBf = this.A05) != null) {
                super.A04.EFz(interfaceC25160BBf);
                this.A05 = null;
            }
            C11T.A03(new Runnable() { // from class: X.YHc
                @Override // java.lang.Runnable
                public final void run() {
                    XZO xzo = XZO.this;
                    ((AbstractC184988In) xzo).A0H.A02(z);
                }
            });
            C174757qB c174757qB2 = super.A04;
            c174757qB2.getClass();
            c174757qB2.A0N(new XW0(this, 3), true);
            if (z) {
                ((C18240vB) this.A0B.getValue()).ATO(new XZI(this));
            } else {
                A01(this);
            }
        }
    }

    public static void A00(XZO xzo) {
        boolean z;
        if (xzo.A0A.size() >= xzo.A0D) {
            if (xzo.A0F < 200000000) {
                AbstractC12120kG.A03("BoomerangCaptureController", AnonymousClass001.A0Q("Capture time too short: ", xzo.A0F));
                z = false;
            } else {
                z = true;
            }
            xzo.A0E(z);
        }
    }

    public static void A01(XZO xzo) {
        Y3X y3x = xzo.A07;
        if (y3x != null) {
            if (y3x.A03.compareAndSet(0, 2)) {
                Y3X.A00(y3x);
            }
            xzo.A07 = null;
        }
        xzo.A0M.set(0);
        xzo.A08 = null;
        xzo.A06 = null;
        xzo.A03 = null;
        xzo.A0G = null;
        xzo.A0E = -1L;
        xzo.A0F = -1L;
        xzo.A0C = 0;
        xzo.A0H = false;
        xzo.A02 = 0;
        xzo.A01 = 0;
        xzo.A00 = 0;
        ((AbstractC184988In) xzo).A0A = false;
        xzo.A09 = false;
        xzo.A0A.clear();
        MemoryFile[] memoryFileArr = xzo.A0I;
        if (memoryFileArr != null) {
            for (MemoryFile memoryFile : memoryFileArr) {
                if (memoryFile != null) {
                    memoryFile.close();
                }
            }
            xzo.A0I = null;
        }
    }

    public static boolean A02(XZO xzo, String str) {
        if (str.equals(xzo.A0G) && xzo.A0M.get() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC184988In
    public final void A0D(File file) {
        InterfaceC1810081c interfaceC1810081c = super.A08;
        interfaceC1810081c.A85(this.A0K);
        interfaceC1810081c.A82(this.A0J);
        this.A08 = file;
        C174757qB c174757qB = super.A04;
        c174757qB.getClass();
        c174757qB.A0M(new XW1(3, file, this), true);
    }

    public XZO(Context context, View view, UserSession userSession, C1810981l c1810981l, C8HV c8hv, C8C0 c8c0, C1820485o c1820485o, C1813982r c1813982r, InterfaceC1810081c interfaceC1810081c, boolean z) {
        super(context, view, userSession, c1810981l, c8hv, c8c0, c1820485o, c1813982r, interfaceC1810081c, z);
        this.A0B = AbstractC09440dt.A01(new B2Q(1));
        this.A0A = new LinkedList();
        this.A04 = EnumC185018Iq.A08;
        this.A0E = -1L;
        this.A0F = -1L;
    }

    @Override // X.AbstractC184988In
    public final void A07() {
        A01(this);
    }

    @Override // X.AbstractC184988In
    public final void A0B(EnumC185018Iq enumC185018Iq) {
        this.A04 = enumC185018Iq;
    }
}
