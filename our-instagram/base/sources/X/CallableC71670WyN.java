package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.WyN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC71670WyN implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C135266Ab A03;
    public final /* synthetic */ C6FG A04;
    public final /* synthetic */ C102884kP A05;
    public final /* synthetic */ C103054kg A06;
    public final /* synthetic */ C140056Vj A07;

    public CallableC71670WyN(Context context, C135266Ab c135266Ab, C6FG c6fg, C102884kP c102884kP, C103054kg c103054kg, C140056Vj c140056Vj, int i, long j) {
        this.A03 = c135266Ab;
        this.A04 = c6fg;
        this.A02 = context;
        this.A00 = i;
        this.A06 = c103054kg;
        this.A07 = c140056Vj;
        this.A05 = c102884kP;
        this.A01 = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C135276Ac c135276Ac = C135266Ab.A04;
        C135266Ab c135266Ab = this.A03;
        C6FG c6fg = this.A04;
        C78473fD A01 = c135276Ac.A01(this.A02, c135266Ab, c6fg, AbstractC135256Aa.A00(c6fg), this.A00);
        C103054kg c103054kg = this.A06;
        return AbstractC103044kf.A01(EnumC103014kc.A03, c103054kg.A01(this.A07), new ME6(1, this.A01, A01, this.A05, c103054kg));
    }
}
