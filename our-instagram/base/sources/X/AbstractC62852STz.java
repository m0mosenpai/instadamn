package X;

import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.STz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62852STz {
    public static final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public static C58564Pxg A00(String keyUri) {
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            C58564Pxg c58564Pxg = (C58564Pxg) it.next();
            if (keyUri.toLowerCase(Locale.US).startsWith("android-keystore://")) {
                return c58564Pxg;
            }
        }
        throw AbstractC58318PtA.A0x(AnonymousClass001.A0R("No KMS client does support: ", keyUri));
    }
}
