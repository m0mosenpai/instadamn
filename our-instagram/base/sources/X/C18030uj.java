package X;

import android.content.ClipData;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.0uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18030uj implements InterfaceC006202c {
    public final ContentInfo A00;

    @Override // X.InterfaceC006202c
    public final ClipData Ao3() {
        return this.A00.getClip();
    }

    @Override // X.InterfaceC006202c
    public final int B6x() {
        return this.A00.getFlags();
    }

    @Override // X.InterfaceC006202c
    public final android.net.Uri BNZ() {
        return this.A00.getLinkUri();
    }

    @Override // X.InterfaceC006202c
    public final int Byc() {
        return this.A00.getSource();
    }

    @Override // X.InterfaceC006202c
    public final ContentInfo CHu() {
        return this.A00;
    }

    @Override // X.InterfaceC006202c
    public final Bundle getExtras() {
        return this.A00.getExtras();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public C18030uj(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.A00 = contentInfo;
    }
}
