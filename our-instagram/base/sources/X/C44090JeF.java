package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.JeF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44090JeF implements InterfaceC018507f {
    public final /* synthetic */ C43868JaY A00;

    public C44090JeF(C43868JaY c43868JaY) {
        this.A00 = c43868JaY;
    }

    @Override // X.InterfaceC018507f
    public final AbstractC019307n D8C(Bundle bundle, int i) {
        android.net.Uri uri;
        C43868JaY c43868JaY = this.A00;
        UserSession userSession = c43868JaY.A0B;
        Context context = c43868JaY.A09;
        C43869JaZ c43869JaZ = c43868JaY.A03;
        android.net.Uri uri2 = null;
        if (c43869JaZ != null) {
            uri = c43869JaZ.A01;
        } else {
            uri = null;
        }
        C14360o3.A0A(uri);
        C43869JaZ c43869JaZ2 = c43868JaY.A03;
        if (c43869JaZ2 != null) {
            uri2 = c43869JaZ2.A02;
        }
        return new C44095JeK(context, uri, uri2, userSession);
    }

    @Override // X.InterfaceC018507f
    public final /* bridge */ /* synthetic */ void DPn(AbstractC019307n abstractC019307n, Object obj) {
        String Avl;
        InterfaceC197178nn interfaceC197178nn;
        InterfaceC197178nn interfaceC197178nn2;
        final String Avl2;
        C44262Jh8 c44262Jh8 = (C44262Jh8) obj;
        C14360o3.A0B(c44262Jh8, 1);
        C43868JaY c43868JaY = this.A00;
        InterfaceC197178nn interfaceC197178nn3 = c43868JaY.A05;
        if (interfaceC197178nn3 != null && (interfaceC197178nn = c44262Jh8.A02) != null && !AbstractC50102Ry.A00(interfaceC197178nn3.Avl(), interfaceC197178nn.Avl()) && (interfaceC197178nn2 = c43868JaY.A05) != null && (Avl2 = interfaceC197178nn2.Avl()) != null) {
            c43868JaY.A0C.ATO(new AbstractRunnableC14200nk() { // from class: X.9iX
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(494, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC197538oP.A00.A01(Avl2);
                }
            });
        }
        InterfaceC197178nn interfaceC197178nn4 = c44262Jh8.A02;
        c43868JaY.A05 = interfaceC197178nn4;
        c43868JaY.A04 = c44262Jh8.A01;
        c43868JaY.A00 = c44262Jh8.A00;
        c43868JaY.A06 = true;
        if (interfaceC197178nn4 != null && (Avl = interfaceC197178nn4.Avl()) != null) {
            C85K.A00(c43868JaY.A09, c43868JaY.A0B).A01(Avl, C50700MZv.A00, interfaceC197178nn4.getWidth(), interfaceC197178nn4.getHeight(), interfaceC197178nn4.AwT());
        }
        c43868JaY.A0A.post(new RunnableC44089JeE(c43868JaY));
    }
}
