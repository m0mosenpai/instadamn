package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/* loaded from: classes8.dex */
public final class M8M implements Consumer {
    public final int A00;
    public final Object A01;

    public M8M(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                this.A01 = interfaceC16660sJ;
                return;
            default:
                this.A01 = interfaceC16660sJ;
                return;
        }
    }

    public static void A01(CompletableFuture completableFuture, InterfaceC16660sJ interfaceC16660sJ, int i) {
        completableFuture.thenAccept((Consumer) new M8M(i, interfaceC16660sJ));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        InterfaceC16660sJ interfaceC16660sJ;
        switch (this.A00) {
            case 0:
                ((java.util.Set) this.A01).remove(obj);
                return;
            case Process.SIGTERM /* 15 */:
                Object obj2 = this.A01;
                AbstractC1345065z abstractC1345065z = C125815mW.A00;
                MailboxFeature mailboxFeature = new MailboxFeature(new C137266Jf((Mailbox) obj));
                InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                AbstractC43594JPz.A1G(ASj, new C44176Jff(10, mailboxFeature, A0D), A0D);
                A0D.Ecq(new C35856FsW(obj2, 0));
                InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(mailboxFeature, 2);
                MailboxFutureImpl A0D2 = AbstractC43592JPx.A0D(A0C);
                AbstractC25231BEo.A1C(A0C, new C44176Jff(9, mailboxFeature, A0D2), A0D2);
                A0D2.Ecq(new C35856FsW(obj2, 1));
                return;
            case 16:
                ((InterfaceC16660sJ) this.A01).invoke(new C137266Jf((Mailbox) obj));
                return;
            case 17:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ = ((C49318LrC) this.A01).A05;
                interfaceC16660sJ.invoke(obj);
                return;
            default:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                interfaceC16660sJ.invoke(obj);
                return;
        }
    }

    public static void A00(UserSession userSession, EnumC132075xi enumC132075xi, InterfaceC16660sJ interfaceC16660sJ) {
        C1334460n A00 = C1334460n.A00(userSession, enumC132075xi);
        C14360o3.A07(A00);
        A00.A03(new M8M(16, interfaceC16660sJ));
    }

    public M8M(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
