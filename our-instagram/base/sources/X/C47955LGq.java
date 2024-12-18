package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LGq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47955LGq {
    public Bitmap A00;
    public Bitmap A01;
    public Integer A02;
    public final Context A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C40121td A06;

    public C47955LGq(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 3);
        this.A03 = context;
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A06 = C40121td.A0G.A01(context, userSession);
    }

    public static final String A00(C47955LGq c47955LGq) {
        ArrayList A05 = C25A.A00(c47955LGq.A05).A05(C05F.A15);
        C01T.A1D(A05, C50037M7a.A00);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            String str = AbstractC43592JPx.A0l(it).A33;
            if (str != null && str.length() != 0) {
                File A11 = AbstractC166987dD.A11(str);
                if (A11.exists() && A11.canRead()) {
                    return str;
                }
            }
        }
        return null;
    }

    public final void A01(Bitmap bitmap) {
        this.A00 = bitmap;
        if (bitmap != null) {
            this.A01 = BlurUtil.blur(bitmap, 0.3f, 25);
        }
        A02(null);
        ArrayList A05 = C25A.A00(this.A05).A05(C05F.A15);
        C01T.A1D(A05, C50037M7a.A00);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C47Z A0l = AbstractC43592JPx.A0l(it);
            if (A0l.A1f != EnumC915447k.A02) {
                this.A06.A0J(A0l.A35);
            }
        }
        C14120nc.A00().ATO(new C45707KLk(bitmap, this));
    }

    public final void A02(KFE kfe) {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            C65887Tvr c65887Tvr = new C65887Tvr(bitmap);
            new AsyncTaskC44378JjH(c65887Tvr, new C48111LRl(kfe, this)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, c65887Tvr.A02);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final boolean A03() {
        ImageUrl imageUrl;
        if (this.A00 != null) {
            return true;
        }
        InterfaceC223316m BW9 = AbstractC31171DnF.A0T(this.A05, C17060sy.A01).BW9();
        if (BW9 != null) {
            imageUrl = BW9.Aez();
        } else {
            imageUrl = null;
        }
        if (!AbstractC81033jX.A03(imageUrl)) {
            return true;
        }
        String A00 = A00(this);
        if (A00 != null && A00.length() != 0) {
            return true;
        }
        return false;
    }
}
