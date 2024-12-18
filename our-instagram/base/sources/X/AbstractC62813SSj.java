package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Base64;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.push.IgPushRegistrationService;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.List;
import kotlin.enums.EnumEntries;

/* renamed from: X.SSj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62813SSj {
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0182: INVOKE (r2 I:android.content.Intent) = 
      (r9v0 ?? I:android.content.Context)
      (r8v0 ?? I:com.instagram.common.notifications.push.intf.PushChannelType)
      (r7v0 ?? I:java.lang.String)
      (r4v0 ?? I:int)
      (r3 I:boolean)
     STATIC call: X.SSj.A01(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent A[MD:(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent (m)] (LINE:386), block:B:59:0x0179 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0182: INVOKE (r2 I:android.content.Intent) = 
      (r9v0 ?? I:android.content.Context)
      (r8v0 ?? I:com.instagram.common.notifications.push.intf.PushChannelType)
      (r7v0 ?? I:java.lang.String)
      (r4 I:int)
      (r3 I:boolean)
     STATIC call: X.SSj.A01(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent A[MD:(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent (m)] (LINE:386), block:B:59:0x0179 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0188: INVOKE (r2v1 ?? I:android.content.Intent), (r0v1 ?? I:java.lang.String), (r5 I:java.lang.String) VIRTUAL call: android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent A[MD:(java.lang.String, java.lang.String):android.content.Intent (c)] (LINE:392), block:B:59:0x0179 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x018f: INSTANCE_OF (r0 I:boolean) = (r6 I:??[OBJECT, ARRAY]) (LINE:399) com.instagram.common.session.UserSession, block:B:59:0x0179 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0182: INVOKE (r2 I:android.content.Intent) = 
      (r9v0 ?? I:android.content.Context)
      (r8v0 ?? I:com.instagram.common.notifications.push.intf.PushChannelType)
      (r7 I:java.lang.String)
      (r4 I:int)
      (r3 I:boolean)
     STATIC call: X.SSj.A01(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent A[MD:(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent (m)] (LINE:386), block:B:59:0x0179 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0182: INVOKE (r2 I:android.content.Intent) = 
      (r9v0 ?? I:android.content.Context)
      (r8 I:com.instagram.common.notifications.push.intf.PushChannelType)
      (r7 I:java.lang.String)
      (r4 I:int)
      (r3 I:boolean)
     STATIC call: X.SSj.A01(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent A[MD:(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent (m)] (LINE:386), block:B:59:0x0179 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0182: INVOKE (r2 I:android.content.Intent) = 
      (r9 I:android.content.Context)
      (r8 I:com.instagram.common.notifications.push.intf.PushChannelType)
      (r7 I:java.lang.String)
      (r4 I:int)
      (r3 I:boolean)
     STATIC call: X.SSj.A01(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent A[MD:(android.content.Context, com.instagram.common.notifications.push.intf.PushChannelType, java.lang.String, int, boolean):android.content.Intent (m)] (LINE:386), block:B:59:0x0179 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ll] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.instagram.common.notifications.push.intf.PushChannelType] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context] */
    public static Intent A00(Context context, PushChannelType pushChannelType, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, int i, boolean z) {
        ?? A01;
        ?? A012;
        ?? A013;
        ?? A014;
        ?? A015;
        String putExtra;
        ?? r6;
        KeyPair generateKeyPair;
        try {
            C62661SKv A00 = C62661SKv.A00(context);
            try {
                generateKeyPair = A00.A01("HPKE_CLIENT_KEYPAIR");
            } catch (Resources.NotFoundException unused) {
                BigInteger bigInteger = AbstractC63124SdS.A01;
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
                if (keyPairGenerator != null) {
                    keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
                    generateKeyPair = keyPairGenerator.generateKeyPair();
                    synchronized (A00) {
                        try {
                            try {
                                SharedPreferencesC63448SkR A002 = AbstractC62265S4k.A00(A00.A00);
                                if (!A002.contains(AnonymousClass001.A0R("pk_", "HPKE_CLIENT_KEYPAIR"))) {
                                    if (!A002.contains(AnonymousClass001.A0R("sk_", "HPKE_CLIENT_KEYPAIR"))) {
                                        try {
                                            SharedPreferencesC63448SkR A003 = AbstractC62265S4k.A00(A00.A00);
                                            if (!A003.contains(AnonymousClass001.A0R("pk_", "HPKE_CLIENT_KEYPAIR")) && !A003.contains(AnonymousClass001.A0R("sk_", "HPKE_CLIENT_KEYPAIR"))) {
                                                String encodeToString = Base64.encodeToString(((ECPublicKey) generateKeyPair.getPublic()).getEncoded(), 0);
                                                AbstractC58318PtA.A1C(A003.edit().putString(AnonymousClass001.A0R("pk_", "HPKE_CLIENT_KEYPAIR"), encodeToString), AnonymousClass001.A0R("sk_", "HPKE_CLIENT_KEYPAIR"), Base64.encodeToString(((ECPrivateKey) generateKeyPair.getPrivate()).getEncoded(), 0));
                                            } else {
                                                throw new KeyStoreException("KeyAlias already exists in store. The entry must be explicitly deleted before overwriting it.");
                                            }
                                        } catch (IllegalArgumentException | SecurityException | GeneralSecurityException e) {
                                            throw new KeyStoreException(e);
                                        }
                                    }
                                }
                                generateKeyPair = A00.A01("HPKE_CLIENT_KEYPAIR");
                            } catch (IllegalArgumentException | SecurityException | GeneralSecurityException e2) {
                                throw new KeyStoreException(e2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    throw new NoSuchAlgorithmException("Could not get instance of KeyPairGenerator for algorithm EC.");
                }
            }
            if (generateKeyPair.getPublic() instanceof ECPublicKey) {
                AbstractC63124SdS.A00(((ECPublicKey) generateKeyPair.getPublic()).getW());
                if (generateKeyPair.getPrivate() instanceof ECPrivateKey) {
                    EnumEntries enumEntries = EnumC61157RgI.A02;
                    EnumEntries enumEntries2 = EnumC61178Rge.A03;
                    EnumEntries enumEntries3 = EnumC61181Rgh.A03;
                    EnumEntries enumEntries4 = EnumC61186Rgm.A04;
                    Intent A016 = A01(context, pushChannelType, str, i, z);
                    A016.putExtra("PushRegistrationService.USER_ID", str2);
                    A016.putExtra("PushRegistrationService.TRIGGER", str3);
                    if (generateKeyPair.getPublic() instanceof ECPublicKey) {
                        A016.putExtra("PushRegistrationService.HPKE_CLIENT_PUBLIC_KEY", Base64.encodeToString(AbstractC63124SdS.A01(((ECPublicKey) generateKeyPair.getPublic()).getW()), 2));
                        A016.putExtra("PushRegistrationService.HPKE_CLIENT_KEYSTORE_ID", "HPKE_CLIENT_KEYPAIR");
                        A016.putExtra("PushRegistrationService.HPKE_CIPHERSUITE", Long.toHexString((1 << 48) + (16 << 32) + (1 << 16) + (0 << 8)));
                        List A1E = AbstractC166987dD.A1E();
                        if (abstractC12990ll instanceof UserSession) {
                            A1E = ((C17110t6) C0BQ.A00(abstractC12990ll)).BOc(null);
                        }
                        A016.putExtra("PushRegistrationService.LOGGED_IN_USERS", C71473Il.A00(',').A02(A1E));
                        return A016;
                    }
                    throw AbstractC166987dD.A1D("Non-EC keys are not supported for encoding");
                }
                throw new KeyStoreException("Key retrieved from keystore is not an ECPrivateKey");
            }
            throw new KeyStoreException("Key retrieved from keystore is not an ECPublicKey");
        } catch (Resources.NotFoundException | UnsupportedOperationException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException e3) {
            C0w9.A02(EnumC12410kj.A09, "PushNotificationManager_hpke_error", "Error while registering token with HPKE encryption paramaters", e3);
            Intent A017 = A01(A01, A012, A013, A014, A015);
            A017.putExtra("PushRegistrationService.USER_ID", putExtra);
            List A1E2 = AbstractC166987dD.A1E();
            if (r6 instanceof UserSession) {
                A1E2 = ((C17110t6) C0BQ.A00(r6)).BOc(null);
            }
            A017.putExtra("PushRegistrationService.LOGGED_IN_USERS", C71473Il.A00(',').A02(A1E2));
            return A017;
        }
    }

    public static Intent A01(Context context, PushChannelType pushChannelType, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) IgPushRegistrationService.class);
        intent.putExtra("PushRegistrationService.GUID", C16030qx.A02.A05(context));
        intent.putExtra("PushRegistrationService.DEVICE_TOKEN", str);
        intent.putExtra("PushRegistrationService.PUSH_DEVICE_TYPE", pushChannelType);
        intent.putExtra("PushRegistrationService.PUSH_CHANNEL_TYPE", pushChannelType.A01);
        intent.putExtra("PushRegistrationService.IS_MAIN_PUSH_CHANNEL", z);
        intent.putExtra("PushRegistrationService.PUSH_DEVICE_SUB_TYPE", i);
        return intent;
    }
}
