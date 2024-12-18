package com.instagram.search.surface.repository;

import X.AbstractC23611Dp;
import X.C0eB;
import X.C41171IKk;
import X.C55168OdW;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.W58;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.search.surface.repository.SerpRepository$fetchFeedPage$2", f = "SerpRepository.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class SerpRepository$fetchFeedPage$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C41171IKk A02;
    public final /* synthetic */ W58 A03;
    public final /* synthetic */ C55168OdW A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerpRepository$fetchFeedPage$2(UserSession userSession, C41171IKk c41171IKk, W58 w58, C55168OdW c55168OdW, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(1, interfaceC23621Ds);
        this.A04 = c55168OdW;
        this.A02 = c41171IKk;
        this.A03 = w58;
        this.A01 = userSession;
        this.A05 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C55168OdW c55168OdW = this.A04;
        return new SerpRepository$fetchFeedPage$2(this.A01, this.A02, this.A03, c55168OdW, interfaceC23621Ds, this.A05);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((SerpRepository$fetchFeedPage$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.search.surface.repository.SerpRepository$fetchFeedPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
