package X;

import android.text.TextPaint;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public abstract class OP7 {
    public static final int A00(TextView textView, Integer num) {
        int[] iArr;
        int i;
        int i2;
        switch (AbstractC43592JPx.A03(num, 0)) {
            case 1:
                iArr = new int[3];
                i = 2131973639;
                iArr[0] = i;
                i2 = 2131960270;
                iArr[1] = i2;
                iArr[2] = 2131976066;
                break;
            case 2:
            case 3:
            default:
                iArr = new int[]{2131973280, 2131960520, 2131960270, 2131976066};
                break;
            case 4:
                iArr = new int[]{2131960436};
                i2 = 2131960440;
                iArr[1] = i2;
                iArr[2] = 2131976066;
                break;
            case 5:
                iArr = new int[]{2131952265};
                i2 = 2131952460;
                iArr[1] = i2;
                iArr[2] = 2131976066;
                break;
            case 6:
                iArr = new int[3];
                i = 2131961561;
                iArr[0] = i;
                i2 = 2131960270;
                iArr[1] = i2;
                iArr[2] = 2131976066;
                break;
            case 7:
            case 8:
                iArr = new int[]{2131964642};
                i2 = 2131964674;
                iArr[1] = i2;
                iArr[2] = 2131976066;
                break;
        }
        return A01(textView, iArr, 0);
    }

    public static final int A01(TextView textView, int[] iArr, int i) {
        TextPaint paint = textView.getPaint();
        int i2 = 0;
        for (int i3 : iArr) {
            String A0t = AbstractC43594JPz.A0t(textView.getResources(), i, i3);
            C14360o3.A07(A0t);
            i2 = Math.max(i2, (int) paint.measureText(A0t));
        }
        return Math.min(Math.max(AbstractC13880nE.A0A(AbstractC166997dE.A0L(textView)) / 3, textView.getResources().getDimensionPixelOffset(R.dimen.avatar_size_ridiculously_xxlarge)), i2);
    }
}
