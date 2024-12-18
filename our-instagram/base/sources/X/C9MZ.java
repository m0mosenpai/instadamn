package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9MZ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9MZ {
    public static final Rect A00 = new Rect(-1000, -1000, 1000, 1000);

    public static ArrayList A02(String str) {
        if (str != null && !str.isEmpty() && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            if (!str.equals("(0,0,0,0,0)") && !str.equals("(0, 0, 0, 0, 0)")) {
                ArrayList A1E = AbstractC166987dD.A1E();
                int i = 0;
                do {
                    int indexOf = str.indexOf(41, i);
                    String substring = str.substring(i, indexOf + 1);
                    Camera.Area area = null;
                    if (substring != null && !substring.isEmpty() && substring.charAt(0) == '(' && substring.charAt(substring.length() - 1) == ')') {
                        Rect rect = new Rect();
                        try {
                            int indexOf2 = substring.indexOf(44);
                            rect.left = Integer.parseInt(substring.substring(1, indexOf2).trim());
                            int i2 = indexOf2 + 1;
                            int indexOf3 = substring.indexOf(44, i2);
                            rect.top = Integer.parseInt(substring.substring(i2, indexOf3).trim());
                            int i3 = indexOf3 + 1;
                            int indexOf4 = substring.indexOf(44, i3);
                            rect.right = Integer.parseInt(substring.substring(i3, indexOf4).trim());
                            int i4 = indexOf4 + 1;
                            int indexOf5 = substring.indexOf(44, i4);
                            rect.bottom = Integer.parseInt(substring.substring(i4, indexOf5).trim());
                            int i5 = indexOf5 + 1;
                            int indexOf6 = substring.indexOf(44, i5);
                            if (indexOf6 == -1) {
                                indexOf6 = substring.indexOf(41, i5);
                            }
                            area = new Camera.Area(rect, Integer.parseInt(substring.substring(i5, indexOf6).trim()));
                        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                            android.util.Log.e("ParametersHelper", AnonymousClass001.A0R("Invalid area string=", substring), e);
                        }
                    } else {
                        android.util.Log.e("ParametersHelper", AnonymousClass001.A0R("Invalid area string=", substring));
                    }
                    if (area != null) {
                        A1E.add(area);
                    }
                    i = str.indexOf(40, indexOf);
                } while (i != -1);
                if (!A1E.isEmpty()) {
                    if (A1E.size() == 1) {
                        Camera.Area area2 = (Camera.Area) A1E.get(0);
                        Rect rect2 = area2.rect;
                        rect2.getClass();
                        if (rect2.left == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == 0 && area2.weight == 0) {
                            return null;
                        }
                    }
                    return A1E;
                }
            }
        } else {
            android.util.Log.e("ParametersHelper", AnonymousClass001.A0R("Invalid area string=", str));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r0 >= r1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A00(android.graphics.Rect r6) {
        /*
            android.graphics.Rect r5 = X.C9MZ.A00
            boolean r0 = r6.intersect(r5)
            if (r0 != 0) goto L28
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L28
            int r1 = r6.right
            int r4 = r5.left
            r3 = 0
            if (r1 > r4) goto L3e
            int r1 = r6.left
        L17:
            int r4 = r4 - r1
        L18:
            int r2 = r6.bottom
            int r1 = r5.top
            if (r2 > r1) goto L37
            int r2 = r6.top
        L20:
            int r3 = r1 - r2
        L22:
            r6.offset(r4, r3)
            r6.intersect(r5)
        L28:
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            r1 = 1000(0x3e8, float:1.401E-42)
            android.hardware.Camera$Area r0 = new android.hardware.Camera$Area
            r0.<init>(r6, r1)
            r2.add(r0)
            return r2
        L37:
            int r0 = r6.top
            int r1 = r5.bottom
            if (r0 < r1) goto L22
            goto L20
        L3e:
            int r0 = r6.left
            int r4 = r5.right
            if (r0 >= r4) goto L17
            r4 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9MZ.A00(android.graphics.Rect):java.util.ArrayList");
    }

    public static List A03(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        int size = list.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        for (int i = 0; i < size; i++) {
            Camera.Size size2 = (Camera.Size) list.get(i);
            A17.add(new C176877tj(size2.width, size2.height));
        }
        return Collections.unmodifiableList(A17);
    }

    public static ArrayList A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return AbstractC166987dD.A1E();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator<String> it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            A1E.add(it.next());
        }
        return A1E;
    }
}
