package X;

import android.graphics.PointF;

/* renamed from: X.SsB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63697SsB implements InterfaceC65311Thn {
    public static final C63697SsB A00 = new Object();

    @Override // X.InterfaceC65311Thn
    public final /* bridge */ /* synthetic */ Object E3O(THX thx, float f) {
        Integer A0E = thx.A0E();
        if (A0E != C05F.A00 && A0E != C05F.A0C) {
            if (A0E == C05F.A0u) {
                PointF pointF = new PointF(AbstractC58321PtD.A03(thx) * f, AbstractC58321PtD.A03(thx) * f);
                while (thx.A0Q()) {
                    thx.A0N();
                }
                return pointF;
            }
            throw AbstractC167007dF.A0c("Cannot convert json to point. Next token is ", AbstractC61651RrR.A00(A0E));
        }
        return AbstractC63319ShS.A02(thx, f);
    }
}
