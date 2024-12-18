package com.facebook.commonavatarliveediting;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC53424NkD;
import X.AnonymousClass194;
import X.C0eB;
import X.C19L;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1$1$1", f = "CdlProviderImpl.kt", i = {}, l = {134, 136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CdlProviderImpl$generateAvatar$2$1$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AbstractC53424NkD A03;
    public final /* synthetic */ CdlProviderImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16620sF A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdlProviderImpl$generateAvatar$2$1$1$1(AbstractC53424NkD abstractC53424NkD, CdlProviderImpl cdlProviderImpl, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF, long j) {
        super(2, interfaceC23621Ds);
        this.A04 = cdlProviderImpl;
        this.A02 = j;
        this.A06 = str;
        this.A03 = abstractC53424NkD;
        this.A05 = str2;
        this.A07 = interfaceC16620sF;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        CdlProviderImpl cdlProviderImpl = this.A04;
        long j = this.A02;
        CdlProviderImpl$generateAvatar$2$1$1$1 cdlProviderImpl$generateAvatar$2$1$1$1 = new CdlProviderImpl$generateAvatar$2$1$1$1(this.A03, cdlProviderImpl, this.A06, this.A05, interfaceC23621Ds, this.A07, j);
        cdlProviderImpl$generateAvatar$2$1$1$1.A01 = obj;
        return cdlProviderImpl$generateAvatar$2$1$1$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object A02;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            if (AnonymousClass194.A07((C19L) this.A01)) {
                CdlProviderImpl cdlProviderImpl = this.A04;
                long j = this.A02;
                String str = this.A06;
                AbstractC53424NkD abstractC53424NkD = this.A03;
                String str2 = this.A05;
                InterfaceC16620sF interfaceC16620sF = this.A07;
                this.A00 = 1;
                A02 = CdlProviderImpl.A00(abstractC53424NkD, cdlProviderImpl, str, str2, this, interfaceC16620sF, j);
            } else {
                CdlProviderImpl cdlProviderImpl2 = this.A04;
                String str3 = this.A06;
                InterfaceC16620sF interfaceC16620sF2 = this.A07;
                this.A00 = 2;
                A02 = CdlProviderImpl.A02(cdlProviderImpl2, str3, this, interfaceC16620sF2);
            }
            if (A02 == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CdlProviderImpl$generateAvatar$2$1$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
