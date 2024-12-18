package X;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.XoU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72835XoU {
    public int A00;
    public int A01;
    public int A02;
    public PendingIntent A03;
    public PendingIntent A04;
    public IconCompat A05;
    public String A06;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XND, java.lang.Object] */
    public final XND A00() {
        String str = this.A06;
        if (str == null) {
            if (this.A04 != null) {
                if (this.A05 == null) {
                    throw AbstractC166987dD.A15("Must supply an icon or shortcut for the bubble");
                }
            } else {
                throw AbstractC166987dD.A15("Must supply pending intent or shortcut to bubble");
            }
        }
        PendingIntent pendingIntent = this.A04;
        PendingIntent pendingIntent2 = this.A03;
        IconCompat iconCompat = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        ?? obj = new Object();
        obj.A04 = pendingIntent;
        obj.A05 = iconCompat;
        obj.A00 = i;
        obj.A01 = i2;
        obj.A03 = pendingIntent2;
        obj.A02 = i3;
        obj.A06 = str;
        obj.A02 = i3;
        return obj;
    }

    @Deprecated
    public C72835XoU() {
    }
}
