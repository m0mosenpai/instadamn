package X;

/* loaded from: classes10.dex */
public final class SLM {
    public final /* synthetic */ TF8 A00;
    public final /* synthetic */ String A01;

    public SLM(TF8 tf8, String str) {
        this.A00 = tf8;
        this.A01 = str;
    }

    public final void A00(Integer num) {
        String str;
        AbstractC12990ll abstractC12990ll = this.A00.A01;
        switch (num.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "INTERNAL_UNRECOVERABLE";
                break;
            case 2:
                str = "INTERNAL_RECOVERABLE";
                break;
            case 3:
                str = "AM_DISABLED";
                break;
            case 4:
                str = "NOT_PRELOADED";
                break;
            case 5:
                str = "FEATURE_NOT_SUPPORTED";
                break;
            default:
                str = "NO_VALID_REFERRER";
                break;
        }
        String str2 = this.A01;
        String A11 = AnonymousClass001.A11("InstallReferrerRegistrar_OXYGEN_SDK_NO_REFERRER", " : ", "no referrer returned", " : ", str);
        String A10 = AbstractC58320PtC.A10(abstractC12990ll);
        C25531Mh A0J = AbstractC58320PtC.A0J(abstractC12990ll, A11);
        if (A10 != null) {
            A0J.A0R("pigeon_session_id", A10);
        }
        AbstractC58321PtD.A1G(A0J, str2, null);
    }
}
