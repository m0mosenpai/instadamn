package X;

import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import java.util.Iterator;

/* renamed from: X.5t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129435t5 {
    public W4G A00;
    public FormCellLoggingEvents A01;
    public final int A02;
    public final int A03;
    public final SparseArray A04;
    public final C58252li A05;
    public final C2GS A06;
    public final C2GS A07;
    public final boolean A08;
    public final boolean A09;

    public void A0G() {
    }

    public final SparseArray A09() {
        if (this instanceof AbstractC129455t8) {
            Object A02 = this.A05.A02();
            A02.getClass();
            return (SparseArray) A02;
        }
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(this.A02, this.A05.A02());
        return sparseArray;
    }

    public final AbstractC129435t5 A0A(int i) {
        if (this instanceof AbstractC129455t8) {
            AbstractC129455t8 abstractC129455t8 = (AbstractC129455t8) this;
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = abstractC129455t8.A00;
                if (i2 < sparseArray.size()) {
                    AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) sparseArray.valueAt(i2);
                    if (abstractC129435t5.A02 != i) {
                        i2++;
                    } else {
                        return abstractC129435t5;
                    }
                } else if (((AbstractC129435t5) abstractC129455t8).A02 == i) {
                    return abstractC129455t8;
                }
            }
        } else if (this.A02 == i) {
            return this;
        }
        return null;
    }

    public final void A0B(W4G w4g) {
        if (this instanceof AbstractC129455t8) {
            AbstractC129455t8 abstractC129455t8 = (AbstractC129455t8) this;
            ((AbstractC129435t5) abstractC129455t8).A00 = w4g;
            int i = 0;
            while (true) {
                SparseArray sparseArray = abstractC129455t8.A00;
                if (i < sparseArray.size()) {
                    AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) sparseArray.valueAt(i);
                    if (abstractC129435t5 != null) {
                        abstractC129435t5.A0B(w4g);
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            this.A00 = w4g;
        }
    }

    public void A0C(boolean z) {
        this.A07.A0B(Boolean.valueOf(z));
    }

    public void A0D(boolean z) {
        if (this instanceof AbstractC129455t8) {
            AbstractC129455t8 abstractC129455t8 = (AbstractC129455t8) this;
            Iterator it = abstractC129455t8.A01.iterator();
            while (it.hasNext()) {
                AbstractC129435t5 A0I = abstractC129455t8.A0I(((Number) it.next()).intValue());
                if (A0I != null) {
                    A0I.A0D(z);
                    if (z && !A0I.A0F()) {
                        z = false;
                    }
                }
            }
        }
    }

    public boolean A0E() {
        if (this instanceof AbstractC129455t8) {
            AbstractC129455t8 abstractC129455t8 = (AbstractC129455t8) this;
            int i = 0;
            while (true) {
                SparseArray sparseArray = abstractC129455t8.A00;
                if (i < sparseArray.size()) {
                    if (sparseArray.valueAt(i) != null && !((AbstractC129435t5) sparseArray.valueAt(i)).A0E()) {
                        return false;
                    }
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public boolean A0F() {
        if (this instanceof AbstractC129455t8) {
            AbstractC129455t8 abstractC129455t8 = (AbstractC129455t8) this;
            int i = 0;
            while (true) {
                SparseArray sparseArray = abstractC129455t8.A00;
                if (i < sparseArray.size()) {
                    AbstractC129435t5 abstractC129435t5 = (AbstractC129435t5) sparseArray.valueAt(i);
                    Object A02 = abstractC129455t8.A07.A02();
                    A02.getClass();
                    if (((Boolean) A02).booleanValue() && !abstractC129435t5.A0F()) {
                        return false;
                    }
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public boolean A0H() {
        String str;
        LocaleMember localeMember;
        LocaleMember localeMember2;
        if (this instanceof C5t6) {
            Object obj = this.A04.get(this.A02);
            String str2 = null;
            if ((obj instanceof Country) && (localeMember2 = (LocaleMember) obj) != null) {
                str = localeMember2.A00.getISO3Country();
            } else {
                str = null;
            }
            Object A02 = this.A05.A02();
            if ((A02 instanceof Country) && (localeMember = (LocaleMember) A02) != null) {
                str2 = localeMember.A00.getISO3Country();
            }
            return !C14360o3.A0K(str, str2);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2GT, X.2GS] */
    public AbstractC129435t5(CellParams cellParams) {
        this.A06 = new C2GT();
        this.A05 = new C58252li();
        this.A04 = new SparseArray();
        this.A07 = new C2GT(true);
        this.A03 = cellParams.A03;
        this.A02 = cellParams.A02;
        this.A09 = cellParams.A06;
        this.A08 = cellParams.A05;
        this.A01 = cellParams.A04;
    }

    public AbstractC129435t5(int i, boolean z, boolean z2) {
        this(null, 0, i, z, z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2GT, X.2GS] */
    public AbstractC129435t5(FormCellLoggingEvents formCellLoggingEvents, int i, int i2, boolean z, boolean z2) {
        this.A06 = new C2GT();
        this.A05 = new C58252li();
        this.A04 = new SparseArray();
        this.A07 = new C2GT(true);
        this.A03 = i;
        this.A02 = i2;
        this.A09 = z;
        this.A08 = z2;
        this.A01 = formCellLoggingEvents;
    }
}
