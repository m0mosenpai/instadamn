package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.Sab, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63012Sab {
    public ArrayList A00;
    public ArrayList A01;
    public final Intent A02 = AbstractC58318PtA.A0C();

    public final void A04(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 2);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_HASHES", i);
        A0b.putInt("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_NUM_BITS", i2);
        A0b.putByteArray("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER_BITS", bArr);
        this.A02.putExtra("BrowserLiteIntent.EXTRA_1PC_DISABLED_PIXEL_BLOOM_FILTER", A0b);
    }

    public static Intent A00(Context context, android.net.Uri uri, AbstractC12990ll abstractC12990ll) {
        Intent flags = new Intent(context, Class.forName("com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity")).setData(uri).setFlags(268435456);
        C14360o3.A07(flags);
        flags.putExtra("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
        C63012Sab c63012Sab = new C63012Sab();
        Locale locale = context.getResources().getConfiguration().locale;
        Intent intent = c63012Sab.A02;
        intent.putExtra("BrowserLiteIntent.EXTRA_LOCALE", locale);
        intent.putExtra("BrowserLiteIntent.EXTRA_SHOW_DOMAIN_NAME", false);
        intent.putExtra("BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED", false);
        flags.putExtras(c63012Sab.A01());
        return flags;
    }

    public final Intent A01() {
        ArrayList<? extends Parcelable> arrayList = this.A01;
        if (arrayList != null) {
            this.A02.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_MENU_ITEMS", arrayList);
        }
        ArrayList<? extends Parcelable> arrayList2 = this.A00;
        if (arrayList2 != null) {
            this.A02.putParcelableArrayListExtra("BrowserLiteIntent.EXTRA_COOKIES", arrayList2);
        }
        return this.A02;
    }

    public final void A02(String str, String str2, int i) {
        if (this.A01 == null) {
            this.A01 = AbstractC166987dD.A1E();
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("KEY_LABEL", str);
        A0b.putInt("KEY_ICON_RES", i);
        A0b.putString("action", str2);
        ArrayList arrayList = this.A01;
        C14360o3.A0A(arrayList);
        arrayList.add(A0b);
    }

    public final void A03(String str, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("KEY_URL", str);
            A0b.putStringArrayList("KEY_STRING_ARRAY", arrayList);
            ArrayList arrayList2 = this.A00;
            if (arrayList2 == null) {
                arrayList2 = AbstractC166987dD.A1E();
                this.A00 = arrayList2;
            }
            arrayList2.add(A0b);
        }
    }
}
