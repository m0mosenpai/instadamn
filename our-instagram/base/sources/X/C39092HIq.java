package X;

/* renamed from: X.HIq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39092HIq extends C4F4 {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C39092HIq c39092HIq = (C39092HIq) obj;
        C14360o3.A0B(c39092HIq, 0);
        if (C14360o3.A0K(this.A01, c39092HIq.A01) && C14360o3.A0K(this.A00, c39092HIq.A00)) {
            return true;
        }
        return false;
    }

    public C39092HIq(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
