package X;

import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;

/* renamed from: X.49D, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C49D extends C03E implements InterfaceC16600sD {
    public static final C49D A00 = new C49D();

    public C49D() {
        super(4, OnDemandSurfaceTriggerCache.class, "<init>", "<init>(Lcom/facebook/quickpromotion/sdk/models/ondemand/OnDemandFetchKey;Lcom/facebook/quickpromotion/sdk/fetcher/ondemand/OnDemandTriggerContext;Lcom/facebook/quickpromotion/sdk/fetcher/ondemand/OnDemandCacheContext;Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C9CB c9cb = (C9CB) obj;
        C918349l c918349l = (C918349l) obj2;
        AnonymousClass497 anonymousClass497 = (AnonymousClass497) obj3;
        String str = (String) obj4;
        C14360o3.A0B(c9cb, 0);
        C14360o3.A0B(c918349l, 1);
        C14360o3.A0B(anonymousClass497, 2);
        C14360o3.A0B(str, 3);
        return new OnDemandSurfaceTriggerCache(c9cb, anonymousClass497, c918349l, str);
    }
}
