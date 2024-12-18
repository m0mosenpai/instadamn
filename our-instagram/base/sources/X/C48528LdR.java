package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LdR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48528LdR implements InterfaceC25601Mq {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48528LdR(C49316LrA c49316LrA, List list, int i) {
        this.A00 = i;
        this.A02 = c49316LrA;
        this.A01 = list;
    }

    @Override // X.InterfaceC25601Mq
    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        Object obj2;
        String str;
        C49316LrA c49316LrA;
        Context context;
        Resources resources;
        int i;
        Object[] objArr;
        String str2;
        AbstractC24481Hr abstractC24481Hr = (AbstractC24481Hr) obj;
        if (this.A00 != 0) {
            C14360o3.A0B(abstractC24481Hr, 0);
            obj2 = null;
            if (abstractC24481Hr.A0D()) {
                c49316LrA = (C49316LrA) this.A02;
            } else {
                C47589Kzz c47589Kzz = (C47589Kzz) abstractC24481Hr.A07();
                if (c47589Kzz != null) {
                    c49316LrA = (C49316LrA) this.A02;
                    List list = (List) this.A01;
                    ClipInfo clipInfo = c47589Kzz.A00;
                    long j = clipInfo.A05 - clipInfo.A07;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (j > timeUnit.toMillis(60L)) {
                        UserSession userSession = c49316LrA.A01;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession, 36323831207439999L)) {
                            if (clipInfo.A05 - clipInfo.A07 > timeUnit.toMillis(90L)) {
                                context = c49316LrA.A00;
                                resources = context.getResources();
                                i = 2131960473;
                                objArr = new Object[1];
                                str2 = "90";
                            }
                        } else if (C18U.A06(c06090Tz, userSession, 36323831207505536L)) {
                            context = c49316LrA.A00;
                            resources = context.getResources();
                            i = 2131960473;
                            objArr = new Object[1];
                            str2 = "60";
                        }
                        objArr[0] = str2;
                        C9GR.A00(context, resources.getString(i, objArr), "direct_share_video_too_long", 0);
                        return null;
                    }
                    list.add(new KQK(clipInfo, null, c47589Kzz.A01));
                    return null;
                }
            }
            C49316LrA.A00(c49316LrA);
        } else {
            C14360o3.A0B(abstractC24481Hr, 0);
            obj2 = null;
            if (abstractC24481Hr.A0D()) {
                Context context2 = ((C49316LrA) this.A02).A00;
                C9GR.A00(context2, context2.getResources().getString(2131960454), "direct_share_photo_failure", 0);
                return null;
            }
            C183978Ee c183978Ee = (C183978Ee) abstractC24481Hr.A07();
            if (c183978Ee != null) {
                C49316LrA c49316LrA2 = (C49316LrA) this.A02;
                List list2 = (List) this.A01;
                AbstractC224309vG A00 = AbstractC178007vZ.A00(null, c49316LrA2.A01, c183978Ee.A06(), true);
                MediaUploadMetadata A01 = c183978Ee.A01();
                if (A00 != null) {
                    str = A00.A03();
                } else {
                    str = null;
                }
                A01.A05 = str;
                MediaUploadMetadata A012 = c183978Ee.A01();
                String A06 = c183978Ee.A06();
                C14360o3.A0B(A06, 0);
                A012.A0A = C197098ne.A05(A06);
                list2.add(new KQJ(null, c183978Ee));
                return null;
            }
        }
        return obj2;
    }
}
