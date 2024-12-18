package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.NumberPicker;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class V4V extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new NumberPicker(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        WP0 wp0;
        NumberPicker numberPicker = (NumberPicker) view;
        boolean A1b = AbstractC25233BEq.A1b(numberPicker, c6fg, c102884kP);
        Month month = Month.JANUARY;
        TextStyle textStyle = TextStyle.FULL;
        month.getDisplayName(textStyle, Locale.getDefault());
        String[] strArr = {A00(month, textStyle), A00(Month.FEBRUARY, textStyle), A00(Month.MARCH, textStyle), A00(Month.APRIL, textStyle), A00(Month.MAY, textStyle), A00(Month.JUNE, textStyle), A00(Month.JULY, textStyle), A00(Month.AUGUST, textStyle), A00(Month.SEPTEMBER, textStyle), A00(Month.OCTOBER, textStyle), A00(Month.NOVEMBER, textStyle), A00(Month.DECEMBER, textStyle)};
        InterfaceC103384lE A09 = c102884kP.A09();
        if (A09 != null) {
            wp0 = new WP0(0, c102884kP, c6fg, A09);
        } else {
            wp0 = null;
        }
        numberPicker.setOnValueChangedListener(wp0);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(11);
        if (c6fg.hashCode() != AbstractC68223VIj.A01) {
            AbstractC68223VIj.A01 = c6fg.hashCode();
            int A03 = c102884kP.A03(35, AbstractC68223VIj.A00) - (A1b ? 1 : 0);
            AbstractC68223VIj.A00 = A03;
            numberPicker.setValue(A03);
        } else {
            numberPicker.setValue(AbstractC68223VIj.A00);
        }
        numberPicker.setWrapSelectorWheel(false);
        MSZ.A13(numberPicker);
        if (Build.VERSION.SDK_INT >= 29) {
            numberPicker.setSelectionDividerHeight(A1b ? 1 : 0);
        }
        C12500ku c12500ku = new C12500ku(numberPicker);
        while (c12500ku.hasNext()) {
            ((View) c12500ku.next()).setFocusable(0);
        }
        return null;
    }

    public V4V(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    public static String A00(Month month, TextStyle textStyle) {
        String displayName = month.getDisplayName(textStyle, Locale.getDefault());
        C14360o3.A07(displayName);
        if (displayName.length() == 0) {
            return "";
        }
        String valueOf = String.valueOf(displayName.charAt(0));
        C14360o3.A0C(valueOf, AbstractC111324zv.A00(244));
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        C14360o3.A07(upperCase);
        String substring = displayName.substring(1);
        C14360o3.A07(substring);
        String lowerCase = substring.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return AnonymousClass001.A0R(upperCase, lowerCase);
    }
}
