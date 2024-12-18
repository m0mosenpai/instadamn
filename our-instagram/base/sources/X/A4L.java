package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A4L {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final C200828uP A03;
    public static final C200828uP A04;
    public static final C200828uP A05;
    public static final C200838uQ A06;
    public static final C200838uQ A07;
    public static final C200838uQ A08;
    public static final C200838uQ A09;
    public static final C200838uQ A0A;
    public static final C200838uQ A0B;
    public static final C200838uQ A0C;
    public static final C200838uQ A0D;
    public static final C200838uQ A0E;
    public static final C200838uQ A0F;
    public static final C200838uQ A0G;
    public static final C200838uQ A0H;
    public static final C200838uQ A0I;
    public static final C200838uQ A0J;
    public static final C200838uQ A0K;
    public static final C200838uQ A0L;
    public static final C200838uQ A0M;

    static {
        C200828uP c200828uP = new C200828uP("user_values", "name='active_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        A03 = c200828uP;
        C200828uP c200828uP2 = new C200828uP("user_values", "name='saved_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        A05 = c200828uP2;
        C200828uP c200828uP3 = new C200828uP("user_values", "name='all_session_info'", new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, IntentModule.EXTRA_MAP_KEY_FOR_VALUE});
        A04 = c200828uP3;
        EnumC200798uM enumC200798uM = EnumC200798uM.FACEBOOK;
        C0B5 c0b5 = AbstractC08760ce.A0d;
        C200838uQ c200838uQ = new C200838uQ(c0b5, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", c200828uP, enumC200798uM);
        A09 = c200838uQ;
        C200838uQ c200838uQ2 = new C200838uQ(c0b5, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", c200828uP, enumC200798uM);
        A06 = c200838uQ2;
        C200838uQ c200838uQ3 = new C200838uQ(c0b5, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", c200828uP2, enumC200798uM);
        A0B = c200838uQ3;
        C200838uQ c200838uQ4 = new C200838uQ(c0b5, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", c200828uP2, enumC200798uM);
        A08 = c200838uQ4;
        C200838uQ c200838uQ5 = new C200838uQ(c0b5, "content://com.facebook.katana.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.katana", c200828uP3, enumC200798uM);
        A0A = c200838uQ5;
        C200838uQ c200838uQ6 = new C200838uQ(c0b5, "content://com.facebook.wakizashi.liteprovider.FirstPartyUserValuesLiteProvider/user_values", "com.facebook.wakizashi", c200828uP3, enumC200798uM);
        A07 = c200838uQ6;
        EnumC200798uM enumC200798uM2 = EnumC200798uM.MESSENGER;
        C200838uQ c200838uQ7 = new C200838uQ(c0b5, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", c200828uP, enumC200798uM2);
        A0H = c200838uQ7;
        EnumC200798uM enumC200798uM3 = EnumC200798uM.MESSENGER_WITH_LITE_PROVIDER;
        C200838uQ c200838uQ8 = new C200838uQ(c0b5, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", c200828uP, enumC200798uM3);
        A0I = c200838uQ8;
        C200838uQ c200838uQ9 = new C200838uQ(c0b5, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", c200828uP2, enumC200798uM2);
        A0L = c200838uQ9;
        C200838uQ c200838uQ10 = new C200838uQ(c0b5, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", c200828uP2, enumC200798uM3);
        A0M = c200838uQ10;
        C200838uQ c200838uQ11 = new C200838uQ(c0b5, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", c200828uP3, enumC200798uM2);
        A0J = c200838uQ11;
        C200838uQ c200838uQ12 = new C200838uQ(c0b5, "content://com.facebook.orca.liteprovider.FamilyAppsUserValuesLiteProvider/user_values", "com.facebook.orca", c200828uP3, enumC200798uM3);
        A0K = c200838uQ12;
        C200828uP c200828uP4 = new C200828uP(null, null, new String[0]);
        EnumC200798uM enumC200798uM4 = EnumC200798uM.INSTAGRAM;
        C0B5 c0b52 = AbstractC08760ce.A0m;
        C200838uQ c200838uQ13 = new C200838uQ(c0b52, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProvider", "com.instagram.android", c200828uP4, enumC200798uM4);
        A0D = c200838uQ13;
        C200838uQ c200838uQ14 = new C200838uQ(c0b52, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProviderV2", "com.instagram.android", new C200828uP(null, null, new String[0]), EnumC200798uM.INSTAGRAM_WITH_V2_PROVIDER);
        A0E = c200838uQ14;
        C200838uQ c200838uQ15 = new C200838uQ(c0b52, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProvider", "com.instagram.android", new C200828uP(null, "name='saved_session_info'", new String[0]), enumC200798uM4);
        A0G = c200838uQ15;
        C200838uQ c200838uQ16 = new C200838uQ(c0b52, "content://com.instagram.liteprovider.FirstPartyUserValuesLiteProvider", "com.instagram.android", new C200828uP(null, "all_session_info", new String[0]), enumC200798uM4);
        A0F = c200838uQ16;
        C200838uQ c200838uQ17 = new C200838uQ(c0b5, "content://com.facebook.lite.provider.LiteUserValuesProvider/user_values", "com.facebook.lite", c200828uP, EnumC200798uM.FACEBOOK_LITE);
        A0C = c200838uQ17;
        A00 = AbstractC16960so.A1Q(c200838uQ, c200838uQ2, c200838uQ7, c200838uQ8, c200838uQ13, c200838uQ14, c200838uQ17);
        A02 = AbstractC16960so.A1Q(c200838uQ3, c200838uQ4, c200838uQ9, c200838uQ10, c200838uQ15);
        A01 = AbstractC16960so.A1Q(c200838uQ5, c200838uQ6, c200838uQ11, c200838uQ12, c200838uQ16);
    }
}
