package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;

/* renamed from: X.64K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64K {
    public static final C64K A02;
    public static final C64K A03;
    public static final C64K A04;
    public static final C64K A05;
    public static final C64K A06;
    public static final C64K A07;
    public static final C64K A08;
    public static final C64K A09;
    public static final C64K A0A;
    public final Integer A00;
    public final Integer A01;

    static {
        Integer num = C05F.A0j;
        Integer num2 = C05F.A00;
        A09 = new C64K(num, num2);
        Integer num3 = C05F.A01;
        A07 = new C64K(num, num3);
        Integer num4 = C05F.A0C;
        A08 = new C64K(num, num4);
        Integer num5 = C05F.A0Y;
        Integer num6 = C05F.A0N;
        A06 = new C64K(num5, num6);
        A05 = new C64K(num2, num6);
        A0A = new C64K(num6, num6);
        A02 = new C64K(num3, num6);
        A04 = new C64K(C05F.A0u, num6);
        A03 = new C64K(num4, num6);
    }

    public final String toString() {
        String str;
        String A00;
        switch (this.A00.intValue()) {
            case 0:
                str = "ALREADY_LOGGED_IN";
                break;
            case 1:
                str = "INVALID";
                break;
            case 2:
                str = "MAILBOX_INVALID";
                break;
            case 3:
                str = "USING_MEM_LOGIN";
                break;
            case 4:
                str = "PREVIOUSLY_REGISTERED";
                break;
            case 5:
                str = "NEW_REGISTRATION_HAPPENED";
                break;
            default:
                str = MessageAvailabilityResponseId$Companion.NOT_SUPPORTED;
                break;
        }
        switch (this.A01.intValue()) {
            case 0:
                A00 = "SUCCESS";
                break;
            case 1:
                A00 = "FAILURE";
                break;
            case 2:
                A00 = AbstractC43591JPw.A00(118);
                break;
            default:
                A00 = "NOT_APPLICABLE";
                break;
        }
        return AnonymousClass001.A0u("loginType=", str, " registrationResult=", A00);
    }

    public C64K(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
