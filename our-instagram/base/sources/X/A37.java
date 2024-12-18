package X;

import android.content.Context;
import android.util.Pair;
import com.instagram.music.common.model.MusicAssetModel;

/* loaded from: classes4.dex */
public abstract class A37 {
    public static final Pair A00(Context context, MusicAssetModel musicAssetModel, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String str2;
        C5NO c5no = new C5NO(AbstractC166987dD.A0Y(i, i2), 0.0f, -1, i, i2);
        if (!z && musicAssetModel != null) {
            str2 = context.getString(2131954398, musicAssetModel.A0D, musicAssetModel.A0I);
        } else {
            str2 = null;
        }
        C210389Sd c210389Sd = new C210389Sd(context, str, str2, i, i2, i3);
        if (z2) {
            int i4 = C5RM.A0D;
            C5RM c5rm = new C5RM(context, c210389Sd, AbstractC166997dE.A0n());
            c5rm.Efo(0, i3);
            return new Pair(c5rm, c5no);
        }
        return new Pair(c210389Sd, c5no);
    }
}
