package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.video.common.events.IgRtcEventHeader;

/* loaded from: classes4.dex */
public abstract class AES {
    public static final RtcConnectionEntity A00(EnumC53186Nfi enumC53186Nfi, RtcConnectionEntity rtcConnectionEntity, String str) {
        RtcConnectionEntity rtcCallGenericConnectionEntity;
        if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
            String str2 = rtcCallConnectionEntity.A0G;
            Integer num = rtcCallConnectionEntity.A08;
            Integer num2 = rtcCallConnectionEntity.A07;
            RtcIgNotification rtcIgNotification = rtcCallConnectionEntity.A04;
            Long l = rtcCallConnectionEntity.A09;
            String str3 = rtcCallConnectionEntity.A0H;
            String str4 = rtcCallConnectionEntity.A0I;
            String str5 = rtcCallConnectionEntity.A0J;
            String str6 = rtcCallConnectionEntity.A0K;
            String str7 = rtcCallConnectionEntity.A0B;
            String str8 = rtcCallConnectionEntity.A0C;
            String str9 = rtcCallConnectionEntity.A0A;
            String str10 = rtcCallConnectionEntity.A0D;
            String str11 = rtcCallConnectionEntity.A0E;
            EnumC53137Neq enumC53137Neq = rtcCallConnectionEntity.A01;
            boolean z = rtcCallConnectionEntity.A0M;
            EnumC53138Ner enumC53138Ner = rtcCallConnectionEntity.A02;
            boolean z2 = rtcCallConnectionEntity.A0L;
            boolean z3 = rtcCallConnectionEntity.A0N;
            IgRtcEventHeader igRtcEventHeader = rtcCallConnectionEntity.A06;
            RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
            C14360o3.A0B(str2, 1);
            AbstractC167017dG.A1R(num, num2);
            AbstractC167007dF.A1I(str3, 7, str4);
            C14360o3.A0B(str7, 11);
            C14360o3.A0B(enumC53137Neq, 16);
            C14360o3.A0B(enumC53138Ner, 18);
            C14360o3.A0B(rtcCallKey, 22);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallConnectionEntity(enumC53137Neq, enumC53138Ner, rtcCallKey, rtcIgNotification, enumC53186Nfi, igRtcEventHeader, num, num2, l, str2, str, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, z3);
        } else if (rtcConnectionEntity instanceof RtcConnectionEntity.LiveInviteConnectionEntity) {
            RtcConnectionEntity.LiveInviteConnectionEntity liveInviteConnectionEntity = (RtcConnectionEntity.LiveInviteConnectionEntity) rtcConnectionEntity;
            String str12 = liveInviteConnectionEntity.A08;
            Integer num3 = liveInviteConnectionEntity.A04;
            Integer num4 = liveInviteConnectionEntity.A03;
            String str13 = liveInviteConnectionEntity.A07;
            RtcIgNotification rtcIgNotification2 = liveInviteConnectionEntity.A01;
            Long l2 = liveInviteConnectionEntity.A05;
            String str14 = liveInviteConnectionEntity.A09;
            String str15 = liveInviteConnectionEntity.A0A;
            String str16 = liveInviteConnectionEntity.A0B;
            String str17 = liveInviteConnectionEntity.A06;
            ImageUrl imageUrl = liveInviteConnectionEntity.A00;
            C14360o3.A0B(str12, 1);
            AbstractC167017dG.A1R(num3, num4);
            AbstractC167007dF.A1I(str14, 7, str15);
            C14360o3.A0B(str17, 10);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.LiveInviteConnectionEntity(imageUrl, rtcIgNotification2, enumC53186Nfi, num3, num4, l2, str12, str13, str14, str15, str16, str17);
        } else if (rtcConnectionEntity instanceof RtcConnectionEntity.EndCallConnectionEntity) {
            RtcConnectionEntity.EndCallConnectionEntity endCallConnectionEntity = (RtcConnectionEntity.EndCallConnectionEntity) rtcConnectionEntity;
            String str18 = endCallConnectionEntity.A0C;
            Integer num5 = endCallConnectionEntity.A05;
            Integer num6 = endCallConnectionEntity.A03;
            String str19 = endCallConnectionEntity.A0B;
            RtcIgNotification rtcIgNotification3 = endCallConnectionEntity.A01;
            Long l3 = endCallConnectionEntity.A06;
            String str20 = endCallConnectionEntity.A0D;
            String str21 = endCallConnectionEntity.A0E;
            String str22 = endCallConnectionEntity.A0F;
            String str23 = endCallConnectionEntity.A08;
            String str24 = endCallConnectionEntity.A09;
            String str25 = endCallConnectionEntity.A07;
            String str26 = endCallConnectionEntity.A0A;
            boolean z4 = endCallConnectionEntity.A0H;
            Integer num7 = endCallConnectionEntity.A04;
            EnumC53137Neq enumC53137Neq2 = endCallConnectionEntity.A00;
            boolean z5 = endCallConnectionEntity.A0G;
            C14360o3.A0B(str18, 1);
            AbstractC167017dG.A1R(num5, num6);
            AbstractC167007dF.A1I(str20, 7, str21);
            C14360o3.A0B(enumC53137Neq2, 16);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.EndCallConnectionEntity(enumC53137Neq2, rtcIgNotification3, enumC53186Nfi, num5, num6, num7, l3, str18, str19, str20, str21, str22, str23, str24, str25, str26, z4, z5);
        } else if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallGenericConnectionEntity) {
            RtcConnectionEntity.RtcCallGenericConnectionEntity rtcCallGenericConnectionEntity2 = (RtcConnectionEntity.RtcCallGenericConnectionEntity) rtcConnectionEntity;
            String str27 = rtcCallGenericConnectionEntity2.A06;
            Integer num8 = rtcCallGenericConnectionEntity2.A03;
            Integer num9 = rtcCallGenericConnectionEntity2.A02;
            String str28 = rtcCallGenericConnectionEntity2.A05;
            RtcIgNotification rtcIgNotification4 = rtcCallGenericConnectionEntity2.A00;
            Long l4 = rtcCallGenericConnectionEntity2.A04;
            String str29 = rtcCallGenericConnectionEntity2.A07;
            String str30 = rtcCallGenericConnectionEntity2.A08;
            String str31 = rtcCallGenericConnectionEntity2.A09;
            C14360o3.A0B(str27, 1);
            AbstractC167017dG.A1R(num8, num9);
            AbstractC167007dF.A1I(str29, 7, str30);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallGenericConnectionEntity(rtcIgNotification4, enumC53186Nfi, num8, num9, l4, str27, str28, str29, str30, str31);
        } else {
            throw B4Z.A00();
        }
        return rtcCallGenericConnectionEntity;
    }

    public static final RtcConnectionEntity A01(RtcConnectionEntity rtcConnectionEntity, Long l) {
        RtcConnectionEntity rtcCallGenericConnectionEntity;
        C14360o3.A0B(rtcConnectionEntity, 0);
        if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
            RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
            EnumC53186Nfi enumC53186Nfi = rtcCallConnectionEntity.A05;
            String str = rtcCallConnectionEntity.A0G;
            Integer num = rtcCallConnectionEntity.A08;
            Integer num2 = rtcCallConnectionEntity.A07;
            String str2 = rtcCallConnectionEntity.A0F;
            RtcIgNotification rtcIgNotification = rtcCallConnectionEntity.A04;
            String str3 = rtcCallConnectionEntity.A0H;
            String str4 = rtcCallConnectionEntity.A0I;
            String str5 = rtcCallConnectionEntity.A0J;
            String str6 = rtcCallConnectionEntity.A0K;
            String str7 = rtcCallConnectionEntity.A0B;
            String str8 = rtcCallConnectionEntity.A0C;
            String str9 = rtcCallConnectionEntity.A0A;
            String str10 = rtcCallConnectionEntity.A0D;
            String str11 = rtcCallConnectionEntity.A0E;
            EnumC53137Neq enumC53137Neq = rtcCallConnectionEntity.A01;
            boolean z = rtcCallConnectionEntity.A0M;
            EnumC53138Ner enumC53138Ner = rtcCallConnectionEntity.A02;
            boolean z2 = rtcCallConnectionEntity.A0L;
            boolean z3 = rtcCallConnectionEntity.A0N;
            IgRtcEventHeader igRtcEventHeader = rtcCallConnectionEntity.A06;
            RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
            C14360o3.A0B(enumC53186Nfi, 0);
            AbstractC167027dH.A13(str, num, num2);
            AbstractC167007dF.A1I(str3, 7, str4);
            C14360o3.A0B(str7, 11);
            C14360o3.A0B(enumC53137Neq, 16);
            C14360o3.A0B(enumC53138Ner, 18);
            C14360o3.A0B(rtcCallKey, 22);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallConnectionEntity(enumC53137Neq, enumC53138Ner, rtcCallKey, rtcIgNotification, enumC53186Nfi, igRtcEventHeader, num, num2, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, z2, z3);
        } else if (rtcConnectionEntity instanceof RtcConnectionEntity.LiveInviteConnectionEntity) {
            RtcConnectionEntity.LiveInviteConnectionEntity liveInviteConnectionEntity = (RtcConnectionEntity.LiveInviteConnectionEntity) rtcConnectionEntity;
            EnumC53186Nfi enumC53186Nfi2 = liveInviteConnectionEntity.A02;
            String str12 = liveInviteConnectionEntity.A08;
            Integer num3 = liveInviteConnectionEntity.A04;
            Integer num4 = liveInviteConnectionEntity.A03;
            String str13 = liveInviteConnectionEntity.A07;
            RtcIgNotification rtcIgNotification2 = liveInviteConnectionEntity.A01;
            String str14 = liveInviteConnectionEntity.A09;
            String str15 = liveInviteConnectionEntity.A0A;
            String str16 = liveInviteConnectionEntity.A0B;
            String str17 = liveInviteConnectionEntity.A06;
            ImageUrl imageUrl = liveInviteConnectionEntity.A00;
            C14360o3.A0B(enumC53186Nfi2, 0);
            AbstractC167027dH.A13(str12, num3, num4);
            AbstractC167007dF.A1I(str14, 7, str15);
            C14360o3.A0B(str17, 10);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.LiveInviteConnectionEntity(imageUrl, rtcIgNotification2, enumC53186Nfi2, num3, num4, l, str12, str13, str14, str15, str16, str17);
        } else if (rtcConnectionEntity instanceof RtcConnectionEntity.EndCallConnectionEntity) {
            RtcConnectionEntity.EndCallConnectionEntity endCallConnectionEntity = (RtcConnectionEntity.EndCallConnectionEntity) rtcConnectionEntity;
            EnumC53186Nfi enumC53186Nfi3 = endCallConnectionEntity.A02;
            String str18 = endCallConnectionEntity.A0C;
            Integer num5 = endCallConnectionEntity.A05;
            Integer num6 = endCallConnectionEntity.A03;
            String str19 = endCallConnectionEntity.A0B;
            RtcIgNotification rtcIgNotification3 = endCallConnectionEntity.A01;
            String str20 = endCallConnectionEntity.A0D;
            String str21 = endCallConnectionEntity.A0E;
            String str22 = endCallConnectionEntity.A0F;
            String str23 = endCallConnectionEntity.A08;
            String str24 = endCallConnectionEntity.A09;
            String str25 = endCallConnectionEntity.A07;
            String str26 = endCallConnectionEntity.A0A;
            boolean z4 = endCallConnectionEntity.A0H;
            Integer num7 = endCallConnectionEntity.A04;
            EnumC53137Neq enumC53137Neq2 = endCallConnectionEntity.A00;
            boolean z5 = endCallConnectionEntity.A0G;
            C14360o3.A0B(enumC53186Nfi3, 0);
            AbstractC167027dH.A13(str18, num5, num6);
            AbstractC167007dF.A1I(str20, 7, str21);
            C14360o3.A0B(enumC53137Neq2, 16);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.EndCallConnectionEntity(enumC53137Neq2, rtcIgNotification3, enumC53186Nfi3, num5, num6, num7, l, str18, str19, str20, str21, str22, str23, str24, str25, str26, z4, z5);
        } else if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallGenericConnectionEntity) {
            RtcConnectionEntity.RtcCallGenericConnectionEntity rtcCallGenericConnectionEntity2 = (RtcConnectionEntity.RtcCallGenericConnectionEntity) rtcConnectionEntity;
            EnumC53186Nfi enumC53186Nfi4 = rtcCallGenericConnectionEntity2.A01;
            String str27 = rtcCallGenericConnectionEntity2.A06;
            Integer num8 = rtcCallGenericConnectionEntity2.A03;
            Integer num9 = rtcCallGenericConnectionEntity2.A02;
            String str28 = rtcCallGenericConnectionEntity2.A05;
            RtcIgNotification rtcIgNotification4 = rtcCallGenericConnectionEntity2.A00;
            String str29 = rtcCallGenericConnectionEntity2.A07;
            String str30 = rtcCallGenericConnectionEntity2.A08;
            String str31 = rtcCallGenericConnectionEntity2.A09;
            C14360o3.A0B(enumC53186Nfi4, 0);
            AbstractC167027dH.A13(str27, num8, num9);
            AbstractC167007dF.A1I(str29, 7, str30);
            rtcCallGenericConnectionEntity = new RtcConnectionEntity.RtcCallGenericConnectionEntity(rtcIgNotification4, enumC53186Nfi4, num8, num9, l, str27, str28, str29, str30, str31);
        } else {
            throw B4Z.A00();
        }
        return rtcCallGenericConnectionEntity;
    }
}
