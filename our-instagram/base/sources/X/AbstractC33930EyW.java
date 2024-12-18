package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EyW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33930EyW {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A03(0);
        List list = c6fw.A00;
        Object obj = list.get(1);
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(list, 3);
        InterfaceC103384lE A0t2 = AbstractC25228BEl.A0t(list, 4);
        InterfaceC103384lE A0t3 = AbstractC25228BEl.A0t(list, 5);
        try {
            C6BS c6bs = C6BS.A02;
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            C14360o3.A0B(A03, 0);
            android.net.Uri A01 = C6BX.A01(A03, true);
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            if (C1AD.A06(C06090Tz.A05, 18309501417828018L)) {
                if (OO1.A01(A01, AbstractC12220kQ.A02(A0W))) {
                    if (OO1.A00(A01)) {
                        throw new SecurityException("E2EE file path detected");
                    }
                } else {
                    throw new SecurityException("Invalid MimeType");
                }
            }
            C6BQ.A0E(c6fq, A0t3, new Object[0]);
            FL1 fl1 = new FL1(C6BQ.A04(c6fq), new FK9(c6fq, A0t, A0t2), A0W);
            String path = A01.getPath();
            path.getClass();
            obj.getClass();
            String str2 = (String) obj;
            C14360o3.A0B(str2, 1);
            C121275eQ c121275eQ = new C121275eQ(new TUS(fl1, path, str2, 2), (int) System.nanoTime());
            c121275eQ.A00 = new EZ9(fl1, 14);
            C1GJ.A03(c121275eQ);
            return null;
        } catch (SecurityException e) {
            C6BQ.A0E(c6fq, A0t2, e.getMessage());
            return null;
        }
    }
}
