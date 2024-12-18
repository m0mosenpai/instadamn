package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: X.Sip, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63377Sip {
    public static final C62718SNi A00(Context context, C62718SNi c62718SNi, boolean z) {
        android.util.Log.isLoggable("FirebaseInstanceId", 3);
        Properties properties = new Properties();
        KeyPair keyPair = c62718SNi.A01;
        properties.setProperty("pub", Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        properties.setProperty("pri", Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        properties.setProperty("cre", String.valueOf(c62718SNi.A00));
        File A04 = A04(context);
        try {
            A04.createNewFile();
            RandomAccessFile randomAccessFile = new RandomAccessFile(A04, "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    channel.lock();
                    if (z && channel.size() > 0) {
                        try {
                            channel.position(0L);
                            C62718SNi A03 = A03(channel);
                            channel.close();
                            randomAccessFile.close();
                            return A03;
                        } catch (C61240Rjc | IOException e) {
                            AbstractC58320PtC.A1L("FirebaseInstanceId", e);
                        }
                    }
                    channel.position(0L);
                    properties.store(Channels.newOutputStream(channel), (String) null);
                    channel.close();
                    randomAccessFile.close();
                    return c62718SNi;
                } finally {
                }
            } finally {
            }
        } catch (IOException e2) {
            String valueOf = String.valueOf(e2);
            android.util.Log.w("FirebaseInstanceId", MSZ.A0u("Failed to write key: ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 21)));
            return null;
        }
    }

    public static final C62718SNi A02(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                channel.lock(0L, Long.MAX_VALUE, true);
                C62718SNi A03 = A03(channel);
                channel.close();
                fileInputStream.close();
                return A03;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                    throw th2;
                } finally {
                    S7H.A00.A00(th, th);
                }
            }
        }
    }

    public static C62718SNi A03(FileChannel fileChannel) {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property != null && property2 != null) {
            try {
                return new C62718SNi(A05(property, property2), Long.parseLong(properties.getProperty("cre")));
            } catch (NumberFormatException e) {
                throw new Exception(e);
            }
        }
        throw new Exception("Invalid properties file");
    }

    public static File A04(Context context) {
        String A0x;
        if (TextUtils.isEmpty("")) {
            A0x = "com.google.InstanceId.properties";
        } else {
            try {
                String A0x2 = AbstractC58319PtB.A0x("".getBytes(ReactWebViewManager.HTML_ENCODING));
                StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(A0x2) + 33);
                A0q.append("com.google.InstanceId_");
                A0q.append(A0x2);
                A0x = AbstractC166997dE.A0x(".properties", A0q);
            } catch (UnsupportedEncodingException e) {
                throw AbstractC58318PtA.A0W(e);
            }
        }
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            android.util.Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        return MSW.A0w(noBackupFilesDir, A0x);
    }

    public static KeyPair A05(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                android.util.Log.w("FirebaseInstanceId", MSZ.A0u("Invalid key stored ", valueOf, AbstractC58318PtA.A0q(AbstractC58319PtB.A05(valueOf) + 19)));
                throw new Exception(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new Exception(e2);
        }
    }

    public static final void A06(Context context, C62718SNi c62718SNi) {
        SharedPreferences A0F = AbstractC58318PtA.A0F(context, "com.google.android.gms.appid");
        try {
            if (c62718SNi.equals(A01(A0F))) {
                return;
            }
        } catch (C61240Rjc unused) {
        }
        android.util.Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = A0F.edit();
        String A00 = C62948SYq.A00("|P|");
        KeyPair keyPair = c62718SNi.A01;
        edit.putString(A00, Base64.encodeToString(keyPair.getPublic().getEncoded(), 11));
        edit.putString(C62948SYq.A00("|K|"), Base64.encodeToString(keyPair.getPrivate().getEncoded(), 11));
        edit.putString(C62948SYq.A00("cre"), String.valueOf(c62718SNi.A00));
        edit.commit();
    }

    public final C62718SNi A07(Context context) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(C3OO.FLAG_MOVED);
            C62718SNi c62718SNi = new C62718SNi(keyPairGenerator.generateKeyPair(), System.currentTimeMillis());
            C62718SNi A00 = A00(context, c62718SNi, true);
            if (A00 != null && !A00.equals(c62718SNi)) {
                android.util.Log.isLoggable("FirebaseInstanceId", 3);
                return A00;
            }
            android.util.Log.isLoggable("FirebaseInstanceId", 3);
            A06(context, c62718SNi);
            return c62718SNi;
        } catch (NoSuchAlgorithmException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    public static C62718SNi A01(SharedPreferences sharedPreferences) {
        long parseLong;
        String string = sharedPreferences.getString(C62948SYq.A00("|P|"), null);
        String string2 = sharedPreferences.getString(C62948SYq.A00("|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair A05 = A05(string, string2);
        String string3 = sharedPreferences.getString(C62948SYq.A00("cre"), null);
        if (string3 != null) {
            try {
                parseLong = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
            return new C62718SNi(A05, parseLong);
        }
        parseLong = 0;
        return new C62718SNi(A05, parseLong);
    }
}
