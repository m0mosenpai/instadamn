package X;

/* renamed from: X.Wcv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70562Wcv implements C2JL {
    public final /* synthetic */ C2OS A00;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
    }

    public C70562Wcv(C2OS c2os) {
        this.A00 = c2os;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C68864VdK c68864VdK = (C68864VdK) obj;
        if (c68864VdK != null) {
            C68863VdJ c68863VdJ = c68864VdK.A00;
            if (c68863VdJ != null) {
                C69252VkL c69252VkL = c68863VdJ.A00;
                if (c69252VkL != null) {
                    Integer num = c69252VkL.A03;
                    Integer num2 = c69252VkL.A02;
                    C2OS.A00(c69252VkL.A00, this.A00, c69252VkL.A01, num, num2);
                    return;
                }
                str = "screenTimeSettings";
            } else {
                str = "data";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
