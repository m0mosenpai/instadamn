package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5p6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127285p6 {
    public static void A01(UserSession userSession, C41181vS c41181vS, C3G4 c3g4, C73203Pv c73203Pv, boolean z) {
        Resources resources = c73203Pv.A07.getResources();
        View view = c73203Pv.A08;
        AbstractC13880nE.A0W(view, resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height));
        view.setAlpha(0.5f);
        if (C3P8.A01(userSession, c3g4)) {
            view.setVisibility(4);
            c73203Pv.A09.setVisibility(4);
            return;
        }
        if (z) {
            if (c3g4.A04 == C3G2.A1F && c41181vS != null && C18U.A06(C06090Tz.A05, userSession, 36325257136649144L)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
        } else {
            view.setVisibility(0);
            if (!C18U.A06(C06090Tz.A05, userSession, 36321988666533813L)) {
                return;
            }
        }
        c73203Pv.A09.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0166, code lost:
    
        if (X.C18U.A06(r11, r28, 36324222049726449L) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012d, code lost:
    
        if (r8.equals(r12) != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r26, X.InterfaceC11380iw r27, final com.instagram.common.session.UserSession r28, X.InterfaceC73233Pz r29, X.C41181vS r30, X.C3G4 r31, X.C3G4 r32, X.C129025sN r33, X.InterfaceC124075jM r34, X.C73203Pv r35, X.InterfaceC64002vL r36, java.lang.Integer r37, java.lang.String r38, java.util.List r39, int r40) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC127285p6.A00(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3Pz, X.1vS, X.3G4, X.3G4, X.5sN, X.5jM, X.3Pv, X.2vL, java.lang.Integer, java.lang.String, java.util.List, int):void");
    }
}
