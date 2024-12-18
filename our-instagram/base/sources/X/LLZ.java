package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Patterns;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class LLZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public LI0 A07;
    public C47592L0c A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public LinkedHashSet A0F = AbstractC31171DnF.A0l();
    public List A0G;
    public byte[] A0H;
    public byte[] A0I;
    public boolean A0J;
    public final L8J A0K;
    public final String A0L;
    public static final java.util.Set A0R = new HashSet(Arrays.asList("og:image", "og:image:type", "og:video", "og:video:type", "og:video:url", "og:video:secure_url", "og:video:width", "og:video:height", "og:thumbnail", "og:title", "og:description", "og:url", "og:site_name", "og:audio", "og:audio:type", "og:restrictions:country:allowed", "image", "thumbnail", "twitter:image", DialogModule.KEY_TITLE, "twitter:title", DevServerEntity.COLUMN_DESCRIPTION, "twitter:description", "twitter:url", "invite_link_type", "music:preview_url:secure_url", "music:preview_url:type"));
    public static final Pattern A0N = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0U = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public static final Pattern A0T = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0O = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0S = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\'|([^\\s\"\\']+)\\s+)", 34);
    public static final Pattern A0M = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0Q = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com", 2);
    public static final Pattern A0P = Pattern.compile("https://(www\\.)?pbs\\.twimg\\.com/profile_images", 2);

    private C47592L0c A01(Map map, String... strArr) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        for (String str : strArr) {
            String A1A = AbstractC166987dD.A1A(str, map);
            if (A1A != null && AbstractC31175DnJ.A1Z(A1A, Patterns.WEB_URL)) {
                try {
                    httpURLConnection = A04(null, new java.net.URL(A1A));
                    if (httpURLConnection != null) {
                        try {
                            try {
                                C47592L0c A00 = A00(A1A, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength());
                                if (A00 != null) {
                                    A07(httpURLConnection);
                                    return A00;
                                }
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection2 = httpURLConnection;
                                A07(httpURLConnection2);
                                throw th;
                            }
                        } catch (IOException e) {
                            e = e;
                            C0K8.A0H("WebPageInfo", "WebPageInfo/getGifOnPage Cannot connect.", e);
                            A07(httpURLConnection);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                A07(httpURLConnection);
            }
        }
        return null;
    }

    public static String A03(HashMap hashMap, String... strArr) {
        for (String str : strArr) {
            String A0h = AbstractC31171DnF.A0h(str, hashMap);
            if (A0h != null) {
                return A0h.trim();
            }
        }
        return null;
    }

    public static HttpURLConnection A04(String str, java.net.URL url) {
        java.net.URL url2;
        HttpURLConnection httpURLConnection = null;
        try {
            url2 = new java.net.URL(new java.net.URI(url.toString()).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            url2 = null;
        }
        if (url2 != null) {
            URLConnection openConnection = url2.openConnection();
            if (openConnection instanceof HttpURLConnection) {
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                if (str != null) {
                    httpURLConnection.setRequestProperty(AbstractC58317Pt9.A00(157), str);
                }
                httpURLConnection.setRequestProperty("User-Agent", "WhatsApp/3.0.0.0 A");
            }
        }
        return httpURLConnection;
    }

    public final void A09() {
        this.A0E = null;
        this.A0D = null;
        this.A0A = null;
        this.A0F.clear();
        this.A0J = false;
    }

    private C47592L0c A00(String str, String str2, int i) {
        if ("image/gif".equals(str2) && i != -1) {
            if (str.endsWith("giphy.gif")) {
                try {
                    if (new java.net.URI(str).getHost().contains("giphy.com")) {
                        str = AnonymousClass001.A0R(str.substring(0, str.length() - 9), "200.mp4");
                        HttpURLConnection httpURLConnection = null;
                        try {
                            try {
                                httpURLConnection = A04(null, new java.net.URL(str));
                                if (httpURLConnection != null) {
                                    String headerField = httpURLConnection.getHeaderField("Content-Type");
                                    if (headerField.equals("video/mp4")) {
                                        return new C47592L0c(str, httpURLConnection.getContentLength(), headerField);
                                    }
                                }
                            } catch (IOException e) {
                                C0K8.A0H("WebPageInfo", "WebPageInfo/checkForMp4 Cannot connect.", e);
                            }
                            A07(httpURLConnection);
                        } finally {
                            A07(httpURLConnection);
                        }
                    }
                } catch (URISyntaxException e2) {
                    C0K8.A0H("WebPageInfo", "WebPageInfo/getGifInfo Cannot connect.", e2);
                }
            }
            return new C47592L0c(str, i, str2);
        }
        return null;
    }

    public static void A07(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                AbstractC09810fe.A00(httpURLConnection, 1951228165).close();
            } catch (Throwable th) {
                th.getMessage();
            }
        } catch (IOException unused) {
        }
        httpURLConnection.disconnect();
    }

    public final boolean A0A() {
        boolean z;
        boolean z2 = !TextUtils.isEmpty(this.A0E);
        boolean z3 = !TextUtils.isEmpty(this.A0D);
        C47592L0c c47592L0c = this.A08;
        if (c47592L0c != null) {
            String str = c47592L0c.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z = true;
                if (!z2 || z3 || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        return !z2 ? true : true;
    }

    public final byte[] A0B(byte[] bArr, int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        byte[] A08;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        int length = bArr.length;
        C0fL.A00(bArr, 0, length, options);
        int i7 = options.outWidth;
        this.A01 = i7;
        int i8 = options.outHeight;
        this.A00 = i8;
        if (i7 >= i && i8 >= i2) {
            options.inDither = true;
            options.inScaled = false;
            options.inPreferQualityOverSpeed = true;
            boolean z2 = !z;
            if (i3 >= 2 && i4 >= 2 && (!z2 || i3 == i4)) {
                i5 = i3;
                i6 = i4;
            } else {
                i5 = Integer.MAX_VALUE;
                i6 = Integer.MAX_VALUE;
                z2 = false;
            }
            if (!options.inJustDecodeBounds) {
                options.inJustDecodeBounds = true;
                C0fL.A00(bArr, 0, length, options);
            }
            int i9 = options.outWidth;
            int i10 = options.outHeight;
            if (i9 > 0 && i10 > 0) {
                int i11 = options.inSampleSize;
                if (z2) {
                    i9 = Math.max(i9, i10);
                    i10 = i9;
                }
                int max = Math.max(i11, 1);
                int i12 = ((i9 - 1) / max) + 1;
                int i13 = ((i10 - 1) / max) + 1;
                while (((i12 - 1) / 2) + 1 >= i5 && ((i13 - 1) / 2) + 1 >= i6) {
                    i12 = ((i12 - 1) / 2) + 1;
                    i13 = ((i13 - 1) / 2) + 1;
                    max *= 2;
                }
                options.inSampleSize = max;
                options.inJustDecodeBounds = false;
                options.inPurgeable = true;
                options.inInputShareable = true;
                Bitmap A00 = C0fL.A00(bArr, 0, length, options);
                if (A00 != null) {
                    if (z) {
                        Rect rect = new Rect(0, 0, A00.getWidth(), A00.getHeight());
                        this.A03 = i3;
                        this.A02 = i4;
                        A08 = A08(A00, rect, i3, i4, 50);
                    } else {
                        int min = Math.min(140, Math.min(A00.getWidth(), A00.getHeight()));
                        int min2 = Math.min(A00.getWidth(), A00.getHeight());
                        Rect A0V = AbstractC166987dD.A0V((A00.getWidth() - min2) / 2, (A00.getHeight() - min2) / 2, (A00.getWidth() + min2) / 2, (A00.getHeight() + min2) / 2);
                        this.A05 = min;
                        this.A04 = min;
                        A08 = A08(A00, A0V, min, min, 80);
                    }
                    A00.recycle();
                    return A08;
                }
                return null;
            }
            C0K8.A0C("BitmapUtils", "bitmaputils/decode bad image");
            return null;
        }
        return null;
    }

    public LLZ(L8J l8j, String str) {
        this.A0L = str;
        this.A0K = l8j;
    }

    public static HashMap A05(String str) {
        HashMap A1G = AbstractC166987dD.A1G();
        Matcher matcher = A0S.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null && (group2 = matcher.group(3)) == null) {
                group2 = matcher.group(4);
            }
            if (group != null) {
                group = group.toLowerCase(Locale.US);
            }
            A1G.put(group, group2);
        }
        return A1G;
    }

    private void A06(String str, String str2, String... strArr) {
        String substring = str.substring(0, str.length() - str2.length());
        for (String str3 : strArr) {
            this.A0F.add(AnonymousClass001.A0R(substring, str3));
        }
    }

    public static byte[] A08(Bitmap bitmap, Rect rect, int i, int i2, int i3) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        Paint A0R2 = AbstractC166987dD.A0R();
        A0R2.setAntiAlias(true);
        A0R2.setFilterBitmap(true);
        A06.drawColor(-1);
        A06.drawBitmap(bitmap, rect, new Rect(0, 0, i, i2), A0R2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0fK.A02(Bitmap.CompressFormat.JPEG, createBitmap, byteArrayOutputStream, i3);
        createBitmap.recycle();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0437, code lost:
    
        if (r6 == null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        if ("video/mp4".equalsIgnoreCase(X.AbstractC31171DnF.A0h("og:video:type", r1)) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A02(X.LLZ r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.net.URL r18, int r19) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLZ.A02(X.LLZ, java.lang.String, java.lang.String, java.lang.String, java.net.URL, int):java.lang.String");
    }
}
