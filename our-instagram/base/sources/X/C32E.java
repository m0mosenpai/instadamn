package X;

import java.util.ArrayList;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.32E, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C32E {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C32E[] A01;
    public static final C32E A02;
    public static final C32E A03;

    public static final boolean A01(String str, Map map) {
        C5I5 c5i5;
        C14360o3.A0B(str, 0);
        if (map.containsKey(str)) {
            C5I4 c5i4 = (C5I4) map.get(str);
            if (c5i4 != null) {
                c5i5 = c5i4.C03();
            } else {
                c5i5 = null;
            }
            if (c5i5 != C5I5.A06) {
                return true;
            }
        }
        return false;
    }

    public final void A02(AnonymousClass318 anonymousClass318, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31E c31e, InterfaceC671531g interfaceC671531g, Object obj, Map map) {
        C14360o3.A0B(c31e, 1);
        C14360o3.A0B(interfaceC62242sP, 3);
        C14360o3.A0B(interfaceC671531g, 5);
        ArrayList A0U = AbstractC001800i.A0U(interfaceC671231d.BZU());
        if (A01(interfaceC62242sP.BF8(obj), map)) {
            C1PZ AGn = interfaceC671531g.AGn(A0U);
            InterfaceC42381xS F9D = interfaceC671231d.F9D();
            if (F9D != null) {
                c31e.Cit(F9D, AGn, "deleted_unseen_item");
                if (anonymousClass318 != null) {
                    anonymousClass318.A0e = interfaceC62242sP.BF8(F9D.BUM());
                    anonymousClass318.A0V = "pool_replacement_and_injected_item_removal";
                }
                interfaceC671531g.EKX();
            }
        }
    }

    static {
        C32E c32e = new C32E() { // from class: X.32F
        };
        A02 = c32e;
        C32G c32g = new C32G();
        A03 = c32g;
        C32E[] c32eArr = {c32e, c32g};
        A01 = c32eArr;
        A00 = AbstractC12190kN.A00(c32eArr);
    }

    public static final void A00(AnonymousClass318 anonymousClass318, String str, int i, int i2, int i3, boolean z) {
        if (anonymousClass318 != null) {
            anonymousClass318.A03 = true;
            anonymousClass318.A06 = Boolean.valueOf(z);
            anonymousClass318.A0V = str;
            Integer num = anonymousClass318.A0C;
            if (num != null) {
                i += num.intValue();
            }
            anonymousClass318.A0C = Integer.valueOf(i);
            anonymousClass318.A0G = Integer.valueOf(i2);
            anonymousClass318.A0E = Integer.valueOf(i3);
        }
    }

    public C32E(String str, int i) {
    }
}
