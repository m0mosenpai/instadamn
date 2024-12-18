package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.intf.MultipleLinksEditModel;

/* renamed from: X.EJm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32277EJm extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MultipleLinksEditFragment";
    public ActionButton A00;
    public IgFormField A01;
    public IgFormField A02;
    public Integer A03;
    public C09530e4 A04;
    public boolean A05;
    public IgTextView A06;
    public final InterfaceC09390do A0A = C1XM.A00(new GSv(this, 39));
    public final InterfaceC09390do A08 = C1XM.A00(new GSv(this, 38));
    public final InterfaceC09390do A07 = C1XM.A00(new GSv(this, 37));
    public final C35469Fl4 A0B = new C35469Fl4(this, 26);
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        Context requireContext;
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        ?? obj = new Object();
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    requireContext = requireContext();
                    i = 2131970195;
                } else {
                    throw B4Z.A00();
                }
            } else {
                requireContext = requireContext();
                i = 2131970186;
            }
            obj.A02 = requireContext.getString(i);
            ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC31723DwS.A00(this, 33), interfaceC56362iU, obj);
            Integer num2 = this.A03;
            if (num2 != null) {
                if (num2 == C05F.A01) {
                    A00.setEnabled(false);
                }
                this.A00 = A00;
                AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 34), AbstractC31176DnK.A0I(), interfaceC56362iU);
                return;
            }
        }
        C14360o3.A0F(DatePickerDialogModule.ARG_MODE);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "multiple_links_edit";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32277EJm.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(EnumC141996bI enumC141996bI, String str, String str2) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0C = enumC141996bI;
        A0K.A0H = str2;
        A0K.A0D = str;
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }

    public static final boolean A01(C32277EJm c32277EJm) {
        String str;
        IgFormField igFormField = c32277EJm.A02;
        if (igFormField == null) {
            str = "urlFormField";
        } else {
            String A0x = AbstractC31174DnI.A0x(igFormField);
            if (c32277EJm.A01 == null) {
                str = "titleFormField";
            } else {
                return !AbstractC166987dD.A1L(A0x, AbstractC31174DnI.A0x(r0)).equals(c32277EJm.A04);
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-946297108);
        super.onCreate(bundle);
        MultipleLinksEditModel multipleLinksEditModel = (MultipleLinksEditModel) requireArguments().getParcelable("edit_model");
        if (multipleLinksEditModel != null) {
            this.A03 = multipleLinksEditModel.A00;
            C0f9.A09(-1563035911, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1570699514, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1473169392);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_edit_link, viewGroup, false);
        C0f9.A09(-937054250, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(438311439);
        super.onPause();
        View view = this.mView;
        if (view != null) {
            AbstractC13880nE.A0O(view);
        }
        C0f9.A09(1912246350, A02);
    }
}
