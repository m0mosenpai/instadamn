package X;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.T4c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64213T4c implements InterfaceC92094Ap {
    public static final Pattern A00 = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, X.4Fv, java.io.IOException] */
    @Override // X.InterfaceC92094Ap
    public final /* bridge */ /* synthetic */ Object E3N(android.net.Uri uri, InputStream inputStream) {
        long j;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(inputStream, AbstractC50482Ts.A05)).readLine();
        try {
            Matcher matcher = A00.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j = 1;
                    } else {
                        j = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (!TextUtils.isEmpty(group2)) {
                        parseLong = Long.parseLong(group2);
                    } else {
                        parseLong = 0;
                    }
                    time -= j * ((((parseLong2 * 60) + parseLong) * 60) * 1000);
                }
                return Long.valueOf(time);
            }
            ?? iOException = new IOException(AnonymousClass001.A0R("Couldn't parse timestamp: ", readLine), null);
            iOException.A01 = true;
            iOException.A00 = 4;
            throw iOException;
        } catch (ParseException e) {
            ?? iOException2 = new IOException(null, e);
            iOException2.A01 = true;
            iOException2.A00 = 4;
            throw iOException2;
        }
    }
}
