package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes9.dex */
public final class OV2 {
    public static final OV2 A00 = new Object();

    public final String A00(Context context) {
        List A002 = AbstractC62824SSw.A00(context, "com.facebook.stella");
        if (A002 == null && (A002 = AbstractC62824SSw.A00(context, "com.facebook.stella_debug")) == null) {
            return "";
        }
        return AbstractC31175DnJ.A0a(".", A002);
    }
}
