package X;

import com.instagram.avatars.store.AvatarStore;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectTrayViewModel$getEffectTrayResponse$$inlined$filter$1$2;

/* renamed from: X.8q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198528q1 extends AbstractC52922bZ implements C8BD {
    public int A00;
    public C22P A01;
    public InterfaceC185638Lg A02;
    public InterfaceC143326dX A03;
    public C0UO A04;
    public final AnonymousClass830 A05;
    public final C142246bh A06;
    public final AvatarStore A07;
    public final EffectTrayService A08;
    public final C8LB A09;
    public final C1819485e A0A;
    public final UserSession A0B;
    public final C55U A0C;
    public final C86O A0D;
    public final AbstractC198478pw A0E;
    public final C198538q2 A0F;
    public final C8LA A0G;
    public final InterfaceC24731Iq A0H;
    public final C05A A0I;

    @Override // X.C8BD
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.8qX] */
    public static final C198758qX A00(C198528q1 c198528q1) {
        boolean z;
        AbstractC191288dX ANN = c198528q1.A0E.ANN(new C9CB(AbstractC191238dS.A01(c198528q1.A0C), "FOR_YOU"), (C85D) c198528q1.A0G.A00.getValue());
        InterfaceC143326dX interfaceC143326dX = c198528q1.A03;
        if (interfaceC143326dX != null) {
            z = interfaceC143326dX.CPd();
        } else {
            z = false;
        }
        final C191298dY A04 = c198528q1.A08.A04(ANN, null, null, null, null, z);
        return new InterfaceC19390xP() { // from class: X.8qX
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new PostCaptureEffectTrayViewModel$getEffectTrayResponse$$inlined$filter$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
    }

    public static final void A01(C85B c85b, C198528q1 c198528q1) {
        c198528q1.A0I.Egh(null);
        c198528q1.A09.A00.A00().ETb(null);
        C141796aw A00 = AbstractC141776au.A00(c198528q1);
        C206639Cu c206639Cu = new C206639Cu(c198528q1, null, 23);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
        c198528q1.A0G.A00.Egh(new C85D(c85b));
        InterfaceC185638Lg interfaceC185638Lg = c198528q1.A02;
        if (interfaceC185638Lg != null) {
            interfaceC185638Lg.DZr(null);
        }
    }

    public final void A02() {
        InterfaceC185638Lg interfaceC185638Lg = this.A02;
        if (interfaceC185638Lg != null) {
            interfaceC185638Lg.DsT();
        }
        this.A02 = null;
        this.A00 = -1;
        A01(C85B.A03, this);
    }

    public /* synthetic */ C198528q1(C22P c22p, AnonymousClass830 anonymousClass830, C142246bh c142246bh, EffectTrayService effectTrayService, C8LB c8lb, C1819485e c1819485e, UserSession userSession, C55U c55u, C86O c86o, AbstractC198478pw abstractC198478pw, C198538q2 c198538q2, C8LA c8la) {
        AvatarStore A00 = C20Y.A00(userSession);
        C14360o3.A0B(c8lb, 5);
        C14360o3.A0B(c142246bh, 7);
        C14360o3.A0B(c1819485e, 9);
        C14360o3.A0B(anonymousClass830, 11);
        C14360o3.A0B(A00, 13);
        this.A0B = userSession;
        this.A0C = c55u;
        this.A0E = abstractC198478pw;
        this.A0G = c8la;
        this.A09 = c8lb;
        this.A08 = effectTrayService;
        this.A06 = c142246bh;
        this.A0D = c86o;
        this.A0A = c1819485e;
        this.A0F = c198538q2;
        this.A05 = anonymousClass830;
        this.A01 = c22p;
        this.A07 = A00;
        this.A0H = new C24721Ip(0);
        this.A0I = C10E.A00(null);
        this.A00 = -1;
    }
}
