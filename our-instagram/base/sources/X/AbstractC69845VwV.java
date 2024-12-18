package X;

import java.util.List;

/* renamed from: X.VwV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69845VwV {
    /* JADX WARN: Type inference failed for: r0v1, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.VKA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.VKA, java.lang.Object, X.UvZ] */
    public static final VKA A00(Integer num, List list) {
        switch (num.intValue()) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            case 3:
                return new Object();
            case 4:
                return new Object();
            case 5:
                return new Object();
            case 6:
                return new Object();
            case 7:
                return new Object();
            case 8:
                ?? obj = new Object();
                obj.A00 = list;
                return obj;
            case 9:
                return new C67669Uvh();
            case 10:
                return new C67667Uvf();
            default:
                throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(339), A01(num));
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MAX_LENGTH";
            case 2:
                return "EXACT_LENGTH";
            case 3:
                return "REGEX";
            case 4:
                return "EMPTY";
            case 5:
                return "US_STATE";
            case 6:
                return "DATE";
            case 7:
                return "CARD";
            case 8:
                return "CARD_TYPE";
            case 9:
                return "US_PHONE";
            case 10:
                return "PHONE";
            default:
                return "MIN_LENGTH";
        }
    }
}
