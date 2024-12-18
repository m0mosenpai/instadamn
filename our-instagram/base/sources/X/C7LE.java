package X;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7LE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7LE extends C7LF {
    public final Resources A02;
    public final List A09 = new ArrayList(20);
    public final List A08 = new ArrayList(20);
    public final List A07 = new ArrayList(20);
    public final Paint A04 = new Paint();
    public final Matrix A03 = new Matrix();
    public final AccelerateInterpolator A05 = new AccelerateInterpolator(2.0f);
    public long A01 = 0;
    public long A00 = 0;
    public final C7LH A06 = new C7LG(this);

    public final void A00() {
        C9IR.A01.A01(this.A06);
        this.A00 = 0L;
        this.A09.clear();
        List list = this.A08;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C69461Vnk) it.next()).A09 = null;
        }
        list.clear();
        this.A07.clear();
    }

    public C7LE(Resources resources) {
        this.A02 = resources;
    }
}
