package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.1o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37061o4 implements InterfaceC37071o5 {
    public C31349DqE A00;
    public final C37081o6 A01 = new Object();

    public static final boolean A02(Long l, Long l2) {
        return (l == null || l2 == null || l2.longValue() - l.longValue() >= TimeUnit.DAYS.toSeconds(1L)) ? false : true;
    }

    public final boolean A04(UserSession userSession, EnumC39589Hdz enumC39589Hdz, String str) {
        if (C18U.A04(C06090Tz.A05, userSession, 36879402407297292L).equals("longer_delete_title")) {
            EnumC72375XcB enumC72375XcB = EnumC72375XcB.A06;
            FR8 fr8 = (FR8) AbstractC73274XzK.A00.get(enumC72375XcB);
            if ((fr8 == null || !fr8.A01(userSession)) && AbstractC23021Ah.A00(userSession).A01.getInt("direct_message_entry_count", 0) > 1) {
                String string = AbstractC23021Ah.A00(userSession).A01.getString("interop_reachability_setting", "");
                C14360o3.A07(string);
                DirectMessagesInteropOptionsViewModel parseFromJson = OY8.parseFromJson(C16V.A00(string));
                if (parseFromJson == null) {
                    new OLM(new C19270xB("direct_message"), userSession).A00(enumC39589Hdz, enumC72375XcB, C05F.A0N, C05F.A04, str, new LinkedHashMap());
                } else if (parseFromJson.A08 == DirectMessageInteropReachabilityOptions.A0G) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r25, 36317616390215081L) == false) goto L34;
     */
    @Override // X.InterfaceC37071o5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean API(androidx.fragment.app.FragmentActivity r23, X.InterfaceC11380iw r24, com.instagram.common.session.UserSession r25, X.EnumC40111tc r26, X.EnumC39589Hdz r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37061o4.API(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.1tc, X.Hdz, java.lang.String):boolean");
    }

    @Override // X.InterfaceC37071o5
    public final void Coe(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, java.util.Set set, int i) {
        Object obj;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(set, 4);
        if (!set.isEmpty() && list != null && !list.isEmpty() && C18U.A06(C06090Tz.A06, userSession, 36317036569170709L)) {
            String A04 = C18U.A04(C06090Tz.A05, userSession, 36879986522784036L);
            Iterator it = set.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String id = ((User) next).getId();
                Object A0O = AbstractC001800i.A0O(list, 0);
                if (A0O != null) {
                    obj = A0O.toString();
                }
                if (C14360o3.A0K(id, obj)) {
                    obj = next;
                    break;
                }
            }
            User user = (User) obj;
            if (user != null) {
                if (A04.equals("toast")) {
                    String obj2 = UUID.randomUUID().toString();
                    C14360o3.A07(obj2);
                    OLM olm = new OLM(interfaceC11380iw, userSession);
                    C146106i8 c146106i8 = new C146106i8();
                    c146106i8.A01 = 10000;
                    c146106i8.A02 = i;
                    c146106i8.A0D = context.getString(2131976353, user.getUsername());
                    String string = context.getString(2131976352);
                    C14360o3.A07(string);
                    c146106i8.A0G = string;
                    c146106i8.A02();
                    c146106i8.A04 = context.getDrawable(R.drawable.instagram_settings_pano_outline_24);
                    c146106i8.A0A = new C42702Iux(context, interfaceC11380iw, userSession, user, olm, this, obj2, A04);
                    c146106i8.A01();
                    C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                    return;
                }
                if (!A04.equals("bottom_sheet")) {
                    return;
                }
                A00(context, interfaceC11380iw, userSession, user, this, "comment_deletion_bottom_sheet_upsell", A04);
            }
        }
    }

    @Override // X.InterfaceC37071o5
    public final void Cof(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC39589Hdz enumC39589Hdz) {
        C14360o3.A0B(userSession, 0);
        if (AbstractC23021Ah.A00(userSession).A01.getInt("contact_point_update_upsells_view_count", 0) < 2) {
            EnumC72375XcB enumC72375XcB = EnumC72375XcB.A04;
            Map map = AbstractC73274XzK.A00;
            FR8 fr8 = (FR8) map.get(enumC72375XcB);
            if ((fr8 != null && fr8.A01(userSession)) || !C18U.A06(C06090Tz.A05, userSession, 36316319309631725L)) {
                return;
            }
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            OLM olm = new OLM(interfaceC11380iw, userSession);
            EnumC39594He4 enumC39594He4 = EnumC39594He4.A08;
            olm.A00(enumC39589Hdz, enumC72375XcB, C05F.A01, C05F.A00, obj, new LinkedHashMap());
            FR8 fr82 = (FR8) map.get(enumC72375XcB);
            if (fr82 != null) {
                fr82.A00(userSession);
            }
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
            int i = interfaceC19630xq.getInt("contact_point_update_upsells_view_count", 0);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7D("contact_point_update_upsells_view_count", i + 1);
            ARD.apply();
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0U = new C43013J0e(enumC39589Hdz, olm, obj);
            C189478aR A00 = c189448aO.A00();
            C38911HBi c38911HBi = new C38911HBi();
            Bundle bundle = new Bundle();
            bundle.putString(AbstractC50532MSl.A00(), obj);
            bundle.putSerializable("entrypoint", enumC39589Hdz);
            bundle.putSerializable("copy_version", enumC39594He4);
            c38911HBi.setArguments(bundle);
            A00.A03(context, c38911HBi);
        }
    }

    @Override // X.InterfaceC37071o5
    public final void Coi(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC39589Hdz enumC39589Hdz) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC39589Hdz, 3);
        if (C18U.A04(C06090Tz.A05, userSession, 36879402407297292L).equals("longer_delete_title")) {
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            OLM olm = new OLM(interfaceC11380iw, userSession);
            Integer num = C05F.A0N;
            Integer num2 = C05F.A03;
            EnumC72375XcB enumC72375XcB = EnumC72375XcB.A06;
            olm.A00(enumC39589Hdz, enumC72375XcB, num, num2, obj, new LinkedHashMap());
            if (A04(userSession, enumC39589Hdz, obj)) {
                FR8 fr8 = (FR8) AbstractC73274XzK.A00.get(enumC72375XcB);
                if (fr8 != null) {
                    fr8.A00(userSession);
                }
                olm.A00(enumC39589Hdz, enumC72375XcB, C05F.A01, C05F.A00, obj, new LinkedHashMap());
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0U = new PHc(enumC39589Hdz, olm, obj);
                C189478aR A00 = c189448aO.A00();
                N4T n4t = new N4T();
                Bundle bundle = new Bundle();
                bundle.putString(AbstractC50532MSl.A00(), obj);
                bundle.putSerializable("entrypoint", enumC39589Hdz);
                n4t.setArguments(bundle);
                A00.A03(context, n4t);
            }
        }
    }

    @Override // X.InterfaceC37071o5
    public final void Cor(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC39589Hdz enumC39589Hdz, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        if (C18U.A06(C06090Tz.A05, userSession, 36314515423365799L)) {
            String obj = UUID.randomUUID().toString();
            C14360o3.A07(obj);
            OLM olm = new OLM(interfaceC11380iw, userSession);
            Integer num = C05F.A0C;
            Integer num2 = C05F.A02;
            EnumC72375XcB enumC72375XcB = EnumC72375XcB.A09;
            olm.A00(enumC39589Hdz, enumC72375XcB, num, num2, obj, new LinkedHashMap());
            Map map = AbstractC73274XzK.A00;
            FR8 fr8 = (FR8) map.get(enumC72375XcB);
            if (fr8 != null && !fr8.A01(userSession) && C14360o3.A0K(C08730cb.A00(userSession).A00().A03.AbK(), "everyone")) {
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D("tag_setting_upsells_untag_count", interfaceC19630xq.getInt("tag_setting_upsells_untag_count", 0) + i);
                ARD.apply();
                if (AbstractC23021Ah.A00(userSession).A01.getInt("tag_setting_upsells_untag_count", 0) > 0) {
                    FR8 fr82 = (FR8) map.get(enumC72375XcB);
                    if (fr82 != null) {
                        fr82.A00(userSession);
                    }
                    InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD2.E7D("tag_setting_upsells_untag_count", 0);
                    ARD2.apply();
                    A03(context, userSession, enumC39589Hdz, olm, EnumC53250Ngo.A05, obj);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r7 != null) goto L15;
     */
    @Override // X.InterfaceC37071o5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cot(android.content.Context r20, X.InterfaceC11380iw r21, com.instagram.common.session.UserSession r22, com.instagram.user.model.User r23, X.EnumC39589Hdz r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37061o4.Cot(android.content.Context, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User, X.Hdz, java.lang.String):void");
    }

    @Override // X.InterfaceC37071o5
    public final boolean EjT(UserSession userSession, EnumC39589Hdz enumC39589Hdz) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC39589Hdz, 1);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        return A04(userSession, enumC39589Hdz, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1o6] */
    public /* synthetic */ C37061o4(AbstractC72485Xen abstractC72485Xen, C37081o6 c37081o6, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, C37061o4 c37061o4, String str, String str2) {
        C43049J1p c43049J1p = new C43049J1p(userSession, c37061o4, str2);
        String moduleName = interfaceC11380iw.getModuleName();
        String username = user.getUsername();
        C14360o3.A0B(moduleName, 2);
        C1Yn.A00(context, null, userSession, null, null, user, c43049J1p, moduleName, str, username, null);
        if (C14360o3.A0K(str2, "bottom_sheet")) {
            A01(userSession, C05F.A01, "bottom_sheet");
        }
    }

    public static final void A01(UserSession userSession, Integer num, String str) {
        OVQ.A00.A00(userSession, C05F.A00, num, str, null, null);
    }

    public final void A03(Context context, UserSession userSession, EnumC39589Hdz enumC39589Hdz, OLM olm, EnumC53250Ngo enumC53250Ngo, String str) {
        olm.A00(enumC39589Hdz, EnumC72375XcB.A09, C05F.A01, C05F.A00, str, new LinkedHashMap());
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0U = new C56760PHd(enumC39589Hdz, olm, str);
        C189478aR A00 = c189448aO.A00();
        N4W n4w = new N4W();
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC50532MSl.A01(197, 10, 82), str);
        bundle.putSerializable("entrypoint", enumC39589Hdz);
        bundle.putSerializable("upsell_type", enumC53250Ngo);
        n4w.setArguments(bundle);
        A00.A03(context, n4w);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.1o6] */
    public C37061o4() {
    }
}
