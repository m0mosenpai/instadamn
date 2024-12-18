package com.facebook.commonavatarliveediting.prefetch;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AnonymousClass139;
import X.C00O;
import X.C0QS;
import X.C0eB;
import X.C14360o3;
import X.EnumC53128Neg;
import X.InterfaceC16660sJ;
import X.InterfaceC58017Po2;
import X.MSZ;
import android.content.Context;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class CommonCdlProviderHolder implements InterfaceC16660sJ {
    public static CommonCdlProviderHolder A07;
    public CdlProviderHolderRegistry A00;
    public C0QS A01;
    public final Context A02;
    public final IgCdlProviderBuilder A03;
    public InterfaceC58017Po2 cdlProviderInstance;
    public AtomicBoolean requiresRAMCacheForCDL = AbstractC166997dE.A17();
    public final AnonymousClass139 A06 = new AnonymousClass139();
    public final List A04 = AbstractC166987dD.A1E();
    public final AtomicBoolean A05 = new AtomicBoolean(true);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9 A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #1 {all -> 0x00cf, blocks: (B:12:0x009c, B:13:0x009f, B:15:0x00a9, B:18:0x00ca, B:22:0x00cd, B:23:0x00ce, B:31:0x0075, B:33:0x0079, B:35:0x007d, B:37:0x0086, B:39:0x008b, B:17:0x00aa), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079 A[Catch: all -> 0x00cf, TryCatch #1 {all -> 0x00cf, blocks: (B:12:0x009c, B:13:0x009f, B:15:0x00a9, B:18:0x00ca, B:22:0x00cd, B:23:0x00ce, B:31:0x0075, B:33:0x0079, B:35:0x007d, B:37:0x0086, B:39:0x008b, B:17:0x00aa), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C51653Mrk r15, X.OMg r16, X.InterfaceC23621Ds r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder.A00(X.Mrk, X.OMg, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj == EnumC53128Neg.A04) {
            CdlProviderHolderRegistry cdlProviderHolderRegistry = this.A00;
            if (cdlProviderHolderRegistry == null) {
                C14360o3.A0F("cdlProviderHolderRegistry");
                throw C00O.createAndThrow();
            }
            boolean z = this.requiresRAMCacheForCDL.get();
            if (!z) {
                Set set = (Set) AbstractC166987dD.A17(cdlProviderHolderRegistry.A01);
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        CommonCdlProviderHolder commonCdlProviderHolder = (CommonCdlProviderHolder) MSZ.A0n(it);
                        if (commonCdlProviderHolder != null && commonCdlProviderHolder.requiresRAMCacheForCDL.get()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            cdlProviderHolderRegistry.A00.A02(z);
        }
        Iterator it2 = this.A04.iterator();
        while (it2.hasNext()) {
            AbstractC25225BEi.A1U(it2.next(), obj);
        }
        return C0eB.A00;
    }

    public CommonCdlProviderHolder(Context context, IgCdlProviderBuilder igCdlProviderBuilder) {
        this.A03 = igCdlProviderBuilder;
        this.A02 = context;
    }
}
