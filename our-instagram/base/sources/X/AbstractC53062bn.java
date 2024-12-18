package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.2bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53062bn {
    public static Serializable A00(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC53072bo.A00(bundle);
        }
        Serializable serializable = bundle.getSerializable("arg_ai_voice_launch_source");
        if (EnumC33346Eof.class.isInstance(serializable)) {
            return serializable;
        }
        return null;
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC53072bo.A01(bundle, cls, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList A02(Bundle bundle, Class cls, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC53072bo.A02(bundle, cls, str);
        }
        return bundle.getParcelableArrayList(str);
    }
}
