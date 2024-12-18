package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public final class UQC extends C0T6 {
    public static final C69505Vpa A07 = new Object();
    public final int A00;
    public final InterfaceC103384lE A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQC) {
                UQC uqc = (UQC) obj;
                if (this.A02 != uqc.A02 || !C14360o3.A0K(this.A05, uqc.A05) || this.A06 != uqc.A06 || !C14360o3.A0K(this.A04, uqc.A04) || !C14360o3.A0K(this.A03, uqc.A03) || !C14360o3.A0K(this.A01, uqc.A01) || this.A00 != uqc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A02;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "MORE_HORIZONTAL_PANO";
                    break;
                case 2:
                    str = "NEXT";
                    break;
                case 3:
                    str = "SHARE";
                    break;
                case 4:
                    str = "INFO";
                    break;
                case 5:
                    str = "INSIGHTS";
                    break;
                case 6:
                    str = "DELETE";
                    break;
                case 7:
                    str = "CONVERT_TO_BUSINESS";
                    break;
                case 8:
                    str = "DONE";
                    break;
                case 9:
                    str = "ADD";
                    break;
                case 10:
                    str = "COMPOSE";
                    break;
                case 11:
                    str = "CAMERA";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "CREATE_PROMOTION";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "SAVE";
                    break;
                case 14:
                    str = "UNSAVE";
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "VIDEO_CALL";
                    break;
                case 16:
                    str = "AUDIO_CALL";
                    break;
                case 17:
                    str = "CANCEL";
                    break;
                case 18:
                    str = "MULTI_SELECT_ICON";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str = "BACK";
                    break;
                case 20:
                    str = AbstractC43591JPw.A00(272);
                    break;
                case 21:
                    str = "REPORT";
                    break;
                case 22:
                    str = "OVERFLOW_HORIZONTAL";
                    break;
                case 23:
                    str = "CART";
                    break;
                case 24:
                    str = "SETTINGS";
                    break;
                case 25:
                    str = "MAIL";
                    break;
                case 26:
                    str = "SLIDERS";
                    break;
                case 27:
                    str = "PAYMENTS";
                    break;
                case 28:
                    str = "QUESTIONS";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    str = "EDIT_LIST";
                    break;
                case 30:
                    str = "EDIT";
                    break;
                case 31:
                    str = "SEARCH";
                    break;
                case 32:
                    str = "CHANNEL_INBOX_DIRECTORY";
                    break;
                default:
                    str = "OVERFLOW";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int A0D = (((AbstractC167007dF.A0D(this.A06, ((hashCode * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
        InterfaceC103384lE interfaceC103384lE = this.A01;
        if (interfaceC103384lE != null) {
            i = interfaceC103384lE.hashCode();
        }
        return ((A0D + i) * 31) + this.A00;
    }

    public UQC(InterfaceC103384lE interfaceC103384lE, Integer num, String str, String str2, String str3, int i, boolean z) {
        this.A02 = num;
        this.A05 = str;
        this.A06 = z;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = interfaceC103384lE;
        this.A00 = i;
    }

    public UQC() {
        this(null, null, null, "regular", null, 0, true);
    }
}
