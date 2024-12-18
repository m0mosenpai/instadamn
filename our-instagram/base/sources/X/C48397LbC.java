package X;

/* renamed from: X.LbC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48397LbC implements C6D2 {
    public static final C48397LbC A00 = new C48397LbC();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        AbstractC46361Kfj abstractC46361Kfj = (AbstractC46361Kfj) obj;
        if (C14360o3.A0K(abstractC46361Kfj, K53.A00)) {
            return C27206BzP.A00;
        }
        if (C14360o3.A0K(abstractC46361Kfj, K52.A00)) {
            str = "block store not available";
        } else if (abstractC46361Kfj instanceof K54) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("error when saving rc:  ");
            str = AbstractC166997dE.A0v(((K54) abstractC46361Kfj).A00, A1C);
        } else {
            str = "unknown error";
        }
        return new C27202BzL(str);
    }
}
