package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.W4n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70115W4n {
    public final float A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final C189478aR A04;
    public final User A05;
    public final C70155WDf A06;
    public final EnumC39619HeT A07;
    public final AbstractC71170Wp5 A08 = new C33313Eo8(this);
    public final EnumC65855TvH A09;
    public final VG2 A0A;
    public final XEG A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final HashMap A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public static Bundle A00(C70115W4n c70115W4n) {
        Bundle bundle = new Bundle();
        AbstractC31173DnH.A1C(bundle, c70115W4n.A03);
        bundle.putString("ReportingConstants.ARG_CONTENT_ID", c70115W4n.A0C);
        bundle.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", c70115W4n.A0H);
        bundle.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", c70115W4n.A0I);
        bundle.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", c70115W4n.A00);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.V0i, androidx.fragment.app.Fragment, X.2oe, X.51D] */
    public final void A01(DirectShareTarget directShareTarget, C67844UzI c67844UzI, boolean z, boolean z2) {
        ?? abstractC59962oe = new AbstractC59962oe();
        Bundle A00 = A00(this);
        A00.putBoolean(AbstractC111324zv.A00(56), z);
        A00.putString("ReportingConstants.ARG_EVIDENCE_PAGE_TYPE", "evidence_confirmation");
        A00.putString("ReportingConstants.ARG_CONTENT_ID", this.A0C);
        A00.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", this.A0H);
        A00.putBoolean("ReportingConstants.ARG_IS_SELF_VICTIM", z2);
        abstractC59962oe.setArguments(A00);
        User user = this.A05;
        abstractC59962oe.A0B = user;
        abstractC59962oe.A09 = directShareTarget;
        abstractC59962oe.A0E = this.A0B;
        C189478aR c189478aR = this.A04;
        abstractC59962oe.A07 = c189478aR;
        abstractC59962oe.A0F = c67844UzI;
        UserSession userSession = this.A03;
        C189448aO c189448aO = new C189448aO(userSession);
        Context context = this.A02;
        AbstractC167017dG.A1N(context, userSession);
        boolean A08 = AbstractC35261Fgv.A08(userSession, directShareTarget, user, z);
        int i = 2131962945;
        if (A08) {
            i = 2131962941;
        }
        String string = context.getString(i);
        C14360o3.A0A(string);
        c189448aO.A0d = string;
        AbstractC25225BEi.A1Q(c189448aO, this.A0I);
        c189448aO.A0T = abstractC59962oe;
        c189448aO.A03 = this.A00;
        c189478aR.A0E(abstractC59962oe, c189448aO);
    }

    public C70115W4n(Activity activity, Context context, UserSession userSession, C189478aR c189478aR, User user, EnumC39619HeT enumC39619HeT, EnumC65855TvH enumC65855TvH, VG2 vg2, XEG xeg, String str, String str2, String str3, String str4, HashMap hashMap, float f, boolean z, boolean z2, boolean z3) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = c189478aR;
        this.A05 = user;
        this.A0C = str;
        this.A0I = z;
        this.A00 = f;
        this.A0B = xeg;
        this.A0F = str2;
        this.A07 = enumC39619HeT;
        this.A09 = enumC65855TvH;
        this.A0A = vg2;
        this.A0E = str3;
        this.A0J = z2;
        this.A0H = z3;
        this.A0D = str4;
        this.A0G = hashMap;
        this.A01 = activity;
        this.A06 = new C70155WDf(enumC39619HeT, enumC65855TvH, vg2, str2);
    }
}
