package X;

import com.instagram.api.schemas.GiphyRequestSurface;

/* loaded from: classes8.dex */
public final class M3K implements Runnable {
    public final /* synthetic */ C218069ke A00;
    public final /* synthetic */ String A01;

    public M3K(C218069ke c218069ke, String str) {
        this.A00 = c218069ke;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C218069ke c218069ke = this.A00;
        String trim = this.A01.trim();
        c218069ke.A02 = trim;
        if (!trim.isEmpty()) {
            L13 l13 = c218069ke.A0H;
            EnumC46201Kcd enumC46201Kcd = EnumC46201Kcd.GIPHY_GIFS;
            boolean z = false;
            if (trim.length() == 0) {
                z = true;
            }
            C1ON A00 = AbstractC47110Ks5.A00((GiphyRequestSurface) l13.A02.get(), l13.A00, trim, AbstractC166987dD.A1J(enumC46201Kcd));
            A00.A00 = new C52227N9q(l13, trim, 0, z);
            C1GJ.A03(A00);
        }
    }
}
