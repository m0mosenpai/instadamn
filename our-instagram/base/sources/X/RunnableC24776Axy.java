package X;

import android.graphics.Bitmap;

/* renamed from: X.Axy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24776Axy implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ C8NW A02;

    public RunnableC24776Axy(Bitmap bitmap, android.net.Uri uri, C8NW c8nw) {
        this.A00 = bitmap;
        this.A01 = uri;
        this.A02 = c8nw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (bitmap != null) {
            A1C.append("keyboard_content__");
            String A0v = AbstractC166997dE.A0v(this.A01, A1C);
            C148276lx c148276lx = C148276lx.A0a;
            C148276lx A04 = AbstractC148296lz.A04(bitmap, EnumC150226pU.A0t, "keyboard_content_id", A0v, 0.6f);
            C8NW c8nw = this.A02;
            c8nw.DoZ(C194808jg.A01(c8nw.A0f, c8nw.A0r, A04), A04, null);
            return;
        }
        A1C.append("failed to import image ");
        AbstractC12120kG.A0E("StickerOverlayController", AbstractC166997dE.A0v(this.A01, A1C), null);
        C9GR.A0A(this.A02.A0f, "failed_to_import_image");
    }
}
