package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* loaded from: classes9.dex */
public final class PXy extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A01 = obj6;
        this.A07 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        Object obj7;
        int i;
        if (this.A00 != 0) {
            obj3 = this.A02;
            obj5 = this.A04;
            obj2 = this.A06;
            obj4 = this.A05;
            obj7 = this.A03;
            obj6 = this.A01;
            str = this.A07;
            i = 1;
        } else {
            obj2 = this.A06;
            obj3 = this.A02;
            obj4 = this.A05;
            obj5 = this.A04;
            str = this.A07;
            obj6 = this.A01;
            obj7 = this.A03;
            i = 0;
        }
        return new PXy(obj3, obj5, obj2, obj4, obj7, obj6, str, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            LBT.A01((Context) this.A02, (FragmentActivity) this.A04, ((C50874Me5) this.A06).A00, (C128175qm) this.A01, (C47Z) this.A05, this.A07, (List) this.A03, false, true);
        } else {
            AbstractC09560e7.A00(obj);
            C50725MaQ c50725MaQ = (C50725MaQ) this.A06;
            Context context = (Context) this.A02;
            c50725MaQ.A07(context, (C8LK) this.A04, (C47Z) this.A05, this.A07);
            AbstractC54875OOn.A00(context, c50725MaQ.A09, (AnonymousClass840) this.A01, (InterfaceC58286Pse) this.A03, c50725MaQ.A0S);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXy) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
