package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.LsS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49394LsS implements InterfaceC89443yk {
    public final /* synthetic */ KIT A00;
    public final /* synthetic */ C161467Lh A01;

    public C49394LsS(KIT kit, C161467Lh c161467Lh) {
        this.A01 = c161467Lh;
        this.A00 = kit;
    }

    @Override // X.InterfaceC89443yk
    public final void D3U(ClickableSpan clickableSpan, View view, String str) {
        String str2 = this.A01.A04;
        if (str2 != null) {
            this.A00.A00.Cuh(str2);
        }
    }
}
