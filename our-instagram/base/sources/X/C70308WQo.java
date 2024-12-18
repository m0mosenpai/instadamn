package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.WQo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70308WQo implements InterfaceC58362lv {
    public final /* synthetic */ C67681Uvy A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C70308WQo(C67681Uvy c67681Uvy, String str, String str2) {
        this.A00 = c67681Uvy;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.common.collect.ImmutableList$Builder] */
    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        String str2;
        UZ1 uz1;
        ImmutableList immutableList;
        String str3;
        String str4;
        Boolean bool;
        Iterable iterable;
        ImmutableList immutableList2;
        ?? r0;
        C2JS reinterpretRequired;
        UZX A0E;
        C67532UnW A0E2;
        UZX A0E3;
        C2JS optionalTreeField;
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C14360o3.A0B(c63406Sjd, 0);
        C67681Uvy c67681Uvy = this.A00;
        ((UFZ) c67681Uvy).A06.A0B(c63406Sjd.A00);
        String str5 = null;
        if (C63406Sjd.A0J(c63406Sjd)) {
            ((UFZ) c67681Uvy).A00 = true;
            Object obj2 = c63406Sjd.A01;
            C67533UnX c67533UnX = (C67533UnX) obj2;
            if (c67533UnX != null && (A0E2 = c67533UnX.A0E()) != null && (A0E3 = A0E2.A0E()) != null && (optionalTreeField = A0E3.getOptionalTreeField(0, "page_info", UZW.class, 614100428)) != null) {
                uz1 = (UZ1) optionalTreeField.reinterpretRequired(0, UZ1.class, -481316464);
            } else {
                uz1 = null;
            }
            c67681Uvy.A00 = uz1;
            C63406Sjd A01 = C63406Sjd.A01(WQ6.A00, c63406Sjd);
            if (obj2 != null) {
                ImmutableCollection immutableCollection = (ImmutableCollection) c67681Uvy.A02.A01;
                if (immutableCollection != null) {
                    iterable = new ArrayList(immutableCollection);
                } else {
                    iterable = C16930sl.A00;
                }
                C67532UnW A0E4 = c67533UnX.A0E();
                if (A0E4 != null && (A0E = A0E4.A0E()) != null) {
                    immutableList2 = A0E.getRequiredCompactedTreeListField(1, "edges", UZV.class, 1191615373);
                } else {
                    immutableList2 = null;
                }
                ?? builder = new ImmutableList.Builder();
                builder.addAll(iterable);
                if (immutableList2 != null) {
                    r0 = new ArrayList();
                    Iterator it = immutableList2.iterator();
                    while (it.hasNext()) {
                        C2JS optionalTreeField2 = ((C2JS) it.next()).getOptionalTreeField(0, "node", UZU.class, 1320777752);
                        if (optionalTreeField2 != null && (reinterpretRequired = optionalTreeField2.reinterpretRequired(0, C67535UnZ.class, 1278893400)) != null) {
                            r0.add(reinterpretRequired);
                        }
                    }
                } else {
                    r0 = C16930sl.A00;
                }
                builder.addAll(r0);
                immutableList = builder.build();
            } else {
                immutableList = null;
            }
            c67681Uvy.A02 = C63406Sjd.A02(c63406Sjd, immutableList);
            LinkedHashMap A012 = C67681Uvy.A01(A01);
            UZ1 uz12 = c67681Uvy.A00;
            if (uz12 == null || (str3 = uz12.A09("start_cursor")) == null) {
                str3 = "0";
            }
            UZ1 uz13 = c67681Uvy.A00;
            if (uz13 != null) {
                str4 = uz13.getOptionalStringField(1, "end_cursor");
            } else {
                str4 = null;
            }
            UZ1 uz14 = c67681Uvy.A00;
            if (uz14 != null) {
                bool = AbstractC31174DnI.A0o(uz14, "has_next_page", 0);
            } else {
                bool = null;
            }
            C67681Uvy.A04(c67681Uvy, bool, "client_fetch_payouthub_success", null, null, null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str3, str4, null, null, null, A012);
            C67681Uvy.A07("fetch_success");
            C67681Uvy.A03(c67681Uvy);
        }
        if (C63406Sjd.A0G(c63406Sjd)) {
            ((UFZ) c67681Uvy).A00 = false;
            String str6 = this.A02;
            if (str6 == null) {
                str6 = "0";
            }
            String str7 = this.A01;
            Throwable th = c63406Sjd.A02;
            if (th != null) {
                str = th.getMessage();
                str2 = C2Ql.A00(th);
                Class<?> cls = th.getClass();
                if (cls != null) {
                    str5 = cls.getSimpleName();
                }
            } else {
                str = null;
                str2 = null;
            }
            C67681Uvy.A04(c67681Uvy, null, "client_fetch_payouthub_fail", null, null, null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", str6, str7, str, str2, str5, null);
            C67681Uvy.A07("fetch_fail");
        }
    }
}
