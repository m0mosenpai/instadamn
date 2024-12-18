package X;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8OJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OJ extends C4A7 {
    public int A00;
    public C8OK A01;
    public final C8OK A02;
    public final LinkedHashMap A03;
    public final List A04;
    public final List A05;

    public final Path A00(C8OK c8ok) {
        Object obj;
        Object obj2;
        if (c8ok == this.A02) {
            Iterator it = this.A04.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((C37669Gi2) obj2).A00 == this.A00) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C37669Gi2 c37669Gi2 = (C37669Gi2) obj2;
            if (c37669Gi2 != null) {
                obj = c37669Gi2.A02;
            } else {
                return null;
            }
        } else {
            obj = this.A03.get(c8ok);
        }
        return (Path) obj;
    }

    public C8OJ() {
        super("story_gallery_photo_editor", C4A8.A01(344133468, 3));
        this.A04 = new ArrayList();
        C8OK c8ok = C8OK.A0A;
        this.A05 = AbstractC16960so.A1Q(c8ok, C8OK.A04, C8OK.A0C, C8OK.A07, C8OK.A0F);
        this.A02 = c8ok;
        this.A03 = new LinkedHashMap();
        this.A00 = -1;
        this.A01 = c8ok;
    }
}
