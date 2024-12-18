package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: X.9DA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DA extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public boolean A01;
    public final int A02 = 1;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DA(C8D9 c8d9, ArrayList arrayList, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A00 = arrayList;
        this.A03 = c8d9;
        this.A01 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        switch (this.A02) {
            case 0:
                return new C9DA((C8D9) this.A03, (ArrayList) this.A00, interfaceC23621Ds, this.A01);
            case 1:
                C9DA c9da = new C9DA((AnonymousClass860) this.A03, interfaceC23621Ds, this.A01);
                c9da.A00 = obj;
                return c9da;
            default:
                C9DA c9da2 = new C9DA((C8K0) this.A00, (C8K1) this.A03, interfaceC23621Ds);
                c9da2.A01 = ((Boolean) obj).booleanValue();
                return c9da2;
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DA) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A02) {
            case 0:
                AbstractC09560e7.A00(obj);
                ArrayList arrayList = (ArrayList) this.A00;
                if (!arrayList.isEmpty()) {
                    C8D9 c8d9 = (C8D9) this.A03;
                    c8d9.A06.addAll(arrayList);
                    c8d9.A00(C8DC.A00(arrayList));
                }
                boolean z = this.A01;
                C8D9 c8d92 = (C8D9) this.A03;
                AbstractC125325le.A04(null, new View[]{c8d92.A00, c8d92.A02}, z);
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                Object obj2 = this.A00;
                boolean z2 = this.A01;
                if (!z2) {
                    ((AnonymousClass860) this.A03).A0J.A0B(C0eB.A00);
                }
                if (obj2 instanceof AnonymousClass914) {
                    AnonymousClass860 anonymousClass860 = (AnonymousClass860) this.A03;
                    C05A c05a = anonymousClass860.A05.A00;
                    if (((C85D) c05a.getValue()).A00 != C85B.A06 && ((C85D) c05a.getValue()).A00 != C85B.A0B) {
                        anonymousClass860.A0N.A0B(new Integer(2131962082));
                    }
                    if (z2) {
                        anonymousClass860.A0J.A0B(C0eB.A00);
                        break;
                    }
                }
                break;
            default:
                AbstractC09560e7.A00(obj);
                if (this.A01) {
                    C89P c89p = ((C8K1) this.A03).A03;
                    if (c89p.A0N()) {
                        C8JT c8jt = ((C8K0) this.A00).A00;
                        C86Q c86q = c8jt.A1d;
                        FrameLayout frameLayout = c86q.A00;
                        if (frameLayout != null) {
                            ViewParent parent = frameLayout.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(c86q.A00);
                            }
                            c86q.A00 = null;
                            C8JT.A0m(c8jt);
                        }
                        c89p.A0E();
                        break;
                    }
                }
                break;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DA(AnonymousClass860 anonymousClass860, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = z;
        this.A03 = anonymousClass860;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DA(C8K0 c8k0, C8K1 c8k1, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = c8k1;
        this.A00 = c8k0;
    }
}
