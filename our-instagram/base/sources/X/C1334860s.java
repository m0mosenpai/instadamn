package X;

import android.content.Context;
import com.facebook.msys.mci.ProxyProvider;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Map;

/* renamed from: X.60s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1334860s {
    public boolean A00;
    public final Context A01;
    public final C1335360y A02;
    public final AnonymousClass611 A03;
    public final ProxyProvider A04;
    public final AnonymousClass610 A05;
    public final AnonymousClass610 A06;
    public final AnonymousClass610 A07;
    public final QuickPerformanceLogger A08;
    public final UserFlowLogger A09;
    public final AnonymousClass612 A0A;
    public final C1335160w A0B;
    public final Integer A0C;
    public final Runnable A0D;
    public final String A0E;
    public final Map A0F;

    public C1334860s(Context context, C1335360y c1335360y, AnonymousClass611 anonymousClass611, ProxyProvider proxyProvider, AnonymousClass610 anonymousClass610, AnonymousClass610 anonymousClass6102, AnonymousClass610 anonymousClass6103, QuickPerformanceLogger quickPerformanceLogger, UserFlowLogger userFlowLogger, AnonymousClass612 anonymousClass612, C1335160w c1335160w, Integer num, Runnable runnable, String str, Map map, boolean z) {
        this.A01 = context;
        this.A05 = anonymousClass610;
        this.A0E = str;
        this.A0B = c1335160w;
        this.A02 = c1335360y;
        this.A0A = anonymousClass612;
        this.A03 = anonymousClass611;
        this.A06 = anonymousClass6102;
        this.A04 = proxyProvider;
        this.A08 = quickPerformanceLogger;
        this.A0C = num;
        this.A07 = anonymousClass6103;
        this.A09 = userFlowLogger;
        this.A0D = runnable;
        this.A0F = map;
        this.A00 = z;
    }
}
