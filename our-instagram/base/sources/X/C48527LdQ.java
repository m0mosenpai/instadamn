package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LdQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48527LdQ implements InterfaceC25601Mq {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C48527LdQ(C49316LrA c49316LrA, int i, int i2) {
        this.A00 = i2;
        this.A02 = c49316LrA;
        this.A01 = i;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        String str;
        ArrayList arrayList;
        String str2;
        Context context;
        Resources resources;
        int i;
        Object[] objArr;
        String str3;
        String str4;
        int i2 = this.A00;
        AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
        C14360o3.A0B(abstractC24481Hr, 0);
        boolean A0D = abstractC24481Hr.A0D();
        if (i2 != 0) {
            if (A0D) {
                C49316LrA.A00((C49316LrA) this.A02);
                return null;
            }
            Object A07 = abstractC24481Hr.A07();
            C14360o3.A0A(A07);
            ClipInfo clipInfo = ((C47589Kzz) A07).A00;
            long j = clipInfo.A05 - clipInfo.A07;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(60L);
            C49316LrA c49316LrA = (C49316LrA) this.A02;
            if (j > millis) {
                UserSession userSession = c49316LrA.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36323831207439999L)) {
                    if (clipInfo.A05 - clipInfo.A07 <= timeUnit.toMillis(90L)) {
                        DirectShareTarget directShareTarget = c49316LrA.A03;
                        C7TM A00 = JX0.A00(userSession, directShareTarget);
                        Context context2 = c49316LrA.A00;
                        Object A072 = abstractC24481Hr.A07();
                        C14360o3.A0A(A072);
                        String str5 = ((C47589Kzz) A072).A01;
                        if (this.A01 == c49316LrA.A06.size() - 1) {
                            str4 = c49316LrA.A04;
                        } else {
                            str4 = null;
                        }
                        A00.EOi(context2, null, null, directShareTarget, clipInfo, null, null, str5, str4, "share_extension", null, null, null, c49316LrA.A07, false, false);
                        return null;
                    }
                    context = c49316LrA.A00;
                    resources = context.getResources();
                    i = 2131960473;
                    objArr = new Object[1];
                    str3 = "90";
                } else if (C18U.A06(c06090Tz, userSession, 36323831207505536L)) {
                    context = c49316LrA.A00;
                    resources = context.getResources();
                    i = 2131960473;
                    objArr = new Object[1];
                    str3 = "60";
                } else {
                    C49316LrA.A00(c49316LrA);
                    return null;
                }
                objArr[0] = str3;
                C9GR.A00(context, resources.getString(i, objArr), "direct_share_video_too_long", 0);
                return null;
            }
            UserSession userSession2 = c49316LrA.A01;
            DirectShareTarget directShareTarget2 = c49316LrA.A03;
            C7TM A002 = JX0.A00(userSession2, directShareTarget2);
            Context context3 = c49316LrA.A00;
            Object A073 = abstractC24481Hr.A07();
            C14360o3.A0A(A073);
            String str6 = ((C47589Kzz) A073).A01;
            if (this.A01 == c49316LrA.A06.size() - 1) {
                str2 = c49316LrA.A04;
            } else {
                str2 = null;
            }
            A002.EOi(context3, null, null, directShareTarget2, clipInfo, null, null, str6, str2, "share_extension", null, null, null, c49316LrA.A07, false, false);
            return null;
        }
        C49316LrA c49316LrA2 = (C49316LrA) this.A02;
        if (A0D) {
            Context context4 = c49316LrA2.A00;
            C9GR.A00(context4, context4.getResources().getString(2131960454), "direct_share_photo_failure", 0);
            C0w9.A04("DirectExternalMediaShareJob:PhotoShareFailure", "Unable to parse photo uri.", 1);
            return null;
        }
        UserSession userSession3 = c49316LrA2.A01;
        DirectShareTarget directShareTarget3 = c49316LrA2.A03;
        C7TM A003 = JX0.A00(userSession3, directShareTarget3);
        Context context5 = c49316LrA2.A00;
        Object A074 = abstractC24481Hr.A07();
        C14360o3.A0A(A074);
        C183978Ee c183978Ee = (C183978Ee) A074;
        if (this.A01 == c49316LrA2.A05.size() - 1 && ((arrayList = c49316LrA2.A06) == null || arrayList.isEmpty())) {
            str = c49316LrA2.A04;
        } else {
            str = null;
        }
        A003.EO0(context5, null, directShareTarget3, null, c183978Ee, str, "share_extension", null, c49316LrA2.A07);
        return null;
    }
}
