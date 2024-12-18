package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQJ {
    public boolean A00;
    public final Activity A01;
    public final Fragment A02;
    public final C22P A03;
    public final UserSession A04;
    public final String A05;

    public FQJ(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, String str) {
        C14360o3.A0B(activity, 1);
        this.A01 = activity;
        this.A04 = userSession;
        this.A03 = c22p;
        this.A05 = str;
        this.A02 = fragment;
        if (str != null) {
            this.A00 = C196218mC.A00(userSession);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r0 == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r10 = this;
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            X.22P r5 = r10.A03
            if (r5 == 0) goto Ld2
            java.lang.String r1 = r5.name()
            java.lang.String r0 = "CameraEntryPoint"
        Le:
            r2.put(r0, r1)
        L11:
            java.lang.String r6 = r10.A05
            if (r6 == 0) goto Lce
            X.Xdf r4 = X.EnumC72435Xdf.A0D
        L17:
            android.app.Activity r8 = r10.A01
            X.8hC r7 = X.AbstractC31171DnF.A0H(r8)
            r0 = 2131237418(0x7f081a2a, float:1.8091086E38)
            X.AbstractC31173DnH.A15(r8, r7, r0)
            if (r6 == 0) goto Lc9
            boolean r0 = r10.A00
            com.instagram.common.session.UserSession r9 = r10.A04
            X.0Tz r3 = X.C06090Tz.A06
            if (r0 == 0) goto Lc2
            r0 = 36876125347119193(0x8302a400020059, double:3.383948385531899E-306)
        L32:
            java.lang.String r1 = X.C18U.A04(r3, r9, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -169269864: goto Lab;
                case 87906535: goto Lb5;
                case 634559352: goto La1;
                default: goto L3d;
            }
        L3d:
            r1 = 2131971223(0x7f134c97, float:1.957942E38)
        L40:
            r7.A0A(r1)
            r0 = 2131969231(0x7f1344cf, float:1.957538E38)
            if (r6 == 0) goto L4b
            r0 = 2131974392(0x7f1358f8, float:1.9585847E38)
        L4b:
            r7.A09(r0)
            X.AbstractC31175DnJ.A1O(r7)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131969919(0x7f13477f, float:1.9576774E38)
            java.lang.String r3 = X.AbstractC166997dE.A0q(r1, r0)
            r1 = 14
            X.Fk7 r0 = new X.Fk7
            r0.<init>(r1, r2, r10, r4)
            r7.A0d(r0, r3)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131973082(0x7f1353da, float:1.958319E38)
            java.lang.String r3 = X.AbstractC166997dE.A0q(r1, r0)
            r1 = 15
            X.Fk7 r0 = new X.Fk7
            r0.<init>(r1, r2, r10, r4)
            r7.A0b(r0, r3)
            r3 = 3
            X.FhV r0 = new X.FhV
            r0.<init>(r3, r4, r10, r2)
            r7.A0C(r0)
            X.AbstractC166987dD.A1W(r7)
            if (r5 == 0) goto L90
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "CP_UPSELL_IG_STORY_CROSS_POSTING"
            X.AbstractC34218F7q.A00(r1, r0)
        L90:
            if (r6 == 0) goto L99
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "IG_FEED_CROSS_POSTING_UPSELL"
            X.AbstractC34218F7q.A00(r1, r0)
        L99:
            com.instagram.common.session.UserSession r1 = r10.A04
            java.lang.String r0 = "upsell_impressions"
            X.AbstractC35174FfR.A02(r4, r1, r0, r2, r3)
            return
        La1:
            java.lang.String r0 = "statement_consistency_use_same_info"
            boolean r0 = r1.equals(r0)
            r1 = 2131974394(0x7f1358fa, float:1.958585E38)
            goto Lbe
        Lab:
            java.lang.String r0 = "statement_consistency_keep_updated"
            boolean r0 = r1.equals(r0)
            r1 = 2131974393(0x7f1358f9, float:1.9585849E38)
            goto Lbe
        Lb5:
            java.lang.String r0 = "statement_recognition"
            boolean r0 = r1.equals(r0)
            r1 = 2131974395(0x7f1358fb, float:1.9585853E38)
        Lbe:
            if (r0 != 0) goto L40
            goto L3d
        Lc2:
            r0 = 36876262786203740(0x8302c40004005c, double:3.3840353025623896E-306)
            goto L32
        Lc9:
            r1 = 2131969232(0x7f1344d0, float:1.9575381E38)
            goto L40
        Lce:
            X.Xdf r4 = X.EnumC72435Xdf.A0M
            goto L17
        Ld2:
            java.lang.String r1 = r10.A05
            if (r1 == 0) goto L11
            java.lang.String r0 = "XPostFeedEntryPoint"
            r2.put(r0, r1)
            boolean r0 = r10.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "userHasAutoXpostFeedToFBEnabled"
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FQJ.A00():void");
    }
}
