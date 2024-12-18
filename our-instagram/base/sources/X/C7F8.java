package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.7F8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7F8 {
    public int A00;
    public final int A01;
    public final Resources A02;

    public C7F8(Context context) {
        C14360o3.A0B(context, 1);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        this.A02 = resources;
        this.A01 = AbstractC53242c7.A0G(context, R.attr.actionBarButtonWidth);
    }

    public final int A00() {
        int i = this.A00;
        if (i == 0) {
            int i2 = this.A02.getDisplayMetrics().heightPixels - this.A01;
            this.A00 = i2;
            return i2;
        }
        return i;
    }
}
