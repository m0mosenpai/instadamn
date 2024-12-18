package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* loaded from: classes8.dex */
public final class MIC extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C47752L6w A00;
    public final /* synthetic */ ClipInfo A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIC(C47752L6w c47752L6w, ClipInfo clipInfo, Long l, String str, String str2) {
        super(1);
        this.A01 = clipInfo;
        this.A00 = c47752L6w;
        this.A02 = l;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null) {
            Object A16 = AbstractC166987dD.A16(list);
            C14360o3.A0C(A16, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadId");
            MsysThreadId msysThreadId = (MsysThreadId) A16;
            String A0s = AbstractC31173DnH.A0s(list, 1);
            if (A0s != null) {
                String A0s2 = AbstractC31173DnH.A0s(list, 2);
                if (A0s2 != null) {
                    ClipInfo clipInfo = this.A01;
                    String str = clipInfo.A0F;
                    if (str != null) {
                        LFD lfd = LEA.A01;
                        UserSession userSession = this.A00.A00;
                        long j = msysThreadId.A00;
                        Integer valueOf = Integer.valueOf(clipInfo.A06);
                        Integer valueOf2 = Integer.valueOf(clipInfo.A09);
                        String name = AbstractC166987dD.A11(str).getName();
                        C14360o3.A07(name);
                        long A00 = clipInfo.A00();
                        int i = clipInfo.A05 - clipInfo.A07;
                        return AbstractC133285zv.A00(lfd.A01(userSession, valueOf, valueOf2, valueOf, valueOf2, null, this.A02, AbstractC92784Dr.A01(msysThreadId), "video/mp4", "image/jpeg", name, A0s, A0s2, this.A04, null, this.A03, 4, i, j, A00, false));
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Failed to resolve video ID");
            }
            throw AbstractC166987dD.A14("Failed to resolve preview ID");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
