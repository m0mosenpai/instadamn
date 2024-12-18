package X;

import android.content.Context;
import com.facebook.hyperthrift.HyperThriftBase;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.video.common.events.IgRtcEventHeader;
import java.io.IOException;

/* renamed from: X.Odv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55189Odv {
    public static final C55189Odv A00 = new Object();

    public static final C55144Od3 A01(Context context, String str) {
        C14360o3.A0B(context, 0);
        try {
            C41054IFx parseFromJson = IAM.parseFromJson(C16V.A00(str));
            C14360o3.A07(parseFromJson);
            String str2 = parseFromJson.A01;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            return new C55144Od3(new OX7(context).A01(str2), str2);
        } catch (IOException unused) {
            return null;
        }
    }

    public final RtcConnectionEntity.RtcCallConnectionEntity A04(Context context, InterfaceC58275PsT interfaceC58275PsT, UserSession userSession, C55144Od3 c55144Od3) {
        int i;
        Integer num;
        C14360o3.A0B(context, 1);
        if (c55144Od3.A0P.getValue() != null) {
            InterfaceC09390do interfaceC09390do = c55144Od3.A04;
            if (interfaceC09390do.getValue() != null) {
                String str = userSession.userId;
                Integer num2 = C05F.A01;
                InterfaceC09390do interfaceC09390do2 = c55144Od3.A0G;
                boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do2);
                boolean A1Z2 = AbstractC167007dF.A1Z(c55144Od3.A0E);
                if (A1Z) {
                    i = 2131954487;
                    if (A1Z2) {
                        i = 2131954482;
                    }
                } else {
                    i = 2131954490;
                    if (A1Z2) {
                        i = 2131954481;
                    }
                }
                String A03 = A03(context, c55144Od3, AbstractC31177DnL.A0b(context, interfaceC09390do.getValue(), i));
                String A02 = A02(context, c55144Od3);
                boolean A1Z3 = AbstractC167007dF.A1Z(interfaceC09390do2);
                Long valueOf = Long.valueOf(interfaceC58275PsT.CA4());
                C51759Mti c51759Mti = c55144Od3.A00;
                HyperThriftBase hyperThriftBase = (HyperThriftBase) c51759Mti.A01;
                Long l = (Long) hyperThriftBase.A00(7);
                String A04 = c55144Od3.A04();
                String str2 = (String) hyperThriftBase.A00(16);
                Number number = (Number) hyperThriftBase.A00(3);
                if (number != null) {
                    num = Integer.valueOf(number.shortValue());
                } else {
                    num = null;
                }
                String A05 = c55144Od3.A05();
                HyperThriftBase hyperThriftBase2 = (HyperThriftBase) c51759Mti.A01;
                return A00(null, new IgRtcEventHeader(num, (Integer) hyperThriftBase2.A00(12), c55144Od3.A03(), l, A04, str2, A05, (String) hyperThriftBase2.A00(1)), c55144Od3, num2, valueOf, str, A03, A02, A1Z3);
            }
        }
        throw AbstractC166987dD.A12("Expecting a valid server response. Missing required information for handling notifications.");
    }

    public static final RtcConnectionEntity.RtcCallConnectionEntity A00(RtcIgNotification rtcIgNotification, IgRtcEventHeader igRtcEventHeader, C55144Od3 c55144Od3, Integer num, Long l, String str, String str2, String str3, boolean z) {
        EnumC53186Nfi enumC53186Nfi;
        String str4;
        if (AbstractC167007dF.A1Z(c55144Od3.A0I)) {
            enumC53186Nfi = EnumC53186Nfi.A05;
        } else {
            enumC53186Nfi = EnumC53186Nfi.A04;
        }
        InterfaceC09390do interfaceC09390do = c55144Od3.A0H;
        Integer A0Z = MSX.A0Z(AbstractC167007dF.A1Z(interfaceC09390do) ? 1 : 0);
        if (AbstractC167007dF.A1Z(interfaceC09390do)) {
            str4 = c55144Od3.A05();
        } else {
            str4 = null;
        }
        String A15 = AbstractC25225BEi.A15(c55144Od3.A0P);
        String A152 = AbstractC25225BEi.A15(c55144Od3.A03);
        if (A152 != null) {
            String A153 = AbstractC25225BEi.A15(c55144Od3.A04);
            String A154 = AbstractC25225BEi.A15(c55144Od3.A09);
            String A155 = AbstractC25225BEi.A15(c55144Od3.A0J);
            EnumC53137Neq enumC53137Neq = (EnumC53137Neq) c55144Od3.A0A.getValue();
            boolean A1Z = AbstractC167007dF.A1Z(c55144Od3.A0F);
            EnumC53138Ner enumC53138Ner = (EnumC53138Ner) c55144Od3.A0B.getValue();
            boolean A1Z2 = AbstractC167007dF.A1Z(c55144Od3.A0E);
            String A04 = c55144Od3.A04();
            return new RtcConnectionEntity.RtcCallConnectionEntity(enumC53137Neq, enumC53138Ner, new RtcCallKey(A04), rtcIgNotification, enumC53186Nfi, igRtcEventHeader, A0Z, num, l, str, str2, A04, "RtcCallConnectionEntity", A15, str4, A152, A153, str3, A154, A155, A1Z, A1Z2, z);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final String A02(Context context, C55144Od3 c55144Od3) {
        int i;
        Object[] objArr;
        if (AbstractC167007dF.A1Z(c55144Od3.A0H)) {
            String A15 = AbstractC25225BEi.A15(c55144Od3.A0O);
            if (A15 == null) {
                String A152 = AbstractC25225BEi.A15(c55144Od3.A0D);
                String A153 = AbstractC25225BEi.A15(c55144Od3.A0K);
                if (A152 != null && A152.length() != 0) {
                    i = 2131954485;
                    objArr = new Object[1];
                } else if (A153 != null && A153.length() != 0) {
                    i = 2131954486;
                    objArr = new Object[1];
                    A152 = C55048OZz.A00(A153);
                } else {
                    return null;
                }
                objArr[0] = A152;
                return context.getString(i, objArr);
            }
            return A15;
        }
        return null;
    }

    public static final String A03(Context context, C55144Od3 c55144Od3, String str) {
        int i;
        if (AbstractC167007dF.A1Z(c55144Od3.A0H)) {
            String A15 = AbstractC25225BEi.A15(c55144Od3.A0O);
            if (A15 == null) {
                Object value = c55144Od3.A04.getValue();
                String A152 = AbstractC25225BEi.A15(c55144Od3.A0D);
                String A153 = AbstractC25225BEi.A15(c55144Od3.A0K);
                boolean A1Z = AbstractC167007dF.A1Z(c55144Od3.A0E);
                if (A152 != null && A152.length() != 0) {
                    i = 2131954488;
                    if (A1Z) {
                        i = 2131954483;
                    }
                } else if (A153 != null && A153.length() != 0) {
                    i = 2131954489;
                    if (A1Z) {
                        i = 2131954484;
                    }
                    A152 = C55048OZz.A00(A153);
                }
                A15 = context.getString(i, value, A152);
                if (A15 == null) {
                }
            }
            return A15;
        }
        return str;
    }
}
