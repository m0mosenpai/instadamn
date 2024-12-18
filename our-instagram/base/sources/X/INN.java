package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class INN {
    public final int A00;
    public final String A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;

    public final CharSequence A00(Context context, C57482kN c57482kN) {
        CharSequence charSequence = (CharSequence) this.A02.invoke(context);
        CharSequence charSequence2 = (CharSequence) this.A04.invoke(context);
        CharSequence concat = TextUtils.concat(charSequence, charSequence2);
        int lineCount = c57482kN.A00(concat).getLineCount();
        int i = this.A00;
        if (lineCount > i) {
            SpannableStringBuilder append = AbstractC25225BEi.A0H("…").append(charSequence2);
            C14360o3.A07(append);
            StaticLayout A00 = c57482kN.A00(charSequence);
            C14360o3.A07(A00);
            concat = AbstractC25225BEi.A0H(AbstractC68576VWd.A00(A00, append, c57482kN, charSequence, i)).append((CharSequence) "…").append(charSequence2);
        }
        Object invoke = this.A03.invoke(context);
        if (invoke == null) {
            C14360o3.A0A(concat);
            return concat;
        }
        C14360o3.A0A(concat);
        if (!(concat instanceof Spannable)) {
            concat = AbstractC25225BEi.A0H(concat);
        }
        Spannable spannable = (Spannable) concat;
        spannable.setSpan(invoke, 0, spannable.length(), 33);
        return spannable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof INN) {
            INN inn = (INN) obj;
            if (this.A00 == inn.A00 && C14360o3.A0K(this.A01, inn.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr;
        String str = this.A01;
        if (str != null) {
            objArr = new Object[]{Integer.valueOf(this.A00), str};
        } else {
            objArr = new Object[]{this.A02, this.A04, this.A03, Integer.valueOf(this.A00)};
        }
        return Arrays.hashCode(objArr);
    }

    public INN(String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i) {
        this.A02 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
        this.A03 = interfaceC16660sJ3;
        this.A00 = i;
        this.A01 = str;
    }
}
