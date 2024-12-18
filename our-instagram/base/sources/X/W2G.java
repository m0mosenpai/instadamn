package X;

import com.facebook.common.locale.LocaleMember;
import java.util.concurrent.ExecutionException;

/* loaded from: classes11.dex */
public final class W2G {
    public final C214189eI A02 = new C214189eI(new C200148tJ(), new C67780Uy5(this, 0));
    public final C214189eI A01 = new C214189eI(new C200148tJ(), new C67780Uy5(this, 1));
    public final InterfaceC216113n A00 = new C216213o(new T88(this, 1));

    public static LocaleMember A00(W2G w2g, String str) {
        try {
            return (LocaleMember) w2g.A01.A00.A02(str);
        } catch (ExecutionException e) {
            AbstractC63327Shb.A02(e);
            throw C00O.createAndThrow();
        }
    }
}
