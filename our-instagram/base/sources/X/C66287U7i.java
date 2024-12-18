package X;

import android.content.Context;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* renamed from: X.U7i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66287U7i {
    public C70129W5q A03;
    public InterfaceC72006XEu A04;
    public U7X A05;
    public WDG A06;
    public AbstractC66028TyQ A07;
    public XCA A08;
    public InterfaceC71998XEm A09;
    public File A0A;
    public ExecutorService A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C58647PzK A0F;
    public final X9T A0G;
    public final WG9 A0H;
    public final MYB A0I;
    public final InterfaceC58019Po5 A0J;
    public final AbstractC66037TyZ A0K;
    public final X9U A0L;
    public final X9V A0M;
    public final InterfaceC58105PpU A0N;
    public final InterfaceC71972XDf A0O;
    public final VN4 A0P;
    public final C69489VoC A0Q;
    public final InterfaceC71895X9c A0R;
    public final VK1 A0S;
    public volatile boolean A0T;
    public MediaFormat A02 = null;
    public long A01 = 0;
    public long A00 = 0;

    public static void A00(C66287U7i c66287U7i, boolean z) {
        if (z && c66287U7i.A0T) {
            throw new CancellationException("Operation Cancelled");
        }
    }

    public final int A01() {
        C69489VoC c69489VoC = this.A0Q;
        if (c69489VoC.A0I) {
            return 0;
        }
        if (!c69489VoC.A0M) {
            return 1;
        }
        long j = c69489VoC.A02;
        if (j <= 0) {
            return 4;
        }
        try {
            EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
            return (int) Math.ceil(AbstractC69835VwL.A00(this.A0E, this.A0J, enumC1125356h, c69489VoC) / j);
        } catch (C105764pn | IOException unused) {
            return 4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.VK1, java.lang.Object] */
    public C66287U7i(Context context, XC9 xc9, C58647PzK c58647PzK, X9T x9t, WG9 wg9, MYB myb, InterfaceC58019Po5 interfaceC58019Po5, X9U x9u, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, InterfaceC71972XDf interfaceC71972XDf, C69489VoC c69489VoC, InterfaceC71895X9c interfaceC71895X9c) {
        this.A0E = context;
        this.A0J = interfaceC58019Po5;
        this.A0R = interfaceC71895X9c;
        this.A0Q = c69489VoC;
        this.A0H = wg9;
        this.A0L = x9u;
        this.A0O = interfaceC71972XDf;
        this.A0M = x9v;
        this.A0N = interfaceC58105PpU;
        this.A0G = x9t;
        this.A0K = new C67633Uto(c69489VoC.A07, 1);
        this.A0F = c58647PzK;
        this.A0P = c69489VoC.A0A;
        U7W u7w = c69489VoC.A0B;
        this.A0D = u7w.A0y();
        this.A0C = u7w.A0x();
        xc9 = xc9 == null ? VYA.A00 : xc9;
        ?? obj = new Object();
        obj.A00 = context;
        obj.A05 = interfaceC71895X9c;
        obj.A03 = x9v;
        obj.A02 = interfaceC58019Po5;
        obj.A04 = interfaceC58105PpU;
        obj.A01 = xc9;
        this.A0S = obj;
        this.A0I = myb;
    }
}
