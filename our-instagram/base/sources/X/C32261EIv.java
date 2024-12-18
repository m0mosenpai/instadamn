package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.api.schemas.TextPostAppBottomSheetCTAType;
import com.instagram.barcelonaig.getapp.GetAppFragment$Companion;
import com.instagram.barcelonaig.intf.GetApp$Type;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.model.User;
import java.util.ArrayDeque;

/* renamed from: X.EIv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32261EIv extends AbstractC59962oe {
    public static final GetAppFragment$Companion A0A = new Object();
    public static final String __redex_internal_original_name = "GetAppFragment";
    public GXC A00;
    public C23031Ai A01;
    public User A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public GetApp$Type A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    public static final void A00(Spanned spanned, View view, C32261EIv c32261EIv) {
        CharSequence charSequence;
        String str;
        CharSequence charSequence2 = spanned;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.get_app_description);
        GetApp$Type getApp$Type = c32261EIv.A08;
        if (getApp$Type == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        } else {
            int ordinal = getApp$Type.ordinal();
            if (ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        if (spanned == null) {
                            return;
                        }
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    User user = c32261EIv.A02;
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                    if (user != null) {
                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(user.getUsername());
                        A0H.setSpan(new StyleSpan(1), 0, A0H.length(), 17);
                        User user2 = c32261EIv.A02;
                        if (user2 != null) {
                            if (user2.isVerified()) {
                                C85963sQ.A08(c32261EIv.requireContext(), A0H, true);
                            }
                            if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(c32261EIv.A09, 0), 36318857639500407L) && c32261EIv.A06) {
                                c32261EIv.requireContext().getResources();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                ArrayDeque arrayDeque = new ArrayDeque();
                                spannableStringBuilder.append((CharSequence) AbstractC31174DnI.A0w(c32261EIv, A0H, 2131953659));
                                AbstractC31423DrT.A00(spannableStringBuilder, A0H, "[[user_name]]", arrayDeque, new Object[0], 17);
                                charSequence = new SpannableString(spannableStringBuilder);
                                A0N.setText(charSequence);
                                return;
                            }
                            A0H.append((CharSequence) " ");
                            String str2 = c32261EIv.A03;
                            if (str2 == null) {
                                str = "appName";
                            } else {
                                A0H.append((CharSequence) AbstractC31174DnI.A0w(c32261EIv, str2, 2131953660));
                                charSequence2 = A0H;
                            }
                        }
                    }
                }
            } else {
                charSequence2 = c32261EIv.getString(2131953661);
            }
            charSequence = charSequence2;
            A0N.setText(charSequence);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(791);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r11.A06 == false) goto L23;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r4 = 0
            r6 = r12
            X.C14360o3.A0B(r12, r4)
            r7 = r11
            super.onViewCreated(r12, r13)
            android.os.Bundle r2 = r11.requireArguments()
            java.lang.Class<com.instagram.user.model.User> r1 = com.instagram.user.model.User.class
            java.lang.String r0 = "get_app_user"
            android.os.Parcelable r0 = X.AbstractC153636vY.A00(r2, r1, r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r11.A02 = r0
            android.os.Bundle r1 = r11.requireArguments()
            java.lang.String r0 = "get_app_entrypoint"
            java.lang.String r0 = r1.getString(r0)
            r11.A04 = r0
            android.os.Bundle r1 = r11.requireArguments()
            java.lang.String r0 = "injected_actor_ids"
            java.lang.String r0 = r1.getString(r0)
            r11.A05 = r0
            com.instagram.user.model.User r1 = r11.A02
            r9 = 0
            if (r1 != 0) goto L40
            java.lang.String r0 = "user"
        L38:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L40:
            java.lang.String r0 = r11.A04
            if (r0 == 0) goto L65
            int r0 = r0.length()
            if (r0 == 0) goto L65
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.A02
        L4c:
            r11.A08 = r0
            X.0do r2 = r11.A09
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r2)
            java.lang.String r0 = X.C151366re.A00(r0)
            r11.A03 = r0
            X.1Ai r0 = X.AbstractC25230BEn.A0l(r2)
            r11.A01 = r0
            if (r0 != 0) goto L77
            java.lang.String r0 = "userPrefs"
            goto L38
        L65:
            X.0do r0 = r11.A09
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            boolean r0 = X.C2TN.A04(r0, r1)
            if (r0 == 0) goto L74
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.A04
            goto L4c
        L74:
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.A03
            goto L4c
        L77:
            X.0xq r1 = r0.A01
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            boolean r0 = r1.getBoolean(r0, r4)
            r11.A07 = r0
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r0, r2)
            boolean r0 = r0.A1o()
            r11.A06 = r0
            r0 = 2131433569(0x7f0b1861, float:1.8488927E38)
            android.widget.TextView r5 = X.AbstractC167007dF.A0N(r12, r0)
            X.0ll r3 = X.AbstractC25230BEn.A0k(r2, r4)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318857639500407(0x8107cf00401a77, double:3.031530043296832E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lb0
            boolean r0 = r11.A06
            r2 = 2131953664(0x7f130800, float:1.9543805E38)
            if (r0 != 0) goto Lb3
        Lb0:
            r2 = 2131953665(0x7f130801, float:1.9543807E38)
        Lb3:
            r1 = 1
            java.lang.String r0 = r11.A03
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "appName"
            goto L38
        Lbc:
            android.text.SpannableStringBuilder r3 = X.AbstractC31178DnM.A08(r11, r0, r2)
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r1)
            int r1 = r3.length()
            r0 = 17
            r3.setSpan(r2, r4, r1, r0)
            r5.setText(r3)
            com.instagram.barcelonaig.intf.GetApp$Type r1 = r11.A08
            if (r1 != 0) goto Ld9
            java.lang.String r0 = "type"
            goto L38
        Ld9:
            com.instagram.barcelonaig.intf.GetApp$Type r0 = com.instagram.barcelonaig.intf.GetApp$Type.A02
            if (r1 != r0) goto Lf6
            r0 = 2131435676(0x7f0b209c, float:1.84932E38)
            android.view.View r8 = r12.requireViewById(r0)
            r8.setVisibility(r4)
            X.2k6 r0 = X.C07Y.A00(r11)
            r10 = 10
            X.MCR r5 = new X.MCR
            r5.<init>(r6, r7, r8, r9, r10)
            X.AbstractC166987dD.A1Z(r5, r0)
            return
        Lf6:
            A00(r9, r12, r11)
            A01(r12, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32261EIv.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public static final void A01(View view, TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType, C32261EIv c32261EIv) {
        String A0w;
        View.OnClickListener fp1;
        String str;
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(view, R.id.get_app_cta);
        GetApp$Type getApp$Type = c32261EIv.A08;
        if (getApp$Type == null) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        } else {
            int ordinal = getApp$Type.ordinal();
            if (ordinal != 2 && ordinal != 1) {
                if (ordinal == 0) {
                    if (textPostAppBottomSheetCTAType != null) {
                        A02(textPostAppBottomSheetCTAType, c32261EIv, igdsBottomButtonLayout);
                        return;
                    }
                    return;
                }
                throw B4Z.A00();
            }
            InterfaceC09390do interfaceC09390do = c32261EIv.A09;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            C14360o3.A0B(A0o, 0);
            if (C98J.A00(A0o).booleanValue()) {
                C06090Tz c06090Tz = C06090Tz.A05;
                long A01 = C18U.A01(c06090Tz, A0o, 36600332612341619L) * 1000;
                if (A01 > 0 && A01 > System.currentTimeMillis()) {
                    UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
                    if (C98J.A00(A0K).booleanValue() && C151366re.A01(A0K) && C18U.A06(c06090Tz, A0K, 36318857636223559L)) {
                        int i = 2131953658;
                        if (c32261EIv.A07) {
                            i = 2131953657;
                        }
                        A0w = c32261EIv.getString(i);
                        fp1 = new ViewOnClickListenerC35683FpI(2, igdsBottomButtonLayout, c32261EIv);
                        igdsBottomButtonLayout.setPrimaryAction(A0w, fp1);
                        return;
                    }
                }
            }
            String str2 = c32261EIv.A03;
            if (str2 == null) {
                str = "appName";
            } else {
                A0w = AbstractC31174DnI.A0w(c32261EIv, str2, 2131953655);
                fp1 = new Fp1(c32261EIv, 24);
                igdsBottomButtonLayout.setPrimaryAction(A0w, fp1);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(TextPostAppBottomSheetCTAType textPostAppBottomSheetCTAType, C32261EIv c32261EIv, IgdsBottomButtonLayout igdsBottomButtonLayout) {
        String A0w;
        View.OnClickListener fp1;
        int ordinal = textPostAppBottomSheetCTAType.ordinal();
        int i = 1;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 0) {
                        throw B4Z.A00();
                    }
                    return;
                } else {
                    A0w = c32261EIv.getString(2131953657);
                    i = 2;
                }
            } else {
                A0w = c32261EIv.getString(2131953658);
            }
            fp1 = new ViewOnClickListenerC35684FpJ(i, igdsBottomButtonLayout, c32261EIv, textPostAppBottomSheetCTAType);
        } else {
            int i2 = 2131953655;
            if (AbstractC14490oL.A0A(c32261EIv.requireContext())) {
                i2 = 2131953656;
            }
            String str = c32261EIv.A03;
            if (str == null) {
                C14360o3.A0F("appName");
                throw C00O.createAndThrow();
            }
            A0w = AbstractC31174DnI.A0w(c32261EIv, str, i2);
            fp1 = new Fp1(c32261EIv, 25);
        }
        igdsBottomButtonLayout.setPrimaryAction(A0w, fp1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(804598473);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_getapp, false);
        C0f9.A09(1043314853, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(997935029);
        super.onDestroy();
        this.A04 = null;
        this.A05 = null;
        this.A00 = null;
        C0f9.A09(924257256, A02);
    }
}
