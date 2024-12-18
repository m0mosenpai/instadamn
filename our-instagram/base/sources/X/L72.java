package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Date;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L72 {
    public final Context A00;
    public final C13920nI A01;

    public L72(Context context, C13920nI c13920nI) {
        C14360o3.A0B(c13920nI, 2);
        this.A00 = context;
        this.A01 = c13920nI;
    }

    public final String A00(Integer num, Date date) {
        Context context;
        int i;
        Object[] objArr;
        String A04;
        String string;
        int A1R = AbstractC167007dF.A1R(0, date, num);
        EnumMap enumMap = new EnumMap(EnumC89613z1.class);
        C23831Eq.A0G(new Date(System.currentTimeMillis()), date, enumMap);
        Map A0B = AbstractC06930Yk.A0B(enumMap);
        int A0K = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC89613z1.A08, A0B));
        int A0K2 = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC89613z1.A05, A0B));
        int A0K3 = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC89613z1.A02, A0B));
        int A0K4 = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC89613z1.A03, A0B));
        int A0K5 = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC89613z1.A04, A0B));
        int A0K6 = AbstractC167017dG.A0K(AbstractC37300Gc1.A0Q(EnumC89613z1.A06, A0B));
        boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
        if (A0K <= 0 && A0K2 <= 0 && A0K3 <= 7) {
            if (A0K3 > 0) {
                Context context2 = this.A00;
                if (A0K3 == A1R) {
                    int i2 = 2131974385;
                    if (A1X) {
                        i2 = 2131961857;
                    }
                    string = context2.getString(i2);
                } else {
                    Resources resources = context2.getResources();
                    int i3 = R.plurals.starts_in_days;
                    if (A1X) {
                        i3 = R.plurals.ends_in_days;
                    }
                    string = AbstractC167017dG.A0k(resources, A0K3, i3);
                }
                C14360o3.A0A(string);
                return string;
            }
            if (A0K4 <= 0 && A0K5 <= 0 && A0K6 <= 0) {
                if (A1X) {
                    return "";
                }
                return AbstractC166997dE.A0p(this.A00, 2131964699);
            }
            context = this.A00;
            i = 2131974383;
            if (A1X) {
                i = 2131961855;
            }
            objArr = new Object[A1R];
            A04 = StringFormatUtil.formatStrLocaleSafe("%02d:%02d:%02d", Integer.valueOf(A0K4), Integer.valueOf(A0K5), Integer.valueOf(A0K6));
        } else {
            context = this.A00;
            i = 2131974384;
            if (A1X) {
                i = 2131961856;
            }
            objArr = new Object[A1R];
            A04 = MX0.A04("MMM d", date.getTime());
        }
        objArr[0] = A04;
        string = context.getString(i, objArr);
        C14360o3.A0A(string);
        return string;
    }
}
