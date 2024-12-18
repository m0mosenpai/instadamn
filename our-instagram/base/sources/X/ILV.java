package X;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes7.dex */
public final class ILV {
    public String A00;
    public List A01 = ImmutableList.of();

    public final SpannableStringBuilder A00() {
        Object styleSpan;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(this.A00);
        List<IHT> list = this.A01;
        if (list != null && !list.isEmpty()) {
            for (IHT iht : list) {
                Integer num = iht.A00.A00;
                if (num != null) {
                    int intValue = num.intValue();
                    int i = 1;
                    if (intValue != 1) {
                        i = 2;
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    styleSpan = new StrikethroughSpan();
                                }
                            } else {
                                styleSpan = new UnderlineSpan();
                            }
                            int intValue2 = iht.A02.intValue();
                            A0H.setSpan(styleSpan, intValue2, iht.A01.intValue() + intValue2, 0);
                        }
                    }
                    styleSpan = new StyleSpan(i);
                    int intValue22 = iht.A02.intValue();
                    A0H.setSpan(styleSpan, intValue22, iht.A01.intValue() + intValue22, 0);
                }
                String str = iht.A00.A01;
                if (str != null) {
                    int intValue3 = iht.A02.intValue();
                    AnonymousClass773.A05(A0H, new C50761MbS(AbstractC08820cl.A03(str)), A0H.subSequence(intValue3, iht.A01.intValue() + intValue3).toString());
                }
            }
        }
        return A0H;
    }
}
