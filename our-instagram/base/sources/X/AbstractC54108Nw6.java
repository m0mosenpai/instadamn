package X;

import android.content.Context;
import android.media.MediaScannerConnection;
import java.util.LinkedList;

/* renamed from: X.Nw6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54108Nw6 {
    public static final void A00(Context context, String str, String str2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        ((MediaScannerConnection) new C55340Oh5(context, str2, linkedList).A00.getValue()).connect();
    }
}
