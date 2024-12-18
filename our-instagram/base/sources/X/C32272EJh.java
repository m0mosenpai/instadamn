package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.EJh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32272EJh extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EvergreenSafetyCheckV2Fragment";
    public FragmentActivity A00;
    public C34687FPy A01;
    public boolean A03;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A05 = true;
    public boolean A04 = true;
    public Integer A02 = C05F.A00;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "evergreen_safety_check_v2_fragment";
    }

    public static final void A01(C32272EJh c32272EJh) {
        if (c32272EJh.A07 && !c32272EJh.A03) {
            return;
        }
        if (c32272EJh.A08 && !c32272EJh.A06) {
            return;
        }
        AbstractC167007dF.A0J().post(new GNE(c32272EJh));
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A06();
        AbstractC31171DnF.A18(c32272EJh, A0K, 2131961918);
        A0K.A0L = true;
        A0K.A0G = AbstractC25227BEk.A0v(c32272EJh, 2131961917);
        A0K.A01 = AbstractC167027dH.A01(C31349DqE.A0S);
        G97.A00(A0K, c32272EJh, 16);
        AbstractC25233BEq.A1F(A0K);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public static final HashMap A00(C32272EJh c32272EJh) {
        HashMap A1G = AbstractC166987dD.A1G();
        if (c32272EJh.A07) {
            A1G.put("hide_more_comments", String.valueOf(c32272EJh.A05));
        }
        if (c32272EJh.A08) {
            A1G.put("hide_message_requests", String.valueOf(c32272EJh.A04));
        }
        return A1G;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35682FpH.A00(this, 59), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        String str;
        int A02 = C0f9.A02(-1974805532);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        InterfaceC09390do interfaceC09390do = this.A09;
        this.A01 = new C34687FPy(this, AbstractC166987dD.A0r(interfaceC09390do));
        this.A00 = requireActivity();
        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do);
        if (A0g.A03.CVn() != null) {
            this.A07 = !r0.booleanValue();
        }
        boolean z = !A0g.A2F();
        this.A08 = z;
        if (!z && !this.A07) {
            this.A08 = true;
            this.A07 = true;
            C0w9.A03("evergreen_safety_check_v2_fragment", "Both settings are already on");
        }
        if (bundle2 != null) {
            String A0Y = AbstractC31175DnJ.A0Y(bundle2, "event");
            Integer[] A00 = C05F.A00(2);
            int i = 0;
            int length = A00.length;
            while (true) {
                if (i < length) {
                    num = A00[i];
                    if (1 - num.intValue() != 0) {
                        str = "";
                    } else {
                        str = "election";
                    }
                    if (str.equals(A0Y)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    num = C05F.A00;
                    break;
                }
            }
            this.A02 = num;
        }
        C0f9.A09(-619187007, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r7.A07 == false) goto L15;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32272EJh.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
