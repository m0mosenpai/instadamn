package X;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes5.dex */
public final class BJR implements InterfaceC119265ai {
    public static final InterfaceC16620sF A0D = BJV.A00;
    public int A00;
    public C5AO A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16620sF A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AndroidComposeView A08;
    public final InterfaceC31078DlL A09;
    public final BIP A0A = new BIP();
    public final BIO A0C = new BIO(A0D);
    public final AnonymousClass595 A0B = new AnonymousClass595();
    public long A01 = C5AD.A01;

    @Override // X.InterfaceC119265ai
    public final void EKy(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        A00(false);
        this.A06 = false;
        this.A05 = false;
        this.A01 = C5AD.A01;
        this.A04 = interfaceC16620sF;
        this.A03 = interfaceC16820sZ;
    }

    private final void A00(boolean z) {
        if (z != this.A07) {
            this.A07 = z;
            this.A08.A0K(this, z);
        }
    }

    @Override // X.InterfaceC119265ai
    public final void COz(float[] fArr) {
        float[] A00 = this.A0C.A00(this.A09);
        if (A00 != null) {
            C5AJ.A05(fArr, A00);
        }
    }

    @Override // X.InterfaceC119265ai
    public final void Cmr(C119515b8 c119515b8, boolean z) {
        float[] A01;
        BIO bio = this.A0C;
        InterfaceC31078DlL interfaceC31078DlL = this.A09;
        if (z) {
            A01 = bio.A00(interfaceC31078DlL);
            if (A01 == null) {
                c119515b8.A01 = 0.0f;
                c119515b8.A03 = 0.0f;
                c119515b8.A02 = 0.0f;
                c119515b8.A00 = 0.0f;
                return;
            }
        } else {
            A01 = bio.A01(interfaceC31078DlL);
        }
        C5AJ.A01(c119515b8, A01);
    }

    @Override // X.InterfaceC119265ai
    public final long Cms(long j, boolean z) {
        float[] A01;
        BIO bio = this.A0C;
        InterfaceC31078DlL interfaceC31078DlL = this.A09;
        if (z) {
            A01 = bio.A00(interfaceC31078DlL);
            if (A01 == null) {
                return 9187343241974906880L;
            }
        } else {
            A01 = bio.A01(interfaceC31078DlL);
        }
        return C5AJ.A00(A01, j);
    }

    @Override // X.InterfaceC119265ai
    public final void Cpt(long j) {
        InterfaceC31078DlL interfaceC31078DlL = this.A09;
        int left = interfaceC31078DlL.getLeft();
        int C9P = interfaceC31078DlL.C9P();
        int A06 = AbstractC25225BEi.A06(j);
        int A02 = AbstractC25228BEl.A02(j);
        if (left != A06 || C9P != A02) {
            if (left != A06) {
                interfaceC31078DlL.Cu4(A06 - left);
            }
            if (C9P != A02) {
                interfaceC31078DlL.Cu7(A02 - C9P);
            }
            View view = this.A08;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
            BIO bio = this.A0C;
            bio.A00 = true;
            bio.A01 = true;
        }
    }

    @Override // X.InterfaceC119265ai
    public final void EK5(long j) {
        int i = (int) (j >> 32);
        int A00 = C119055aN.A00(j);
        InterfaceC31078DlL interfaceC31078DlL = this.A09;
        long j2 = this.A01;
        long j3 = C5AD.A01;
        interfaceC31078DlL.Eaq(AbstractC25227BEk.A01(j2) * i);
        interfaceC31078DlL.Ear(AbstractC25232BEp.A00(this.A01) * A00);
        if (interfaceC31078DlL.Eb8(interfaceC31078DlL.getLeft(), interfaceC31078DlL.C9P(), interfaceC31078DlL.getLeft() + i, interfaceC31078DlL.C9P() + A00)) {
            interfaceC31078DlL.EaL(this.A0A.A01());
            invalidate();
            BIO bio = this.A0C;
            bio.A00 = true;
            bio.A01 = true;
        }
    }

    @Override // X.InterfaceC119265ai
    public final void F8K(float[] fArr) {
        C5AJ.A05(fArr, this.A0C.A01(this.A09));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // X.InterfaceC119265ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FAl() {
        /*
            r5 = this;
            boolean r0 = r5.A07
            if (r0 != 0) goto Lc
            X.DlL r0 = r5.A09
            boolean r0 = r0.BBU()
            if (r0 != 0) goto L34
        Lc:
            X.DlL r4 = r5.A09
            boolean r0 = r4.Ao9()
            if (r0 == 0) goto L35
            X.BIP r1 = r5.A0A
            boolean r0 = r1.A07
            r0 = r0 ^ 1
            if (r0 != 0) goto L35
            X.BIP.A00(r1)
            X.60Y r3 = r1.A04
        L21:
            X.0sF r2 = r5.A04
            if (r2 == 0) goto L30
            X.595 r1 = r5.A0B
            r0 = 39
            X.DRU r0 = X.DRU.A00(r2, r0)
            r4.ECM(r1, r3, r0)
        L30:
            r0 = 0
            r5.A00(r0)
        L34:
            return
        L35:
            r3 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJR.FAl():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        if (r14.A0I == X.C5AF.A00) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        if (r14.A0I != X.C5AF.A00) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if ((!r13.A0A.A07) != false) goto L9;
     */
    @Override // X.InterfaceC119265ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBI(X.C1132059i r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJR.FBI(X.59i):void");
    }

    @Override // X.InterfaceC119265ai
    public final void destroy() {
        InterfaceC31078DlL interfaceC31078DlL = this.A09;
        if (interfaceC31078DlL.BBU()) {
            interfaceC31078DlL.APb();
        }
        this.A04 = null;
        this.A03 = null;
        this.A06 = true;
        A00(false);
        AndroidComposeView androidComposeView = this.A08;
        androidComposeView.A09 = true;
        androidComposeView.A0J(this);
    }

    @Override // X.InterfaceC119265ai
    public final void invalidate() {
        if (!this.A07 && !this.A06) {
            this.A08.invalidate();
            A00(true);
        }
    }

    public BJR(AndroidComposeView androidComposeView, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        InterfaceC31078DlL xn6;
        this.A08 = androidComposeView;
        this.A04 = interfaceC16620sF;
        this.A03 = interfaceC16820sZ;
        if (Build.VERSION.SDK_INT >= 29) {
            xn6 = new C28844CoE(androidComposeView);
        } else {
            xn6 = new XN6(androidComposeView);
        }
        InterfaceC31078DlL interfaceC31078DlL = xn6;
        interfaceC31078DlL.EVa(true);
        interfaceC31078DlL.ERV(false);
        this.A09 = interfaceC31078DlL;
    }

    @Override // X.InterfaceC119265ai
    public final void AQq(AnonymousClass585 anonymousClass585, GraphicsLayer graphicsLayer) {
        Canvas A00 = AnonymousClass597.A00(anonymousClass585);
        boolean z = false;
        if (A00.isHardwareAccelerated()) {
            FAl();
            InterfaceC31078DlL interfaceC31078DlL = this.A09;
            if (interfaceC31078DlL.B11() > 0.0f) {
                z = true;
            }
            this.A05 = z;
            if (z) {
                anonymousClass585.ARv();
            }
            interfaceC31078DlL.AQp(A00);
            if (this.A05) {
                anonymousClass585.APZ();
                return;
            }
            return;
        }
        InterfaceC31078DlL interfaceC31078DlL2 = this.A09;
        float left = interfaceC31078DlL2.getLeft();
        float C9P = interfaceC31078DlL2.C9P();
        float right = interfaceC31078DlL2.getRight();
        float AhQ = interfaceC31078DlL2.AhQ();
        if (interfaceC31078DlL2.AbP() < 1.0f) {
            C5AO c5ao = this.A02;
            if (c5ao == null) {
                c5ao = new C5AN();
                this.A02 = c5ao;
            }
            c5ao.EPa(interfaceC31078DlL2.AbP());
            A00.saveLayer(left, C9P, right, AhQ, ((C5AN) c5ao).A01);
        } else {
            anonymousClass585.ELZ();
        }
        anonymousClass585.F8X(left, C9P);
        anonymousClass585.AJ3(this.A0C.A01(interfaceC31078DlL2));
        if (interfaceC31078DlL2.Ao9() || interfaceC31078DlL2.Ao8()) {
            this.A0A.A02(anonymousClass585);
        }
        InterfaceC16620sF interfaceC16620sF = this.A04;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(anonymousClass585, null);
        }
        anonymousClass585.EKS();
        A00(false);
    }

    @Override // X.InterfaceC119265ai
    public final boolean CWG(long j) {
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        InterfaceC31078DlL interfaceC31078DlL = this.A09;
        if (interfaceC31078DlL.Ao8()) {
            if (0.0f > A01 || A01 >= interfaceC31078DlL.getWidth() || 0.0f > A02 || A02 >= interfaceC31078DlL.getHeight()) {
                return false;
            }
        } else if (interfaceC31078DlL.Ao9()) {
            return this.A0A.A03(j);
        }
        return true;
    }
}
