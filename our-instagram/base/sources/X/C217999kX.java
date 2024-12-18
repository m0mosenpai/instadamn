package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.9kX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217999kX extends ACt {
    public final Context A00;
    public final UserSession A01;
    public final C89F A02;
    public final TargetViewSizeProvider A03;
    public final C88Y A04;
    public final List A05;

    public C217999kX(Context context, UserSession userSession, C89F c89f, TargetViewSizeProvider targetViewSizeProvider, C88Y c88y, List list) {
        C14360o3.A0B(userSession, 3);
        AbstractC167017dG.A1S(targetViewSizeProvider, c89f);
        this.A04 = c88y;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = targetViewSizeProvider;
        this.A02 = c89f;
        this.A05 = list;
    }
}
