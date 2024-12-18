package X;

import java.util.regex.Pattern;

/* renamed from: X.S9b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62377S9b {
    public static final android.net.Uri A00 = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    public static final android.net.Uri A01 = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern A02 = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern A03 = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}
