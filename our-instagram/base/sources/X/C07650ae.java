package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;

/* renamed from: X.0ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07650ae implements C1K4 {
    public static final C07640ad A00;
    public static final XAnalyticsHolder A01;

    static {
        C07640ad c07640ad = new C07640ad();
        A00 = c07640ad;
        A01 = new XAnalyticsAdapterHolder(c07640ad);
    }

    @Override // X.C1K4
    public final XAnalyticsHolder CI3() {
        return A01;
    }
}
