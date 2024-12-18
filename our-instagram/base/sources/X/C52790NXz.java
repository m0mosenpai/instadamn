package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.NXz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52790NXz extends AnonymousClass522 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52790NXz(C52577NNx c52577NNx, OUJ ouj, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A02 = c52577NNx;
        this.A03 = str;
        this.A01 = ouj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        Context context;
        UserSession userSession;
        String str;
        C2Fb c2Fb;
        boolean z;
        C35133Fea c35133Fea;
        Context context2;
        AbstractC12990ll A0o;
        String str2;
        switch (this.A00) {
            case 0:
                A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A02, C2Fb.A0e, "https://help.instagram.com/1695974997209192");
                A0y.A0S = this.A03;
                A0y.A0A();
                return;
            case 1:
                z = false;
                C14360o3.A0B(view, 0);
                c35133Fea = SimpleWebViewActivity.A02;
                context2 = (Context) this.A01;
                A0o = AbstractC166987dD.A0o(((EJS) this.A02).A03);
                str2 = "https://www.facebook.com/policies/other-policies/ais-terms";
                c35133Fea.A02(context2, A0o, new SimpleWebViewConfig((String) null, (String) null, z, z, z, z, z, true, z, z, true, z, z, z, this.A03, str2));
                return;
            case 2:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                str = this.A03;
                c2Fb = C2Fb.A1W;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, str);
                A0y.A0A();
                return;
            case 3:
                C70399WUb.A00(((C26311BkI) this.A02).A00).A0G(VG4.A0n, "learn_more_text");
                C14H A00 = C14H.A03.A00();
                Context context3 = (Context) this.A01;
                C12260kU.A0C(context3, A00.A04(context3, AbstractC25227BEk.A0B(this.A03)));
                return;
            case 4:
                C52577NNx c52577NNx = (C52577NNx) this.A02;
                Activity rootActivity = c52577NNx.getRootActivity();
                if (rootActivity == null) {
                    return;
                }
                String str3 = this.A03;
                OUJ ouj = (OUJ) this.A01;
                C55046OZv.A00.A01(rootActivity, c52577NNx.requireArguments(), c52577NNx, AbstractC51040Mgq.A00(c52577NNx.A09), c52577NNx, ouj, str3);
                return;
            case 5:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                str = this.A03;
                c2Fb = C2Fb.A0Y;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, str);
                A0y.A0A();
                return;
            case 6:
                C14360o3.A0B(view, 0);
                A0y = new C63397SjR((Context) this.A01, (UserSession) this.A02, C2Fb.A2Y, this.A03, false);
                A0y.A0A();
                return;
            default:
                z = false;
                C14360o3.A0B(view, 0);
                c35133Fea = SimpleWebViewActivity.A02;
                context2 = (Context) this.A01;
                A0o = AbstractC166987dD.A0o(((C38943HCs) this.A02).A03);
                str2 = "https://help.instagram.com/1146896693058557?ref=learn_more";
                c35133Fea.A02(context2, A0o, new SimpleWebViewConfig((String) null, (String) null, z, z, z, z, z, true, z, z, true, z, z, z, this.A03, str2));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52790NXz(FragmentActivity fragmentActivity, UserSession userSession, String str, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52790NXz(Context context, C38943HCs c38943HCs, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 7;
        this.A01 = context;
        this.A02 = c38943HCs;
        this.A03 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52790NXz(Context context, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52790NXz(Context context, EJS ejs, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = context;
        this.A02 = ejs;
        this.A03 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52790NXz(Context context, C26311BkI c26311BkI, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A02 = c26311BkI;
        this.A01 = context;
        this.A03 = str;
    }
}
