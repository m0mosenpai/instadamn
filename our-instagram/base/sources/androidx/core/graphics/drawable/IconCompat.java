package androidx.core.graphics.drawable;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC43594JPz;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes10.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A0A = PorterDuff.Mode.SRC_IN;
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Parcelable A05;
    public Object A06;
    public String A07;
    public String A08;
    public byte[] A09;

    public final int A04() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getResId();
        }
        if (i == 2) {
            return this.A00;
        }
        throw AbstractC43594JPz.A0o(this, "called getResId() on ", AbstractC166987dD.A1C());
    }

    public final Bitmap A05() {
        Object obj;
        int i = this.A02;
        if (i == -1) {
            obj = this.A06;
            if (!(obj instanceof Bitmap)) {
                return null;
            }
        } else if (i == 1) {
            obj = this.A06;
        } else {
            if (i == 5) {
                Bitmap bitmap = (Bitmap) this.A06;
                int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                float f = min;
                float f2 = 0.5f * f;
                float f3 = 0.9166667f * f2;
                float f4 = 0.010416667f * f;
                paint.setColor(0);
                paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                canvas.drawCircle(f2, f2, f3, paint);
                paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                canvas.drawCircle(f2, f2, f3, paint);
                paint.clearShadowLayer();
                paint.setColor(-16777216);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = new Matrix();
                matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                canvas.drawCircle(f2, f2, f3, paint);
                canvas.setBitmap(null);
                return createBitmap;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        return (Bitmap) obj;
    }

    public final Uri A06() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getUri();
        }
        if (i != 4 && i != 6) {
            throw AbstractC43594JPz.A0o(this, "called getUri() on ", AbstractC166987dD.A1C());
        }
        return Uri.parse((String) this.A06);
    }

    public final String toString() {
        String str;
        int height;
        int i = this.A02;
        if (i == -1) {
            return String.valueOf(this.A06);
        }
        StringBuilder A0s = AbstractC58318PtA.A0s("Icon(typ=");
        switch (i) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        A0s.append(str);
        switch (i) {
            case 1:
            case 5:
                A0s.append(" size=");
                A0s.append(((Bitmap) this.A06).getWidth());
                A0s.append("x");
                height = ((Bitmap) this.A06).getHeight();
                A0s.append(height);
                break;
            case 2:
                A0s.append(" pkg=");
                A0s.append(this.A07);
                A0s.append(" id=");
                A0s.append(String.format("0x%08x", AbstractC25228BEl.A1Y(A04())));
                break;
            case 3:
                A0s.append(" len=");
                A0s.append(this.A00);
                height = this.A01;
                if (height != 0) {
                    A0s.append(" off=");
                    A0s.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                A0s.append(" uri=");
                A0s.append(this.A06);
                break;
        }
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            A0s.append(" tint=");
            A0s.append(colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            A0s.append(" mode=");
            A0s.append(mode);
        }
        return AbstractC166997dE.A0x(")", A0s);
    }

    public IconCompat(int i) {
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
        this.A02 = i;
    }

    public static IconCompat A00(Context context, int i) {
        context.getClass();
        return A01(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat A01(Resources resources, String str, int i) {
        str.getClass();
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.A00 = i;
            if (resources != null) {
                try {
                    iconCompat.A06 = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw AbstractC166987dD.A12("Icon resource cannot be found");
                }
            } else {
                iconCompat.A06 = str;
            }
            iconCompat.A07 = str;
            return iconCompat;
        }
        throw AbstractC166987dD.A12("Drawable resource ID must not be 0");
    }

    public static IconCompat A02(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.A06 = bitmap;
        return iconCompat;
    }

    public static IconCompat A03(Bundle bundle) {
        Object string;
        int i = bundle.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.A00 = bundle.getInt("int1");
        iconCompat.A01 = bundle.getInt("int2");
        iconCompat.A07 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.A03 = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.A04 = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                string = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", AnonymousClass001.A0O("Unknown type ", i));
                return null;
            case 2:
            case 4:
            case 6:
                string = bundle.getString("obj");
                break;
            case 3:
                string = bundle.getByteArray("obj");
                break;
        }
        iconCompat.A06 = string;
        return iconCompat;
    }

    public final InputStream A07(Context context) {
        StringBuilder A1C;
        String str;
        Uri A06 = A06();
        String scheme = A06.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(AbstractC166987dD.A11((String) this.A06));
            } catch (FileNotFoundException e) {
                e = e;
                A1C = AbstractC166987dD.A1C();
                str = "Unable to load image from path: ";
            }
        } else {
            try {
                return context.getContentResolver().openInputStream(A06);
            } catch (Exception e2) {
                e = e2;
                A1C = AbstractC166987dD.A1C();
                str = "Unable to load image from URI: ";
            }
        }
        Log.w("IconCompat", AbstractC167017dG.A0n(A06, str, A1C), e);
        return null;
    }

    public IconCompat() {
        this.A02 = -1;
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
    }
}
