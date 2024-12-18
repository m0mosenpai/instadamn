package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.LsW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49398LsW implements InterfaceC89443yk {
    public final /* synthetic */ C7Y8 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C49398LsW(C7Y8 c7y8, String str, String str2) {
        this.A00 = c7y8;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC89443yk
    public final void D3U(ClickableSpan clickableSpan, View view, String str) {
        C14360o3.A0B(str, 0);
        this.A00.Cs6(str, this.A02, this.A01);
    }
}
