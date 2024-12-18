package com.instagram.debug.quickexperiment;

import X.AbstractC111324zv;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC33235ElU;
import X.AbstractC53242c7;
import X.AnonymousClass001;
import X.C006802i;
import X.C023409i;
import X.C0K8;
import X.C0f9;
import X.C17280tP;
import X.C18V;
import X.C35246Fgf;
import X.C35473Fl9;
import X.C50676MYu;
import X.C9GR;
import X.EnumC124875ks;
import X.EnumC20090yg;
import X.GYP;
import X.InterfaceC13300mG;
import X.InterfaceC19610xo;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.MSX;
import X.XER;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class QuickExperimentBisectFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String TAG = "QuickExperimentBisectFragment";
    public XER mBisectState = null;
    public UserSession mUserSession = null;
    public final C18V qeFactory = C18V.A01;
    public final TextView.OnEditorActionListener mTextDelegate = new TextView.OnEditorActionListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda6
        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    };
    public final GYP mEditDelegate = new GYP() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda7
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
        return TAG;
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$configuration$intf$SynchronizationResult;

        static {
            int[] iArr = new int[EnumC124875ks.values().length];
            $SwitchMap$com$instagram$configuration$intf$SynchronizationResult = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void forceSyncStartBisect(final C35473Fl9 c35473Fl9, AbstractC18680vv abstractC18680vv, C18V c18v) {
        c18v.A00(abstractC18680vv, EnumC20090yg.A03).A00(new InterfaceC13300mG() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda0
            @Override // X.InterfaceC13300mG
            public final void run(Object obj) {
                QuickExperimentBisectFragment.this.m93xdd66f872(c35473Fl9, (EnumC124875ks) obj);
            }
        });
    }

    private C35473Fl9 getBisectIdEditText(String str) {
        return new C35473Fl9(this.mTextDelegate, this.mEditDelegate, 2, "Enter user's IGID to start bisect on", str, false);
    }

    private List getBisectResponseButtons(boolean z) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickExperimentBisectFragment.this.m94x28e13207(view);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickExperimentBisectFragment.this.m95x4a2adc8(view);
            }
        };
        View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickExperimentBisectFragment.this.m96xe0642989(view);
            }
        };
        View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickExperimentBisectFragment.this.m97xbc25a54a(view);
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C50676MYu(onClickListener4, 0.8f, 2131953857, AbstractC53242c7.A0C(requireContext())));
        if (!z) {
            arrayList.add(new C50676MYu(onClickListener, 0.8f, 2131953855, AbstractC53242c7.A0C(requireContext())));
            arrayList.add(new C50676MYu(onClickListener2, 0.8f, 2131953853, AbstractC53242c7.A0C(requireContext())));
        }
        arrayList.add(new C50676MYu(onClickListener3, 0.8f, 2131953854, AbstractC53242c7.A0C(requireContext())));
        return arrayList;
    }

    private List getBisectionStateSummaryItems(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "# of steps made: ");
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) Integer.toString(i));
        arrayList.add(new C35246Fgf(spannableStringBuilder));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "# of steps left: ");
        spannableStringBuilder2.setSpan(new StyleSpan(1), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) Integer.toString(i2));
        arrayList.add(new C35246Fgf(spannableStringBuilder2));
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "Culprit:\n");
        spannableStringBuilder3.setSpan(new StyleSpan(1), 0, spannableStringBuilder3.length(), 33);
        XER xer = this.mBisectState;
        if (xer != null) {
            spannableStringBuilder3.append((CharSequence) xer.getCulprit());
        }
        arrayList.add(new C35246Fgf(spannableStringBuilder3));
        return arrayList;
    }

    public static C35246Fgf getBisectionStatusItem(int i, int i2, boolean z) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) AbstractC111324zv.A00(1802));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        if (!z) {
            spannableStringBuilder.append((CharSequence) "Bisecting on ");
            spannableStringBuilder.append((CharSequence) Integer.toString(i));
            spannableStringBuilder.append((CharSequence) "/");
            spannableStringBuilder.append((CharSequence) Integer.toString(i2));
            str = " experiments.";
        } else {
            str = "Culprit has been found.";
        }
        spannableStringBuilder.append((CharSequence) str);
        return new C35246Fgf(spannableStringBuilder);
    }

    public static C35246Fgf getNoBisectionStatusItem() {
        return new C35246Fgf("QE Bisect Status: Not bisecting right now");
    }

    private C50676MYu getStartBisectButton(final C35473Fl9 c35473Fl9) {
        return new C50676MYu(new View.OnClickListener() { // from class: com.instagram.debug.quickexperiment.QuickExperimentBisectFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuickExperimentBisectFragment.this.m98xb0f4a553(c35473Fl9, view);
            }
        }, 0.8f, 2131953856, AbstractC53242c7.A0C(requireContext()));
    }

    private void setContent() {
        XER xer;
        int i;
        ArrayList arrayList = new ArrayList();
        String str = "";
        if (C17280tP.A00().A0Q() && (xer = this.mBisectState) != null && xer.isRunning()) {
            C17280tP A00 = C17280tP.A00();
            String A0j = MSX.A0j(A00, A00.A2O, C17280tP.A4G, 23);
            if (A0j != null) {
                str = A0j;
            }
            C35473Fl9 bisectIdEditText = getBisectIdEditText(str);
            boolean z = !this.mBisectState.getCulprit().isEmpty();
            int size = this.mBisectState.getSize();
            int right = (this.mBisectState.getRight() - this.mBisectState.getLeft()) + 1;
            if (this.mBisectState.getCulprit().isEmpty()) {
                i = this.mBisectState.getNumberOfStepsRemaining();
            } else {
                i = 0;
            }
            int numberOfStepsMade = this.mBisectState.getNumberOfStepsMade();
            arrayList.add(getBisectionStatusItem(right, size, z));
            arrayList.addAll(getBisectionStateSummaryItems(numberOfStepsMade, i));
            arrayList.add(bisectIdEditText);
            arrayList.addAll(getBisectResponseButtons(z));
        } else {
            C35473Fl9 bisectIdEditText2 = getBisectIdEditText("");
            arrayList.add(new C35246Fgf("QE Bisect Status: Not bisecting right now"));
            arrayList.add(bisectIdEditText2);
            arrayList.add(getStartBisectButton(bisectIdEditText2));
        }
        setItems(arrayList);
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("QE Bisect");
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return this.mUserSession;
    }

    /* renamed from: lambda$forceSyncStartBisect$7$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment, reason: not valid java name */
    public /* synthetic */ void m93xdd66f872(C35473Fl9 c35473Fl9, EnumC124875ks enumC124875ks) {
        int ordinal;
        String str = "Failed to start Bisect due to a sync error.";
        if (enumC124875ks != null && (ordinal = enumC124875ks.ordinal()) != 1 && ordinal != 0) {
            if (ordinal != 3 && ordinal != 2) {
                return;
            }
            String str2 = c35473Fl9.A00;
            if (this.mUserSession != null && !MobileConfigBisection.startBisect(requireContext(), str2, this.mUserSession, C006802i.A0p)) {
                str = "Failed to start QE Bisect";
                C0K8.A0C(TAG, "Failed to start QE Bisect");
            } else {
                C17280tP A00 = C17280tP.A00();
                AbstractC31171DnF.A1S(A00, str2, A00.A2O, C17280tP.A4G, 23);
                this.mBisectState = MobileConfigBisection.getBisectState();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError(str);
    }

    /* renamed from: lambda$getStartBisectButton$6$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment, reason: not valid java name */
    public /* synthetic */ void m98xb0f4a553(C35473Fl9 c35473Fl9, View view) {
        UserSession userSession = this.mUserSession;
        C18V c18v = this.qeFactory;
        if (!C17280tP.A00().A0Q() && c18v != null && userSession != null) {
            C9GR.A09(getContext(), "Syncing configs and starting bisection, please wait.");
            forceSyncStartBisect(c35473Fl9, userSession, c18v);
        } else if (C17280tP.A00().A0Q()) {
            C17280tP A00 = C17280tP.A00();
            displayError(AnonymousClass001.A0R("Already started bisect on", MSX.A0j(A00, A00.A2O, C17280tP.A4G, 23)));
        } else {
            C0K8.A0C(TAG, "Tried to bisect but QuickExperimentManagerFactory is null");
        }
    }

    private void displayError(String str) {
        C9GR.A09(getContext(), str);
    }

    private void displayRestartMessage() {
        C9GR.A09(getContext(), "Relaunch the application for the changes to take effect. ");
    }

    /* renamed from: lambda$getBisectResponseButtons$2$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment, reason: not valid java name */
    public /* synthetic */ void m94x28e13207(View view) {
        if (MobileConfigBisection.userDidNotReproduceBug()) {
            XER bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                bisectState.getLeft();
                this.mBisectState.getRight();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getBisectResponseButtons$3$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment, reason: not valid java name */
    public /* synthetic */ void m95x4a2adc8(View view) {
        if (MobileConfigBisection.userDidReproduceBug()) {
            XER bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                bisectState.getLeft();
                this.mBisectState.getRight();
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    /* renamed from: lambda$getBisectResponseButtons$4$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment, reason: not valid java name */
    public /* synthetic */ void m96xe0642989(View view) {
        if (!MobileConfigBisection.stopBisection()) {
            displayError("Could not stop bisection. Please restart the application and try again.");
            return;
        }
        InterfaceC19610xo ARD = C17280tP.A00().A00.ARD();
        ARD.EEj("qe_user_bisect_id");
        ARD.apply();
        C17280tP.A00().A0C(null);
        this.mBisectState = MobileConfigBisection.getBisectState();
        if (getActivity() == null) {
            return;
        }
        setContent();
        displayRestartMessage();
    }

    /* renamed from: lambda$getBisectResponseButtons$5$com-instagram-debug-quickexperiment-QuickExperimentBisectFragment, reason: not valid java name */
    public /* synthetic */ void m97xbc25a54a(View view) {
        if (MobileConfigBisection.goBackOneStep()) {
            XER bisectState = MobileConfigBisection.getBisectState();
            this.mBisectState = bisectState;
            if (bisectState != null) {
                setContent();
                displayRestartMessage();
                return;
            }
        }
        displayError("Bisection failed. Please restart the application and try again.");
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(897907974);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.mUserSession = C023409i.A0A.A06(bundle2);
        }
        C0f9.A09(-395985024, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UserSession userSession = this.mUserSession;
        if (C17280tP.A00().A0Q() && userSession != null) {
            C17280tP A00 = C17280tP.A00();
            String A0j = MSX.A0j(A00, A00.A2O, C17280tP.A4G, 23);
            Context requireContext = requireContext();
            if (A0j == null) {
                A0j = "";
            }
            MobileConfigBisection.initialize(requireContext, A0j, userSession, C006802i.A0p);
            this.mBisectState = MobileConfigBisection.getBisectState();
        }
        setContent();
    }
}
