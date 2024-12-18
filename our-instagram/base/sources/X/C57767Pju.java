package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.state.gen.State;

/* renamed from: X.Pju, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57767Pju extends C0YY implements InterfaceC16610sE {
    public static final C57767Pju A00 = new C57767Pju();

    public C57767Pju() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC16660sJ interfaceC16660sJ;
        Object c51989MyX;
        Integer num;
        InterfaceC31063Dl5 interfaceC31063Dl5 = (InterfaceC31063Dl5) obj;
        InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) obj2;
        AbstractC167017dG.A1N(interfaceC31063Dl5, interfaceC16660sJ2);
        C14360o3.A0B(obj3, 2);
        C57782Pk9 c57782Pk9 = (C57782Pk9) interfaceC31063Dl5;
        C14360o3.A0B(c57782Pk9, 0);
        O1U o1u = (O1U) MSZ.A0Q(c57782Pk9).A00(O1U.class);
        if (o1u == null) {
            o1u = C51994Myc.A00;
        }
        if (!o1u.A00 && (obj3 instanceof AbstractC53622NnT)) {
            AbstractC53622NnT abstractC53622NnT = (AbstractC53622NnT) obj3;
            State A002 = AbstractC53736Npm.A00(abstractC53622NnT);
            boolean z = true;
            if (A002.callState == 4) {
                C14360o3.A0B(abstractC53622NnT, 0);
                C2N9 c2n9 = EndedModel.CONVERTER;
                C14360o3.A08(c2n9);
                EndedModel endedModel = (EndedModel) ((N02) abstractC53622NnT).A00.A00(c2n9);
                interfaceC16660sJ = c57782Pk9.A00;
                if (endedModel == null || endedModel.reason != 0) {
                    z = false;
                }
                c51989MyX = new C51990MyY(z);
            } else {
                if (A002.isActive) {
                    C14360o3.A0B(abstractC53622NnT, 0);
                    C2N9 c2n92 = CallModel.CONVERTER;
                    C14360o3.A08(c2n92);
                    CallModel callModel = (CallModel) ((N02) abstractC53622NnT).A00.A00(c2n92);
                    if (callModel != null && callModel.inCallState == 2 && (o1u instanceof C51991MyZ)) {
                        interfaceC16660sJ = c57782Pk9.A00;
                        c51989MyX = C51993Myb.A00;
                    }
                }
                if (o1u instanceof C51994Myc) {
                    State A003 = AbstractC53736Npm.A00(abstractC53622NnT);
                    if (!A003.isActive) {
                        if (A003.callState == 2) {
                            C14360o3.A0B(abstractC53622NnT, 0);
                            C2N9 c2n93 = CallModel.CONVERTER;
                            C14360o3.A08(c2n93);
                            CallModel callModel2 = (CallModel) ((N02) abstractC53622NnT).A00.A00(c2n93);
                            if (callModel2 != null && callModel2.inCallState == 2) {
                                interfaceC16660sJ = c57782Pk9.A00;
                                c51989MyX = C51991MyZ.A00;
                            } else {
                                OXE oxe = OXE.A00;
                                StringBuilder A1C = AbstractC166987dD.A1C();
                                A1C.append("Received inactive IN_CALL models that aren't incoming ringing. InCallState: ");
                                if (callModel2 != null) {
                                    num = Integer.valueOf(callModel2.inCallState);
                                } else {
                                    num = null;
                                }
                                oxe.A00("MultiCallMiddleware", AbstractC166997dE.A0v(num, A1C));
                            }
                        }
                    } else {
                        interfaceC16660sJ = c57782Pk9.A00;
                        c51989MyX = C51992Mya.A00;
                    }
                } else if (!(o1u instanceof C51991MyZ)) {
                    OXE.A00.A02("MultiCallMiddleware", AbstractC167017dG.A0n(o1u, "Unhandled MultiCallState: ", AbstractC166987dD.A1C()), null);
                } else {
                    C14360o3.A0B(abstractC53622NnT, 0);
                    C2N9 c2n94 = CallModel.CONVERTER;
                    C14360o3.A08(c2n94);
                    CallModel callModel3 = (CallModel) ((N02) abstractC53622NnT).A00.A00(c2n94);
                    if (callModel3 != null && callModel3.inCallState > 2) {
                        interfaceC16660sJ = c57782Pk9.A00;
                        c51989MyX = new C51989MyX(callModel3.inviteRequestedVideo);
                    }
                }
            }
            interfaceC16660sJ.invoke(c51989MyX);
        }
        return interfaceC16660sJ2.invoke(obj3);
    }
}
