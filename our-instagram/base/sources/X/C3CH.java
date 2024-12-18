package X;

/* renamed from: X.3CH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CH extends C3CI {
    public final C36Y A00;
    public final C65192xH A01;

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        C14360o3.A0B(c3ab, 0);
        Object item = this.A01.getItem(i);
        C14360o3.A0C(item, "null cannot be cast to non-null type com.instagram.feed.feeditem.TaggedEdgePostItem");
        this.A00.A01(((C3CM) item).BQN(), c3ab, i);
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C3CM.class;
    }

    public C3CH(C36Y c36y, C65192xH c65192xH) {
        this.A01 = c65192xH;
        this.A00 = c36y;
    }
}
