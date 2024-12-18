package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LKl {
    public static final LKl A00 = new Object();

    public static final C9CJ A00(InterfaceC129525tH interfaceC129525tH) {
        C9CJ c9cj = null;
        if (interfaceC129525tH instanceof C7SZ) {
            Iterator it = ((C7SZ) interfaceC129525tH).A04.iterator();
            while (it.hasNext()) {
                List list = KTK.A00(it).A0b;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c9cj = (C9CJ) ((C9CP) it2.next()).A01;
                    }
                }
            }
        }
        return c9cj;
    }

    public final void A03(Activity activity, PointF pointF, View view, UserSession userSession, InterfaceC129525tH interfaceC129525tH, InterfaceC164877Za interfaceC164877Za, InterfaceC164347Wx interfaceC164347Wx, InterfaceC165777b4 interfaceC165777b4, InterfaceC50433MOn interfaceC50433MOn, InterfaceC163937Vh interfaceC163937Vh, InterfaceC164997Zo interfaceC164997Zo, C3o9 c3o9, InterfaceC1119153d interfaceC1119153d, String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        AbstractC25229BEm.A1M(interfaceC163937Vh, 8, interfaceC164877Za);
        C49051Lmd c49051Lmd = C49051Lmd.A00;
        MessageIdentifier BSy = interfaceC129525tH.BSy();
        long micros = TimeUnit.MILLISECONDS.toMicros(interfaceC129525tH.BT8());
        C49086LnC c49086LnC = C49086LnC.A00;
        A02(activity, pointF, view, userSession, interfaceC129525tH, null, interfaceC164877Za, C49046LmY.A00, c49051Lmd, interfaceC164347Wx, C49078Ln4.A00, interfaceC165777b4, interfaceC50433MOn, c49086LnC, (C7XS) interfaceC164347Wx, interfaceC163937Vh, (InterfaceC163877Vb) interfaceC164347Wx, interfaceC164997Zo, interfaceC129525tH.Ar9(), BSy, c3o9, interfaceC1119153d, str, str2, str3, list, interfaceC129525tH.AuO(), list2, MG9.A00, micros, z, C98Q.A00(userSession).A00(JRE.A05(c3o9), 42), !z2);
    }

    public static final void A02(Activity activity, PointF pointF, View view, UserSession userSession, InterfaceC129525tH interfaceC129525tH, InterfaceC164937Zi interfaceC164937Zi, InterfaceC164877Za interfaceC164877Za, C7W6 c7w6, InterfaceC163887Vc interfaceC163887Vc, InterfaceC164347Wx interfaceC164347Wx, C7W7 c7w7, InterfaceC165777b4 interfaceC165777b4, InterfaceC50433MOn interfaceC50433MOn, InterfaceC165787b5 interfaceC165787b5, C7XS c7xs, InterfaceC163937Vh interfaceC163937Vh, InterfaceC163877Vb interfaceC163877Vb, InterfaceC164997Zo interfaceC164997Zo, C2EY c2ey, MessageIdentifier messageIdentifier, C3o9 c3o9, InterfaceC1119153d interfaceC1119153d, String str, String str2, String str3, List list, List list2, List list3, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z, boolean z2, boolean z3) {
        A01(activity, pointF, view, null, userSession, null, null, null, null, null, null, null, null, interfaceC129525tH, null, null, null, interfaceC164937Zi, interfaceC164877Za, c7w6, null, null, null, interfaceC163887Vc, null, null, null, interfaceC164347Wx, c7w7, null, null, interfaceC165777b4, interfaceC50433MOn, interfaceC165787b5, null, null, null, null, c7xs, null, interfaceC163937Vh, null, null, interfaceC163877Vb, null, null, interfaceC164997Zo, null, null, null, null, null, null, null, null, c2ey, messageIdentifier, c3o9, interfaceC1119153d, null, null, str, str2, null, null, null, str3, null, null, list, list2, list3, interfaceC16820sZ, 0, 0, j, false, z, z2, true, false, true, z3, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d4, code lost:
    
        if (r187 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.app.Activity r104, android.graphics.PointF r105, android.view.View r106, com.instagram.aistudio.logging.AiStudioLoggingData r107, com.instagram.common.session.UserSession r108, X.C47556KzR r109, X.L4A r110, X.L4A r111, X.L4A r112, X.L4A r113, X.L4A r114, X.L4A r115, X.L4A r116, X.InterfaceC129525tH r117, X.InterfaceC165257aE r118, X.InterfaceC165557ai r119, X.InterfaceC165577ak r120, X.InterfaceC164937Zi r121, X.InterfaceC164877Za r122, X.C7W6 r123, X.InterfaceC165097Zy r124, X.InterfaceC164907Zd r125, X.C7Ze r126, X.InterfaceC163887Vc r127, X.InterfaceC165017Zq r128, X.InterfaceC165427aV r129, X.InterfaceC165767b3 r130, X.InterfaceC164347Wx r131, X.C7W7 r132, X.InterfaceC165477aa r133, X.InterfaceC165127a1 r134, X.InterfaceC165777b4 r135, X.InterfaceC50433MOn r136, X.InterfaceC165787b5 r137, X.InterfaceC165797b6 r138, X.InterfaceC165807b7 r139, X.C7b9 r140, X.InterfaceC165177a6 r141, X.C7XS r142, X.InterfaceC165137a2 r143, X.InterfaceC163937Vh r144, X.InterfaceC165087Zx r145, X.InterfaceC165207a9 r146, X.InterfaceC163877Vb r147, X.InterfaceC165217aA r148, X.InterfaceC165227aB r149, X.InterfaceC164997Zo r150, X.C44995Jvl r151, X.C47651L2k r152, X.C47568Kze r153, X.L3U r154, X.C159497Dk r155, X.C159497Dk r156, X.L3V r157, X.C83403nh r158, X.C2EY r159, com.instagram.model.direct.messageid.MessageIdentifier r160, X.C3o9 r161, X.InterfaceC1119153d r162, java.lang.Boolean r163, java.lang.Long r164, java.lang.String r165, java.lang.String r166, java.lang.String r167, java.lang.String r168, java.lang.String r169, java.lang.String r170, java.lang.String r171, java.util.List r172, java.util.List r173, java.util.List r174, java.util.List r175, X.InterfaceC16820sZ r176, int r177, int r178, long r179, boolean r181, boolean r182, boolean r183, boolean r184, boolean r185, boolean r186, boolean r187, boolean r188, boolean r189, boolean r190) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKl.A01(android.app.Activity, android.graphics.PointF, android.view.View, com.instagram.aistudio.logging.AiStudioLoggingData, com.instagram.common.session.UserSession, X.KzR, X.L4A, X.L4A, X.L4A, X.L4A, X.L4A, X.L4A, X.L4A, X.5tH, X.7aE, X.7ai, X.7ak, X.7Zi, X.7Za, X.7W6, X.7Zy, X.7Zd, X.7Ze, X.7Vc, X.7Zq, X.7aV, X.7b3, X.7Wx, X.7W7, X.7aa, X.7a1, X.7b4, X.MOn, X.7b5, X.7b6, X.7b7, X.7b9, X.7a6, X.7XS, X.7a2, X.7Vh, X.7Zx, X.7a9, X.7Vb, X.7aA, X.7aB, X.7Zo, X.Jvl, X.L2k, X.Kze, X.L3U, X.7Dk, X.7Dk, X.L3V, X.3nh, X.2EY, com.instagram.model.direct.messageid.MessageIdentifier, X.3o9, X.53d, java.lang.Boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, X.0sZ, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04df  */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, com.instagram.monetization.impl.MonetizationFragmentFactoryImpl] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.app.Activity r38, android.view.View r39, com.instagram.common.session.UserSession r40, X.C47556KzR r41, X.L4A r42, X.L4A r43, X.L4A r44, X.L4A r45, X.L4A r46, X.L4A r47, X.L4A r48, X.InterfaceC129525tH r49, X.InterfaceC165257aE r50, X.InterfaceC165557ai r51, X.InterfaceC165577ak r52, X.InterfaceC164937Zi r53, X.InterfaceC165097Zy r54, X.InterfaceC164907Zd r55, X.C7Ze r56, X.InterfaceC165017Zq r57, X.InterfaceC165427aV r58, X.InterfaceC165767b3 r59, X.InterfaceC165477aa r60, X.InterfaceC165127a1 r61, X.InterfaceC165777b4 r62, X.InterfaceC50433MOn r63, X.InterfaceC165797b6 r64, X.InterfaceC165807b7 r65, X.C7b9 r66, X.InterfaceC165177a6 r67, X.InterfaceC165137a2 r68, X.InterfaceC165087Zx r69, X.InterfaceC165207a9 r70, X.InterfaceC165217aA r71, X.InterfaceC165227aB r72, X.InterfaceC164997Zo r73, X.C44995Jvl r74, X.C47651L2k r75, X.C47568Kze r76, X.L3U r77, X.C159497Dk r78, X.C159497Dk r79, X.L3V r80, X.C83403nh r81, X.C2EY r82, com.instagram.model.direct.messageid.MessageIdentifier r83, X.C3o9 r84, java.lang.Integer r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.util.List r89, X.InterfaceC16820sZ r90, int r91, long r92, boolean r94) {
        /*
            Method dump skipped, instructions count: 1980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKl.A04(android.app.Activity, android.view.View, com.instagram.common.session.UserSession, X.KzR, X.L4A, X.L4A, X.L4A, X.L4A, X.L4A, X.L4A, X.L4A, X.5tH, X.7aE, X.7ai, X.7ak, X.7Zi, X.7Zy, X.7Zd, X.7Ze, X.7Zq, X.7aV, X.7b3, X.7aa, X.7a1, X.7b4, X.MOn, X.7b6, X.7b7, X.7b9, X.7a6, X.7a2, X.7Zx, X.7a9, X.7aA, X.7aB, X.7Zo, X.Jvl, X.L2k, X.Kze, X.L3U, X.7Dk, X.7Dk, X.L3V, X.3nh, X.2EY, com.instagram.model.direct.messageid.MessageIdentifier, X.3o9, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.0sZ, int, long, boolean):void");
    }
}
