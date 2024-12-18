package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.SQo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62772SQo {
    public static final C45126Jxv A00(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        return new C45126Jxv(new QIp(AbstractC166987dD.A1A("email", map), AbstractC166987dD.A1A("given-name", map), AbstractC166987dD.A1A("family-name", map), AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map), AbstractC166987dD.A1A("address-line1", map), AbstractC166987dD.A1A("address-line2", map), AbstractC166987dD.A1A("address-line3", map), AbstractC166987dD.A1A("address-level1", map), AbstractC166987dD.A1A("address-level2", map), AbstractC166987dD.A1A("address-level3", map), AbstractC166987dD.A1A("address-level4", map), AbstractC166987dD.A1A("postal-code", map), AbstractC166987dD.A1A("street-address", map), AbstractC166987dD.A1A("tel", map), AbstractC58318PtA.A0i("tel-area-code", map), AbstractC58318PtA.A0i("tel-country-code", map), AbstractC58318PtA.A0i("tel-local", map), AbstractC58318PtA.A0i("tel-local-prefix", map), AbstractC58318PtA.A0i("tel-local-suffix", map), AbstractC58318PtA.A0i("tel-national", map), AbstractC58318PtA.A0i("country", map), AbstractC58318PtA.A0i("country-name", map), 0), AbstractC166987dD.A1A("ent_id", map), AbstractC166987dD.A1A("usage_frequency", map), AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map), 0);
    }

    public static final Map A01(C45126Jxv c45126Jxv) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        if (c45126Jxv == null) {
            return AbstractC06930Yk.A0E();
        }
        QIp qIp = (QIp) c45126Jxv.A00;
        String str22 = null;
        if (qIp != null) {
            str = qIp.A0M;
        } else {
            str = null;
        }
        C09530e4 A1L = AbstractC166987dD.A1L("email", str);
        if (qIp != null) {
            str2 = qIp.A04;
        } else {
            str2 = null;
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("given-name", str2);
        if (qIp != null) {
            str3 = qIp.A03;
        } else {
            str3 = null;
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L("family-name", str3);
        if (qIp != null) {
            str4 = qIp.A05;
        } else {
            str4 = null;
        }
        C09530e4 A1L4 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
        if (qIp != null) {
            str5 = qIp.A0H;
        } else {
            str5 = null;
        }
        C09530e4 A1L5 = AbstractC166987dD.A1L("address-line1", str5);
        if (qIp != null) {
            str6 = qIp.A0I;
        } else {
            str6 = null;
        }
        C09530e4 A1L6 = AbstractC166987dD.A1L("address-line2", str6);
        if (qIp != null) {
            str7 = qIp.A0J;
        } else {
            str7 = null;
        }
        C09530e4 A1L7 = AbstractC166987dD.A1L("address-line3", str7);
        if (qIp != null) {
            str8 = qIp.A01;
        } else {
            str8 = null;
        }
        C09530e4 A1L8 = AbstractC166987dD.A1L("address-level1", str8);
        if (qIp != null) {
            str9 = qIp.A02;
        } else {
            str9 = null;
        }
        C09530e4 A1L9 = AbstractC166987dD.A1L("address-level2", str9);
        if (qIp != null) {
            str10 = qIp.A0D;
        } else {
            str10 = null;
        }
        C09530e4 A1L10 = AbstractC166987dD.A1L("address-level3", str10);
        if (qIp != null) {
            str11 = qIp.A0G;
        } else {
            str11 = null;
        }
        C09530e4 A1L11 = AbstractC166987dD.A1L("address-level4", str11);
        if (qIp != null) {
            str12 = qIp.A06;
        } else {
            str12 = null;
        }
        C09530e4 A1L12 = AbstractC166987dD.A1L("postal-code", str12);
        if (qIp != null) {
            str13 = qIp.A07;
        } else {
            str13 = null;
        }
        C09530e4 A1L13 = AbstractC166987dD.A1L("street-address", str13);
        if (qIp != null) {
            str14 = qIp.A08;
        } else {
            str14 = null;
        }
        C09530e4 A1L14 = AbstractC166987dD.A1L("tel", str14);
        if (qIp != null) {
            str15 = qIp.A09;
        } else {
            str15 = null;
        }
        C09530e4 A1L15 = AbstractC166987dD.A1L("tel-area-code", str15);
        if (qIp != null) {
            str16 = qIp.A0A;
        } else {
            str16 = null;
        }
        C09530e4 A1L16 = AbstractC166987dD.A1L("tel-country-code", str16);
        if (qIp != null) {
            str17 = qIp.A0B;
        } else {
            str17 = null;
        }
        C09530e4 A1L17 = AbstractC166987dD.A1L("tel-local", str17);
        if (qIp != null) {
            str18 = qIp.A0C;
        } else {
            str18 = null;
        }
        C09530e4 A1L18 = AbstractC166987dD.A1L("tel-local-prefix", str18);
        if (qIp != null) {
            str19 = qIp.A0E;
        } else {
            str19 = null;
        }
        C09530e4 A1L19 = AbstractC166987dD.A1L("tel-local-suffix", str19);
        if (qIp != null) {
            str20 = qIp.A0F;
        } else {
            str20 = null;
        }
        C09530e4 A1L20 = AbstractC166987dD.A1L("tel-national", str20);
        if (qIp != null) {
            str21 = qIp.A0K;
        } else {
            str21 = null;
        }
        C09530e4 A1L21 = AbstractC166987dD.A1L("country", str21);
        if (qIp != null) {
            str22 = qIp.A0L;
        }
        return AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, AbstractC166987dD.A1L("country-name", str22), AbstractC166987dD.A1L("ent_id", c45126Jxv.A01), AbstractC166987dD.A1L("usage_frequency", c45126Jxv.A03), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c45126Jxv.A02));
    }
}
