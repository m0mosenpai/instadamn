package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AkW implements MQE {
    public final Context A00;
    public final UserSession A01;

    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        String str4;
        C47Z c47z = oxd.A0C;
        MediaUploadMetadata mediaUploadMetadata = c47z.A13;
        String str5 = null;
        if (mediaUploadMetadata.A03 != null) {
            String str6 = mediaUploadMetadata.A0A;
            if (str6 == null || str6.length() == 0) {
                int ordinal = c47z.A1G.ordinal();
                String str7 = "";
                if (ordinal != 1) {
                    if (ordinal == 0 && (str3 = c47z.A3L) != null) {
                        str7 = C197098ne.A05(str3);
                    }
                } else {
                    ClipInfo clipInfo = (ClipInfo) AbstractC001800i.A0J(c47z.A4G);
                    if (clipInfo != null && (str2 = clipInfo.A0F) != null && !clipInfo.A0O) {
                        str7 = AbstractC178007vZ.A03(str2);
                    }
                }
                mediaUploadMetadata.A0A = str7;
            }
            if (C14360o3.A0K(c47z.A13.A03, "com.facebook.hammerhead.story_camera")) {
                c47z.A13.A03 = "com.facebook.hammerhead";
            }
            MediaUploadMetadata mediaUploadMetadata2 = c47z.A13;
            if (mediaUploadMetadata2.A05 == null) {
                AbstractC224309vG A01 = AbstractC178007vZ.A01(this.A01, mediaUploadMetadata2.A03, C16930sl.A00);
                if (A01 != null) {
                    str5 = A01.A03();
                }
                mediaUploadMetadata2.A05 = str5;
            }
            String str8 = c47z.A13.A06;
            if ((str8 != null && AbstractC001900j.A0a(str8, "com.facebook.stella", false)) || ((str4 = c47z.A13.A06) != null && AbstractC001900j.A0a(str4, "com.facebook.mwa.ai", false))) {
                c47z.A0K = 110;
            }
            return NRK.A00;
        }
        try {
            int ordinal2 = c47z.A1G.ordinal();
            String str9 = "";
            if (ordinal2 != 1) {
                if (ordinal2 != 0) {
                    return NRK.A00;
                }
                String str10 = c47z.A3L;
                if (str10 == null) {
                    return NRK.A00;
                }
                UserSession userSession = this.A01;
                HashMap hashMap = c47z.A44;
                if (hashMap != null) {
                    obj = hashMap.get("maker_note");
                } else {
                    obj = null;
                }
                String str11 = (String) obj;
                if (hashMap != null) {
                    obj2 = hashMap.get("image_description");
                } else {
                    obj2 = null;
                }
                String str12 = (String) obj2;
                if (hashMap != null) {
                    obj3 = hashMap.get(AbstractC111324zv.A00(776));
                } else {
                    obj3 = null;
                }
                String[] strArr = {str11, str12, (String) obj3};
                C14360o3.A0B(strArr, 0);
                AbstractC224309vG A012 = AbstractC178007vZ.A01(userSession, "", AbstractC009903n.A0I(strArr));
                MediaUploadMetadata mediaUploadMetadata3 = c47z.A13;
                if (A012 != null) {
                    str9 = A012.A02();
                }
                mediaUploadMetadata3.A03 = str9;
                if (A012 instanceof C221679qW) {
                    c47z.A0d(EnumC223259tC.A0W);
                }
                MediaUploadMetadata mediaUploadMetadata4 = c47z.A13;
                if (mediaUploadMetadata4.A0A == null) {
                    mediaUploadMetadata4.A0A = C197098ne.A05(str10);
                }
                MediaUploadMetadata mediaUploadMetadata5 = c47z.A13;
                if (mediaUploadMetadata5.A05 == null) {
                    if (A012 != null) {
                        str5 = A012.A03();
                    }
                    mediaUploadMetadata5.A05 = str5;
                }
                return NRL.A00;
            }
            ClipInfo clipInfo2 = (ClipInfo) AbstractC001800i.A0J(c47z.A4G);
            if (clipInfo2 != null && (str = clipInfo2.A0F) != null && !clipInfo2.A0O) {
                AbstractC224309vG A00 = AbstractC178007vZ.A00(this.A00, this.A01, str, false);
                MediaUploadMetadata mediaUploadMetadata6 = c47z.A13;
                if (A00 != null) {
                    str9 = A00.A02();
                }
                mediaUploadMetadata6.A03 = str9;
                if (A00 instanceof C221679qW) {
                    c47z.A0d(EnumC223259tC.A0W);
                }
                MediaUploadMetadata mediaUploadMetadata7 = c47z.A13;
                if (mediaUploadMetadata7.A0A == null) {
                    mediaUploadMetadata7.A0A = AbstractC178007vZ.A03(str);
                }
                MediaUploadMetadata mediaUploadMetadata8 = c47z.A13;
                if (mediaUploadMetadata8.A05 == null) {
                    if (A00 != null) {
                        str5 = A00.A03();
                    }
                    mediaUploadMetadata8.A05 = str5;
                }
                return NRL.A00;
            }
            return NRK.A00;
        } catch (Exception e) {
            C0K8.A0F("PendingMediaAppAttributionStepException", MSV.A00(1153), e);
            return NRK.A00;
        }
    }

    @Override // X.MQE
    public final String getName() {
        return "PendingMediaAppAttribution";
    }

    public AkW(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
