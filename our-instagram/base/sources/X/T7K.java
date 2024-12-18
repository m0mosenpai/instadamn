package X;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class T7K implements InterfaceC65517Tlm {
    @Override // X.InterfaceC65517Tlm
    public final int BF3() {
        return 1;
    }

    @Override // X.InterfaceC65517Tlm
    public final boolean CfQ(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && dateValidator.CfP(j)) {
                return true;
            }
        }
        return false;
    }
}
