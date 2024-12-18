package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8im, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194268im implements C1NJ {
    public static final Map A04 = Collections.synchronizedMap(new HashMap());
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final C18340vL A03;

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        int i;
        C14360o3.A0B(interfaceC59502nt, 0);
        C14360o3.A0B(c73033Pe, 1);
        Object C4x = interfaceC59502nt.C4x();
        if (C4x != null) {
            C22876A6w c22876A6w = (C22876A6w) C4x;
            BB7 bb7 = (BB7) c22876A6w.A01.get();
            C198308pf c198308pf = c22876A6w.A00;
            Bitmap bitmap = c73033Pe.A01;
            if (bb7 != null && bitmap != null) {
                C23748AfL c23748AfL = (C23748AfL) bb7;
                C183978Ee c183978Ee = c198308pf.A02;
                if (c183978Ee != null) {
                    i = c183978Ee.A07;
                } else {
                    i = 0;
                }
                C193838i4 c193838i4 = c23748AfL.A00;
                C193838i4.A07(bitmap, c193838i4, i);
                C8YY c8yy = c193838i4.A0w;
                List unmodifiableList = Collections.unmodifiableList(c23748AfL.A01);
                C14360o3.A07(unmodifiableList);
                c8yy.A0J(c193838i4, unmodifiableList, 0, false, false, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public static final String A00(C194268im c194268im, C198308pf c198308pf) {
        StringBuilder sb = new StringBuilder();
        sb.append(c198308pf.A06);
        sb.append('?');
        sb.append(c194268im.A01);
        sb.append("}x");
        sb.append(c194268im.A00);
        return sb.toString();
    }

    public C194268im(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A02 = options;
        options.inJustDecodeBounds = true;
        this.A03 = new C18340vL(C14120nc.A00(), Runtime.getRuntime().availableProcessors() * 2);
    }

    public static final void A01(C194268im c194268im, C198308pf c198308pf, WeakReference weakReference, int i) {
        String A01 = c198308pf.A01();
        if (A01 != null) {
            C1OG A0J = C25821No.A00().A0J(AbstractC81033jX.A01(new File(A01)), null);
            A0J.A0I = false;
            A0J.A08 = new C22876A6w(c198308pf, weakReference);
            A0J.A02(c194268im);
            A0J.A01 = i;
            A0J.A01();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
