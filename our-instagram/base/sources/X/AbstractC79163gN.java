package X;

import java.util.Comparator;

/* renamed from: X.3gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79163gN extends AbstractC79173gO {
    public static final Comparator A01 = new Comparator() { // from class: X.3gQ
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C79043gB c79043gB = (C79043gB) obj;
            C79043gB c79043gB2 = (C79043gB) obj2;
            int i = c79043gB.A04.top;
            int i2 = c79043gB2.A04.top;
            if (i == i2 && (i = c79043gB.A02) == (i2 = c79043gB2.A02)) {
                return 0;
            }
            if (i > i2) {
                return 1;
            }
            return -1;
        }
    };
    public static final Comparator A00 = new Comparator() { // from class: X.3gS
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C79043gB c79043gB = (C79043gB) obj;
            C79043gB c79043gB2 = (C79043gB) obj2;
            int i = c79043gB.A04.bottom;
            int i2 = c79043gB2.A04.bottom;
            if (i == i2) {
                int i3 = c79043gB.A02;
                int i4 = c79043gB2.A02;
                if (i3 == i4) {
                    return 0;
                }
                if (i3 < i4) {
                    return 1;
                }
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return -1;
        }
    };
    public static final C79083gF A02 = C79083gF.A02;
}
