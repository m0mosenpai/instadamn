package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.url.UrlHandlerActivity;

/* loaded from: classes6.dex */
public final class GIC implements InterfaceC37185GZw {
    public static final InterfaceC08100bW A00 = AbstractC31175DnJ.A0B();

    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return true;
    }

    @Override // X.InterfaceC37185GZw
    public final Bundle AFg(AbstractC18680vv abstractC18680vv, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        android.net.Uri A01 = AbstractC08820cl.A01(A00, str);
        if (A01 == null) {
            return null;
        }
        String scheme = A01.getScheme();
        String host = A01.getHost();
        String path = A01.getPath();
        if (A01.isHierarchical()) {
            str3 = A01.getQueryParameter("story-camera-mode");
            str4 = A01.getQueryParameter("effect_id");
            str5 = A01.getQueryParameter("entrypoint");
            str6 = A01.getQueryParameter("ch");
            str7 = A01.getQueryParameter("revision_id");
            str8 = A01.getQueryParameter("unlocked_sticker_id");
            str2 = A01.getQueryParameter("interactive_sticker_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
        }
        if (!"ig".equalsIgnoreCase(scheme) || !"story-camera".equals(host)) {
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                return null;
            }
            if ((!"instagram.com".equals(host) && !"www.instagram.com".equals(host)) || !"/linking/create_story".equals(path)) {
                return null;
            }
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("story-camera-mode-key", str3);
        A0b.putString("effect_id_key", str4);
        A0b.putString("entrypoint_key", str5);
        A0b.putString("ch_key", str6);
        A0b.putString("revisionID_key", str7);
        A0b.putString("unlocked_sticker_id", str8);
        A0b.putString("interactive_sticker_id", str2);
        return A0b;
    }

    @Override // X.InterfaceC37185GZw
    public final void CJ9(Bundle bundle, FragmentActivity fragmentActivity, AbstractC18680vv abstractC18680vv) {
        Intent A01 = C14H.A00().A01(fragmentActivity);
        Uri.Builder A04 = AbstractC31175DnJ.A04("instagram://story-camera");
        String string = bundle.getString("story-camera-mode-key", null);
        if (string != null) {
            A04.appendQueryParameter(DatePickerDialogModule.ARG_MODE, string);
        }
        String string2 = bundle.getString("effect_id_key", null);
        if (string2 != null) {
            A04.appendQueryParameter("effect_id", string2);
        }
        String string3 = bundle.getString("entrypoint_key", null);
        if (string3 != null) {
            A04.appendQueryParameter("entrypoint", string3);
        }
        String string4 = bundle.getString("ch_key", null);
        if (string4 != null) {
            A04.appendQueryParameter("test_link_crypto_hash", string4);
        }
        String string5 = bundle.getString("revisionID_key", null);
        if (string5 != null) {
            A04.appendQueryParameter("test_link_revision_id", string5);
        }
        String string6 = bundle.getString("unlocked_sticker_id", null);
        if (string6 != null) {
            A04.appendQueryParameter("unlocked_sticker_id", string6);
        }
        String string7 = bundle.getString("interactive_sticker_id", null);
        if (string6 != null) {
            A04.appendQueryParameter("interactive_sticker_id", string7);
        }
        AbstractC31180DnO.A0z(fragmentActivity, A01, A04);
        if (fragmentActivity instanceof UrlHandlerActivity) {
            fragmentActivity.finish();
        }
    }
}
