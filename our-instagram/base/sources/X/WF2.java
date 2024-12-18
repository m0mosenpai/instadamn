package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes11.dex */
public final class WF2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.String r2) {
        /*
            r1 = -1
            if (r2 == 0) goto La
            int r0 = r2.hashCode()
            switch(r0) {
                case -1039745817: goto L69;
                case 48625: goto L5e;
                case 49586: goto L53;
                case 50547: goto L48;
                case 51508: goto L45;
                case 52469: goto L3a;
                case 53430: goto L2f;
                case 54391: goto L24;
                case 55352: goto L19;
                case 56313: goto Le;
                case 3029637: goto Lb;
                default: goto La;
            }
        La:
            return r1
        Lb:
            java.lang.String r0 = "bold"
            goto L26
        Le:
            java.lang.String r0 = "900"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 900(0x384, float:1.261E-42)
            return r1
        L19:
            java.lang.String r0 = "800"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 800(0x320, float:1.121E-42)
            return r1
        L24:
            java.lang.String r0 = "700"
        L26:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 700(0x2bc, float:9.81E-43)
            return r1
        L2f:
            java.lang.String r0 = "600"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 600(0x258, float:8.41E-43)
            return r1
        L3a:
            java.lang.String r0 = "500"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 500(0x1f4, float:7.0E-43)
            return r1
        L45:
            java.lang.String r0 = "400"
            goto L6b
        L48:
            java.lang.String r0 = "300"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 300(0x12c, float:4.2E-43)
            return r1
        L53:
            java.lang.String r0 = "200"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 200(0xc8, float:2.8E-43)
            return r1
        L5e:
            java.lang.String r0 = "100"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 100
            return r1
        L69:
            java.lang.String r0 = "normal"
        L6b:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La
            r1 = 400(0x190, float:5.6E-43)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WF2.A01(java.lang.String):int");
    }

    public static Typeface A02(AssetManager assetManager, Typeface typeface, String str, int i, int i2) {
        int i3;
        Typeface create;
        boolean z = false;
        if (i == -1) {
            i = 0;
        } else if ((i & 2) != 0) {
            z = true;
        }
        if (i2 == -1) {
            int i4 = i & 1;
            i2 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
            if (i4 != 0) {
                i2 = 700;
            }
        }
        if (str == null) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
        } else {
            W2B w2b = W2B.A02;
            Map map = w2b.A00;
            if (map.containsKey(str)) {
                typeface = (Typeface) map.get(str);
            } else {
                Map map2 = w2b.A01;
                Object obj = map2.get(str);
                if (obj == null) {
                    obj = new C68687VaN();
                    map2.put(str, obj);
                }
                C68687VaN c68687VaN = (C68687VaN) obj;
                if (i2 < 700) {
                    i3 = 0;
                    if (z) {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                    if (z) {
                        i3 = 3;
                    }
                }
                SparseArray sparseArray = c68687VaN.A00;
                Typeface typeface2 = (Typeface) sparseArray.get(i3);
                if (typeface2 != null) {
                    return typeface2;
                }
                if (assetManager != null) {
                    String str2 = W2B.A03[i3];
                    String[] strArr = W2B.A04;
                    for (int i5 = 0; i5 < 2; i5++) {
                        try {
                            create = Typeface.createFromAsset(assetManager, AnonymousClass001.A0u("fonts/", str, str2, strArr[i5]));
                            C14360o3.A07(create);
                            break;
                        } catch (RuntimeException unused) {
                        }
                    }
                }
                create = Typeface.create(str, i3);
                C14360o3.A07(create);
                sparseArray.put(i3, create);
                return create;
            }
        }
        Typeface create2 = Typeface.create(typeface, i2, z);
        C14360o3.A0A(create2);
        return create2;
    }

    public static int A00(String str) {
        if (str != null) {
            if ("italic".equals(str)) {
                return 2;
            }
            if ("normal".equals(str)) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    public static String A03(ReadableArray readableArray) {
        String str;
        if (readableArray != null && readableArray.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readableArray.size(); i++) {
                String string = readableArray.getString(i);
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1983120972:
                            if (string.equals("stylistic-thirteen")) {
                                str = "'ss13'";
                                break;
                            } else {
                                break;
                            }
                        case -1933522176:
                            if (string.equals("stylistic-fifteen")) {
                                str = "'ss15'";
                                break;
                            } else {
                                break;
                            }
                        case -1534462052:
                            if (string.equals("stylistic-eighteen")) {
                                str = "'ss18'";
                                break;
                            } else {
                                break;
                            }
                        case -1195362251:
                            if (string.equals("proportional-nums")) {
                                str = "'pnum'";
                                break;
                            } else {
                                break;
                            }
                        case -1061392823:
                            if (string.equals("lining-nums")) {
                                str = "'lnum'";
                                break;
                            } else {
                                break;
                            }
                        case -899039099:
                            if (string.equals("historical-ligatures")) {
                                str = "'hlig'";
                                break;
                            } else {
                                break;
                            }
                        case -771984547:
                            if (string.equals("tabular-nums")) {
                                str = "'tnum'";
                                break;
                            } else {
                                break;
                            }
                        case -672279417:
                            if (string.equals("discretionary-ligatures")) {
                                str = "'dlig'";
                                break;
                            } else {
                                break;
                            }
                        case -659678800:
                            if (string.equals("oldstyle-nums")) {
                                str = "'onum'";
                                break;
                            } else {
                                break;
                            }
                        case 249095901:
                            if (string.equals("no-contextual")) {
                                str = "'calt' off";
                                break;
                            } else {
                                break;
                            }
                        case 273808209:
                            if (string.equals("contextual")) {
                                str = "'calt'";
                                break;
                            } else {
                                break;
                            }
                        case 289909490:
                            if (string.equals("no-common-ligatures")) {
                                arrayList.add("'liga' off");
                                str = "'clig' off";
                                break;
                            } else {
                                break;
                            }
                        case 296506098:
                            if (string.equals("stylistic-eight")) {
                                str = "'ss08'";
                                break;
                            } else {
                                break;
                            }
                        case 309330544:
                            if (string.equals("stylistic-seven")) {
                                str = "'ss07'";
                                break;
                            } else {
                                break;
                            }
                        case 310339585:
                            if (string.equals("stylistic-three")) {
                                str = "'ss03'";
                                break;
                            } else {
                                break;
                            }
                        case 604478526:
                            if (string.equals("stylistic-eleven")) {
                                str = "'ss11'";
                                break;
                            } else {
                                break;
                            }
                        case 915975441:
                            if (string.equals("no-historical-ligatures")) {
                                str = "'hlig' off";
                                break;
                            } else {
                                break;
                            }
                        case 979426287:
                            if (string.equals("stylistic-five")) {
                                str = "'ss05'";
                                break;
                            } else {
                                break;
                            }
                        case 979432035:
                            if (string.equals("stylistic-four")) {
                                str = "'ss04'";
                                break;
                            } else {
                                break;
                            }
                        case 979664367:
                            if (string.equals("stylistic-nine")) {
                                str = "'ss09'";
                                break;
                            } else {
                                break;
                            }
                        case 1001434505:
                            if (string.equals("stylistic-one")) {
                                str = "'ss01'";
                                break;
                            } else {
                                break;
                            }
                        case 1001438213:
                            if (string.equals("stylistic-six")) {
                                str = "'ss06'";
                                break;
                            } else {
                                break;
                            }
                        case 1001439040:
                            if (string.equals("stylistic-ten")) {
                                str = "'ss10'";
                                break;
                            } else {
                                break;
                            }
                        case 1001439599:
                            if (string.equals("stylistic-two")) {
                                str = "'ss02'";
                                break;
                            } else {
                                break;
                            }
                        case 1030714463:
                            if (string.equals("stylistic-sixteen")) {
                                str = "'ss16'";
                                break;
                            } else {
                                break;
                            }
                        case 1044065430:
                            if (string.equals("stylistic-twelve")) {
                                str = "'ss12'";
                                break;
                            } else {
                                break;
                            }
                        case 1044067310:
                            if (string.equals("stylistic-twenty")) {
                                str = "'ss20'";
                                break;
                            } else {
                                break;
                            }
                        case 1082592379:
                            if (string.equals("no-discretionary-ligatures")) {
                                str = "'dlig' off";
                                break;
                            } else {
                                break;
                            }
                        case 1183323111:
                            if (string.equals("small-caps")) {
                                str = "'smcp'";
                                break;
                            } else {
                                break;
                            }
                        case 1223989350:
                            if (string.equals("common-ligatures")) {
                                arrayList.add("'liga'");
                                str = "'clig'";
                                break;
                            } else {
                                break;
                            }
                        case 1463562569:
                            if (string.equals("stylistic-nineteen")) {
                                str = "'ss19'";
                                break;
                            } else {
                                break;
                            }
                        case 1648446397:
                            if (string.equals("stylistic-fourteen")) {
                                str = "'ss14'";
                                break;
                            } else {
                                break;
                            }
                        case 2097122634:
                            if (string.equals("stylistic-seventeen")) {
                                str = "'ss17'";
                                break;
                            } else {
                                break;
                            }
                    }
                    arrayList.add(str);
                }
            }
            return TextUtils.join(", ", arrayList);
        }
        return null;
    }
}
