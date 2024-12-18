package androidx.core.view;

import X.AbstractC09560e7;
import X.AbstractC105074oN;
import X.C0eB;
import X.C105094oP;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC224417g;
import X.InterfaceC23621Ds;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {409, 411}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class ViewKt$allViews$1 extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ View A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = view;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.A02, interfaceC23621Ds);
        viewKt$allViews$1.A01 = obj;
        return viewKt$allViews$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C105094oP c105094oP;
        C1JX c1jx = C1JX.A02;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            }
            c105094oP = (C105094oP) this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            c105094oP = (C105094oP) this.A01;
            View view = this.A02;
            this.A01 = c105094oP;
            this.A00 = 1;
            if (c105094oP.A02(view, this) == c1jx) {
                return c1jx;
            }
        }
        View view2 = this.A02;
        if (view2 instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup) view2;
            InterfaceC224417g interfaceC224417g = new InterfaceC224417g() { // from class: X.03z
                @Override // X.InterfaceC224417g
                public final Iterator iterator() {
                    return new C17960uZ(new C12500ku(viewGroup), C0SR.A00);
                }
            };
            this.A01 = null;
            this.A00 = 2;
            if (c105094oP.A01(this, interfaceC224417g) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
