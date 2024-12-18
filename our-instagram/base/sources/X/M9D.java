package X;

import android.graphics.Bitmap;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: classes8.dex */
public final class M9D implements InterfaceC16660sJ {
    public final int A00;
    public final C45046Jwb A01;
    public final InterfaceC16660sJ A02;

    public M9D(C45046Jwb c45046Jwb, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c45046Jwb, 1);
        this.A01 = c45046Jwb;
        this.A02 = interfaceC16660sJ;
        this.A00 = c45046Jwb.A03;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object A0p;
        AbstractC53426NkF abstractC53426NkF = (AbstractC53426NkF) obj;
        C14360o3.A0B(abstractC53426NkF, 0);
        if (abstractC53426NkF instanceof C44911JuP) {
            Bitmap bitmap = ((C44911JuP) abstractC53426NkF).A00;
            if (bitmap == null) {
                A0p = AbstractC43592JPx.A0p(new C44912JuQ(AbstractC166987dD.A18("Bitmap not received"), C05F.A00));
            } else {
                C45046Jwb c45046Jwb = this.A01;
                if (c45046Jwb.A05) {
                    int i = this.A00;
                    int i2 = c45046Jwb.A00 + 2;
                    int i3 = c45046Jwb.A01;
                    boolean z = true;
                    if (i2 >= i3) {
                        QuickPerformanceLogger quickPerformanceLogger = c45046Jwb.A04;
                        quickPerformanceLogger.markerPoint(603995461, AnonymousClass001.A0c("/take_snapshot/render_frame/frame_output_validation/", "_start", i3));
                        boolean z2 = false;
                        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                            int pixel = bitmap.getPixel(0, 0);
                            C17v A0B = C17s.A0B(C17s.A0C(1, bitmap.getHeight()), i);
                            int i4 = A0B.A00;
                            int i5 = A0B.A01;
                            int i6 = A0B.A02;
                            if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                                loop0: while (true) {
                                    C17v A0B2 = C17s.A0B(C17s.A0C(1, bitmap.getWidth()), i);
                                    int i7 = A0B2.A00;
                                    int i8 = A0B2.A01;
                                    int i9 = A0B2.A02;
                                    if (i9 <= 0 ? !(i9 >= 0 || i8 > i7) : i7 <= i8) {
                                        while (pixel == bitmap.getPixel(i7 - 1, i4 - 1)) {
                                            if (i7 != i8) {
                                                i7 += i9;
                                            }
                                        }
                                        break loop0;
                                    }
                                    if (i4 == i5) {
                                        break;
                                    }
                                    i4 += i6;
                                }
                                z2 = z;
                            }
                            z = false;
                            quickPerformanceLogger.markerAnnotate(c45046Jwb.A02, "pixel_value", pixel);
                            z2 = z;
                        }
                        quickPerformanceLogger.markerPoint(603995461, AnonymousClass001.A0c("/take_snapshot/render_frame/frame_output_validation/", "_end", i3));
                        if (!z2) {
                            C0K8.A0C("ODR_ERROR", "Bitmap is blank or all pixels are of same color");
                            A0p = AbstractC43592JPx.A0p(new C44912JuQ(AbstractC166987dD.A18("Bitmap is blank or all pixels are of same color"), C05F.A01));
                        }
                    }
                    A0p = AbstractC25225BEi.A0z(bitmap);
                } else {
                    A0p = AbstractC25225BEi.A0z(null);
                }
            }
        } else {
            if (abstractC53426NkF instanceof C44912JuQ) {
                A0p = AbstractC43592JPx.A0p(abstractC53426NkF);
            }
            return C0eB.A00;
        }
        this.A02.invoke(A0p);
        return C0eB.A00;
    }
}
