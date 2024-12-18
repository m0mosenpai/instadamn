package X;

import android.content.res.Resources;
import android.widget.NumberPicker;
import com.facebook.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.igds.components.datepicker.IgDatePicker;
import com.instagram.igds.components.datepicker.IgTimePicker;

/* loaded from: classes11.dex */
public final class WP2 implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WP2(C68740VbJ c68740VbJ, IgDatePicker igDatePicker, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = c68740VbJ;
            this.A02 = igDatePicker;
        } else {
            this.A02 = igDatePicker;
            this.A01 = c68740VbJ;
        }
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        long j;
        IgDatePicker igDatePicker;
        C68740VbJ c68740VbJ;
        String str;
        Integer num;
        Object value;
        int i3;
        long j2;
        switch (this.A00) {
            case 0:
                igDatePicker = (IgDatePicker) this.A02;
                IgDatePicker.A01(igDatePicker, i2);
                c68740VbJ = (C68740VbJ) this.A01;
                break;
            case 1:
                c68740VbJ = (C68740VbJ) this.A01;
                igDatePicker = (IgDatePicker) this.A02;
                break;
            case 2:
                XAt xAt = (XAt) this.A01;
                IgTimePicker igTimePicker = (IgTimePicker) this.A02;
                xAt.DyY(igTimePicker, igTimePicker.getSelectedTime());
                return;
            case 3:
                V02 v02 = (V02) this.A02;
                v02.A00 = i2 + 1;
                NumberPicker numberPicker2 = (NumberPicker) this.A01;
                numberPicker2.setDisplayedValues(null);
                numberPicker2.setMinValue(0);
                numberPicker2.setMaxValue(1);
                numberPicker2.setDisplayedValues(V02.A00(v02));
                long A03 = AbstractC50524MSc.A03();
                boolean z = v02.A03;
                long j3 = v02.A00;
                if (z) {
                    j = SandboxRepository.CACHE_TTL;
                } else {
                    j = 604800;
                }
                v02.A01 = A03 + (j3 * j);
                return;
            default:
                C52122N4v c52122N4v = (C52122N4v) this.A02;
                InterfaceC09390do interfaceC09390do = c52122N4v.A04;
                C50984Mfr c50984Mfr = (C50984Mfr) interfaceC09390do.getValue();
                if (i2 == 0) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                C05A c05a = c50984Mfr.A03;
                do {
                    value = c05a.getValue();
                    C51599Mqr c51599Mqr = (C51599Mqr) value;
                    i3 = c51599Mqr.A00;
                    j2 = c51599Mqr.A01;
                    C14360o3.A0B(num, 0);
                } while (!c05a.AIi(value, new C51599Mqr(num, i3, j2)));
                C51599Mqr c51599Mqr2 = (C51599Mqr) this.A01;
                C52122N4v.A00(c52122N4v, c51599Mqr2.A02, true);
                int i4 = c51599Mqr2.A00;
                NumberPicker numberPicker3 = c52122N4v.A00;
                if (numberPicker3 == null) {
                    str = "durationPicker";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                numberPicker3.setDisplayedValues(null);
                numberPicker3.setMinValue(0);
                numberPicker3.setMaxValue(1);
                Resources A0N = AbstractC166997dE.A0N(c52122N4v);
                Integer valueOf = Integer.valueOf(i4);
                numberPicker3.setDisplayedValues(new String[]{AbstractC31175DnJ.A0W(A0N, valueOf, R.plurals.limits_plus_reminder_day_unit, i4), AbstractC31175DnJ.A0W(AbstractC166997dE.A0N(c52122N4v), valueOf, R.plurals.limits_plus_reminder_week_unit, i4)});
                ((C50984Mfr) interfaceC09390do.getValue()).A00();
                return;
        }
        NumberPicker numberPicker4 = igDatePicker.A01;
        if (numberPicker4 == null) {
            str = "monthPicker";
        } else {
            int value2 = numberPicker4.getValue();
            NumberPicker numberPicker5 = igDatePicker.A00;
            if (numberPicker5 == null) {
                str = "dayPicker";
            } else {
                V1G.A00(c68740VbJ.A00, value2, numberPicker5.getValue());
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public WP2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
