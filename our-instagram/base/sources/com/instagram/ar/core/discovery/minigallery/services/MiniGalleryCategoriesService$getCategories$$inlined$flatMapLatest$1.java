package com.instagram.ar.core.discovery.minigallery.services;

import X.AbstractC09560e7;
import X.AbstractC15820qc;
import X.AbstractC18560vj;
import X.AbstractC23611Dp;
import X.AnonymousClass058;
import X.AnonymousClass859;
import X.C05F;
import X.C0eB;
import X.C14360o3;
import X.C16440rp;
import X.C171017js;
import X.C172807mr;
import X.C172887n0;
import X.C1JX;
import X.C206629Ct;
import X.C2JM;
import X.C3NX;
import X.C85A;
import X.C907442n;
import X.C907542o;
import X.C9DH;
import X.InterfaceC16610sE;
import X.InterfaceC19390xP;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1", f = "MiniGalleryCategoriesService.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ MiniGalleryCategoriesService A03;
    public final /* synthetic */ AnonymousClass859 A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(MiniGalleryCategoriesService miniGalleryCategoriesService, AnonymousClass859 anonymousClass859, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(3, interfaceC23621Ds);
        this.A03 = miniGalleryCategoriesService;
        this.A04 = anonymousClass859;
        this.A05 = z;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1 = new MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(this.A03, this.A04, (InterfaceC23621Ds) obj3, this.A05);
        miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.A01 = obj;
        miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.A02 = obj2;
        return miniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC19390xP anonymousClass058;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            C172807mr c172807mr = (C172807mr) this.A02;
            if (!c172807mr.A01.isEmpty()) {
                anonymousClass058 = new C16440rp(new C3NX(c172807mr));
            } else {
                final MiniGalleryCategoriesService miniGalleryCategoriesService = this.A03;
                boolean A0E = AbstractC15820qc.A0E(miniGalleryCategoriesService.A01);
                final AnonymousClass859 anonymousClass859 = this.A04;
                if (A0E) {
                    boolean z = this.A05;
                    UserSession userSession = miniGalleryCategoriesService.A03;
                    C85A c85a = anonymousClass859.A00;
                    C14360o3.A0B(c85a, 1);
                    C2JM c2jm = new C2JM();
                    c2jm.A02("include_flm_effects", Boolean.valueOf(z));
                    c2jm.A04("product", c85a.name());
                    c2jm.A02("show_green_screen_category_for_reels", false);
                    C907442n c907442n = new C907442n(c2jm, C171017js.class, "IGAREffectsGalleryCategoriesQuery", false);
                    C907542o c907542o = new C907542o(userSession);
                    c907542o.A08(c907442n);
                    c907542o.A03 = C05F.A00;
                    c907542o.A05 = null;
                    c907542o.A04 = -1L;
                    final C172887n0 c172887n0 = new C172887n0(new C206629Ct(10, null), c907542o.A06().A04(74970091, 3));
                    anonymousClass058 = new InterfaceC19390xP() { // from class: X.9Jx
                        @Override // X.InterfaceC19390xP
                        public final Object collect(InterfaceC19960yQ interfaceC19960yQ2, InterfaceC23621Ds interfaceC23621Ds) {
                            return AbstractC167017dG.A0i(interfaceC23621Ds, c172887n0, new C208369Jv(0, miniGalleryCategoriesService, anonymousClass859, interfaceC19960yQ2));
                        }
                    };
                } else {
                    anonymousClass058 = new AnonymousClass058(new C9DH(anonymousClass859, (InterfaceC23621Ds) null, miniGalleryCategoriesService, 9));
                }
            }
            this.A00 = 1;
            if (AbstractC18560vj.A02(this, anonymousClass058, interfaceC19960yQ) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
