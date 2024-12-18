package X;

/* renamed from: X.Su3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63809Su3 implements InterfaceC65477Tku {
    public final SAY A00;

    @Override // X.InterfaceC65477Tku
    public final SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        return new SFV(new C63726Ssg(obj), new C63767StN(this.A00, obj.toString()));
    }

    public C63809Su3(SAY say) {
        this.A00 = say;
    }

    @Override // X.InterfaceC65477Tku
    public final boolean CKb(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
