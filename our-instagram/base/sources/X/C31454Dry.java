package X;

/* renamed from: X.Dry, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31454Dry implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    public C31454Dry(String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C31454Dry c31454Dry = (C31454Dry) obj;
        C14360o3.A0B(c31454Dry, 0);
        return C14360o3.A0K(this.A01, c31454Dry.A01);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }
}
