package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.DpK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31298DpK extends AbstractC46524KiP implements GZA {
    public C35032Fc5 A00;
    public C33584Esw A01;
    public C33585Esx A02;
    public C2EC A03;
    public final FragmentActivity A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C7VF A07;
    public final JU2 A08;
    public final C7P0 A09;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.Esw] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.Esx] */
    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        int i;
        int i2;
        IgdsBanner igdsBanner;
        int i3;
        C14360o3.A0B(context, 0);
        if (A00()) {
            C33584Esw c33584Esw = this.A01;
            if (c33584Esw == null || (igdsBanner = c33584Esw.A00) == null) {
                UserSession userSession = this.A06;
                C2EC c2ec = this.A03;
                if (c2ec != null) {
                    c2ec.Bxt();
                }
                C14360o3.A0B(userSession, 0);
                ?? obj = new Object();
                igdsBanner = new IgdsBanner(context, null, 0);
                igdsBanner.setIcon(R.drawable.instagram_tag_pano_outline_24);
                AbstractC31172DnG.A1B(context, igdsBanner, AbstractC53242c7.A0D(context));
                C06090Tz c06090Tz = C06090Tz.A05;
                int i4 = 2131975230;
                if (C18U.A06(c06090Tz, userSession, 36316813231657640L)) {
                    i4 = 2131975231;
                }
                igdsBanner.setAction(AbstractC166997dE.A0p(context, i4));
                igdsBanner.setDismissible(true);
                if (C18U.A06(c06090Tz, userSession, 36316813231657640L)) {
                    i3 = 2131975235;
                    if (C18U.A06(c06090Tz, userSession, 36316813231723177L)) {
                        i3 = 2131975234;
                    }
                } else {
                    i3 = 2131975233;
                }
                AbstractC31172DnG.A1U(igdsBanner, AbstractC166997dE.A0p(context, i3), true);
                igdsBanner.A00 = this;
                obj.A00 = igdsBanner;
                this.A01 = obj;
            }
        } else {
            C33585Esx c33585Esx = this.A02;
            if (c33585Esx == null || (igdsBanner = c33585Esx.A00) == null) {
                UserSession userSession2 = this.A06;
                C2EC c2ec2 = this.A03;
                if (c2ec2 != null) {
                    c2ec2.Bxt();
                }
                C14360o3.A0B(userSession2, 0);
                ?? obj2 = new Object();
                IgdsBanner igdsBanner2 = new IgdsBanner(context, null, 0);
                C7OF c7of = C7OF.A00;
                boolean A00 = c7of.A00(userSession2);
                int i5 = R.drawable.instagram_receipt_pano_outline_24;
                if (A00) {
                    i5 = R.drawable.instagram_dollar_pano_outline_24;
                }
                igdsBanner2.setIcon(i5);
                AbstractC31172DnG.A1B(context, igdsBanner2, AbstractC53242c7.A0D(context));
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (C18U.A06(c06090Tz2, userSession2, 36323126832868367L)) {
                    i = 2131963725;
                } else {
                    i = 2131956968;
                    if (c7of.A00(userSession2)) {
                        i = 2131972437;
                    }
                }
                igdsBanner2.setAction(AbstractC166997dE.A0p(context, i));
                igdsBanner2.setDismissible(true);
                if (C18U.A06(c06090Tz2, userSession2, 36323126832868367L)) {
                    i2 = 2131963724;
                } else {
                    i2 = 2131969261;
                    if (c7of.A00(userSession2)) {
                        i2 = 2131972436;
                    }
                }
                AbstractC31172DnG.A1U(igdsBanner2, AbstractC166997dE.A0p(context, i2), true);
                igdsBanner2.A00 = this;
                obj2.A00 = igdsBanner2;
                this.A02 = obj2;
                return igdsBanner2;
            }
        }
        return igdsBanner;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        DirectThreadKey directThreadKey;
        C14360o3.A0B(interfaceC37159GYw, 1);
        UserSession userSession = this.A06;
        if (AbstractC31274Dow.A01(userSession, c2ec) || (AbstractC167007dF.A1Z(this.A07.A0A) && AbstractC31274Dow.A00(userSession, c2ec))) {
            this.A03 = c2ec;
            interfaceC37159GYw.Dpu(this);
            if (c2ec != null) {
                directThreadKey = c2ec.BKb();
            } else {
                directThreadKey = null;
            }
            this.A00 = new C35032Fc5(directThreadKey);
            return;
        }
        interfaceC37159GYw.onFailure();
    }

    private final boolean A00() {
        C2EC c2ec = this.A03;
        UserSession userSession = this.A06;
        if ((!AbstractC31274Dow.A00(userSession, c2ec) || !C18U.A06(C06090Tz.A05, userSession, 36323126832868367L)) && AbstractC31274Dow.A01(userSession, this.A03) && C18U.A06(C06090Tz.A05, userSession, 36316813231395493L)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        String str;
        SmartSuggestion smartSuggestion;
        C35032Fc5 c35032Fc5 = this.A00;
        String str2 = null;
        if (c35032Fc5 != null) {
            str = c35032Fc5.A01(this.A06);
        } else {
            str = null;
        }
        C2EC c2ec = this.A03;
        if (c2ec != null) {
            smartSuggestion = c2ec.Bxt();
        } else {
            smartSuggestion = null;
        }
        if (str != null) {
            JU2 ju2 = this.A08;
            UserSession userSession = this.A06;
            String str3 = userSession.userId;
            if (smartSuggestion != null) {
                str2 = smartSuggestion.A05;
            }
            ju2.A02(str3, str, str2);
            if (A00()) {
                C7P0 c7p0 = this.A09;
                String str4 = userSession.userId;
                C14360o3.A0B(str4, 1);
                C7P0.A01(null, C7P1.IMPRESSION, C7P2.UPSELL_YES_ENTRYPOINT, c7p0, str, str4);
            }
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String str;
        SmartSuggestion smartSuggestion;
        C35032Fc5 c35032Fc5 = this.A00;
        String str2 = null;
        if (c35032Fc5 != null) {
            str = c35032Fc5.A01(this.A06);
        } else {
            str = null;
        }
        C2EC c2ec = this.A03;
        if (c2ec != null) {
            smartSuggestion = c2ec.Bxt();
        } else {
            smartSuggestion = null;
        }
        if (str != null) {
            JU2 ju2 = this.A08;
            String str3 = this.A06.userId;
            if (smartSuggestion != null) {
                str2 = smartSuggestion.A05;
            }
            ju2.A01(str3, str, str2);
        }
        C2EC c2ec2 = this.A03;
        String str4 = null;
        if (c2ec2 != null) {
            DirectThreadKey BKb = c2ec2.BKb();
            UserSession userSession = this.A06;
            if (smartSuggestion != null) {
                str4 = smartSuggestion.A05;
            }
            AbstractC34193F6r.A00(userSession, BKb, str4);
        }
    }

    public C31298DpK(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7VF c7vf) {
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A04 = fragmentActivity;
        this.A07 = c7vf;
        this.A08 = new JU2(interfaceC11380iw, userSession, EnumC31318Dpe.A03);
        this.A09 = new C7P0(interfaceC11380iw, userSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r2 = r4.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        r1.A00(r0, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r4 != null) goto L21;
     */
    @Override // X.GZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActionClicked() {
        /*
            r6 = this;
            boolean r0 = r6.A00()
            if (r0 == 0) goto L59
            X.2EC r4 = r6.A03
            if (r4 == 0) goto L19
            X.Fc5 r0 = r6.A00
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r3 = r6.A06
            androidx.fragment.app.FragmentActivity r1 = r6.A04
            X.0iw r2 = r6.A05
            java.lang.Integer r5 = X.C05F.A01
            r0.A02(r1, r2, r3, r4, r5)
        L19:
            X.Esw r0 = r6.A01
            if (r0 == 0) goto L24
            com.instagram.igds.components.banner.IgdsBanner r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        L24:
            X.2EC r0 = r6.A03
            r2 = 0
            if (r0 == 0) goto L57
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r4 = r0.Bxt()
        L2d:
            X.Fc5 r1 = r6.A00
            if (r1 == 0) goto L44
            com.instagram.common.session.UserSession r0 = r6.A06
            java.lang.String r3 = r1.A01(r0)
            if (r3 == 0) goto L44
            X.JU2 r1 = r6.A08
            java.lang.String r0 = r0.userId
            if (r4 == 0) goto L41
        L3f:
            java.lang.String r2 = r4.A05
        L41:
            r1.A00(r0, r3, r2)
        L44:
            X.2EC r1 = r6.A03
            r0 = 0
            if (r1 == 0) goto L56
            com.instagram.model.direct.DirectThreadKey r2 = r1.BKb()
            com.instagram.common.session.UserSession r1 = r6.A06
            if (r4 == 0) goto L53
            java.lang.String r0 = r4.A05
        L53:
            X.AbstractC34193F6r.A00(r1, r2, r0)
        L56:
            return
        L57:
            r4 = r2
            goto L2d
        L59:
            X.Fc5 r4 = r6.A00
            if (r4 == 0) goto L68
            com.instagram.common.session.UserSession r3 = r6.A06
            androidx.fragment.app.FragmentActivity r2 = r6.A04
            java.lang.Integer r1 = X.C05F.A01
            X.0iw r0 = r6.A05
            r4.A03(r2, r0, r3, r1)
        L68:
            X.Esx r0 = r6.A02
            if (r0 == 0) goto L73
            com.instagram.igds.components.banner.IgdsBanner r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
        L73:
            X.2EC r0 = r6.A03
            r2 = 0
            if (r0 == 0) goto L8f
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r4 = r0.Bxt()
        L7c:
            X.Fc5 r1 = r6.A00
            if (r1 == 0) goto L44
            com.instagram.common.session.UserSession r0 = r6.A06
            java.lang.String r3 = r1.A01(r0)
            if (r3 == 0) goto L44
            X.JU2 r1 = r6.A08
            java.lang.String r0 = r0.userId
            if (r4 == 0) goto L41
            goto L3f
        L8f:
            r4 = r2
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31298DpK.onActionClicked():void");
    }
}
