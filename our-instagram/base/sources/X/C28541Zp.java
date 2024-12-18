package X;

import java.util.EnumMap;

/* renamed from: X.1Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28541Zp {
    public static C28541Zp A00;

    public static void A00(C7P8 c7p8, EnumMap enumMap, C2EY... c2eyArr) {
        for (C2EY c2ey : c2eyArr) {
            enumMap.put((EnumMap) c2ey, (C2EY) c7p8);
        }
    }

    public final C7P8 A01(C2EY c2ey) {
        Object obj = C7P6.A00.get(c2ey);
        StringBuilder sb = new StringBuilder();
        sb.append("No DirectMessagePresenter found for DirectMessageContentType: ");
        sb.append(c2ey);
        C18C.A07(obj, sb.toString());
        return (C7P8) obj;
    }
}
