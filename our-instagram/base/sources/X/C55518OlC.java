package X;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.OlC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55518OlC implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55518OlC(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(CompoundButton compoundButton, Object obj, Object obj2, int i) {
        compoundButton.setOnCheckedChangeListener(new C55518OlC(i, obj, obj2));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Rb5 rb5;
        String str;
        InterfaceC16660sJ interfaceC16660sJ;
        AbstractC51032Mgg A03;
        LeadGenInfoFieldTypes leadGenInfoFieldTypes;
        C50634MWv c50634MWv;
        String str2;
        switch (this.A00) {
            case 0:
                if (z) {
                    Calendar calendar = Calendar.getInstance();
                    C14360o3.A07(calendar);
                    calendar.add(6, 30);
                    long timeInMillis = calendar.getTimeInMillis();
                    rb5 = (Rb5) this.A02;
                    Locale locale = Locale.getDefault();
                    C14360o3.A07(locale);
                    String format = new SimpleDateFormat(AbstractC58317Pt9.A00(585), locale).format(new Date(timeInMillis));
                    C14360o3.A07(format);
                    IgdsListCell igdsListCell = (IgdsListCell) this.A01;
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(rb5.getString(2131956644), format);
                    C14360o3.A07(formatStrLocaleSafe);
                    igdsListCell.A0H(formatStrLocaleSafe);
                    AbstractC63317ShP.A02(AbstractC166987dD.A0r(rb5.A06), timeInMillis);
                } else {
                    ((IgdsListCell) this.A01).A0H("");
                    rb5 = (Rb5) this.A02;
                    UserSession A0r = AbstractC166987dD.A0r(rb5.A06);
                    InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(A0r).A01;
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7G(AbstractC58317Pt9.A00(743), 0L);
                    ARD.apply();
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E77(AbstractC58317Pt9.A00(744), false);
                    ARD2.apply();
                    AbstractC63317ShP.A01(new C67936V3b(8), A0r, null, "CONTACT_AUTOFILL", "AUTO_AUTOFILL_OPT_OUT");
                }
                C146106i8 A0Y = AbstractC31174DnI.A0Y();
                int i = 2131956646;
                if (z) {
                    i = 2131956645;
                }
                A0Y.A0D = rb5.getString(i);
                A0Y.A06();
                AbstractC25233BEq.A1F(A0Y);
                if (z) {
                    str = "BROWSER_SETTINGS_AUTOMATIC_AUTOFILL_OPT_IN";
                } else {
                    str = "BROWSER_SETTINGS_AUTOMATIC_AUTOFILL_OPT_OUT";
                }
                Rb5.A02(rb5, str);
                return;
            case 1:
                C52776NXh c52776NXh = (C52776NXh) this.A02;
                C2AU c2au = c52776NXh.A03;
                if (c2au != null) {
                    AbstractC12990ll abstractC12990ll = c2au.A06;
                    if (abstractC12990ll instanceof UserSession) {
                        C23031Ai A00 = AbstractC23021Ah.A00((UserSession) abstractC12990ll);
                        AbstractC167007dF.A1L(A00, A00.A69, C23031Ai.A8c, 38, z);
                        C0K8.A0D("RageShakeSensorHelper", "UserPreferences setRageShakeEnabledNewFlow is set");
                        C2AU.A00(c2au);
                    }
                }
                C54748OGw c54748OGw = c52776NXh.A01;
                if (c54748OGw == null) {
                    C14360o3.A0F("logger");
                    throw C00O.createAndThrow();
                }
                c54748OGw.A00(MSX.A0Y(z ? 1 : 0));
                C52776NXh.A00((Context) this.A01, c52776NXh);
                return;
            case 2:
                if (!z) {
                    return;
                }
                NJF njf = (NJF) this.A02;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                interfaceC16660sJ = njf.A01;
                interfaceC16660sJ.invoke(this.A01);
                return;
            case 3:
                if (!z) {
                    return;
                }
                NJG njg = (NJG) this.A02;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                interfaceC16660sJ = njg.A02;
                interfaceC16660sJ.invoke(this.A01);
                return;
            case 4:
                N6F n6f = (N6F) this.A02;
                if (!n6f.isResumed()) {
                    return;
                }
                A03 = n6f.A03();
                leadGenInfoFieldTypes = (LeadGenInfoFieldTypes) this.A01;
                c50634MWv = A03.A01;
                C55205OeH.A04(c50634MWv, leadGenInfoFieldTypes, z);
                return;
            case 5:
                A03 = (AbstractC51032Mgg) ((N5C) this.A02).A00.getValue();
                leadGenInfoFieldTypes = (LeadGenInfoFieldTypes) this.A01;
                c50634MWv = A03.A01;
                C55205OeH.A04(c50634MWv, leadGenInfoFieldTypes, z);
                return;
            case 6:
                C50998Mg5 A0f = MSW.A0f(((C52111N4j) this.A02).A06);
                String str3 = ((LeadGenCustomDisclaimerCheckbox) this.A01).A00;
                C14360o3.A0B(str3, 0);
                C51740MtP c51740MtP = (C51740MtP) A0f.A06.get(str3);
                if (c51740MtP != null) {
                    c51740MtP.A01 = z;
                }
                C50998Mg5.A00(A0f);
                return;
            case 7:
                N65 n65 = (N65) this.A02;
                if (!n65.isResumed()) {
                    return;
                }
                C51038Mgo A0h = MSW.A0h(n65.A04);
                leadGenInfoFieldTypes = (LeadGenInfoFieldTypes) this.A01;
                c50634MWv = A0h.A01;
                C55205OeH.A04(c50634MWv, leadGenInfoFieldTypes, z);
                return;
            case 8:
                C153936w2 c153936w2 = (C153936w2) this.A01;
                if (z) {
                    str2 = "opt_in_auto_graduate";
                } else {
                    str2 = "opt_out_auto_graduate";
                }
                C153936w2.A05(c153936w2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "trial_settings", str2);
                InterfaceC16660sJ interfaceC16660sJ2 = ((N4Q) this.A02).A00;
                if (interfaceC16660sJ2 == null) {
                    return;
                }
                AbstractC25227BEk.A1Q(interfaceC16660sJ2, z);
                return;
            default:
                N58 n58 = (N58) this.A02;
                InterfaceC09390do interfaceC09390do = n58.A01;
                C51034Mgi c51034Mgi = (C51034Mgi) interfaceC09390do.getValue();
                Boolean valueOf = Boolean.valueOf(z);
                c51034Mgi.A00.A01("IS_CAPTIONS_ENABLED", valueOf);
                InterfaceC09390do interfaceC09390do2 = n58.A00;
                AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do2);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A0o, 36322860544961220L) && C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do2), 36322860545288905L)) {
                    IgdsListCell igdsListCell2 = (IgdsListCell) this.A01;
                    igdsListCell2.setChecked(z);
                    igdsListCell2.setEnabled(z);
                    C51034Mgi.A00(interfaceC09390do).A01("IS_CAPTIONS_TRANSLATIONS_ENABLED", valueOf);
                    return;
                }
                return;
        }
    }
}
