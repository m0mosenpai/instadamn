package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KMc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45725KMc extends AbstractRunnableC14200nk {
    public String A00;
    public final List A01;
    public final /* synthetic */ C48300LYz A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45725KMc(C48300LYz c48300LYz, String str, List list) {
        super(1788300865, 3, false, false);
        C14360o3.A0B(str, 2);
        this.A02 = c48300LYz;
        this.A00 = str;
        this.A01 = list;
    }

    private final void A00(ViewGroup viewGroup, AbstractC66422zJ abstractC66422zJ, int i) {
        C48300LYz c48300LYz = this.A02;
        C3OO createViewHolder = abstractC66422zJ.createViewHolder(viewGroup, c48300LYz.A01);
        HashMap hashMap = c48300LYz.A05;
        Integer valueOf = Integer.valueOf(i);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new C7K4();
            hashMap.put(valueOf, obj);
        }
        C7K4 c7k4 = (C7K4) obj;
        if (C14360o3.A0K(this.A00, c48300LYz.A07)) {
            C14360o3.A0B(createViewHolder, 0);
            c7k4.A01.add(createViewHolder);
        } else {
            this.A00 = c48300LYz.A07;
            A00(viewGroup, abstractC66422zJ, i);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC09800fd.A01("MessageThreadViewHolderPreloaderIgRecyclerView.preload", 844483705);
        C48300LYz c48300LYz = this.A02;
        InterfaceC09390do interfaceC09390do = c48300LYz.A04.A0A;
        ((C69613Av) AbstractC166987dD.A17(interfaceC09390do)).A04();
        FrameLayout frameLayout = new FrameLayout(c48300LYz.A00);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            A00(frameLayout, c48300LYz.A02.A02(A0B), A0B);
        }
        ((C69613Av) AbstractC166987dD.A17(interfaceC09390do)).A05();
        AbstractC09800fd.A00(-114527820);
    }
}
