package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsStickerOverlayViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsStickerOverlayViewModel$special$$inlined$map$2$2;

/* renamed from: X.8D6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8D6 extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GT A01;
    public final C1818484t A02;
    public final InterfaceC06180Ui A03;
    public final InterfaceC06180Ui A04;

    public C8D6(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(userSession, 2);
        Integer num = C05F.A00;
        final AnonymousClass057 A00 = C10M.A00(num, 0, 0);
        this.A04 = A00;
        InterfaceC19390xP interfaceC19390xP = new InterfaceC19390xP() { // from class: X.8D7
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsStickerOverlayViewModel$special$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A01 = AbstractC58232lf.A00(anonymousClass191, interfaceC19390xP);
        final AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A03 = A002;
        this.A00 = AbstractC58232lf.A00(anonymousClass191, new InterfaceC19390xP() { // from class: X.8D8
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new ClipsStickerOverlayViewModel$special$$inlined$map$2$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        this.A02 = ((ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class)).A0Q;
    }

    public final void A02(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        C141796aw A00 = AbstractC141776au.A00(this);
        C9D3 c9d3 = new C9D3(this, drawable, (InterfaceC23621Ds) null, 40);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A00);
    }

    public final Drawable A00() {
        AbstractC223909uZ abstractC223909uZ;
        C219549n2 c219549n2;
        C8A8 c8a8 = (C8A8) this.A00.A02();
        if (c8a8 != null) {
            abstractC223909uZ = (AbstractC223909uZ) c8a8.A01;
        } else {
            abstractC223909uZ = null;
        }
        if (!(abstractC223909uZ instanceof C219549n2) || (c219549n2 = (C219549n2) abstractC223909uZ) == null) {
            return null;
        }
        return c219549n2.A00;
    }

    public final AbstractC223919ua A01() {
        C8A8 c8a8 = (C8A8) this.A01.A02();
        if (c8a8 != null) {
            return (AbstractC223919ua) c8a8.A01;
        }
        return null;
    }

    public final void A04(AbstractC223919ua abstractC223919ua) {
        C1818484t c1818484t;
        EnumC191648eM enumC191648eM;
        if (abstractC223919ua instanceof C219659nD) {
            c1818484t = this.A02;
            enumC191648eM = EnumC191648eM.A0I;
        } else if (abstractC223919ua instanceof C219669nE) {
            c1818484t = this.A02;
            enumC191648eM = EnumC191648eM.A0M;
        } else if (abstractC223919ua instanceof C219679nF) {
            c1818484t = this.A02;
            enumC191648eM = EnumC191648eM.A0L;
        } else if (abstractC223919ua instanceof C219689nG) {
            c1818484t = this.A02;
            enumC191648eM = EnumC191648eM.A0N;
        } else if (abstractC223919ua instanceof C219699nH) {
            c1818484t = this.A02;
            enumC191648eM = EnumC191648eM.A0S;
        } else {
            if (!(abstractC223919ua instanceof C219709nI)) {
                return;
            }
            c1818484t = this.A02;
            enumC191648eM = EnumC191648eM.A0R;
        }
        c1818484t.A01(enumC191648eM);
    }

    public final void A03(AbstractC223919ua abstractC223919ua) {
        C141796aw A00 = AbstractC141776au.A00(this);
        C9D3 c9d3 = new C9D3(this, abstractC223919ua, (InterfaceC23621Ds) null, 41);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A00);
    }
}
