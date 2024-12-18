package X;

import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;

/* renamed from: X.Wkn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70941Wkn implements XAt {
    public final /* synthetic */ V1G A00;

    public C70941Wkn(V1G v1g) {
        this.A00 = v1g;
    }

    @Override // X.XAt
    public final void DyY(IgTimePicker igTimePicker, Calendar calendar) {
        if (calendar != null) {
            V1G.A01(this.A00, calendar);
        }
    }
}
