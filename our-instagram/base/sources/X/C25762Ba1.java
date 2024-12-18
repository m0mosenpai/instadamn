package X;

import android.graphics.Shader;

/* renamed from: X.Ba1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25762Ba1 extends C62Y {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ C5Hb A03;

    public C25762Ba1(C5Hb c5Hb, float f, float f2, float f3) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = c5Hb;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        float f = this.A01;
        long A00 = AbstractC119395aw.A00(f, f);
        long A002 = AbstractC119395aw.A00(this.A02, this.A00);
        return AbstractC25292BHl.A00(this.A03, AbstractC133095zb.A04(Float.valueOf(0.15f), Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(0.85f)), 1, A00, A002);
    }
}
