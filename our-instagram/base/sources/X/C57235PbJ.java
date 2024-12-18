package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.PbJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57235PbJ extends C03E implements InterfaceC16600sD {
    public static final C57235PbJ A00 = new C57235PbJ();

    public C57235PbJ() {
        super(4, AbstractC53535Nm2.class, "genMessageComposerPlaceholderState", "genMessageComposerPlaceholderState(Lcom/instagram/common/session/UserSession;Lcom/instagram/model/reels/Reel;Lcom/instagram/model/reels/ReelItem;Lcom/instagram/stories/common/data/StoriesViewerParameters;)Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState$ComposerInactive;", 1);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC57873Pld interfaceC57873Pld;
        String str;
        Integer num;
        C51932MxF c51932MxF;
        String id;
        UserSession userSession = (UserSession) obj;
        Reel reel = (Reel) obj2;
        C41181vS c41181vS = (C41181vS) obj3;
        C147236jz c147236jz = (C147236jz) obj4;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(reel, c41181vS, c147236jz);
        OSW osw = OSW.A00;
        C28531Zo c28531Zo = C28531Zo.A04;
        C14360o3.A07(c28531Zo);
        C54479O5h c54479O5h = new C54479O5h(new OCL(userSession, OS8.A00, c28531Zo, osw));
        OIA oia = new OIA(userSession);
        C57746PjZ c57746PjZ = new C57746PjZ(userSession, 18);
        C57746PjZ c57746PjZ2 = new C57746PjZ(userSession, 19);
        C51625MrI c51625MrI = new C51625MrI(0.0f, 0, 0, 0, 0, 0, false);
        if (c41181vS.A0e == EnumC41231vY.A09) {
            interfaceC57873Pld = new C51932MxF(reel, c41181vS, c51625MrI);
        } else {
            interfaceC57873Pld = C56745PGn.A00;
        }
        InterfaceC57873Pld interfaceC57873Pld2 = interfaceC57873Pld;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            str = (String) c57746PjZ.invoke(id);
        } else {
            str = null;
        }
        C14360o3.A0B(interfaceC57873Pld2, 0);
        boolean A01 = C55166OdU.A01(interfaceC57873Pld2);
        boolean z = interfaceC57873Pld2 instanceof C51932MxF;
        if (!z) {
            num = C05F.A00;
        } else {
            User A002 = AbstractC54229NyA.A00((C51932MxF) interfaceC57873Pld2);
            if (A002 != null) {
                OCL ocl = c54479O5h.A00;
                if (ocl.A01.A0H(ocl.A00, AbstractC140386Ws.A00(A002, false)) || AbstractC166987dD.A1a(c57746PjZ2.invoke(A002))) {
                    num = C05F.A0C;
                }
            }
            if (C18U.A06(C06090Tz.A05, oia.A00, 36320691586343732L)) {
                num = C05F.A0N;
            } else {
                num = C05F.A01;
            }
        }
        User user = null;
        if (z && (c51932MxF = (C51932MxF) interfaceC57873Pld2) != null) {
            user = AbstractC54229NyA.A00(c51932MxF);
        }
        return new C51943MxQ(C55166OdU.A00(c147236jz, c54479O5h, user, str, oia.A00(), false), num, A01);
    }
}
