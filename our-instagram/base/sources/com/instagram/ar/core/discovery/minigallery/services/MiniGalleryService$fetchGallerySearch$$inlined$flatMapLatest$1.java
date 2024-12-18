package com.instagram.ar.core.discovery.minigallery.services;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC18560vj;
import X.AbstractC23611Dp;
import X.AnonymousClass859;
import X.C0eB;
import X.C16440rp;
import X.C173327nk;
import X.C1JX;
import X.C206269Bj;
import X.C3NX;
import X.C47601L0l;
import X.InterfaceC16610sE;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1", f = "MiniGalleryService.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ MiniGalleryService A03;
    public final /* synthetic */ AnonymousClass859 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(MiniGalleryService miniGalleryService, AnonymousClass859 anonymousClass859, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A03 = miniGalleryService;
        this.A07 = str;
        this.A04 = anonymousClass859;
        this.A06 = str2;
        this.A05 = str3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MiniGalleryService miniGalleryService = this.A03;
        String str = this.A07;
        MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1 = new MiniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1(miniGalleryService, this.A04, str, this.A06, this.A05, (InterfaceC23621Ds) obj3);
        miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryService$fetchGallerySearch$$inlined$flatMapLatest$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19390xP A00;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            C173327nk c173327nk = (C173327nk) this.A02;
            if (c173327nk != null && AbstractC166987dD.A1b((List) ((C206269Bj) c173327nk.A00).A02)) {
                A00 = new C16440rp(new C3NX(new C47601L0l(c173327nk.A01, (List) ((C206269Bj) c173327nk.A00).A02, c173327nk.A02)));
            } else {
                A00 = MiniGalleryService.A00(this.A03, this.A04, this.A07, this.A06, this.A05);
            }
            this.A00 = 1;
            if (AbstractC18560vj.A02(this, A00, interfaceC19960yQ) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
