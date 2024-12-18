package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.ui.VisibilityUpdateModifier;

/* renamed from: X.6Gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136476Gb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement, java.lang.Object, androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.instagram.barcelonaig.tixu.vpvd.VisibilityChangeElement, java.lang.Object, androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.6Gd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.instagram.barcelonaig.tixu.vpvd.VPVDElement, java.lang.Object, androidx.compose.ui.Modifier] */
    public static final Modifier A00(Modifier modifier, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        Modifier Eq3;
        Integer num;
        C14360o3.A0B(modifier, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC16620sF, 3);
        C14360o3.A0B(interfaceC16660sJ, 4);
        C14360o3.A0B(interfaceC16660sJ2, 5);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36326266455078698L);
        C1130158n c1130158n = Modifier.A00;
        if (A06) {
            if (C18U.A06(c06090Tz, userSession, 36326266455144235L)) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            C207409Ft c207409Ft = new C207409Ft(str, interfaceC16620sF, 5);
            C207429Fv c207429Fv = new C207429Fv(str, interfaceC16660sJ, 27);
            C207429Fv c207429Fv2 = new C207429Fv(str, interfaceC16660sJ2, 28);
            C14360o3.A0B(c1130158n, 0);
            Eq3 = new VisibilityUpdateModifier(num, c207429Fv, c207429Fv2, c207409Ft);
        } else {
            C14360o3.A0B(c1130158n, 0);
            ?? obj = new Object();
            obj.A00 = str;
            obj.A01 = interfaceC16620sF;
            C136486Gc c136486Gc = C136486Gc.A00;
            C206989Ed c206989Ed = new C206989Ed(interfaceC16660sJ, 33);
            C14360o3.A0B(obj, 0);
            C14360o3.A0B(c136486Gc, 2);
            ?? obj2 = new Object();
            obj2.A01 = str;
            obj2.A00 = c136486Gc;
            obj2.A02 = c206989Ed;
            Modifier Eq32 = obj.Eq3(obj2);
            ?? obj3 = new Object();
            C206989Ed c206989Ed2 = new C206989Ed(interfaceC16660sJ2, 34);
            C14360o3.A0B(Eq32, 0);
            ?? obj4 = new Object();
            obj4.A01 = str;
            obj4.A00 = obj3;
            obj4.A02 = c206989Ed2;
            Eq3 = Eq32.Eq3(obj4);
        }
        return modifier.Eq3(Eq3);
    }
}
