package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6mE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148446mE {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC56392iX A03;
    public final ReelViewerFragment A04;
    public final List A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final C60842q8 A0I;

    public C148446mE(Activity activity, ViewStub viewStub, C07X c07x, InterfaceC018407e interfaceC018407e, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C148426mC c148426mC, ReelViewerFragment reelViewerFragment) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(viewStub, 8);
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = interfaceC11380iw;
        this.A04 = reelViewerFragment;
        this.A0I = new C60842q8(new C9E9(interfaceC018407e, 17), new C9F7(14, c148426mC, this), C149636oG.A00, new C0YZ(C148456mF.class));
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A03 = A01;
        this.A0H = C1XM.A00(new C9E9(this, 16));
        this.A0B = C1XM.A00(new C9E9(this, 10));
        this.A0A = C1XM.A00(new C9E9(this, 9));
        this.A08 = C1XM.A00(new C9E9(this, 7));
        this.A09 = C1XM.A00(new C9E9(this, 8));
        this.A06 = C1XM.A00(new C9E9(this, 5));
        this.A0D = C1XM.A00(new C9E9(this, 12));
        this.A0G = C1XM.A00(new C9E9(this, 15));
        this.A07 = C1XM.A00(new C9E9(this, 6));
        this.A0F = C1XM.A00(new C9E9(this, 14));
        this.A0E = C1XM.A00(new C9E9(this, 13));
        this.A05 = new ArrayList();
        this.A0C = C1XM.A00(new C9E9(this, 11));
        A01.EZv(new InterfaceC69513Al() { // from class: X.6mG
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                C14360o3.A0B(view, 0);
                view.post(new PNV(C148446mE.this));
            }
        });
        C57312k6 A00 = C07Y.A00(c07x);
        C9D4 c9d4 = new C9D4(c07x, this, (InterfaceC23621Ds) null, 23);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c9d4, A00);
        AbstractC23641Du.A03(num, anonymousClass191, new C9D4(c07x, this, (InterfaceC23621Ds) null, 24), C07Y.A00(c07x));
    }

    public static final C148456mF A00(C148446mE c148446mE) {
        return (C148456mF) c148446mE.A0I.getValue();
    }

    public static final void A01(View view, boolean z) {
        int visibility = view.getVisibility();
        if (z) {
            if (visibility != 0) {
                AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                C14360o3.A07(A01);
                A01.A07 = new C71047Wn2(view);
                A01.A0G();
                AbstractC125325le A0E = A01.A0F(false).A0E(C55942hf.A04(90.0d, 6.0d));
                A0E.A0U(0.0f, 1.0f, -1.0f);
                A0E.A0V(0.0f, 1.0f, -1.0f);
                A01.A0H();
                return;
            }
            return;
        }
        if (visibility != 0) {
            return;
        }
        view.setVisibility(8);
    }

    public final void A02() {
        User user;
        C41181vS c41181vS;
        C41181vS c41181vS2;
        C148456mF A00 = A00(this);
        if (AbstractC144996gK.A05(A00.A01, A00.A07)) {
            if (A00.A02.isEmpty()) {
                C41181vS c41181vS3 = A00.A01;
                if (c41181vS3 != null) {
                    user = c41181vS3.A0i;
                } else {
                    user = null;
                }
                if (C14360o3.A0K(user, A00.A09.A00()) && (c41181vS = A00.A01) != null && c41181vS.A0l() && (c41181vS2 = A00.A01) != null && !c41181vS2.A0k()) {
                    C05A c05a = A00.A0D;
                    c05a.Egh(C145006gL.A00(null, null, null, null, (C145006gL) c05a.getValue(), null, null, null, 0, 0, 0, 536870909, true, false, false, false, false, false, false, false, false, false, false, false));
                    return;
                }
            }
            if (!(!A00.A02.isEmpty())) {
                return;
            }
            C05A c05a2 = A00.A0D;
            c05a2.Egh(C145006gL.A00(null, null, null, null, (C145006gL) c05a2.getValue(), null, null, null, 0, 0, 0, 536870903, false, true, false, false, false, false, false, false, false, false, false, false));
            ((C141806ax) A00.A0A.getValue()).A01();
        }
    }
}
