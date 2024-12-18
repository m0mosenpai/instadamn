package X;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.XqA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72876XqA {
    public static RemoteInput A00(C72802XnP c72802XnP) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(c72802XnP.A03).setLabel(c72802XnP.A02).setChoices(c72802XnP.A06).setAllowFreeFormInput(c72802XnP.A05).addExtras(c72802XnP.A01);
        Iterator it = c72802XnP.A04.iterator();
        while (it.hasNext()) {
            addExtras.setAllowDataType(AbstractC166987dD.A1B(it), true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC72877XqB.A01(addExtras, c72802XnP.A00);
        }
        return addExtras.build();
    }

    public static C72802XnP A01(Object obj) {
        RemoteInput remoteInput = (RemoteInput) obj;
        String resultKey = remoteInput.getResultKey();
        HashSet A1H = AbstractC166987dD.A1H();
        Bundle bundle = new Bundle();
        int i = 0;
        if (resultKey != null) {
            CharSequence label = remoteInput.getLabel();
            CharSequence[] choices = remoteInput.getChoices();
            boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
            Bundle extras = remoteInput.getExtras();
            if (extras != null) {
                bundle.putAll(extras);
            }
            java.util.Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
            if (allowedDataTypes != null) {
                Iterator<String> it = allowedDataTypes.iterator();
                while (it.hasNext()) {
                    A1H.add(it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                i = AbstractC72877XqB.A00(remoteInput);
            }
            return new C72802XnP(bundle, label, resultKey, A1H, choices, i, allowFreeFormInput);
        }
        throw AbstractC166987dD.A12("Result key can't be null");
    }
}
