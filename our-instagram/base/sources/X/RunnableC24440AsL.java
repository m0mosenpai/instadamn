package X;

/* renamed from: X.AsL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24440AsL implements Runnable {
    public final /* synthetic */ C48632Lf9 A00;

    public RunnableC24440AsL(C48632Lf9 c48632Lf9) {
        this.A00 = c48632Lf9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C187318Ry c187318Ry = this.A00.A00;
        if (c187318Ry.A0R.getCount() == 1 && c187318Ry.A08 == null && AbstractC166987dD.A0x(c187318Ry.A0O).getInt("gallery_thumbnail_tray_preview_tooltip", 0) < 3) {
            C187318Ry.A06(c187318Ry, AbstractC166997dE.A0p(c187318Ry.A0L.getContext(), 2131963127), new B5y(c187318Ry, 40));
        }
    }
}
