package X;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;

/* renamed from: X.UxB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67743UxB extends C117385Sx {
    public long A00;
    public final C68693VaT A01;
    public final LinkedHashMap A02;
    public final Handler A03;

    public C67743UxB(Context context, Handler handler, C4BQ c4bq, C96014Tk c96014Tk, C2VQ c2vq, C68693VaT c68693VaT, InterfaceC117375Sw interfaceC117375Sw, C4BL c4bl, C4TY c4ty, long j, boolean z, boolean z2, boolean z3) {
        super(context, handler, c4bq, c96014Tk, c2vq, interfaceC117375Sw, c4bl, c4ty, null, j, z3);
        ((C117385Sx) this).A0N = z;
        ((C117385Sx) this).A0G = false;
        ((C117385Sx) this).A0M = z2;
        this.A00 = 0L;
        this.A02 = new LinkedHashMap();
        this.A03 = handler;
        this.A01 = c68693VaT;
    }

    @Override // X.C117385Sx, X.AbstractC97194Ye
    public final void A0i(C96094Ts c96094Ts) {
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
        super.A0i(c96094Ts);
    }

    @Override // X.AbstractC97194Ye, X.AbstractC96044Tn
    public final void A0N(C4B6[] c4b6Arr, long j, long j2) {
        super.A0N(c4b6Arr, j, j2);
        this.A00 = j2;
    }

    @Override // X.C117385Sx, X.AbstractC97194Ye
    public final void A0b(long j) {
        W2Q A00;
        super.A0b(j);
        LinkedHashMap linkedHashMap = this.A02;
        Long valueOf = Long.valueOf(j);
        Number number = (Number) linkedHashMap.get(valueOf);
        if (number != null) {
            j = number.longValue();
            linkedHashMap.remove(valueOf);
        }
        C68693VaT c68693VaT = this.A01;
        if (c68693VaT != null && (A00 = c68693VaT.A00.A0D.A00(j)) != null) {
            this.A03.post(new RunnableC71436Wty(A00, this));
        }
    }
}
