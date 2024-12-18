package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

/* renamed from: X.EZv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32671EZv extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32671EZv(Context context, UserSession userSession, String str, String str2, String str3, String str4, List list, List list2) {
        super(111, 4, false, false);
        this.A06 = list;
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A07 = list2;
        this.A02 = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable bitmapDrawable;
        boolean z;
        G9A g9a;
        ImageUrl imageUrl;
        Bitmap A0H;
        List list = this.A06;
        Bitmap bitmap = null;
        if (list != null) {
            C11T.A05(AbstractC43591JPw.A00(30));
            if (!list.isEmpty() && (imageUrl = (ImageUrl) AbstractC166987dD.A16(list)) != null && (A0H = C25821No.A00().A0H(imageUrl, AbstractC111324zv.A00(2244))) != null) {
                bitmap = C1NC.A05(A0H);
            }
        }
        boolean A0B = C2OG.A01().A0B();
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = this.A05;
        String str2 = this.A03;
        String str3 = this.A04;
        if (A0B) {
            List list2 = this.A07;
            String str4 = this.A02;
            Object obj = null;
            if (C14360o3.A0K(str4, "1545129")) {
                z = false;
            } else if (C14360o3.A0K(str4, "1545128")) {
                z = true;
            } else {
                if (bitmap == null) {
                    bitmapDrawable = context.getDrawable(R.drawable.instagram_direct_pano_outline_24);
                } else {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                }
                C34648FOf A00 = C35129FeW.A00(userSession.userId);
                A00.A0G = "direct_error_notification_type";
                A00.A0H = str;
                A00.A0E = str2;
                A00.A03 = PushChannelType.A09;
                Integer num = C05F.A01;
                num.getClass();
                A00.A0A = num;
                A00.A01 = bitmapDrawable;
                A00.A08 = new G8S(userSession, context, str3, 0);
                C35129FeW.A01(A00, C2OG.A01());
                return;
            }
            if (list2 != null) {
                obj = AbstractC001800i.A0J(list2);
            }
            String str5 = null;
            if (z && obj != null) {
                str5 = context.getString(2131962676);
                g9a = new G9A(6, obj, userSession);
            } else {
                g9a = null;
            }
            C146106i8 A0X = AbstractC31173DnH.A0X(str2);
            A0X.A06();
            if (str5 != null && g9a != null) {
                A0X.A0G = str5;
                A0X.A0A = g9a;
                A0X.A0L = true;
            }
            A0X.A07(R.drawable.instagram_info_pano_outline_24);
            A0X.A02();
            AbstractC31178DnM.A1S(A0X);
            return;
        }
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.instagram_direct_pano_outline_24);
        }
        Intent A03 = AbstractC31172DnG.A0l().A03(context, 67108864);
        if (str3 != null) {
            A03.setData(AbstractC31174DnI.A0B(AbstractC31175DnJ.A04("ig://direct_v2"), PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3));
        }
        XN9 xn9 = new XN9(context, C92I.A02(context, userSession, AbstractC43591JPw.A00(342)).A00);
        xn9.A0C(str);
        xn9.A0B(str2);
        xn9.A0D(str2);
        int i = R.drawable.notification_icon;
        int A0H2 = AbstractC53242c7.A0H(context, R.attr.defaultNotificationIcon);
        if (A0H2 != 0) {
            i = A0H2;
        }
        xn9.A04(i);
        xn9.A07(bitmap);
        xn9.A0E(true);
        Notification notification = xn9.A0A;
        notification.defaults = -1;
        notification.flags |= 1;
        xn9.A01 = AbstractC31173DnH.A02(context);
        notification.when = System.currentTimeMillis();
        C04750Mt c04750Mt = new C04750Mt();
        c04750Mt.A0A(A03);
        xn9.A0C = c04750Mt.A01(context, 0, 268435456);
        Notification A032 = xn9.A03();
        C14360o3.A07(A032);
        new C23821Ep(context).A00(AbstractC116145Nt.A00(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC162167Oa.A02(userSession.userId, str3, null)), 64278, A032);
    }
}
