package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;

/* renamed from: X.PwQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58497PwQ {
    public static Icon A00(Context context, IconCompat iconCompat) {
        Icon createWithAdaptiveBitmap;
        String str;
        switch (iconCompat.A02) {
            case -1:
                return (Icon) iconCompat.A06;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithAdaptiveBitmap = Icon.createWithBitmap((Bitmap) iconCompat.A06);
                break;
            case 2:
                String str2 = iconCompat.A07;
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    str = iconCompat.A07;
                } else {
                    str = ((String) iconCompat.A06).split(":", -1)[0];
                }
                createWithAdaptiveBitmap = Icon.createWithResource(str, iconCompat.A00);
                break;
            case 3:
                createWithAdaptiveBitmap = Icon.createWithData((byte[]) iconCompat.A06, iconCompat.A00, iconCompat.A01);
                break;
            case 4:
                createWithAdaptiveBitmap = Icon.createWithContentUri((String) iconCompat.A06);
                break;
            case 5:
                createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.A06);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithAdaptiveBitmap = AbstractC61634Rqy.A00(iconCompat.A06());
                    break;
                } else if (context != null) {
                    InputStream A07 = iconCompat.A07(context);
                    if (A07 != null) {
                        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(A07));
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot load adaptive icon from uri: ");
                        sb.append(iconCompat.A06());
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Context is required to resolve the file uri of the icon: ");
                    sb2.append(iconCompat.A06());
                    throw new IllegalArgumentException(sb2.toString());
                }
        }
        ColorStateList colorStateList = iconCompat.A03;
        if (colorStateList != null) {
            createWithAdaptiveBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.A04;
        if (mode != IconCompat.A0A) {
            createWithAdaptiveBitmap.setTintMode(mode);
        }
        return createWithAdaptiveBitmap;
    }

    public static IconCompat A01(Object obj) {
        obj.getClass();
        Icon icon = (Icon) obj;
        int type = icon.getType();
        if (type != 2) {
            int i = 4;
            if (type != 4) {
                i = 6;
                if (type != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.A06 = obj;
                    return iconCompat;
                }
            }
            android.net.Uri uri = icon.getUri();
            uri.getClass();
            String obj2 = uri.toString();
            obj2.getClass();
            IconCompat iconCompat2 = new IconCompat(i);
            iconCompat2.A06 = obj2;
            return iconCompat2;
        }
        return IconCompat.A01(null, icon.getResPackage(), icon.getResId());
    }
}
