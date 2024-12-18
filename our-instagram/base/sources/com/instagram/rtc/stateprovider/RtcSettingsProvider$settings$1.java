package com.instagram.rtc.stateprovider;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23021Ah;
import X.AbstractC23611Dp;
import X.AbstractC25234BEr;
import X.C0eB;
import X.C14360o3;
import X.C16930sl;
import X.C23031Ai;
import X.C51731MtC;
import X.C51759Mti;
import X.C51869MwD;
import X.InterfaceC16590sC;
import X.InterfaceC23621Ds;
import X.MSW;
import X.O4Y;
import X.OPy;
import com.facebook.rsys.moderator.gen.ModeratorParticipantCapabilityInfo;
import com.facebook.rsys.moderator.gen.ModeratorSoftMuteModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.rtc.statemodel.RtcSettingsParticipant;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.RtcSettingsProvider$settings$1", f = "RtcSettingsProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcSettingsProvider$settings$1 extends AbstractC23611Dp implements InterfaceC16590sC {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ OPy A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcSettingsProvider$settings$1(UserSession userSession, OPy oPy, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(5, interfaceC23621Ds);
        this.A03 = userSession;
        this.A04 = oPy;
        this.A05 = z;
    }

    public static void A00(O4Y o4y, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (o4y.A00.containsKey(((ParticipantModel) next).userId)) {
            abstractCollection.add(next);
        }
    }

    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1a = AbstractC166987dD.A1a(obj4);
        RtcSettingsProvider$settings$1 rtcSettingsProvider$settings$1 = new RtcSettingsProvider$settings$1(this.A03, this.A04, (InterfaceC23621Ds) obj5, this.A05);
        rtcSettingsProvider$settings$1.A00 = obj;
        rtcSettingsProvider$settings$1.A01 = obj2;
        rtcSettingsProvider$settings$1.A02 = A1a;
        return rtcSettingsProvider$settings$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List list;
        ArrayList A1E;
        List list2;
        Long l;
        IgCallModel igCallModel;
        boolean z2;
        ModeratorSoftMuteModel moderatorSoftMuteModel;
        Map map;
        Object obj2;
        IgCallModel igCallModel2;
        ArrayList arrayList;
        IgCallModel igCallModel3;
        IgCallModel igCallModel4;
        AbstractC09560e7.A00(obj);
        C51759Mti c51759Mti = (C51759Mti) this.A00;
        O4Y o4y = (O4Y) this.A01;
        boolean z3 = this.A02;
        EngineModel engineModel = (EngineModel) c51759Mti.A00;
        if (engineModel != null && (igCallModel4 = engineModel.callModel) != null) {
            z = igCallModel4.e2eeMandated;
        } else {
            z = false;
        }
        UserSession userSession = this.A03;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        EngineModel engineModel2 = (EngineModel) c51759Mti.A00;
        if (engineModel2 == null || (igCallModel3 = engineModel2.callModel) == null || (list = igCallModel3.participants) == null) {
            list = C16930sl.A00;
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj3 : list) {
            if (((ParticipantModel) obj3).state == 17) {
                A1E2.add(obj3);
            }
        }
        ArrayList A1E3 = AbstractC166987dD.A1E();
        Iterator it = A1E2.iterator();
        while (it.hasNext()) {
            A00(o4y, A1E3, it);
        }
        ArrayList A1E4 = AbstractC166987dD.A1E();
        Iterator it2 = A1E3.iterator();
        while (it2.hasNext()) {
            ParticipantModel A0s = MSW.A0s(it2);
            C51731MtC c51731MtC = (C51731MtC) o4y.A00.get(A0s.userId);
            String str = A0s.rendererId;
            C14360o3.A07(str);
            A1E4.add(OPy.A00(c51731MtC, str));
        }
        EngineModel engineModel3 = (EngineModel) c51759Mti.A00;
        if (engineModel3 != null && (igCallModel2 = engineModel3.callModel) != null && (arrayList = igCallModel2.participants) != null) {
            ArrayList A1E5 = AbstractC166987dD.A1E();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (((ParticipantModel) next).state == 7) {
                    A1E5.add(next);
                }
            }
            A1E = AbstractC001800i.A0U(A1E5);
        } else {
            A1E = AbstractC166987dD.A1E();
        }
        ArrayList A1E6 = AbstractC166987dD.A1E();
        Iterator it4 = A1E.iterator();
        while (it4.hasNext()) {
            A00(o4y, A1E6, it4);
        }
        ArrayList A1E7 = AbstractC166987dD.A1E();
        Iterator it5 = A1E6.iterator();
        while (it5.hasNext()) {
            ParticipantModel A0s2 = MSW.A0s(it5);
            C51731MtC c51731MtC2 = (C51731MtC) o4y.A00.get(A0s2.userId);
            String str2 = A0s2.rendererId;
            C14360o3.A07(str2);
            RtcSettingsParticipant A002 = OPy.A00(c51731MtC2, str2);
            boolean z4 = A0s2.audioEnabled;
            if (engineModel3 != null && (moderatorSoftMuteModel = engineModel3.moderatorSoftMuteModel) != null && (map = moderatorSoftMuteModel.conferenceParticipantCapabilities) != null) {
                if (c51731MtC2 != null) {
                    obj2 = c51731MtC2.A02;
                } else {
                    obj2 = null;
                }
                ModeratorParticipantCapabilityInfo moderatorParticipantCapabilityInfo = (ModeratorParticipantCapabilityInfo) map.get(String.valueOf(obj2));
                if (moderatorParticipantCapabilityInfo != null) {
                    z2 = moderatorParticipantCapabilityInfo.actionCapabilitiesAsParticipant;
                    boolean z5 = A0s2.hasVoiceActivity;
                    String str3 = A002.A04;
                    String str4 = A002.A05;
                    Long l2 = A002.A02;
                    int i = A002.A00;
                    String str5 = A002.A06;
                    String str6 = A002.A03;
                    ImageUrl imageUrl = A002.A01;
                    List list3 = A002.A07;
                    C14360o3.A0B(str3, 0);
                    AbstractC25234BEr.A0k(4, str5, str6, imageUrl, list3);
                    A1E7.add(new RtcSettingsParticipant(imageUrl, l2, str3, str4, str5, str6, list3, i, z4, z2, z5));
                }
            }
            z2 = false;
            boolean z52 = A0s2.hasVoiceActivity;
            String str32 = A002.A04;
            String str42 = A002.A05;
            Long l22 = A002.A02;
            int i2 = A002.A00;
            String str52 = A002.A06;
            String str62 = A002.A03;
            ImageUrl imageUrl2 = A002.A01;
            List list32 = A002.A07;
            C14360o3.A0B(str32, 0);
            AbstractC25234BEr.A0k(4, str52, str62, imageUrl2, list32);
            A1E7.add(new RtcSettingsParticipant(imageUrl2, l22, str32, str42, str52, str62, list32, i2, z4, z2, z52));
        }
        EngineModel engineModel4 = (EngineModel) c51759Mti.A00;
        if (engineModel4 == null || (igCallModel = engineModel4.callModel) == null || (list2 = igCallModel.participants) == null) {
            list2 = C16930sl.A00;
        }
        ArrayList A1E8 = AbstractC166987dD.A1E();
        for (Object obj4 : list2) {
            int i3 = ((ParticipantModel) obj4).state;
            if (i3 != 17 && i3 != 18 && i3 != 19 && i3 != 20 && i3 != 21 && i3 != 22 && i3 != 7) {
                A1E8.add(obj4);
            }
        }
        ArrayList A1E9 = AbstractC166987dD.A1E();
        Iterator it6 = A1E8.iterator();
        while (it6.hasNext()) {
            A00(o4y, A1E9, it6);
        }
        ArrayList A1E10 = AbstractC166987dD.A1E();
        Iterator it7 = A1E9.iterator();
        while (it7.hasNext()) {
            ParticipantModel A0s3 = MSW.A0s(it7);
            C51731MtC c51731MtC3 = (C51731MtC) o4y.A00.get(A0s3.userId);
            String str7 = A0s3.rendererId;
            C14360o3.A07(str7);
            RtcSettingsParticipant A003 = OPy.A00(c51731MtC3, str7);
            if (c51731MtC3 != null) {
                l = (Long) c51731MtC3.A02;
            } else {
                l = null;
            }
            String str8 = A003.A04;
            String str9 = A003.A05;
            int i4 = A003.A00;
            String str10 = A003.A06;
            String str11 = A003.A03;
            ImageUrl imageUrl3 = A003.A01;
            List list4 = A003.A07;
            C14360o3.A0B(str8, 0);
            AbstractC25234BEr.A0k(4, str10, str11, imageUrl3, list4);
            A1E10.add(new RtcSettingsParticipant(imageUrl3, l, str8, str9, str10, str11, list4, i4, false, false, false));
        }
        return new C51869MwD(A1E4, A1E7, A1E10, z, A00.A24(userSession), A00.A01.getBoolean("in_call_settings_audio_touch_up", true), A00.A23(userSession), this.A05, z3);
    }
}
