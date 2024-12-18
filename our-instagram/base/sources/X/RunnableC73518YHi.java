package X;

import com.instagram.location.impl.LocationPluginImpl;

/* renamed from: X.YHi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73518YHi implements Runnable {
    public final /* synthetic */ C140286Wg A00;
    public final /* synthetic */ LocationPluginImpl A01;

    public RunnableC73518YHi(C140286Wg c140286Wg, LocationPluginImpl locationPluginImpl) {
        this.A01 = locationPluginImpl;
        this.A00 = c140286Wg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C218914p c218914p = C218914p.A08;
        C218914p.A0C.add(new XZJ(this));
    }
}
