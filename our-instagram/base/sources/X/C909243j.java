package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.43j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C909243j implements InterfaceC909343k {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final C685836v A03;
    public final C79983hn A04;
    public final InterfaceC60442pS A05;
    public final C689538g A06;
    public final C64842wi A07;
    public final InterfaceC61432r6 A08;

    public C909243j(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, C685836v c685836v, C79983hn c79983hn, InterfaceC60442pS interfaceC60442pS, C689538g c689538g, C64842wi c64842wi, InterfaceC61432r6 interfaceC61432r6) {
        C14360o3.A0B(c689538g, 7);
        C14360o3.A0B(c79983hn, 8);
        this.A02 = interfaceC686136y;
        this.A03 = c685836v;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A05 = interfaceC60442pS;
        this.A08 = interfaceC61432r6;
        this.A06 = c689538g;
        this.A04 = c79983hn;
        this.A07 = c64842wi;
    }

    @Override // X.InterfaceC909343k
    public final void DSS(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        String str;
        C14360o3.A0B(c38321qM, 0);
        C38321qM A1e = c38321qM.A1e(c75113Zb.A03);
        if (A1e == null) {
            A1e = c38321qM;
        }
        InterfaceC39681sr BuT = A1e.A0C.BuT();
        if (BuT != null) {
            str = BuT.AgQ();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str != null) {
                C689538g c689538g = this.A06;
                C38321qM A1e2 = c38321qM.A1e(c75113Zb.A03);
                if (A1e2 == null) {
                    A1e2 = c38321qM;
                }
                c689538g.A00((C685836v) this.A02, new C42565Isj(this, c38321qM, c75113Zb, i), str, AbstractC41653Ibl.A00(A1e2, this.A05.getModuleName()));
                return;
            }
            return;
        }
        DlE(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC909343k
    public final void DlD(C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ) {
    }

    @Override // X.InterfaceC909343k
    public final void DlE(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        A00(c38321qM, c75113Zb, "airplane_button", i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC909343k
    public final void DlK(Rect rect, ViewParent viewParent, C38321qM c38321qM, int i) {
        AbstractC59962oe abstractC59962oe;
        C14360o3.A0B(c38321qM, 2);
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        C35021Fbu c35021Fbu = new C35021Fbu(userSession, fragment.requireContext());
        if (c35021Fbu.A01()) {
            c35021Fbu.A00(D2Z.A00);
            return;
        }
        if (this.A03.A01 || !C18U.A06(C06090Tz.A05, userSession, 2342162545453833712L)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - ViewConfiguration.getLongPressTimeout();
        C79983hn c79983hn = this.A04;
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return;
        }
        Integer num = C05F.A00;
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) fragment;
        C14360o3.A0B(interfaceC11380iw, 5);
        C79993ho c79993ho = c79983hn.A03;
        InterfaceC60442pS interfaceC60442pS = c79983hn.A04;
        Fragment fragment2 = c79983hn.A00;
        if ((fragment2 instanceof AbstractC59962oe) && (abstractC59962oe = (AbstractC59962oe) fragment2) != null) {
            c79993ho.A00(rect, viewParent, activity, abstractC59962oe, interfaceC11380iw, userSession, c38321qM, interfaceC60442pS, AbstractC40650I0i.A00(c38321qM), num, i, currentTimeMillis);
        }
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A3M.Egi(A00, true, C23031Ai.A8c[83]);
    }

    @Override // X.InterfaceC909343k
    public final void DlP(MotionEvent motionEvent, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        if (!this.A03.A01) {
            if (C18U.A06(C06090Tz.A05, this.A01, 2342162545453833712L)) {
                C79983hn c79983hn = this.A04;
                c79983hn.A03.A01(motionEvent, c38321qM.getId());
            }
        }
    }

    private final void A00(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i) {
        C64842wi c64842wi = this.A07;
        if (c64842wi != null) {
            EnumSet of = EnumSet.of(Trigger.A0t);
            C14360o3.A07(of);
            c64842wi.AVs(null, of);
        }
        this.A08.DVi(C6T5.A00(), AnonymousClass317.A0P, c38321qM, c75113Zb);
        this.A04.A00(c38321qM, c75113Zb, str, i);
        UserSession userSession = this.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36326154785863358L)) {
            C2DG.A00(userSession).A09(AbstractC111324zv.A00(3081));
        }
    }

    @Override // X.InterfaceC909343k
    public final void DlG(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i) {
        A00(c38321qM, c75113Zb, str, i);
    }
}
