package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.LcK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48467LcK implements InterfaceC1345866i {
    public final /* synthetic */ C7TG A00;
    public final /* synthetic */ DirectThreadKey A01;
    public final /* synthetic */ ClipInfo A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C48467LcK(C7TG c7tg, DirectThreadKey directThreadKey, ClipInfo clipInfo, Boolean bool, String str, String str2) {
        this.A00 = c7tg;
        this.A01 = directThreadKey;
        this.A02 = clipInfo;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = bool;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 0);
        C7TG.A04(null, null, this.A00, null, null, this.A01, this.A02, null, this.A03, this.A04, this.A05, null, null, false, false);
        c1346766r.A02(new C48495Lcm(3));
        c1346766r.A00();
    }
}
