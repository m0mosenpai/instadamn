package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5t6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5t6 extends AbstractC129435t5 {
    public boolean A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;
    public final Country A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5t6(Country country, FormCellLoggingEvents formCellLoggingEvents, ImmutableList immutableList, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(formCellLoggingEvents, i, i2, z, z2);
        C14360o3.A0B(immutableList, 9);
        this.A03 = str;
        this.A01 = i3;
        this.A05 = country;
        this.A02 = immutableList;
        if (country != null) {
            super.A05.A0B(country);
        }
        this.A04 = z3;
        super.A04.put(i2, country);
    }

    public final void A0I(boolean z) {
        FormCellLoggingEvents formCellLoggingEvents;
        if (z != this.A00) {
            this.A00 = z;
            W4G w4g = super.A00;
            if (w4g != null && (formCellLoggingEvents = super.A01) != null) {
                w4g.A00(formCellLoggingEvents.A00, true, z);
            }
        }
    }
}
