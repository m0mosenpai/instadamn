package X;

/* renamed from: X.SsC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63698SsC implements InterfaceC65311Thn {
    public static final C63698SsC A00 = new Object();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.SKz, java.lang.Object] */
    @Override // X.InterfaceC65311Thn
    public final /* bridge */ /* synthetic */ Object E3O(THX thx, float f) {
        boolean z = false;
        if (thx.A0E() == C05F.A00) {
            z = true;
            thx.A0I();
        }
        float A03 = AbstractC58321PtD.A03(thx);
        float A032 = AbstractC58321PtD.A03(thx);
        while (thx.A0Q()) {
            thx.A0N();
        }
        if (z) {
            thx.A0K();
        }
        ?? obj = new Object();
        obj.A00 = (A03 / 100.0f) * f;
        obj.A01 = (A032 / 100.0f) * f;
        return obj;
    }
}
