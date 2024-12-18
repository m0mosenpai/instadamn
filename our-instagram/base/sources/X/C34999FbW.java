package X;

import com.facebook.location.platform.api.Location;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;

/* renamed from: X.FbW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34999FbW {
    public final UserSession A00;
    public final DirectCollectionArguments A01;
    public final InterfaceC60442pS A02;

    public static final void A00(C34999FbW c34999FbW, String str, boolean z) {
        UserSession userSession = c34999FbW.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_collections");
        if (A0f.isSampled()) {
            DirectCollectionArguments directCollectionArguments = c34999FbW.A01;
            A0f.AAP("module_name", FUP.A00(directCollectionArguments.A03));
            AbstractC31171DnF.A1B(A0f, str);
            AbstractC31171DnF.A1G(A0f, directCollectionArguments.A07);
            A0f.A7v(AbstractC111324zv.A00(457), AbstractC31173DnH.A0d(A0f, directCollectionArguments.A02, MSV.A00(102), z));
            User A10 = AbstractC166987dD.A10(userSession);
            A0f.A9M(Location.EXTRAS, AbstractC25233BEq.A0p("has_collab_collections", String.valueOf(A10.A03.BBM()), AbstractC166987dD.A1L("has_private_collections", String.valueOf(A10.A03.BCS()))));
            A0f.Cht();
        }
    }

    public final void A01(SavedCollection savedCollection, boolean z) {
        String A00;
        if (z) {
            A00 = "instagram_organic_add_to_collection";
        } else {
            A00 = AbstractC111324zv.A00(4689);
        }
        DirectCollectionArguments directCollectionArguments = this.A01;
        String str = directCollectionArguments.A04;
        if (str == null) {
            str = directCollectionArguments.A05;
        }
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, A00);
        c82713mZ.A61 = str;
        c82713mZ.A4r = savedCollection.A0F;
        c82713mZ.A4t = savedCollection.A02();
        c82713mZ.A6C = AbstractC25225BEi.A14();
        c82713mZ.A6x = savedCollection.A0G;
        UserSession userSession = this.A00;
        if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, C05F.A01)) {
            AbstractC31173DnH.A1S(c82713mZ.A00(), userSession);
        }
    }

    public C34999FbW(UserSession userSession, DirectCollectionArguments directCollectionArguments, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167017dG.A1Q(userSession, directCollectionArguments);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A01 = directCollectionArguments;
    }
}
