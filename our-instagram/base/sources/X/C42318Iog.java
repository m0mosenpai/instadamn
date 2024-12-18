package X;

/* renamed from: X.Iog, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42318Iog implements InterfaceC66482zP {
    public final C38637Gye A00;
    public final String A01;
    public final IHE A02;

    public C42318Iog(C38637Gye c38637Gye, IHE ihe, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c38637Gye;
        this.A02 = ihe;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C38637Gye c38637Gye;
        C42318Iog c42318Iog = (C42318Iog) obj;
        C38637Gye c38637Gye2 = this.A00;
        if (c42318Iog != null) {
            c38637Gye = c42318Iog.A00;
        } else {
            c38637Gye = null;
        }
        return C14360o3.A0K(c38637Gye2, c38637Gye);
    }
}
