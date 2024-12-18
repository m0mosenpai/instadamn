package X;

import com.facebook.systrace.Systrace;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.1Mp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C25591Mp implements InterfaceC25601Mq {
    public final C222015v A00;
    public final C1EY A01;
    public final Class A02;
    public final boolean A03;

    @Override // X.InterfaceC25601Mq
    /* renamed from: A00 */
    public InterfaceC40801un then(C3JY c3jy) {
        InputStream inputStream;
        C14360o3.A0B(c3jy, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("parseHttpResponse", -2130374476);
        }
        InterfaceC26481Qd A00 = c3jy.A00();
        if (A00 != null) {
            inputStream = A00.AjT();
        } else {
            inputStream = null;
        }
        Class cls = this.A02;
        C222015v c222015v = this.A00;
        C1EY c1ey = this.A01;
        InterfaceC40801un A002 = C3L5.A00(c222015v, c3jy, c1ey, inputStream, cls, this.A03);
        if (A00 != null) {
            A00.AIH();
        }
        if (Systrace.A0E(1L)) {
            C0fO.A00(139503086);
        }
        c1ey.onFinish();
        return A002;
    }

    public C25591Mp(C222015v c222015v, C1EY c1ey, Class cls, boolean z) {
        this.A02 = cls;
        this.A00 = c222015v;
        this.A01 = c1ey;
        this.A03 = z;
    }

    public C25591Mp(C222015v c222015v, File file) {
        this(c222015v, new C25611Mr(file), C55702hA.class, false);
    }
}
