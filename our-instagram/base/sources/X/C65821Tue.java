package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;

/* renamed from: X.Tue, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65821Tue implements InterfaceC77833eB {
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager, com.bloks.stdlib.components.bkcomponentscollection.BloksStaggeredGridLayoutManager] */
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView recyclerView = (RecyclerView) obj;
        U46 u46 = ((C65822Tuf) obj2).A0C;
        if (u46 instanceof U4C) {
            U4C u4c = (U4C) u46;
            C14360o3.A0B(context, 0);
            boolean z = u4c.A00;
            int i = ((U46) u4c).A00;
            if (z) {
                linearLayoutManager2 = new StickyHeadersLinearLayoutManager(context, i);
            } else {
                linearLayoutManager2 = new LinearLayoutManager(context, i, false);
            }
            linearLayoutManager2.A1t(u4c.A01);
            linearLayoutManager = linearLayoutManager2;
        } else if (u46 instanceof Ut7) {
            Ut7 ut7 = (Ut7) u46;
            C14360o3.A0B(context, 0);
            linearLayoutManager = new GridLayoutManager(context, ut7.A00, ((U46) ut7).A00, false);
        } else {
            Ut6 ut6 = (Ut6) u46;
            ?? staggeredGridLayoutManager = new StaggeredGridLayoutManager(ut6.A00, ((U46) ut6).A00);
            staggeredGridLayoutManager.A00 = true;
            linearLayoutManager = staggeredGridLayoutManager;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r2 != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC77833eB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean Ek2(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            X.Tuf r5 = (X.C65822Tuf) r5
            X.Tuf r6 = (X.C65822Tuf) r6
            X.U46 r2 = r5.A0C
            X.U46 r3 = r6.A0C
            boolean r0 = r2 instanceof X.U4C
            if (r0 == 0) goto L2f
            X.U4C r2 = (X.U4C) r2
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            boolean r0 = r3 instanceof X.U4C
            if (r0 == 0) goto L2b
            int r1 = r2.A00
            X.U4C r3 = (X.U4C) r3
            int r0 = r3.A00
            if (r1 != r0) goto L2b
            boolean r1 = r2.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L2b
            boolean r2 = r2.A00
            boolean r1 = r3.A00
        L28:
            r0 = 1
            if (r2 == r1) goto L2c
        L2b:
            r0 = 0
        L2c:
            r0 = r0 ^ 1
            return r0
        L2f:
            boolean r0 = r2 instanceof X.Ut7
            if (r0 == 0) goto L4a
            X.Ut7 r2 = (X.Ut7) r2
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            boolean r0 = r3 instanceof X.Ut7
            if (r0 == 0) goto L2b
            int r1 = r2.A00
            X.Ut7 r3 = (X.Ut7) r3
            int r0 = r3.A00
            if (r1 != r0) goto L2b
            int r2 = r2.A00
            int r1 = r3.A00
            goto L28
        L4a:
            X.Ut6 r2 = (X.Ut6) r2
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            boolean r0 = r3 instanceof X.Ut6
            if (r0 == 0) goto L2b
            int r1 = r2.A00
            X.Ut6 r3 = (X.Ut6) r3
            int r0 = r3.A00
            if (r1 != r0) goto L2b
            int r2 = r2.A00
            int r1 = r3.A00
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65821Tue.Ek2(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((RecyclerView) obj).setLayoutManager(null);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
