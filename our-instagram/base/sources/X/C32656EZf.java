package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EZf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32656EZf extends AbstractRunnableC14200nk {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ ELC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32656EZf(FragmentActivity fragmentActivity, ELC elc) {
        super(705);
        this.A01 = elc;
        this.A00 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ELC.A01(this.A00, this.A01);
    }
}
