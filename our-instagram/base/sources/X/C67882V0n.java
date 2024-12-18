package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

/* renamed from: X.V0n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67882V0n extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "CanvasFragment";
    public int A00;
    public ViewOnKeyListenerC67976V4r A01;
    public C63279Sge A02;
    public ViewOnKeyListenerC67975V4q A03;
    public Reel A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0G;
    public boolean A0F = true;
    public final InterfaceC09390do A0H = AbstractC60492pY.A02(this);

    public static final void A00(C67882V0n c67882V0n, boolean z) {
        SpinnerImageView spinnerImageView = c67882V0n.A05;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinnerImageView");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C3T1.LOADING);
        String str = c67882V0n.A06;
        if (str != null) {
            DisplayMetrics A0I = AbstractC13880nE.A0I(c67882V0n.requireContext());
            String str2 = c67882V0n.A0C;
            UserSession userSession = (UserSession) c67882V0n.A0H.getValue();
            C14360o3.A0B(userSession, 3);
            new C69645Vsm(c67882V0n, userSession, c67882V0n.A0D, str2, str, A0I.heightPixels, A0I.widthPixels, z).A00();
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        bundle.putBoolean("CanvasFragment.IS_FIRST_LOAD", this.A0F);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r19.A0F == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67882V0n.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A01() {
        String str;
        if (this.A0E && !this.A08) {
            ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = this.A01;
            if (viewOnKeyListenerC67976V4r == null) {
                str = "controller";
            } else {
                View view = viewOnKeyListenerC67976V4r.A00;
                if (view == null) {
                    str = "canvasContainer";
                } else {
                    ViewOnKeyListenerC67976V4r.A01(viewOnKeyListenerC67976V4r, view.getTranslationY(), 0.0f);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        A02();
    }

    public final void A02() {
        ViewGroup viewGroup;
        ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = this.A01;
        if (viewOnKeyListenerC67976V4r == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        viewOnKeyListenerC67976V4r.A03();
        C63279Sge c63279Sge = this.A02;
        if (c63279Sge != null && (viewGroup = c63279Sge.A01) != null && viewGroup.getChildCount() != 0) {
            long now = c63279Sge.A04.now() - c63279Sge.A00;
            boolean z = true;
            Iterator A15 = AbstractC166997dE.A15(c63279Sge.A05);
            while (A15.hasNext()) {
                if (((C68961Vez) AbstractC31176DnK.A0j(A15)).A00 == C05F.A00) {
                    z = false;
                }
            }
            RunnableC64589TLa runnableC64589TLa = new RunnableC64589TLa(c63279Sge);
            if (now <= 12000 && !z) {
                c63279Sge.A03.postDelayed(runnableC64589TLa, 12000 - now);
            } else {
                runnableC64589TLa.run();
            }
        }
        if (this.A08) {
            AbstractC25227BEk.A1B(this);
            return;
        }
        ComponentCallbacks2 parent = requireActivity().getParent();
        if (parent instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) parent).EfL(0);
        }
        if (!isAdded()) {
            return;
        }
        AbstractC25226BEj.A1P(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0B;
        if (str == null) {
            C14360o3.A0F("_moduleName");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0H.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A01();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x013f, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0151, code lost:
    
        if (X.VDO.A04 == X.VDO.A01.get(r7)) goto L34;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67882V0n.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(949854318);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_canvas, viewGroup, false);
        SpinnerImageView spinnerImageView = (SpinnerImageView) inflate.requireViewById(R.id.empty_state_view_loading_spinner);
        this.A05 = spinnerImageView;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinnerImageView");
            throw C00O.createAndThrow();
        }
        WNO.A00(spinnerImageView, 34, this);
        if (this.A09) {
            inflate.requireViewById(R.id.canvas_container).setBackgroundColor(0);
            WNO.A00(AbstractC167017dG.A0U(inflate, R.id.canvas_back_button_stub), 35, this);
        }
        C0f9.A09(-246971156, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q;
        int A02 = C0f9.A02(-1955960843);
        super.onDestroyView();
        ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = this.A01;
        if (viewOnKeyListenerC67976V4r == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        viewOnKeyListenerC67976V4r.A03();
        if (this.A09 && (viewOnKeyListenerC67975V4q = this.A03) != null) {
            viewOnKeyListenerC67975V4q.onDestroyView();
        }
        C0f9.A09(-1429063235, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(-937050999);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            AbstractC56402iY.A07(window.getDecorView(), window, false);
            ComponentCallbacks2 parent = requireActivity().getParent();
            if (parent instanceof InterfaceC53712dA) {
                ((InterfaceC53712dA) parent).EfL(8);
            }
            if (this.A0F) {
                this.A0F = false;
            }
            C0f9.A09(-1202536811, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1168601583, A02);
        throw A0g;
    }
}
