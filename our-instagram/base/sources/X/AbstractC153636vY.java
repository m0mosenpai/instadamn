package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6vY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153636vY {
    public static final Parcelable A00(Bundle bundle, Class cls, String str) {
        C14360o3.A0B(bundle, 0);
        Object A01 = AbstractC53062bn.A01(bundle, cls, str);
        A03(bundle, A01, str);
        return (Parcelable) A01;
    }

    public static final String A01(Bundle bundle, String str) {
        C14360o3.A0B(bundle, 0);
        String string = bundle.getString(str);
        A03(bundle, string, str);
        return string;
    }

    public static final void A03(Bundle bundle, Object obj, String str) {
        if (obj != null) {
            return;
        }
        java.util.Set<String> keySet = bundle.keySet();
        C14360o3.A07(keySet);
        String A0P = AbstractC001800i.A0P(", ", "", "", AbstractC001800i.A0Z(keySet), null);
        StringBuilder sb = new StringBuilder();
        sb.append("Required argument '");
        sb.append(str);
        sb.append("' is missing from ");
        sb.append(bundle);
        sb.append(", included keys are [");
        sb.append(A0P);
        sb.append(']');
        throw new IllegalStateException(sb.toString());
    }

    public static final ArrayList A02(Bundle bundle, Class cls, String str) {
        ArrayList A02 = AbstractC53062bn.A02(bundle, cls, str);
        A03(bundle, A02, str);
        return A02;
    }
}
