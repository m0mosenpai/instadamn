package X;

/* renamed from: X.6Hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136786Hh extends C5AY {
    public final C118845a1 A00;
    public final C5E2 A01;

    public C136786Hh(C5XO c5xo, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, float f, float f2, float f3, float f4, boolean z) {
        C136796Hi c136796Hi;
        C14360o3.A0B(c5xo, 6);
        C14360o3.A0B(interfaceC16820sZ2, 10);
        C5E2 c5e2 = new C5E2(c5xo, interfaceC16820sZ2, interfaceC16820sZ, f, f2, f3, f4);
        A0F(c5e2);
        this.A01 = c5e2;
        if (interfaceC16820sZ != null) {
            c136796Hi = new C136796Hi(c5e2);
        } else {
            c136796Hi = null;
        }
        C118845a1 c118845a1 = new C118845a1(c5xo, c5xq, str, c136796Hi, null, new C136806Hj(c5e2), z);
        A0F(c118845a1);
        this.A00 = c118845a1;
    }
}
