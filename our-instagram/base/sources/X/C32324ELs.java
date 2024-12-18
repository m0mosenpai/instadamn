package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ELs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32324ELs extends AbstractC59962oe implements InterfaceC37289Gbq {
    public static final String __redex_internal_original_name = "DirectRecipientPickerFragment";
    public TextWatcher A01;
    public EnumC33498ErX A02;
    public C56352iT A03;
    public UserSession A04;
    public IgEditText A05;
    public IgTextView A06;
    public IgImageView A07;
    public ChannelCreationSource A08;
    public C36299Fzu A09;
    public EVU A0A;
    public C2EC A0B;
    public C2DS A0C;
    public IgdsButton A0D;
    public IgdsButton A0E;
    public IgFormField A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Integer A0I;
    public Integer A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0T;
    public View A0U;
    public View A0V;
    public IgButton A0W;
    public IgLinearLayout A0X;
    public C31600DuS A0Y;
    public boolean A0a;
    public int A00 = 0;
    public C25805BbM A0Z = null;
    public boolean A0S = true;
    public boolean A0b = false;
    public boolean A0N = false;
    public final InterfaceC60122ou A0c = new Ft8(this, 1);

    public static void A09(C32324ELs c32324ELs) {
        c32324ELs.A0B = null;
        if (c32324ELs.A0W != null && c32324ELs.A0R) {
            if (EVU.A00(c32324ELs.A0A) > 1 && !c32324ELs.A0A.A0S()) {
                c32324ELs.A0C.getClass();
                C81663kb B3W = c32324ELs.A0C.B3W(AbstractC35052FcP.A01(c32324ELs.A0A.A0N()));
                if (B3W != null && !B3W.CbK()) {
                    c32324ELs.A0B = B3W;
                }
            }
            c32324ELs.A06();
        }
        c32324ELs.A0A.A0Q();
        c32324ELs.A0A.A0P();
        EVU evu = c32324ELs.A0A;
        EVU.A08(evu, R.id.direct_ff_group_chat_entry_point, EVU.A0J(evu));
    }

    public static void A0B(C32324ELs c32324ELs, InterfaceC83713oG interfaceC83713oG, List list, boolean z) {
        InterfaceC83713oG interfaceC83713oG2 = interfaceC83713oG;
        c32324ELs.A0Y.getClass();
        AbstractC31171DnF.A1L(c32324ELs);
        C31600DuS c31600DuS = c32324ELs.A0Y;
        String str = null;
        c31600DuS.A09 = list;
        c31600DuS.A08 = null;
        if (interfaceC83713oG == null) {
            interfaceC83713oG2 = c32324ELs.A01(list, z);
        }
        if (!z || list.size() != 1 || !AbstractC31172DnG.A0n(list, 0).A0R()) {
            str = A02(c32324ELs, list);
        }
        if (list.size() == 1 && AbstractC31172DnG.A0n(list, 0).A0Q()) {
            AiAgentThreadLauncher aiAgentThreadLauncher = new AiAgentThreadLauncher(c32324ELs.A04);
            FragmentActivity requireActivity = c32324ELs.requireActivity();
            DirectShareTarget directShareTarget = (DirectShareTarget) list.get(0);
            UserSession userSession = c32324ELs.A04;
            aiAgentThreadLauncher.A0A(requireActivity, null, c32324ELs, new C36395G3w(c32324ELs, 3), directShareTarget, null, "inbox_new_message", null, C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36324767510311358L), false, false, false, false);
            return;
        }
        C36881nl A01 = C36881nl.A01(c32324ELs.requireActivity(), c32324ELs, c32324ELs.A04, "inbox_new_message");
        A01.A0B = interfaceC83713oG2;
        A01.A0n = true;
        A01.A01 = c32324ELs;
        A01.A0s = true;
        A01.A0h = str;
        C36395G3w.A00(A01, c32324ELs, 5);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(433);
    }

    public static C34628FNl A00(C32324ELs c32324ELs) {
        String str;
        ChannelCreationSource channelCreationSource = c32324ELs.A08;
        if (channelCreationSource != null) {
            str = channelCreationSource.A00;
        } else {
            str = "";
        }
        EVU evu = c32324ELs.A0A;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = evu.A0N().iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (A0m.A0I()) {
                A1E.add(A0m.A0L);
            }
        }
        int size = A1E.size();
        boolean z = true;
        int i = 0;
        Boolean valueOf = Boolean.valueOf(AbstractC167007dF.A1O(size));
        Boolean bool = c32324ELs.A0H;
        Integer valueOf2 = Integer.valueOf(c32324ELs.A00);
        Integer num = c32324ELs.A0I;
        if (num == null || num.intValue() != 2) {
            z = false;
        }
        Boolean valueOf3 = Boolean.valueOf(z);
        Boolean bool2 = c32324ELs.A0G;
        Integer num2 = c32324ELs.A0J;
        if (num2 != null) {
            i = num2.intValue();
        }
        return new C34628FNl(bool2, valueOf3, bool, valueOf, valueOf2, Integer.valueOf(i), str);
    }

    private InterfaceC83713oG A01(List list, boolean z) {
        String C7I;
        C2EC c2ec = this.A0B;
        if (list.size() > 1 && c2ec != null && c2ec.C7I() != null && this.A0R && (C7I = c2ec.C7I()) != null) {
            return AbstractC31171DnF.A0N(C7I);
        }
        ArrayList A01 = AbstractC35052FcP.A01(list);
        if (z) {
            return new C23974Ak9(EnumC92794Ds.A04, MsysThreadSubtype.Standard.A00, AbstractC34821FVx.A01(A01));
        }
        if (list.size() == 1) {
            AbstractC31172DnG.A0n(list, 0).A01();
            return AbstractC31171DnF.A0O(AbstractC31172DnG.A0n(list, 0));
        }
        return new C122145g6(A01);
    }

    private void A06() {
        IgButton igButton;
        int i;
        if (this.A0W != null) {
            int A00 = EVU.A00(this.A0A);
            int i2 = 1;
            if (this.A0O) {
                i2 = 2;
                if (A00 < 2 || ((this.A02 == EnumC33498ErX.THREAD_DETAILS && this.A0B != null) || this.A0b)) {
                    this.A0W.setVisibility(8);
                    return;
                }
            }
            boolean z = false;
            this.A0W.setVisibility(0);
            IgButton igButton2 = this.A0W;
            if (A00 >= i2) {
                z = true;
            }
            igButton2.setEnabled(z);
            if (A00 > 1) {
                AbstractC31171DnF.A1L(this);
                igButton = this.A0W;
                i = 2131960257;
                if (this.A0B != null) {
                    i = 2131960267;
                }
            } else {
                igButton = this.A0W;
                i = 2131960256;
            }
            igButton.setText(i);
        }
    }

    public static void A07(C32324ELs c32324ELs) {
        c32324ELs.A04.getClass();
        UserSession userSession = c32324ELs.A04;
        ChannelCreationSource channelCreationSource = ChannelCreationSource.A08;
        C14360o3.A0B(userSession, 0);
        AbstractC35055FcS.A00(userSession, new ChannelCreationFlowExtraArgs(null, null, null), channelCreationSource, null, false).A00().Cgf(c32324ELs.requireActivity());
    }

    public static void A08(C32324ELs c32324ELs) {
        if (!c32324ELs.A0P) {
            c32324ELs.A0L = A02(c32324ELs, c32324ELs.A0A.A0N());
        }
        c32324ELs.requireActivity();
        C56352iT c56352iT = c32324ELs.A03;
        if (c56352iT == null) {
            c56352iT = AbstractC31176DnK.A0J(c32324ELs);
        }
        c56352iT.A0T();
    }

    public static void A0C(C32324ELs c32324ELs, String str, boolean z) {
        String str2;
        c32324ELs.A09.getClass();
        C36299Fzu c36299Fzu = c32324ELs.A09;
        C34628FNl A00 = A00(c32324ELs);
        C25531Mh A002 = C36299Fzu.A00(c36299Fzu);
        if (AbstractC25226BEj.A1Z(A002)) {
            if (z) {
                str2 = "thread_create_successful";
            } else {
                str2 = "thread_create_error";
            }
            C36299Fzu.A04(A002, c36299Fzu);
            AbstractC31174DnI.A1J(A002, str2);
            A002.A0o("create_public_chat_button");
            C36299Fzu.A05(A002, c36299Fzu, "invite_people");
            A002.A0v(C36299Fzu.A03(A00, c36299Fzu));
            if (str != null) {
                A002.A0h(AbstractC166997dE.A0j(str));
            }
            A002.Cht();
        }
    }

    @Override // X.InterfaceC37289Gbq
    public final void DdR() {
        String C7l;
        UserSession userSession = this.A04;
        if (userSession != null) {
            AbstractC31171DnF.A1L(this);
            if (!this.A0O && !this.A0Q) {
                ArrayList A01 = AbstractC35052FcP.A01(this.A0A.A0N());
                InterfaceC83713oG A012 = A01(this.A0A.A0N(), false);
                C36881nl A013 = C36881nl.A01(requireActivity(), this, userSession, AbstractC111324zv.A00(2277));
                A013.A0B = A012;
                IgLinearLayout igLinearLayout = this.A0X;
                if (A01.size() >= 1 && igLinearLayout != null) {
                    igLinearLayout.setVisibility(0);
                    View view = this.A0U;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.A0V;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    FragmentActivity requireActivity = requireActivity();
                    InterfaceC83713oG A014 = A01(this.A0A.A0N(), false);
                    boolean z = true;
                    if (EVU.A00(this.A0A) > 1 && !this.A0A.A0S()) {
                        this.A0C.getClass();
                        C81663kb B3W = this.A0C.B3W(AbstractC35052FcP.A01(this.A0A.A0N()));
                        if (B3W != null && !B3W.CbK()) {
                            z = false;
                        }
                    }
                    A013.A07(requireActivity, this.A0Y, A014, R.id.dynamic_fragment_container, true, z);
                } else {
                    IgLinearLayout igLinearLayout2 = this.A0X;
                    if (igLinearLayout2 != null) {
                        igLinearLayout2.setVisibility(8);
                        View view3 = this.A0U;
                        if (view3 != null) {
                            view3.setVisibility(8);
                        }
                        View view4 = this.A0V;
                        if (view4 != null) {
                            view4.setVisibility(0);
                        }
                        this.A0X.removeAllViews();
                    }
                }
            }
        }
        A09(this);
        if (this.A0Q) {
            this.A00 = this.A0A.A0O.size();
            C56352iT c56352iT = this.A03;
            if (c56352iT == null) {
                c56352iT = AbstractC31176DnK.A0J(this);
            }
            c56352iT.A0X(this.A0c);
        }
        A08(this);
        IgFormField igFormField = this.A0F;
        if (igFormField != null) {
            C2EC c2ec = this.A0B;
            if (c2ec != null) {
                if (c2ec.C7l() == null) {
                    C7l = A03(this.A0A.A0N());
                } else {
                    C7l = this.A0B.C7l();
                }
                this.A0F.setText(C7l);
                this.A0F.A0F();
                this.A0N = true;
                return;
            }
            if (igFormField.getText().toString().isEmpty() || !this.A0N) {
                return;
            }
            this.A0F.setText("");
            this.A0N = false;
            IgFormField igFormField2 = this.A0F;
            igFormField2.A0I = false;
            igFormField2.A0H = false;
            ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB = igFormField2.A0E;
            String str = "ruleManager";
            if (viewOnFocusChangeListenerC55349OiB != null) {
                viewOnFocusChangeListenerC55349OiB.A05 = false;
                C57012jc c57012jc = igFormField2.A0D;
                if (c57012jc == null) {
                    str = "pickerIconViewStub";
                } else {
                    c57012jc.A03(8);
                    View view5 = igFormField2.A04;
                    if (view5 != null) {
                        view5.setVisibility(8);
                        igFormField2.getMEditText().setEnabled(true);
                        igFormField2.getPrismFormFieldContainer().setEnabled(true);
                        igFormField2.getMEditText().setFocusable(true);
                        AbstractC166987dD.A1O(igFormField2.getTopLabel().getContext(), igFormField2.getMEditText(), AbstractC53242c7.A07(igFormField2.getContext()));
                        igFormField2.setOnClickListener(null);
                        View view6 = igFormField2.A04;
                        if (view6 != null) {
                            view6.setOnClickListener(null);
                            ViewOnFocusChangeListenerC55349OiB viewOnFocusChangeListenerC55349OiB2 = igFormField2.A0E;
                            if (viewOnFocusChangeListenerC55349OiB2 != null) {
                                AbstractC55110ObT.A03(igFormField2, AbstractC25225BEi.A1a(viewOnFocusChangeListenerC55349OiB2.A0A.A01, "valid"), false);
                                igFormField2.setBackgroundResource(0);
                                AbstractC56952jT.A04(igFormField2, C05F.A0Y);
                                return;
                            }
                        }
                    }
                    C14360o3.A0F("prismComboPicker");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC37289Gbq
    public final void DjC(View view, boolean z) {
        if (z) {
            A04();
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0A.A0N() != null && EVU.A00(this.A0A) > 1 && !this.A0T) {
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A0A(2131960261);
            A0O.A09(2131960260);
            DialogInterfaceOnClickListenerC35452Fk9.A01(A0O, this, 55, 2131960259);
            A0O.A0s(true);
            A0O.A0t(true);
            A0O.A06();
            AbstractC166987dD.A1W(A0O);
            return true;
        }
        return this.A0A.A0T();
    }

    public static String A02(C32324ELs c32324ELs, List list) {
        EditText editText;
        AbstractC31171DnF.A1L(c32324ELs);
        IgFormField igFormField = c32324ELs.A0F;
        if (igFormField != null) {
            editText = igFormField.getMEditText();
        } else {
            editText = c32324ELs.A05;
        }
        if (editText != null) {
            return AbstractC167007dF.A0g(editText);
        }
        return A03(list);
    }

    public static String A03(List list) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        for (int i = 0; i < list.size(); i++) {
            A1C.append(AbstractC31172DnG.A14(AbstractC31172DnG.A0n(list, i)));
            if (i < AbstractC25226BEj.A05(list)) {
                A1C.append(", ");
            }
        }
        return A1C.toString();
    }

    private void A04() {
        IgImageView igImageView;
        if (A0E(this)) {
            AbstractC167007dF.A0x(this.A0F);
            this.A0S = false;
            A08(this);
            C35151Fet c35151Fet = this.A0A.A0B;
            if (c35151Fet != null && (igImageView = c35151Fet.A01) != null) {
                igImageView.setVisibility(0);
            }
            C35151Fet c35151Fet2 = this.A0A.A0B;
            if (c35151Fet2 != null && (c35151Fet2.A02 instanceof C36472G6w)) {
                if (C18U.A06(C06090Tz.A05, c35151Fet2.A04, 36330200643945197L)) {
                    C36472G6w.A00((C36472G6w) c35151Fet2.A02);
                }
            }
            this.A0b = true;
            A06();
        }
    }

    private void A05() {
        if (A0E(this)) {
            AbstractC167007dF.A0w(this.A0F);
            this.A0S = true;
            A08(this);
            C35151Fet c35151Fet = this.A0A.A0B;
            if (c35151Fet != null) {
                AbstractC167007dF.A0x(c35151Fet.A01);
            }
            C35151Fet c35151Fet2 = this.A0A.A0B;
            if (c35151Fet2 != null && (c35151Fet2.A02 instanceof C36472G6w)) {
                if (C18U.A06(C06090Tz.A05, c35151Fet2.A04, 36330200643945197L)) {
                    C36472G6w c36472G6w = (C36472G6w) c35151Fet2.A02;
                    if (c36472G6w.A02.getItemCount() > 0 && c36472G6w.A00.getVisibility() == 8) {
                        C36472G6w.A01(c36472G6w, GU1.A00);
                    }
                }
            }
            C35151Fet c35151Fet3 = this.A0A.A0B;
            if (c35151Fet3 != null) {
                c35151Fet3.A02.AHn();
            }
            C35151Fet c35151Fet4 = this.A0A.A0B;
            if (c35151Fet4 != null) {
                c35151Fet4.A02.CMc();
            }
            this.A0A.A0O();
            this.A0b = false;
            A06();
            C35151Fet c35151Fet5 = this.A0A.A0B;
            if (c35151Fet5 != null) {
                c35151Fet5.A02.AI3();
            }
        }
    }

    public static void A0A(C32324ELs c32324ELs, C43707JUs c43707JUs) {
        AbstractC31171DnF.A1L(c32324ELs);
        C31600DuS c31600DuS = c32324ELs.A0Y;
        if (c31600DuS != null) {
            List A0N = c32324ELs.A0A.A0N();
            ArrayList A1F = AbstractC166987dD.A1F(c32324ELs.A0A.A0O);
            c31600DuS.A09 = A0N;
            c31600DuS.A08 = A1F;
        }
        IgdsButton igdsButton = c32324ELs.A0D;
        if (igdsButton != null) {
            igdsButton.setLoading(false);
        }
        C36881nl A01 = C36881nl.A01(c32324ELs.requireActivity(), c32324ELs, c32324ELs.A04, AbstractC111324zv.A00(4306));
        AbstractC31179DnN.A1R(A01, c43707JUs.A1E);
        A01.A0n = true;
        A01.A01 = c32324ELs;
        A01.A0s = true;
        A01.A0m = c32324ELs.A0Q;
        String str = c32324ELs.A0K;
        A01.A0O = str;
        A01.A0h = str;
        C36395G3w.A00(A01, c32324ELs, 6);
    }

    public static void A0D(C32324ELs c32324ELs, List list, boolean z) {
        if (list.size() == 1) {
            InterfaceC83713oG A0O = AbstractC31171DnF.A0O((DirectShareTarget) AbstractC166987dD.A16(list));
            if (A0O instanceof C83693oE) {
                if (c32324ELs.A0a) {
                    AbstractC31171DnF.A1L(c32324ELs);
                    C7YF.A00(c32324ELs.A04).A02((C83693oE) A0O, AbstractC31172DnG.A18(AbstractC31172DnG.A0n(list, 0)), new GRU(c32324ELs, list, 0, z), true);
                    return;
                }
                A0B(c32324ELs, A0O, list, c32324ELs.A0A.A0S());
                return;
            }
            if ((A0O instanceof MsysThreadId) && c32324ELs.A0a) {
                AbstractC31171DnF.A1L(c32324ELs);
                C7YF.A00(c32324ELs.A04).A03((MsysThreadId) A0O, new GRU(c32324ELs, list, 1, z));
                return;
            }
            z = c32324ELs.A0A.A0S();
        }
        A0B(c32324ELs, null, list, z);
    }

    public static boolean A0E(C32324ELs c32324ELs) {
        AbstractC31171DnF.A1L(c32324ELs);
        EnumC33498ErX enumC33498ErX = c32324ELs.A02;
        if (enumC33498ErX == null || enumC33498ErX != EnumC33498ErX.OMNIPICKET_CREATE_GROUP_CHAT_ROW) {
            return false;
        }
        if (!AbstractC31178DnM.A1X(C06090Tz.A05, c32324ELs.A04, 36330200643945197L)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37289Gbq
    public final C25805BbM BJO() {
        return this.A0Z;
    }

    @Override // X.InterfaceC37289Gbq
    public final void Cyq() {
        A05();
    }

    @Override // X.InterfaceC37289Gbq
    public final void DdP() {
        A05();
    }

    @Override // X.InterfaceC37289Gbq
    public final void DjA() {
        A04();
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2Q() {
        A07(this);
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2S(String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("direct_is_creating_social_channel", true);
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE", str);
        A0b.putString("direct_channel_preset_type", str2);
        A0b.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION", 33);
        AbstractC31171DnF.A1L(this);
        AbstractC31171DnF.A0L(requireActivity(), A0b, this.A04, ModalActivity.class, AbstractC111324zv.A00(2269)).A0D(this, 8834);
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2T() {
        A07(this);
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2Y() {
        A07(this);
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2p(DirectShareTarget directShareTarget) {
        A0D(this, Collections.singletonList(directShareTarget), true);
    }

    @Override // X.InterfaceC37289Gbq
    public final void E2z(DirectShareTarget directShareTarget) {
        A0D(this, Collections.singletonList(directShareTarget), false);
    }

    @Override // X.InterfaceC37289Gbq
    public final void E30(DirectShareTarget directShareTarget) {
        AbstractC31171DnF.A1L(this);
        C36881nl A01 = C36881nl.A01(requireActivity(), this, this.A04, "inbox_new_message");
        A01.A0B = AbstractC31171DnF.A0O(directShareTarget);
        A01.A0n = true;
        A01.A01 = this;
        A01.A0s = true;
        C36395G3w.A00(A01, this, 4);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        AbstractC31171DnF.A1L(this);
        return this.A04;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7319) {
            AbstractC25226BEj.A1Q(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        if (X.C18U.A06(X.AbstractC166997dE.A0U(r4), r4, 36320382349353377L) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d3, code lost:
    
        if (X.C18U.A06(r2, r4, 36319368736546016L) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0053, code lost:
    
        if ("groups_creation_entry_point".equals(r3) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32324ELs.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1825476547);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.fragment_direct_recipient_picker);
        C0f9.A09(1844537032, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(117365456);
        super.onDestroy();
        this.A0X = null;
        this.A0U = null;
        this.A0V = null;
        C0f9.A09(-2110606903, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-646870698);
        super.onResume();
        A09(this);
        C56352iT c56352iT = this.A03;
        if (c56352iT == null) {
            c56352iT = AbstractC31176DnK.A0J(this);
        }
        c56352iT.A0X(this.A0c);
        C0f9.A09(1695927122, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A0A.onSaveInstanceState(bundle);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.direct_recipients_selected_section);
        if (linearLayout != null && this.A04 != null) {
            linearLayout.setOrientation(0);
            TextView A0e = AbstractC166987dD.A0e(view, R.id.direct_new_chat_to_field);
            if (A0e != null) {
                A0e.setText(2131959969);
                A0e.setPadding(A0e.getPaddingLeft(), A0e.getPaddingTop(), 0, A0e.getPaddingBottom());
                AbstractC166987dD.A1O(requireContext(), A0e, AbstractC53242c7.A09(requireContext()));
            }
            View findViewById = view.findViewById(R.id.recipient_picker_add_recipient_button);
            this.A0U = findViewById;
            if (findViewById != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), this.A0U.getPaddingTop(), 30, this.A0U.getPaddingBottom());
                C0fQ.A00(new ViewOnClickListenerC35691FpR(this, 9), this.A0U);
                View findViewById2 = view.findViewById(R.id.recipients_scroll_container);
                if (findViewById2 != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
                    layoutParams.weight = 8.0f;
                    findViewById2.setLayoutParams(layoutParams);
                }
            }
        }
        if (A0E(this)) {
            IgFormField igFormField = (IgFormField) view.findViewById(R.id.group_name_form_field);
            this.A0F = igFormField;
            if (igFormField != null) {
                igFormField.setVisibility(0);
                this.A0F.setRuleChecker(new InterfaceC57949Pmv() { // from class: X.G8H
                    @Override // X.InterfaceC57949Pmv
                    public final C54543O7v getState(C54543O7v c54543O7v, CharSequence charSequence, boolean z) {
                        if (!charSequence.toString().isEmpty()) {
                            c54543O7v.A01 = "removable";
                        }
                        return c54543O7v;
                    }
                });
                AbstractC55110ObT.A02(this.A0F, new P37(this, 0));
                this.A0F.setImeOptions(6);
            }
        }
        this.A0X = (IgLinearLayout) view.findViewById(R.id.dynamic_fragment_container);
        this.A0V = view.findViewById(R.id.recipients_list);
        FragmentActivity activity = getActivity();
        if (activity != null && activity.getWindow() != null) {
            AbstractC31171DnF.A1L(this);
            if (!this.A0O && !this.A0Q) {
                getActivity().getWindow().setSoftInputMode(48);
            }
        }
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.create_chat_button);
        if (A07 != null && this.A0R) {
            IgButton igButton = (IgButton) A07.inflate();
            this.A0W = igButton;
            igButton.setVisibility(0);
            IgButton igButton2 = this.A0W;
            EnumC33498ErX enumC33498ErX = this.A02;
            if (enumC33498ErX == null) {
                enumC33498ErX = EnumC33498ErX.OMNIPICKER_BOTTOM_CREATE_CHAT;
            }
            ViewOnClickListenerC35683FpI.A00(igButton2, 70, this, enumC33498ErX);
            A06();
        }
        ViewStub A0G = AbstractC31173DnH.A0G(view, R.id.create_social_chat_layout);
        if (this.A0Q) {
            View inflate = A0G.inflate();
            this.A0D = (IgdsButton) inflate.findViewById(R.id.social_channel_chat_cta_button);
            this.A0E = (IgdsButton) inflate.findViewById(R.id.social_channel_chat_secondary_button);
            inflate.setVisibility(0);
            IgdsButton igdsButton = this.A0D;
            if (igdsButton != null) {
                igdsButton.setVisibility(0);
                C0fQ.A00(new ViewOnClickListenerC35691FpR(this, 7), igdsButton);
            }
            IgdsButton igdsButton2 = this.A0E;
            if (igdsButton2 != null) {
                igdsButton2.setVisibility(0);
                C0fQ.A00(new ViewOnClickListenerC35691FpR(this, 8), igdsButton2);
            }
        }
        this.A03 = C56342iS.A01(new ViewOnClickListenerC35691FpR(this, 13), AbstractC31173DnH.A0F(view, R.id.direct_recipient_picker_action_bar));
        this.A01 = new C35469Fl4(this, 11);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (parcelableArrayList = bundle2.getParcelableArrayList("bundle_extra_parcelable_new_group_selected_recipients")) != null && this.A0O) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                A1E.add(new DirectShareTarget(AbstractC31172DnG.A0p(it)));
            }
            this.A0A.A0R(A1E);
        }
    }
}
