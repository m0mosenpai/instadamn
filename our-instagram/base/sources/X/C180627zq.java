package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import java.util.List;

/* renamed from: X.7zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180627zq {
    public C47947LGc A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, C180637zr.A00);

    public static final C31349DqE A00(String str, String str2, String str3) {
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A04();
        c146106i8.A0H = str;
        c146106i8.A0D = str2;
        c146106i8.A0I = str3;
        c146106i8.A01 = 5000;
        c146106i8.A0J = true;
        return c146106i8.A00();
    }

    public static final List A01(Context context, int i, int i2) {
        String string = context.getString(i);
        C14360o3.A07(string);
        InfoItem infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_photo_pano_outline_24), Integer.valueOf(AbstractC53242c7.A09(context)), string, null);
        String string2 = context.getString(i2);
        C14360o3.A07(string2);
        InfoItem infoItem2 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_collage_pano_outline_24), Integer.valueOf(AbstractC53242c7.A09(context)), string2, null);
        String string3 = context.getString(2131974216);
        C14360o3.A07(string3);
        return AbstractC16960so.A1Q(infoItem, infoItem2, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_settings_pano_outline_24), Integer.valueOf(AbstractC53242c7.A09(context)), string3, null));
    }
}
