package com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata;

import X.AbstractC111324zv;
import X.AbstractC58317Pt9;
import X.AnonymousClass317;
import X.C0T6;
import X.C9CQ;
import X.EnumC64222vh;
import X.EnumC64262vl;
import X.EnumC74603Ws;
import X.MSV;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import java.util.Map;

@AutoGenJsonSerializer
@JsonDeserialize(using = ParcelableSignalDataDeserializer.class)
@JsonSerialize(using = ParcelableSignalDataSerializer.class)
@AutoGenJsonDeserializer
/* loaded from: classes2.dex */
public final class ParcelableSignalData extends C0T6 {
    public C9CQ A00;
    public EnumC64262vl A01;
    public EnumC74603Ws A02;
    public AnonymousClass317 A03;
    public EnumC64222vh A04;
    public Boolean A05;
    public Boolean A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public List A0f;
    public Map A0g;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ParcelableSignalData(signalId=");
        sb.append(this.A0a);
        sb.append(AbstractC111324zv.A00(1455));
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(1453));
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(3448));
        sb.append(this.A04);
        sb.append(", itemId=");
        sb.append(this.A0V);
        sb.append(", itemType=");
        sb.append(this.A01);
        sb.append(AbstractC58317Pt9.A00(60));
        sb.append(this.A0Z);
        sb.append(", mediaId=");
        sb.append(this.A0W);
        sb.append(", mediaTimeSpent=");
        sb.append(this.A0K);
        sb.append(", mediaLastSeenTimestamp=");
        sb.append(this.A0J);
        sb.append(", mediaPercentVisible=");
        sb.append(this.A07);
        sb.append(", containerModule=");
        sb.append(this.A0T);
        sb.append(AbstractC111324zv.A00(280));
        sb.append(this.A0U);
        sb.append(AbstractC111324zv.A00(1398));
        sb.append(this.A0R);
        sb.append(", mediaIds=");
        sb.append(this.A0f);
        sb.append(AbstractC111324zv.A00(3357));
        sb.append(this.A0H);
        sb.append(AbstractC111324zv.A00(3356));
        sb.append(this.A0S);
        sb.append(AbstractC111324zv.A00(581));
        sb.append(this.A0M);
        sb.append(AbstractC111324zv.A00(580));
        sb.append(this.A0e);
        sb.append(MSV.A00(295));
        sb.append(this.A0Y);
        sb.append(AbstractC111324zv.A00(1437));
        sb.append(this.A00);
        sb.append(AbstractC111324zv.A00(1454));
        sb.append(this.A0L);
        sb.append(AbstractC111324zv.A00(1452));
        sb.append(this.A0b);
        sb.append(AbstractC111324zv.A00(52));
        sb.append(this.A0N);
        sb.append(", multiAdsType=");
        sb.append(this.A0E);
        sb.append(", gapToLastAd=");
        sb.append(this.A0B);
        sb.append(", gapToLastNetego=");
        sb.append(this.A0C);
        sb.append(", clientInsertionPosition=");
        sb.append(this.A0A);
        sb.append(", reelGapToLastAd=");
        sb.append(this.A0G);
        sb.append(", adConsumedMediaGap=");
        sb.append(this.A08);
        sb.append(", numMediaConsumedInAd=");
        sb.append(this.A0F);
        sb.append(MSV.A00(23));
        sb.append(this.A0c);
        sb.append(", impSignature=");
        sb.append(this.A0D);
        sb.append(", afiId=");
        sb.append(this.A0O);
        sb.append(AbstractC111324zv.A00(1414));
        sb.append(this.A0g);
        sb.append(AbstractC111324zv.A00(1393));
        sb.append(this.A0P);
        sb.append(AbstractC111324zv.A00(1417));
        sb.append(this.A0I);
        sb.append(AbstractC111324zv.A00(282));
        sb.append(this.A0X);
        sb.append(AbstractC111324zv.A00(1462));
        sb.append(this.A0d);
        sb.append(AbstractC111324zv.A00(1396));
        sb.append(this.A0Q);
        sb.append(AbstractC111324zv.A00(1392));
        Integer num = this.A09;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "RESPONSE";
            } else {
                str = "UNDO";
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", noBounceClientLogging=");
        sb.append(this.A06);
        sb.append(", isAdClick=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    public ParcelableSignalData(EnumC64262vl enumC64262vl, Boolean bool, Boolean bool2, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, Map map) {
        this.A0a = null;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
        this.A0V = str;
        this.A01 = enumC64262vl;
        this.A0Z = str2;
        this.A0W = str3;
        this.A0K = l;
        this.A0J = l2;
        this.A07 = f;
        this.A0T = str4;
        this.A0U = str5;
        this.A0R = str6;
        this.A0f = list;
        this.A0H = l3;
        this.A0S = str7;
        this.A0M = l4;
        this.A0e = str8;
        this.A0Y = str9;
        this.A00 = null;
        this.A0L = l5;
        this.A0b = str10;
        this.A0N = str11;
        this.A0E = num;
        this.A0B = num2;
        this.A0C = num3;
        this.A0A = num4;
        this.A0G = num5;
        this.A08 = num6;
        this.A0F = num7;
        this.A0c = str12;
        this.A0D = num8;
        this.A0O = str13;
        this.A0g = map;
        this.A0P = str14;
        this.A0I = l6;
        this.A0X = str15;
        this.A0d = str16;
        this.A0Q = str17;
        this.A09 = num9;
        this.A06 = bool;
        this.A05 = bool2;
    }

    public ParcelableSignalData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
