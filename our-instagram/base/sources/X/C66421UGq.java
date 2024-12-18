package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.logging.LoggingContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UGq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66421UGq extends C2UU {
    public View.OnAttachStateChangeListener A00;
    public List A01 = C16930sl.A00;
    public final Map A02;
    public final Map A03;

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        C66582za A00 = AbstractC66552zX.A00(new UGJ(new UGK(this.A03), this, this.A01, list));
        this.A01 = list;
        A00.A03(this);
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        BJ6 bj6 = new BJ6(1, recyclerView, this);
        this.A00 = bj6;
        recyclerView.addOnAttachStateChangeListener(bj6);
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        int itemViewType = getItemViewType(i);
        ((UGL) AbstractC06930Yk.A01(Integer.valueOf(itemViewType), this.A02)).A07(c3oo, (C63406Sjd) this.A01.get(i));
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return ((UGL) AbstractC06930Yk.A01(Integer.valueOf(i), this.A02)).A06(viewGroup);
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        recyclerView.removeOnAttachStateChangeListener(this.A00);
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        AbstractC66439UHp abstractC66439UHp;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof AbstractC66439UHp) && (abstractC66439UHp = (AbstractC66439UHp) c3oo) != null) {
            abstractC66439UHp.A00();
        }
    }

    public C66421UGq(Map map) {
        this.A03 = map;
        LinkedHashMap A0y = AbstractC43594JPz.A0y(map);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            A0y.put(Integer.valueOf(((UGL) entry.getValue()).A02.A00), entry.getValue());
        }
        this.A02 = A0y;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1675150797);
        int size = this.A01.size();
        C0f9.A0A(-1454497185, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        LoggingContext loggingContext;
        int A03 = C0f9.A03(1748641686);
        Object obj = ((C63406Sjd) this.A01.get(i)).A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem");
        Object BKB = ((BaseCheckoutItem) obj).BKB();
        Map map = this.A03;
        if (!map.containsKey(BKB)) {
            Object A09 = AbstractC001800i.A09(map.keySet());
            UGL ugl = (UGL) map.get(A09);
            if (ugl != null && (loggingContext = ugl.A03) != null) {
                Wap wap = C2FP.A01().A04;
                StringBuilder sb = new StringBuilder();
                sb.append("CheckoutListViewAdapter: ViewBinder NOT FOUND: ");
                sb.append(loggingContext.A02);
                sb.append(' ');
                sb.append(BKB);
                sb.append(" at ");
                sb.append(i);
                sb.append(" size ");
                sb.append(map.size());
                wap.A0O(loggingContext, sb.toString());
                Iterator A12 = AbstractC43593JPy.A12(map);
                while (A12.hasNext()) {
                    C2FP.A01().A04.A0O(loggingContext, AbstractC167017dG.A0n(A12.next(), "CheckoutListViewAdapter: ", new StringBuilder()));
                }
            }
            BKB = A09;
        }
        UGL ugl2 = (UGL) map.get(BKB);
        if (ugl2 == null) {
            ugl2 = (UGL) AbstractC001800i.A09(map.values());
        }
        int i2 = ugl2.A02.A00;
        C0f9.A0A(-906266706, A03);
        return i2;
    }
}
