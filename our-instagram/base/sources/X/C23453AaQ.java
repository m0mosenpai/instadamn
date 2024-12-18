package X;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.AaQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23453AaQ implements InterfaceC175547rU {
    public Image A00;
    public C177047u0 A01;
    public C175227qw A02;
    public ImageReader A03;
    public AbstractC176797tb A04;
    public boolean A05;
    public final C196708n0 A0A = new Object();
    public final C1814082s A06 = new C1814082s();
    public final ImageReader.OnImageAvailableListener A08 = new API(this, 0);
    public final Callable A07 = new CallableC24924B0x(this, 0);
    public final InterfaceC177137u9 A09 = new C23445AaI(this);

    @Override // X.InterfaceC175547rU
    public final boolean Ce5() {
        return true;
    }

    public static void A00(C23453AaQ c23453AaQ) {
        C196708n0 c196708n0;
        AbstractC176797tb abstractC176797tb;
        C175227qw c175227qw = c23453AaQ.A02;
        if (c175227qw != null) {
            if (c175227qw.A09()) {
                if (c23453AaQ.A00 != null && c23453AaQ.A04 != null && c23453AaQ.CLA()) {
                    C177047u0 c177047u0 = c23453AaQ.A01;
                    try {
                        if (c177047u0 != null && (abstractC176797tb = c23453AaQ.A04) != null && AbstractC167017dG.A1Y(AbstractC176797tb.A0U, abstractC176797tb)) {
                            long timestamp = c23453AaQ.A00.getTimestamp();
                            C177627uw c177627uw = c177047u0.A09;
                            if (c177627uw != null) {
                                int i = 0;
                                do {
                                    C177637ux c177637ux = c177627uw.A01[i];
                                    if (c177637ux != null) {
                                        C208439Kc c208439Kc = C177637ux.A0P;
                                        if (c177637ux.A00(c208439Kc) != null && AbstractC166987dD.A0N(c177637ux.A00(c208439Kc)) == timestamp) {
                                            c196708n0 = c23453AaQ.A0A;
                                            C196708n0.A00(c23453AaQ.A00, c177637ux, c196708n0, c23453AaQ.A05);
                                        }
                                    }
                                    i++;
                                } while (i < 3);
                                return;
                            }
                            return;
                        }
                        c196708n0 = c23453AaQ.A0A;
                        c196708n0.A02(c23453AaQ.A00, null, null, null, null, null, c23453AaQ.A05, false);
                        List list = c23453AaQ.A06.A00;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((InterfaceC25160BBf) list.get(i2)).Dad(c196708n0);
                        }
                    } catch (RuntimeException unused) {
                    }
                    c23453AaQ.A0A.A01();
                    c23453AaQ.A00.close();
                    c23453AaQ.A00 = null;
                    return;
                }
                return;
            }
            throw new RuntimeException("Method tryToNotifyCpuFrame() must run on the Optic Background Thread.");
        }
    }

    @Override // X.InterfaceC175547rU
    public final boolean A9B(InterfaceC25160BBf interfaceC25160BBf) {
        return this.A06.A01(interfaceC25160BBf);
    }

    @Override // X.InterfaceC175547rU
    public final void AHp() {
        this.A06.A00();
    }

    @Override // X.InterfaceC175547rU
    public final InterfaceC177137u9 B8a() {
        return this.A09;
    }

    @Override // X.InterfaceC175547rU
    public final List BNp() {
        return this.A06.A00;
    }

    @Override // X.InterfaceC175547rU
    public final boolean CLA() {
        return AbstractC166987dD.A1b(this.A06.A00);
    }

    @Override // X.InterfaceC175547rU
    public final void CNs(InterfaceC174657pz interfaceC174657pz, AbstractC176767tY abstractC176767tY, AbstractC176797tb abstractC176797tb, C176877tj c176877tj, C175227qw c175227qw, int i) {
        int i2;
        C176877tj c176877tj2 = c176877tj;
        this.A02 = c175227qw;
        this.A05 = AbstractC167007dF.A1S(AbstractC176767tY.A0T, abstractC176767tY);
        this.A04 = abstractC176797tb;
        int A0H = AbstractC167017dG.A0H(AbstractC176797tb.A0m, abstractC176797tb);
        if (AbstractC166987dD.A1a(interfaceC174657pz.AXQ(InterfaceC174657pz.A0H))) {
            List list = (List) abstractC176767tY.A01(AbstractC176767tY.A0t);
            int i3 = c176877tj2.A02 * c176877tj2.A01;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C176877tj c176877tj3 = (C176877tj) list.get(i4);
                int i5 = c176877tj3.A02;
                int i6 = c176877tj3.A01;
                if (AbstractC166987dD.A01(Math.max(i5, i6) / Math.min(i5, i6), Math.max(r9, r7) / Math.min(r9, r7)) <= 1.0E-4f && (i2 = c176877tj3.A02 * c176877tj3.A01) < i3 && i2 >= 180000) {
                    c176877tj2 = c176877tj3;
                    i3 = i2;
                }
            }
        }
        ImageReader newInstance = ImageReader.newInstance(c176877tj2.A02, c176877tj2.A01, A0H, 1);
        this.A03 = newInstance;
        newInstance.setOnImageAvailableListener(this.A08, null);
    }

    @Override // X.InterfaceC175547rU
    public final boolean EFc(InterfaceC25160BBf interfaceC25160BBf) {
        return this.A06.A02(interfaceC25160BBf);
    }

    @Override // X.InterfaceC175547rU
    public final Surface getSurface() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        throw AbstractC166987dD.A14("Getting image reader surface without initialize.");
    }

    @Override // X.InterfaceC175547rU
    public final void release() {
        ImageReader imageReader = this.A03;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            this.A03.close();
            this.A03 = null;
        }
        Image image = this.A00;
        if (image != null) {
            image.close();
            this.A00 = null;
        }
        this.A02 = null;
        this.A04 = null;
        this.A01 = null;
    }

    @Override // X.InterfaceC175547rU
    public final void A9H(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.A06.A01(list.get(i));
        }
    }
}
