package X;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OmM implements InterfaceC71880X8n {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ W4F A02;
    public final /* synthetic */ InterfaceC55722hD A03;
    public final /* synthetic */ InterfaceC94534Ng A04;
    public final /* synthetic */ String A05;

    public OmM(Context context, PreferenceScreen preferenceScreen, W4F w4f, InterfaceC55722hD interfaceC55722hD, InterfaceC94534Ng interfaceC94534Ng, String str) {
        this.A02 = w4f;
        this.A05 = str;
        this.A04 = interfaceC94534Ng;
        this.A03 = interfaceC55722hD;
        this.A01 = preferenceScreen;
        this.A00 = context;
    }

    @Override // X.InterfaceC71880X8n
    public final boolean DaD(Preference preference) {
        List<C94574Nk> list;
        String obj;
        Object[] objArr;
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        Boolean bool2;
        String str6;
        String str7;
        String A06;
        W4F w4f = this.A02;
        String str8 = this.A05;
        InterfaceC94534Ng interfaceC94534Ng = this.A04;
        InterfaceC55722hD interfaceC55722hD = this.A03;
        PreferenceScreen preferenceScreen = this.A01;
        Context context = this.A00;
        C69797Vvh c69797Vvh = new C69797Vvh(context);
        C94524Nf c94524Nf = (C94524Nf) interfaceC94534Ng;
        C4NJ c4nj = c94524Nf.A01;
        c69797Vvh.A08(AbstractC43592JPx.A10(c4nj.A0D, interfaceC55722hD.B7s(c4nj.A0D)));
        StringBuilder sb = new StringBuilder("[\n");
        C94554Ni c94554Ni = c94524Nf.A02;
        if (c94554Ni != null) {
            list = c94554Ni.A00.A02;
        } else {
            list = C16930sl.A00;
        }
        for (C94574Nk c94574Nk : list) {
            sb.append(StringFormatUtil.formatStrLocaleSafe("{type: %s, value: %s}\n", c94574Nk.A00.A00.name(), c94574Nk.A01));
        }
        sb.append("]");
        C5OL ArV = interfaceC55722hD.ArV(interfaceC94534Ng, str8);
        if (ArV.A07) {
            C5OL AYa = interfaceC55722hD.AYa(interfaceC94534Ng, str8);
            if (AYa.A07) {
                if (c4nj.A0I) {
                    obj = "false. Is in exposure holdout.";
                } else {
                    obj = "true";
                }
            } else {
                Integer num = AYa.A03;
                if (num != null) {
                    objArr = new Object[]{AbstractC53725NpE.A00(num)};
                    str = "false.\nFailed Counter: %s";
                    obj = StringFormatUtil.formatStrLocaleSafe(str, objArr);
                }
                obj = "false";
            }
        } else {
            C94574Nk c94574Nk2 = ArV.A01;
            if (c94574Nk2 != null) {
                objArr = new Object[]{c94574Nk2.A00.A00, c94574Nk2.A01};
                str = "false.\nFailed filter: %s, value: %s";
                obj = StringFormatUtil.formatStrLocaleSafe(str, objArr);
            } else {
                C94564Nj c94564Nj = ArV.A02;
                if (c94564Nj != null) {
                    IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = (IGDevToolPersistentStateHandler) interfaceC55722hD;
                    C66262z2 c66262z2 = new C66262z2();
                    C49I A00 = ((C55452gl) C55452gl.A02.getValue()).A00(iGDevToolPersistentStateHandler.A00, iGDevToolPersistentStateHandler.A01, new C55732hE(), str8, c4nj.CB6());
                    C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebook.quickpromotion.sdk.eligibility.QPEligibilityContext<com.instagram.quickpromotion.intf.Trigger, com.facebook.quickpromotion.sdk.models.QuickPromotion<com.instagram.quickpromotion.intf.Trigger>>");
                    HashMap A01 = c66262z2.A01(interfaceC94534Ng, A00, c94564Nj);
                    StringBuilder sb2 = new StringBuilder("false.\nFailed filter clause. Contextual Filter Results:\n");
                    Iterator A14 = AbstractC166997dE.A14(A01);
                    while (A14.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                        C94574Nk c94574Nk3 = (C94574Nk) A1K.getKey();
                        sb2.append(StringFormatUtil.formatStrLocaleSafe("result: %b, filter: %s, value: %s \n", A1K.getValue(), c94574Nk3.A00.A00.name(), c94574Nk3.A01));
                    }
                    obj = sb2.toString();
                }
                obj = "false";
            }
        }
        String C8t = interfaceC55722hD.C8t(interfaceC94534Ng);
        String Aqr = interfaceC55722hD.Aqr(interfaceC94534Ng);
        Integer valueOf = Integer.valueOf(c4nj.A00);
        Integer valueOf2 = Integer.valueOf(interfaceC55722hD.As0(interfaceC94534Ng, C05F.A00, str8));
        C4NV c4nv = c4nj.A08.A01;
        if (c4nv == null || (str2 = Integer.valueOf(AbstractC37302Gc3.A02(c4nv.A01)).toString()) == null) {
            str2 = "null";
        }
        if (c4nv == null || (str3 = c4nv.A03) == null) {
            str3 = "null";
        }
        if (c4nv != null) {
            bool = Boolean.valueOf(c4nv.A04);
        } else {
            bool = null;
        }
        Integer valueOf3 = Integer.valueOf(interfaceC55722hD.As0(interfaceC94534Ng, C05F.A01, str8));
        C4NV c4nv2 = c4nj.A08.A02;
        if (c4nv2 == null || (str4 = Integer.valueOf(AbstractC37302Gc3.A02(c4nv2.A01)).toString()) == null) {
            str4 = "null";
        }
        if (c4nv2 == null || (str5 = c4nv2.A03) == null) {
            str5 = "null";
        }
        if (c4nv2 != null) {
            bool2 = Boolean.valueOf(c4nv2.A04);
        } else {
            bool2 = null;
        }
        Integer valueOf4 = Integer.valueOf(interfaceC55722hD.As0(interfaceC94534Ng, C05F.A0C, str8));
        C4NV c4nv3 = c4nj.A08.A00;
        if (c4nv3 == null || (str6 = Integer.valueOf(AbstractC37302Gc3.A02(c4nv3.A01)).toString()) == null) {
            str6 = "null";
        }
        Integer valueOf5 = Integer.valueOf(interfaceC55722hD.As0(interfaceC94534Ng, C05F.A0N, str8));
        Long valueOf6 = Long.valueOf(c94524Nf.A00);
        C117135Rw c117135Rw = c4nj.A08.A08;
        if (c117135Rw == null || (str7 = c117135Rw.A00) == null) {
            str7 = "null";
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        A1C.append(c4nj.CB6());
        C5Ry c5Ry = c4nj.A08.A07;
        if (c5Ry == null) {
            A06 = "null";
        } else {
            Integer num2 = c5Ry.A01;
            if (num2 == null) {
                num2 = C5Ry.A05;
                C14360o3.A08(num2);
            }
            Integer valueOf7 = Integer.valueOf(num2.intValue());
            Integer num3 = c5Ry.A02;
            if (num3 == null) {
                num3 = C5Ry.A05;
                C14360o3.A08(num3);
            }
            A06 = AbstractC13670mt.A06("{\n height: %d,\n width %d,\n scale: %f,\n name: %s,\n url: %s\n}", valueOf7, Integer.valueOf(num3.intValue()), c5Ry.A04, "", c5Ry.A00);
        }
        StringBuilder A11 = AbstractC166997dE.A11(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c4nj.A0H) {
            A1E.add(EnumC53111NeO.A02);
        }
        if (c4nj.A0K) {
            A1E.add(EnumC53111NeO.A03);
        }
        A11.append(A1E);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Title: %s\n\nContent: %s\n\nMax Impressions: %s\nLocal Impressions: %s\n\nPrimary Action\nLimit: %s\nUrl: %s\nDismiss QP: %s\nLocal Count: %s\n\nSecondary Action\nLimit: %s\nUrl: %s\nDismiss QP: %s\nLocal Count: %s\n\nDismiss Action\nLimit: %s\nLocal Count: %s\n\nHas Native Template: %s\n\nHas Bloks: %s\n\nImpression Delay Met: %s\nDismiss Delay Met: %s\n\nPriority: %s\n\nSocial Context:%s\n\nEligible?: %s\n\nTriggers: %s\n\nFilters: %s\n\nImage: %s\n\nAttributes: %s", C8t, Aqr, valueOf, valueOf2, str2, str3, bool, valueOf3, str4, str5, bool2, valueOf4, str6, valueOf5, "N", "N", true, true, valueOf6, str7, obj, A1C, sb, A06, A11);
        C69487VoA c69487VoA = c69797Vvh.A01;
        c69487VoA.A0C = formatStrLocaleSafe;
        c69797Vvh.A06(new DialogInterfaceOnClickListenerC35362Fid(context, interfaceC55722hD, interfaceC94534Ng, w4f, str8, 0), "Reset Counters");
        c69797Vvh.A05(new DialogInterfaceOnClickListenerC55317Ogf(0, context, w4f, interfaceC94534Ng), "JSON");
        DialogInterfaceOnClickListenerC55318Ogg dialogInterfaceOnClickListenerC55318Ogg = new DialogInterfaceOnClickListenerC55318Ogg(0, interfaceC55722hD, interfaceC94534Ng, context, w4f, preferenceScreen);
        c69487VoA.A0E = "Force Mode Options";
        c69487VoA.A02 = dialogInterfaceOnClickListenerC55318Ogg;
        AbstractC50523MSb.A0p(c69797Vvh);
        return true;
    }
}
