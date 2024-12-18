package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.facebook.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class L8F {
    public int A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final FragmentActivity A06;
    public final C53S A07;
    public final InterfaceC11380iw A08;
    public final AbstractC12990ll A09;
    public final String A0A;
    public final Bundle A0B;
    public final Fragment A0C;
    public final InterfaceC59832oQ A0D;
    public final String A0E;

    public L8F(Bundle bundle, Fragment fragment, FragmentActivity fragmentActivity, C53S c53s, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, InterfaceC59832oQ interfaceC59832oQ, String str, String str2) {
        AbstractC167007dF.A1G(abstractC12990ll, 1, interfaceC59832oQ);
        this.A09 = abstractC12990ll;
        this.A06 = fragmentActivity;
        this.A0E = str;
        this.A0B = bundle;
        this.A0D = interfaceC59832oQ;
        this.A0C = fragment;
        this.A08 = interfaceC11380iw;
        this.A0A = str2;
        this.A07 = c53s;
        this.A02 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00() {
        String str;
        String str2;
        InterfaceC59832oQ interfaceC59832oQ;
        FragmentActivity fragmentActivity = this.A06;
        if (fragmentActivity instanceof InterfaceC53772dG) {
            C55782hJ A00 = C55772hI.A00(this.A09);
            InterfaceC11380iw interfaceC11380iw = this.A08;
            A00.A0A(this.A07, interfaceC11380iw, this.A0A, fragmentActivity.getSupportFragmentManager().A0L());
            C14360o3.A0C(fragmentActivity, "null cannot be cast to non-null type com.instagram.modal.fragment.intf.ModalHost");
            C59802oN BUF = ((InterfaceC53772dG) fragmentActivity).BUF();
            if (BUF != null) {
                String str3 = this.A0E;
                Bundle bundle = this.A0B;
                InterfaceC59832oQ interfaceC59832oQ2 = this.A0D;
                Integer num = this.A01;
                Fragment fragment = this.A0C;
                boolean z = this.A05;
                int i = this.A00;
                boolean z2 = this.A04;
                boolean z3 = this.A03;
                boolean z4 = this.A02;
                boolean A1V = AbstractC167007dF.A1V(bundle);
                boolean z5 = false;
                BUF.A06 = false;
                JX3 A01 = C59802oN.A01(BUF);
                if (A01 != null) {
                    if (z) {
                        if (A01.isAdded()) {
                            BUF.A06 = A1V;
                            BUF.A03();
                        } else {
                            C0w9.A03("IgModalService_launchFragmentAsModal_fragmentSetButNotAdded", A01.getModuleName());
                            BUF.A02 = null;
                            C59802oN.A02(BUF);
                        }
                    } else {
                        C0w9.A03("IgModalService_launchFragmentAsModal_fragmentAlreadySet", A01.getModuleName());
                        return;
                    }
                }
                JX3 jx3 = new JX3();
                BUF.A02 = AbstractC25225BEi.A16(jx3);
                BUF.A03 = AbstractC25225BEi.A16(interfaceC59832oQ2);
                BUF.A04 = AbstractC25225BEi.A16(interfaceC11380iw);
                BUF.A00 = i;
                BUF.A08 = z2;
                BUF.A07 = z3;
                BUF.A05 = z4;
                if (z2) {
                    BUF.A01 = AbstractC25225BEi.A16(fragment);
                }
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC03240Dh.A00(A0b, BUF.A09);
                A0b.putString("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_NAME", str3);
                A0b.putBundle("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_ARGS", bundle);
                if (num == null) {
                    z5 = true;
                }
                A0b.putBoolean("MODAL_FRAGMENT_ARG_CHILD_FRAGMENT_NO_CUSTOM_ANIMATION_SET", z5);
                A0b.putInt("MODAL_FRAGMENT_ARG_BACKGROUND_COLOR", -1);
                A0b.putBoolean("MODAL_FRAGMENT_ARG_IS_TWO_PANE_MODAL", BUF.A08);
                A0b.putBoolean("MODAL_FRAGMENT_ARG_IS_RIGHT_PANE_MODAL", BUF.A07);
                A0b.putBoolean("ARG_ADJUST_STATUS_BAR_OFFSET", BUF.A05);
                jx3.setArguments(A0b);
                AbstractC10360h2 A002 = C59802oN.A00(BUF);
                if (A002 == null) {
                    str = "IgModalService";
                    str2 = "Fragment manager is unexpectedly null";
                } else {
                    C14240no c14240no = new C14240no(A002);
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue != A1V) {
                            if (intValue == 0) {
                                c14240no.A07(R.anim.modal_slide_up_enter, R.anim.modal_empty_animation, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit);
                            }
                        } else {
                            c14240no.A07(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit);
                        }
                    }
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) fragmentActivity.findViewById(R.id.layout_direct_sliding_pane);
                    if (slidingPaneLayout != null) {
                        if (!slidingPaneLayout.A08) {
                            slidingPaneLayout.A0B = A1V;
                        }
                        if (slidingPaneLayout.A09 || slidingPaneLayout.A03(0.0f)) {
                            slidingPaneLayout.A0B = A1V;
                        }
                    }
                    View findViewById = fragmentActivity.findViewById(R.id.direct_inbox_null_state);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                    c14240no.A0D(jx3, "MODAL_FRAGMENT", i);
                    c14240no.A0I("MODAL_FRAGMENT");
                    c14240no.A01();
                    A002.A0Z();
                    WeakReference weakReference = BUF.A03;
                    if (weakReference != null && (interfaceC59832oQ = (InterfaceC59832oQ) weakReference.get()) != null) {
                        interfaceC59832oQ.DTg();
                    }
                    Iterator it = BUF.A0A.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC59832oQ) it.next()).DTg();
                    }
                    return;
                }
            } else {
                return;
            }
        } else {
            str = "ModalFragmentLauncher";
            str2 = "Launching modal fragments is only supported in ModalHost activities";
        }
        C0w9.A03(str, str2);
    }
}
