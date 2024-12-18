package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.creation.video.ui.CamcorderBlinker;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.JhO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44272JhO {
    public C47Z A00;
    public Integer A01;
    public String A02 = "";
    public final Handler A03;
    public final UserSession A04;
    public final C44273JhP A05;
    public final C44274JhQ A06;
    public final CamcorderBlinker A07;
    public final C40121td A08;
    public final WeakReference A09;
    public final WeakReference A0A;

    public static void A00(C44272JhO c44272JhO) {
        if (c44272JhO.A00 == null) {
            try {
                AbstractC916948n.A0F();
            } catch (IllegalStateException unused) {
                return;
            }
        }
        C47Z A02 = AbstractC209399Nx.A02(AbstractC43593JPy.A0x());
        c44272JhO.A00 = A02;
        A02.A3w = AbstractC916948n.A0D(A02.A3w, 0, true);
        c44272JhO.A08.A0D(c44272JhO.A00);
        c44272JhO.A07.A05();
    }

    public final boolean A01() {
        C44275JhR c44275JhR = this.A06.A01;
        if (c44275JhR.A01() != null && c44275JhR.A01().A05 == C05F.A0C) {
            return true;
        }
        return false;
    }

    public C44272JhO(Context context, UserSession userSession, C44273JhP c44273JhP, MN4 mn4, MRD mrd, CamcorderBlinker camcorderBlinker) {
        C44274JhQ c44274JhQ = new C44274JhQ();
        this.A06 = c44274JhQ;
        this.A01 = C05F.A0N;
        this.A03 = new HandlerC44381JjK(Looper.getMainLooper(), this, 3);
        this.A09 = AbstractC25225BEi.A16(context);
        this.A04 = userSession;
        this.A0A = AbstractC25225BEi.A16(mn4);
        this.A08 = C40121td.A00(context, userSession);
        List list = c44274JhQ.A02;
        list.add(mrd);
        this.A07 = camcorderBlinker;
        list.add(camcorderBlinker);
        camcorderBlinker.setClipStackManager(c44274JhQ);
        this.A05 = c44273JhP;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323028048554864L);
        C44289Jhf c44289Jhf = new C44289Jhf(this, 3);
        if (A06) {
            C14120nc.A00().ATO(new KMA(context, c44289Jhf, this));
        } else {
            c44289Jhf.apply(Boolean.valueOf(context.getExternalFilesDir(null) != null));
        }
    }
}
