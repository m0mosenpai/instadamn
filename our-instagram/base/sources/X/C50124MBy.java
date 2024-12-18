package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.MBy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50124MBy extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50124MBy(RecyclerView recyclerView, C38337GtX c38337GtX, EmptyStateView emptyStateView, RefreshableNestedScrollingParent refreshableNestedScrollingParent, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 10;
        this.A03 = c38337GtX;
        this.A04 = emptyStateView;
        this.A05 = recyclerView;
        this.A00 = refreshableNestedScrollingParent;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        int i2;
        switch (this.A02) {
            case 0:
                obj4 = this.A01;
                obj5 = this.A04;
                obj3 = this.A05;
                obj6 = this.A03;
                obj2 = this.A00;
                i = 0;
                break;
            case 1:
                obj9 = this.A04;
                obj7 = this.A01;
                obj8 = this.A03;
                obj10 = this.A05;
                i2 = 1;
                C50124MBy c50124MBy = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy.A00 = obj;
                return c50124MBy;
            case 2:
                obj7 = this.A01;
                obj10 = this.A05;
                obj9 = this.A04;
                obj8 = this.A03;
                i2 = 2;
                C50124MBy c50124MBy2 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy2.A00 = obj;
                return c50124MBy2;
            case 3:
                obj6 = this.A03;
                obj3 = this.A05;
                obj2 = this.A00;
                obj5 = this.A04;
                obj4 = this.A01;
                i = 3;
                break;
            case 4:
                obj7 = this.A01;
                obj9 = this.A04;
                obj8 = this.A03;
                obj10 = this.A05;
                i2 = 4;
                C50124MBy c50124MBy22 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy22.A00 = obj;
                return c50124MBy22;
            case 5:
                obj10 = this.A05;
                obj9 = this.A04;
                obj8 = this.A03;
                obj7 = this.A01;
                i2 = 5;
                C50124MBy c50124MBy222 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy222.A00 = obj;
                return c50124MBy222;
            case 6:
                obj6 = this.A03;
                obj5 = this.A04;
                obj4 = this.A01;
                obj2 = this.A00;
                obj3 = this.A05;
                i = 6;
                break;
            case 7:
                obj5 = this.A04;
                obj3 = this.A05;
                obj2 = this.A00;
                obj4 = this.A01;
                obj6 = this.A03;
                i = 7;
                break;
            case 8:
                obj7 = this.A01;
                obj9 = this.A04;
                obj10 = this.A05;
                obj8 = this.A03;
                i2 = 8;
                C50124MBy c50124MBy2222 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy2222.A00 = obj;
                return c50124MBy2222;
            case 9:
                obj9 = this.A04;
                obj10 = this.A05;
                obj7 = this.A01;
                obj8 = this.A03;
                i2 = 9;
                C50124MBy c50124MBy22222 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy22222.A00 = obj;
                return c50124MBy22222;
            case 10:
                C50124MBy c50124MBy3 = new C50124MBy((RecyclerView) this.A05, (C38337GtX) this.A03, (EmptyStateView) this.A04, (RefreshableNestedScrollingParent) this.A00, interfaceC23621Ds);
                c50124MBy3.A01 = obj;
                return c50124MBy3;
            case 11:
                obj2 = this.A00;
                obj3 = this.A05;
                obj4 = this.A01;
                obj5 = this.A04;
                obj6 = this.A03;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj7 = this.A01;
                obj8 = this.A03;
                obj9 = this.A04;
                obj10 = this.A05;
                i2 = 12;
                C50124MBy c50124MBy222222 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy222222.A00 = obj;
                return c50124MBy222222;
            default:
                obj7 = this.A01;
                obj8 = this.A03;
                obj9 = this.A04;
                obj10 = this.A05;
                i2 = 13;
                C50124MBy c50124MBy2222222 = new C50124MBy(obj9, obj10, obj7, obj8, interfaceC23621Ds, i2);
                c50124MBy2222222.A00 = obj;
                return c50124MBy2222222;
        }
        return new C50124MBy(obj4, obj5, obj3, obj6, obj2, interfaceC23621Ds, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b4, code lost:
    
        if (r6 <= 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9 <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0579, code lost:
    
        if (r9.length() == 0) goto L208;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r63) {
        /*
            Method dump skipped, instructions count: 2594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50124MBy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50124MBy) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50124MBy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A00 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50124MBy(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }
}
