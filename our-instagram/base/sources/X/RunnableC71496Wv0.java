package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Wv0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71496Wv0 implements Runnable {
    public final /* synthetic */ AnonymousClass436 A00;
    public final /* synthetic */ V17 A01;

    public RunnableC71496Wv0(AnonymousClass436 anonymousClass436, V17 v17) {
        this.A01 = v17;
        this.A00 = anonymousClass436;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2JS c2js;
        ImmutableList A06;
        V17 v17 = this.A01;
        if (!v17.mDetached) {
            AnonymousClass436 anonymousClass436 = this.A00;
            if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (A06 = c2js.A06(C66958Udt.class, "xfb_genai_thread_subscriptions_query(product_type:$product_type)", 1679701554)) != null && (!A06.isEmpty())) {
                UGc uGc = v17.A00;
                if (uGc == null) {
                    C14360o3.A0F("itemAdapter");
                    throw C00O.createAndThrow();
                }
                uGc.A00 = A06;
                uGc.notifyDataSetChanged();
                return;
            }
            V17.A01(v17);
        }
    }
}
