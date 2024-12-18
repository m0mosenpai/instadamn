package X;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Tux, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65836Tux extends AbstractC65852TvD {
    public final List A00 = new ArrayList(3);

    @Override // X.AbstractC65852TvD
    public final void A00(int i) {
        try {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((AbstractC65852TvD) it.next()).A00(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        try {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((AbstractC65852TvD) it.next()).A01(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A02(int i, float f, int i2) {
        try {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((AbstractC65852TvD) it.next()).A02(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
