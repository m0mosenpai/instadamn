package X;

/* renamed from: X.6OX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OX extends C0YY implements InterfaceC16620sF {
    public static final C6OX A00 = new C6OX();

    public C6OX() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C113525Ap c113525Ap = (C113525Ap) obj2;
        C113505An c113505An = ((C113525Ap) obj).A05;
        C113565At c113565At = AbstractC113545Ar.A0V;
        B6D b6d = B6D.A00;
        Object obj3 = c113505An.A02.get(c113565At);
        if (obj3 == null) {
            obj3 = b6d.invoke();
        }
        float floatValue = ((Number) obj3).floatValue();
        C113505An c113505An2 = c113525Ap.A05;
        B6E b6e = B6E.A00;
        Object obj4 = c113505An2.A02.get(c113565At);
        if (obj4 == null) {
            obj4 = b6e.invoke();
        }
        return Integer.valueOf(Float.compare(floatValue, ((Number) obj4).floatValue()));
    }
}
