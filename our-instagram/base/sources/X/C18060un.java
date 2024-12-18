package X;

import android.content.ClipData;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18060un implements InterfaceC006102b {
    public final ContentInfo.Builder A00;

    @Override // X.InterfaceC006102b
    public final C006302d AEN() {
        return new C006302d(new C18030uj(this.A00.build()));
    }

    @Override // X.InterfaceC006102b
    public final void ERT(ClipData clipData) {
        this.A00.setClip(clipData);
    }

    @Override // X.InterfaceC006102b
    public final void EUb(int i) {
        this.A00.setFlags(i);
    }

    @Override // X.InterfaceC006102b
    public final void EYD(android.net.Uri uri) {
        this.A00.setLinkUri(uri);
    }

    @Override // X.InterfaceC006102b
    public final void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public C18060un(C006302d c006302d) {
        this.A00 = new ContentInfo.Builder(c006302d.A01());
    }

    public C18060un(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }
}
