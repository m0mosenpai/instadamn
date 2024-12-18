package X;

import android.os.Looper;
import com.facebook.quicklog.MarkerEditor;

/* renamed from: X.1vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41431vs {
    public static AbstractC12990ll A00;
    public static final C41431vs A01 = new Object();

    public final MarkerEditor A00(C006802i c006802i, int i, int i2) {
        String str;
        String str2;
        MarkerEditor withMarker = c006802i.withMarker(i, i2);
        boolean z = false;
        if (C3KN.A00 != null) {
            z = true;
        }
        withMarker.annotate("is_scrolling", z);
        withMarker.annotate("container_module", C26771Rh.A00().A00);
        withMarker.annotate("is_main_thread", C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper()));
        AbstractC12990ll abstractC12990ll = A00;
        C14360o3.A0C(abstractC12990ll, "null cannot be cast to non-null type com.instagram.common.session.Session");
        C140976Yz c140976Yz = C55772hI.A00(abstractC12990ll).A01;
        if (c140976Yz != null) {
            String str3 = c140976Yz.A03;
            String str4 = "unknown";
            if (str3 == null) {
                str3 = "unknown";
            }
            String str5 = c140976Yz.A00;
            if (str5 != null) {
                str4 = str5;
            }
            str = AnonymousClass001.A0g(str3, " -> ", str4);
        } else {
            str = null;
        }
        withMarker.annotate("navigation_path", str);
        C1KX c1kx = C226218q.A01(AbstractC12960li.A00).A05;
        if (c1kx != null) {
            str2 = c1kx.A0O.name();
        } else {
            str2 = null;
        }
        withMarker.annotate("ongoing_startup_type", str2);
        return withMarker;
    }
}
