package X;

import android.graphics.Rect;
import android.hardware.Camera;
import java.util.List;

/* renamed from: X.7tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176797tb {
    public static final C176807tc A0P = new C176807tc(0);
    public static final C176807tc A0R = new C176807tc(1);
    public static final C176807tc A0W = new C176807tc(2);
    public static final C176807tc A0Z = new C176807tc(3);
    public static final C176807tc A0Y = new C176807tc(60);
    public static final C176807tc A0X = new C176807tc(4);
    public static final C176807tc A0U = new C176807tc(5);
    public static final C176807tc A0M = new C176807tc(6);
    public static final C176807tc A02 = new C176807tc(55);
    public static final C176807tc A0T = new C176807tc(7);
    public static final C176807tc A0r = new C176807tc(8);
    public static final C176807tc A0D = new C176807tc(9);
    public static final C176807tc A0B = new C176807tc(10);
    public static final C176807tc A00 = new C176807tc(11);
    public static final C176807tc A07 = new C176807tc(12);
    public static final C176807tc A09 = new C176807tc(13);
    public static final C176807tc A0a = new C176807tc(14);
    public static final C176807tc A0b = new C176807tc(15);
    public static final C176807tc A0h = new C176807tc(16);
    public static final C176807tc A0i = new C176807tc(17);
    public static final C176807tc A0m = new C176807tc(18);
    public static final C176807tc A0o = new C176807tc(19);
    public static final C176807tc A0w = new C176807tc(20);
    public static final C176807tc A0g = new C176807tc(21);
    public static final C176807tc A0x = new C176807tc(59);
    public static final C176807tc A0L = new C176807tc(22);
    public static final C176807tc A0s = new C176807tc(23);
    public static final C176807tc A0z = new C176807tc(24);
    public static final C176807tc A11 = new C176807tc(25);
    public static final C176807tc A0t = new C176807tc(26);
    public static final C176807tc A0I = new C176807tc(27);
    public static final C176807tc A0E = new C176807tc(30);
    public static final C176807tc A0G = new C176807tc(31);
    public static final C176807tc A0F = new C176807tc(32);
    public static final C176807tc A0q = new C176807tc(33);
    public static final C176807tc A0k = new C176807tc(34);
    public static final C176807tc A10 = new C176807tc(58);
    public static final C176807tc A0y = new C176807tc(35);
    public static final C176807tc A0c = new C176807tc(36);
    public static final C176807tc A0C = new C176807tc(37);
    public static final C176807tc A0f = new C176807tc(38);
    public static final C176807tc A0n = new C176807tc(39);
    public static final C176807tc A0p = new C176807tc(40);
    public static final C176807tc A0j = new C176807tc(41);
    public static final C176807tc A0H = new C176807tc(42);
    public static final C176807tc A0u = new C176807tc(43);
    public static final C176807tc A0S = new C176807tc(44);
    public static final C176807tc A0N = new C176807tc(45);
    public static final C176807tc A0A = new C176807tc(46);
    public static final C176807tc A08 = new C176807tc(47);
    public static final C176807tc A01 = new C176807tc(48);
    public static final C176807tc A0O = new C176807tc(53);
    public static final C176807tc A0d = new C176807tc(54);
    public static final C176807tc A0Q = new C176807tc(56);
    public static final C176807tc A0V = new C176807tc(57);
    public static final C176807tc A0e = new C176807tc(65);
    public static final C176807tc A03 = new C176807tc(66);
    public static final C176807tc A0v = new C176807tc(62);
    public static final C176807tc A0J = new C176807tc(63);
    public static final C176807tc A0K = new C176807tc(64);
    public static final C176807tc A04 = new C176807tc(49);
    public static final C176807tc A05 = new C176807tc(50);
    public static final C176807tc A06 = new C176807tc(51);
    public static final C176807tc A0l = new C176807tc(52);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (((java.lang.Number) r0).intValue() == 17) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r5.A0X.intValue() == 0) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A02(X.C176807tc r7) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC176797tb.A02(X.7tc):java.lang.Object");
    }

    public static String A00(List list) {
        if (list.isEmpty()) {
            return "()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Camera.Area area = (Camera.Area) list.get(i);
            sb.append('[');
            Rect rect = area.rect;
            rect.getClass();
            sb.append(rect.flattenToString());
            sb.append(' ');
            sb.append(area.weight);
            sb.append("] ");
        }
        sb.append(')');
        return sb.toString();
    }
}
