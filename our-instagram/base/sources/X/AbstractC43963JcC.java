package X;

import com.instagram.api.schemas.BizUserInboxState;

/* renamed from: X.JcC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43963JcC {
    public static final EnumC44025JdC A00(BizUserInboxState bizUserInboxState, EnumC44025JdC enumC44025JdC) {
        EnumC44025JdC enumC44025JdC2;
        EnumC44025JdC enumC44025JdC3;
        C14360o3.A0B(enumC44025JdC, 1);
        if (bizUserInboxState == BizUserInboxState.A06 && enumC44025JdC != EnumC44025JdC.A09) {
            return EnumC44025JdC.A0C;
        }
        if (bizUserInboxState == BizUserInboxState.A05 && enumC44025JdC != (enumC44025JdC3 = EnumC44025JdC.A0D) && enumC44025JdC != EnumC44025JdC.A0E) {
            return enumC44025JdC3;
        }
        if (bizUserInboxState != BizUserInboxState.A04 || enumC44025JdC == (enumC44025JdC2 = EnumC44025JdC.A0A) || enumC44025JdC == EnumC44025JdC.A0B) {
            return enumC44025JdC;
        }
        return enumC44025JdC2;
    }
}
