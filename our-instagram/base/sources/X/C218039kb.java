package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.9kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218039kb extends ACt {
    public int A00;
    public C88X A01;
    public final C88Y A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final UserSession A07;
    public final TargetViewSizeProvider A08;
    public final String A09;

    public static void A00(C5GJ c5gj, C218039kb c218039kb) {
        String str;
        C88X c88x = c218039kb.A01;
        c88x.getClass();
        List list = c88x.A0I;
        list.getClass();
        C101394gx c101394gx = (C101394gx) list.get(c218039kb.A00);
        String str2 = c101394gx.A0D;
        if (TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = str2;
        }
        C22914A8k c22914A8k = new C22914A8k(str, c218039kb.A03, InterfaceC1812882f.A00(c218039kb.A08) - (c218039kb.A05 * 2), c218039kb.A04);
        List A01 = AbstractC37865GlK.A01(c101394gx);
        InterfaceC101384gv interfaceC101384gv = (InterfaceC101384gv) A01.get(0);
        InterfaceC101384gv interfaceC101384gv2 = (InterfaceC101384gv) A01.get(1);
        Context context = c218039kb.A06;
        String A02 = AbstractC41657Ibp.A02(interfaceC101384gv);
        String A022 = AbstractC41657Ibp.A02(interfaceC101384gv2);
        float A00 = AbstractC13880nE.A00(context, AbstractC41657Ibp.A00(interfaceC101384gv));
        float A002 = AbstractC13880nE.A00(context, AbstractC41657Ibp.A00(interfaceC101384gv2));
        String A0w = AbstractC166997dE.A0w(A02);
        String A0w2 = AbstractC166997dE.A0w(A022);
        int A0A = AbstractC167017dG.A0A(context);
        int A07 = AbstractC167017dG.A07(context);
        int A0A2 = AbstractC167017dG.A0A(context);
        int A072 = AbstractC167017dG.A07(context);
        int A0D = AbstractC167017dG.A0D(context);
        int[] A1B = AbstractC167027dH.A1B(context, R.attr.igds_color_creation_tools_blue);
        int[] A1B2 = AbstractC167027dH.A1B(context, R.attr.igds_color_creation_tools_pink);
        C220789p2 c220789p2 = new C220789p2(context, AbstractC167017dG.A0S(context), c22914A8k, A0w, null, A0w2, A1B, A1B, A1B2, A1B2, A00, A002, A0A, AbstractC166997dE.A01(context), A0A2, A07, A072, A0D, context.getColor(R.color.grey_9), context.getColor(R.color.direct_dark_mode_composer_hint_text_color), false, false, false, true, false);
        if (TextUtils.isEmpty(str2)) {
            str2 = c218039kb.A09;
        }
        c220789p2.A0B(str2);
        c218039kb.A02.A0A(c220789p2, c5gj, C148276lx.A1F);
    }

    public C218039kb(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y) {
        this.A02 = c88y;
        this.A06 = context;
        this.A07 = userSession;
        this.A08 = targetViewSizeProvider;
        this.A09 = context.getString(2131969739);
        this.A03 = AbstractC167017dG.A08(context);
        this.A04 = AbstractC167017dG.A0E(context);
        this.A05 = AbstractC167017dG.A03(context);
    }
}
