package com.bloks.stdlib.components.bkcomponentscollection;

import X.AbstractC16960so;
import X.AbstractC65828Tul;
import X.AbstractC70663Fe;
import X.C0f9;
import X.C14360o3;
import X.C2UU;
import X.C3F5;
import X.C3OO;
import X.C70593Ew;
import X.Py5;
import X.UH1;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class StickyHeadersLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public AbstractC65828Tul A04;
    public final List A05;
    public final UH1 A06;

    /* loaded from: classes10.dex */
    public final class SavedState implements Parcelable {
        public static final Py5 CREATOR = Py5.A00(84);
        public final int A00;
        public final int A01;
        public final Parcelable A02;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeParcelable(this.A02, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SavedState(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.Class<com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager$SavedState> r2 = com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.SavedState.class
                int r1 = android.os.Build.VERSION.SDK_INT
                r0 = 33
                if (r1 < r0) goto L1e
                java.lang.ClassLoader r0 = r2.getClassLoader()
                java.lang.Object r2 = r4.readParcelable(r0, r2)
            L10:
                com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager$SavedState r2 = (com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.SavedState) r2
                int r1 = r4.readInt()
                int r0 = r4.readInt()
                r3.<init>(r2, r1, r0)
                return
            L1e:
                android.os.Parcelable r2 = X.AbstractC37304Gc5.A04(r4, r2)
                goto L10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.SavedState.<init>(android.os.Parcel):void");
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.A02 = parcelable;
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public StickyHeadersLinearLayoutManager(Context context, int i) {
        super(context, i, false);
        this.A05 = new ArrayList();
        this.A06 = new UH1(this);
        this.A02 = -1;
        this.A01 = -1;
    }

    private final void A05(View view) {
        A0q(view, 0, 0);
        if (((LinearLayoutManager) this).A01 == 1) {
            view.layout(Bau(), 0, ((AbstractC70663Fe) this).A03 - Baw(), view.getMeasuredHeight());
        } else {
            view.layout(0, Bax(), view.getMeasuredWidth(), ((AbstractC70663Fe) this).A00 - Bat());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final View A1E(View view, C70593Ew c70593Ew, C3F5 c3f5, int i) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(c70593Ew, 2);
        C14360o3.A0B(c3f5, 3);
        A0L(this);
        View A1E = super.A1E(view, c70593Ew, c3f5, i);
        A0K(this);
        return A1E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        C14360o3.A0B(c70593Ew, 1);
        C14360o3.A0B(c3f5, 2);
        A0L(this);
        int A1K = super.A1K(c70593Ew, c3f5, i);
        A0K(this);
        if (A1K != 0) {
            A0J(c70593Ew, false);
        }
        return A1K;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        C14360o3.A0B(c70593Ew, 1);
        C14360o3.A0B(c3f5, 2);
        A0L(this);
        int A1L = super.A1L(c70593Ew, c3f5, i);
        A0K(this);
        if (A1L != 0) {
            A0J(c70593Ew, false);
        }
        return A1L;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1p(int i, int i2) {
        int width;
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        int A03 = A03(i);
        if (A03 != -1) {
            List list = this.A05;
            if (AbstractC16960so.A1K(Integer.valueOf(i), list, list.size()) < 0) {
                int i3 = i - 1;
                if (AbstractC16960so.A1K(Integer.valueOf(i3), list, list.size()) < 0) {
                    View view = this.A03;
                    if (view != null) {
                        int A1K = AbstractC16960so.A1K(Integer.valueOf(this.A02), list, list.size());
                        if (A1K < 0) {
                            A1K = -1;
                        }
                        if (A03 == A1K) {
                            if (i2 == Integer.MIN_VALUE) {
                                i2 = 0;
                            }
                            if (((LinearLayoutManager) this).A01 == 1) {
                                width = view.getHeight();
                            } else {
                                width = view.getWidth();
                            }
                            i2 += width;
                        }
                    }
                    this.A01 = i;
                    this.A00 = i2;
                } else {
                    super.A1p(i3, i2);
                    return;
                }
            }
        }
        super.A1p(i, i2);
    }

    private final int A03(int i) {
        List list = this.A05;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) list.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else if (i3 < list.size() - 1) {
                i2 = i3 + 1;
                if (((Number) list.get(i2)).intValue() > i) {
                    return i3;
                }
            } else {
                return i3;
            }
        }
        return -1;
    }

    public static final int A04(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (((Number) list.get(i4)).intValue() >= i) {
                    size = i4;
                }
            }
            if (((Number) list.get(i3)).intValue() < i) {
                i2 = i3 + 1;
            } else {
                return i3;
            }
        }
        return -1;
    }

    private final void A08(C2UU c2uu) {
        AbstractC65828Tul abstractC65828Tul = this.A04;
        if (abstractC65828Tul != null) {
            abstractC65828Tul.unregisterAdapterDataObserver(this.A06);
        }
        if (c2uu instanceof AbstractC65828Tul) {
            this.A04 = (AbstractC65828Tul) c2uu;
            UH1 uh1 = this.A06;
            c2uu.registerAdapterDataObserver(uh1);
            uh1.onChanged();
            return;
        }
        this.A04 = null;
        this.A05.clear();
    }

    public static final void A0I(C70593Ew c70593Ew, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A03 = null;
            stickyHeadersLinearLayoutManager.A02 = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            C3OO A05 = RecyclerView.A05(view);
            A05.stopIgnoring();
            A05.resetInternal();
            A05.addFlags(4);
            stickyHeadersLinearLayoutManager.A0n(view);
            if (c70593Ew != null) {
                c70593Ew.A0A(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (r9 < r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0214, code lost:
    
        if ((r9 + r1) > 0.0f) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0J(X.C70593Ew r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.A0J(X.3Ew, boolean):void");
    }

    public static final void A0K(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A0p(view, -1);
        }
    }

    public static final void A0L(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        int A05;
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null && (A05 = ((AbstractC70663Fe) stickyHeadersLinearLayoutManager).A05.A05(view)) >= 0) {
            ((AbstractC70663Fe) stickyHeadersLinearLayoutManager).A05.A08(A05);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1O(int i) {
        A1p(i, Integer.MIN_VALUE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1P(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.A01 = savedState.A01;
            this.A00 = savedState.A00;
            parcelable = savedState.A02;
        }
        super.A1P(parcelable);
    }

    @Override // X.AbstractC70663Fe
    public final void A1U(RecyclerView recyclerView) {
        A08(recyclerView.A0A);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final Parcelable A1M() {
        return new SavedState(super.A1M(), this.A01, this.A00);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        int A03 = C0f9.A03(-1676302042);
        C14360o3.A0B(c70593Ew, 0);
        C14360o3.A0B(c3f5, 1);
        A0L(this);
        super.A1R(c70593Ew, c3f5);
        A0K(this);
        if (!c3f5.A08) {
            A0J(c70593Ew, true);
        }
        C0f9.A0A(-274752195, A03);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.InterfaceC70673Ff
    public final PointF AIz(int i) {
        A0L(this);
        PointF AIz = super.AIz(i);
        A0K(this);
        return AIz;
    }

    @Override // X.AbstractC70663Fe
    public final void A1Q(C2UU c2uu, C2UU c2uu2) {
        A08(c2uu2);
    }
}
