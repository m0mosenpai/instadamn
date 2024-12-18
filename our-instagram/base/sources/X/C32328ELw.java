package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ELw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32328ELw extends AbstractC59962oe implements InterfaceC37157GYu, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ThreadDetailsChannelControlsFragment";
    public EQ0 A00;
    public E70 A01;
    public C189478aR A02;
    public InterfaceC83733oI A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public InterfaceC37169GZg A0B;
    public final InterfaceC09390do A0H = C37052GUi.A00(this, 19);
    public final C41761wQ A0K = new C41761wQ(null);
    public final InterfaceC09390do A0J = AbstractC25225BEi.A0a(new C37052GUi(this, 20), new C37052GUi(this, 21), new C37018GSz(47, this, null), AbstractC25225BEi.A1D(C31817Dyb.class));
    public final InterfaceC09390do A0G = C37052GUi.A00(this, 18);
    public final C34424FFo A0E = new C34424FFo(this);
    public final C34425FFp A0F = new C34425FFp(this);
    public final C34421FFl A0C = new C34421FFl(this);
    public final C34422FFm A0D = new C34422FFm(this);
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC37157GYu
    public final void AHL() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new EQ0(requireContext(), AbstractC166987dD.A0r(this.A0I));
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        EQ0 eq0 = this.A00;
        if (eq0 == null) {
            str = "adapter";
        } else {
            A0D.setAdapter(eq0);
            AbstractC31177DnL.A0s(getContext(), A0D);
            C41761wQ c41761wQ = this.A0K;
            InterfaceC37169GZg interfaceC37169GZg = this.A0B;
            str = "clientInfra";
            if (interfaceC37169GZg != null) {
                GKK.A00(interfaceC37169GZg.BOE().APK().A0O(AbstractC142856cl.A01), c41761wQ, this, 7);
                InterfaceC37169GZg interfaceC37169GZg2 = this.A0B;
                if (interfaceC37169GZg2 != null) {
                    InterfaceC37279GbW.A00(interfaceC37169GZg2);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A00(C32328ELw c32328ELw) {
        List list;
        String str;
        int i;
        InterfaceC83733oI interfaceC83733oI;
        C81543kP c81543kP;
        E70 e70 = c32328ELw.A01;
        if (e70 == null || (c81543kP = e70.A0E) == null || (list = c81543kP.A09) == null) {
            list = C16930sl.A00;
        }
        InterfaceC09390do interfaceC09390do = c32328ELw.A0I;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        int height = AbstractC31178DnM.A0B(c32328ELw).getHeight();
        E70 e702 = c32328ELw.A01;
        String str2 = null;
        if (e702 != null && (interfaceC83733oI = e702.A0L) != null) {
            str = AbstractC31171DnF.A0c(interfaceC83733oI);
        } else {
            str = null;
        }
        E70 e703 = c32328ELw.A01;
        if (e703 != null) {
            str2 = e703.A0Q;
            i = e703.A06();
        } else {
            i = 0;
        }
        C34423FFn c34423FFn = new C34423FFn(c32328ELw);
        C14360o3.A0B(A0r, 0);
        KDS A00 = AbstractC46899Kog.A00(A0r, str, str2, list, height, 0, 29, i, true, true);
        A00.A01 = new C49262LqI(c34423FFn, 0);
        C189448aO A0X = AbstractC31177DnL.A0X(AbstractC25230BEn.A0k(interfaceC09390do, 0), true);
        A0X.A03 = 1.0f;
        A0X.A0T = new C49615Lw8(A00, 3);
        C189478aR A002 = A0X.A00();
        c32328ELw.A02 = A002;
        AbstractC31173DnH.A1G(c32328ELw, A00, A002);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // X.InterfaceC37157GYu
    public final void Ch3() {
        FragmentActivity requireActivity = requireActivity();
        if (!AbstractC46763KmK.A00(requireActivity)) {
            requireActivity.finish();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131959069);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A0t;
        int i;
        String str;
        int A02 = C0f9.A02(501436971);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        InterfaceC83733oI A00 = AbstractC35077Fco.A00(requireArguments, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A00 != null) {
            this.A03 = A00;
            String string = requireArguments.getString("channel_control_entrypoint");
            if (string != null) {
                this.A04 = string;
                Context requireContext = requireContext();
                InterfaceC09390do interfaceC09390do = this.A0I;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI interfaceC83733oI = this.A03;
                if (interfaceC83733oI == null) {
                    str = "threadId";
                } else {
                    interfaceC09390do.getValue();
                    C2054597s c2054597s = C2054597s.A00;
                    C16930sl c16930sl = C16930sl.A00;
                    InterfaceC37169GZg A01 = C7KH.A01(requireContext, A0r, c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl), interfaceC83733oI);
                    this.A0B = A01;
                    if (A01 == null) {
                        str = "clientInfra";
                    } else {
                        InterfaceC37279GbW.A01(A01);
                        C0f9.A09(1330912653, A02);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            A0t = AbstractC166987dD.A12("entryPoint can't be null");
            i = 1770694787;
        } else {
            A0t = AbstractC31172DnG.A0t();
            i = 963520620;
        }
        C0f9.A09(i, A02);
        throw A0t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(926983391);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_thread_details_channel_controls_fragment, viewGroup, false);
        C0f9.A09(697478902, A02);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010e, code lost:
    
        if (X.C14360o3.A0K(r1, r0) == false) goto L47;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32328ELw.onDestroyView():void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1508299255);
        super.onResume();
        View A0B = AbstractC31178DnM.A0B(this);
        C14360o3.A07(A0B);
        A0B.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35716Fpq(1, this, A0B));
        C0f9.A09(-2065708334, A02);
    }
}
