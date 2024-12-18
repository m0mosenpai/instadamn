package X;

/* renamed from: X.3LS, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3LS implements InterfaceC56512ik {
    public float A00;
    public float A01;

    @Override // X.InterfaceC56512ik
    public final /* bridge */ /* synthetic */ Object COt(float f, Object obj, Object obj2) {
        C3LS c3ls = (C3LS) obj;
        C3LS c3ls2 = (C3LS) obj2;
        float f2 = c3ls.A00;
        float f3 = this.A00;
        c3ls2.A00 = ((f2 - f3) * f) + f3;
        float f4 = c3ls.A01;
        float f5 = this.A01;
        c3ls2.A01 = ((f4 - f5) * f) + f5;
        return c3ls2;
    }
}
