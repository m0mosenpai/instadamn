package X;

/* renamed from: X.192, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass192 extends C0YY implements InterfaceC16620sF {
    public static final AnonymousClass192 A00 = new AnonymousClass192();

    public AnonymousClass192() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C12W c12w = (C12W) obj;
        C12V c12v = (C12V) obj2;
        C14360o3.A0B(c12w, 0);
        C14360o3.A0B(c12v, 1);
        C12W minusKey = c12w.minusKey(c12v.getKey());
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        if (minusKey != anonymousClass191) {
            C212512c c212512c = C12X.A00;
            C12V c12v2 = minusKey.get(c212512c);
            if (c12v2 == null) {
                return new AnonymousClass193(c12v, minusKey);
            }
            C12W minusKey2 = minusKey.minusKey(c212512c);
            if (minusKey2 == anonymousClass191) {
                return new AnonymousClass193(c12v2, c12v);
            }
            return new AnonymousClass193(c12v2, new AnonymousClass193(c12v, minusKey2));
        }
        return c12v;
    }
}
