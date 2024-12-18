package X;

/* renamed from: X.EZw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32672EZw extends AbstractRunnableC14200nk {
    public final /* synthetic */ EnumC92794Ds A00;
    public final /* synthetic */ C31641Dv7 A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ java.util.Set A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32672EZw(EnumC92794Ds enumC92794Ds, C31641Dv7 c31641Dv7, Boolean bool, Integer num, String str, String str2, java.util.Set set, boolean z) {
        super(681755983, 3, false, false);
        this.A07 = z;
        this.A01 = c31641Dv7;
        this.A06 = set;
        this.A03 = num;
        this.A00 = enumC92794Ds;
        this.A02 = bool;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A07) {
            this.A01.A04 = true;
            return;
        }
        C31641Dv7 c31641Dv7 = this.A01;
        Integer num = C05F.A00;
        java.util.Set set = this.A06;
        c31641Dv7.A09(this.A00, this.A02, num, this.A03, this.A04, this.A05, set);
    }
}
