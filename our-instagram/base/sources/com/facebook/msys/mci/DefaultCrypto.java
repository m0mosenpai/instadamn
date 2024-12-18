package com.facebook.msys.mci;

import X.AbstractC08820cl;
import X.AnonymousClass001;
import X.C02R;
import X.C0K8;
import X.SUX;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class DefaultCrypto implements Crypto {
    public static final Crypto A00 = new Object();

    @Override // com.facebook.msys.mci.Crypto
    public byte[] computeMd5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString().getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    @Override // com.facebook.msys.mci.Crypto
    public final byte[] computeMd5V2(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return SUX.A00(messageDigest.digest()).toLowerCase(Locale.US).getBytes();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm was not found. Should not happen", e);
        }
    }

    @Override // com.facebook.msys.mci.Crypto
    public final String computeSHA256(String str, String str2) {
        int read;
        try {
            try {
                Uri A03 = AbstractC08820cl.A03(str);
                String scheme = A03.getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    if (scheme.equalsIgnoreCase("file")) {
                        String path = A03.getPath();
                        if (!TextUtils.isEmpty(path)) {
                            File file = new File(path);
                            if (file.exists()) {
                                String path2 = file.getPath();
                                try {
                                    try {
                                        try {
                                            try {
                                                FileInputStream fileInputStream = new FileInputStream(path2);
                                                try {
                                                    byte[] bArr = new byte[8192];
                                                    long length = new File(path2).length();
                                                    Mac mac = Mac.getInstance("HmacSHA256");
                                                    mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
                                                    long j = length;
                                                    long j2 = 0;
                                                    boolean z = true;
                                                    while (j > 0 && (read = fileInputStream.read(bArr)) != -1) {
                                                        for (int i = 0; z && i < 8192; i++) {
                                                            z = false;
                                                            if (bArr[i] == 0) {
                                                                z = true;
                                                            }
                                                        }
                                                        int min = Math.min((int) j, read);
                                                        mac.update(bArr, 0, min);
                                                        j2 += read;
                                                        j -= min;
                                                    }
                                                    if (!z && j2 == length && j == 0) {
                                                        String lowerCase = SUX.A00(mac.doFinal()).toLowerCase(Locale.US);
                                                        fileInputStream.close();
                                                        return lowerCase;
                                                    }
                                                    C0K8.A0A(DefaultCrypto.class, "Read bytes failed.TotalBytesRead: %d, FileSize: %d", Long.valueOf(j2), Long.valueOf(length));
                                                    throw new RuntimeException("Unable to read all bytes from file");
                                                } catch (Throwable th) {
                                                    try {
                                                        fileInputStream.close();
                                                    } catch (Throwable th2) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (IllegalStateException e) {
                                                throw new RuntimeException("Couldn't update the hash.", e);
                                            }
                                        } catch (IllegalArgumentException e2) {
                                            throw new RuntimeException("Invalid arguments", e2);
                                        } catch (NoSuchAlgorithmException e3) {
                                            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e3);
                                        }
                                    } catch (UnsupportedEncodingException e4) {
                                        throw new RuntimeException("UTF_8 encoding is not supported.", e4);
                                    } catch (IOException e5) {
                                        throw new RuntimeException("Couldn't read the content.", e5);
                                    }
                                } catch (InvalidKeyException e6) {
                                    throw new RuntimeException("Invalid secret key.", e6);
                                } catch (Exception e7) {
                                    throw new RuntimeException("Unexpected exception", e7);
                                }
                            }
                            throw new FileNotFoundException(AnonymousClass001.A0R("File does not exist. Url: ", str));
                        }
                        throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid input file Url: ", str));
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0R("Url MUST be of 'file:' scheme. Found: ", scheme));
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("Invalid fileUrlString: ", str));
            } catch (RuntimeException e8) {
                C0K8.A05(DefaultCrypto.class, "computeSHA256 with fileUrl: exception occurred", e8);
                return null;
            }
        } catch (FileNotFoundException | IllegalArgumentException | SecurityException e9) {
            throw new RuntimeException("Exception while parsing fileUrl", e9);
        }
    }

    @Override // com.facebook.msys.mci.Crypto
    public final String computeSHA256(byte[] bArr, String str) {
        C02R.A03(bArr, "file bytes can not be null");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str.getBytes(ReactWebViewManager.HTML_ENCODING), "HmacSHA256"));
            return SUX.A00(mac.doFinal(bArr)).toLowerCase(Locale.US);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF_8 encoding is not supported.", e);
        } catch (InvalidKeyException e2) {
            throw new RuntimeException("Invalid secret key.", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("HMAC SHA256 algorithm is not found.", e3);
        }
    }
}
