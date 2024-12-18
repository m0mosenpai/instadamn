package X;

import android.os.SystemProperties;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0Jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03880Jd {
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final String[] A05;
    public String A00;
    public String A01;

    static {
        ArrayList arrayList = new ArrayList();
        A04 = arrayList;
        arrayList.add("msmnile");
        arrayList.add("trinket");
        arrayList.add("kona");
        arrayList.add("atoll");
        arrayList.add("lito");
        arrayList.add("bengal");
        arrayList.add("lahaina");
        arrayList.add("holi");
        arrayList.add("taro");
        arrayList.add("qm215");
        ArrayList arrayList2 = new ArrayList();
        A02 = arrayList2;
        arrayList2.add("tensor");
        arrayList2.add("gs201");
        ArrayList arrayList3 = new ArrayList();
        A03 = arrayList3;
        arrayList3.add("orlando");
        A05 = new String[]{"ro.soc.model", "ro.board.platform", "ro.mediatek.platform", "ro.mediatek.hardware"};
    }

    public C03880Jd() {
        String str;
        String str2;
        this.A01 = "others";
        this.A00 = "N/A";
        String[] strArr = A05;
        int i = 0;
        while (true) {
            str = SystemProperties.get(strArr[i]);
            if (str != null && !str.isEmpty()) {
                break;
            }
            i++;
            if (i >= 4) {
                if (str == null) {
                    return;
                }
            }
        }
        if (!str.isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (!lowerCase.startsWith("msm") && !lowerCase.startsWith("apq") && !lowerCase.startsWith("sdm") && !lowerCase.startsWith("sm") && !A04.contains(lowerCase)) {
                if (!lowerCase.startsWith("exynos") && !lowerCase.startsWith("universal") && !lowerCase.startsWith("erd") && !lowerCase.startsWith("s5e")) {
                    if (lowerCase.startsWith("mt")) {
                        str2 = "mediatek";
                    } else if (!lowerCase.startsWith("sc") && !lowerCase.startsWith("sp9") && !lowerCase.startsWith("sp7") && !lowerCase.startsWith("ums")) {
                        if (!lowerCase.startsWith("hi") && !lowerCase.startsWith("kirin") && !A03.contains(lowerCase)) {
                            if (lowerCase.startsWith(PublicKeyCredentialControllerUtility.JSON_KEY_RK)) {
                                str2 = "rockchip";
                            } else if (lowerCase.startsWith("bcm")) {
                                str2 = "broadcom";
                            } else if (!A02.contains(lowerCase) && !lowerCase.startsWith("tensor")) {
                                if (!lowerCase.startsWith("t6") && !lowerCase.startsWith("t3")) {
                                    if (lowerCase.startsWith("n4") || lowerCase.startsWith("n3")) {
                                        str2 = "intel";
                                    }
                                } else {
                                    str2 = "unisoc";
                                }
                            } else {
                                str2 = "google";
                            }
                        } else {
                            str2 = "hisilicon";
                        }
                    } else {
                        str2 = "spreadtrum";
                    }
                } else {
                    this.A01 = "samsung";
                    String str3 = SystemProperties.get("ro.chipname");
                    if (((str3 != null && !str3.isEmpty()) || (str3 = SystemProperties.get("ro.hardware.chipname")) != null) && !str3.isEmpty()) {
                        lowerCase = str3;
                    }
                }
                this.A00 = lowerCase;
            }
            str2 = "qualcomm";
            this.A01 = str2;
            this.A00 = lowerCase;
        }
    }
}
