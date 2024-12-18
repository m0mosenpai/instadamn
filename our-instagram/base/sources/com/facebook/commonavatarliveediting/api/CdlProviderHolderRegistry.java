package com.facebook.commonavatarliveediting.api;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AnonymousClass139;
import X.C0eB;
import X.C14360o3;
import X.C53673NoO;
import X.C57295PcH;
import X.InterfaceC09390do;
import X.InterfaceC16660sJ;
import X.MSZ;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public final class CdlProviderHolderRegistry implements InterfaceC16660sJ {
    public static CdlProviderHolderRegistry A03;
    public static final C53673NoO A04 = new Object();
    public final IgCdlProviderBuilder A00;
    public final InterfaceC09390do A01;
    public final AnonymousClass139 A02;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8 A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:12:0x008d, B:13:0x0090, B:14:0x00a2, B:16:0x00a8, B:18:0x00b0, B:20:0x00bc, B:23:0x00c2, B:26:0x00ca, B:27:0x00cb, B:30:0x00c3, B:32:0x00c5, B:22:0x00bd), top: B:11:0x008d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C51653Mrk r11, com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder r12, X.OMg r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry.A00(X.Mrk, com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder, X.OMg, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        Iterator it = ((Set) AbstractC166987dD.A17(this.A01)).iterator();
        while (it.hasNext()) {
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) MSZ.A0n(it);
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(obj);
            }
        }
        return C0eB.A00;
    }

    public CdlProviderHolderRegistry(IgCdlProviderBuilder igCdlProviderBuilder) {
        this.A00 = igCdlProviderBuilder;
        igCdlProviderBuilder.A01 = this;
        this.A02 = new AnonymousClass139();
        this.A01 = AbstractC09440dt.A01(C57295PcH.A00);
    }
}
