package X;

import com.instagram.model.payments.CurrencyAmountInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: X.J2u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43079J2u implements Comparable {
    public final int A00;
    public final String A01;
    public final BigDecimal A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C43079J2u c43079J2u = (C43079J2u) obj;
            if (!this.A01.equals(c43079J2u.A01) || !this.A02.equals(c43079J2u.A02) || this.A00 != c43079J2u.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C43079J2u c43079J2u) {
        C18C.A0E(this.A01.equals(c43079J2u.A01));
        C18C.A0E(AbstractC167007dF.A1P(this.A00, c43079J2u.A00));
        return this.A02.compareTo(c43079J2u.A02);
    }

    public final int hashCode() {
        return AbstractC37301Gc2.A02(this.A01, this.A02);
    }

    public final String toString() {
        BigDecimal bigDecimal = this.A02;
        int i = this.A00;
        String str = this.A01;
        C14360o3.A0B(bigDecimal, 0);
        Currency currency = Currency.getInstance(str);
        C14360o3.A07(currency);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(C1Q2.A02());
        currencyInstance.setCurrency(currency);
        double d = i;
        double longValue = bigDecimal.longValue() / d;
        int log10 = (int) Math.log10(d);
        currencyInstance.setMinimumFractionDigits(log10);
        currencyInstance.setMaximumFractionDigits(log10);
        currencyInstance.setRoundingMode(RoundingMode.HALF_UP);
        String format = currencyInstance.format(longValue);
        C14360o3.A07(format);
        return format;
    }

    public C43079J2u(String str, BigDecimal bigDecimal, int i) {
        this.A01 = str;
        this.A02 = bigDecimal;
        this.A00 = i;
    }

    public static C43079J2u A00(CurrencyAmountInfo currencyAmountInfo) {
        return new C43079J2u(currencyAmountInfo.getCurrency(), new BigDecimal(currencyAmountInfo.getAmountWithOffset()), currencyAmountInfo.BYa().intValue());
    }
}
