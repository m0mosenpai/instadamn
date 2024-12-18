package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.LsR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49393LsR implements InterfaceC89443yk {
    public final /* synthetic */ C85383rT A00;

    public C49393LsR(C85383rT c85383rT) {
        this.A00 = c85383rT;
    }

    @Override // X.InterfaceC89443yk
    public final void D3U(ClickableSpan clickableSpan, View view, String str) {
        C47350Kvz c47350Kvz = this.A00.A08;
        if (c47350Kvz != null) {
            C14360o3.A0B(str, 0);
            c47350Kvz.A00.A00.Cs6(str, null, null);
        }
    }
}
