package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.Wik, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70879Wik implements InterfaceC58115Ppe {
    public TextView A00;
    public OWa A01;
    public IgdsSwitch A02;
    public final View A03;
    public final FragmentActivity A04;
    public final PromoteData A05;
    public final PromoteState A06;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 < 0) goto L12;
     */
    @Override // X.InterfaceC58115Ppe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D9K(java.util.Date r4) {
        /*
            r3 = this;
            r1 = 0
            if (r4 == 0) goto L1c
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r2.setTime(r4)
            r0 = 14
            r1 = 0
            r2.set(r0, r1)
            r0 = 13
            r2.set(r0, r1)
            java.util.Date r1 = r2.getTime()
            X.C14360o3.A07(r1)
        L1c:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.util.Date r0 = r0.getTime()
            X.OWa r2 = r3.A01
            if (r2 != 0) goto L32
            java.lang.String r0 = "datePickerController"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L32:
            if (r1 == 0) goto L3b
            int r0 = r1.compareTo(r0)
            r1 = 1
            if (r0 >= 0) goto L3c
        L3b:
            r1 = 0
        L3c:
            X.8aR r0 = r2.A00
            if (r0 == 0) goto L43
            r0.A0Q(r1)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70879Wik.D9K(java.util.Date):void");
    }

    public static final void A01(C70879Wik c70879Wik) {
        String str;
        TextView textView = c70879Wik.A00;
        if (textView != null) {
            Date date = c70879Wik.A05.A1k;
            if (date != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd 'at' hh:mm a z");
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                str = simpleDateFormat.format(date);
            } else {
                str = null;
            }
            textView.setText(str);
            c70879Wik.A06.A09 = true;
            TextView textView2 = c70879Wik.A00;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F("subtitleView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
        if (this.A05.A1k == null) {
            this.A06.A09 = false;
            IgdsSwitch igdsSwitch = this.A02;
            if (igdsSwitch == null) {
                C14360o3.A0F("toggleSwitch");
                throw C00O.createAndThrow();
            }
            igdsSwitch.setChecked(false);
        }
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        String str;
        if (date != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(14, 0);
            calendar.set(13, 0);
            Date time = calendar.getTime();
            C14360o3.A07(time);
            this.A05.A1k = time;
            A01(this);
            OWa oWa = this.A01;
            if (oWa == null) {
                str = "datePickerController";
            } else {
                oWa.A01();
                IgdsSwitch igdsSwitch = this.A02;
                if (igdsSwitch == null) {
                    str = "toggleSwitch";
                } else {
                    igdsSwitch.setChecked(true);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public C70879Wik(View view, FragmentActivity fragmentActivity, PromoteData promoteData, PromoteState promoteState) {
        this.A03 = view;
        this.A04 = fragmentActivity;
        this.A05 = promoteData;
        this.A06 = promoteState;
    }

    public static final void A00(C70879Wik c70879Wik) {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        calendar.add(6, 60);
        Date time2 = calendar.getTime();
        OWa oWa = c70879Wik.A01;
        if (oWa == null) {
            C14360o3.A0F("datePickerController");
            throw C00O.createAndThrow();
        }
        oWa.A02(true, c70879Wik.A04.getString(2131970933), c70879Wik.A05.A1k, time, time2, true);
    }
}
