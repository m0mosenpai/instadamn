package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class AOH implements DialogInterface.OnClickListener {
    public final /* synthetic */ C8NW A00;
    public final /* synthetic */ String A01;

    public AOH(C8NW c8nw, String str) {
        this.A00 = c8nw;
        this.A01 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C8NW c8nw = this.A00;
        AbstractC55215Oed.A05(c8nw.A0o, c8nw.A0r, "STICKER_TRAY", this.A01);
    }
}
