package com.instagram.igds.components.datepicker;

import X.AbstractC55922hc;
import X.C00O;
import X.C14360o3;
import X.C1H4;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.facebook.R;
import java.util.Calendar;

/* loaded from: classes11.dex */
public final class IgTimePicker extends LinearLayout {
    public int A00;
    public Calendar A01;
    public NumberPicker A02;
    public NumberPicker A03;
    public NumberPicker A04;
    public NumberPicker A05;
    public boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A00 = 5;
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A1L, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.time_picker_layout);
        obtainStyledAttributes.recycle();
        View.inflate(context, resourceId, this);
        this.A03 = (NumberPicker) requireViewById(R.id.date_picker);
        this.A04 = (NumberPicker) requireViewById(R.id.hour_picker);
        this.A05 = (NumberPicker) requireViewById(R.id.minute_picker);
        this.A02 = (NumberPicker) requireViewById(R.id.ampm_picker);
        NumberPicker numberPicker = this.A03;
        String str = "datePicker";
        if (numberPicker != null) {
            numberPicker.setWrapSelectorWheel(false);
            NumberPicker numberPicker2 = this.A03;
            if (numberPicker2 != null) {
                numberPicker2.setMinValue(0);
                NumberPicker numberPicker3 = this.A03;
                if (numberPicker3 != null) {
                    numberPicker3.setMaxValue(365);
                    NumberPicker numberPicker4 = this.A02;
                    if (numberPicker4 == null) {
                        str = "ampmPicker";
                    } else {
                        numberPicker4.setWrapSelectorWheel(false);
                        this.A01 = Calendar.getInstance();
                        this.A06 = DateFormat.is24HourFormat(context);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final int getNumberOfDaysInPickerRange() {
        NumberPicker numberPicker = this.A03;
        if (numberPicker != null) {
            int maxValue = numberPicker.getMaxValue();
            NumberPicker numberPicker2 = this.A03;
            if (numberPicker2 != null) {
                return (maxValue - numberPicker2.getMinValue()) + 1;
            }
        }
        C14360o3.A0F("datePicker");
        throw C00O.createAndThrow();
    }

    private final int getSelectedHourOfDay() {
        boolean z = this.A06;
        String str = "hourPicker";
        NumberPicker numberPicker = this.A04;
        if (z) {
            if (numberPicker != null) {
                return numberPicker.getValue();
            }
        } else if (numberPicker != null) {
            int value = numberPicker.getValue() % 12;
            NumberPicker numberPicker2 = this.A02;
            if (numberPicker2 == null) {
                str = "ampmPicker";
            } else {
                return value + (numberPicker2.getValue() * 12);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final int getSelectedMinute() {
        NumberPicker numberPicker = this.A05;
        if (numberPicker == null) {
            C14360o3.A0F("minutePicker");
            throw C00O.createAndThrow();
        }
        return numberPicker.getValue() * this.A00;
    }

    public final void A01() {
        String str;
        NumberPicker numberPicker = this.A03;
        if (numberPicker == null) {
            str = "datePicker";
        } else {
            numberPicker.setValue(0);
            NumberPicker numberPicker2 = this.A04;
            if (numberPicker2 == null) {
                str = "hourPicker";
            } else {
                numberPicker2.setValue(0);
                NumberPicker numberPicker3 = this.A05;
                if (numberPicker3 == null) {
                    str = "minutePicker";
                } else {
                    numberPicker3.setValue(0);
                    if (!this.A06) {
                        NumberPicker numberPicker4 = this.A02;
                        if (numberPicker4 == null) {
                            str = "ampmPicker";
                        } else {
                            numberPicker4.setValue(0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final Calendar getSelectedDate() {
        Calendar calendar;
        String str;
        Calendar calendar2 = this.A01;
        if (calendar2 == null) {
            str = "startDate";
        } else {
            Object clone = calendar2.clone();
            if (!(clone instanceof Calendar) || (calendar = (Calendar) clone) == null) {
                return null;
            }
            NumberPicker numberPicker = this.A03;
            if (numberPicker == null) {
                str = "datePicker";
            } else {
                calendar.add(5, numberPicker.getValue());
                return calendar;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final Calendar getSelectedTime() {
        Calendar calendar;
        String str;
        Calendar calendar2 = this.A01;
        if (calendar2 == null) {
            str = "startDate";
        } else {
            Object clone = calendar2.clone();
            if (!(clone instanceof Calendar) || (calendar = (Calendar) clone) == null) {
                return null;
            }
            NumberPicker numberPicker = this.A03;
            if (numberPicker == null) {
                str = "datePicker";
            } else {
                calendar.add(5, numberPicker.getValue());
                calendar.set(11, getSelectedHourOfDay());
                calendar.set(12, getSelectedMinute());
                return calendar;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setDatePeriod(int i) {
        NumberPicker numberPicker = this.A03;
        if (numberPicker == null) {
            C14360o3.A0F("datePicker");
            throw C00O.createAndThrow();
        }
        numberPicker.setMaxValue(i - 1);
    }

    public final void A02(int i, int i2, int i3) {
        String str;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2, i3);
        NumberPicker numberPicker = this.A03;
        if (numberPicker == null) {
            str = "datePicker";
        } else {
            Calendar calendar2 = this.A01;
            if (calendar2 == null) {
                str = "startDate";
            } else {
                numberPicker.setValue(C1H4.A01(((float) (calendar.getTimeInMillis() - calendar2.getTimeInMillis())) / 8.64E7f));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(int r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r8.A02(r9, r10, r11)
            boolean r2 = r8.A06
            java.lang.String r0 = "hourPicker"
            android.widget.NumberPicker r1 = r8.A04
            if (r2 != 0) goto L24
            if (r1 == 0) goto L1c
            long r2 = (long) r12
            r6 = 12
            long r4 = r2 % r6
            int r0 = (int) r4
            r1.setValue(r0)
            android.widget.NumberPicker r1 = r8.A02
            if (r1 != 0) goto L2a
            java.lang.String r0 = "ampmPicker"
        L1c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            if (r1 == 0) goto L1c
            r1.setValue(r12)
            goto L33
        L2a:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r0 = X.MSY.A1R(r0)
            r1.setValue(r0)
        L33:
            android.widget.NumberPicker r1 = r8.A05
            if (r1 != 0) goto L3a
            java.lang.String r0 = "minutePicker"
            goto L1c
        L3a:
            int r0 = r8.A00
            int r13 = r13 / r0
            r1.setValue(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.datepicker.IgTimePicker.A03(int, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.XAt r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.datepicker.IgTimePicker.A04(X.XAt):void");
    }

    public final void setIs24HourView(boolean z) {
        this.A06 = z;
    }

    public final void setMinuteIntervalLength(int i) {
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A00 = 5;
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgTimePicker(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A00 = 5;
        A00(context, null);
    }
}
