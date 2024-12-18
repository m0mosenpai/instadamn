package X;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.2bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53072bo {
    public static Serializable A00(Bundle bundle) {
        return bundle.getSerializable("arg_ai_voice_launch_source", EnumC33346Eof.class);
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList A02(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArrayList(str, cls);
    }
}
