package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JbI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC43907JbI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WeakReference A00;
    public final /* synthetic */ WeakReference A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ WeakReference A03;
    public final /* synthetic */ boolean A04;

    public ViewTreeObserverOnGlobalLayoutListenerC43907JbI(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4, boolean z) {
        this.A03 = weakReference;
        this.A02 = weakReference2;
        this.A01 = weakReference3;
        this.A04 = z;
        this.A00 = weakReference4;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C66362zD c66362zD;
        C43916JbR c43916JbR;
        JRL jrl;
        C43915JbQ c43915JbQ = (C43915JbQ) this.A03.get();
        int i = 0;
        if (c43915JbQ != null && c43915JbQ.A03) {
            RecyclerView recyclerView = (RecyclerView) this.A02.get();
            C2UU c2uu = null;
            if (recyclerView != null) {
                c2uu = recyclerView.A0A;
            }
            if ((c2uu instanceof C66362zD) && (c66362zD = (C66362zD) c2uu) != null && (c43916JbR = (C43916JbR) this.A01.get()) != null) {
                if (this.A04) {
                    List AuX = c66362zD.A04.AuX();
                    C14360o3.A07(AuX);
                    if (!(AuX instanceof Collection) || !AuX.isEmpty()) {
                        Iterator it = AuX.iterator();
                        while (it.hasNext()) {
                            if (it.next() instanceof JRL) {
                            }
                        }
                    }
                    c43916JbR.A01(0, 0, 0);
                }
                int itemCount = c66362zD.getItemCount();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A00.get();
                if (linearLayoutManager != null) {
                    int A1a = linearLayoutManager.A1a();
                    int A1b = linearLayoutManager.A1b();
                    if (A1a >= 0 && A1b >= 0 && A1a < itemCount && A1b < itemCount) {
                        int i2 = 0;
                        int i3 = 0;
                        if (A1a <= A1b) {
                            while (true) {
                                List AuX2 = c66362zD.A04.AuX();
                                C14360o3.A07(AuX2);
                                Object A0O = AbstractC001800i.A0O(AuX2, A1a);
                                if ((A0O instanceof JRL) && (jrl = (JRL) A0O) != null) {
                                    if (jrl.A0E != EnumC92794Ds.A04) {
                                        i2++;
                                    } else {
                                        i++;
                                        if (jrl.A0V) {
                                            i3++;
                                        }
                                    }
                                }
                                if (A1a == A1b) {
                                    break;
                                } else {
                                    A1a++;
                                }
                            }
                            int i4 = i;
                            i = i2;
                            i2 = i4;
                        }
                        if (!c43916JbR.A01(i, i2, i3)) {
                            return;
                        }
                        c43915JbQ.A00();
                        return;
                    }
                }
                c43916JbR.A01(0, 0, 0);
            }
        }
    }
}
