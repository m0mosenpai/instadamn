package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsFooterCell;

/* loaded from: classes5.dex */
public final class D4x extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A0A = obj3;
        this.A06 = obj4;
        this.A02 = obj5;
        this.A03 = obj6;
        this.A08 = obj7;
        this.A09 = obj8;
        this.A01 = obj9;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A07) {
            case 0:
                return new D4x(this.A05, this.A04, this.A0A, this.A06, this.A02, this.A03, this.A08, this.A09, this.A01, interfaceC23621Ds, 0);
            case 1:
                return new D4x((Bitmap) this.A08, (L2X) this.A09, (C25813BbU) this.A0A, interfaceC23621Ds);
            case 2:
                C26815Bsd c26815Bsd = (C26815Bsd) this.A0A;
                View view = (View) this.A05;
                IgdsHeadline igdsHeadline = (IgdsHeadline) this.A04;
                D4x d4x = new D4x(view, c26815Bsd, (IgdsBottomButtonLayout) this.A08, (IgdsBulletCell) this.A09, (IgdsBulletCell) this.A02, (IgdsBulletCell) this.A01, igdsHeadline, (IgdsFooterCell) this.A03, interfaceC23621Ds);
                d4x.A06 = obj;
                return d4x;
            default:
                Object obj2 = this.A05;
                Object obj3 = this.A03;
                Object obj4 = this.A0A;
                Object obj5 = this.A06;
                Object obj6 = this.A04;
                Object obj7 = this.A01;
                return new D4x(obj2, obj6, obj4, obj5, this.A02, obj3, this.A08, this.A09, obj7, interfaceC23621Ds, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (r6.AIi(r8, r2) == false) goto L30;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0112 -> B:27:0x00c2). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4x) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4x(View view, C26815Bsd c26815Bsd, IgdsBottomButtonLayout igdsBottomButtonLayout, IgdsBulletCell igdsBulletCell, IgdsBulletCell igdsBulletCell2, IgdsBulletCell igdsBulletCell3, IgdsHeadline igdsHeadline, IgdsFooterCell igdsFooterCell, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = 2;
        this.A0A = c26815Bsd;
        this.A05 = view;
        this.A04 = igdsHeadline;
        this.A09 = igdsBulletCell;
        this.A02 = igdsBulletCell2;
        this.A01 = igdsBulletCell3;
        this.A03 = igdsFooterCell;
        this.A08 = igdsBottomButtonLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4x(Bitmap bitmap, L2X l2x, C25813BbU c25813BbU, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A07 = 1;
        this.A09 = l2x;
        this.A0A = c25813BbU;
        this.A08 = bitmap;
    }
}
