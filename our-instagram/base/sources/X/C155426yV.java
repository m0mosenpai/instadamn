package X;

import android.R;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6yV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155426yV {
    public final C155406yT A02;
    public final C155406yT A03;
    public final Runnable A04 = new Runnable() { // from class: X.6yW
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = new ArrayList();
            C155426yV c155426yV = C155426yV.this;
            Map map = c155426yV.A05;
            for (C152606tn c152606tn : map.values()) {
                C155406yT c155406yT = c155426yV.A03;
                C155416yU c155416yU = c155406yT.A09;
                c155416yU.A01 = c155406yT.A04.B6q();
                int BM3 = c155406yT.A04.BM3();
                c155416yU.A00 = BM3;
                C155416yU c155416yU2 = c152606tn.A02;
                if (Math.max(c155416yU.A01, c155416yU2.A01) <= Math.min(BM3, c155416yU2.A00)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = c152606tn.A03.values().iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    Map map2 = C207849Hq.A00().A00;
                    Integer valueOf = Integer.valueOf(R.xml.bookmarks);
                    if (map2.get(valueOf) != null) {
                        C006802i.A0p.markerPoint(R.xml.bookmarks, "GRID_MEDIA_LOADED");
                        C006802i.A0p.markerEnd(R.xml.bookmarks, (short) 2);
                        map2.remove(valueOf);
                    }
                    arrayList.add(valueOf);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map.remove(it2.next());
            }
        }
    };
    public final C0JO A01 = new Object();
    public final Map A05 = new HashMap();
    public final Handler A00 = new Handler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0JO, java.lang.Object] */
    public C155426yV(C155406yT c155406yT, C155406yT c155406yT2) {
        this.A03 = c155406yT;
        this.A02 = c155406yT2;
    }
}
