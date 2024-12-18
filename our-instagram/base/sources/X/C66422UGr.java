package X;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UGr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66422UGr extends C2UU {
    public final C70371WSz A00;

    @Override // X.C2UU
    public final int findRelativeAdapterPositionIn(C2UU c2uu, C3OO c3oo, int i) {
        C70371WSz c70371WSz = this.A00;
        C69319VlR c69319VlR = (C69319VlR) c70371WSz.A06.get(c3oo);
        if (c69319VlR == null) {
            return -1;
        }
        int A00 = i - C70371WSz.A00(c70371WSz, c69319VlR);
        C2UU c2uu2 = c69319VlR.A03;
        int itemCount = c2uu2.getItemCount();
        if (A00 >= 0 && A00 < itemCount) {
            return c2uu2.findRelativeAdapterPositionIn(c2uu, c3oo, A00);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Detected inconsistent adapter updates. The local position of the view holder maps to ");
        sb.append(A00);
        sb.append(" which is out of bounds for the adapter with size ");
        sb.append(itemCount);
        sb.append(".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sb.append(c3oo);
        throw AbstractC43594JPz.A0o(c2uu, "adapter:", sb);
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C70371WSz c70371WSz = this.A00;
        List list = c70371WSz.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (MSZ.A0n(it) == recyclerView) {
                return;
            }
        }
        list.add(new WeakReference(recyclerView));
        Iterator it2 = c70371WSz.A02.iterator();
        while (it2.hasNext()) {
            ((C69319VlR) it2.next()).A03.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C70371WSz c70371WSz = this.A00;
        C69042Vgj A01 = C70371WSz.A01(c70371WSz, i);
        c70371WSz.A06.put(c3oo, A01.A01);
        C69319VlR c69319VlR = A01.A01;
        c69319VlR.A03.bindViewHolder(c3oo, A01.A00);
        A01.A02 = false;
        A01.A01 = null;
        A01.A00 = -1;
        c70371WSz.A00 = A01;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C69319VlR c69319VlR = (C69319VlR) ((WT3) this.A00.A05).A01.get(i);
        if (c69319VlR != null) {
            WT2 wt2 = (WT2) c69319VlR.A05;
            SparseIntArray sparseIntArray = wt2.A00;
            int indexOfKey = sparseIntArray.indexOfKey(i);
            if (indexOfKey >= 0) {
                return c69319VlR.A03.onCreateViewHolder(viewGroup, sparseIntArray.valueAt(indexOfKey));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("requested global type ");
            sb.append(i);
            sb.append(" does not belong to the adapter:");
            throw AbstractC58320PtC.A0n(wt2.A02.A03, sb);
        }
        throw AbstractC25230BEn.A0n("Cannot find the wrapper for global view type ", i);
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C70371WSz c70371WSz = this.A00;
        List list = c70371WSz.A01;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Reference reference = (Reference) list.get(size);
            if (reference.get() == null) {
                list.remove(size);
            } else if (reference.get() == recyclerView) {
                list.remove(size);
                break;
            }
        }
        Iterator it = c70371WSz.A02.iterator();
        while (it.hasNext()) {
            ((C69319VlR) it.next()).A03.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // X.C2UU
    public final boolean onFailedToRecycleView(C3OO c3oo) {
        C70371WSz c70371WSz = this.A00;
        IdentityHashMap identityHashMap = c70371WSz.A06;
        C69319VlR c69319VlR = (C69319VlR) identityHashMap.get(c3oo);
        if (c69319VlR != null) {
            boolean onFailedToRecycleView = c69319VlR.A03.onFailedToRecycleView(c3oo);
            identityHashMap.remove(c3oo);
            return onFailedToRecycleView;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(c3oo);
        throw AbstractC43594JPz.A0o(c70371WSz, ", seems like it is not bound by this adapter: ", sb);
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        C70371WSz c70371WSz = this.A00;
        C69319VlR c69319VlR = (C69319VlR) c70371WSz.A06.get(c3oo);
        if (c69319VlR != null) {
            c69319VlR.A03.onViewAttachedToWindow(c3oo);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(c3oo);
        throw AbstractC43594JPz.A0o(c70371WSz, ", seems like it is not bound by this adapter: ", sb);
    }

    @Override // X.C2UU
    public final void onViewDetachedFromWindow(C3OO c3oo) {
        C70371WSz c70371WSz = this.A00;
        C69319VlR c69319VlR = (C69319VlR) c70371WSz.A06.get(c3oo);
        if (c69319VlR != null) {
            c69319VlR.A03.onViewDetachedFromWindow(c3oo);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find wrapper for ");
        sb.append(c3oo);
        throw AbstractC43594JPz.A0o(c70371WSz, ", seems like it is not bound by this adapter: ", sb);
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        C70371WSz c70371WSz = this.A00;
        IdentityHashMap identityHashMap = c70371WSz.A06;
        C69319VlR c69319VlR = (C69319VlR) identityHashMap.get(c3oo);
        if (c69319VlR != null) {
            c69319VlR.A03.onViewRecycled(c3oo);
            identityHashMap.remove(c3oo);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot find wrapper for ");
            sb.append(c3oo);
            throw AbstractC43594JPz.A0o(c70371WSz, ", seems like it is not bound by this adapter: ", sb);
        }
    }

    @Override // X.C2UU
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // X.C2UU
    public final void setStateRestorationPolicy(EnumC65362xY enumC65362xY) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r3 = new X.C69319VlR(r4, r2, ((X.WT1) r4.A04).A00, r4.A05);
        r6.add(r5, r3);
        r1 = r4.A01.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r1.hasNext() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r0 = (androidx.recyclerview.widget.RecyclerView) X.MSZ.A0n(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        r2.onAttachedToRecyclerView(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r3.A00 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
    
        r4.A03.notifyItemRangeInserted(X.C70371WSz.A00(r4, r3), r3.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        X.C70371WSz.A02(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66422UGr(X.C2UU... r9) {
        /*
            r8 = this;
            java.util.List r1 = java.util.Arrays.asList(r9)
            r8.<init>()
            X.WSz r0 = new X.WSz
            r0.<init>(r8)
            r8.A00 = r0
            java.util.Iterator r7 = r1.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r2 = r7.next()
            X.2UU r2 = (X.C2UU) r2
            X.WSz r4 = r8.A00
            java.util.List r0 = r4.A02
            int r5 = r0.size()
            if (r5 < 0) goto L97
            java.util.List r6 = r4.A02
            int r0 = r6.size()
            if (r5 > r0) goto L97
            boolean r0 = r2.hasStableIds()
            if (r0 == 0) goto L3d
            java.lang.String r1 = "ConcatAdapter"
            java.lang.String r0 = "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids"
            android.util.Log.w(r1, r0)
        L3d:
            int r3 = r6.size()
            r1 = 0
        L42:
            if (r1 >= r3) goto L5b
            java.lang.Object r0 = r6.get(r1)
            X.VlR r0 = (X.C69319VlR) r0
            X.2UU r0 = r0.A03
            if (r0 != r2) goto L58
            r0 = -1
            if (r1 == r0) goto L5b
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L5b
            goto L12
        L58:
            int r1 = r1 + 1
            goto L42
        L5b:
            X.X78 r1 = r4.A05
            X.X77 r0 = r4.A04
            X.WT1 r0 = (X.WT1) r0
            X.X76 r0 = r0.A00
            X.VlR r3 = new X.VlR
            r3.<init>(r4, r2, r0, r1)
            r6.add(r5, r3)
            java.util.List r0 = r4.A01
            java.util.Iterator r1 = r0.iterator()
        L71:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = X.MSZ.A0n(r1)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            if (r0 == 0) goto L71
            r2.onAttachedToRecyclerView(r0)
            goto L71
        L83:
            int r0 = r3.A00
            if (r0 <= 0) goto L92
            X.UGr r2 = r4.A03
            int r1 = X.C70371WSz.A00(r4, r3)
            int r0 = r3.A00
            r2.notifyItemRangeInserted(r1, r0)
        L92:
            X.C70371WSz.A02(r4)
            goto L12
        L97:
            java.lang.String r2 = "Index must be between 0 and "
            java.util.List r0 = r4.A02
            int r1 = r0.size()
            java.lang.String r0 = ". Given:"
            java.lang.String r1 = X.AnonymousClass001.A02(r1, r5, r2, r0)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        Lab:
            r0 = 0
            super.setHasStableIds(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66422UGr.<init>(X.2UU[]):void");
    }

    public final void A00(EnumC65362xY enumC65362xY) {
        super.setStateRestorationPolicy(enumC65362xY);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1542977745);
        Iterator it = this.A00.A02.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C69319VlR) it.next()).A00;
        }
        C0f9.A0A(-146234918, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-2111248951);
        C70371WSz c70371WSz = this.A00;
        C69042Vgj A01 = C70371WSz.A01(c70371WSz, i);
        C69319VlR c69319VlR = A01.A01;
        c69319VlR.A03.getItemId(A01.A00);
        A01.A02 = false;
        A01.A01 = null;
        A01.A00 = -1;
        c70371WSz.A00 = A01;
        C0f9.A0A(-985884101, A03);
        return -1L;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-624507158);
        C70371WSz c70371WSz = this.A00;
        C69042Vgj A01 = C70371WSz.A01(c70371WSz, i);
        C69319VlR c69319VlR = A01.A01;
        int i3 = A01.A00;
        InterfaceC30920DiX interfaceC30920DiX = c69319VlR.A05;
        int itemViewType = c69319VlR.A03.getItemViewType(i3);
        WT2 wt2 = (WT2) interfaceC30920DiX;
        SparseIntArray sparseIntArray = wt2.A01;
        int indexOfKey = sparseIntArray.indexOfKey(itemViewType);
        if (indexOfKey > -1) {
            i2 = sparseIntArray.valueAt(indexOfKey);
        } else {
            WT3 wt3 = wt2.A03;
            C69319VlR c69319VlR2 = wt2.A02;
            i2 = wt3.A00;
            wt3.A00 = i2 + 1;
            wt3.A01.put(i2, c69319VlR2);
            sparseIntArray.put(itemViewType, i2);
            wt2.A00.put(i2, itemViewType);
        }
        A01.A02 = false;
        A01.A01 = null;
        A01.A00 = -1;
        c70371WSz.A00 = A01;
        C0f9.A0A(-1111780517, A03);
        return i2;
    }
}
