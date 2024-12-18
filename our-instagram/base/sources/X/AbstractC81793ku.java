package X;

import com.instagram.api.schemas.SMBPartnerType;

/* renamed from: X.3ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81793ku {
    public static final SMBPartnerType A00(String str) {
        SMBPartnerType sMBPartnerType = (SMBPartnerType) SMBPartnerType.A01.get(str);
        if (sMBPartnerType == null) {
            return SMBPartnerType.A0B;
        }
        return sMBPartnerType;
    }
}
