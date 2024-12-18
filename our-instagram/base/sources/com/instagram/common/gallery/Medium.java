package com.instagram.common.gallery;

import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AbstractC189358aC;
import X.AnonymousClass001;
import X.AnonymousClass010;
import X.C0K8;
import X.C0w9;
import X.C14360o3;
import X.C194878jo;
import X.C206139Av;
import X.C60782q2;
import X.C8IT;
import X.C8IU;
import android.content.ContentResolver;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class Medium implements Parcelable, C8IT {
    public static int A0h = Integer.MIN_VALUE;
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public GeneratedMediaMetadata A0E;
    public C194878jo A0F;
    public MediaUploadMetadata A0G;
    public BackgroundGradientColors A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public static final C8IU A0i = new Object();
    public static final Parcelable.Creator CREATOR = new C206139Av(55);
    public static final Pattern A0j = Pattern.compile(".*(?i)screenshot.*");

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Medium(Uri uri, String str, int i, int i2, int i3, int i4, long j, long j2) {
        this(uri, str, null, i, i2, 0, i3, i4, j, j2, false);
        C14360o3.A0B(str, 3);
    }

    public final void A04(File file) {
        C14360o3.A0B(file, 0);
        this.A0X = file.getAbsolutePath();
        this.A0b = Uri.fromFile(file).toString();
    }

    public final double[] A07(ContentResolver contentResolver) {
        Double d;
        C14360o3.A0B(contentResolver, 0);
        if (!this.A0d && Cff()) {
            if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                C0w9.A03("Medium", "loadVideoGeo called on main thread");
            } else {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(this.A0X);
                        String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                        if (extractMetadata != null) {
                            Matcher matcher = Pattern.compile("([+-][0-9]+\\.?[0-9]*)([+-][0-9]+\\.?[0-9]*)").matcher(extractMetadata);
                            if (matcher.find() && matcher.groupCount() == 2) {
                                String group = matcher.group(1);
                                Double d2 = null;
                                if (group != null) {
                                    d = AnonymousClass010.A0m(group);
                                } else {
                                    d = null;
                                }
                                String group2 = matcher.group(2);
                                if (group2 != null) {
                                    d2 = AnonymousClass010.A0m(group2);
                                }
                                if (d != null && d2 != null) {
                                    double doubleValue = d.doubleValue();
                                    double doubleValue2 = d2.doubleValue();
                                    this.A0d = true;
                                    this.A00 = doubleValue;
                                    this.A01 = doubleValue2;
                                }
                            }
                        }
                    } catch (RuntimeException e) {
                        C0K8.A0H("Medium", "Could not extract video location", e);
                    }
                } finally {
                    mediaMetadataRetriever.release();
                }
            }
        }
        if (!this.A0d && Build.VERSION.SDK_INT >= 29) {
            try {
                InputStream openInputStream = contentResolver.openInputStream(A02());
                if (openInputStream != null) {
                    C60782q2 c60782q2 = new C60782q2(openInputStream);
                    String A0N = c60782q2.A0N("GPSLatitude");
                    String A0N2 = c60782q2.A0N("GPSLatitudeRef");
                    String A0N3 = c60782q2.A0N("GPSLongitude");
                    String A0N4 = c60782q2.A0N("GPSLongitudeRef");
                    if (A0N != null && A0N2 != null && A0N3 != null && A0N4 != null) {
                        try {
                            double A00 = C60782q2.A00(A0N, A0N2);
                            double A002 = C60782q2.A00(A0N3, A0N4);
                            double d3 = new double[]{A00, A002}[0];
                            this.A0d = true;
                            this.A00 = d3;
                            this.A01 = A002;
                        } catch (IllegalArgumentException unused) {
                            Log.w(AbstractC111324zv.A00(3598), AnonymousClass001.A0R("Latitude/longitude values are not parsable. ", String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", A0N, A0N2, A0N3, A0N4)));
                        }
                    }
                    openInputStream.close();
                }
            } catch (IOException | OutOfMemoryError | UnsupportedOperationException e2) {
                C0K8.A0H("Medium", "Could not extract media location.", e2);
            }
        }
        if (this.A0d) {
            return new double[]{this.A00, this.A01};
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0X);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0b);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeString(this.A0a);
        parcel.writeInt(this.A07);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0C);
        parcel.writeInt(this.A06);
        parcel.writeParcelable(this.A0G, i);
        parcel.writeParcelable(this.A0H, i);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A0g ? 1 : 0);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0R);
        List list = this.A0c;
        List list2 = list;
        if (list == null) {
            list2 = new ArrayList();
        }
        parcel.writeTypedList(list2);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0M);
        Boolean bool = this.A0I;
        int i2 = 1;
        if (!C14360o3.A0K(bool, true)) {
            i2 = -1;
            if (C14360o3.A0K(bool, false)) {
                i2 = 0;
            }
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.A0E, i);
    }

    public final float A00() {
        int i;
        int i2 = this.A0B;
        if (i2 > 0 && (i = this.A04) > 0) {
            return i2 / i;
        }
        return 1.0f;
    }

    public final long A01() {
        long length = new File(this.A0X).length();
        int i = this.A03;
        if (i == 0) {
            return 0L;
        }
        return (length / i) * 8000;
    }

    public final Uri A02() {
        String str = this.A0b;
        if (str != null) {
            Uri A03 = AbstractC08820cl.A03(str);
            C14360o3.A07(A03);
            return A03;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final String A03() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.A0X);
        if (fileExtensionFromUrl == null) {
            return null;
        }
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        C14360o3.A07(lowerCase);
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
    }

    public final boolean A05() {
        if (this.A08 == 1) {
            return true;
        }
        return false;
    }

    public final boolean A06() {
        return new File(this.A0X).exists();
    }

    @Override // X.C8IT
    public final String B8m() {
        String str = this.A0U;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.C8IT
    public final String BK3() {
        return String.valueOf(this.A05);
    }

    @Override // X.C8IT
    public final int BpZ() {
        return this.A07;
    }

    @Override // X.C8IT
    public final boolean CPp() {
        return false;
    }

    @Override // X.C8IT
    public final boolean Cff() {
        if (this.A08 != 3) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return C14360o3.A0K(this.A0X, ((Medium) obj).A0X);
        }
        return false;
    }

    @Override // X.C8IT
    public final int getDuration() {
        return this.A03;
    }

    public final int hashCode() {
        return this.A0X.hashCode();
    }

    @Override // X.C8IT
    public final boolean isValid() {
        if ((A05() || Cff()) && this.A0X.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Medium(Uri uri, String str, String str2, int i, int i2, int i3, int i4, int i5, long j, long j2, boolean z) {
        this();
        String str3;
        C14360o3.A0B(str, 3);
        this.A05 = i;
        this.A08 = i2;
        this.A0X = str;
        this.A02 = i3;
        this.A0O = str2;
        this.A07 = i4;
        this.A03 = i5;
        this.A0C = j;
        this.A0D = j2;
        this.A0f = z;
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = null;
        }
        this.A0b = str3;
        this.A0U = AbstractC189358aC.A01(i5);
    }

    public Medium() {
        this.A0X = "";
        this.A0G = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
    }
}
