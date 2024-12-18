package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;

/* loaded from: classes8.dex */
public final class MIY extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIY(String str, String str2, String str3, String str4, String str5, int i, long j) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = str5;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C52000Myq c52000Myq = (C52000Myq) obj;
            C14360o3.A0B(c52000Myq, 0);
            N04 n04 = c52000Myq.A06;
            long j = this.A01;
            String str = this.A03;
            String str2 = this.A04;
            String str3 = this.A05;
            String str4 = this.A06;
            String str5 = this.A02;
            C14360o3.A0B(str3, 3);
            VideoEffectCommunicationApi videoEffectCommunicationApi = n04.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.sendGroupEffect(new VideoEffectCommunicationSharedEffectInfo(j, str, str2, str3, str4, str5, false, false, false, 1, null));
            }
        } else {
            C19670xu c19670xu = (C19670xu) obj;
            C14360o3.A0B(c19670xu, 0);
            String str6 = this.A06;
            C14360o3.A0B(str6, 0);
            InterfaceC105054oL interfaceC105054oL = c19670xu.A00;
            interfaceC105054oL.E7J("last_navigation_source", str6);
            String str7 = this.A04;
            C14360o3.A0B(str7, 0);
            interfaceC105054oL.E7J("last_navigation_destination", str7);
            String str8 = this.A05;
            C14360o3.A0B(str8, 0);
            interfaceC105054oL.E7J("last_navigation_fragment_classname", str8);
            interfaceC105054oL.E7F("last_navigation_timestamp", this.A01);
            String str9 = this.A02;
            C14360o3.A0B(str9, 0);
            interfaceC105054oL.E7J("last_navigation_history", str9);
            String str10 = this.A03;
            C14360o3.A0B(str10, 0);
            interfaceC105054oL.E7J(AbstractC111324zv.A00(4812), str10);
        }
        return C0eB.A00;
    }
}
