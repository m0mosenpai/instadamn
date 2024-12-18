package X;

/* renamed from: X.EXy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32624EXy extends C4F4 {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32624EXy c32624EXy = (C32624EXy) obj;
        if (this.A01.equals(c32624EXy.A01) && this.A00.equals(c32624EXy.A00)) {
            return true;
        }
        return false;
    }

    public C32624EXy(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
