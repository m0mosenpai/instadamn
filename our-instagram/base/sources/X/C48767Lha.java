package X;

import com.instagram.friendmap.data.FriendMapRepository;
import java.util.List;

/* renamed from: X.Lha, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48767Lha implements InterfaceC50425MOf {
    public final /* synthetic */ C45128JyU A00;
    public final /* synthetic */ C44794JsF A01;

    public C48767Lha(C45128JyU c45128JyU, C44794JsF c44794JsF) {
        this.A01 = c44794JsF;
        this.A00 = c45128JyU;
    }

    @Override // X.InterfaceC50425MOf
    public final void F7w() {
        List list;
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        String str;
        Long A0j;
        C44794JsF c44794JsF = this.A01;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C49411Lsl c49411Lsl = c44794JsF.A0B;
        C4F5 c4f5 = this.A00.A05;
        C45999KXn A0e = AbstractC43593JPy.A0e(c49411Lsl.A00);
        EnumC152186t3 enumC152186t3 = EnumC152186t3.FRIEND_MAP;
        if (c4f5 != null && (list = c4f5.A0J) != null && (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list)) != null && (BXJ = interfaceC50424MOe.BXJ()) != null && (str = BXJ.A0H) != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            long longValue = A0j.longValue();
            FriendMapRepository friendMapRepository = A0e.A05;
            if (!friendMapRepository.A0C(longValue)) {
                C135976Dc A01 = AbstractC135966Db.A01(A0e.A02);
                A01.A0L(enumC152186t3, c4f5);
                A01.A0G(EnumC46303KeZ.A0O, EnumC46273Ke5.REPLY_SHEET, null, AbstractC166997dE.A0b(), "❤️");
                friendMapRepository.A07(longValue);
                return;
            }
            friendMapRepository.A08.A0G(longValue, null);
            FriendMapRepository.A03(friendMapRepository, longValue, false);
        }
    }
}
