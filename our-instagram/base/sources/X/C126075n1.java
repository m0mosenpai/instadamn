package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126075n1 implements InterfaceC126055mz {
    public final C126105n4 A00;
    public final C115385Jm A01;
    public final C126095n3 A02;
    public final C127445pN A03;
    public final C5Jv A04;
    public final C5K4 A05;
    public final C5KD A06;
    public final InterfaceC25391Lt A07;
    public final InterfaceC115345Ji A08;
    public final C127745py A09;
    public final boolean A0A;

    public /* synthetic */ C126075n1(UserSession userSession, C1M6 c1m6, final java.util.Set set) {
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330084679828143L);
        InterfaceC115345Ji interfaceC115345Ji = new InterfaceC115345Ji(set) { // from class: X.5n2
            public final java.util.Set A00;

            @Override // X.InterfaceC115345Ji
            public final List EMu(List list) {
                C14360o3.A0B(list, 0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (this.A00.contains(((C9C7) ((C9BW) obj).A01).A04)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            {
                this.A00 = set;
            }
        };
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        C14360o3.A0B(A00, 6);
        this.A0A = A06;
        this.A08 = interfaceC115345Ji;
        this.A07 = A00;
        this.A02 = new C126095n3(userSession, c1m6);
        this.A01 = new C115385Jm(userSession, c1m6);
        this.A04 = new C5Jv(userSession, c1m6);
        this.A05 = new C5K4(userSession, c1m6);
        this.A06 = new C5KD(userSession, c1m6, "ad_and_netego_realtime_information", "organic_realtime_information");
        this.A09 = new C127745py(userSession, c1m6);
        this.A00 = new C126105n4(userSession, c1m6);
        this.A03 = new C127445pN(userSession, c1m6);
    }

    @Override // X.InterfaceC126055mz
    public final Map AUc(String str) {
        Map A00;
        InterfaceC25391Lt interfaceC25391Lt = this.A07;
        List<C9BW> EMt = interfaceC25391Lt.EMt(this.A08);
        if (!this.A0A) {
            interfaceC25391Lt.EGJ(EMt);
        }
        HashMap hashMap = new HashMap();
        for (C9BW c9bw : EMt) {
            Object obj = ((C9C7) c9bw.A01).A04;
            List list = (List) hashMap.get(obj);
            if (list == null) {
                hashMap.put(obj, AbstractC16960so.A1N(c9bw));
            } else {
                list.add(c9bw);
            }
        }
        Map hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            switch (((AnonymousClass317) entry.getKey()).ordinal()) {
                case 0:
                case 1:
                case 3:
                case 6:
                case 8:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    A00 = this.A02.A00(AbstractC123655ie.A00((AnonymousClass317) entry.getKey()), str, (List) entry.getValue());
                    break;
                case 2:
                    A00 = this.A01.A00(str, (List) entry.getValue());
                    break;
                case 4:
                case 9:
                case 11:
                case 14:
                case Process.SIGTERM /* 15 */:
                case 17:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                default:
                    A00 = AbstractC06930Yk.A0E();
                    break;
                case 5:
                    A00 = this.A04.A00(str, (List) entry.getValue());
                    break;
                case 7:
                    A00 = this.A05.A00(str, (List) entry.getValue());
                    break;
                case 10:
                    A00 = this.A06.A02(str, (List) entry.getValue());
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    A00 = this.A04.A01(str, (List) entry.getValue());
                    break;
                case 16:
                    A00 = this.A09.A00(str, (List) entry.getValue());
                    break;
                case 27:
                    A00 = this.A03.A00(str, (List) entry.getValue());
                    break;
                case 28:
                    A00 = this.A00.A00(str, (List) entry.getValue());
                    break;
            }
            hashMap2 = AbstractC06930Yk.A04(hashMap2, A00);
        }
        return hashMap2;
    }
}
