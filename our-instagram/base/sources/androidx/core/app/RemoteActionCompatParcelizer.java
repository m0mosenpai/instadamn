package androidx.core.app;

import X.AbstractC37304Gc5;
import X.AbstractC63032Sb4;
import X.InterfaceC175987sE;
import X.Q9o;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes10.dex */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(AbstractC63032Sb4 abstractC63032Sb4) {
        ?? obj = new Object();
        InterfaceC175987sE interfaceC175987sE = obj.A01;
        if (abstractC63032Sb4.A09(1)) {
            interfaceC175987sE = abstractC63032Sb4.A04();
        }
        obj.A01 = (IconCompat) interfaceC175987sE;
        CharSequence charSequence = obj.A03;
        if (abstractC63032Sb4.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((Q9o) abstractC63032Sb4).A05);
        }
        obj.A03 = charSequence;
        CharSequence charSequence2 = obj.A02;
        if (abstractC63032Sb4.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((Q9o) abstractC63032Sb4).A05);
        }
        obj.A02 = charSequence2;
        obj.A00 = (PendingIntent) abstractC63032Sb4.A02(obj.A00, 4);
        boolean z = obj.A04;
        if (abstractC63032Sb4.A09(5)) {
            z = AbstractC37304Gc5.A1V(((Q9o) abstractC63032Sb4).A05);
        }
        obj.A04 = z;
        boolean z2 = obj.A05;
        if (abstractC63032Sb4.A09(6)) {
            z2 = AbstractC37304Gc5.A1V(((Q9o) abstractC63032Sb4).A05);
        }
        obj.A05 = z2;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC63032Sb4 abstractC63032Sb4) {
        IconCompat iconCompat = remoteActionCompat.A01;
        abstractC63032Sb4.A05(1);
        abstractC63032Sb4.A08(iconCompat);
        CharSequence charSequence = remoteActionCompat.A03;
        abstractC63032Sb4.A05(2);
        Parcel parcel = ((Q9o) abstractC63032Sb4).A05;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.A02;
        abstractC63032Sb4.A05(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC63032Sb4.A07(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        abstractC63032Sb4.A05(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.A05;
        abstractC63032Sb4.A05(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
