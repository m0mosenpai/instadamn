package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.InstagramProfileCallToActionDestinations;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V0U extends AbstractC59962oe implements InterfaceC60122ou, CallerContextable {
    public static final String __redex_internal_original_name = "PromoteProfileVisitSettingFragment";
    public C70399WUb A01;
    public A9M A02;
    public PromoteData A03;
    public PromoteState A04;
    public C66359UCf A05;
    public C66359UCf A06;
    public boolean A08;
    public boolean A09;
    public InstagramProfileCallToActionDestinations A00 = InstagramProfileCallToActionDestinations.A0B;
    public String A07 = "";
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(this.A07);
        AbstractC50523MSb.A1E(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_profile_visit_setting";
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0253, code lost:
    
        if (r0 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ea, code lost:
    
        if (X.WGQ.A00(r4, r0) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0109, code lost:
    
        if (X.WGQ.A08(r1, true) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02fd, code lost:
    
        r11 = "promoteState";
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02eb  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0U.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(V0U v0u, boolean z) {
        C66359UCf c66359UCf = v0u.A05;
        if (c66359UCf != null && v0u.A06 != null) {
            if (z) {
                c66359UCf.setAlpha(1.0f);
                C66359UCf c66359UCf2 = v0u.A06;
                if (c66359UCf2 != null) {
                    c66359UCf2.setAlpha(1.0f);
                }
                C66359UCf c66359UCf3 = v0u.A05;
                if (c66359UCf3 != null) {
                    c66359UCf3.A01();
                }
                C66359UCf c66359UCf4 = v0u.A06;
                if (c66359UCf4 != null) {
                    c66359UCf4.A01();
                    return;
                }
                return;
            }
            c66359UCf.setAlpha(0.5f);
            C66359UCf c66359UCf5 = v0u.A06;
            if (c66359UCf5 != null) {
                c66359UCf5.setAlpha(0.5f);
            }
            C66359UCf c66359UCf6 = v0u.A05;
            if (c66359UCf6 != null) {
                c66359UCf6.A00();
            }
            C66359UCf c66359UCf7 = v0u.A06;
            if (c66359UCf7 == null) {
                return;
            }
            c66359UCf7.A00();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0A.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String A0v;
        int A02 = C0f9.A02(895115839);
        super.onCreate(bundle);
        this.A03 = InterfaceC72021XFj.A00(this);
        InterfaceC09390do interfaceC09390do = this.A0A;
        this.A01 = AbstractC43594JPz.A0N(interfaceC09390do);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (A0v = bundle2.getString("profile_visit_primary_text")) == null) {
            A0v = AbstractC25227BEk.A0v(this, 2131970599);
        }
        this.A07 = A0v;
        this.A02 = C97F.A01(C97F.A00(V0U.class), (UserSession) interfaceC09390do.getValue());
        C0f9.A09(-1962557312, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1826161608);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_profile_visit_setting_view, viewGroup, false);
        C0f9.A09(1871052396, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(1789062174);
        super.onDestroyView();
        C70399WUb c70399WUb = this.A01;
        if (c70399WUb == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A03;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                c70399WUb.A0C(VG4.A1C, promoteData);
                this.A05 = null;
                this.A06 = null;
                C0f9.A09(1299343847, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        VG4 vg4;
        String str;
        int A02 = C0f9.A02(486109342);
        PromoteData promoteData = this.A03;
        String str2 = "promoteData";
        if (promoteData != null) {
            if (this.A04 == null) {
                str2 = "promoteState";
            } else {
                if (WGQ.A08(promoteData, true)) {
                    PromoteData promoteData2 = this.A03;
                    if (promoteData2 != null) {
                        InstagramProfileCallToActionDestinations instagramProfileCallToActionDestinations = this.A00;
                        boolean z = this.A08;
                        C70399WUb c70399WUb = this.A01;
                        if (c70399WUb == null) {
                            str2 = "promoteLogger";
                        } else {
                            C14360o3.A0B(instagramProfileCallToActionDestinations, 1);
                            promoteData2.A24.clear();
                            java.util.Set set = promoteData2.A24;
                            if (z) {
                                set.add(instagramProfileCallToActionDestinations);
                                if (instagramProfileCallToActionDestinations == InstagramProfileCallToActionDestinations.A0B) {
                                    vg4 = VG4.A1C;
                                    str = "whatsapp_message_secondary_cta_radio_button";
                                } else if (instagramProfileCallToActionDestinations == InstagramProfileCallToActionDestinations.A04) {
                                    vg4 = VG4.A1C;
                                    str = "direct_message_secondary_cta_radio_button";
                                }
                            } else {
                                set.remove(instagramProfileCallToActionDestinations);
                                vg4 = VG4.A1C;
                                str = "no_secondary_cta_radio_button";
                            }
                            c70399WUb.A0G(vg4, str);
                        }
                    }
                }
                super.onStop();
                C0f9.A09(1825578411, A02);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
