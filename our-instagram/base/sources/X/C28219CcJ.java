package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CcJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28219CcJ {
    public static final C28219CcJ A00 = new Object();

    public final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, double d, int i, int i2, boolean z) {
        long j;
        Long l;
        Long A0k;
        C14360o3.A0B(str, 2);
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        String A06 = C38801rC.A06(str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_threads_in_reels_unit_post_vpvd_imp");
        if (A0f.isSampled()) {
            C14360o3.A0B(A06, 0);
            Long A0k2 = AbstractC003100w.A0k(10, A06);
            if (A0k2 != null) {
                A0f.AAP("container_module", interfaceC11380iw.getModuleName());
                A0f.A9K("media_id", A0k2);
                AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0f(A0f, i, i2));
                if (str2 != null && (A0k = AbstractC003100w.A0k(10, str2)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                A0f.A9K("netego_id", Long.valueOf(j));
                A0f.A8I(AbstractC111324zv.A00(136), Double.valueOf(d));
                A0f.A7v(AbstractC111324zv.A00(459), Boolean.valueOf(z));
                if (str3 != null) {
                    l = AbstractC003100w.A0k(10, str3);
                } else {
                    l = null;
                }
                A0f.A9K("quick_promotion_id", l);
                A0f.Cht();
            }
        }
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, double d, int i, int i2) {
        long j;
        Long l;
        Long A0k;
        AbstractC167027dH.A12(userSession, interfaceC11380iw, str);
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        String A06 = C38801rC.A06(str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_threads_in_reels_unit_gesture");
        if (A0f.isSampled()) {
            C14360o3.A0B(A06, 0);
            Long A0k2 = AbstractC003100w.A0k(10, A06);
            if (A0k2 != null) {
                A0f.AAP("container_module", interfaceC11380iw.getModuleName());
                A0f.A9K("media_id", A0k2);
                AbstractC25225BEi.A1N(A0f, AbstractC25234BEr.A0f(A0f, i, i2));
                A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                A0f.A8I("duration", Double.valueOf(d));
                if (str3 != null && (A0k = AbstractC003100w.A0k(10, str3)) != null) {
                    j = A0k.longValue();
                } else {
                    j = 0;
                }
                A0f.A9K("netego_id", Long.valueOf(j));
                if (str4 != null) {
                    l = AbstractC003100w.A0k(10, str4);
                } else {
                    l = null;
                }
                A0f.A9K("quick_promotion_id", l);
                A0f.Cht();
            }
        }
    }
}
