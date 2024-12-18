package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.user.model.User;

/* renamed from: X.EJo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32278EJo extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditUsernameFragment";
    public View A00;
    public C56352iT A01;
    public ActionButton A02;
    public IgFormField A03;
    public HandlerC31739Dws A04;
    public C155506yf A05;
    public User A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public IgTextView A0A;
    public C36578GBc A0B;
    public String A0C;
    public final TextWatcher A0E = new C35469Fl4(this, 25);
    public final View.OnFocusChangeListener A0F = new ViewOnFocusChangeListenerC35694FpU(this, 20);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        ?? obj = new Object();
        C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131976572);
        ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC31723DwS.A00(this, 20), interfaceC56362iU, obj);
        this.A02 = A00;
        if (this.A08) {
            A00.setEnabled(false);
            IgFormField igFormField = this.A03;
            if (igFormField != null) {
                igFormField.setFocusable(false);
            }
            IgFormField igFormField2 = this.A03;
            if (igFormField2 != null) {
                igFormField2.setEnabled(false);
            }
        }
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 21), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_edit_username";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.U9N, android.text.method.LinkMovementMethod] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32278EJo.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C32278EJo c32278EJo) {
        C155506yf c155506yf = c32278EJo.A05;
        if (c155506yf != null) {
            long j = c155506yf.A02;
            if (j != 0) {
                c155506yf.A06 = false;
                c155506yf.A0A.flowMarkPoint(j, "username_change_confirmed");
            }
        }
        IgFormField igFormField = c32278EJo.A03;
        if (igFormField != null) {
            String A0x = AbstractC31174DnI.A0x(igFormField);
            C56352iT c56352iT = c32278EJo.A01;
            if (c56352iT != null) {
                c56352iT.setIsLoading(true);
            }
            AbstractC12990ll A0M = AbstractC31178DnM.A0M(c32278EJo.A0D);
            String A01 = AbstractC31188DnX.A01();
            C14360o3.A0B(A0x, 1);
            C25621Ms A0c = AbstractC167017dG.A0c(A0M);
            A0c.A0B("accounts/update_profile_username/");
            A0c.A9s(A01, A0x);
            C31702Dw7.A00(c32278EJo, AbstractC25227BEk.A0e(A0c, ECA.class, FY0.class), 12);
        }
    }

    public static final void A01(C32278EJo c32278EJo) {
        InterfaceC09390do interfaceC09390do = c32278EJo.A0D;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        if (C18U.A06(AbstractC25225BEi.A0j(A0o, 0), A0o, 36326545626773459L)) {
            IgFormField igFormField = c32278EJo.A03;
            String str = null;
            if (igFormField != null) {
                str = AbstractC31174DnI.A0x(igFormField);
            }
            if (AbstractC002300n.A0g(str, c32278EJo.A0C, false)) {
                AbstractC25226BEj.A1Q(c32278EJo);
                return;
            }
            C56352iT c56352iT = c32278EJo.A01;
            if (c56352iT != null) {
                c56352iT.setIsLoading(true);
            }
            IgFormField igFormField2 = c32278EJo.A03;
            if (igFormField2 == null) {
                return;
            }
            String A0x = AbstractC31174DnI.A0x(igFormField2);
            C1ON A00 = AbstractC152476ta.A00(c32278EJo.requireContext(), AbstractC166987dD.A0o(interfaceC09390do), A0x);
            C31702Dw7.A01(A00, c32278EJo, 13);
            C1GK A01 = C1GJ.A01();
            C14360o3.A0B(A01, 0);
            A01.schedule(A00);
            return;
        }
        A00(c32278EJo);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(239884680);
        super.onCreate(bundle);
        C155506yf A00 = AbstractC155496ye.A00(AbstractC166987dD.A0r(this.A0D));
        this.A05 = A00;
        if (A00 != null) {
            A00.A06("edit_user_name");
        }
        EVO.A00(this);
        C0f9.A09(1120330192, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1642427281);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_username, viewGroup, false);
        C0f9.A09(-1937166820, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1912112627);
        super.onDestroyView();
        HandlerC31739Dws handlerC31739Dws = this.A04;
        if (handlerC31739Dws != null) {
            handlerC31739Dws.removeMessages(1);
        }
        this.A04 = null;
        C36578GBc c36578GBc = this.A0B;
        if (c36578GBc != null) {
            c36578GBc.A00 = true;
        }
        this.A0B = null;
        IgFormField igFormField = this.A03;
        if (igFormField != null) {
            AbstractC31173DnH.A1D(C106904rr.A00(AbstractC166987dD.A0o(this.A0D)), igFormField);
        }
        this.A03 = null;
        this.A0A = null;
        this.A00 = null;
        this.A02 = null;
        C0f9.A09(-2127838207, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        Window window;
        int A02 = C0f9.A02(-1242678394);
        super.onPause();
        IgFormField igFormField = this.A03;
        if (igFormField != null) {
            AbstractC31173DnH.A1D(this.A0E, igFormField);
        }
        IgFormField igFormField2 = this.A03;
        if (igFormField2 != null) {
            igFormField2.setOnFocusChangeListener(null);
        }
        AbstractC13880nE.A0O(AbstractC31178DnM.A0B(this));
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C0f9.A09(1397975174, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(-2034192610);
        super.onResume();
        if (!C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(this.A0D), 36326545626773459L)) {
            IgFormField igFormField = this.A03;
            if (igFormField != null) {
                igFormField.A0H(this.A0E);
            }
            IgFormField igFormField2 = this.A03;
            if (igFormField2 != null) {
                igFormField2.setOnFocusChangeListener(this.A0F);
            }
        }
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        if (!this.A08) {
            IgFormField igFormField3 = this.A03;
            if (igFormField3 != null) {
                igFormField3.requestFocus();
            }
            IgFormField igFormField4 = this.A03;
            if (igFormField4 != null) {
                AbstractC13880nE.A0R(igFormField4);
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-1478121148, A02);
                throw A0g;
            }
        }
        C0f9.A09(1406160347, A02);
    }
}
