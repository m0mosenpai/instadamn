package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.GOu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36925GOu implements Runnable {
    public final /* synthetic */ C50685MZd A00;
    public final /* synthetic */ InterfaceC57867PlX A01;

    public RunnableC36925GOu(C50685MZd c50685MZd, InterfaceC57867PlX interfaceC57867PlX) {
        this.A00 = c50685MZd;
        this.A01 = interfaceC57867PlX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Object c43205J8c;
        C62862tP A0G;
        AbstractC192798gL A05;
        Object obj;
        C50685MZd c50685MZd = this.A00;
        C32106E9e c32106E9e = (C32106E9e) this.A01;
        InterfaceC37110GWv interfaceC37110GWv = c32106E9e.A00;
        HashMap hashMap = c32106E9e.A01;
        if (C32105E9d.A00(interfaceC37110GWv, 1)) {
            C50685MZd.A00(c50685MZd).A04();
            C34931FaH c34931FaH = (C34931FaH) c50685MZd.A02.getValue();
            FragmentActivity requireActivity = c50685MZd.requireActivity();
            EnumC72365Xc1 enumC72365Xc1 = (EnumC72365Xc1) ((C32105E9d) interfaceC37110GWv).A01;
            C14360o3.A0B(enumC72365Xc1, 1);
            C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity, c34931FaH.A00);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable("screen_id", enumC72365Xc1);
            A0b.putSerializable(AbstractC111324zv.A00(1125), false);
            AbstractC31171DnF.A13(A0b, null);
            AbstractC31175DnJ.A0v(A0b, new C50685MZd(), A0P);
            return;
        }
        if (C32105E9d.A00(interfaceC37110GWv, 0)) {
            C50685MZd.A00(c50685MZd).A04();
            C34931FaH c34931FaH2 = (C34931FaH) c50685MZd.A02.getValue();
            Context requireContext = c50685MZd.requireContext();
            FragmentActivity requireActivity2 = c50685MZd.requireActivity();
            Integer num = (Integer) ((C32105E9d) interfaceC37110GWv).A01;
            C37061GUv A01 = C37061GUv.A01(c50685MZd, 48);
            C14360o3.A0B(num, 2);
            AbstractC54195NxZ.A00();
            switch (num.intValue()) {
                case 0:
                    obj = new Object();
                    break;
                case 1:
                case 3:
                case 7:
                case 8:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                case 16:
                case 17:
                case Process.SIGSTOP /* 19 */:
                case 23:
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 31:
                case 32:
                case 37:
                    obj = new GGQ(num);
                    break;
                case 2:
                    obj = new GGU(c50685MZd, A01);
                    break;
                case 4:
                    obj = new Object();
                    break;
                case 5:
                    obj = new Object();
                    break;
                case 6:
                    obj = new GGP(c50685MZd);
                    break;
                case 9:
                    obj = new Object();
                    break;
                case 14:
                    obj = new Object();
                    break;
                case 18:
                    obj = new Object();
                    break;
                case 20:
                    obj = new Object();
                    break;
                case 21:
                    obj = new GGR(c50685MZd);
                    break;
                case 22:
                    obj = new Object();
                    break;
                case 24:
                    obj = new Object();
                    break;
                case 25:
                    obj = new Object();
                    break;
                case 26:
                    obj = new GGW(c50685MZd, c50685MZd);
                    break;
                case 27:
                    obj = new GGV(c50685MZd, c50685MZd);
                    break;
                case 33:
                    obj = new Object();
                    break;
                case 34:
                    obj = new GGS(c50685MZd);
                    break;
                case 35:
                    obj = new Object();
                    break;
                case 36:
                    obj = new Object();
                    break;
                case 38:
                    obj = new Object();
                    break;
                case 39:
                    obj = new GGT(c50685MZd);
                    break;
                default:
                    throw B4Z.A00();
            }
            ((GYK) obj).Crs(requireContext, requireActivity2, c34931FaH2.A00);
            return;
        }
        if (interfaceC37110GWv instanceof E9Z) {
            C50685MZd.A00(c50685MZd).A04();
            C34931FaH c34931FaH3 = (C34931FaH) c50685MZd.A02.getValue();
            Context requireContext2 = c50685MZd.requireContext();
            FragmentActivity requireActivity3 = c50685MZd.requireActivity();
            E9Z e9z = (E9Z) interfaceC37110GWv;
            String str2 = e9z.A01;
            Bundle bundle = e9z.A00;
            C14360o3.A0B(str2, 2);
            UserSession userSession = c34931FaH3.A00;
            if (bundle == null) {
                bundle = AbstractC166987dD.A0b();
            }
            C6XJ A03 = C6XJ.A03(requireActivity3, bundle, userSession, ModalActivity.class, str2);
            A03.A08();
            A03.A0C(requireContext2);
            return;
        }
        if (interfaceC37110GWv instanceof C32104E9c) {
            C50685MZd.A00(c50685MZd).A04();
            C32104E9c c32104E9c = (C32104E9c) interfaceC37110GWv;
            if (!c32104E9c.A04) {
                hashMap = null;
            }
            c50685MZd.A02.getValue();
            Context requireContext3 = c50685MZd.requireContext();
            UserSession A0r = AbstractC166987dD.A0r(c50685MZd.A06);
            String str3 = c32104E9c.A02;
            C51759Mti c51759Mti = c32104E9c.A00;
            EnumC72355Xbr enumC72355Xbr = c32104E9c.A01;
            HashMap hashMap2 = c32104E9c.A03;
            boolean z = c32104E9c.A05;
            AbstractC25233BEq.A0v(1, A0r, str3, c51759Mti);
            if (enumC72355Xbr != null) {
                if (enumC72355Xbr.ordinal() == 0) {
                    C1VE c1ve = C1VE.A02;
                    if (c1ve != null) {
                        hashMap2 = C1VE.A00(c1ve).A03(A0r, EnumC33408Epf.A09);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw B4Z.A00();
                }
            } else if (hashMap2 == null) {
                hashMap2 = AbstractC166987dD.A1G();
            }
            if (hashMap != null) {
                hashMap2.putAll(hashMap);
            }
            C66277U6x A012 = C66277U6x.A01(str3, hashMap2);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A0r);
            A0C.A0l = z;
            A0C.A06(new U5K(null, null, null, null, null, AbstractC25703BXn.A00(AbstractC166997dE.A0M(requireContext3), c51759Mti).toString(), null, null, false, false, false));
            AbstractC31173DnH.A14(requireContext3, A0C, A012);
            return;
        }
        boolean z2 = interfaceC37110GWv instanceof E9Y;
        if (z2) {
            E9Y e9y = (E9Y) interfaceC37110GWv;
            if (e9y.A00 == 1) {
                C50685MZd.A00(c50685MZd).A04();
                c50685MZd.A02.getValue();
                C34931FaH.A00(c50685MZd.requireContext(), AbstractC166987dD.A0r(c50685MZd.A06), e9y.A01);
                return;
            }
        }
        if (interfaceC37110GWv instanceof C32102E9a) {
            C34931FaH c34931FaH4 = (C34931FaH) c50685MZd.A02.getValue();
            FragmentActivity requireActivity4 = c50685MZd.requireActivity();
            C32102E9a c32102E9a = (C32102E9a) interfaceC37110GWv;
            String str4 = c32102E9a.A01;
            EnumC72355Xbr enumC72355Xbr2 = c32102E9a.A00;
            HashMap hashMap3 = c32102E9a.A02;
            c43205J8c = C37061GUv.A01(c50685MZd, 49);
            C14360o3.A0B(str4, 2);
            if (enumC72355Xbr2 != null) {
                if (enumC72355Xbr2.ordinal() == 0) {
                    UserSession userSession2 = c34931FaH4.A00;
                    C1VE c1ve2 = C1VE.A02;
                    if (c1ve2 != null) {
                        hashMap3 = C1VE.A00(c1ve2).A03(userSession2, EnumC33408Epf.A09);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw B4Z.A00();
                }
            }
            UserSession userSession3 = c34931FaH4.A00;
            A0G = AbstractC31178DnM.A0G(requireActivity4, userSession3, "SETTINGS");
            A05 = C192108fB.A05(userSession3, str4, hashMap3);
        } else {
            if (z2) {
                E9Y e9y2 = (E9Y) interfaceC37110GWv;
                if (e9y2.A00 == 0) {
                    C34931FaH c34931FaH5 = (C34931FaH) c50685MZd.A02.getValue();
                    FragmentActivity requireActivity5 = c50685MZd.requireActivity();
                    String str5 = e9y2.A01;
                    c43205J8c = new C43205J8c(c50685MZd, 0);
                    C14360o3.A0B(str5, 2);
                    LinkedHashMap A0p = AbstractC25233BEq.A0p("node_identifier", str5, AbstractC166987dD.A1L("entrypoint", "settings_search"));
                    String A00 = AbstractC111324zv.A00(101);
                    UserSession userSession4 = c34931FaH5.A00;
                    A0G = AbstractC31178DnM.A0G(requireActivity5, userSession4, "SETTINGS");
                    A05 = C192108fB.A05(userSession4, A00, A0p);
                }
            }
            if (interfaceC37110GWv instanceof C32103E9b) {
                C50685MZd.A00(c50685MZd).A04();
                c50685MZd.A02.getValue();
                FragmentActivity requireActivity6 = c50685MZd.requireActivity();
                UserSession A0r2 = AbstractC166987dD.A0r(c50685MZd.A06);
                C32103E9b c32103E9b = (C32103E9b) interfaceC37110GWv;
                String str6 = c32103E9b.A02;
                EnumC72357Xbt enumC72357Xbt = c32103E9b.A00;
                HashMap hashMap4 = c32103E9b.A03;
                String str7 = c32103E9b.A01;
                AbstractC167027dH.A0a(1, A0r2, str6, enumC72357Xbt, hashMap4);
                if (AbstractC14490oL.A0J(requireActivity6.getPackageManager(), str6)) {
                    if (str7 != null && str7.length() != 0) {
                        AbstractC41776Ies.A02(requireActivity6, str7);
                        return;
                    }
                    Intent launchIntentForPackage = requireActivity6.getPackageManager().getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage == null) {
                        return;
                    }
                    C12260kU.A0B(requireActivity6, launchIntentForPackage);
                    return;
                }
                Uri.Builder builder = new Uri.Builder();
                StringBuilder A1C = AbstractC166987dD.A1C();
                Iterator A14 = AbstractC166997dE.A14(hashMap4);
                Object obj2 = "utm_source";
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if ("utm_source".equals(AbstractC31172DnG.A17(A1K).toLowerCase(Locale.US))) {
                        obj2 = A1K.getKey();
                    } else {
                        builder.appendQueryParameter(AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
                    }
                }
                if (hashMap4.containsKey(obj2)) {
                    str = AbstractC31171DnF.A0h(obj2, hashMap4);
                } else {
                    str = "default-utm_source";
                }
                A1C.append(str);
                String query = builder.build().getQuery();
                if (!TextUtils.isEmpty(query)) {
                    A1C.append("&");
                }
                String encode = android.net.Uri.encode(AbstractC166997dE.A0x(query, A1C));
                INK ink = new INK(requireActivity6, A0r2);
                if (enumC72357Xbt == EnumC72357Xbt.A02 && ink.A01()) {
                    AbstractC14490oL.A06(requireActivity6, ink, str6, encode);
                    return;
                } else {
                    AbstractC14490oL.A07(requireActivity6, str6, encode);
                    return;
                }
            }
            throw B4Z.A00();
        }
        C32394EOv.A00(A05, A0G, c43205J8c, 16);
        c50685MZd.schedule(A05);
    }
}
