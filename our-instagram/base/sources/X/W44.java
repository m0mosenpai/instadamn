package X;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes11.dex */
public final class W44 {
    public static boolean A00;
    public static final W44 A01 = new Object();

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0pQ, java.lang.Object] */
    public final void A00(Context context, Integer num, Integer num2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        if (!A00) {
            C193328hC c193328hC = new C193328hC(context);
            View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(context), null, R.layout.school_graduation_date_picker_dialog, false);
            c193328hC.A0l(A0R);
            int i = Calendar.getInstance().get(2) + 1;
            int i2 = Calendar.getInstance().get(1);
            int i3 = 1;
            int i4 = Calendar.getInstance().get(1);
            ArrayList A1N = AbstractC16960so.A1N(Integer.valueOf(i4));
            do {
                AbstractC166997dE.A1W(A1N, i4 + i3);
                i3++;
            } while (i3 < 5);
            Integer[] numArr = (Integer[]) A1N.toArray(new Integer[0]);
            View requireViewById = A0R.requireViewById(R.id.year_picker);
            NumberPicker numberPicker = (NumberPicker) requireViewById;
            int length = numArr.length;
            numberPicker.setMaxValue(length - 1);
            numberPicker.setMinValue(0);
            ArrayList arrayList = new ArrayList(length);
            for (Integer num3 : numArr) {
                arrayList.add(String.valueOf(num3.intValue()));
            }
            numberPicker.setDisplayedValues(AbstractC31173DnH.A1b(arrayList, 0));
            numberPicker.setWrapSelectorWheel(false);
            if (num2 != null) {
                numberPicker.setValue(AbstractC009903n.A02(numArr, num2));
            }
            C14360o3.A07(requireViewById);
            View requireViewById2 = A0R.requireViewById(R.id.month_picker);
            NumberPicker numberPicker2 = (NumberPicker) requireViewById2;
            String[] stringArray = context.getResources().getStringArray(R.array.graduation_date_picker_months);
            C14360o3.A07(stringArray);
            numberPicker2.setMaxValue(stringArray.length);
            numberPicker2.setMinValue(1);
            numberPicker2.setDisplayedValues(stringArray);
            numberPicker2.setWrapSelectorWheel(false);
            if (num != null) {
                numberPicker2.setValue(num.intValue());
            } else {
                numberPicker2.setValue(i);
            }
            C14360o3.A07(requireViewById2);
            ?? obj = new Object();
            ?? obj2 = new Object();
            numberPicker.setOnScrollListener(new C70269WOy(numberPicker, numberPicker2, obj, obj2, numArr, i2, i));
            numberPicker2.setOnScrollListener(new C70270WOz(numberPicker, numberPicker2, obj2, obj, numArr, i2, i));
            numberPicker.setOnValueChangedListener(new WP1(numberPicker, numberPicker2, obj, obj2, numArr, i2, i, 0));
            numberPicker2.setOnValueChangedListener(new WP1(numberPicker, numberPicker2, obj, obj2, numArr, i2, i, 1));
            DialogInterfaceOnClickListenerC70207WHl dialogInterfaceOnClickListenerC70207WHl = new DialogInterfaceOnClickListenerC70207WHl(3, numberPicker2, interfaceC16620sF, numArr, numberPicker);
            WHP whp = new WHP(interfaceC16820sZ, 52);
            c193328hC.A0J(dialogInterfaceOnClickListenerC70207WHl, 2131972699);
            c193328hC.A0D(whp);
            c193328hC.A02();
            Dialog A02 = c193328hC.A02();
            A00 = true;
            C0fJ.A00(A02);
        }
    }
}
