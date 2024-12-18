package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;

/* renamed from: X.Eib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33078Eib extends AbstractC140596Xn {
    public final FragmentActivity A00;
    public final /* synthetic */ LBE A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33078Eib(FragmentActivity fragmentActivity, LBE lbe) {
        super(null, null);
        C14360o3.A0B(fragmentActivity, 2);
        this.A01 = lbe;
        this.A00 = fragmentActivity;
    }

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
        this.A00.finish();
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        return C6PN.A00();
    }
}
