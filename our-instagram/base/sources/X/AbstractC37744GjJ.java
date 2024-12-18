package X;

import com.instagram.clips.intf.ClipsViewerSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GjJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37744GjJ {
    public static boolean A00;
    public static final List A02;
    public static final C37680GiH A01 = new Object();
    public static final List A03 = AbstractC16960so.A1Q(ClipsViewerSource.A1s, ClipsViewerSource.A22);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.GiH] */
    static {
        List A1Q = AbstractC16960so.A1Q(ClipsViewerSource.A0g, ClipsViewerSource.A11, ClipsViewerSource.A12, ClipsViewerSource.A13, ClipsViewerSource.A0V, ClipsViewerSource.A1S, ClipsViewerSource.A2C, ClipsViewerSource.A10, ClipsViewerSource.A1X, ClipsViewerSource.A1T, ClipsViewerSource.A1D, ClipsViewerSource.A25);
        ArrayList A0i = AbstractC167007dF.A0i(A1Q);
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            A0i.add(AnonymousClass001.A0R("clips_viewer_", ((ClipsViewerSource) it.next()).A00));
        }
        A02 = A0i;
    }
}
