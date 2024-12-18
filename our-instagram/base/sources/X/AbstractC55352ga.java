package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* renamed from: X.2ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55352ga implements InterfaceC55362gb {
    public List A00;
    public C55452gl A01;
    public InstagramQpSdkModule A02;
    public C55412gg A03;
    public boolean A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final InterfaceC55002fz A08;
    public final InterfaceC55322gX A09;
    public final QuickPromotionSlot A0A;
    public final InterfaceC55202gL A0B;
    public final C55382gd A0C;
    public final C55372gc A0D;
    public final java.util.Set A0E;
    public final C55562gw A0F;
    public final InterfaceC09390do A0G;

    public static final boolean A00(AbstractC55352ga abstractC55352ga, Map map, java.util.Set set, boolean z) {
        if (!z) {
            AbstractC54912fq.A00();
            Context context = abstractC55352ga.A05;
            UserSession userSession = abstractC55352ga.A07;
            if (!((InterfaceC19630xq) ((IGDevToolPersistentStateHandler) new C55712hB(context, userSession).A00.getValue()).A02.getValue()).getBoolean("/shared/qp/dev_mode", false) && AbstractC54912fq.A00().A08(userSession, abstractC55352ga.A0A, abstractC55352ga.A0D)) {
                InterfaceC55322gX interfaceC55322gX = abstractC55352ga.A09;
                interfaceC55322gX.AWA("cool_down");
                interfaceC55322gX.AW0("qp_canceled", "cool_down");
                interfaceC55322gX.AW3();
                return false;
            }
        }
        C55732hE c55732hE = new C55732hE(map);
        c55732hE.A00.isEmpty();
        C55562gw c55562gw = abstractC55352ga.A0F;
        java.util.Set set2 = set;
        if (C18U.A06(C06090Tz.A05, c55562gw.A00.A00, 36317466065900733L)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((java.util.Set) c55562gw.A01.getValue()).contains(obj)) {
                    arrayList.add(obj);
                }
            }
            set2 = AbstractC001800i.A0k(arrayList);
        }
        if (!set2.isEmpty()) {
            QuickPromotionSlot quickPromotionSlot = abstractC55352ga.A0A;
            Map map2 = AbstractC61082qW.A01;
            EnumMap enumMap = new EnumMap(QuickPromotionSurface.class);
            for (EnumC61092qX enumC61092qX : AbstractC61082qW.A01(quickPromotionSlot)) {
                EnumSet enumSet = enumC61092qX.A01;
                HashSet hashSet = new HashSet();
                for (Object obj2 : set) {
                    if (enumSet.contains(obj2)) {
                        hashSet.add(obj2);
                    }
                }
                enumMap.put((EnumMap) enumC61092qX.A00, (QuickPromotionSurface) hashSet);
            }
            InterfaceC55322gX interfaceC55322gX2 = abstractC55352ga.A09;
            interfaceC55322gX2.AWA("sdk_fetch");
            InstagramQpSdkModule instagramQpSdkModule = abstractC55352ga.A02;
            UserSession userSession2 = abstractC55352ga.A07;
            Context context2 = abstractC55352ga.A05;
            C19L c19l = (C19L) abstractC55352ga.A0G.getValue();
            C61102qY c61102qY = new C61102qY(abstractC55352ga);
            C14360o3.A0B(c19l, 5);
            InstagramQpSdkModule.A05.add(interfaceC55322gX2);
            C12L c12l = C12L.A00;
            C19K A03 = AnonymousClass194.A03(c12l.AOT(2020389652, 3), c19l);
            C9DW c9dw = new C9DW(context2, c12l, userSession2, interfaceC55322gX2, c55732hE, c61102qY, instagramQpSdkModule, enumMap, null, c19l);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dw, A03);
            return true;
        }
        return false;
    }

    public final void A01(UserSession userSession, C4NJ c4nj, Integer num) {
        C4NJ c4nj2;
        String str;
        String valueOf = String.valueOf(c4nj.A06.A00);
        C94524Nf c94524Nf = new C94524Nf(c4nj);
        C55462gm c55462gm = C55452gl.A01;
        C49G A00 = C55462gm.A00(userSession, valueOf);
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        C49S c49s = C49S.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        c4nj2 = c94524Nf.A01;
                        C49G.A02(A00, C05F.A1F, C05F.A1I, C05F.A01, c4nj2.A0D);
                        str = "dismiss";
                    } else {
                        return;
                    }
                } else {
                    c4nj2 = c94524Nf.A01;
                    C49G.A02(A00, C05F.A0u, C05F.A15, null, c4nj2.A0D);
                    str = "secondary";
                }
            } else {
                c4nj2 = c94524Nf.A01;
                C49G.A02(A00, C05F.A0Y, C05F.A0j, null, c4nj2.A0D);
                str = "primary";
            }
            AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) c49s.invoke(A02);
            if (abstractC02600Aj.A00.isSampled()) {
                abstractC02600Aj.A0Q("promotion_id", Long.valueOf(Long.parseLong(c4nj2.A0D)));
                abstractC02600Aj.A0Q("context_surface_id", Long.valueOf(Long.parseLong(valueOf)));
                abstractC02600Aj.A0R("action_type", str);
                String str2 = c4nj2.A0B;
                if (str2 == null) {
                    str2 = "";
                }
                abstractC02600Aj.A0R("plain_instance_log_data", str2);
                abstractC02600Aj.A00.A9M("extra_client_data", null);
                abstractC02600Aj.Cht();
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005b: INVOKE (r0 I:boolean) = (r4 I:long) STATIC call: com.facebook.systrace.Systrace.A0E(long):boolean A[MD:(long):boolean (m)] (LINE:91), block:B:24:0x005b */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    public final void A02(C55732hE c55732hE) {
        ?? A0E;
        try {
            if (Systrace.A0E(1L)) {
                C0fO.A01("onScreenLoadTriggered", -886822871);
            }
            java.util.Set set = (java.util.Set) AbstractC61082qW.A00.get(this.A0A);
            if (set != null && !set.isEmpty()) {
                this.A09.AWE("screen_load_trigger", set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((Trigger) it.next()).A00 = c55732hE;
                }
                A00(this, c55732hE.A00, set, false);
            } else {
                AbstractC31546DtW.A00(this.A07, C05F.A1F, "onScreenLoadTriggered() was called but is not valid for this slot.", null);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(129446066);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(A0E == true ? 1L : 0L)) {
                C0fO.A00(-802228270);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC55362gb
    public final boolean AVr(java.util.Set set) {
        C14360o3.A0B(set, 0);
        return AVs(null, set);
    }

    @Override // X.InterfaceC55362gb
    public final boolean AVs(Map map, java.util.Set set) {
        C14360o3.A0B(set, 0);
        this.A09.AWE("ad_hoc_trigger", set);
        return A00(this, map, set, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0bW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.GYB] */
    @Override // X.InterfaceC55362gb
    public void Dco(C4NL c4nl, Integer num, Map map) {
        C4NV c4nv;
        C14360o3.A0B(c4nl, 0);
        Integer num2 = C05F.A0N;
        if (num != num2) {
            C4NJ c4nj = (C4NJ) c4nl;
            Integer num3 = C05F.A01;
            C4NM c4nm = c4nj.A08;
            if (num == num3) {
                c4nv = c4nm.A01;
            } else {
                c4nv = c4nm.A02;
            }
            if (c4nv != null) {
                UserSession userSession = this.A07;
                A01(userSession, c4nj, c4nv.A02);
                String A00 = STQ.A00(c4nv.A03, map);
                EnumEntries enumEntries = EnumC55212gM.A01;
                InterfaceC55202gL interfaceC55202gL = this.A0B;
                EnumSet C4E = interfaceC55202gL.C4E();
                Context context = this.A05;
                EnumC55212gM enumC55212gM = EnumC55212gM.A1T;
                if (!C4E.remove(enumC55212gM) || !enumC55212gM.A00(userSession, A00)) {
                    enumC55212gM = null;
                    if (A00 != null) {
                        String lowerCase = A00.toLowerCase(Locale.ROOT);
                        C14360o3.A07(lowerCase);
                        for (?? r10 : C4E) {
                            EnumC55212gM enumC55212gM2 = (EnumC55212gM) r10;
                            if (enumC55212gM2 instanceof C55262gR) {
                                C14J A002 = C14J.A04.A00();
                                if (A002 != null) {
                                    if (AbstractC35278FhD.A0G(context, lowerCase) == null && A002.A00(userSession, lowerCase) == null) {
                                    }
                                    enumC55212gM = r10;
                                    break;
                                }
                                continue;
                            } else if (enumC55212gM2.A00(userSession, lowerCase)) {
                                enumC55212gM = r10;
                                break;
                            }
                        }
                        enumC55212gM = enumC55212gM;
                    }
                }
                ?? BAv = interfaceC55202gL.BAv(enumC55212gM);
                ?? r5 = 0;
                if (BAv != 0) {
                    if (A00 != null) {
                        try {
                            r5 = AbstractC08820cl.A00(new Object(), A00);
                            if (r5 != 0) {
                                Bundle bundle = new Bundle();
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                BAv.CJ8(r5, bundle);
                            }
                        } catch (IllegalArgumentException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot parse url: ");
                            sb.append(A00);
                            sb.append("; slot: ");
                            sb.append(this.A0A);
                            AbstractC31546DtW.A00(userSession, num2, sb.toString(), r5);
                        }
                    }
                } else {
                    Integer num4 = C05F.A0Y;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No action handler for url: ");
                    sb2.append(A00);
                    sb2.append("; slot: ");
                    sb2.append(this.A0A);
                    AbstractC31546DtW.A00(userSession, num4, sb2.toString(), null);
                    this.A08.AHP();
                }
                if (c4nv.A04) {
                    this.A08.AHP();
                }
            }
        }
    }

    @Override // X.InterfaceC55362gb
    public void Dcp(C4NL c4nl) {
        Integer num;
        C14360o3.A0B(c4nl, 0);
        UserSession userSession = this.A07;
        if (C14360o3.A0K(Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession, 36326914993961158L)), false)) {
            C4NJ c4nj = (C4NJ) c4nl;
            C4NV c4nv = c4nj.A08.A00;
            if (c4nv != null) {
                num = c4nv.A02;
            } else {
                num = C05F.A0N;
            }
            A01(userSession, c4nj, num);
        }
        this.A08.AHP();
    }

    @Override // X.InterfaceC55362gb
    public synchronized void Dcq(C4NL c4nl) {
        C14360o3.A0B(c4nl, 0);
        java.util.Set set = this.A0E;
        C4NJ c4nj = (C4NJ) c4nl;
        if (!set.contains(c4nj.A0D)) {
            set.add(c4nj.A0D);
            C55372gc c55372gc = this.A0D;
            QuickPromotionSurface quickPromotionSurface = c4nj.A06;
            Map map = c55372gc.A01;
            map.remove(quickPromotionSurface);
            map.put(quickPromotionSurface, Long.valueOf(System.currentTimeMillis()));
            c55372gc.A00 = quickPromotionSurface;
            UserSession userSession = this.A07;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            String name = this.A0A.name();
            String obj = c55372gc.toString();
            C14360o3.A0B(name, 0);
            InterfaceC19610xo ARD = A00.A01.ARD();
            ARD.E7K(AnonymousClass001.A0R(name, "_qp_slot_impression_data"), obj);
            ARD.apply();
            String valueOf = String.valueOf(c4nj.A06.A00);
            C94524Nf c94524Nf = new C94524Nf(c4nj);
            C55462gm c55462gm = C55452gl.A01;
            C49G A002 = C55462gm.A00(userSession, valueOf);
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            C49Q c49q = C49Q.A00;
            C4NJ c4nj2 = c94524Nf.A01;
            C49G.A02(A002, C05F.A0C, C05F.A0N, C05F.A00, c4nj2.A0D);
            C25531Mh c25531Mh = (C25531Mh) c49q.invoke(A02);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                c25531Mh.A0Q("promotion_id", Long.valueOf(Long.parseLong(c4nj2.A0D)));
                c25531Mh.A0Q("context_surface_id", Long.valueOf(Long.parseLong(valueOf)));
                String str = c4nj2.A0B;
                if (str == null) {
                    str = "";
                }
                c25531Mh.A0R("plain_instance_log_data", str);
                ((AbstractC02600Aj) c25531Mh).A00.A9M("extra_client_data", null);
                c25531Mh.Cht();
            }
        }
    }

    @Override // X.InterfaceC55362gb
    public void DiZ() {
        A02(new C55732hE());
    }

    @Override // X.InterfaceC55362gb
    public final void Dia(Map map) {
        A02(new C55732hE(map));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (X.C55682h8.A00(r0).getLong("qp_cooldown_response_expiration_time", 0) <= java.lang.System.currentTimeMillis()) goto L10;
     */
    @Override // X.InterfaceC55362gb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FAZ() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55352ga.FAZ():void");
    }

    public AbstractC55352ga(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC55002fz interfaceC55002fz, InterfaceC55322gX interfaceC55322gX, QuickPromotionSlot quickPromotionSlot, InterfaceC55202gL interfaceC55202gL, InterfaceC09390do interfaceC09390do) {
        C55382gd c55382gd;
        this.A05 = context;
        this.A07 = userSession;
        this.A0A = quickPromotionSlot;
        this.A0B = interfaceC55202gL;
        this.A08 = interfaceC55002fz;
        this.A09 = interfaceC55322gX;
        this.A06 = interfaceC11380iw;
        this.A0G = interfaceC09390do;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        String name = quickPromotionSlot.name();
        C14360o3.A0B(name, 0);
        this.A0D = new C55372gc(A00.A01.getString(AnonymousClass001.A0R(name, "_qp_slot_impression_data"), null));
        this.A0E = new HashSet();
        synchronized (C55382gd.A01) {
            c55382gd = (C55382gd) C55382gd.A02.getValue();
        }
        this.A0C = c55382gd;
        this.A03 = C55412gg.A02;
        this.A02 = AbstractC55432gi.A00(userSession);
        this.A01 = (C55452gl) C55452gl.A02.getValue();
        this.A0F = new C55562gw(new C55552gv(userSession));
    }
}
