package X;

import android.graphics.RectF;
import android.os.Bundle;

/* renamed from: X.7uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC177607uu {
    public static C177597ut A00;

    public static Bundle A00(RectF rectF, EnumC33405Epc enumC33405Epc, boolean z) {
        Bundle bundle = new Bundle();
        if (rectF != null) {
            bundle.putParcelable(AbstractC43591JPw.A00(674), rectF);
        }
        bundle.putSerializable(AbstractC43591JPw.A00(673), enumC33405Epc);
        bundle.putBoolean(AbstractC43591JPw.A00(675), z);
        return bundle;
    }
}
