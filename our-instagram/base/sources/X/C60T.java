package X;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.60T, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60T {
    public static final void A00(Spannable spannable, int i, int i2, long j) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(C5AC.A00(j)), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, C114095Cv c114095Cv, int i, int i2) {
        if (c114095Cv != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(c114095Cv, 10));
            Iterator it = c114095Cv.iterator();
            while (it.hasNext()) {
                arrayList.add(((C122575gs) it.next()).A00);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void A02(Spannable spannable, InterfaceC1128957x interfaceC1128957x, int i, int i2, long j) {
        Object relativeSizeSpan;
        long A01 = C118135Vx.A01(j);
        if (A01 == 4294967296L) {
            relativeSizeSpan = new AbsoluteSizeSpan(C1H4.A01(interfaceC1128957x.EqS(j)), false);
        } else if (A01 != 8589934592L) {
            return;
        } else {
            relativeSizeSpan = new RelativeSizeSpan(C118135Vx.A00(j));
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }
}
