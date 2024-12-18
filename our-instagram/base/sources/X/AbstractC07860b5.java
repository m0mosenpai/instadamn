package X;

import android.content.ClipData;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.0b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07860b5 {
    public static Intent A00(String str) {
        int i;
        android.net.Uri uri;
        CharSequence charSequence;
        String str2;
        android.net.Uri uri2;
        CharSequence charSequence2;
        String str3;
        Intent parseUri = Intent.parseUri(str, 1);
        String action = parseUri.getAction();
        try {
            if ("android.intent.action.SEND".equals(action)) {
                android.net.Uri uri3 = (android.net.Uri) parseUri.getParcelableExtra("android.intent.extra.STREAM");
                CharSequence charSequenceExtra = parseUri.getCharSequenceExtra("android.intent.extra.TEXT");
                String stringExtra = parseUri.getStringExtra("android.intent.extra.HTML_TEXT");
                if (uri3 != null || charSequenceExtra != null || stringExtra != null) {
                    parseUri.setClipData(new ClipData("", new String[]{parseUri.getType()}, new ClipData.Item(charSequenceExtra, stringExtra, null, uri3)));
                    return parseUri;
                }
            } else if ("android.intent.action.SEND_MULTIPLE".equals(action)) {
                ArrayList parcelableArrayListExtra = parseUri.getParcelableArrayListExtra("android.intent.extra.STREAM");
                ArrayList<CharSequence> charSequenceArrayListExtra = parseUri.getCharSequenceArrayListExtra("android.intent.extra.TEXT");
                ArrayList<String> stringArrayListExtra = parseUri.getStringArrayListExtra("android.intent.extra.HTML_TEXT");
                if (parcelableArrayListExtra != null) {
                    i = parcelableArrayListExtra.size();
                } else {
                    i = -1;
                }
                if (charSequenceArrayListExtra != null) {
                    if (i >= 0 && i != charSequenceArrayListExtra.size()) {
                        return parseUri;
                    }
                    i = charSequenceArrayListExtra.size();
                }
                if (stringArrayListExtra != null) {
                    if (i >= 0 && i != stringArrayListExtra.size()) {
                        return parseUri;
                    }
                    i = stringArrayListExtra.size();
                }
                if (i > 0) {
                    String[] strArr = {parseUri.getType()};
                    if (parcelableArrayListExtra != null) {
                        uri = (android.net.Uri) parcelableArrayListExtra.get(0);
                    } else {
                        uri = null;
                    }
                    if (charSequenceArrayListExtra != null) {
                        charSequence = charSequenceArrayListExtra.get(0);
                    } else {
                        charSequence = null;
                    }
                    if (stringArrayListExtra == null) {
                        str2 = null;
                    } else {
                        str2 = stringArrayListExtra.get(0);
                    }
                    ClipData clipData = new ClipData("", strArr, new ClipData.Item(charSequence, str2, null, uri));
                    for (int i2 = 1; i2 < i; i2++) {
                        if (parcelableArrayListExtra != null) {
                            uri2 = (android.net.Uri) parcelableArrayListExtra.get(i2);
                        } else {
                            uri2 = null;
                        }
                        if (charSequenceArrayListExtra != null) {
                            charSequence2 = charSequenceArrayListExtra.get(i2);
                        } else {
                            charSequence2 = null;
                        }
                        if (stringArrayListExtra == null) {
                            str3 = null;
                        } else {
                            str3 = stringArrayListExtra.get(i2);
                        }
                        clipData.addItem(new ClipData.Item(charSequence2, str3, null, uri2));
                    }
                    parseUri.setClipData(clipData);
                }
            }
        } catch (ClassCastException unused) {
        }
        return parseUri;
    }
}
