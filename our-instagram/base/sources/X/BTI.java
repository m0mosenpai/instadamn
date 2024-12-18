package X;

/* loaded from: classes5.dex */
public final class BTI implements C2YT {
    public final C78373f3 A00;

    public BTI(C78373f3 c78373f3) {
        C14360o3.A0B(c78373f3, 1);
        this.A00 = c78373f3;
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C78373f3 c78373f3;
        C14360o3.A0B(c2yr, 0);
        long A00 = C78443fA.A00.A00(0, AbstractC78623fU.A00((int) (j >>> 32)).A02(j), 0, AbstractC78623fU.A00((int) j).A01(j));
        C78373f3 c78373f32 = this.A00;
        C50882Vk c50882Vk = (C50882Vk) c2yr.A01;
        C2WA c2wa = null;
        if (c50882Vk != null) {
            c78373f3 = c50882Vk.A0H;
        } else {
            c78373f3 = null;
        }
        if (!c78373f32.equals(c78373f3) || A00 != c50882Vk.A0D) {
            C75793ak c75793ak = c78373f32.A02.A03;
            if (c75793ak != null) {
                int i = c75793ak.A00;
                if (c50882Vk != null) {
                    c2wa = c50882Vk.A0F;
                }
                c50882Vk = AbstractC78453fB.A00(c2wa, c50882Vk, c78373f32, null, -1, i, A00);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c50882Vk.A01();
        int max = Math.max(C78613fT.A03(j), c50882Vk.A0C);
        int max2 = Math.max(C78613fT.A02(j), c50882Vk.A09);
        c50882Vk.A01();
        return new C2YU(c50882Vk, max, max2);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
