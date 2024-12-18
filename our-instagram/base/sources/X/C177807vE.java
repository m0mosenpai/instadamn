package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7vE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177807vE {
    public EnumC150616qF A00;
    public String A01;
    public final InterfaceC2040690z A02;
    public final AnonymousClass904 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final HashMap A0I;
    public final List A0J;
    public final Map A0K;

    public C177807vE(InterfaceC2040690z interfaceC2040690z, AnonymousClass904 anonymousClass904, EnumC150616qF enumC150616qF, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, HashMap hashMap, List list, Map map) {
        this.A0I = hashMap;
        this.A0F = str13;
        this.A0G = str14;
        this.A0D = str11;
        this.A0E = str12;
        this.A06 = str4;
        this.A0A = str8;
        this.A0B = str9;
        this.A0C = str10;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = enumC150616qF;
        this.A03 = anonymousClass904;
        this.A0K = map;
        this.A09 = str7;
        this.A0H = str15;
        this.A08 = str6;
        this.A0J = list;
        this.A02 = interfaceC2040690z;
        this.A01 = str3;
        this.A07 = str5;
    }

    public final boolean A00(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C177807vE c177807vE = (C177807vE) obj;
        return C2I7.A00(this.A0I, c177807vE.A0I) && C2I7.A00(this.A0F, c177807vE.A0F) && C2I7.A00(this.A0G, c177807vE.A0G) && C2I7.A00(this.A0D, c177807vE.A0D) && C2I7.A00(this.A0E, c177807vE.A0E) && C2I7.A00(this.A09, c177807vE.A09) && C2I7.A00(this.A0H, c177807vE.A0H) && C2I7.A00(this.A08, c177807vE.A08) && C2I7.A00(this.A06, c177807vE.A06) && C2I7.A00(this.A0A, c177807vE.A0A) && C2I7.A00(this.A0B, c177807vE.A0B) && C2I7.A00(this.A0C, c177807vE.A0C) && C2I7.A00(this.A0K, c177807vE.A0K) && C2I7.A00(this.A04, c177807vE.A04) && C2I7.A00(this.A05, c177807vE.A05) && C2I7.A00(this.A0J, c177807vE.A0J) && this.A00 == c177807vE.A00 && C2I7.A00(this.A02, c177807vE.A02) && C2I7.A00(this.A03, c177807vE.A03) && C2I7.A00(this.A07, c177807vE.A07);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbMsqrdConfig{hashCode=");
        sb.append(hashCode());
        sb.append(" effectId=");
        sb.append(this.A0A);
        sb.append(" effectInstanceId=");
        sb.append(this.A0B);
        sb.append(" effectName=");
        sb.append(this.A0C);
        sb.append(" effectSessionId=");
        sb.append(this.A07);
        sb.append(" deliveryOperationId=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }
}
