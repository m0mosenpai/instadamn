package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HDZ extends AbstractC193068gm {
    public final /* synthetic */ C685836v A00;
    public final /* synthetic */ JG4 A01;
    public final /* synthetic */ C689538g A02;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        Fragment fragment = this.A02.A00;
        if (fragment.getContext() != null) {
            C9GR.A03(fragment.getContext(), AbstractC166997dE.A0N(fragment).getString(2131968430), "bloks_action_network_error", 0);
        }
        String A0R = AnonymousClass001.A0R(AbstractC37300Gc1.A0W(fragment), "runBloksAction");
        String A00 = AbstractC111324zv.A00(57);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            C0w9.A06(A0R, A00, A01);
        } else {
            C0w9.A03(A0R, A00);
        }
    }

    public HDZ(C685836v c685836v, JG4 jg4, C689538g c689538g) {
        this.A02 = c689538g;
        this.A01 = jg4;
        this.A00 = c685836v;
    }

    @Override // X.AbstractC192848gQ
    public final void A01() {
        this.A00.A00 = false;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        C689538g c689538g = this.A02;
        C62862tP A03 = C62862tP.A03(c689538g.A00, c689538g.A02, null);
        JG4 jg4 = this.A01;
        if (jg4 != null) {
            A03.A01.put(R.id.open_share_sheet_handler, jg4);
        }
        AbstractC10360h2 abstractC10360h2 = c689538g.A01;
        if (!C06P.A00(abstractC10360h2) && C06P.A01(abstractC10360h2)) {
            AbstractC33787EwD.A00(A03, c66246U5q);
        }
    }
}
