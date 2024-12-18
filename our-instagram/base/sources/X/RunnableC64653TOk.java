package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.TOk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64653TOk implements Runnable {
    public final /* synthetic */ C58640PzD A00;
    public final /* synthetic */ C48522Ku A01;

    public RunnableC64653TOk(C58640PzD c58640PzD, C48522Ku c48522Ku) {
        this.A01 = c48522Ku;
        this.A00 = c58640PzD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48432Kk c48432Kk = this.A01.A00;
        C58640PzD c58640PzD = this.A00;
        List list = c58640PzD.A00;
        List list2 = c58640PzD.A01;
        ArrayList A0q = AbstractC25230BEn.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A0q.add(((Locale) it.next()).toLanguageTag());
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt(ST2.A00(0, 10, 79), 0);
        A0b.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
        A0b.putInt(TraceFieldType.ErrorCode, 0);
        if (!list.isEmpty()) {
            A0b.putStringArrayList("module_names", AbstractC166987dD.A1F(list));
        }
        if (!A0q.isEmpty()) {
            A0b.putStringArrayList("languages", AbstractC166987dD.A1F(A0q));
        }
        A0b.putLong("total_bytes_to_download", 0L);
        A0b.putLong("bytes_downloaded", 0L);
        c48432Kk.A01(AbstractC62642SJz.A00(A0b));
    }
}
