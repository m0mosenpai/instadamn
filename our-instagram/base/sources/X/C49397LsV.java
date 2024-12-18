package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.LsV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49397LsV implements InterfaceC89443yk {
    public final /* synthetic */ C75Y A00;
    public final /* synthetic */ AbstractC158757Al A01;
    public final /* synthetic */ String A02;

    public C49397LsV(C75Y c75y, AbstractC158757Al abstractC158757Al, String str) {
        this.A00 = c75y;
        this.A01 = abstractC158757Al;
        this.A02 = str;
    }

    @Override // X.InterfaceC89443yk
    public final void D3U(ClickableSpan clickableSpan, View view, String str) {
        InterfaceC165357aO interfaceC165357aO = this.A00.A01;
        if (!((InterfaceC165507ad) interfaceC165357aO).CQu()) {
            InterfaceC42241xE A03 = this.A01.A03();
            if (A03 != null) {
                A03.accept(this.A02);
            }
            interfaceC165357aO.Cuh(this.A02);
        }
    }
}
