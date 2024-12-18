package X;

/* renamed from: X.7Ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C160757Ij extends AbstractC13660ms {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160757Ij(InterfaceC13640mq interfaceC13640mq, C160737Ih c160737Ih) {
        super(interfaceC13640mq, c160737Ih, C7VC.class);
        C14360o3.A0B(c160737Ih, 1);
        C14360o3.A0B(interfaceC13640mq, 2);
    }

    public int A08(C7VC c7vc) {
        C14360o3.A0B(c7vc, 0);
        if (c7vc instanceof C160787Im) {
            ((C160787Im) c7vc).A0e.A2C = false;
        }
        return AbstractC13660ms.A01(this, c7vc, true);
    }

    @Override // X.AbstractC13660ms
    public final /* bridge */ /* synthetic */ int A03(Object obj, int i) {
        C7VC c7vc = (C7VC) obj;
        C14360o3.A0B(c7vc, 1);
        if (c7vc instanceof C160787Im) {
            ((C160787Im) c7vc).A0e.A2C = false;
        }
        return super.A03(c7vc, i);
    }
}
