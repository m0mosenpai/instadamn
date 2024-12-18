package X;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes12.dex */
public final class Y0K {

    @Deprecated
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Bundle A08;
    public final boolean A09;
    public final C72802XnP[] A0A;
    public final C72802XnP[] A0B;

    public Y0K(PendingIntent pendingIntent, Bundle bundle, IconCompat iconCompat, CharSequence charSequence, C72802XnP[] c72802XnPArr, C72802XnP[] c72802XnPArr2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = true;
        this.A02 = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.A02;
            if ((i2 == -1 ? ((Icon) iconCompat.A06).getType() : i2) == 2) {
                this.A00 = iconCompat.A04();
            }
        }
        this.A03 = XN9.A01(charSequence);
        this.A01 = pendingIntent;
        this.A08 = bundle == null ? new Bundle() : bundle;
        this.A0A = c72802XnPArr;
        this.A0B = c72802XnPArr2;
        this.A04 = z;
        this.A07 = i;
        this.A06 = z2;
        this.A09 = z3;
        this.A05 = z4;
    }

    public Y0K(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this(pendingIntent, new Bundle(), i != 0 ? IconCompat.A01(null, "", i) : null, charSequence, null, null, 0, true, true, false, false);
    }
}
