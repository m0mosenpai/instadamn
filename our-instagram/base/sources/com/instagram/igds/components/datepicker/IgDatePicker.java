package com.instagram.igds.components.datepicker;

import X.AbstractC25230BEn;
import X.AbstractC55922hc;
import X.C00O;
import X.C14360o3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.facebook.R;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes11.dex */
public final class IgDatePicker extends LinearLayout {
    public NumberPicker A00;
    public NumberPicker A01;
    public int A02;
    public int A03;
    public int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgDatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setMaxDate(Calendar calendar) {
        C14360o3.A0B(calendar, 0);
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            C14360o3.A0F("monthPicker");
            throw C00O.createAndThrow();
        }
        numberPicker.setMaxValue(calendar.get(2));
        this.A03 = calendar.get(5);
    }

    public final void setMinDate(Calendar calendar) {
        C14360o3.A0B(calendar, 0);
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            C14360o3.A0F("monthPicker");
            throw C00O.createAndThrow();
        }
        numberPicker.setMinValue(calendar.get(2));
        this.A04 = calendar.get(5);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC55922hc.A12, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.date_picker_layout);
        obtainStyledAttributes.recycle();
        View.inflate(context, resourceId, this);
        this.A01 = (NumberPicker) requireViewById(R.id.month_picker);
        this.A00 = (NumberPicker) requireViewById(R.id.day_picker);
        NumberPicker numberPicker = this.A01;
        if (numberPicker != null) {
            numberPicker.setWrapSelectorWheel(false);
            NumberPicker numberPicker2 = this.A00;
            if (numberPicker2 != null) {
                numberPicker2.setWrapSelectorWheel(false);
                NumberPicker numberPicker3 = this.A01;
                if (numberPicker3 != null) {
                    numberPicker3.setMinValue(1);
                    NumberPicker numberPicker4 = this.A01;
                    if (numberPicker4 != null) {
                        numberPicker4.setMaxValue(12);
                        NumberPicker numberPicker5 = this.A00;
                        if (numberPicker5 != null) {
                            numberPicker5.setMinValue(1);
                            NumberPicker numberPicker6 = this.A00;
                            if (numberPicker6 != null) {
                                numberPicker6.setMaxValue(30);
                                this.A04 = 0;
                                this.A03 = 0;
                                this.A02 = Calendar.getInstance().get(1);
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("dayPicker");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("monthPicker");
        throw C00O.createAndThrow();
    }

    public static final void A01(IgDatePicker igDatePicker, int i) {
        int i2;
        NumberPicker numberPicker;
        int i3;
        NumberPicker numberPicker2 = igDatePicker.A01;
        if (numberPicker2 != null) {
            if (i != numberPicker2.getMinValue() || (i2 = igDatePicker.A04) == 0) {
                NumberPicker numberPicker3 = igDatePicker.A01;
                if (numberPicker3 != null) {
                    i2 = 1;
                    if (i == numberPicker3.getMaxValue() && igDatePicker.A03 != 0) {
                        NumberPicker numberPicker4 = igDatePicker.A00;
                        if (numberPicker4 != null) {
                            numberPicker4.setMinValue(1);
                            numberPicker = igDatePicker.A00;
                            if (numberPicker != null) {
                                i3 = igDatePicker.A03;
                                numberPicker.setMaxValue(i3);
                                return;
                            }
                        }
                        C14360o3.A0F("dayPicker");
                        throw C00O.createAndThrow();
                    }
                }
            }
            NumberPicker numberPicker5 = igDatePicker.A00;
            if (numberPicker5 != null) {
                numberPicker5.setMinValue(i2);
                numberPicker = igDatePicker.A00;
                if (numberPicker != null) {
                    int i4 = igDatePicker.A02;
                    switch (i + 1) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            i3 = 31;
                            break;
                        case 2:
                            boolean isLeapYear = new GregorianCalendar().isLeapYear(i4);
                            i3 = 28;
                            if (isLeapYear) {
                                i3 = 29;
                                break;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            i3 = 30;
                            break;
                        default:
                            throw AbstractC25230BEn.A0n("Not a valid month: ", i);
                    }
                    numberPicker.setMaxValue(i3);
                    return;
                }
            }
            C14360o3.A0F("dayPicker");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("monthPicker");
        throw C00O.createAndThrow();
    }

    public final int getCurrentDayOfMonth() {
        NumberPicker numberPicker = this.A00;
        if (numberPicker == null) {
            C14360o3.A0F("dayPicker");
            throw C00O.createAndThrow();
        }
        return numberPicker.getValue();
    }

    public final int getCurrentMonth() {
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            C14360o3.A0F("monthPicker");
            throw C00O.createAndThrow();
        }
        return numberPicker.getValue();
    }

    public final void A02(int i, int i2) {
        String str;
        A01(this, i);
        NumberPicker numberPicker = this.A01;
        if (numberPicker == null) {
            str = "monthPicker";
        } else {
            numberPicker.setValue(i);
            NumberPicker numberPicker2 = this.A00;
            if (numberPicker2 == null) {
                str = "dayPicker";
            } else {
                numberPicker2.setValue(i2);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgDatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        A00(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgDatePicker(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        A00(context, null);
    }
}
