package X;

import android.content.Context;
import com.instagram.wonderwall.model.WallText;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CKS {
    public static String A00(Context context, WallText wallText) {
        C14360o3.A0B(context, 1);
        if (wallText instanceof WallText.Res) {
            WallText.Res res = (WallText.Res) wallText;
            int i = res.A00;
            String[] strArr = res.A01;
            String string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
            C14360o3.A07(string);
            return string;
        }
        if (wallText instanceof WallText.Raw) {
            return ((WallText.Raw) wallText).A00;
        }
        throw B4Z.A00();
    }
}
