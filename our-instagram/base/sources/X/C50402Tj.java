package X;

import android.content.res.Resources;
import java.io.File;

/* renamed from: X.2Tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50402Tj extends AbstractRunnableC14200nk {
    public Resources A00;
    public int[] A01;

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        try {
            Resources resources = this.A00;
            int[] iArr = this.A01;
            if (C20150ym.A07(AbstractC20070ye.A00(18313280988658461L))) {
                file = C50352Td.A00;
            } else {
                file = null;
            }
            AbstractC50362Te.A05 = new C50422Tl(resources, file, iArr);
        } finally {
            AbstractC50362Te.A06 = true;
            AbstractC50362Te.A03.countDown();
        }
    }
}
