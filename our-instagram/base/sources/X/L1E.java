package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.ui.base.IgTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes8.dex */
public final class L1E {
    public final View A00;
    public final ViewGroup A01;
    public final IgTextView A02;

    public L1E(View view) {
        this.A00 = view;
        this.A02 = AbstractC25231BEo.A0d(view, R.id.section_date_range);
        this.A01 = AbstractC31176DnK.A0C(view, R.id.date_icon_container);
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(1);
        calendar.set(7, 1);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setFirstDayOfWeek(1);
        calendar2.set(7, 7);
        Date time2 = calendar2.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd", C217113x.A06);
        this.A02.setText(StringFormatUtil.formatStrLocaleSafe("%s - %s", simpleDateFormat.format(time), simpleDateFormat.format(time2)));
    }
}
