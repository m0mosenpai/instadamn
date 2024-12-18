package com.facebook.commonavatarliveediting;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C19L;
import X.C57569Pgh;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.OBR;
import X.On0;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1", f = "CdlProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class CdlProviderImpl$generateAvatar$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ CdlProviderImpl A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ InterfaceC16620sF A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CdlProviderImpl$generateAvatar$2$1(CdlProviderImpl cdlProviderImpl, Boolean bool, Integer num, String str, String str2, Map map, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        super(2, interfaceC23621Ds);
        this.A01 = cdlProviderImpl;
        this.A05 = str;
        this.A06 = map;
        this.A02 = bool;
        this.A03 = num;
        this.A04 = str2;
        this.A07 = interfaceC16620sF;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        CdlProviderImpl$generateAvatar$2$1 cdlProviderImpl$generateAvatar$2$1 = new CdlProviderImpl$generateAvatar$2$1(this.A01, this.A02, this.A03, this.A05, this.A04, this.A06, interfaceC23621Ds, this.A07);
        cdlProviderImpl$generateAvatar$2$1.A00 = obj;
        return cdlProviderImpl$generateAvatar$2$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CdlProviderImpl$generateAvatar$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        AbstractC09560e7.A00(obj);
        C19L c19l = (C19L) this.A00;
        CdlProviderImpl cdlProviderImpl = this.A01;
        long now = cdlProviderImpl.A03.now();
        OBR obr = cdlProviderImpl.A00;
        if (obr != null) {
            String str = this.A05;
            Map map = this.A06;
            C57569Pgh c57569Pgh = new C57569Pgh(cdlProviderImpl, str, this.A04, this.A07, c19l, now);
            if (map != null) {
                z = map.containsKey("root");
            } else {
                z = false;
            }
            Boolean bool = this.A02;
            Integer num = this.A03;
            AbstractC167017dG.A1N(str, map);
            obr.A01.A01("generate_avatar_gltf_start", str, null, map);
            GltfMemoryPointerWrapper gltfMemoryPointerWrapper = new GltfMemoryPointerWrapper();
            return Boolean.valueOf(obr.A00.generateAvatar(str, map, gltfMemoryPointerWrapper, new On0(obr, gltfMemoryPointerWrapper, str, map, c57569Pgh), z, bool, num));
        }
        return null;
    }
}
