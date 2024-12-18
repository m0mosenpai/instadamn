package X;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

/* renamed from: X.UxC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67744UxC extends C96024Tl {
    public long A00;
    public final C68694VaU A01;
    public final LinkedHashMap A02;
    public final Handler A03;

    public C67744UxC(Context context, Handler handler, C96014Tk c96014Tk, C2VQ c2vq, C68694VaU c68694VaU, C4XR c4xr, C4BL c4bl, C4TY c4ty, long j, boolean z, boolean z2) {
        super(context, handler, c96014Tk, c2vq, c4xr, c4bl, c4ty, j);
        ((C96024Tl) this).A0X = z;
        ((C96024Tl) this).A0T = false;
        ((C96024Tl) this).A0Y = z2;
        this.A00 = 0L;
        this.A02 = new LinkedHashMap();
        this.A03 = handler;
        this.A01 = c68694VaU;
    }

    @Override // X.C96024Tl, X.AbstractC96034Tm
    public final void A0V(C96094Ts c96094Ts) {
        long j;
        boolean A02 = C2C5.A02(C2C1.A07);
        LinkedHashMap linkedHashMap = this.A02;
        long j2 = c96094Ts.A01;
        Long valueOf = Long.valueOf(j2);
        if (A02) {
            j = j2 - this.A00;
        } else {
            j = c96094Ts.A00;
        }
        MSX.A1N(valueOf, linkedHashMap, j);
        while (linkedHashMap.size() > 1000 && !linkedHashMap.isEmpty()) {
            linkedHashMap.remove(MSZ.A0m(AbstractC166997dE.A14(linkedHashMap)));
        }
        super.A0V(c96094Ts);
    }

    @Override // X.C96024Tl, X.AbstractC96034Tm, X.AbstractC96044Tn
    public final void A0N(C4B6[] c4b6Arr, long j, long j2) {
        super.A0N(c4b6Arr, j, j2);
        this.A00 = j2;
    }

    @Override // X.C96024Tl, X.AbstractC96034Tm
    public final void A0T(long j) {
        W2Q A00;
        super.A0T(j);
        LinkedHashMap linkedHashMap = this.A02;
        Long valueOf = Long.valueOf(j);
        Number number = (Number) linkedHashMap.get(valueOf);
        if (number != null) {
            j = number.longValue();
            linkedHashMap.remove(valueOf);
        }
        C68694VaU c68694VaU = this.A01;
        if (c68694VaU != null && (A00 = c68694VaU.A00.A0D.A00(j)) != null) {
            this.A03.post(new RunnableC71435Wtx(A00, this));
        }
    }
}
