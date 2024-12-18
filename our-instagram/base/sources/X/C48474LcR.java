package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.LcR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48474LcR implements InterfaceC1345866i {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C7TG A01;
    public final /* synthetic */ C47588Kzy A02;
    public final /* synthetic */ C3o9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    public C48474LcR(C26086BgF c26086BgF, C7TG c7tg, C47588Kzy c47588Kzy, C3o9 c3o9, String str, String str2, String str3, List list, boolean z) {
        this.A03 = c3o9;
        this.A01 = c7tg;
        this.A00 = c26086BgF;
        this.A08 = z;
        this.A06 = str;
        this.A02 = c47588Kzy;
        this.A05 = str2;
        this.A04 = str3;
        this.A07 = list;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C14360o3.A0B(c1346766r, 0);
        DirectThreadKey A01 = JRE.A01(this.A03);
        C7TG c7tg = this.A01;
        C26086BgF c26086BgF = this.A00;
        boolean z = this.A08;
        String str = this.A06;
        C47588Kzy c47588Kzy = this.A02;
        String str2 = this.A05;
        String str3 = this.A04;
        C7TG.A01(c26086BgF, null, c7tg, c47588Kzy, A01, str, str2, str3, new MEF(c26086BgF, c7tg, c47588Kzy, A01, str, str2, str3, this.A07, z), z);
        c1346766r.A02(new C48495Lcm(1));
        c1346766r.A00();
    }
}
