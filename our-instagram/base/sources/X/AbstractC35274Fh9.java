package X;

import android.os.Build;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.Fh9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35274Fh9 {
    public static final String A02(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        String A02 = AbstractC31172DnG.A0P(abstractC12990ll).A02(C19T.A1u);
        if (A02 == null) {
            return "";
        }
        return A02;
    }

    public static final String A03(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        return AbstractC31179DnN.A0c(abstractC12990ll);
    }

    public static final String A01() {
        String name;
        EnumC12920le A00 = EnumC12920le.A02.A00();
        if (A00 != null && (name = A00.name()) != null) {
            return AbstractC31178DnM.A0f(name);
        }
        return "";
    }

    public static void A06(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.A9K("os_version", Long.valueOf(Build.VERSION.SDK_INT));
    }

    public static final String A00() {
        String A0s = AbstractC31174DnI.A0s();
        if (A0s == null) {
            return "";
        }
        return A0s;
    }

    public static void A04(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("release_channel", A01());
    }

    public static void A05(InterfaceC02590Ai interfaceC02590Ai) {
        interfaceC02590Ai.AAP("guid", A00());
    }

    public static void A07(InterfaceC02590Ai interfaceC02590Ai, double d) {
        interfaceC02590Ai.A8I("current_time", Double.valueOf(d));
        interfaceC02590Ai.AAP("guid", A00());
    }

    public static void A08(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll) {
        interfaceC02590Ai.AAP("guid", A00());
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, A03(abstractC12990ll));
        interfaceC02590Ai.Cht();
    }

    public static void A09(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll) {
        interfaceC02590Ai.AAP("guid", A00());
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, A03(abstractC12990ll));
    }

    public static void A0A(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll) {
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, A03(abstractC12990ll));
    }

    public static void A0B(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll) {
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, A03(abstractC12990ll));
        interfaceC02590Ai.Cht();
    }

    public static void A0C(InterfaceC02590Ai interfaceC02590Ai, AbstractC12990ll abstractC12990ll, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP(CacheBehaviorLogger.SOURCE, A03(abstractC12990ll));
    }

    public static void A0D(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("guid", A00());
    }
}
