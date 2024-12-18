package com.instagram.inappbrowser.actions;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC56402iY;
import X.AbstractC58317Pt9;
import X.AbstractC61742Rsx;
import X.AbstractC917648y;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C19260xA;
import X.C28501Zl;
import X.C28531Zo;
import X.C2EY;
import X.C34726FRp;
import X.C3DN;
import X.C3DP;
import X.C51758Mth;
import X.C56769PHm;
import X.C63217SfN;
import X.EnumC61097RfB;
import X.InterfaceC1119153d;
import X.P2R;
import X.SFB;
import android.os.Bundle;
import android.view.Window;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class BrowserActionActivity extends IgFragmentActivity implements InterfaceC1119153d {
    public UserSession A00;
    public EnumC61097RfB A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final P2R A07 = new Object();

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A00 = C0f9.A00(-914862404);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            this.A00 = AbstractC31171DnF.A0G(A0A);
            super.onCreate(bundle);
            AbstractC917648y.A00(this, 1);
            setContentView(R.layout.browser_action_activity);
            this.A01 = (EnumC61097RfB) A0A.getSerializable("browser_action_extra_action_type");
            this.A02 = A0A.getString("browser_action_extra_browser_url");
            this.A04 = A0A.getString("browser_action_extra_media_id", "");
            this.A03 = A0A.getString("browser_action_session_id", "");
            this.A05 = A0A.getString("browser_action_tracking_token");
            A0A.getBoolean("browser_action_tracking_enabled", true);
            this.A06 = A0A.getString("browser_url_author_id");
            Window window = getWindow();
            if (window != null) {
                AbstractC56402iY.A07(window.getDecorView(), window, A0A.getBoolean("browser_action_status_bar_visibility"));
                C0f9.A07(-1779290840, A00);
                return;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -456372453;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1398382271;
        }
        C0f9.A07(i, A00);
        throw A14;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        String str;
        int A00 = C0f9.A00(-1584700076);
        super.onStart();
        EnumC61097RfB enumC61097RfB = this.A01;
        if (enumC61097RfB != null) {
            if (enumC61097RfB.ordinal() == 0) {
                C63217SfN c63217SfN = C63217SfN.A06;
                if (c63217SfN != null) {
                    C51758Mth c51758Mth = c63217SfN.A00;
                    if (c51758Mth.A01) {
                        SFB sfb = (SFB) c51758Mth.A00;
                        String str2 = this.A02;
                        if (str2 != null) {
                            this.A02 = AbstractC61742Rsx.A00(sfb, str2);
                        }
                    }
                }
                String str3 = this.A02;
                if (str3 != null) {
                    C3DN bottomSheetNavigator = getBottomSheetNavigator();
                    if (bottomSheetNavigator != null) {
                        ((C3DP) bottomSheetNavigator).A0H = new C56769PHm(this, 4);
                        C19260xA c19260xA = new C19260xA();
                        C19260xA.A00(c19260xA, this.A03, AbstractC58317Pt9.A00(41));
                        C19260xA.A00(c19260xA, this.A05, "tracking_token");
                        C19260xA.A00(c19260xA, this.A02, AbstractC58317Pt9.A00(137));
                        C19260xA.A00(c19260xA, "send_in_direct", "share_type");
                        C28501Zl c28501Zl = C28531Zo.A04.A02;
                        UserSession userSession = this.A00;
                        if (userSession == null) {
                            str = "userSession";
                        } else {
                            C34726FRp A07 = c28501Zl.A07(this.A07, userSession, C2EY.A19);
                            String str4 = this.A04;
                            if (str4 == null) {
                                str = "mediaId";
                            } else {
                                A07.A06(str4);
                                A07.A07(str3);
                                A07.A02(c19260xA);
                                A07.A07.putString("DirectShareSheetConstants.url_author_id", this.A06);
                                bottomSheetNavigator.A0K(A07.A00());
                                C0f9.A07(-2137331855, A00);
                                return;
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(enumC61097RfB, "Unknown action type: ", AbstractC166987dD.A1C()));
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
