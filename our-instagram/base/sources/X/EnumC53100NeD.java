package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53100NeD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53100NeD[] A01;
    public static final EnumC53100NeD A02;
    public static final EnumC53100NeD A03;
    public static final EnumC53100NeD A04;
    public static final EnumC53100NeD A05;
    public static final EnumC53100NeD A06;
    public static final EnumC53100NeD A07;
    public static final EnumC53100NeD A08;

    static {
        C51481MoS c51481MoS = new C51481MoS();
        A06 = c51481MoS;
        C51483MoU c51483MoU = new C51483MoU();
        A08 = c51483MoU;
        EnumC53100NeD enumC53100NeD = new EnumC53100NeD() { // from class: X.MoO
        };
        A02 = enumC53100NeD;
        C51478MoP c51478MoP = new C51478MoP();
        A03 = c51478MoP;
        C51479MoQ c51479MoQ = new C51479MoQ();
        A04 = c51479MoQ;
        C51482MoT c51482MoT = new C51482MoT();
        A07 = c51482MoT;
        C51480MoR c51480MoR = new C51480MoR();
        A05 = c51480MoR;
        EnumC53100NeD[] enumC53100NeDArr = {c51481MoS, c51483MoU, enumC53100NeD, c51478MoP, c51479MoQ, c51482MoT, c51480MoR};
        A01 = enumC53100NeDArr;
        A00 = AbstractC12190kN.A00(enumC53100NeDArr);
    }

    public static EnumC53100NeD[] values() {
        return (EnumC53100NeD[]) A01.clone();
    }

    public final String A00() {
        if (this instanceof C51483MoU) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }
        if (this instanceof C51482MoT) {
            return "unSupportedNetworkInitial";
        }
        if (this instanceof C51481MoS) {
            return "unSupportedNetwork";
        }
        if (this instanceof C51480MoR) {
            return "lowMemory";
        }
        if (this instanceof C51479MoQ) {
            return "initialCheckFailed";
        }
        if (this instanceof C51478MoP) {
            return "effectLoadFailed";
        }
        return "avatarLoadFailed";
    }

    public EnumC53100NeD(String str, int i) {
    }
}
