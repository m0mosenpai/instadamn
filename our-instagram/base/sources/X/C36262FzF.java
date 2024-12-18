package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.FzF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36262FzF implements InterfaceC1345866i {
    public final /* synthetic */ C50679MYx A00;
    public final /* synthetic */ L7G A01;
    public final /* synthetic */ AnonymousClass442 A02;
    public final /* synthetic */ C7TG A03;
    public final /* synthetic */ C47588Kzy A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ Long A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    public C36262FzF(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, C7TG c7tg, C47588Kzy c47588Kzy, DirectThreadKey directThreadKey, Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.A03 = c7tg;
        this.A05 = directThreadKey;
        this.A0F = str;
        this.A0C = str2;
        this.A0G = z;
        this.A02 = anonymousClass442;
        this.A0E = str3;
        this.A0D = str4;
        this.A01 = l7g;
        this.A04 = c47588Kzy;
        this.A0B = str5;
        this.A00 = c50679MYx;
        this.A06 = num;
        this.A07 = num2;
        this.A0A = str6;
        this.A0H = z2;
        this.A08 = num3;
        this.A09 = l;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        Object c48496Lcn;
        C14360o3.A0B(c1346766r, 0);
        C7TG c7tg = this.A03;
        DirectThreadKey directThreadKey = this.A05;
        String str = this.A0F;
        String str2 = this.A0C;
        boolean z = this.A0G;
        AnonymousClass442 anonymousClass442 = this.A02;
        String str3 = this.A0E;
        String str4 = this.A0D;
        L7G l7g = this.A01;
        C47588Kzy c47588Kzy = this.A04;
        String str5 = this.A0B;
        String A0D = c7tg.A0D(this.A00, l7g, anonymousClass442, c47588Kzy, directThreadKey, this.A06, this.A07, this.A08, this.A09, str, str2, str3, str4, str5, this.A0A, z, this.A0H);
        if (A0D != null) {
            c48496Lcn = new C132955zK(A0D);
        } else {
            c48496Lcn = new C48496Lcn(AbstractC166987dD.A14("Mutation ID is null"));
        }
        c1346766r.A02(c48496Lcn);
        c1346766r.A00();
    }
}
