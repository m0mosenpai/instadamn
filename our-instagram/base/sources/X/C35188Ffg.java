package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Ffg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35188Ffg {
    public static final C32345EMr A00(UserSession userSession, User user, EnumC33371Ep4 enumC33371Ep4, InterfaceC37142GYd interfaceC37142GYd, JSONObject jSONObject, boolean z) {
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt == null) {
            return null;
        }
        C32345EMr A01 = ((C34699FQk) c28151Xt.A00.getValue()).A01(userSession, user.Bhu(), enumC33371Ep4, user.getId(), user.getUsername(), jSONObject, false, z);
        A01.A03 = interfaceC37142GYd;
        return A01;
    }

    public static final void A01(Context context, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C18920wW c18920wW, UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, User user, InterfaceC37213GaO interfaceC37213GaO, EnumC33371Ep4 enumC33371Ep4, InterfaceC37142GYd interfaceC37142GYd, String str, String str2, JSONObject jSONObject, boolean z) {
        C18U.A06(C06090Tz.A05, userSession, 36321443205621192L);
        C3DN A01 = C3DN.A00.A01(context);
        if (AbstractC31172DnG.A01(AbstractC166987dD.A0x(userSession), "restrict_info_bottomsheet_shown_count") >= 1) {
            if (c189478aR != null && !z) {
                if (A01 != null) {
                    ((C3DP) A01).A0H = new GHI(context, enumC1579076z, enumC33464Eqz, c18920wW, userSession, user, interfaceC37213GaO, enumC33371Ep4, str, str2, jSONObject);
                    A01.A0B();
                    return;
                }
                return;
            }
            A02(context, enumC1579076z, enumC33464Eqz, c18920wW, userSession, c189478aR, c189448aO, user, interfaceC37213GaO, enumC33371Ep4, str, str2, jSONObject);
            return;
        }
        C32345EMr A00 = A00(userSession, user, enumC33371Ep4, interfaceC37142GYd, jSONObject, z);
        if (A00 == null) {
            return;
        }
        if (c189478aR != null && c189448aO != null && A01 != null && ((C3DP) A01).A0h) {
            c189448aO.A0T = A00;
            c189478aR.A0F(A00, c189448aO);
        } else {
            AbstractC31178DnM.A0l(context, A00, userSession, null);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Context r21, X.EnumC1579076z r22, X.EnumC33464Eqz r23, X.C18920wW r24, com.instagram.common.session.UserSession r25, X.C189478aR r26, X.C189448aO r27, com.instagram.user.model.User r28, X.InterfaceC37213GaO r29, X.EnumC33371Ep4 r30, java.lang.String r31, java.lang.String r32, org.json.JSONObject r33) {
        /*
            r4 = r21
            X.8hC r1 = X.AbstractC31171DnF.A0I(r4)
            r0 = 2131972533(0x7f1351b5, float:1.9582076E38)
            r11 = r28
            java.lang.String r0 = X.AbstractC31178DnM.A0c(r4, r11, r0)
            r1.A05 = r0
            r2 = 2131960994(0x7f1324a2, float:1.9558672E38)
            r15 = 4
            X.Fia r0 = new X.Fia
            r5 = r22
            r6 = r23
            r7 = r24
            r13 = r30
            r14 = r0
            r16 = r11
            r17 = r6
            r18 = r5
            r19 = r13
            r20 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1.A0J(r0, r2)
            r0 = 2131972530(0x7f1351b2, float:1.958207E38)
            X.Fiy r3 = new X.Fiy
            r8 = r25
            r9 = r26
            r10 = r27
            r12 = r29
            r14 = r33
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A0H(r3, r0)
            r0 = 9
            X.DialogInterfaceOnDismissListenerC35463FkK.A00(r1, r12, r0)
            int r0 = r13.ordinal()
            switch(r0) {
                case 1: goto L85;
                case 2: goto L6d;
                case 3: goto L5d;
                case 4: goto L51;
                case 5: goto L96;
                case 6: goto L51;
                case 7: goto L51;
                case 8: goto L51;
                case 9: goto L96;
                case 10: goto L59;
                case 11: goto L59;
                case 12: goto L51;
                case 13: goto L96;
                case 14: goto L96;
                case 15: goto L96;
                default: goto L51;
            }
        L51:
            java.lang.String r1 = "restrict_error"
            java.lang.String r0 = "Entry point not supported for optimistic restrict flow."
            X.C0w9.A03(r1, r0)
        L58:
            return
        L59:
            r2 = 2131972511(0x7f13519f, float:1.9582032E38)
            goto La2
        L5d:
            r2 = 2131972532(0x7f1351b4, float:1.9582074E38)
            java.lang.String r0 = r11.getUsername()
            X.AbstractC31177DnL.A0v(r4, r1, r0, r2)
            r3 = 2131972528(0x7f1351b0, float:1.9582066E38)
            r2 = 18
            goto L7c
        L6d:
            r2 = 2131972526(0x7f1351ae, float:1.9582062E38)
            java.lang.String r0 = r11.getUsername()
            X.AbstractC31177DnL.A0v(r4, r1, r0, r2)
            r3 = 2131972527(0x7f1351af, float:1.9582064E38)
            r2 = 17
        L7c:
            X.Fhu r0 = new X.Fhu
            r0.<init>(r12, r2)
            r1.A0I(r0, r3)
            goto La9
        L85:
            boolean r0 = X.AbstractC1337462f.A09(r8)
            if (r0 == 0) goto L8f
            r2 = 2131972505(0x7f135199, float:1.958202E38)
            goto La2
        L8f:
            r0 = 2131972529(0x7f1351b1, float:1.9582068E38)
            r1.A09(r0)
            goto La9
        L96:
            boolean r0 = X.AbstractC1337462f.A09(r8)
            r2 = 2131972531(0x7f1351b3, float:1.9582072E38)
            if (r0 == 0) goto La2
            r2 = 2131972506(0x7f13519a, float:1.9582021E38)
        La2:
            java.lang.String r0 = r11.getUsername()
            X.AbstractC31177DnL.A0v(r4, r1, r0, r2)
        La9:
            X.1Xt r25 = X.C28151Xt.A02
            if (r25 == 0) goto L58
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            r33 = 0
            if (r0 == 0) goto L58
            r0 = r4
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            if (r0 == 0) goto L58
            X.0ch r27 = X.AbstractC018607g.A00(r0)
            java.lang.String r30 = r11.getId()
            if (r14 == 0) goto Lc6
            java.lang.String r33 = r14.toString()
        Lc6:
            X.GJC r14 = new X.GJC
            r15 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r1
            r22 = r11
            r23 = r12
            r24 = r13
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r26 = r4
            r28 = r8
            r29 = r14
            r25.A03(r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35188Ffg.A02(android.content.Context, X.76z, X.Eqz, X.0wW, com.instagram.common.session.UserSession, X.8aR, X.8aO, com.instagram.user.model.User, X.GaO, X.Ep4, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }
}
