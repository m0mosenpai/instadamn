package X;

import java.util.List;

/* renamed from: X.NGk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52389NGk extends AbstractRunnableC14200nk {
    public final /* synthetic */ InterfaceC114885Gz A00;
    public final /* synthetic */ C3G7 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52389NGk(InterfaceC114885Gz interfaceC114885Gz, C3G7 c3g7, String str, String str2, List list, boolean z) {
        super(586882412, 3, false, false);
        this.A01 = c3g7;
        this.A04 = list;
        this.A00 = interfaceC114885Gz;
        this.A03 = str;
        this.A05 = z;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3G7 c3g7 = this.A01;
        List list = this.A04;
        C3G7.A02(this.A00, c3g7, this.A03, this.A02, list, this.A05);
    }
}
