package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;

/* renamed from: X.7q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174677q1 extends C174647py {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.7q2] */
    public C174677q1(Context context, EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, InterfaceC174637px interfaceC174637px, UserSession userSession) {
        super(new Object(), enumC174667q0, enumC174667q02, interfaceC174637px, false, true, false);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A00 = applicationContext;
        this.A01 = userSession;
        A00(InterfaceC174657pz.A06, true);
        A00(InterfaceC174657pz.A03, true);
    }

    @Override // X.C174647py, X.InterfaceC174657pz
    public final Object AXQ(C7q3 c7q3) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        UserSession userSession2;
        C06090Tz c06090Tz2;
        long j2;
        C14360o3.A0B(c7q3, 0);
        int i = c7q3.A00;
        if (i != 10) {
            if (i != 14) {
                if (i != 16) {
                    if (i != 31) {
                        if (i != 33) {
                            if (i != 43) {
                                if (i != 46) {
                                    switch (i) {
                                        case 27:
                                            userSession2 = this.A01;
                                            C14360o3.A0B(userSession2, 0);
                                            c06090Tz2 = C06090Tz.A05;
                                            j2 = 36599211625745883L;
                                            break;
                                        case 28:
                                            UserSession userSession3 = this.A01;
                                            C14360o3.A0B(userSession3, 0);
                                            return Long.valueOf((long) C18U.A00(C06090Tz.A05, userSession3, 37162161579098332L));
                                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                            userSession2 = this.A01;
                                            C14360o3.A0B(userSession2, 0);
                                            c06090Tz2 = C06090Tz.A05;
                                            j2 = 36599211625614810L;
                                            break;
                                        default:
                                            return super.AXQ(c7q3);
                                    }
                                    return Integer.valueOf((int) C18U.A01(c06090Tz2, userSession2, j2));
                                }
                                userSession = this.A01;
                                C14360o3.A0B(userSession, 0);
                                c06090Tz = C06090Tz.A05;
                                j = 36317736649299457L;
                            } else {
                                userSession = this.A01;
                                C14360o3.A0B(userSession, 0);
                                c06090Tz = C06090Tz.A05;
                                j = 36325974396122664L;
                            }
                        } else {
                            userSession = this.A01;
                            C14360o3.A0B(userSession, 0);
                            c06090Tz = C06090Tz.A05;
                            j = 36321623594247818L;
                        }
                    } else {
                        return true;
                    }
                } else {
                    userSession = this.A01;
                    C14360o3.A0B(userSession, 0);
                    c06090Tz = C06090Tz.A05;
                    j = 36317736648840702L;
                }
            } else {
                userSession = this.A01;
                C14360o3.A0B(userSession, 0);
                c06090Tz = C06090Tz.A05;
                j = 36317221252764618L;
            }
        } else {
            userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            c06090Tz = C06090Tz.A05;
            j = 36313141033830191L;
        }
        return Boolean.valueOf(C18U.A06(c06090Tz, userSession, j));
    }
}
