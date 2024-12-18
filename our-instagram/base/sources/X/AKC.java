package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.ClipInfo;

/* loaded from: classes4.dex */
public final class AKC {
    public static final void A00(Context context, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc, String str, String str2) {
        Long A0j;
        boolean A1a = AbstractC167017dG.A1a(context, userSession);
        C183978Ee c183978Ee = new C183978Ee();
        c183978Ee.A0D(str2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = A1a;
        BitmapFactory.decodeFile(str2, options);
        c183978Ee.A06 = options.outHeight;
        c183978Ee.A09 = options.outWidth;
        String str3 = c211689Zc.A06;
        if (str3 == null) {
            str3 = "replayable";
        }
        String str4 = c211689Zc.A01;
        if (str4 == null && (str4 = c211689Zc.A05) == null) {
            A0j = null;
        } else {
            A0j = AbstractC166997dE.A0j(str4);
        }
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        C42221xC EOl = AbstractC140396Wt.A01(userSession, interfaceC83713oG).EOl(interfaceC83713oG, c183978Ee, A0j, str3, null, c211689Zc.A07);
        C14360o3.A07(EOl);
        A49.A01.A02(EOl, new PKF(context, userSession, directShareTarget, str, A1a ? 1 : 0));
    }

    public final void A02(Context context, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc, C47Z c47z, String str) {
        AbstractC167017dG.A1N(context, userSession);
        ListenableFuture submit = A49.A00.submit(new B1P(5, c47z, userSession, context));
        C14360o3.A07(submit);
        C2OD.A03(new C23551Ac5(context, userSession, directShareTarget, c211689Zc, c47z, str), submit, C1M8.A01);
    }

    public static final void A01(Context context, UserSession userSession, DirectShareTarget directShareTarget, C211689Zc c211689Zc, String str, String str2) {
        long j;
        Long A0j;
        Long A0j2;
        AbstractC167017dG.A1N(context, userSession);
        C14360o3.A0B(str2, 3);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str2);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata != null && (A0j2 = AbstractC166997dE.A0j(extractMetadata)) != null) {
            j = A0j2.longValue();
        } else {
            j = 0;
        }
        ClipInfo A02 = MY3.A02(userSession, AbstractC166987dD.A11(str2), j);
        String str3 = c211689Zc.A06;
        if (str3 == null) {
            str3 = "replayable";
        }
        String str4 = c211689Zc.A01;
        if (str4 == null && (str4 = c211689Zc.A05) == null) {
            A0j = null;
        } else {
            A0j = AbstractC166997dE.A0j(str4);
        }
        InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
        interfaceC83713oG.getClass();
        C42221xC EOk = AbstractC140396Wt.A01(userSession, interfaceC83713oG).EOk(interfaceC83713oG, A02, A0j, str3, null);
        C14360o3.A07(EOk);
        A49.A01.A02(EOk, new C49796Lz3(context, str, 1));
    }
}
