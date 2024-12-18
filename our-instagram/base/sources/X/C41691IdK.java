package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import java.util.HashMap;

/* renamed from: X.IdK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41691IdK {
    public final Context A00;
    public final C61972ry A01;
    public final UserSession A02;
    public final C41234IMz A03;
    public final ShoppingTaggingFeedArguments A04;
    public final HashMap A05;
    public final InterfaceC06180Ui A06;
    public final HashMap A07;

    public C41691IdK(Context context, C61972ry c61972ry, UserSession userSession, C41234IMz c41234IMz, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        AbstractC25233BEq.A0x(3, userSession, shoppingTaggingFeedArguments, c41234IMz);
        this.A00 = context;
        this.A01 = c61972ry;
        this.A02 = userSession;
        this.A04 = shoppingTaggingFeedArguments;
        this.A03 = c41234IMz;
        this.A07 = AbstractC166987dD.A1G();
        this.A05 = AbstractC166987dD.A1G();
        this.A06 = C10M.A00(C05F.A00, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r0 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C05A A00(X.C41691IdK r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41691IdK.A00(X.IdK, java.lang.String):X.05A");
    }

    public static final void A01(C41691IdK c41691IdK, String str, InterfaceC16660sJ interfaceC16660sJ) {
        Object value = A00(c41691IdK, str).getValue();
        Object invoke = interfaceC16660sJ.invoke(value);
        if (!C14360o3.A0K(invoke, value)) {
            A00(c41691IdK, str).Egh(invoke);
        }
    }
}
