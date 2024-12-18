package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.3F0, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3F0 extends C3F1 {
    public boolean A00 = true;

    @Override // X.C3F1
    public final boolean A0E(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo) {
        int i;
        int i2;
        if (c73733Sb != null && ((i = c73733Sb.A00) != (i2 = c73733Sb2.A00) || c73733Sb.A01 != c73733Sb2.A01)) {
            return A0T(c3oo, i, c73733Sb.A01, i2, c73733Sb2.A01);
        }
        return A0R(c3oo);
    }

    public void A0M(C3OO c3oo) {
    }

    public void A0N(C3OO c3oo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0Q(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        if (this instanceof C82203lh) {
            if (((C82203lh) this).A01.remove(c3oo) != null) {
                c3oo.itemView.setTranslationY(0.0f);
            }
            if ((c3oo instanceof InterfaceC162347Ow) && (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) != null) {
                interfaceC162347Ow.EJl();
            }
        } else if (this instanceof C82223lj) {
            ((C82223lj) this).A00.invoke();
        }
        A0C(c3oo);
    }

    public abstract boolean A0R(C3OO c3oo);

    public abstract boolean A0S(C3OO c3oo);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r2.BLT().equals(r2.C0D()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0078, code lost:
    
        if (r1 != 0) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.VJf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.VJf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0T(X.C3OO r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3F0.A0T(X.3OO, int, int, int, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.VK2, java.lang.Object] */
    public boolean A0U(C3OO c3oo, C3OO c3oo2, int i, int i2, int i3, int i4) {
        AbstractC82213li abstractC82213li = (AbstractC82213li) this;
        if (c3oo == c3oo2) {
            return abstractC82213li.A0T(c3oo, i, i2, i3, i4);
        }
        float translationX = c3oo.itemView.getTranslationX();
        float translationY = c3oo.itemView.getTranslationY();
        float alpha = c3oo.itemView.getAlpha();
        abstractC82213li.A0Y(c3oo);
        c3oo.itemView.setTranslationX(translationX);
        c3oo.itemView.setTranslationY(translationY);
        c3oo.itemView.setAlpha(alpha);
        abstractC82213li.A0Y(c3oo2);
        c3oo2.itemView.setTranslationX(-((int) ((i3 - i) - translationX)));
        c3oo2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        c3oo2.itemView.setAlpha(0.0f);
        ArrayList arrayList = abstractC82213li.A07;
        ?? obj = new Object();
        obj.A05 = c3oo;
        obj.A04 = c3oo2;
        obj.A00 = i;
        obj.A01 = i2;
        obj.A02 = i3;
        obj.A03 = i4;
        arrayList.add(obj);
        return true;
    }

    @Override // X.C3F1
    public final boolean A0F(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo) {
        int i;
        int i2;
        int i3 = c73733Sb.A00;
        int i4 = c73733Sb.A01;
        View view = c3oo.itemView;
        if (c73733Sb2 == null) {
            i = view.getLeft();
            i2 = view.getTop();
        } else {
            i = c73733Sb2.A00;
            i2 = c73733Sb2.A01;
        }
        if (!c3oo.isRemoved() && (i3 != i || i4 != i2)) {
            view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
            return A0T(c3oo, i3, i4, i, i2);
        }
        return A0S(c3oo);
    }

    @Override // X.C3F1
    public final boolean A0G(C73733Sb c73733Sb, C73733Sb c73733Sb2, C3OO c3oo, C3OO c3oo2) {
        int i;
        int i2;
        int i3 = c73733Sb.A00;
        int i4 = c73733Sb.A01;
        if (c3oo2.shouldIgnore()) {
            i2 = i4;
            i = i3;
        } else {
            i = c73733Sb2.A00;
            i2 = c73733Sb2.A01;
        }
        return A0U(c3oo, c3oo2, i3, i4, i, i2);
    }

    public final void A0O(C3OO c3oo) {
        A0M(c3oo);
        A0C(c3oo);
    }

    public final void A0P(C3OO c3oo) {
        A0N(c3oo);
        A0C(c3oo);
    }
}
