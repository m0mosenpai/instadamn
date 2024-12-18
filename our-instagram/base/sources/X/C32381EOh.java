package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EOh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32381EOh extends AbstractC193068gm {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ G06 A01;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
    }

    public C32381EOh(FragmentActivity fragmentActivity, G06 g06) {
        this.A01 = g06;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        G06 g06 = this.A01;
        g06.A02 = false;
        if (g06.A03 && !g06.A04) {
            AbstractC12990ll abstractC12990ll = g06.A06;
            if (!abstractC12990ll.hasEnded()) {
                g06.A04 = true;
                g06.A05 = false;
                C62862tP A0O = AbstractC31172DnG.A0O(this.A00, new C35980Fue(this), abstractC12990ll);
                A0O.A00 = true;
                AbstractC33787EwD.A00(A0O, c66246U5q);
            }
        }
    }
}
