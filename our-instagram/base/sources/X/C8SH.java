package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.8SH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SH implements C1NJ {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final Map A04 = new HashMap();
    public final java.util.Set A05;
    public final ConcurrentMap A06;

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C1NJ
    public final void Cza(final InterfaceC59502nt interfaceC59502nt, final C73033Pe c73033Pe) {
        C11T.A02(new Runnable() { // from class: X.Ayc
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap;
                C8SH c8sh = this;
                InterfaceC59502nt interfaceC59502nt2 = interfaceC59502nt;
                C73033Pe c73033Pe2 = c73033Pe;
                Object C4x = interfaceC59502nt2.C4x();
                C4x.getClass();
                C195868lW c195868lW = (C195868lW) C4x;
                C219859nX c219859nX = (C219859nX) c8sh.A06.get(c195868lW.A07());
                if (c219859nX != null && c195868lW.equals(c219859nX.A00) && (bitmap = c73033Pe2.A01) != null) {
                    c219859nX.A0A.setImageBitmap(bitmap);
                }
            }
        });
    }

    @Override // X.C1NJ
    public final void DLP(final InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C11T.A02(new Runnable() { // from class: X.Awu
            @Override // java.lang.Runnable
            public final void run() {
                C8SH c8sh = this;
                Object C4x = interfaceC59502nt.C4x();
                C4x.getClass();
                C195868lW c195868lW = (C195868lW) C4x;
                C219859nX c219859nX = (C219859nX) c8sh.A06.get(c195868lW.A07());
                if (c219859nX != null) {
                    c195868lW.equals(c219859nX.A00);
                }
            }
        });
    }

    public C8SH(Context context, UserSession userSession, int i, int i2) {
        C18B c18b = new C18B();
        c18b.A03(20);
        c18b.A01();
        this.A06 = c18b.A00();
        this.A05 = new HashSet();
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = i;
        this.A00 = i2;
    }
}
