package X;

/* renamed from: X.HIt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39095HIt extends C4F4 {
    public final String A00;
    public final String A01;
    public final String A02;

    public C39095HIt(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C39095HIt c39095HIt = (C39095HIt) obj;
        C14360o3.A0B(c39095HIt, 0);
        if (C14360o3.A0K(this.A02, c39095HIt.A02) && C14360o3.A0K(this.A01, c39095HIt.A01) && C14360o3.A0K(this.A00, c39095HIt.A00)) {
            return true;
        }
        return false;
    }
}
