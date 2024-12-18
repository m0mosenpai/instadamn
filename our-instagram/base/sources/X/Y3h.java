package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class Y3h {
    public int A00;
    public ArrayList A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final PendingIntent A05;
    public final Bundle A06;
    public final IconCompat A07;
    public final CharSequence A08;

    public Y3h(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        IconCompat A01 = i != 0 ? IconCompat.A01(null, "", i) : null;
        Bundle bundle = new Bundle();
        this.A02 = true;
        this.A07 = A01;
        this.A08 = XN9.A01(charSequence);
        this.A05 = pendingIntent;
        this.A06 = bundle;
        this.A01 = null;
        this.A02 = true;
        this.A00 = 0;
        this.A04 = false;
        this.A03 = false;
    }

    public final Y0K A01() {
        C72802XnP[] c72802XnPArr;
        CharSequence[] charSequenceArr;
        if (this.A04 && this.A05 == null) {
            throw AbstractC166987dD.A15("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C72802XnP c72802XnP = (C72802XnP) it.next();
                if (!c72802XnP.A05 && (((charSequenceArr = c72802XnP.A06) == null || charSequenceArr.length == 0) && !c72802XnP.A04.isEmpty())) {
                    A1E.add(c72802XnP);
                } else {
                    A1E2.add(c72802XnP);
                }
            }
        }
        C72802XnP[] c72802XnPArr2 = null;
        if (A1E.isEmpty()) {
            c72802XnPArr = null;
        } else {
            c72802XnPArr = (C72802XnP[]) A1E.toArray(new C72802XnP[A1E.size()]);
        }
        if (!A1E2.isEmpty()) {
            c72802XnPArr2 = (C72802XnP[]) A1E2.toArray(new C72802XnP[A1E2.size()]);
        }
        return new Y0K(this.A05, this.A06, this.A07, this.A08, c72802XnPArr2, c72802XnPArr, this.A00, this.A02, true, this.A04, this.A03);
    }

    public static Y3h A00(Notification.Action action) {
        Y3h y3h;
        int length;
        IconCompat A01;
        if (action.getIcon() != null) {
            Icon icon = action.getIcon();
            if (icon.getType() == 2 && icon.getResId() == 0) {
                A01 = null;
            } else {
                A01 = AbstractC58497PwQ.A01(icon);
            }
            y3h = new Y3h(action.actionIntent, A01, action.title);
        } else {
            y3h = new Y3h(action.actionIntent, action.title, action.icon);
        }
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs != null && (length = remoteInputs.length) != 0) {
            int i = 0;
            do {
                C72802XnP A012 = AbstractC72876XqA.A01(remoteInputs[i]);
                ArrayList arrayList = y3h.A01;
                if (arrayList == null) {
                    arrayList = AbstractC166987dD.A1E();
                    y3h.A01 = arrayList;
                }
                arrayList.add(A012);
                i++;
            } while (i < length);
        }
        y3h.A02 = action.getAllowGeneratedReplies();
        y3h.A00 = action.getSemanticAction();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            y3h.A04 = AbstractC72514XfT.A00(action);
            if (i2 >= 31) {
                y3h.A03 = AbstractC72515XfU.A00(action);
            }
        }
        Bundle extras = action.getExtras();
        if (extras != null) {
            y3h.A06.putAll(extras);
        }
        return y3h;
    }

    public Y3h(PendingIntent pendingIntent, IconCompat iconCompat, CharSequence charSequence) {
        Bundle bundle = new Bundle();
        this.A02 = true;
        this.A07 = iconCompat;
        this.A08 = XN9.A01(charSequence);
        this.A05 = pendingIntent;
        this.A06 = bundle;
        this.A01 = null;
        this.A02 = true;
        this.A00 = 0;
        this.A04 = false;
        this.A03 = false;
    }
}
