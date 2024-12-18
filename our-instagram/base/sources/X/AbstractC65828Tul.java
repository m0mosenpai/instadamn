package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Tul, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65828Tul extends C2UU {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public List A03 = new ArrayList();
    public final U4F A04;

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public void A00(U44 u44) {
        AbstractC70663Fe abstractC70663Fe;
        int i = this.A00;
        int i2 = u44.A00;
        boolean z = true;
        boolean z2 = false;
        boolean A1S = MSY.A1S(i, i2);
        int i3 = this.A01;
        int i4 = u44.A01;
        boolean A1S2 = MSY.A1S(i3, i4);
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
            if ((!abstractC70663Fe.A1X() || !A1S) && (!abstractC70663Fe.A1Y() || !A1S2)) {
                z = false;
            }
            z2 = z;
        }
        this.A01 = i4;
        this.A00 = i2;
        List list = this.A03;
        this.A03 = u44.A02;
        if (z2) {
            notifyDataSetChanged();
        } else {
            AbstractC66552zX.A00(new C66247U5r(0, this, list)).A03(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r4 != null) goto L48;
     */
    @Override // X.C2UU
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(X.C131805xG r18, int r19) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC65828Tul.onBindViewHolder(X.5xG, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C131805xG c131805xG = (C131805xG) c3oo;
        ((InterfaceC131575wt) c131805xG.itemView).setRenderTree(null);
        c131805xG.A00 = null;
    }

    public AbstractC65828Tul(U4F u4f) {
        this.A04 = u4f;
        setHasStableIds(true);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1617054002);
        int size = this.A03.size();
        C0f9.A0A(1509134364, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-718755108);
        long j = ((U48) this.A03.get(i)).A01.A04;
        C0f9.A0A(-1269378423, A03);
        return j;
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.5xG] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C131555wr c131555wr;
        Context context = viewGroup.getContext();
        if (this instanceof C65827Tuk) {
            c131555wr = new C131555wr(context);
        } else {
            C14360o3.A0B(context, 0);
            c131555wr = new C131555wr(context);
            c131555wr.setLayoutParams(new C3OP(-1, -2));
        }
        ?? c3oo = new C3OO(c131555wr);
        c3oo.A01 = false;
        return c3oo;
    }
}
