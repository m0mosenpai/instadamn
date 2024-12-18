package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.HashMap;

/* renamed from: X.8Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183298Bb extends AbstractC52922bZ {
    public int A00;
    public C8Ba A01;
    public C8Ba A02;
    public C8Ba A03;
    public final C2GT A04;
    public final C2GS A05;
    public final C2GS A06 = new C2GS();
    public final C2GS A07;
    public final C183308Bd A08;
    public final HashMap A09;
    public final C05A A0A;

    public final C8Ba A00() {
        C8Ba c8Ba = this.A03;
        if (c8Ba != null) {
            return c8Ba;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ void A01(InterfaceC115505Kk interfaceC115505Kk, InterfaceC16620sF interfaceC16620sF) {
        C115475Kh c115475Kh = (C115475Kh) interfaceC115505Kk;
        C14360o3.A0B(c115475Kh, 0);
        C2GS c2gs = this.A05;
        C8Ba c8Ba = this.A01;
        if (c8Ba != null) {
            c2gs.A0B(new C8A8(new C189228Zw(c8Ba, c115475Kh, interfaceC16620sF)));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(C8Ba c8Ba, C8Ba c8Ba2) {
        if (!C14360o3.A0K(this.A03, c8Ba)) {
            this.A03 = c8Ba;
        }
        if (!C14360o3.A0K(this.A01, c8Ba2)) {
            this.A01 = c8Ba2;
            int i = c8Ba2.A01;
            InterfaceC16660sJ interfaceC16660sJ = c8Ba2.A05;
            InterfaceC16620sF interfaceC16620sF = c8Ba2.A07;
            InterfaceC16660sJ interfaceC16660sJ2 = c8Ba2.A04;
            Bitmap.Config config = c8Ba2.A03;
            int i2 = c8Ba2.A00;
            InterfaceC16660sJ interfaceC16660sJ3 = c8Ba2.A06;
            C14360o3.A0B(interfaceC16660sJ, 2);
            C14360o3.A0B(interfaceC16620sF, 3);
            C14360o3.A0B(interfaceC16660sJ2, 4);
            C14360o3.A0B(config, 5);
            C14360o3.A0B(interfaceC16660sJ3, 7);
            this.A02 = new C8Ba(config, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16620sF, i, i, i2);
        }
    }

    public final void A03(C84B c84b, int i) {
        this.A05.A0B(new C8A8(new C189258a0(A00(), (C115475Kh) c84b.A04(i))));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.util.LruCache, X.8Bd, java.lang.Object] */
    public C183298Bb() {
        ?? lruCache = new LruCache(C8Bc.A00());
        this.A08 = lruCache;
        this.A07 = new C2GT(lruCache);
        C2GS c2gs = new C2GS();
        this.A05 = c2gs;
        this.A0A = new C008002u(true);
        this.A04 = c2gs;
        this.A09 = new HashMap();
    }
}
