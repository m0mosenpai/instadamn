package com.instagram.debug.devoptions.direct.burner;

import X.AbstractC003100w;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC33235ElU;
import X.AbstractC60492pY;
import X.AnonymousClass001;
import X.C00O;
import X.C0YY;
import X.C0eB;
import X.C0f9;
import X.C14360o3;
import X.C193328hC;
import X.C28531Zo;
import X.C2EY;
import X.C34726FRp;
import X.C35246Fgf;
import X.C35473Fl9;
import X.C36731GHa;
import X.C3DN;
import X.C50676MYu;
import X.EnumC193348hE;
import X.GYP;
import X.InterfaceC09390do;
import X.InterfaceC16660sJ;
import X.InterfaceC37160GYx;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final int $stable = 8;
    public static final Companion Companion = new Object();
    public static final String MODULE_NAME = "burner_send_settings_fragment";
    public BurnerSendSettingsConfig sendSettingsConfig;
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String moduleName = "burner_send_settings_fragment";

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r3 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.GHY createMultiChoiceMenuItem(final java.lang.CharSequence r13, final java.lang.String[] r14, final java.lang.Object[] r15, int r16, java.lang.Object r17, final X.InterfaceC16660sJ r18) {
        /*
            r12 = this;
            r8 = r15
            int r2 = r15.length
            r1 = 0
        L3:
            r4 = 0
            r6 = r14
            r7 = r18
            if (r1 >= r2) goto L17
            r0 = r15[r1]
            r3 = r17
            boolean r0 = X.C14360o3.A0K(r0, r3)
            if (r0 == 0) goto L4a
            r3 = r14[r1]
            if (r3 != 0) goto L1e
        L17:
            r0 = r15[r16]
            r3 = r14[r16]
            r7.invoke(r0)
        L1e:
            r5 = r12
            android.content.Context r2 = r12.requireContext()
            r10 = r13
            java.lang.StringBuilder r1 = X.AbstractC31174DnI.A0y(r13)
            java.lang.String r0 = " : "
            r1.append(r0)
            java.lang.String r0 = X.AbstractC166997dE.A0x(r3, r1)
            X.GHY r9 = new X.GHY
            r9.<init>(r2, r4, r0)
            X.2xM r11 = X.AbstractC31175DnJ.A0P(r12)
            boolean r0 = r11 instanceof X.EPV
            if (r0 == 0) goto L48
            X.EPV r11 = (X.EPV) r11
        L40:
            com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$createMultiChoiceMenuItem$onClickListener$1 r4 = new com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$createMultiChoiceMenuItem$onClickListener$1
            r4.<init>()
            r9.A05 = r4
            return r9
        L48:
            r11 = r4
            goto L40
        L4a:
            int r1 = r1 + 1
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment.createMultiChoiceMenuItem(java.lang.CharSequence, java.lang.String[], java.lang.Object[], int, java.lang.Object, X.0sJ):X.GHY");
    }

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "Burner Bulk Send");
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        final ArrayList A1E = AbstractC166987dD.A1E();
        C35246Fgf.A02(A1E, 2131957969);
        A1E.add(C36731GHa.A02(new CompoundButton.OnCheckedChangeListener() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BurnerSendSettingsConfig burnerSendSettingsConfig = BurnerSendSettingsFragment.this.sendSettingsConfig;
                if (burnerSendSettingsConfig == null) {
                    C14360o3.A0F("sendSettingsConfig");
                    throw C00O.createAndThrow();
                }
                burnerSendSettingsConfig.isTLC = z;
            }
        }, 2131957966, true));
        final C35473Fl9 c35473Fl9 = new C35473Fl9(new TextView.OnEditorActionListener() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return false;
            }
        }, new GYP() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$targetUserIdEditText$1
            @Override // X.GYP
            public final void onTextChanged(String str) {
                C14360o3.A0B(str, 0);
                BurnerSendSettingsConfig burnerSendSettingsConfig = BurnerSendSettingsFragment.this.sendSettingsConfig;
                if (burnerSendSettingsConfig == null) {
                    C14360o3.A0F("sendSettingsConfig");
                    throw C00O.createAndThrow();
                }
                burnerSendSettingsConfig.targetUserId = str;
            }
        }, 2, AbstractC25227BEk.A0v(this, 2131957970), "", false);
        A1E.add(new C50676MYu(AbstractC31173DnH.A07(this, c35473Fl9, A1E), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$2
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view2) {
                int A05 = C0f9.A05(542728808);
                view2.setEnabled(false);
                C34726FRp A07 = C28531Zo.A04.A02.A07(BurnerSendSettingsFragment.this, AbstractC166987dD.A0r(BurnerSendSettingsFragment.this.session$delegate), C2EY.A1i);
                A07.A06(AbstractC166987dD.A0r(BurnerSendSettingsFragment.this.session$delegate).userId);
                final BurnerSendSettingsFragment burnerSendSettingsFragment = BurnerSendSettingsFragment.this;
                final C35473Fl9 c35473Fl92 = c35473Fl9;
                final List list = A1E;
                A07.A01 = new InterfaceC37160GYx() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$2$shareFragment$1
                    public void onRecipientsChanged() {
                    }

                    @Override // X.InterfaceC37160GYx
                    public void onShareTap(List list2) {
                    }

                    @Override // X.InterfaceC37160GYx
                    public void onShareOneTap(DirectShareTarget directShareTarget) {
                        if (directShareTarget != null && !directShareTarget.A0M()) {
                            Iterator it = directShareTarget.A0B().iterator();
                            while (it.hasNext()) {
                                String A1B = AbstractC166987dD.A1B(it);
                                if (!AbstractC31171DnF.A1W(AbstractC166987dD.A0r(BurnerSendSettingsFragment.this.session$delegate), A1B)) {
                                    BurnerSendSettingsConfig burnerSendSettingsConfig = BurnerSendSettingsFragment.this.sendSettingsConfig;
                                    if (burnerSendSettingsConfig == null) {
                                        C14360o3.A0F("sendSettingsConfig");
                                        throw C00O.createAndThrow();
                                    }
                                    burnerSendSettingsConfig.targetUserId = A1B;
                                    C35473Fl9 c35473Fl93 = c35473Fl92;
                                    C14360o3.A0B(A1B, 0);
                                    c35473Fl93.A00 = A1B;
                                    view2.setEnabled(true);
                                    BurnerSendSettingsFragment.this.setItems(list);
                                    return;
                                }
                            }
                            view2.setEnabled(true);
                        }
                    }
                };
                AbstractC31176DnK.A0x(BurnerSendSettingsFragment.this.requireActivity(), A07.A00(), C3DN.A00);
                C0f9.A0C(1921672372, A05);
            }
        }, "Select User"));
        A1E.add(new C35473Fl9(new TextView.OnEditorActionListener() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$messageCountEditText$2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return false;
            }
        }, new GYP() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$messageCountEditText$1
            @Override // X.GYP
            public final void onTextChanged(String str) {
                int i;
                C14360o3.A0B(str, 0);
                try {
                    BurnerSendSettingsConfig burnerSendSettingsConfig = BurnerSendSettingsFragment.this.sendSettingsConfig;
                    if (burnerSendSettingsConfig == null) {
                        C14360o3.A0F("sendSettingsConfig");
                        throw C00O.createAndThrow();
                    }
                    Integer A0i = AbstractC003100w.A0i(str);
                    if (A0i != null) {
                        i = A0i.intValue();
                    } else {
                        i = 1;
                    }
                    burnerSendSettingsConfig.messageCount = i;
                } catch (NumberFormatException unused) {
                }
            }
        }, 2, AbstractC25227BEk.A0v(this, 2131957967), "", false));
        CharSequence A0v = AbstractC25227BEk.A0v(this, 2131957968);
        BurnerSendSettingsConfig.MessageType[] values = BurnerSendSettingsConfig.MessageType.values();
        ArrayList A17 = AbstractC25225BEi.A17(values.length);
        for (BurnerSendSettingsConfig.MessageType messageType : values) {
            A17.add(messageType.name());
        }
        A1E.add(new C50676MYu(AbstractC31173DnH.A07(this, createMultiChoiceMenuItem(A0v, (String[]) A17.toArray(new String[0]), BurnerSendSettingsConfig.MessageType.values(), 1, BurnerSendSettingsConfig.MessageType.TEXT, new BurnerSendSettingsFragment$onViewCreated$4(this)), A1E), new View.OnClickListener() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int A05 = C0f9.A05(-1319122745);
                view2.setEnabled(false);
                BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
                Context requireContext = BurnerSendSettingsFragment.this.requireContext();
                UserSession A0r = AbstractC166987dD.A0r(BurnerSendSettingsFragment.this.session$delegate);
                BurnerSendSettingsFragment burnerSendSettingsFragment = BurnerSendSettingsFragment.this;
                BurnerSendSettingsConfig burnerSendSettingsConfig = burnerSendSettingsFragment.sendSettingsConfig;
                if (burnerSendSettingsConfig == null) {
                    C14360o3.A0F("sendSettingsConfig");
                    throw C00O.createAndThrow();
                }
                companion.createCutoverThreadAndSendMessage(requireContext, A0r, burnerSendSettingsConfig, new AnonymousClass1(burnerSendSettingsFragment, view2));
                C0f9.A0C(-1290069833, A05);
            }

            /* renamed from: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment$onViewCreated$5$1, reason: invalid class name */
            /* loaded from: classes6.dex */
            public final class AnonymousClass1 extends C0YY implements InterfaceC16660sJ {
                public final /* synthetic */ View $button;
                public final /* synthetic */ BurnerSendSettingsFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BurnerSendSettingsFragment burnerSendSettingsFragment, View view) {
                    super(1);
                    this.this$0 = burnerSendSettingsFragment;
                    this.$button = view;
                }

                public final void invoke(BurnerSendSettingsHelper.BurnerResponse burnerResponse) {
                    int i;
                    EnumC193348hE enumC193348hE;
                    DialogInterface.OnClickListener onClickListener;
                    C14360o3.A0B(burnerResponse, 0);
                    BurnerSendSettingsHelper.BurnerResponse burnerResponse2 = BurnerSendSettingsHelper.BurnerResponse.NO_ERROR;
                    C193328hC A0c = AbstractC31176DnK.A0c(this.this$0);
                    if (burnerResponse != burnerResponse2) {
                        A0c.A05 = "Failed to bulk send";
                        A0c.A0r(burnerResponse.getErrorMsg());
                        i = 2131968948;
                        enumC193348hE = EnumC193348hE.A02;
                        onClickListener = BurnerSendSettingsFragment$onViewCreated$5$1$builder$1.INSTANCE;
                    } else {
                        A0c.A05 = "Bulk Send Successful";
                        BurnerSendSettingsConfig burnerSendSettingsConfig = this.this$0.sendSettingsConfig;
                        if (burnerSendSettingsConfig == null) {
                            C14360o3.A0F("sendSettingsConfig");
                            throw C00O.createAndThrow();
                        }
                        A0c.A0r(AnonymousClass001.A0c("Sent ", " messages", burnerSendSettingsConfig.messageCount));
                        i = 2131968948;
                        enumC193348hE = EnumC193348hE.A02;
                        onClickListener = BurnerSendSettingsFragment$onViewCreated$5$1$builder$2.INSTANCE;
                    }
                    A0c.A0S(onClickListener, enumC193348hE, i);
                    AbstractC166987dD.A1W(A0c);
                    this.$button.setEnabled(true);
                }

                @Override // X.InterfaceC16660sJ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((BurnerSendSettingsHelper.BurnerResponse) obj);
                    return C0eB.A00;
                }
            }
        }, "Send"));
        setItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(148861934);
        super.onCreate(bundle);
        this.sendSettingsConfig = new BurnerSendSettingsConfig("", 1, true, BurnerSendSettingsConfig.MessageType.TEXT, null);
        C0f9.A09(2058880026, A02);
    }

    /* loaded from: classes6.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}
