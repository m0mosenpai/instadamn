package X;

import android.text.Layout;
import android.text.SpannableString;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class CCT {
    public static final int A00(Layout layout, SpannableString spannableString, SpannableString spannableString2, CTR ctr, Integer num, InterfaceC16600sD interfaceC16600sD, int i) {
        boolean z;
        int i2;
        ArrayList A00 = ctr.A00(layout, num, null);
        if (spannableString2 != null) {
            CharSequence text = layout.getText();
            C14360o3.A07(text);
            z = AbstractC001900j.A0X(text, spannableString2);
        } else {
            z = false;
        }
        int length = layout.getText().length();
        if (z && spannableString2 != null) {
            i2 = spannableString2.length();
        } else {
            i2 = 0;
        }
        int i3 = length - i2;
        int size = A00.size();
        for (int i4 = 0; i4 < size; i4++) {
            C09530e4 c09530e4 = (C09530e4) A00.get(i4);
            if (AbstractC25230BEn.A0F(c09530e4) >= i) {
                int A0F = AbstractC25230BEn.A0F(c09530e4);
                while (A0F < AbstractC25229BEm.A0A(c09530e4)) {
                    int nextSpanTransition = spannableString.nextSpanTransition(A0F, AbstractC25229BEm.A0A(c09530e4), null);
                    int min = Math.min(nextSpanTransition, i3);
                    if (A0F < min) {
                        interfaceC16600sD.invoke(spannableString, AbstractC167007dF.A0o(Integer.valueOf(A0F), min), null, Integer.valueOf(i4));
                    }
                    A0F = nextSpanTransition;
                }
            }
        }
        return A00.size();
    }
}
