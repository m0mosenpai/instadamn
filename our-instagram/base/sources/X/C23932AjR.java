package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.AjR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23932AjR implements C74M {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C224149uy A02;
    public final /* synthetic */ String A03;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    @Override // X.C74M
    public final void onError(String str) {
    }

    public C23932AjR(Context context, UserSession userSession, C224149uy c224149uy, String str) {
        this.A02 = c224149uy;
        this.A03 = str;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        int A07;
        int A06;
        ImageUrl imageUrl;
        String A0R = AnonymousClass001.A0R("canvas_gifs_background__", this.A03);
        C148286ly A00 = C148286ly.A00(new SimpleImageUrl(str), A0R, A0R, xec.getWidth(), xec.getHeight(), 1.0f);
        C224149uy c224149uy = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A01;
        Resources resources = context.getResources();
        float f = A00.A01;
        float f2 = A00.A00;
        if (C57992lC.A03()) {
            A07 = AbstractC58002lE.A01(context).getWidth();
        } else {
            AbstractC12120kG.A07(AnonymousClass001.A0R("TargetViewSizeUtil", "#getDisplayWidth"), "TargetViewSizeProvider has not been initialized", null);
            A07 = AbstractC13880nE.A07(context);
        }
        if (C57992lC.A03()) {
            A06 = AbstractC58002lE.A01(context).getHeight();
        } else {
            AbstractC12120kG.A07(AnonymousClass001.A0R("TargetViewSizeUtil", "#getDisplayHeight"), "TargetViewSizeProvider has not been initialized", null);
            A06 = AbstractC13880nE.A06(context);
        }
        float f3 = A07;
        float f4 = A06;
        float f5 = f4 / f2;
        float f6 = f2 * (f3 / f);
        if (f6 >= f4) {
            f4 = f6;
        } else {
            f3 = f * f5;
        }
        ImageUrl imageUrl2 = A00.A0H;
        C14360o3.A07(imageUrl2);
        String str3 = A00.A0S;
        C14360o3.A07(str3);
        C148286ly c148286ly = A00.A0I;
        if (c148286ly != null) {
            imageUrl = c148286ly.A0H;
        } else {
            imageUrl = null;
        }
        ImageUrl imageUrl3 = imageUrl;
        C74P c74p = new C74P(context, userSession, imageUrl2, imageUrl3, null, C74U.A00(1.0f, (int) f3, (int) f4, -1), C05F.A01, str3, AbstractC166997dE.A0B(resources), context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), false);
        c224149uy.A01 = c74p;
        A5L a5l = c224149uy.A00;
        C8FC c8fc = new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, false, false, false, false, false, true, true, true, true, true, false, false);
        C218069ke c218069ke = a5l.A00;
        if (c218069ke.A04 && c218069ke.A06) {
            C88Y c88y = c218069ke.A0E;
            c88y.A0C(c74p, c8fc, true);
            c88y.A09(c218069ke.A0A);
        }
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }
}
