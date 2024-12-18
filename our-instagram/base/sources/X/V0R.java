package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class V0R extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectWelcomeMessageSettingFragment";
    public Activity A00;
    public Context A01;
    public Bundle A02;
    public View A03;
    public EditText A04;
    public TextView A05;
    public Toast A06;
    public UserSession A07;
    public C34925FaB A08;
    public C70807WhN A09;
    public IgdsSwitch A0A;
    public boolean A0C;
    public String A0B = "business_setting";
    public final TextWatcher A0D = new WKU(this, 12);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(A04().getString(2131960883));
        C3LO c3lo = new C3LO();
        c3lo.A00();
        AbstractC31176DnK.A1C(new WNO(this, 65), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(390);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r6.length() == 0) goto L21;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r5 = 0
            r1 = r16
            X.C14360o3.A0B(r1, r5)
            r0 = r17
            super.onViewCreated(r1, r0)
            r15.A01()
            java.lang.String r0 = r15.A0B
            java.lang.String r2 = "inbox_qp"
            boolean r0 = X.C14360o3.A0K(r0, r2)
            r4 = 1
            if (r0 == 0) goto L20
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r15.A08()
            r0.setChecked(r4)
        L20:
            X.WhN r0 = r15.A07()
            java.lang.Boolean r0 = r0.A03
            if (r0 != 0) goto L47
            java.lang.String r3 = A00(r15)
            android.widget.EditText r0 = r15.A05()
            r0.setText(r3)
            android.widget.EditText r1 = r15.A05()
            java.util.regex.Pattern r0 = X.AbstractC13670mt.A00
            int r0 = r3.length()
            r1.setSelection(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r15.A08()
            r0.setChecked(r4)
        L47:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r15.A08()
            boolean r0 = r0.isChecked()
            android.view.View r1 = r15.A03
            if (r1 == 0) goto Ld2
            if (r0 != 0) goto Lc0
            r0 = 8
            r1.setVisibility(r0)
        L5a:
            X.FaB r7 = r15.A08
            if (r7 == 0) goto Ld5
            X.WhN r0 = r15.A07()
            java.lang.Boolean r8 = r0.A03
            X.WhN r0 = r15.A07()
            java.lang.String r6 = r0.A05
            X.WhN r0 = r15.A07()
            java.lang.String r5 = r0.A04
            X.WhN r0 = r15.A07()
            java.lang.String r1 = r0.A05
            X.WhN r0 = r15.A07()
            java.lang.Boolean r0 = r0.A03
            if (r0 == 0) goto L86
            java.lang.String r0 = A00(r15)
            boolean r4 = X.C14360o3.A0K(r0, r1)
        L86:
            java.lang.String r0 = r15.A0B
            boolean r3 = X.C14360o3.A0K(r0, r2)
            r2 = 0
            if (r6 == 0) goto L96
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L97
        L96:
            r0 = 1
        L97:
            r0 = r0 ^ 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            int r0 = r5.length()
            if (r0 != 0) goto La4
            r2 = 1
        La4:
            r0 = r2 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            if (r3 == 0) goto Lb9
            java.lang.String r13 = "source_qp"
        Lb2:
            r14 = 0
            java.lang.String r12 = "welcome_message_settings_screen_impression"
            X.C34925FaB.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        Lb9:
            r0 = 1274(0x4fa, float:1.785E-42)
            java.lang.String r13 = X.AbstractC111324zv.A00(r0)
            goto Lb2
        Lc0:
            r1.setVisibility(r5)
            android.widget.EditText r0 = r15.A05()
            r0.requestFocus()
            android.widget.EditText r0 = r15.A05()
            X.AbstractC13880nE.A0R(r0)
            goto L5a
        Ld2:
            java.lang.String r0 = "messageSection"
            goto Ld7
        Ld5:
            java.lang.String r0 = "directWelcomeMessageLogger"
        Ld7:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0R.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(V0R v0r) {
        String string;
        User A01 = C17060sy.A01.A01(v0r.A06());
        if (A01.A0I() == EnumC222416a.A05) {
            string = AbstractC167007dF.A0f(v0r.A04(), A01.B8y(), 2131960878);
        } else {
            string = v0r.A04().getString(2131960879);
        }
        C14360o3.A07(string);
        return string;
    }

    public static final void A03(V0R v0r) {
        if (C14360o3.A0K(v0r.A0B, "inbox_qp")) {
            if (v0r.A07().A03 != null) {
                String str = v0r.A07().A05;
                v0r.A05().setText(str);
                EditText A05 = v0r.A05();
                Pattern pattern = AbstractC13670mt.A00;
                A05.setSelection(AbstractC167007dF.A0A(str));
                return;
            }
            return;
        }
        v0r.A01();
    }

    public final Context A04() {
        Context context = this.A01;
        if (context != null) {
            return context;
        }
        C14360o3.A0F("viewContext");
        throw C00O.createAndThrow();
    }

    public final EditText A05() {
        EditText editText = this.A04;
        if (editText != null) {
            return editText;
        }
        C14360o3.A0F("messageItem");
        throw C00O.createAndThrow();
    }

    public final UserSession A06() {
        UserSession userSession = this.A07;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    public final C70807WhN A07() {
        C70807WhN c70807WhN = this.A09;
        if (c70807WhN != null) {
            return c70807WhN;
        }
        C14360o3.A0F("directWelcomeMessageSettingManager");
        throw C00O.createAndThrow();
    }

    public final IgdsSwitch A08() {
        IgdsSwitch igdsSwitch = this.A0A;
        if (igdsSwitch != null) {
            return igdsSwitch;
        }
        C14360o3.A0F("messageToggle");
        throw C00O.createAndThrow();
    }

    private final void A01() {
        A08().setChecked(AbstractC31177DnL.A1b(A07().A03));
        String str = A07().A05;
        A05().setText(str);
        EditText A05 = A05();
        Pattern pattern = AbstractC13670mt.A00;
        A05.setSelection(AbstractC167007dF.A0A(str));
        if (A08().isChecked()) {
            View view = this.A03;
            if (view != null) {
                view.setVisibility(0);
            } else {
                C14360o3.A0F("messageSection");
                throw C00O.createAndThrow();
            }
        }
    }

    public static final void A02(V0R v0r) {
        v0r.A07().A02 = null;
        Toast toast = v0r.A06;
        if (toast != null) {
            toast.cancel();
        }
        v0r.A06 = null;
        v0r.A05().setEnabled(true);
        v0r.A08().setEnabled(true);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return A06();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-3092669);
        super.onCreate(bundle);
        this.A00 = requireActivity();
        this.A02 = requireArguments();
        this.A01 = requireContext();
        C09Y c09y = C023409i.A0A;
        Bundle bundle2 = this.A02;
        if (bundle2 != null) {
            this.A07 = c09y.A06(bundle2);
            C70807WhN A00 = F3H.A00(this, A06());
            C14360o3.A0B(A00, 0);
            this.A09 = A00;
            Bundle bundle3 = this.A02;
            if (bundle3 != null) {
                this.A0B = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_setting");
                this.A08 = new C34925FaB(this, A06());
                C0f9.A09(1299708704, A02);
                return;
            }
        }
        C14360o3.A0F("bundle");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1021318755);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_welcome_message_setting, false);
        EditText editText = (EditText) A0R.findViewById(R.id.welcome_message_message_edit_input);
        C14360o3.A0B(editText, 0);
        this.A04 = editText;
        IgdsSwitch igdsSwitch = (IgdsSwitch) A0R.findViewById(R.id.welcome_message_enable_toggle_switch);
        C14360o3.A0B(igdsSwitch, 0);
        this.A0A = igdsSwitch;
        TextView textView = (TextView) A0R.findViewById(R.id.welcome_message_edit_title);
        C14360o3.A0B(textView, 0);
        this.A05 = textView;
        View findViewById = A0R.findViewById(R.id.welcome_message_message_section);
        C14360o3.A0B(findViewById, 0);
        this.A03 = findViewById;
        A05().addTextChangedListener(this.A0D);
        A05().setHint(A00(this));
        A08().A07 = new C70950Wkw(this, 11);
        C0f9.A09(-1947931894, A02);
        return A0R;
    }
}
