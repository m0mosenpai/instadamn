package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54412ev implements InterfaceC11380iw, InterfaceC13050lr {
    public static final String __redex_internal_original_name = "BadgingAnalyticsLoggerImplV2";
    public final Map A00;
    public final java.util.Set A01;
    public final AtomicReference A02;
    public final AtomicReference A03;
    public final InterfaceC09390do A04;
    public final boolean A05;
    public final UserSession A06;
    public final InterfaceC54362eq A07;

    public C54412ev(UserSession userSession, InterfaceC54362eq interfaceC54362eq) {
        C14360o3.A0B(interfaceC54362eq, 2);
        this.A06 = userSession;
        this.A07 = interfaceC54362eq;
        this.A05 = C18U.A06(C06090Tz.A05, userSession, 36310662838550761L);
        EnumC54222eY enumC54222eY = EnumC54222eY.A09;
        List list = AbstractC54422ew.A00;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C54432ex((EnumC54222eY) it.next(), null, 0, 0));
        }
        this.A03 = new AtomicReference(new C54432ex(enumC54222eY, arrayList, 0, 0));
        EnumC54222eY enumC54222eY2 = EnumC54222eY.A0I;
        this.A02 = new AtomicReference(new C54432ex(enumC54222eY2, null, 0, 0));
        this.A04 = AbstractC09440dt.A01(C54442ey.A00);
        this.A00 = new LinkedHashMap();
        this.A01 = AbstractC16830sb.A07(new C9BR(enumC54222eY), new C9BR(enumC54222eY2), new C9BR((InterfaceC54232eZ) EnumC54222eY.A0b, true));
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    public static final LinkedHashMap A00(List list, InterfaceC16660sJ interfaceC16660sJ) {
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(list, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C54432ex c54432ex = (C54432ex) it.next();
            String upperCase = c54432ex.A03.BOr().toUpperCase(Locale.ROOT);
            C14360o3.A07(upperCase);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A05("badge_value", Long.valueOf(c54432ex.A01));
            c0Zx.A01((EnumC126815oL) interfaceC16660sJ.invoke(c54432ex), "rendering_rule");
            linkedHashMap.put(upperCase, c0Zx);
        }
        return linkedHashMap;
    }

    public static final void A01(EnumC126785oI enumC126785oI, C54412ev c54412ev, Integer num, Integer num2, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, int i2) {
        C18920wW A02 = AbstractC12220kQ.A02(c54412ev.A06);
        InterfaceC02590Ai A00 = A02.A00(A02.A00, "ig_badge_accuracy");
        if (A00.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            Long l = null;
            String str4 = null;
            if (i > 0) {
                str4 = str3;
            }
            c0Zx.A06("expected", str4);
            String str5 = null;
            if (i2 > 0) {
                str5 = str3;
            }
            c0Zx.A06("actual", str5);
            C0Zx c0Zx2 = new C0Zx();
            Long valueOf = Long.valueOf(i);
            c0Zx2.A05("expected", valueOf);
            Long valueOf2 = Long.valueOf(i2);
            c0Zx2.A05("actual", valueOf2);
            Map map = (Map) interfaceC16820sZ.invoke();
            C0Zx c0Zx3 = new C0Zx();
            C0Zx c0Zx4 = new C0Zx();
            c0Zx4.A05("badge_count", valueOf);
            c0Zx4.A08("category_values", map);
            c0Zx3.A02(c0Zx4, "expected");
            C0Zx c0Zx5 = new C0Zx();
            c0Zx5.A05("badge_count", valueOf2);
            c0Zx5.A08("category_values", (Map) interfaceC16820sZ2.invoke());
            c0Zx3.A02(c0Zx5, "actual");
            Map map2 = (Map) interfaceC16820sZ3.invoke();
            long j = 0;
            C0Zx c0Zx6 = new C0Zx();
            if (map2 != null) {
                C0Zx c0Zx7 = new C0Zx();
                c0Zx7.A05("badge_count", valueOf);
                c0Zx7.A08("category_values", map);
                c0Zx6.A02(c0Zx7, "expected");
                C0Zx c0Zx8 = new C0Zx();
                if (num != null) {
                    j = num.intValue();
                }
                c0Zx8.A05("badge_count", Long.valueOf(j));
                c0Zx8.A08("category_values", map2);
                c0Zx6.A02(c0Zx8, "actual");
            } else {
                C0Zx c0Zx9 = new C0Zx();
                c0Zx9.A05("badge_count", 0L);
                c0Zx9.A08("category_values", AbstractC06930Yk.A0E());
                c0Zx6.A02(c0Zx9, "expected");
                C0Zx c0Zx10 = new C0Zx();
                c0Zx10.A05("badge_count", 0L);
                c0Zx10.A08("category_values", AbstractC06930Yk.A0E());
                c0Zx6.A02(c0Zx10, "actual");
            }
            A00.AAP("badge_position", str2);
            A00.AAP("use_case", str);
            A00.AAP("display_type", str3);
            A00.AAQ(c0Zx, "verify_badge_presence");
            A00.A9K("total_badge_count", valueOf);
            A00.A8R(enumC126785oI, "tap_type");
            if (num2 != null) {
                l = Long.valueOf(num2.intValue());
            }
            A00.A9K("push_tray_count", l);
            A00.AAQ(c0Zx2, "verify_badge_count");
            A00.AAQ(c0Zx3, "verify_badge_categories");
            A00.AAQ(c0Zx6, "verify_badge_categories_unaggregated");
            A00.Cht();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C72053Ld r12, X.C54432ex r13) {
        /*
            r11 = this;
            boolean r0 = r11.A05
            if (r0 == 0) goto L76
            r8 = r13
            X.2eZ r4 = r13.A03
            X.2eY r3 = X.EnumC54222eY.A09
            if (r4 != r3) goto L82
            java.util.concurrent.atomic.AtomicReference r0 = r11.A03
        Ld:
            r0.set(r13)
        L10:
            X.2eq r5 = r11.A07
            java.lang.Integer r9 = X.C05F.A01
            X.2lY r7 = r12.A01
            X.2lU r6 = r12.A00
            r10 = 0
            boolean r0 = r5.Eix(r6, r7, r8, r9, r10)
            if (r0 == 0) goto L76
            com.instagram.common.session.UserSession r0 = r11.A06
            X.0wW r2 = X.AbstractC12220kQ.A02(r0)
            java.lang.String r1 = "ig_badge_impression"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L76
            java.lang.String r1 = X.AbstractC84703qJ.A02(r7)
            java.lang.String r0 = "badge_position"
            r2.AAP(r0, r1)
            java.lang.String r1 = X.AbstractC84703qJ.A03(r13)
            java.lang.String r0 = "use_case"
            r2.AAP(r0, r1)
            java.lang.String r1 = X.AbstractC84703qJ.A01(r6)
            java.lang.String r0 = "display_type"
            r2.AAP(r0, r1)
            int r1 = r13.A01
            int r0 = r13.A00
            int r1 = r1 + r0
            long r0 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "total_badge_count"
            r2.A9K(r0, r1)
            X.2eY r0 = X.EnumC54222eY.A0I
            if (r4 != r0) goto L77
            java.util.Set r0 = r12.A03
            X.3qK r1 = X.AbstractC84703qJ.A00(r13, r0)
            java.lang.String r0 = "direct_badge_context"
        L69:
            r2.AAQ(r1, r0)
        L6c:
            java.lang.String r1 = X.AbstractC25041Ki.A00
            java.lang.String r0 = "canonical_nav_chain"
            r2.AAP(r0, r1)
            r2.Cht()
        L76:
            return
        L77:
            if (r4 != r3) goto L6c
            java.util.Set r0 = r12.A03
            X.3qK r1 = X.AbstractC84703qJ.A00(r13, r0)
            java.lang.String r0 = "af_badge_context"
            goto L69
        L82:
            X.2eY r0 = X.EnumC54222eY.A0I
            if (r4 != r0) goto L10
            java.util.concurrent.atomic.AtomicReference r0 = r11.A02
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54412ev.A02(X.3Ld, X.2ex):void");
    }

    public final void A03(C72053Ld c72053Ld, C54432ex c54432ex, boolean z) {
        C84713qK A00;
        String str;
        if (this.A05) {
            java.util.Set set = this.A01;
            InterfaceC54232eZ interfaceC54232eZ = c54432ex.A03;
            if (set.contains(new C9BR(interfaceC54232eZ, z))) {
                this.A00.put(new C9BR(interfaceC54232eZ, z), new C09530e4(c54432ex, c72053Ld));
            }
            C18920wW A02 = AbstractC12220kQ.A02(this.A06);
            InterfaceC02590Ai A002 = A02.A00(A02.A00, "ig_badge_click");
            if (A002.isSampled()) {
                A002.AAP("badge_position", AbstractC84703qJ.A02(c72053Ld.A01));
                A002.AAP("use_case", AbstractC84703qJ.A03(c54432ex));
                A002.AAP("display_type", AbstractC84703qJ.A01(c72053Ld.A00));
                A002.A9K("total_badge_count", Long.valueOf(c54432ex.A01 + c54432ex.A00));
                if (interfaceC54232eZ == EnumC54222eY.A0I) {
                    A00 = AbstractC84703qJ.A00(c54432ex, c72053Ld.A03);
                    str = "direct_badge_context";
                } else {
                    if (interfaceC54232eZ == EnumC54222eY.A09) {
                        A00 = AbstractC84703qJ.A00(c54432ex, c72053Ld.A03);
                        str = "af_badge_context";
                    }
                    A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                    A002.Cht();
                }
                A002.AAQ(A00, str);
                A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A002.Cht();
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "badging";
    }
}
