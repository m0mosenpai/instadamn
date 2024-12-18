package X;

import android.app.DatePickerDialog;
import android.content.DialogInterface;

/* renamed from: X.Q7l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58757Q7l extends C0SG {
    public DatePickerDialog.OnDateSetListener A00;
    public DialogInterface.OnDismissListener A01;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        if (r4 != null) goto L26;
     */
    @Override // X.C0SG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog A0F(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            android.os.Bundle r4 = r0.mArguments
            androidx.fragment.app.FragmentActivity r11 = r0.getActivity()
            android.app.DatePickerDialog$OnDateSetListener r13 = r0.A00
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            if (r4 == 0) goto L1f
            java.lang.String r1 = "date"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L1f
            long r0 = r4.getLong(r1)
            r2.setTimeInMillis(r0)
        L1f:
            r1 = 1
            r8 = 0
            int r14 = r2.get(r1)
            r0 = 2
            int r15 = r2.get(r0)
            r0 = 5
            int r16 = r2.get(r0)
            java.lang.Integer r3 = X.C05F.A0C
            r0 = 0
            if (r4 == 0) goto L50
            java.lang.String r5 = "mode"
            java.lang.String r0 = r4.getString(r5, r0)
            if (r0 == 0) goto L50
            java.lang.String r5 = r4.getString(r5)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r0)
            java.lang.String r0 = "CALENDAR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Le5
            java.lang.Integer r3 = X.C05F.A00
        L50:
            java.lang.Integer r0 = X.C05F.A00
            if (r3 != r0) goto Le1
            java.lang.String r5 = "CalendarDatePickerDialog"
        L56:
            int r0 = r3.intValue()
            if (r0 == r8) goto Lcc
            if (r0 == r1) goto Lcc
            X.Q0v r10 = new X.Q0v
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
        L68:
            android.widget.DatePicker r7 = r10.getDatePicker()
            r9 = 14
            r6 = 13
            r5 = 12
            r3 = 11
            if (r4 == 0) goto Lc1
            java.lang.String r1 = "minDate"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto Lc1
            long r0 = r4.getLong(r1)
            r2.setTimeInMillis(r0)
            r2.set(r3, r8)
            r2.set(r5, r8)
            r2.set(r6, r8)
            r2.set(r9, r8)
            long r0 = r2.getTimeInMillis()
            r7.setMinDate(r0)
        L98:
            java.lang.String r1 = "maxDate"
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto Lc0
            long r0 = r4.getLong(r1)
            r2.setTimeInMillis(r0)
            r0 = 23
            r2.set(r3, r0)
            r0 = 59
            r2.set(r5, r0)
            r2.set(r6, r0)
            r0 = 999(0x3e7, float:1.4E-42)
            r2.set(r9, r0)
            long r0 = r2.getTimeInMillis()
            r7.setMaxDate(r0)
        Lc0:
            return r10
        Lc1:
            r0 = -2208988800001(0xfffffdfdae01dbff, double:NaN)
            r7.setMinDate(r0)
            if (r4 == 0) goto Lc0
            goto L98
        Lcc:
            android.content.res.Resources r3 = r11.getResources()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "style"
            int r12 = r3.getIdentifier(r5, r0, r1)
            X.Q0v r10 = new X.Q0v
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L68
        Le1:
            java.lang.String r5 = "SpinnerDatePickerDialog"
            goto L56
        Le5:
            java.lang.String r0 = "SPINNER"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf1
            java.lang.Integer r3 = X.C05F.A01
            goto L50
        Lf1:
            java.lang.String r0 = "DEFAULT"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L50
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58757Q7l.A0F(android.os.Bundle):android.app.Dialog");
    }

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
