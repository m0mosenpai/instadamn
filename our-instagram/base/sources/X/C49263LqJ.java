package X;

import java.util.List;

/* renamed from: X.LqJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49263LqJ implements InterfaceC50442MOw {
    public final /* synthetic */ C47974LIk A00;

    public C49263LqJ(C47974LIk c47974LIk) {
        this.A00 = c47974LIk;
    }

    @Override // X.InterfaceC50442MOw
    public final void DjL(String str, List list) {
        int length = str.length();
        C47974LIk c47974LIk = this.A00;
        if (length == 0) {
            c47974LIk.A02();
            return;
        }
        c47974LIk.A03 = C05F.A0C;
        c47974LIk.A0E.A01(AbstractC001800i.A0j(list), c47974LIk.A06);
    }
}
