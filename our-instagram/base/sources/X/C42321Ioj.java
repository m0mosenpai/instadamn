package X;

/* renamed from: X.Ioj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42321Ioj implements InterfaceC66482zP {
    public final C38656Gyx A00;
    public final C41042IFl A01;
    public final String A02;

    public C42321Ioj(C38656Gyx c38656Gyx, C41042IFl c41042IFl, String str) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A00 = c38656Gyx;
        this.A01 = c41042IFl;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
