package X;

import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TvQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65863TvQ {
    public AutoplayLayout A00;
    public final XCG A01;
    public final XCG A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C50162MDp(this, 39));
    public final XCG A04;
    public final UserSession A05;

    public static final List A00(C65863TvQ c65863TvQ, AutoplayConfigRoot autoplayConfigRoot) {
        Object obj;
        Object obj2;
        List list;
        try {
            Iterator it = autoplayConfigRoot.autoplayConfigurations.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    boolean z = false;
                    if (((AutoplayConfiguration) obj2).layout == c65863TvQ.A00) {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            AutoplayConfiguration autoplayConfiguration = (AutoplayConfiguration) obj2;
            if (autoplayConfiguration != null && (list = autoplayConfiguration.autoplayCustomizations) != null) {
                return list;
            }
            Iterator it2 = autoplayConfigRoot.autoplayConfigurations.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                boolean z2 = false;
                if (((AutoplayConfiguration) next).layout == AutoplayLayout.UNKNOWN) {
                    z2 = true;
                }
                if (z2) {
                    obj = next;
                    break;
                }
            }
            AutoplayConfiguration autoplayConfiguration2 = (AutoplayConfiguration) obj;
            if (autoplayConfiguration2 != null) {
                return autoplayConfiguration2.autoplayCustomizations;
            }
            return C16930sl.A00;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to get customizations: ");
            sb.append(e);
            C0K8.A0C("AutoplayLoggingService", sb.toString());
            C0f5 AEp = ((C0f6) c65863TvQ.A03.getValue()).AEp("getCustomizationsFail", 126117213);
            AEp.ERI(e);
            AEp.report();
            return C16930sl.A00;
        }
    }

    public final AutoplayConfigRoot A01() {
        AutoplayConfigRoot AuL;
        AutoplayConfigRoot AuL2;
        XCG xcg = this.A02;
        if (xcg.BBP() && (AuL2 = xcg.AuL()) != null) {
            return AuL2;
        }
        XCG xcg2 = this.A01;
        if (xcg2.BBP() && (AuL = xcg2.AuL()) != null && (!A00(this, AuL).isEmpty())) {
            return AuL;
        }
        XCG xcg3 = this.A04;
        if (xcg3.AuL() != null) {
            AutoplayConfigRoot AuL3 = xcg3.AuL();
            C14360o3.A0A(AuL3);
            return AuL3;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public C65863TvQ(XCG xcg, XCG xcg2, XCG xcg3, AutoplayLayout autoplayLayout, UserSession userSession) {
        this.A05 = userSession;
        this.A04 = xcg;
        this.A01 = xcg2;
        this.A02 = xcg3;
        this.A00 = autoplayLayout;
    }
}
