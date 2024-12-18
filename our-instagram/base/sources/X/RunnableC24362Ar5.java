package X;

/* renamed from: X.Ar5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24362Ar5 implements Runnable {
    public final /* synthetic */ C193968iH A00;

    public RunnableC24362Ar5(C193968iH c193968iH) {
        this.A00 = c193968iH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C193968iH c193968iH = this.A00;
        if (c193968iH.A03().A1D.isShowing()) {
            AbstractC208329Jr.A06(c193968iH.A0I, c193968iH.A0J, C05F.A0Y);
            c193968iH.A03().A1D.dismiss();
            C9GR.A0F(c193968iH.A0H.requireContext(), "gallery_meta_gallery_netego_album_fetch_failed", 2131963091);
        }
    }
}
