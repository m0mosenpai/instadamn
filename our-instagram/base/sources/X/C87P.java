package X;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.87P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87P {
    public int A00;
    public int A01 = 5000;
    public long A02 = -1;
    public boolean A03;

    public final int A00() {
        if (this.A03) {
            return (int) ((this.A00 + (System.currentTimeMillis() - this.A02)) % this.A01);
        }
        return -1;
    }

    public final void A01(C6RB c6rb) {
        int i;
        AbstractC202988yG abstractC202988yG;
        if ((c6rb instanceof AbstractC202988yG) && (abstractC202988yG = (AbstractC202988yG) c6rb) != null) {
            i = abstractC202988yG.getDurationInMs();
        } else {
            i = 5000;
        }
        if (i > this.A01) {
            this.A01 = i;
        }
        if (!this.A03) {
            this.A03 = true;
            this.A02 = System.currentTimeMillis();
        }
    }

    public final void A02(List list) {
        if (list.isEmpty()) {
            this.A00 = 0;
            this.A02 = -1L;
            this.A03 = false;
            this.A01 = 5000;
            return;
        }
        this.A01 = 5000;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            if (drawable instanceof AbstractC202988yG) {
                AbstractC202988yG abstractC202988yG = (AbstractC202988yG) drawable;
                if (abstractC202988yG.getDurationInMs() > this.A01) {
                    this.A01 = abstractC202988yG.getDurationInMs();
                }
            }
        }
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02 = System.currentTimeMillis();
    }
}
