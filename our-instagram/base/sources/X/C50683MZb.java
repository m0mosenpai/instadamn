package X;

import com.instagram.modal.ModalActivity;

/* renamed from: X.MZb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50683MZb implements C06N {
    public final /* synthetic */ AbstractC10360h2 A00;
    public final /* synthetic */ ModalActivity A01;

    public C50683MZb(AbstractC10360h2 abstractC10360h2, ModalActivity modalActivity) {
        this.A01 = modalActivity;
        this.A00 = abstractC10360h2;
    }

    @Override // X.C06N
    public final void onBackStackChanged() {
        AbstractC10360h2 abstractC10360h2 = this.A00;
        if (abstractC10360h2.A0L() <= 0) {
            abstractC10360h2.A0F.remove(this);
            this.A01.finish();
        }
    }
}
