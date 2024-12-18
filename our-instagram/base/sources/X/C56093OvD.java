package X;

/* renamed from: X.OvD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56093OvD implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_series";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56093OvD c56093OvD = (C56093OvD) obj;
        C14360o3.A0B(c56093OvD, 0);
        if (C14360o3.A0K(this.A01, c56093OvD.A01) && C14360o3.A0K(this.A00, c56093OvD.A00)) {
            return true;
        }
        return false;
    }

    public C56093OvD(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
