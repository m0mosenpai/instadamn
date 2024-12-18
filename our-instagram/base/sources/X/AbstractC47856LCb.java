package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

/* renamed from: X.LCb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47856LCb {
    public static void A00(AnonymousClass182 anonymousClass182, AbstractC29011ae abstractC29011ae) {
        if (abstractC29011ae.A04 != null) {
            C16V.A03(anonymousClass182, "thread_keys");
            for (DirectThreadKey directThreadKey : abstractC29011ae.A04) {
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                }
            }
            anonymousClass182.A0Z();
        }
        String str = abstractC29011ae.A03;
        if (str != null) {
            anonymousClass182.A0S("client_context", str);
        }
        Long l = abstractC29011ae.A02;
        if (l != null) {
            anonymousClass182.A0R("pending_timestamp_us", l.longValue());
        }
        anonymousClass182.A0R("timestamp_us", abstractC29011ae.A00);
        EnumC46200Kcc enumC46200Kcc = abstractC29011ae.A01;
        if (enumC46200Kcc != null) {
            anonymousClass182.A0Q("mutation_queue_override", enumC46200Kcc.A00);
        }
        AbstractC43669JTd.A00(anonymousClass182, abstractC29011ae);
    }

    public static void A01(C16L c16l, AbstractC29011ae abstractC29011ae, String str) {
        ArrayList arrayList = null;
        if ("thread_keys".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = AbstractC166987dD.A1E();
                while (c16l.A1J() != C16R.A08) {
                    DirectThreadKey parseFromJson = AbstractC83623o5.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            abstractC29011ae.A04 = arrayList;
            return;
        }
        if ("client_context".equals(str)) {
            abstractC29011ae.A03 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("pending_timestamp_us".equals(str)) {
            abstractC29011ae.A02 = AbstractC31173DnH.A0h(c16l);
            return;
        }
        if ("timestamp_us".equals(str)) {
            abstractC29011ae.A00 = c16l.A0y();
            return;
        }
        if ("mutation_queue_override".equals(str)) {
            EnumC46200Kcc enumC46200Kcc = (EnumC46200Kcc) AbstractC166997dE.A0m(EnumC46200Kcc.A01, c16l.A1D());
            if (enumC46200Kcc == null) {
                enumC46200Kcc = EnumC46200Kcc.A04;
            }
            abstractC29011ae.A01 = enumC46200Kcc;
            return;
        }
        AbstractC43669JTd.A01(c16l, abstractC29011ae, str);
    }
}
