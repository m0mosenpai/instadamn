package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;

/* renamed from: X.Eln, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33253Eln extends AnonymousClass772 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33253Eln(Context context, AbstractC12990ll abstractC12990ll, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = context;
        this.A02 = abstractC12990ll;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context;
        UserSession userSession;
        String A04;
        C2Fb c2Fb;
        C06090Tz c06090Tz;
        long j;
        C63397SjR A0y;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(view, 0);
                Context context2 = (Context) this.A01;
                SimpleWebViewActivity.A02.A02(context2, (AbstractC12990ll) this.A02, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, AbstractC166997dE.A0p(context2, 2131965052), AbstractC63260SgI.A01(context2, AbstractC111324zv.A00(437))));
                return;
            case 1:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                A04 = C18U.A04(C06090Tz.A05, userSession, 36883353779634688L);
                c2Fb = C2Fb.A3M;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, A04);
                A0y.A0A();
                return;
            case 2:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                c06090Tz = C06090Tz.A05;
                j = 36883353779569151L;
                A04 = C18U.A04(c06090Tz, userSession, j);
                c2Fb = C2Fb.A2t;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, A04);
                A0y.A0A();
                return;
            case 3:
                context = (Context) this.A01;
                userSession = (UserSession) this.A02;
                c06090Tz = C06090Tz.A05;
                j = 36883353779438077L;
                A04 = C18U.A04(c06090Tz, userSession, j);
                c2Fb = C2Fb.A2t;
                A0y = AbstractC25228BEl.A0y(context, userSession, c2Fb, A04);
                A0y.A0A();
                return;
            case 4:
                UserSession userSession2 = (UserSession) this.A02;
                C25531Mh A0H = AbstractC31172DnG.A0H(new C7F3(userSession2));
                if (AbstractC25226BEj.A1Z(A0H)) {
                    A0H.A0Z(34);
                    A0H.A0X(0);
                    A0H.A0R("selected_item", "ai_terms");
                    A0H.Cht();
                }
                A0y = AbstractC25228BEl.A0y((Context) this.A01, userSession2, C2Fb.A3M, C18U.A04(C06090Tz.A05, userSession2, 36888619407901495L));
                A0y.A0A();
                return;
            case 5:
                new C684436h((Activity) this.A01, (UserSession) this.A02).Cgk(EnumC33409Epg.DIRECT_INBOX_FILTER_NULL_SCREEN, false, false);
                return;
            case 6:
                AGM agm = (AGM) this.A02;
                User user = (User) this.A01;
                F3L.A00(agm.A04, agm.A05, agm.A06, MessagingUser.A00(user), AbstractC111324zv.A00(4311), null, false, false);
                return;
            case 7:
                ((View.OnClickListener) this.A02).onClick(view);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33253Eln(Context context, UserSession userSession, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.A01 = context;
                this.A02 = userSession;
                break;
            default:
                this.A02 = userSession;
                this.A01 = context;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33253Eln(View.OnClickListener onClickListener, EKE eke, Integer num) {
        super(num);
        this.A00 = 7;
        this.A01 = eke;
        this.A02 = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33253Eln(AGM agm, User user, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A02 = agm;
        this.A01 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33253Eln(FragmentActivity fragmentActivity, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
    }
}
