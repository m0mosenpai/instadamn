package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.EwH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33791EwH {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Context context = C6BQ.A09(c6fq).A00;
        List list = c6fw.A00;
        String A0s = AbstractC31173DnH.A0s(list, 2);
        String A0s2 = AbstractC31173DnH.A0s(list, 4);
        if (A0s != null) {
            AbstractC14490oL.A07(context, A0s, A0s2);
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
