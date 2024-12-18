package X;

import android.animation.AnimatorSet;
import java.util.List;

/* renamed from: X.DbC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30467DbC extends C0YY implements InterfaceC16620sF {
    public static final C30467DbC A00 = new C30467DbC();

    public C30467DbC() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BZA bza = (BZA) obj2;
        C14360o3.A0B(bza, 1);
        List A002 = BZA.A00(bza.A06, bza, 0);
        List A003 = BZA.A00(bza.A07, bza, 1);
        List A004 = BZA.A00(bza.A05, bza, 2);
        AnimatorSet animatorSet = bza.A01;
        animatorSet.playTogether(AbstractC001800i.A0S(A003, AbstractC001800i.A0S(A004, A002)));
        animatorSet.addListener(new BY9(bza, 2));
        bza.A00 = true;
        animatorSet.start();
        return AbstractC25225BEi.A0q(C29910DGy.A01(bza, 42));
    }
}
