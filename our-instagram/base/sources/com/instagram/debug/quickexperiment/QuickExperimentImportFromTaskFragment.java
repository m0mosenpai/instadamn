package com.instagram.debug.quickexperiment;

import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC37301Gc2;
import X.AbstractC43591JPw;
import X.AnonymousClass001;
import X.C03850Ja;
import X.C0b3;
import X.C0f9;
import X.C18U;
import X.C193328hC;
import X.C228319l;
import X.C229419w;
import X.C31335Dq0;
import X.C35246Fgf;
import X.C35473Fl9;
import X.C50676MYu;
import X.GYP;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.troubleshooting.MobileConfigOverridesWriterHolder;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class QuickExperimentImportFromTaskFragment extends AbstractC33235ElU implements DialogInterface.OnClickListener, InterfaceC60122ou {
    public UserSession mUserSession;
    public final TextView.OnEditorActionListener mTextDelegate = new TextView.OnEditorActionListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda0
        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    };
    public final GYP mEditDelegate = new GYP() { // from class: com.instagram.debug.quickexperiment.QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda1
        @Override // X.GYP
        public final void onTextChanged(String str) {
        }
    };

    public static /* synthetic */ boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        return false;
    }

    public static /* synthetic */ void lambda$new$1(String str) {
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "QuickExperimentImportFromTaskFragment";
    }

    private View.OnClickListener getImportOverridesFromTaskClickListener(C35473Fl9 c35473Fl9) {
        return new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda2(this, c35473Fl9);
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("Import overrides from task");
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$getImportOverridesFromTaskClickListener$2$com-instagram-debug-quickexperiment-QuickExperimentImportFromTaskFragment, reason: not valid java name */
    public /* synthetic */ void m99xa1482878(C35473Fl9 c35473Fl9, View view) {
        String str;
        String str2 = c35473Fl9.A00;
        C229419w A02 = C18U.A02(this.mUserSession, 0L);
        if (A02 != null) {
            MobileConfigManagerHolderImpl A00 = C228319l.A00(A02.A0A());
            if (A00 != null) {
                str = new MobileConfigOverridesWriterHolder(A00).importOverridesFromTask(str2);
                if (str.isEmpty()) {
                    showRefreshAppDialog(str2);
                    return;
                }
            } else {
                str = "";
            }
        } else {
            str = "Skip importing, MobileConfig xplat runtime is not ready yet.";
        }
        if (str.contains("ErrorDomain")) {
            str = AnonymousClass001.A0g(str, ". ", "This feature utilizes a WWW method for reading task attachment content, which might be malfunctioning. Refer to fburl.com/mc_task_import_issue for possible workarounds");
        }
        showErrorDialog(str2, str);
    }

    private List getImportOverridesFromTaskMenu() {
        ArrayList A1E = AbstractC166987dD.A1E();
        C31335Dq0 c31335Dq0 = new C31335Dq0("Import overrides");
        C35246Fgf c35246Fgf = new C35246Fgf(2131964348);
        C35473Fl9 c35473Fl9 = new C35473Fl9(this.mTextDelegate, this.mEditDelegate, 2, "Task# (e.g: 1234567)", "", true);
        C50676MYu c50676MYu = new C50676MYu(requireContext(), new QuickExperimentImportFromTaskFragment$$ExternalSyntheticLambda2(this, c35473Fl9), 2131964347);
        AbstractC37301Gc2.A1S(c31335Dq0, c35246Fgf, c35473Fl9, A1E);
        A1E.add(c50676MYu);
        return A1E;
    }

    private void launchHomeActivity() {
        Intent A04 = AbstractC31171DnF.A04();
        A04.setClassName(requireContext(), AbstractC43591JPw.A00(71));
        A04.setFlags(268468224);
        C0b3.A00().A07().A0G(requireContext(), A04);
    }

    private void showErrorDialog(String str, String str2) {
        C193328hC A0O = AbstractC31175DnJ.A0O(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Failed to import overrides from task T%s. Error: %s", str, str2);
        A0O.A0s(true);
        A0O.A0r(formatStrLocaleSafe);
        A0O.A0c(null, "OK");
        AbstractC166987dD.A1W(A0O);
    }

    private void showRefreshAppDialog(String str) {
        C193328hC A0O = AbstractC31175DnJ.A0O(this);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Successfully imported overrides from task T%s. Restart app now?", str);
        A0O.A05 = "Restart app";
        A0O.A0s(true);
        A0O.A0r(formatStrLocaleSafe);
        A0O.A0d(this, "Restart");
        A0O.A0c(null, "Later");
        AbstractC166987dD.A1W(A0O);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        launchHomeActivity();
        C03850Ja.A01("Intentional app restart after successfully importing MetaConfig overrides from task.");
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-365316749);
        super.onCreate(bundle);
        this.mUserSession = AbstractC31176DnK.A0S(this);
        C0f9.A09(1144568192, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setItems(AbstractC166987dD.A1F(getImportOverridesFromTaskMenu()));
    }
}
