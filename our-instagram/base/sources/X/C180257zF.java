package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;

/* renamed from: X.7zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180257zF {
    public static final C180257zF A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r4 == 1) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.C23031Ai r10) {
        /*
            r7 = this;
            r5 = 2
            X.C14360o3.A0B(r10, r5)
            X.7oB r0 = X.C173597oB.A00
            java.lang.Integer r0 = r0.A00(r8)
            int r4 = r0.intValue()
            X.0xq r6 = r10.A01
            java.lang.String r2 = "story_camera_lockscreen_shortcut_status"
            r1 = 0
            int r0 = r6.getInt(r2, r1)
            if (r4 == r1) goto L1c
            r3 = 1
            if (r4 != r3) goto L22
        L1c:
            if (r0 == r1) goto L21
            r3 = 1
            if (r0 != r3) goto L22
        L21:
            return
        L22:
            if (r4 == r0) goto L21
            X.0xo r0 = r6.ARD()
            r0.E7D(r2, r4)
            r0.apply()
            X.OTM r1 = X.A1G.A00(r8, r9)
            boolean r0 = X.OTM.A00(r1)
            if (r0 == 0) goto L21
            X.0do r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            X.0wW r2 = (X.C18920wW) r2
            java.lang.String r1 = "ig_lock_screen_shortcuts"
            X.0kM r0 = r2.A00
            X.0Ai r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L21
            if (r4 == r3) goto L63
            if (r4 == r5) goto L60
            r0 = 3
            if (r4 != r0) goto L21
            java.lang.String r1 = "lss_status_updated_to_right"
        L57:
            java.lang.String r0 = "action"
            r2.AAP(r0, r1)
            r2.Cht()
            return
        L60:
            java.lang.String r1 = "lss_status_updated_to_left"
            goto L57
        L63:
            java.lang.String r1 = "lss_status_cleared"
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180257zF.A00(android.content.Context, com.instagram.common.session.UserSession, X.1Ai):void");
    }

    public final void A01(UserSession userSession, Context context, boolean z) {
        String str;
        C14360o3.A0B(userSession, 1);
        if (AbstractC172747mk.A00(context, userSession).A00()) {
            boolean booleanValue = ((Boolean) AbstractC172747mk.A00(context, userSession).A04.getValue()).booleanValue();
            String A002 = MSV.A00(1068);
            if (booleanValue) {
                str = "com.instagram.lockscreen.LockScreenShortcutActivity";
            } else {
                if (!((Boolean) AbstractC172747mk.A00(context, userSession).A05.getValue()).booleanValue()) {
                    return;
                }
                AbstractC14490oL.A08(context, A002, true);
                str = A002;
            }
            Intent intent = new Intent();
            intent.setAction("com.samsung.dressroom.intent.action.SHOW_LOCK_SHORTCUT_PICKER");
            Intent intent2 = new Intent();
            intent2.setAction("com.samsung.dressroom.intent.action.SHOW_LOCK_SHORTCUT_PICKER");
            if (context.getApplicationContext().getPackageManager().resolveActivity(intent2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != null) {
                if (((Boolean) AbstractC172747mk.A00(context, userSession).A05.getValue()).booleanValue()) {
                    userSession.A01(C56129Ovp.class, new C57259Pbh(A002, context, 4));
                }
                intent.putExtra("launch_from", context.getApplicationContext().getPackageName());
                intent.putExtra("pre_selected_activity", str);
                intent.putExtra("shortcut_left_icon", z);
                C0b3.A00().A0A().A0G(context, intent);
            }
        }
    }

    public final boolean A02(Context context, UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 2);
        if (!AbstractC172747mk.A00(context, userSession).A00()) {
            return false;
        }
        A00(context, userSession, c23031Ai);
        Integer A002 = C173597oB.A00.A00(context);
        if (A002 != C05F.A0C && A002 != C05F.A0N) {
            return false;
        }
        return true;
    }
}
