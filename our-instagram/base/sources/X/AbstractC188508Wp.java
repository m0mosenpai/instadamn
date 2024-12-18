package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.8Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC188508Wp {
    public static InterfaceC19630xq A00;
    public static HashMap A01;
    public static JSONArray A02;
    public static final int A03;

    static {
        Pattern pattern = AbstractC13670mt.A00;
        A03 = "eId:".length();
    }

    public static C9PL A00(String str) {
        String str2;
        if (A00 == null) {
            return null;
        }
        A03();
        C9PL c9pl = (C9PL) A01.get(str);
        if (c9pl == null) {
            return c9pl;
        }
        try {
            C60782q2 c60782q2 = new C60782q2(str);
            String A0N = c60782q2.A0N("FNumber");
            String A0N2 = c60782q2.A0N("ExposureTime");
            String A0N3 = c60782q2.A0N("WhiteBalance");
            String A0N4 = c60782q2.A0N("ISOSpeedRatings");
            String A0N5 = c60782q2.A0N("FocalLength");
            String A0N6 = c60782q2.A0N("UserComment");
            if (A0N != null && c9pl.A01 == null) {
                c9pl.A01 = Float.valueOf(Float.parseFloat(A0N));
            }
            if (A0N4 != null && c9pl.A04 == null) {
                c9pl.A04 = Integer.valueOf(Integer.parseInt(A0N4));
            }
            if (A0N2 != null && c9pl.A05 == null) {
                c9pl.A05 = Long.valueOf(Math.round(Float.parseFloat(A0N2) * 1.0E9f));
            }
            if (A0N5 != null && c9pl.A02 == null) {
                c9pl.A02 = Float.valueOf(Float.parseFloat(A0N5));
            }
            if (A0N3 != null && c9pl.A03 == null) {
                c9pl.A03 = Integer.valueOf(Integer.parseInt(A0N3));
            }
            if (A0N6 == null) {
                return c9pl;
            }
            Pattern pattern = AbstractC13670mt.A00;
            int length = A0N6.length();
            int i = A03;
            if (length <= i || !c9pl.A00().isEmpty()) {
                return c9pl;
            }
            List singletonList = Collections.singletonList(A0N6.substring(i));
            C14360o3.A0B(singletonList, 0);
            c9pl.A0A = singletonList;
            return c9pl;
        } catch (IOException e) {
            if (e.getLocalizedMessage() != null) {
                str2 = e.getLocalizedMessage();
            } else {
                str2 = "";
            }
            AbstractC12120kG.A01("GalleryMetadataUtil", str2);
            return c9pl;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    public static JSONArray A01(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        if (z == 0 || jSONArray.length() > 1) {
            while (z < jSONArray.length()) {
                try {
                    jSONArray2.put(jSONArray.get(z));
                    z++;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return jSONArray2;
    }

    public static void A02() {
        InterfaceC19630xq interfaceC19630xq = A00;
        if (interfaceC19630xq != null && A02 != null) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7K("GalleryMetadataList", A02.toString());
            ARD.apply();
        }
    }

    public static void A03() {
        int i;
        String str;
        String str2;
        String string;
        if (A01 == null) {
            JSONArray jSONArray = A02;
            if (jSONArray != null) {
                i = jSONArray.length();
            } else {
                i = 16;
            }
            A01 = new HashMap(i);
            JSONArray jSONArray2 = A02;
            if (jSONArray2 == null) {
                InterfaceC19630xq interfaceC19630xq = A00;
                if (interfaceC19630xq != null && (string = interfaceC19630xq.getString("GalleryMetadataList", null)) != null) {
                    try {
                        jSONArray2 = new JSONArray(string);
                    } catch (JSONException unused) {
                        jSONArray2 = new JSONArray();
                    }
                } else {
                    jSONArray2 = new JSONArray();
                }
                A02 = jSONArray2;
            }
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    C9PL parseFromJson = AbstractC209649Pa.parseFromJson(C16V.A00(A02.getString(i2)));
                    if (parseFromJson != null && (str2 = parseFromJson.A08) != null && !str2.isEmpty()) {
                        A01.put(str2, parseFromJson);
                    }
                } catch (IOException | JSONException e) {
                    if (e.getLocalizedMessage() != null) {
                        str = e.getLocalizedMessage();
                    } else {
                        str = "";
                    }
                    C0K8.A0G("GalleryMetadataUtil", str, e);
                }
            }
        }
    }

    public static void A04(UserSession userSession, C9PL c9pl) {
        JSONArray A012;
        String string;
        String str;
        JSONArray jSONArray;
        String string2;
        if (c9pl.A08 != null) {
            try {
                if (A02 == null) {
                    InterfaceC19630xq interfaceC19630xq = A00;
                    if (interfaceC19630xq != null && (string2 = interfaceC19630xq.getString("GalleryMetadataList", null)) != null) {
                        try {
                            jSONArray = new JSONArray(string2);
                        } catch (JSONException unused) {
                            jSONArray = new JSONArray();
                        }
                    } else {
                        jSONArray = new JSONArray();
                    }
                    A02 = jSONArray;
                }
                A03();
                C14360o3.A0B(userSession, 0);
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330720335512558L);
                if (A02.length() > 100 && (string = A02.getString(0)) != null) {
                    C9PL parseFromJson = AbstractC209649Pa.parseFromJson(C16V.A00(string));
                    if (parseFromJson != null && (str = parseFromJson.A08) != null && !str.isEmpty()) {
                        A01.remove(str);
                    }
                    if (A06) {
                        A012 = A01(A02, true);
                        A012.put(AbstractC209649Pa.A00(c9pl));
                        String A0O = AnonymousClass001.A0O("length of savedMediaMetadataJsonArrayCopy ", A012.length());
                        C14360o3.A0B(A0O, 1);
                        AbstractC12120kG.A04("GalleryMetadataUtil", A0O, 817895804, null);
                        A02 = A012;
                    } else {
                        A02 = A01(A02, true);
                        A02.put(AbstractC209649Pa.A00(c9pl));
                    }
                } else {
                    if (A06) {
                        A012 = A01(A02, false);
                        A012.put(AbstractC209649Pa.A00(c9pl));
                        String A0O2 = AnonymousClass001.A0O("length of savedMediaMetadataJsonArrayCopy ", A012.length());
                        C14360o3.A0B(A0O2, 1);
                        AbstractC12120kG.A04("GalleryMetadataUtil", A0O2, 817895804, null);
                        A02 = A012;
                    }
                    A02.put(AbstractC209649Pa.A00(c9pl));
                }
                A01.put(c9pl.A08, c9pl);
            } catch (IOException | JSONException e) {
                C0K8.A0G("GalleryMetadataUtil", e.getLocalizedMessage() != null ? e.getLocalizedMessage() : "", e);
            }
        }
    }

    public static void A05(C47Z c47z, String str) {
        C9PL A002 = A00(str);
        if (A002 != null) {
            if (!A002.A00().isEmpty()) {
                c47z.A2o = (String) A002.A00().get(0);
            }
            String str2 = A002.A06;
            if (str2 != null) {
                c47z.A2V = str2;
            }
            String str3 = A002.A07;
            if (str3 != null) {
                c47z.A2n = str3;
            }
        }
    }
}
