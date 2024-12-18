package X;

import com.facebook.xapp.messaging.richtext.spans.RichTextHeadingSpan;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2E implements InterfaceC65377TjA {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public T2E(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC65377TjA
    public final List ANE(C62577SHc c62577SHc) {
        C14360o3.A0B(c62577SHc, 0);
        int i = this.A01;
        int i2 = this.A00;
        boolean z = true;
        boolean A1N = AbstractC167007dF.A1N(c62577SHc.A01);
        if (c62577SHc.A00 != c62577SHc.A02.length()) {
            z = false;
        }
        return AbstractC166987dD.A1J(new RichTextHeadingSpan(i, i2, A1N, z));
    }
}
