package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.4dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99634dg {
    public static final InterfaceC43583JMr A00(UserSession userSession, C41181vS c41181vS) {
        Integer num;
        C38321qM c38321qM;
        InterfaceC39541sb injected;
        InterfaceC104924o5 BVd;
        C14360o3.A0B(userSession, 1);
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36602475800695446L);
        if (Long.valueOf(A01) != null) {
            if (A01 == 1) {
                num = C05F.A01;
            } else if (A01 == 2) {
                num = C05F.A0C;
            }
            if (num != C05F.A00 || (c38321qM = c41181vS.A0b) == null || (injected = c38321qM.A0C.getInjected()) == null || (BVd = injected.BVd()) == null) {
                return null;
            }
            return BVd.BVT();
        }
        num = C05F.A00;
        return num != C05F.A00 ? null : null;
    }

    public static final String A02(UserSession userSession, MusicDataSource musicDataSource) {
        int i;
        C14360o3.A0B(userSession, 0);
        if (AbstractC677833s.A02(userSession)) {
            C14360o3.A0B(musicDataSource, 0);
            String str = musicDataSource.A03;
            if (str == null) {
                return "MusicPlayer";
            }
            return str;
        }
        C14360o3.A0B(musicDataSource, 0);
        android.net.Uri uri = musicDataSource.A00;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            String str2 = musicDataSource.A05;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
        }
        String hexString = Integer.toHexString(i);
        C14360o3.A07(hexString);
        return hexString;
    }

    public static final MusicDataSource A01(InterfaceC43583JMr interfaceC43583JMr) {
        return new MusicDataSource(null, AudioType.A03, interfaceC43583JMr.BiP(), null, interfaceC43583JMr.getId(), null);
    }
}
