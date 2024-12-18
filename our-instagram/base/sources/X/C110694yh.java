package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: X.4yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110694yh {
    public final int A00;
    public final ColorStateList A01;
    public final Configuration A02;

    public C110694yh(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.A01 = colorStateList;
        this.A02 = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.A00 = hashCode;
    }
}
