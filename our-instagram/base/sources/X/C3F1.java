package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.3F1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3F1 {
    public C3F7 A04 = null;
    public ArrayList A05 = new ArrayList();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public void A0B(C3OO c3oo) {
    }

    public boolean A0D(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo) {
        C3F0 c3f0 = (C3F0) this;
        int i = c73733Sb.A00;
        int i2 = c73733Sb2.A00;
        if (i == i2 && c73733Sb.A01 == c73733Sb2.A01) {
            c3f0.A0P(c3oo);
            return false;
        }
        return c3f0.A0T(c3oo, i, c73733Sb.A01, i2, c73733Sb2.A01);
    }

    public abstract boolean A0E(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo);

    public abstract boolean A0F(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo);

    public abstract boolean A0G(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo, C3OO c3oo2);

    public boolean A0H(C3OO c3oo) {
        if (((C3F0) this).A00 && !c3oo.isInvalid()) {
            return false;
        }
        return true;
    }

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(C3OO c3oo);

    public abstract boolean A0L();

    public static void A04(C3OO c3oo) {
        int i = c3oo.mFlags & 14;
        if (!c3oo.isInvalid() && (i & 4) == 0) {
            c3oo.getAbsoluteAdapterPosition();
        }
    }

    public long A06() {
        return this.A00;
    }

    public long A07() {
        return this.A01;
    }

    public long A08() {
        return this.A02;
    }

    public long A09() {
        return this.A03;
    }

    public final void A0A() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC43397JFm) arrayList.get(i)).Cwn();
        }
        arrayList.clear();
    }

    public final void A0C(C3OO c3oo) {
        boolean z;
        A0B(c3oo);
        C3F7 c3f7 = this.A04;
        if (c3f7 != null) {
            C3F6 c3f6 = (C3F6) c3f7;
            c3oo.setIsRecyclable(true);
            if (c3oo.mShadowedHolder != null && c3oo.mShadowingHolder == null) {
                c3oo.mShadowedHolder = null;
            }
            c3oo.mShadowingHolder = null;
            if (!c3oo.shouldBeKeptAsChild()) {
                RecyclerView recyclerView = c3f6.A00;
                View view = c3oo.itemView;
                recyclerView.A0j();
                C3FI c3fi = recyclerView.A08;
                int i = c3fi.A00;
                if (i == 1) {
                    if (c3fi.A01 != view) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    }
                } else {
                    if (i != 2) {
                        try {
                            c3fi.A00 = 2;
                            RecyclerView recyclerView2 = ((C3FG) c3fi.A03).A00;
                            int indexOfChild = recyclerView2.indexOfChild(view);
                            if (indexOfChild == -1) {
                                C3FI.A02(view, c3fi);
                            } else {
                                C3FJ c3fj = c3fi.A02;
                                if (c3fj.A06(indexOfChild)) {
                                    c3fj.A07(indexOfChild);
                                    C3FI.A02(view, c3fi);
                                    View childAt = recyclerView2.getChildAt(indexOfChild);
                                    if (childAt != null) {
                                        recyclerView2.A0x(childAt);
                                        childAt.clearAnimation();
                                    }
                                    recyclerView2.removeViewAt(indexOfChild);
                                }
                            }
                            c3fi.A00 = 0;
                            z = true;
                            C3OO A05 = RecyclerView.A05(view);
                            C70593Ew c70593Ew = recyclerView.A0y;
                            c70593Ew.A0D(A05);
                            c70593Ew.A0C(A05);
                            recyclerView.A19(!z);
                            if (z && c3oo.isTmpDetached()) {
                                recyclerView.removeDetachedView(c3oo.itemView, false);
                                return;
                            }
                        } finally {
                            c3fi.A00 = 0;
                        }
                    }
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                z = false;
                recyclerView.A19(!z);
                if (z) {
                }
            }
        }
    }
}
