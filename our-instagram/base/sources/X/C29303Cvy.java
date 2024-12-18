package X;

import com.instagram.igds.components.datepicker.IgTimePicker;
import java.util.Calendar;

/* renamed from: X.Cvy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29303Cvy implements XAt {
    public final /* synthetic */ C26853BtF A00;

    public C29303Cvy(C26853BtF c26853BtF) {
        this.A00 = c26853BtF;
    }

    @Override // X.XAt
    public final void DyY(IgTimePicker igTimePicker, Calendar calendar) {
        long j;
        C26853BtF c26853BtF = this.A00;
        if (calendar != null) {
            j = calendar.getTimeInMillis();
        } else {
            j = c26853BtF.A00;
        }
        c26853BtF.A00 = j;
    }
}
