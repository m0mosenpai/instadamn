package X;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import java.util.ArrayList;

/* renamed from: X.EKk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32297EKk extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectManageFoldersEditFolderFragment";
    public ActionButton A00;
    public C34924FaA A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public ArrayList A06;
    public IgTextView A07;
    public IgFormField A08;
    public String A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final String A0B = "direct_manage_folders_edit";

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131959822);
        ActionButton A00 = C31722DwR.A00(ViewOnClickListenerC35681FpG.A00(this, 60), interfaceC56362iU, new Object());
        this.A00 = A00;
        A00.setEnabled(false);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ActionButton actionButton = this.A00;
        if (actionButton == null) {
            C14360o3.A0F("saveButton");
            throw C00O.createAndThrow();
        }
        if (actionButton.isEnabled()) {
            C193328hC A0P = AbstractC31180DnO.A0P(this);
            A0P.A0A(2131959817);
            A0P.A09(2131959814);
            A0P.A0M(DialogInterfaceOnClickListenerC35452Fk9.A00(this, 52), 2131959815);
            A0P.A0H(null, 2131959816);
            AbstractC166987dD.A1W(A0P);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0B;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1792074367);
        super.onCreate(bundle);
        this.A02 = AbstractC153636vY.A01(requireArguments(), "folder_id");
        this.A05 = AbstractC153636vY.A01(requireArguments(), "server_mode");
        this.A03 = AbstractC153636vY.A01(requireArguments(), "folder_name");
        this.A09 = AbstractC153636vY.A01(requireArguments(), "original_folder_name");
        Bundle requireArguments = requireArguments();
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("other_folder_names");
        AbstractC153636vY.A03(requireArguments, stringArrayList, "other_folder_names");
        this.A06 = stringArrayList;
        C34924FaA c34924FaA = new C34924FaA(AbstractC166987dD.A0r(this.A0A));
        this.A01 = c34924FaA;
        String str = this.A05;
        if (str == null) {
            C14360o3.A0F("serverMode");
            throw C00O.createAndThrow();
        }
        C34924FaA.A00(c34924FaA, "inbox_folders_edit_screen_impression", AbstractC167007dF.A0n("server_mode", str));
        C0f9.A09(765333913, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1583027892);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.direct_manage_folders_edit_folder_fragment, viewGroup, false);
        if (requireArguments().getBoolean("show_delete_button")) {
            IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(inflate, R.id.folder_delete_button);
            igdsButton.setTextColor(AbstractC166997dE.A0N(this).getColor(R.color.igds_error_or_destructive));
            ViewOnClickListenerC35681FpG.A01(igdsButton, 59, this);
            igdsButton.setVisibility(0);
        }
        IgTextView A0X = AbstractC31172DnG.A0X(inflate, R.id.folder_original_name);
        this.A07 = A0X;
        String str = this.A09;
        String str2 = "originalFolderName";
        if (str != null) {
            if (str.length() > 0) {
                if (A0X == null) {
                    str2 = "originalNameTextView";
                } else {
                    A0X.setText(Html.fromHtml(AbstractC31174DnI.A0w(this, str, 2131959821)));
                }
            }
            IgFormField A0k = AbstractC31172DnG.A0k(inflate, R.id.folder_name_form_field);
            this.A08 = A0k;
            str2 = "folderNameFormField";
            if (A0k != null) {
                String str3 = this.A03;
                if (str3 == null) {
                    str2 = "initialFolderName";
                } else {
                    A0k.setText(str3);
                    IgFormField igFormField = this.A08;
                    if (igFormField != null) {
                        igFormField.setRuleChecker(new G8J(this, 1));
                        C0f9.A09(1808325968, A02);
                        return inflate;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
