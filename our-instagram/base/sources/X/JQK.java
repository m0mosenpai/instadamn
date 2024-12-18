package X;

import com.instagram.notifications.persistence.room.IgNotificationsDatabase;
import com.instagram.roomdb.IgDeviceScopedRoomDatabase;

/* loaded from: classes8.dex */
public final class JQK extends C01A {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JQK(java.lang.Object r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            r6.A00 = r8
            switch(r8) {
                case 0: goto L12;
                case 1: goto L19;
                case 2: goto L20;
                case 3: goto L27;
                case 4: goto L19;
                case 5: goto L2e;
                case 6: goto L35;
                case 7: goto L3c;
                case 8: goto L43;
                case 9: goto L43;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.4sY> r1 = X.C107274sY.class
            java.lang.String r3 = "database"
            java.lang.String r4 = "getDatabase()Lcom/instagram/notifications/persistence/room/IgNotificationsDatabase;"
        Lc:
            r5 = 0
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L12:
            java.lang.Class<X.9LN> r1 = X.C9LN.class
            java.lang.String r3 = "isInStory"
            java.lang.String r4 = "isInStory()Z"
            goto Lc
        L19:
            java.lang.Class<X.7Yf> r1 = X.C164667Yf.class
            java.lang.String r3 = "bannerController"
            java.lang.String r4 = "getBannerController()Lcom/instagram/direct/integrity/banner/DirectThreadBannerController;"
            goto Lc
        L20:
            java.lang.Class<X.7YU> r1 = X.C7YU.class
            java.lang.String r3 = "statusLogger"
            java.lang.String r4 = "getStatusLogger()Lcom/instagram/direct/messagethread/shhmode/logging/DirectThreadShhModeStatusLogger;"
            goto Lc
        L27:
            java.lang.Class<X.7Wi> r1 = X.C164197Wi.class
            java.lang.String r3 = "dmStatusProvider"
            java.lang.String r4 = "getDmStatusProvider()Lcom/instagram/direct/fragment/thread/specialmode/disappearingmode/DisappearingModeStatusProvider;"
            goto Lc
        L2e:
            java.lang.Class<X.7XQ> r1 = X.C7XQ.class
            java.lang.String r3 = "powerupsEffectsManager"
            java.lang.String r4 = "getPowerupsEffectsManager()Lcom/facebook/xac/powerups/PowerupsEffectsManager;"
            goto Lc
        L35:
            java.lang.Class<X.7XQ> r1 = X.C7XQ.class
            java.lang.String r3 = "directThreadNuxUpsellHelper"
            java.lang.String r4 = "getDirectThreadNuxUpsellHelper()Lcom/instagram/direct/fragment/thread/nux/DirectThreadNuxUpsellHelper;"
            goto Lc
        L3c:
            java.lang.Class<X.JR2> r1 = X.JR2.class
            java.lang.String r3 = "selectedMode"
            java.lang.String r4 = "getSelectedMode()Lcom/instagram/direct/model/DirectInboxMode;"
            goto Lc
        L43:
            java.lang.Class<X.LBj> r1 = X.C47842LBj.class
            java.lang.String r3 = "instance"
            java.lang.String r4 = "getInstance()Lcom/instagram/direct/deeplinking/DeeplinkPlugin;"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQK.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC016806n
    public final Object get() {
        IgDeviceScopedRoomDatabase igDeviceScopedRoomDatabase;
        String str;
        switch (this.A00) {
            case 0:
                return Boolean.valueOf(((C9LN) this.receiver).CWS());
            case 1:
            case 4:
                return ((C164667Yf) this.receiver).A02;
            case 2:
                C7LR c7lr = ((C7YU) this.receiver).A00;
                if (c7lr != null) {
                    return c7lr;
                }
                str = "statusLogger";
                break;
            case 3:
                C7IO c7io = ((C164197Wi) this.receiver).A04;
                if (c7io != null) {
                    return c7io;
                }
                str = "dmStatusProvider";
                break;
            case 5:
                return ((C7XQ) this.receiver).A00;
            case 6:
                C7L4 c7l4 = ((C7XQ) this.receiver).A04;
                if (c7l4 != null) {
                    return c7l4;
                }
                str = "directThreadNuxUpsellHelper";
                break;
            case 7:
                return ((JR2) this.receiver).A0t();
            case 8:
            case 9:
            default:
                return C47842LBj.A00();
            case 10:
                C109394wQ c109394wQ = IgNotificationsDatabase.A00;
                C18720vz c18720vz = AbstractC12960li.A00;
                Object A00 = c18720vz.A00(IgNotificationsDatabase.class);
                if (A00 != null) {
                    return A00;
                }
                synchronized (c109394wQ) {
                    igDeviceScopedRoomDatabase = (IgDeviceScopedRoomDatabase) c18720vz.A00(IgNotificationsDatabase.class);
                    if (igDeviceScopedRoomDatabase == null) {
                        C1Ye A002 = C1Yc.A00(c18720vz.A06(), IgNotificationsDatabase.class, "device_ig_notifications_db");
                        AbstractC28241Yh.A00(A002, 2112225451, 1621021914, true);
                        A002.A01();
                        igDeviceScopedRoomDatabase = (IgDeviceScopedRoomDatabase) A002.A00();
                        c18720vz.A04(IgNotificationsDatabase.class, igDeviceScopedRoomDatabase);
                    }
                }
                return igDeviceScopedRoomDatabase;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
