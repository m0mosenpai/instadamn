package X;

import android.content.Context;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.8ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190858ch {
    public static final void A01(Context context, Spannable spannable, int i, int i2, int i3) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(spannable, 1);
        if (i < 0 || i2 < 0 || i >= i2) {
            int i4 = 0;
            C4GL.A05(spannable, C190868ci.class);
            i = 0;
            if (spannable.length() == 0) {
                A02(context, spannable, 0, spannable.length(), i3);
            }
            C6S0[] c6s0Arr = (C6S0[]) C4GL.A06(spannable, C6S0.class);
            int length = c6s0Arr.length;
            while (i4 < length) {
                C6S0 c6s0 = c6s0Arr[i4];
                int spanStart = spannable.getSpanStart(c6s0);
                int spanEnd = spannable.getSpanEnd(c6s0);
                c6s0.ERf(i3, i3);
                A02(context, spannable, spanStart, spanEnd, i3);
                if (i < spanStart) {
                    A02(context, spannable, i, spanStart, i3);
                }
                i4++;
                i = spanEnd;
            }
            i2 = spannable.length();
            if (i >= i2) {
                return;
            }
        }
        A02(context, spannable, i, i2, i3);
    }

    public static final void A02(Context context, Spannable spannable, int i, int i2, int i3) {
        C190888ck c190888ck = (C190888ck) C4GL.A00(spannable, C190888ck.class);
        if (c190888ck == null) {
            c190888ck = AbstractC190898cl.A01("classic", null, false);
        }
        for (C6S0 c6s0 : (C6S0[]) C4GL.A06(spannable, C6S0.class)) {
            int spanStart = spannable.getSpanStart(c6s0);
            int spanEnd = spannable.getSpanEnd(c6s0);
            if (spanStart == i && spanEnd == i2) {
                c6s0.ERf(i3, i3);
                i3 = AbstractC13950nL.A08(i3, 1.0f);
            }
        }
        C0s6 A00 = AbstractC13190m5.A00(spannable.getSpans(i, i2, C190868ci.class));
        while (A00.hasNext()) {
            C190868ci c190868ci = (C190868ci) A00.next();
            int spanStart2 = spannable.getSpanStart(c190868ci);
            int spanEnd2 = spannable.getSpanEnd(c190868ci);
            int spanFlags = spannable.getSpanFlags(c190868ci);
            int i4 = c190868ci.A05;
            spannable.removeSpan(c190868ci);
            if (spanStart2 < i && spanEnd2 > i2) {
                InterfaceC190908cm interfaceC190908cm = c190888ck.A03;
                Object c190868ci2 = new C190868ci(context, interfaceC190908cm, i4);
                c190868ci = new C190868ci(context, interfaceC190908cm, i4);
                spannable.setSpan(c190868ci2, spanStart2, i, spanFlags);
            } else if (spanStart2 < i) {
                spannable.setSpan(c190868ci, spanStart2, i, spanFlags);
            } else if (spanEnd2 > i2) {
            }
            spannable.setSpan(c190868ci, i2, spanEnd2, spanFlags);
        }
        spannable.setSpan(new C190868ci(context, c190888ck.A03, i3), i, i2, 18);
    }

    public static final void A03(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(spannable, 1);
        if (i < 0 || i2 < 0 || i >= i2) {
            int i5 = 0;
            C4GL.A05(spannable, C190868ci.class);
            i = 0;
            if (spannable.length() == 0) {
                A04(context, spannable, 0, spannable.length(), i3, i4);
            }
            C6S0[] c6s0Arr = (C6S0[]) C4GL.A06(spannable, C6S0.class);
            int length = c6s0Arr.length;
            while (i5 < length) {
                C6S0 c6s0 = c6s0Arr[i5];
                int spanStart = spannable.getSpanStart(c6s0);
                int spanEnd = spannable.getSpanEnd(c6s0);
                A04(context, spannable, spanStart, spanEnd, i3, i4);
                if (i < spanStart) {
                    A04(context, spannable, i, spanStart, i3, i4);
                }
                i5++;
                i = spanEnd;
            }
            i2 = spannable.length();
            if (i >= i2) {
                return;
            }
        }
        A04(context, spannable, i, i2, i3, i4);
    }

    public static final void A04(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        int i5;
        C190888ck c190888ck = (C190888ck) C4GL.A00(spannable, C190888ck.class);
        if (c190888ck == null) {
            c190888ck = AbstractC190898cl.A01("classic", null, false);
        }
        AbstractC190968cs abstractC190968cs = c190888ck.A04;
        for (C6S0 c6s0 : (C6S0[]) C4GL.A06(spannable, C6S0.class)) {
            int spanStart = spannable.getSpanStart(c6s0);
            int spanEnd = spannable.getSpanEnd(c6s0);
            if (spanStart == i && spanEnd == i2) {
                c6s0.ERf(i3, i4);
            }
        }
        C0s6 A00 = AbstractC13190m5.A00(spannable.getSpans(i, i2, C190868ci.class));
        while (A00.hasNext()) {
            C190868ci c190868ci = (C190868ci) A00.next();
            int spanStart2 = spannable.getSpanStart(c190868ci);
            int spanEnd2 = spannable.getSpanEnd(c190868ci);
            int spanFlags = spannable.getSpanFlags(c190868ci);
            int i6 = c190868ci.A05;
            spannable.removeSpan(c190868ci);
            if (spanStart2 < i && spanEnd2 > i2) {
                InterfaceC190908cm interfaceC190908cm = c190888ck.A03;
                Object c190868ci2 = new C190868ci(context, interfaceC190908cm, i6);
                c190868ci = new C190868ci(context, interfaceC190908cm, i6);
                spannable.setSpan(c190868ci2, spanStart2, i, spanFlags);
            } else if (spanStart2 < i) {
                spannable.setSpan(c190868ci, spanStart2, i, spanFlags);
            } else if (spanEnd2 > i2) {
            }
            spannable.setSpan(c190868ci, i2, spanEnd2, spanFlags);
        }
        C6S5 A002 = AbstractC190978ct.A00(spannable, i, i2);
        InterfaceC190908cm interfaceC190908cm2 = c190888ck.A03;
        if (A002 == C6S5.A06 || A002 == C6S5.A07) {
            i3 = i4;
        }
        Object c190868ci3 = new C190868ci(context, interfaceC190908cm2, i3);
        if (abstractC190968cs != null && (abstractC190968cs instanceof C194948jv)) {
            i5 = 16711698;
        } else {
            i5 = 18;
        }
        spannable.setSpan(c190868ci3, i, i2, i5);
    }

    public static final ArrayList A00(Spannable spannable) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C190868ci c190868ci : (C190868ci[]) C4GL.A06(spannable, C190868ci.class)) {
            hashSet.add(AbstractC13950nL.A0G(c190868ci.A05));
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }
}
