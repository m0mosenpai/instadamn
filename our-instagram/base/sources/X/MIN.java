package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.msys.reverb.MCAReverbLoggingContextMCFBridgejniDispatcher;
import com.mcftypeholder.McfTypeHolder;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MIN extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: Type inference failed for: r8v0, types: [com.mcftypeholder.McfTypeHolder, X.Kb1] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        if (this.A00 != 0) {
            K3Y k3y = (K3Y) obj;
            C14360o3.A0B(k3y, 0);
            Map map = (Map) this.A04;
            Integer valueOf = Integer.valueOf(this.A01);
            List list = (List) this.A03;
            String str = this.A05;
            if (str == null) {
                str = "";
            }
            AnonymousClass776 anonymousClass776 = (AnonymousClass776) this.A02;
            int i2 = 0;
            if (anonymousClass776 != null) {
                i = anonymousClass776.A01;
                i2 = anonymousClass776.A00;
            } else {
                i = 0;
            }
            ?? mcfTypeHolder = new McfTypeHolder(-1974637912, MCAReverbLoggingContextMCFBridgejniDispatcher.MCAReverbLoggingContextCreateWithQPLInstanceNative(str, i, i2));
            InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3y);
            MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
            int A00 = AbstractC1346866s.A00(A0D);
            TraceInfo A01 = AbstractC1346866s.A01(A0D, "MailboxInstagramReverb", "loadMessageListForThreads");
            if (!A0H.ELJ(new C48186LUk(k3y, A0D, mcfTypeHolder, valueOf, list, map, A00))) {
                A0D.cancel(false);
                AbstractC1346866s.A02(A00);
                AbstractC1346866s.A03(A01, "MailboxInstagramReverb", "loadMessageListForThreads");
            }
            PlatformLogger.platformEventLog(5);
            return A0D;
        }
        C25531Mh c25531Mh = (C25531Mh) obj;
        C14360o3.A0B(c25531Mh, 0);
        c25531Mh.A0X(0);
        c25531Mh.A0R("creation_session_id", this.A03.toString());
        c25531Mh.A0M((EnumC33519Ers) this.A02, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        c25531Mh.A0O("is_e2ee", false);
        c25531Mh.A0Y(this.A01);
        c25531Mh.A0R("selected_item", AbstractC53953NtQ.A00((Integer) this.A04));
        c25531Mh.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A05);
        c25531Mh.A0M(EnumC72433Xdd.A02, "thread_type");
        c25531Mh.A0Z(36);
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIN(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A04 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A05 = str;
        this.A02 = obj3;
    }
}
