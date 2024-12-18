package X;

/* renamed from: X.DcO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30541DcO extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16610sE A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30541DcO(Object obj, String str, InterfaceC16610sE interfaceC16610sE, float f, int i) {
        super(3);
        this.A01 = i;
        this.A03 = str;
        this.A00 = f;
        this.A02 = obj;
        this.A04 = interfaceC16610sE;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AbstractC166987dD.A1a(obj);
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0b(c5Tl, A1a);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1106243795, "com.instagram.barcelona.feed.post.ui.MediaCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostCarousel.kt:635)");
            }
            int i = this.A01;
            if (AbstractC25231BEo.A1Y(new CSQ(this.A02, this.A03, this.A00, i, A1a), c5Tl, this.A04, 0)) {
                C0fH.A00(-1639653177);
            }
        }
        return C0eB.A00;
    }
}
