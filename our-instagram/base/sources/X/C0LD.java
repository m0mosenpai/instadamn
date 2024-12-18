package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0LD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LD implements InterfaceC08580cM {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.lang.String] */
    @Override // X.InterfaceC08580cM
    public final void ACr(Context context, String str, String str2) {
        JSONArray jSONArray;
        String length;
        Signature signature;
        boolean z;
        String packageName = context.getPackageName();
        try {
            try {
                try {
                    InputStream open = context.createPackageContext(str, 0).getAssets().open("fbpermissions.json");
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                sb.append(readLine);
                            }
                        }
                        bufferedReader.close();
                        if (sb.length() != 0) {
                            JSONObject jSONObject = new JSONObject(sb.toString());
                            if (jSONObject.has(packageName)) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(packageName);
                                HashSet hashSet = new HashSet();
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("permissions");
                                if (jSONArray2.length() != 0) {
                                    int i = 0;
                                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                        hashSet.add(jSONArray2.getString(i2));
                                    }
                                    if (jSONObject2.has("signatures")) {
                                        jSONArray = jSONObject2.getJSONArray("signatures");
                                    } else {
                                        jSONArray = new JSONArray();
                                        jSONArray.put(jSONObject2.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE));
                                    }
                                    HashSet hashSet2 = new HashSet();
                                    while (true) {
                                        length = jSONArray.length();
                                        if (i >= length) {
                                            break;
                                        }
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                        hashSet2.add(new C08570cL(jSONObject3.getString("algorithm"), jSONObject3.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                                        i++;
                                    }
                                    if (open != null) {
                                        open.close();
                                    }
                                    try {
                                        length = str2;
                                        String str3 = AbstractC08450c9.A01(context, str).A00;
                                        if (str3 != null && !str3.isEmpty()) {
                                            try {
                                                long longVersionCode = AbstractC08120bY.A02(context, str, 0).A01.getLongVersionCode();
                                                if (longVersionCode > 0) {
                                                    boolean z2 = false;
                                                    if (!hashSet2.isEmpty() && !hashSet.isEmpty()) {
                                                        Iterator it = hashSet2.iterator();
                                                        while (it.hasNext()) {
                                                            C08570cL c08570cL = (C08570cL) it.next();
                                                            if (!TextUtils.isEmpty(c08570cL.A00)) {
                                                                z = true;
                                                                if (!TextUtils.isEmpty(c08570cL.A01)) {
                                                                    z2 |= z;
                                                                }
                                                            }
                                                            z = false;
                                                            z2 |= z;
                                                        }
                                                        if (z2) {
                                                            try {
                                                                String packageName2 = context.getPackageName();
                                                                C08110bX A00 = AbstractC08450c9.A00(context, packageName);
                                                                C08130ba A002 = A00.A00();
                                                                if (A002 != null) {
                                                                    PublicKey publicKey = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(((android.content.pm.Signature) A002.A00.get(0)).toByteArray())).getPublicKey();
                                                                    if (hashSet.contains(length)) {
                                                                        if (!hashSet2.isEmpty()) {
                                                                            try {
                                                                                String A0Q = AnonymousClass001.A0Q("", longVersionCode);
                                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                                byteArrayOutputStream.write(-5);
                                                                                byteArrayOutputStream.write(0);
                                                                                TreeSet treeSet = new TreeSet(hashSet);
                                                                                if (treeSet.size() <= 255) {
                                                                                    ArrayList arrayList = new ArrayList();
                                                                                    Iterator it2 = treeSet.iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        byte[] bytes = ((String) it2.next()).getBytes(AbstractC08540cI.A00);
                                                                                        if (bytes.length <= 255) {
                                                                                            arrayList.add(bytes);
                                                                                        } else {
                                                                                            throw new Exception("String size (UTF-8 encoded) cannot exceed 255");
                                                                                        }
                                                                                    }
                                                                                    byteArrayOutputStream.write(1);
                                                                                    byteArrayOutputStream.write(treeSet.size() & 255);
                                                                                    Iterator it3 = arrayList.iterator();
                                                                                    while (it3.hasNext()) {
                                                                                        byte[] bArr = (byte[]) it3.next();
                                                                                        int length2 = bArr.length;
                                                                                        byteArrayOutputStream.write(length2 & 255);
                                                                                        byteArrayOutputStream.write(bArr, 0, length2);
                                                                                    }
                                                                                    Charset charset = AbstractC08540cI.A00;
                                                                                    byte[] bytes2 = str.getBytes(charset);
                                                                                    int length3 = bytes2.length;
                                                                                    if (length3 <= 255) {
                                                                                        byteArrayOutputStream.write(2);
                                                                                        byteArrayOutputStream.write(length3 & 255);
                                                                                        byteArrayOutputStream.write(bytes2, 0, length3);
                                                                                        byte[] bytes3 = A0Q.getBytes(charset);
                                                                                        int length4 = bytes3.length;
                                                                                        if (length4 <= 255) {
                                                                                            byteArrayOutputStream.write(3);
                                                                                            byteArrayOutputStream.write(length4 & 255);
                                                                                            byteArrayOutputStream.write(bytes3, 0, length4);
                                                                                            byte[] bytes4 = str3.getBytes(charset);
                                                                                            int length5 = bytes4.length;
                                                                                            if (length5 <= 255) {
                                                                                                byteArrayOutputStream.write(4);
                                                                                                byteArrayOutputStream.write(length5 & 255);
                                                                                                byteArrayOutputStream.write(bytes4, 0, length5);
                                                                                                byte[] bytes5 = packageName2.getBytes(charset);
                                                                                                int length6 = bytes5.length;
                                                                                                if (length6 <= 255) {
                                                                                                    byteArrayOutputStream.write(5);
                                                                                                    byteArrayOutputStream.write(length6 & 255);
                                                                                                    byteArrayOutputStream.write(bytes5, 0, length6);
                                                                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                                                    byteArray[1] = 5;
                                                                                                    Iterator it4 = hashSet2.iterator();
                                                                                                    while (it4.hasNext()) {
                                                                                                        C08570cL c08570cL2 = (C08570cL) it4.next();
                                                                                                        byte[] decode = Base64.decode(c08570cL2.A01, 10);
                                                                                                        try {
                                                                                                            signature = Signature.getInstance(c08570cL2.A00);
                                                                                                            signature.initVerify(publicKey);
                                                                                                            signature.update(byteArray);
                                                                                                        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
                                                                                                        }
                                                                                                        if (signature.verify(decode)) {
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                    throw new SecurityException(AnonymousClass001.A15("Permission '", length, "' is contained in the set of permissions, but is not specifically granted to '", str, "' by '", packageName2, "'"));
                                                                                                }
                                                                                                throw new Exception("String size (UTF-8 encoded) cannot exceed 255");
                                                                                            }
                                                                                            throw new Exception("String size (UTF-8 encoded) cannot exceed 255");
                                                                                        }
                                                                                        throw new Exception("String size (UTF-8 encoded) cannot exceed 255");
                                                                                    }
                                                                                    throw new Exception("String size (UTF-8 encoded) cannot exceed 255");
                                                                                }
                                                                                throw new Exception("Collection size (duplicates removed) cannot exceed 255");
                                                                            } catch (C08530cH e) {
                                                                                throw new SecurityException("Unable to encode data for signature validation", e);
                                                                            }
                                                                        }
                                                                        throw new SecurityException("Empty signature list in the grants");
                                                                    }
                                                                    throw new SecurityException(AnonymousClass001.A0g("Permission '", length, "' is not contained in the set of permissions granted"));
                                                                }
                                                                throw new SecurityException(A00.A02);
                                                            } catch (SecurityException e2) {
                                                                throw new SecurityException("Failed to get provider package signature", e2);
                                                            } catch (CertificateException e3) {
                                                                throw new SecurityException("Unable to parse consumer package certificate", e3);
                                                            }
                                                        }
                                                    }
                                                    throw new SecurityException(AnonymousClass001.A11("Invalid signature or algorithm for package '", str, "' while verifying '", length, "'"));
                                                }
                                                throw new SecurityException(AnonymousClass001.A11("Invalid version code for package '", str, "' while verifying '", length, "'"));
                                            } catch (PackageManager.NameNotFoundException | RuntimeException e4) {
                                                throw new SecurityException(AnonymousClass001.A11("Exception in getting version code for package '", str, "' while verifying '", length, "'"), e4);
                                            }
                                        }
                                        throw new SecurityException(AnonymousClass001.A11("Empty developer key for package '", str, "' while verifying '", length, "'"));
                                    } catch (SecurityException e5) {
                                        throw new SecurityException(AnonymousClass001.A11("Invalid developer key for package '", str, "' while verifying '", length, "'"), e5);
                                    }
                                }
                                throw new JSONException("Empty permissions list");
                            }
                        }
                    } catch (Throwable th) {
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                        }
                        throw th;
                    }
                } catch (JSONException e6) {
                    throw new SecurityException(AnonymousClass001.A0g("Failed to decode FBPermission asset file from package '", str, "'"), e6);
                }
            } catch (IOException e7) {
            }
        } catch (PackageManager.NameNotFoundException e8) {
            throw new SecurityException(AnonymousClass001.A0g("Cannot create package context for '", str, "'"), e8);
        }
    }
}
