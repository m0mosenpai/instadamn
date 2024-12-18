package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* loaded from: classes5.dex */
public final class BQZ extends Handler {
    public final UserSession A00;
    public final boolean A01;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BQY bqy;
        C3x9 clipsMetadata;
        C84923qg A1V;
        String str;
        Boolean bool;
        C14360o3.A0B(message, 0);
        if (message.what == 0) {
            Object obj = message.obj;
            if ((obj instanceof BQY) && (bqy = (BQY) obj) != null) {
                if (!this.A01) {
                    Context context = bqy.A00;
                    int A02 = AbstractC25234BEr.A02(context);
                    for (C120985dq c120985dq : bqy.A02) {
                        C38321qM c38321qM = c120985dq.A02;
                        if (c38321qM != null && (A1V = c38321qM.A1V()) != null && (str = A1V.A0e) != null) {
                            UserSession userSession = bqy.A01;
                            boolean A03 = C25375BKs.A03(userSession, c38321qM);
                            if (str.length() > 0 && !A03) {
                                BOB bob = BOB.A00;
                                boolean CdW = c120985dq.CdW();
                                boolean A0I = c120985dq.A0I();
                                C38321qM c38321qM2 = c120985dq.A02;
                                if (c38321qM2 != null) {
                                    bool = Boolean.valueOf(c38321qM2.A5P());
                                } else {
                                    bool = null;
                                }
                                bob.A03(context, userSession, A1V, null, AnonymousClass341.A07, null, new SearchContext(null, null, null, null, null, null, null, null), bool, null, A02, CdW, A0I, false, false);
                            }
                        }
                    }
                }
                Context applicationContext = bqy.A00.getApplicationContext();
                for (C120985dq c120985dq2 : bqy.A02) {
                    C38321qM c38321qM3 = c120985dq2.A02;
                    if (c38321qM3 != null && (clipsMetadata = c38321qM3.A0C.getClipsMetadata()) != null && (clipsMetadata.BVc() != null || clipsMetadata.BZw() != null)) {
                        String A07 = AbstractC76643c9.A07(clipsMetadata);
                        String A06 = AbstractC76643c9.A06(clipsMetadata);
                        boolean A0D = AbstractC76643c9.A0D(clipsMetadata);
                        boolean A0E = AbstractC76643c9.A0E(clipsMetadata);
                        InterfaceC84033on AZi = clipsMetadata.AZi();
                        C206239Bg A00 = AbstractC76643c9.A00(clipsMetadata.BZw());
                        C38321qM c38321qM4 = c120985dq2.A02;
                        UserSession userSession2 = bqy.A01;
                        C92584Cs c92584Cs = new C92584Cs(A00, AZi, A07, A06, R.dimen.abc_text_size_menu_header_material, false, A0D, A0E, true, true, true, AbstractC76643c9.A0H(userSession2, c38321qM4), AbstractC92574Cr.A03(clipsMetadata), false);
                        Resources resources = applicationContext.getResources();
                        C14360o3.A07(resources);
                        SpannableStringBuilder A032 = C92604Cu.A03(resources, C92604Cu.A01(applicationContext, c92584Cs), C92604Cu.A00(applicationContext, c92584Cs), userSession2, c92584Cs, true);
                        BOW bow = (BOW) userSession2.A01(BOW.class, BPJ.A00);
                        int color = applicationContext.getColor(AbstractC53242c7.A0H(applicationContext, R.attr.igds_color_icon_on_media));
                        Integer num = C05F.A00;
                        Typeface typeface = Typeface.SANS_SERIF;
                        C14360o3.A08(typeface);
                        bow.A00(applicationContext, new JV1(AbstractC14710oj.A03(applicationContext, typeface, num), A032, R.dimen.abc_text_size_menu_header_material, color));
                    }
                }
                return;
            }
            return;
        }
        AbstractC166987dD.A1T(C18950wb.A01, AbstractC111324zv.A00(1356), 817900281);
    }

    public BQZ(Looper looper, UserSession userSession, boolean z) {
        super(looper);
        this.A01 = z;
        this.A00 = userSession;
    }
}
