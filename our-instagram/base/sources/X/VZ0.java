package X;

import android.content.res.Resources;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VZ0 {
    public static List A00;

    public static ArrayList A00(Resources resources) {
        List list = A00;
        if (list == null) {
            String[] stringArray = resources.getStringArray(R.array.quiz_sticker_answer_row_hint_text);
            list = Arrays.asList(new C38784H5y(null, null, stringArray[0], null), new C38784H5y(null, null, stringArray[1], null));
            A00 = list;
        }
        return new ArrayList(list);
    }
}
