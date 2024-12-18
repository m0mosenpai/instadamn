package X;

/* loaded from: classes6.dex */
public final class GMZ implements Runnable {
    public final /* synthetic */ ELY A00;

    public GMZ(ELY ely) {
        this.A00 = ely;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELY ely = this.A00;
        if (ely.isResumed()) {
            AbstractC10360h2 abstractC10360h2 = ely.mFragmentManager;
            if (abstractC10360h2 != null && abstractC10360h2.A0Q("DELETE_COLLECTION_BACK_STACK_NAME") != null) {
                AbstractC10360h2 abstractC10360h22 = ely.mFragmentManager;
                if (abstractC10360h22 != null) {
                    abstractC10360h22.A18("DELETE_COLLECTION_BACK_STACK_NAME", 1);
                    return;
                }
                return;
            }
            AbstractC25227BEk.A1B(ely);
        }
    }
}
