package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59802oN {
    public int A00;
    public WeakReference A01;
    public WeakReference A02;
    public WeakReference A03;
    public WeakReference A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final UserSession A09;
    public final List A0A;
    public final InterfaceC53822dL A0B;

    public C59802oN(UserSession userSession, InterfaceC53822dL interfaceC53822dL) {
        C14360o3.A0B(userSession, 1);
        this.A09 = userSession;
        this.A0B = interfaceC53822dL;
        this.A0A = new ArrayList();
        this.A00 = R.id.modal_container;
        this.A05 = true;
    }

    public static final AbstractC10360h2 A00(C59802oN c59802oN) {
        Fragment fragment;
        if (c59802oN.A08) {
            WeakReference weakReference = c59802oN.A01;
            if (weakReference != null && (fragment = (Fragment) weakReference.get()) != null) {
                return fragment.getChildFragmentManager();
            }
            return null;
        }
        return c59802oN.A0B.B8T();
    }

    public static final JX3 A01(C59802oN c59802oN) {
        WeakReference weakReference = c59802oN.A02;
        if (weakReference != null) {
            return (JX3) weakReference.get();
        }
        return null;
    }

    public static final void A02(C59802oN c59802oN) {
        InterfaceC59832oQ interfaceC59832oQ;
        WeakReference weakReference = c59802oN.A03;
        if (weakReference != null && (interfaceC59832oQ = (InterfaceC59832oQ) weakReference.get()) != null) {
            interfaceC59832oQ.DTf();
        }
        Iterator it = c59802oN.A0A.iterator();
        while (it.hasNext()) {
            ((InterfaceC59832oQ) it.next()).DTf();
        }
    }

    public final void A04() {
        this.A0A.clear();
        if (A05() && this.A07) {
            if (C18U.A06(C06090Tz.A06, this.A09, 36311560487895670L)) {
                A03();
            }
        }
    }

    public final void A03() {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        InterfaceC11380iw interfaceC11380iw;
        AbstractC10360h2 A00;
        JX3 A01 = A01(this);
        if (A01 != null && A01.isAdded()) {
            AbstractC10360h2 A002 = A00(this);
            if (A002 != null) {
                UserSession userSession = this.A09;
                C55772hI.A00(userSession).A0C(A01, "back", A002.A0L());
                FragmentActivity activity = A01.getActivity();
                if (activity != null && !activity.isFinishing() && !A002.A11()) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36311560486978152L)) {
                        C14240no c14240no = new C14240no(A002);
                        c14240no.A03(A01);
                        c14240no.A00();
                    }
                    if (!C18U.A06(c06090Tz, userSession, 36311560487043689L) || ((A00 = A00(this)) != null && A00.A0Q("MODAL_FRAGMENT") != null)) {
                        A002.A0x("MODAL_FRAGMENT", 1);
                        A002.A0Z();
                    }
                }
                this.A02 = null;
                A02(this);
                InterfaceC53822dL interfaceC53822dL = this.A0B;
                InterfaceC11380iw Auf = interfaceC53822dL.Auf();
                WeakReference weakReference = this.A04;
                if (weakReference != null && (interfaceC11380iw = (InterfaceC11380iw) weakReference.get()) != null && C14360o3.A0K(interfaceC53822dL.Auf().getModuleName(), "direct_inbox") && C18U.A06(C06090Tz.A05, userSession, 36311560486716004L)) {
                    C06090Tz c06090Tz2 = C06090Tz.A06;
                    if (C18U.A06(c06090Tz2, userSession, 36311560486191708L) || C18U.A06(c06090Tz2, userSession, 36311560487174763L)) {
                        Auf = interfaceC11380iw;
                    }
                }
                C55772hI.A00(userSession).A0D("unknown", Auf);
                if (activity != null) {
                    if (!this.A06 && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(new WOF(activity, decorView));
                    }
                    C43687JTw.A00(activity, null, userSession);
                }
                this.A08 = false;
                this.A07 = false;
                this.A01 = null;
                this.A04 = null;
                this.A06 = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean A05() {
        JX3 A01 = A01(this);
        if (A01 != null && A01.isAdded()) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        JX3 A01 = A01(this);
        if (A01 != null && A01.isVisible()) {
            return true;
        }
        return false;
    }
}
