package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class GQV implements Runnable {
    public final /* synthetic */ C23476Aap A00;
    public final /* synthetic */ C3B7 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public GQV(C23476Aap c23476Aap, C3B7 c3b7, String str, List list) {
        this.A01 = c3b7;
        this.A00 = c23476Aap;
        this.A02 = str;
        this.A03 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C3B7 c3b7 = this.A01;
        final C23476Aap c23476Aap = this.A00;
        String str = this.A02;
        final List list = this.A03;
        if (c23476Aap != null) {
            UserSession userSession = c3b7.A03;
            int A01 = AbstractC31178DnM.A01(C06090Tz.A05, userSession, 36598966817983839L);
            if (A01 == 0) {
                c3b7.A04.A0D(false);
            } else if (A01 == 1) {
                c3b7.A04.A0D(true);
            } else if (A01 == 2) {
                AbstractC61242qm.A00(userSession).A0J(AbstractC202778xv.A00(), null, C05F.A0j);
            }
            if (C3B7.A01(c3b7, list) != null) {
                c23476Aap.A03(false, str);
                final Rect rect = new Rect();
                final InterfaceC72953Ov A012 = C3B7.A01(c3b7, list);
                if (A012 != null) {
                    C57982lB.A0B.A05(c3b7.A01, new Runnable() { // from class: X.GQn
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3B7 c3b72 = c3b7;
                            InterfaceC72953Ov interfaceC72953Ov = A012;
                            Rect rect2 = rect;
                            C23476Aap c23476Aap2 = c23476Aap;
                            List list2 = list;
                            interfaceC72953Ov.AeT().getGlobalVisibleRect(rect2);
                            c23476Aap2.A01(new RectF(rect2), new C34666FPb(c3b72, list2));
                        }
                    });
                    return;
                }
            }
            c23476Aap.A02(str);
            C3B7.A03(c3b7, list);
        }
    }
}
