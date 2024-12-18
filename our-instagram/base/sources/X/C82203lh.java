package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.3lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82203lh extends AbstractC82213li {
    public final int A03;
    public final UserSession A04;
    public final C7KT A05;
    public final Map A01 = new HashMap();
    public boolean A00 = false;
    public final WeakHashMap A02 = new WeakHashMap();

    @Override // X.AbstractC82213li, X.C3F1
    public final void A0J() {
        if (!this.A00) {
            this.A00 = true;
            return;
        }
        ArrayList arrayList = this.A09;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3OO c3oo = (C3OO) it.next();
                Number number = (Number) this.A02.get(c3oo);
                if (number == null) {
                    number = -1;
                }
                if (A01(c3oo, number.intValue())) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.A06;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C3OO c3oo2 = (C3OO) it2.next();
                if (A00(c3oo2, c3oo2.getBindingAdapterPosition())) {
                    super.A0J();
                    return;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            A0X((C3OO) it3.next());
        }
        arrayList.clear();
        ArrayList arrayList3 = this.A08;
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C68243VJf c68243VJf = (C68243VJf) it4.next();
            A0Z(c68243VJf.A04, c68243VJf.A00, c68243VJf.A01, c68243VJf.A02, c68243VJf.A03);
        }
        arrayList3.clear();
        ArrayList arrayList4 = this.A07;
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            A0a((VK2) it5.next());
        }
        arrayList4.clear();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            A0W((C3OO) it6.next());
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC82213li
    public final void A0W(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        if (A00(c3oo, c3oo.getBindingAdapterPosition())) {
            super.A0W(c3oo);
            return;
        }
        View view = c3oo.itemView;
        ViewPropertyAnimator animate = view.animate();
        ((AbstractC82213li) this).A00.add(c3oo);
        if (c3oo instanceof InterfaceC162347Ow) {
            interfaceC162347Ow = (InterfaceC162347Ow) c3oo;
            if (interfaceC162347Ow != null) {
                A0b(animate, c3oo, interfaceC162347Ow.C0D().A05(), interfaceC162347Ow);
            }
        } else {
            interfaceC162347Ow = null;
        }
        animate.alpha(1.0f).translationY(0.0f).setDuration(A06()).setListener(new U86(view, animate, c3oo, this, interfaceC162347Ow)).start();
    }

    private boolean A00(C3OO c3oo, int i) {
        if (!(c3oo instanceof InterfaceC161787Mn)) {
            ViewParent parent = c3oo.itemView.getParent();
            if (parent == null) {
                C0f5 AEp = C18950wb.A01.AEp("InsertFromBottomItemAnimator unexpected null recycler view.", 20134884);
                AEp.ABU("holderPosition", i);
                AEp.report();
            } else {
                RecyclerView recyclerView = (RecyclerView) parent;
                int i2 = this.A03;
                int i3 = i2 + 1;
                if (i == i3 && (c3oo instanceof C7N7)) {
                    C3OO A0V = recyclerView.A0V(i2);
                    if (A0V != null && !this.A02.containsKey(A0V)) {
                        return A00(A0V, i2);
                    }
                } else if (i == i2) {
                    C3OO A0V2 = recyclerView.A0V(i3);
                    if (A0V2 == null) {
                        return false;
                    }
                    if (!(A0V2 instanceof C7N7) || (A0V2 = recyclerView.A0V(i3 + 1)) != null) {
                        return !this.A02.containsKey(A0V2);
                    }
                }
            }
        }
        return true;
    }

    private boolean A01(C3OO c3oo, int i) {
        if ((c3oo instanceof InterfaceC161787Mn) && i == 1) {
            if (!(c3oo instanceof C7N7)) {
                return true;
            }
            ViewParent parent = c3oo.itemView.getParent();
            parent.getClass();
            C3OO A0V = ((RecyclerView) parent).A0V(0);
            if (A0V == null) {
                return false;
            }
            return A01(A0V, 0);
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C3F0
    public final void A0M(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        this.A02.put(c3oo, Integer.valueOf(c3oo.getBindingAdapterPosition()));
        if (this.A01.remove(c3oo) != null) {
            c3oo.itemView.setTranslationY(0.0f);
        }
        if ((c3oo instanceof InterfaceC162347Ow) && (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) != null) {
            interfaceC162347Ow.EJl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C3F0
    public final void A0N(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        this.A02.put(c3oo, Integer.valueOf(c3oo.getBindingAdapterPosition()));
        this.A01.remove(c3oo);
        if ((c3oo instanceof InterfaceC162347Ow) && (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) != null) {
            interfaceC162347Ow.EJl();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VJf, java.lang.Object] */
    @Override // X.AbstractC82213li, X.C3F0
    public final boolean A0R(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        ViewParent parent = c3oo.itemView.getParent();
        parent.getClass();
        RecyclerView recyclerView = (RecyclerView) parent;
        int i = this.A03;
        int i2 = i + 1;
        if (this.A00 && !(c3oo instanceof InterfaceC161757Mk)) {
            if (A00(c3oo, c3oo.getBindingAdapterPosition())) {
                return super.A0R(c3oo);
            }
            A0Y(c3oo);
            c3oo.itemView.setAlpha(0.0f);
            int height = recyclerView.getHeight();
            int top = c3oo.itemView.getTop();
            ?? obj = new Object();
            obj.A04 = c3oo;
            obj.A00 = 0;
            obj.A01 = height;
            obj.A02 = 0;
            obj.A03 = top;
            if (c3oo.getBindingAdapterPosition() == i) {
                C3OO A0V = recyclerView.A0V(i2);
                if (A0V instanceof C7N7) {
                    obj.A01 += A0V.itemView.getHeight();
                }
            }
            c3oo.itemView.setTranslationY(obj.A01 - obj.A03);
            this.A01.put(c3oo, obj);
            this.A06.add(c3oo);
            if (!(c3oo instanceof InterfaceC162347Ow) || (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) == null) {
                return true;
            }
            A0b(null, c3oo, interfaceC162347Ow.C0D().A05(), interfaceC162347Ow);
            return true;
        }
        A0O(c3oo);
        return true ^ this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.VJf, java.lang.Object] */
    @Override // X.AbstractC82213li, X.C3F0
    public final boolean A0S(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        C3OO c3oo2;
        WeakHashMap weakHashMap = this.A02;
        Number number = (Number) weakHashMap.get(c3oo);
        if (number == null) {
            number = -1;
        }
        if (this.A00 && !(c3oo instanceof InterfaceC161757Mk)) {
            int intValue = number.intValue();
            if (A01(c3oo, intValue)) {
                return super.A0S(c3oo);
            }
            A0Y(c3oo);
            c3oo.itemView.setAlpha(1.0f);
            Object parent = c3oo.itemView.getParent();
            parent.getClass();
            int top = c3oo.itemView.getTop();
            int height = ((View) parent).getHeight();
            ?? obj = new Object();
            obj.A04 = c3oo;
            obj.A00 = 0;
            obj.A01 = top;
            obj.A02 = 0;
            obj.A03 = height;
            if (intValue == 0) {
                Iterator it = weakHashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((Number) entry.getValue()).intValue() == 1) {
                            c3oo2 = (C3OO) entry.getKey();
                            break;
                        }
                    } else {
                        c3oo2 = null;
                        break;
                    }
                }
                if (c3oo2 instanceof C7N7) {
                    obj.A03 += c3oo2.itemView.getHeight();
                }
            }
            c3oo.itemView.offsetTopAndBottom(obj.A03 - obj.A01);
            c3oo.itemView.setTranslationY(obj.A01 - obj.A03);
            this.A01.put(c3oo, obj);
            this.A09.add(c3oo);
            if (!(c3oo instanceof InterfaceC162347Ow) || (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) == null) {
                return true;
            }
            C74843Xy c74843Xy = new C74843Xy();
            c74843Xy.A08(interfaceC162347Ow.BLT(), C05F.A00);
            A0b(null, c3oo, c74843Xy, interfaceC162347Ow);
            return true;
        }
        A0Q(c3oo);
        return true ^ this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC82213li
    public final void A0X(C3OO c3oo) {
        InterfaceC162347Ow interfaceC162347Ow;
        Number number = (Number) this.A02.get(c3oo);
        if (number == null) {
            number = -1;
        }
        if (A01(c3oo, number.intValue())) {
            super.A0X(c3oo);
            return;
        }
        View view = c3oo.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A0A.add(c3oo);
        if ((c3oo instanceof InterfaceC162347Ow) && (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) != null) {
            C74843Xy A05 = interfaceC162347Ow.BLT().A05();
            interfaceC162347Ow.Ec3(A05);
            A0b(animate, c3oo, A05, interfaceC162347Ow);
        }
        animate.translationY(0.0f).alpha(0.0f).setDuration(A09()).setListener(new U85(view, animate, c3oo, this)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC82213li
    public final void A0Z(C3OO c3oo, int i, int i2, int i3, int i4) {
        InterfaceC162347Ow interfaceC162347Ow;
        if ((c3oo instanceof InterfaceC162347Ow) && (interfaceC162347Ow = (InterfaceC162347Ow) c3oo) != null) {
            View view = c3oo.itemView;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            ((AbstractC82213li) this).A04.add(c3oo);
            A0b(animate, c3oo, interfaceC162347Ow.BLT().A04(), interfaceC162347Ow);
            animate.setDuration(A08()).setListener(new C65780Ttv(view, animate, c3oo, this, interfaceC162347Ow, i5, i6)).start();
            return;
        }
        super.A0Z(c3oo, i, i2, i3, i4);
    }

    public final void A0b(ViewPropertyAnimator viewPropertyAnimator, C3OO c3oo, final C74843Xy c74843Xy, final InterfaceC162347Ow interfaceC162347Ow) {
        final ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        DirectThreadThemeInfo directThreadThemeInfo;
        final View view = c3oo.itemView;
        C7IM c7im = this.A05.A00.A0j.A0M.A04;
        if (c7im != null && (directThreadThemeInfo = c7im.A08) != null && (!AnonymousClass483.A04(directThreadThemeInfo.A0s)) && (!AnonymousClass483.A04(directThreadThemeInfo.A0q))) {
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.JV3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC162347Ow.Ctd(view.getY());
                }
            };
            interfaceC162347Ow.Ctd(view.getY());
        } else {
            animatorUpdateListener = null;
        }
        if (!c74843Xy.equals(interfaceC162347Ow.C0D())) {
            if (viewPropertyAnimator == null) {
                interfaceC162347Ow.FCi(c74843Xy, 0.0f);
                return;
            } else {
                viewPropertyAnimator.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.LM3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InterfaceC162347Ow interfaceC162347Ow2 = interfaceC162347Ow;
                        C74843Xy c74843Xy2 = c74843Xy;
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = animatorUpdateListener;
                        interfaceC162347Ow2.FCi(c74843Xy2, valueAnimator.getAnimatedFraction());
                        if (animatorUpdateListener2 != null) {
                            animatorUpdateListener2.onAnimationUpdate(valueAnimator);
                        }
                    }
                });
                return;
            }
        }
        if (viewPropertyAnimator == null || animatorUpdateListener == null) {
            return;
        }
        viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }

    public C82203lh(UserSession userSession, C7KT c7kt, int i) {
        this.A0B = new LinearInterpolator();
        this.A05 = c7kt;
        this.A03 = i;
        this.A04 = userSession;
    }

    @Override // X.AbstractC82213li
    public final void A0Y(C3OO c3oo) {
        super.A0Y(c3oo);
        View view = c3oo.itemView;
        if (view.getTranslationY() != 0.0f) {
            view.setTranslationY(0.0f);
        }
        if (view.getTranslationX() != 0.0f) {
            view.setTranslationX(0.0f);
        }
    }
}
