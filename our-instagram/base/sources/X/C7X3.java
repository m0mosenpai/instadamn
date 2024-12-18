package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.7X3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7X3 {
    public final int A00;
    public final C006802i A01;
    public final UserSession A02;
    public final Map A03;
    public final java.util.Set A04;
    public final C218914p A05;
    public final InterfaceC12870lZ A06;

    public C7X3(C006802i c006802i, C218914p c218914p, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c218914p, 3);
        this.A02 = userSession;
        this.A01 = c006802i;
        this.A05 = c218914p;
        java.util.Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C14360o3.A07(newSetFromMap);
        this.A04 = newSetFromMap;
        this.A03 = new LinkedHashMap();
        this.A00 = C18U.A06(C06090Tz.A05, userSession, 2342166977860349677L) ? 20134487 : 20122678;
        this.A06 = new InterfaceC12870lZ() { // from class: X.7X4
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-1022642843);
                C7X3 c7x3 = C7X3.this;
                java.util.Set set = c7x3.A04;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    c7x3.A01.markerEnd(c7x3.A00, ((String) it.next()).hashCode(), (short) 630);
                }
                set.clear();
                C218914p.A06(this);
                C0f9.A0A(-269031400, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(180039742, C0f9.A03(1743241736));
            }
        };
    }

    public final void A00(EnumC92794Ds enumC92794Ds, InterfaceC83713oG interfaceC83713oG, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, Map map, Map map2) {
        String str2;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        boolean A06;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC92794Ds, 2);
        int hashCode = str.hashCode();
        java.util.Set set = this.A04;
        if (set.contains(str)) {
            C006802i c006802i = this.A01;
            int i = this.A00;
            c006802i.markerAnnotate(i, hashCode, "error", "loggingId_collision");
            c006802i.markerEnd(i, hashCode, (short) 3);
            set.remove(str);
            C218914p.A06(this.A06);
            return;
        }
        C006802i c006802i2 = this.A01;
        int i2 = this.A00;
        c006802i2.markerStart(i2, hashCode);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                str2 = "text";
                break;
            case 1:
                str2 = MediaStreamTrack.AUDIO_TRACK_KIND;
                break;
            case 2:
                str2 = "photo";
                break;
            case 3:
                str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                break;
            case 4:
                str2 = "reaction";
                break;
            case 5:
                str2 = "gif";
                break;
            case 6:
                str2 = "sticker";
                break;
            case 7:
                str2 = "collection";
                break;
            case 8:
                str2 = "ephemeral_photo";
                break;
            default:
                str2 = AbstractC43591JPw.A00(963);
                break;
        }
        c006802i2.markerAnnotate(i2, hashCode, "message_type", str2);
        c006802i2.markerAnnotate(i2, hashCode, TraceFieldType.TransportType, enumC92794Ds.A00);
        c006802i2.markerAnnotate(i2, hashCode, "local_data_id", str);
        if (enumC92794Ds == EnumC92794Ds.A04) {
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 1) {
                            A06 = false;
                            c006802i2.markerAnnotate(i2, hashCode, "is_tangerine", A06);
                        } else {
                            userSession = this.A02;
                            c06090Tz = C06090Tz.A05;
                            j = 36315125309115427L;
                        }
                    } else {
                        userSession = this.A02;
                        c06090Tz = C06090Tz.A05;
                        j = 36315125308984353L;
                    }
                } else {
                    userSession = this.A02;
                    c06090Tz = C06090Tz.A05;
                    j = 36315125308918816L;
                }
            } else {
                userSession = this.A02;
                c06090Tz = C06090Tz.A05;
                j = 36315125308722207L;
            }
            A06 = C18U.A06(c06090Tz, userSession, j);
            c006802i2.markerAnnotate(i2, hashCode, "is_tangerine", A06);
        }
        for (Map.Entry entry : map.entrySet()) {
            c006802i2.markerAnnotate(i2, hashCode, (String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (entry2.getValue() != null) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str3 = (String) entry3.getKey();
            Number number = (Number) entry3.getValue();
            if (number != null) {
                c006802i2.markerAnnotate(i2, hashCode, str3, number.longValue());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (bool != null) {
            c006802i2.markerAnnotate(i2, hashCode, "is_group", bool.booleanValue());
        }
        if (bool2 != null) {
            c006802i2.markerAnnotate(i2, hashCode, "is_instamadillo", bool2.booleanValue());
        }
        if (num2 != null) {
            int intValue2 = num2.intValue();
            c006802i2.markerAnnotate(i2, hashCode, "thread_type_value", intValue2);
            c006802i2.markerAnnotate(i2, hashCode, "thread_type_str", C4GR.A00(intValue2));
        }
        if (interfaceC83713oG != null) {
            String A02 = AbstractC92784Dr.A02(interfaceC83713oG);
            if (A02 != null) {
                c006802i2.markerAnnotate(i2, hashCode, "open_thread_id", A02);
            }
            Long A01 = AbstractC92784Dr.A01(interfaceC83713oG);
            if (A01 != null) {
                c006802i2.markerAnnotate(i2, hashCode, "occamadillo_thread_id", A01.longValue());
            }
        }
        if (num2 != null && C4GR.A07(num2)) {
            C7W9 A00 = C7W8.A00(this.A02);
            C7W9.A00(A00, new C57258Pbg(AbstractC46895Koc.A00(num), A00, 40));
        }
        set.add(str);
        C218914p.A03(EnumC220415e.A03, this.A06);
        A03(str, true);
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        java.util.Set set = this.A04;
        if (set.contains(str)) {
            A04(str, false);
            this.A01.markerEnd(this.A00, str.hashCode(), (short) 2);
            set.remove(str);
            this.A03.remove(str);
            C218914p.A06(this.A06);
        }
    }

    public final void A03(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        if (this.A04.contains(str)) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36314450998921791L)) {
                C006802i c006802i = this.A01;
                int i = this.A00;
                int hashCode = str.hashCode();
                if (z) {
                    str2 = "_start";
                } else {
                    str2 = "_end";
                }
                c006802i.markerPoint(i, hashCode, AnonymousClass001.A0R("transport_message_to_send_service", str2));
            }
        }
    }

    public final void A04(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        if (this.A04.contains(str)) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36314450998921791L)) {
                C006802i c006802i = this.A01;
                int i = this.A00;
                int hashCode = str.hashCode();
                String A00 = AbstractC43591JPw.A00(1330);
                if (z) {
                    str2 = "_start";
                } else {
                    str2 = "_end";
                }
                c006802i.markerPoint(i, hashCode, AnonymousClass001.A0R(A00, str2));
            }
        }
    }

    public final void A05(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        if (this.A04.contains(str)) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36314450998921791L)) {
                C006802i c006802i = this.A01;
                int i = this.A00;
                int hashCode = str.hashCode();
                String A00 = AbstractC43591JPw.A00(1319);
                if (z) {
                    str2 = "_start";
                } else {
                    str2 = "_end";
                }
                c006802i.markerPoint(i, hashCode, AnonymousClass001.A0R(A00, str2));
            }
        }
    }

    public final void A02(String str, String str2) {
        int i;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        C006802i c006802i = this.A01;
        int i2 = this.A00;
        c006802i.markerAnnotate(i2, i, "error", str2);
        c006802i.markerEnd(i2, i, (short) 3);
        C218914p.A06(this.A06);
    }
}
