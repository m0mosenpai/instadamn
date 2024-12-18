package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.LcJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48466LcJ implements InterfaceC1345866i {
    public final /* synthetic */ C7TG A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ C183978Ee A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C48466LcJ(C7TG c7tg, DirectThreadKey directThreadKey, C183978Ee c183978Ee, Boolean bool, String str, boolean z) {
        this.A00 = c7tg;
        this.A01 = directThreadKey;
        this.A02 = c183978Ee;
        this.A05 = z;
        this.A04 = str;
        this.A03 = bool;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 0);
        try {
            C7TG c7tg = this.A00;
            DirectThreadKey directThreadKey = this.A01;
            C183978Ee c183978Ee = this.A02;
            boolean z = this.A05;
            C7TG.A05(null, null, c7tg, null, directThreadKey, null, c183978Ee, this.A03, this.A04, null, null, z, false);
            c1346766r.A02(new C48495Lcm(2));
        } catch (IllegalStateException e) {
            c1346766r.A02(new C48496Lcn(e));
        }
        c1346766r.A00();
    }
}
