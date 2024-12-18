package X;

/* renamed from: X.CtV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29164CtV implements C6D2 {
    public static final C29164CtV A00 = new C29164CtV();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String A002;
        AbstractC46422Kgi abstractC46422Kgi = (AbstractC46422Kgi) obj;
        if (abstractC46422Kgi instanceof KOr) {
            return new C27201BzK(((KOr) abstractC46422Kgi).A00);
        }
        if (abstractC46422Kgi instanceof KOs) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("failed to load ");
            A002 = AbstractC166997dE.A0v(((KOs) abstractC46422Kgi).A00, A1C);
        } else {
            A002 = AbstractC43591JPw.A00(54);
        }
        return new C27196BzF(A002);
    }
}
