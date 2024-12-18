package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;

/* renamed from: X.Lar, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48377Lar implements C6D2 {
    public final /* synthetic */ C6JY A00;
    public final /* synthetic */ ClipInfo A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C48377Lar(C6JY c6jy, ClipInfo clipInfo, Integer num, Long l, String str, String str2, boolean z) {
        this.A00 = c6jy;
        this.A01 = clipInfo;
        this.A04 = str;
        this.A02 = num;
        this.A03 = l;
        this.A06 = z;
        this.A05 = str2;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        final C6JY c6jy = this.A00;
        final ClipInfo clipInfo = this.A01;
        final String str = this.A04;
        final Integer num = this.A02;
        final Long l = this.A03;
        final boolean z = this.A06;
        final String str2 = this.A05;
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (interfaceC132965zL instanceof C48496Lcn) {
            return C48496Lcn.A00(interfaceC132965zL);
        }
        MsysThreadId msysThreadId = (MsysThreadId) AbstractC132975zM.A01(interfaceC132965zL);
        final long j = msysThreadId.A00;
        final Long A01 = AbstractC92784Dr.A01(msysThreadId);
        return AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C6D2() { // from class: X.Lau
            @Override // X.C6D2
            public final Object apply(Object obj2) {
                String A02;
                C6JY c6jy2 = C6JY.this;
                ClipInfo clipInfo2 = clipInfo;
                String str3 = str;
                long j2 = j;
                Integer num2 = num;
                Long l2 = l;
                boolean z2 = z;
                String str4 = str2;
                Long l3 = A01;
                Pair pair = (Pair) obj2;
                K3a k3a = (K3a) pair.first;
                C1345666g c1345666g = (C1345666g) pair.second;
                String A022 = C6JY.A02(k3a, clipInfo2.A0F);
                C18C.A07(A022, "Failed to resolve video ID");
                int i = clipInfo2.A09;
                int i2 = clipInfo2.A06;
                int i3 = clipInfo2.A05 - clipInfo2.A07;
                UserSession userSession = c6jy2.A03;
                File A00 = C55201OeB.A00(AbstractC12290kX.A00, clipInfo2, str3, i, i2);
                if (A00 == null) {
                    A02 = null;
                } else {
                    A02 = C6JY.A02(k3a, A00.getPath());
                }
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i);
                String str5 = clipInfo2.A0F;
                long A002 = clipInfo2.A00();
                String A14 = AbstractC25225BEi.A14();
                return C42221xC.A07(new C48481LcY(c1345666g, userSession, valueOf, valueOf2, valueOf, valueOf2, num2, l3, l2, "video/mp4", str5, A02, A022, str4, A14, 4, i3, j2, A002, z2), AbstractC137146It.A00("rxmailbox_send_secure_video_message"));
            }
        }, C48331La4.A00(c6jy)), "rxmailbox_send_secure_video_message");
    }
}
