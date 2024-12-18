package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U4m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66216U4m extends TouchDelegate {
    public static final Rect A01 = new Rect();
    public final List A00;

    public C66216U4m(C2WS c2ws, List list) {
        super(A01, c2ws);
        this.A00 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            this.A00.add(new C66217U4n((C66219U4p) list.get(i), c2ws));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (r12.contains(r11, r10) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        if (r15.getAction() == 1) goto L44;
     */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66216U4m.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
