package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ab0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23485Ab0 implements C1MU {
    public static C23485Ab0 A03;
    public static final C225969yF A04 = new Object();
    public final LightweightQuickPerformanceLogger A00;
    public final C23111Aq A01;
    public final Map A02 = new ConcurrentHashMap();

    @Override // X.C1MU
    public final /* bridge */ /* synthetic */ void DXo(C1F9 c1f9, C1B1 c1b1, File file) {
        throw AbstractC166987dD.A15("masterPath");
    }

    public C23485Ab0(C23111Aq c23111Aq) {
        this.A01 = c23111Aq;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c23111Aq.A07;
        C14360o3.A07(lightweightQuickPerformanceLogger);
        this.A00 = lightweightQuickPerformanceLogger;
    }
}
