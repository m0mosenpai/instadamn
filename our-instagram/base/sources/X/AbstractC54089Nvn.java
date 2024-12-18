package X;

/* renamed from: X.Nvn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54089Nvn {
    public static final void A00(C18920wW c18920wW, Integer num, Integer num2, String str, String str2, String str3) {
        String str4;
        String str5;
        AbstractC167017dG.A1P(str, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_original_pdq");
        if (A0f.isSampled()) {
            AbstractC37300Gc1.A0h(A0f, AbstractC25228BEl.A13(str));
            A0f.A9K("owner_id", AbstractC25228BEl.A13(str2));
            switch (num.intValue()) {
                case 0:
                    str4 = "original_hash_entrypoint";
                    break;
                case 1:
                    str4 = "original_hash_start";
                    break;
                case 2:
                    str4 = "original_hash_cancelled";
                    break;
                case 3:
                    str4 = "original_hash_pdq_cancelled";
                    break;
                case 4:
                    str4 = "original_hash_md5_cancelled";
                    break;
                case 5:
                    str4 = "original_hash_skipped";
                    break;
                case 6:
                    str4 = "original_hash_pdq_scheduled";
                    break;
                case 7:
                    str4 = "original_hash_md5_scheduled";
                    break;
                case 8:
                    str4 = "original_hash_pdq_generated";
                    break;
                case 9:
                    str4 = "original_hash_md5_generated";
                    break;
                case 10:
                    str4 = "original_hash_md5_partial_generated";
                    break;
                default:
                    str4 = "original_hash_sent";
                    break;
            }
            AbstractC31171DnF.A1A(A0f, str4);
            if (num2.intValue() != 0) {
                str5 = "ig_android_video";
            } else {
                str5 = "ig_android_image";
            }
            A0f.AAP("upload_location", str5);
            A0f.AAP("error_message", str3);
            A0f.Cht();
        }
    }
}
