package X;

import android.view.Choreographer;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes6.dex */
public final class GSB extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSB(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        switch (this.A00) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 12;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case Process.SIGTERM /* 15 */:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case 18:
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            default:
                i = 29;
                break;
        }
        return new GSB(i, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
            case 1:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case 18:
            case 20:
            case 22:
                return ((GSB) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
            case 2:
            case 3:
            case 28:
                return ((GSB) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj2;
                if (interfaceC23621Ds != null) {
                    interfaceC23621Ds.getContext();
                }
                C0eB c0eB = C0eB.A00;
                AbstractC09560e7.A00(c0eB);
                return c0eB;
            case 7:
                InterfaceC23621Ds interfaceC23621Ds2 = (InterfaceC23621Ds) obj2;
                if (interfaceC23621Ds2 != null) {
                    interfaceC23621Ds2.getContext();
                }
                AbstractC09560e7.A00(C0eB.A00);
                return C27117Bxg.A00;
            case 8:
                InterfaceC23621Ds interfaceC23621Ds3 = (InterfaceC23621Ds) obj2;
                if (interfaceC23621Ds3 != null) {
                    interfaceC23621Ds3.getContext();
                }
                AbstractC09560e7.A00(C0eB.A00);
                return C27116Bxf.A00;
            case Process.SIGSTOP /* 19 */:
                InterfaceC23621Ds interfaceC23621Ds4 = (InterfaceC23621Ds) obj2;
                if (interfaceC23621Ds4 != null) {
                    interfaceC23621Ds4.getContext();
                }
                AbstractC09560e7.A00(C0eB.A00);
                return "bad_response";
            case 21:
                InterfaceC23621Ds interfaceC23621Ds5 = (InterfaceC23621Ds) obj2;
                if (interfaceC23621Ds5 != null) {
                    interfaceC23621Ds5.getContext();
                }
                AbstractC09560e7.A00(C0eB.A00);
                return "request_failed";
        }
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
                AbstractC09560e7.A00(obj);
                return Choreographer.getInstance();
            case 2:
            case 3:
                AbstractC09560e7.A00(obj);
                return AbstractC166997dE.A0b();
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                AbstractC09560e7.A00(obj);
                return C0eB.A00;
            case 7:
                AbstractC09560e7.A00(obj);
                return C27117Bxg.A00;
            case 8:
                AbstractC09560e7.A00(obj);
                return C27116Bxf.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                AbstractC09560e7.A00(obj);
                C0K8.A0C(AbstractC43591JPw.A00(703), "update_channel_invite api failed");
                return C0eB.A00;
            case 14:
                AbstractC09560e7.A00(obj);
                return new C194848jk(new Object());
            case 18:
            case 20:
                AbstractC09560e7.A00(obj);
                C35264Fgy.A02();
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                AbstractC09560e7.A00(obj);
                return "bad_response";
            case 21:
                AbstractC09560e7.A00(obj);
                return "request_failed";
            case 22:
                AbstractC09560e7.A00(obj);
                return new C36563GAn(new C36561GAl(0));
            case 28:
                AbstractC09560e7.A00(obj);
                return new C51692MsN(C16930sl.A00, false, true);
        }
    }
}
