package X;

import android.content.Context;
import com.instagram.friendmap.data.MapText;
import java.util.Arrays;

/* renamed from: X.Kqk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47027Kqk {
    public static final String A00(Context context, MapText mapText) {
        if (mapText instanceof MapText.Res) {
            if (context != null) {
                MapText.Res res = (MapText.Res) mapText;
                int i = res.A00;
                String[] strArr = res.A01;
                String string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
        if (mapText instanceof MapText.Raw) {
            return ((MapText.Raw) mapText).A00;
        }
        throw B4Z.A00();
    }
}
