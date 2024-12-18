package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.KLm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45709KLm extends AbstractRunnableC14200nk {
    public final /* synthetic */ C44374JjD A00;
    public final /* synthetic */ List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45709KLm(C44374JjD c44374JjD, List list) {
        super(104, 3, false, false);
        this.A01 = list;
        this.A00 = c44374JjD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01;
        C44374JjD c44374JjD = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1K(c44374JjD, C25821No.A00(), AbstractC25225BEi.A0t(AbstractC166987dD.A1B(it)), "STORIES_AVATAR_DEFAULT_SEARCH");
        }
    }
}
