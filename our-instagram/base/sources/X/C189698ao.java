package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189698ao implements C82M {
    public Integer A00;
    public Integer A01;
    public String A02;
    public final FragmentActivity A03;
    public final C189708ap A04;
    public final AbstractC59962oe A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final Context A08;
    public final Map A09;

    public C189698ao(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 4);
        this.A07 = userSession;
        this.A05 = abstractC59962oe;
        this.A03 = fragmentActivity;
        this.A06 = interfaceC11380iw;
        this.A08 = context;
        this.A09 = new LinkedHashMap();
        this.A04 = new C189708ap(userSession);
    }

    public final void A01(final InterfaceC1819385d interfaceC1819385d) {
        C14360o3.A0B(interfaceC1819385d, 0);
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.8dr
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int i;
                int A03 = C0f9.A03(1399575593);
                C191418ds c191418ds = (C191418ds) obj;
                int A032 = C0f9.A03(-970871784);
                C14360o3.A0B(c191418ds, 0);
                C189698ao c189698ao = this;
                if (C14360o3.A0K(c189698ao.A02, c191418ds.A01)) {
                    EnumC222919sW enumC222919sW = c191418ds.A00;
                    int ordinal = enumC222919sW.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                C0w9.A03("FlmConsentController", "Invalid FLM consent outcome");
                                c189698ao.A02 = null;
                                c189698ao.A00 = null;
                                c189698ao.A01 = null;
                                i = -182892577;
                                C0f9.A0A(i, A032);
                                C0f9.A0A(1644163826, A03);
                            }
                        } else {
                            c189698ao.A03(false);
                        }
                    } else {
                        c189698ao.A03(true);
                    }
                    interfaceC1819385d.AJV(enumC222919sW);
                }
                i = 360931537;
                C0f9.A0A(i, A032);
                C0f9.A0A(1644163826, A03);
            }
        };
        this.A09.put(interfaceC1819385d, interfaceC41501vz);
        AbstractC25651Mw.A00(this.A07).A01(interfaceC41501vz, C191418ds.class);
    }

    public final void A02(InterfaceC1819385d interfaceC1819385d) {
        C14360o3.A0B(interfaceC1819385d, 0);
        Map map = this.A09;
        InterfaceC41501vz interfaceC41501vz = (InterfaceC41501vz) map.get(interfaceC1819385d);
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A07).A02(interfaceC41501vz, C191418ds.class);
        }
        map.remove(interfaceC1819385d);
    }

    public final boolean A05(Integer num, String str) {
        String str2;
        if (!C18U.A06(C06090Tz.A05, this.A04.A02, 36315176848329816L)) {
            return false;
        }
        if (this.A02 == null) {
            AbstractC59962oe abstractC59962oe = this.A05;
            C62862tP c62862tP = null;
            if (abstractC59962oe != null) {
                c62862tP = C62862tP.A02(abstractC59962oe, this.A06, this.A07, null);
            } else {
                FragmentActivity fragmentActivity = this.A03;
                if (fragmentActivity != null) {
                    c62862tP = C62862tP.A04(fragmentActivity, this.A06, this.A07);
                }
            }
            this.A02 = str;
            this.A00 = num;
            if (c62862tP != null) {
                UserSession userSession = this.A07;
                C09530e4 c09530e4 = new C09530e4("flow_name", "flm_ar_effect");
                switch (num.intValue()) {
                    case 0:
                        str2 = AbstractC43591JPw.A00(1049);
                        break;
                    case 1:
                        str2 = "ig_camera_effect_tray";
                        break;
                    case 2:
                        str2 = "ig_rtc_effect_tray";
                        break;
                    case 3:
                        str2 = "ig_rtc_mini_gallery";
                        break;
                    default:
                        str2 = "ig_shopping_camera";
                        break;
                }
                AbstractC35275FhA.A0G(c62862tP, userSession, AbstractC111324zv.A00(367), "FlmConsentController", AbstractC06930Yk.A06(c09530e4, new C09530e4(CacheBehaviorLogger.SOURCE, str2), new C09530e4("surface", AbstractC111324zv.A00(1018)), new C09530e4(MSV.A00(1157), str)));
            }
        }
        return true;
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    public final void A00() {
        UserSession userSession = this.A07;
        Context context = this.A08;
        C2040190q c2040190q = C2040190q.A0F;
        C2040190q A00 = AbstractC2040290r.A00();
        synchronized (A00) {
            InterfaceC19610xo ARD = AbstractC19750y3.A01("ig_mq_asset_prefs").ARD();
            ARD.EEj("prefs_asset_snapshot_key");
            ARD.apply();
            A00.A00 = 0L;
            A00.A01 = null;
            A00.A02 = null;
            A00.A04 = null;
            A00.A03 = null;
            A00.A07 = Collections.emptyList();
        }
        C2SW c2sw = C2SW.A00;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCH(context, userSession, (InterfaceC23621Ds) null, 35), c2sw);
    }

    public final void A03(boolean z) {
        EnumC150766qZ enumC150766qZ;
        C189708ap c189708ap = this.A04;
        Boolean valueOf = Boolean.valueOf(z);
        C150736qU c150736qU = c189708ap.A00;
        if (c150736qU == null) {
            C14360o3.A0F("sparkARFLMConsentManager");
            throw C00O.createAndThrow();
        }
        if (C14360o3.A0K(valueOf, true)) {
            enumC150766qZ = EnumC150766qZ.CONSENTED;
        } else if (valueOf == null) {
            enumC150766qZ = EnumC150766qZ.DEFAULT_NOT_SEEN;
        } else if (valueOf.equals(false)) {
            enumC150766qZ = EnumC150766qZ.WITHDRAWN;
        } else {
            throw new RuntimeException();
        }
        c150736qU.A01(enumC150766qZ);
    }

    public final boolean A04() {
        C150736qU c150736qU = this.A04.A00;
        if (c150736qU == null) {
            C14360o3.A0F("sparkARFLMConsentManager");
            throw C00O.createAndThrow();
        }
        EnumC150766qZ enumC150766qZ = c150736qU.A04;
        if (enumC150766qZ == null) {
            enumC150766qZ = EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        int ordinal = enumC150766qZ.ordinal();
        boolean z = true;
        if (ordinal != 1 && ordinal != 3) {
            if (ordinal != 2 && ordinal != 4) {
                z = false;
            } else {
                return true;
            }
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return true;
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }
}
