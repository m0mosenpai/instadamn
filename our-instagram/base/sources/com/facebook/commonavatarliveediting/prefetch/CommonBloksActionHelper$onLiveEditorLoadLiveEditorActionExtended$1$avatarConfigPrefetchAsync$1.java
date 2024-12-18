package com.facebook.commonavatarliveediting.prefetch;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C55598Omc;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.OMg;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1", f = "CommonBloksActionHelper.kt", i = {}, l = {447}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C55598Omc A01;
    public final /* synthetic */ OMg A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1(C55598Omc c55598Omc, OMg oMg, String str, Map map, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A04 = map;
        this.A01 = c55598Omc;
        this.A03 = str;
        this.A02 = oMg;
        this.A06 = z;
        this.A05 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Map map = this.A04;
        return new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1(this.A01, this.A02, this.A03, map, interfaceC23621Ds, this.A06, this.A05);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            Map map = this.A04;
            if (map != null) {
                C55598Omc c55598Omc = this.A01;
                String str = this.A03;
                OMg oMg = this.A02;
                boolean z2 = this.A06;
                boolean z3 = this.A05;
                this.A00 = 1;
                obj = c55598Omc.A00(oMg, str, map, this, z2, z3);
                if (obj == c1jx) {
                    return c1jx;
                }
            } else {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = AbstractC166987dD.A1a(obj);
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
