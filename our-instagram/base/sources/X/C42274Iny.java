package X;

import android.util.LruCache;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Iny, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42274Iny implements InterfaceC41501vz, InterfaceC13000lm {
    public static final long A04 = TimeUnit.MILLISECONDS.convert(15, TimeUnit.MINUTES);
    public final long A00;
    public final LruCache A01;
    public final C13920nI A02;
    public final HashMap A03;

    public /* synthetic */ C42274Iny(C13920nI c13920nI) {
        long j = A04;
        C14360o3.A0B(c13920nI, 1);
        this.A02 = c13920nI;
        this.A00 = j;
        this.A01 = new LruCache(30);
        this.A03 = new HashMap(30);
    }

    public final void A00() {
        this.A01.evictAll();
        this.A03.clear();
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1128884658);
        int A032 = C0f9.A03(-1604188603);
        A00();
        C0f9.A0A(-258755183, A032);
        C0f9.A0A(205573268, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A00();
    }
}
