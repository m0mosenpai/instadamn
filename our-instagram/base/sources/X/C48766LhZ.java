package X;

import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.LhZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48766LhZ implements InterfaceC50425MOf {
    public final int A00;
    public final Object A01;

    public C48766LhZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC50425MOf
    public final void F7w() {
        String str;
        Long A0j;
        C4F5 c4f5;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C26750BrX c26750BrX = (C26750BrX) obj;
                C25861BcG A00 = C26750BrX.A00(c26750BrX);
                boolean z = !AbstractC31177DnL.A1b(C26750BrX.A00(c26750BrX).A0C.getValue());
                C4F0 c4f0 = A00.A02;
                ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = A00.A03;
                ContentNoteMetadata contentNoteMetadata = contentNotesImmersiveReplyContent.A02;
                String str2 = contentNoteMetadata.A08;
                String str3 = contentNotesImmersiveReplyContent.A07;
                EnumC25577BSp enumC25577BSp = EnumC25577BSp.REPLY_SHEET;
                String str4 = contentNoteMetadata.A04;
                String str5 = contentNoteMetadata.A06;
                String str6 = contentNoteMetadata.A0A;
                Integer num = contentNoteMetadata.A03;
                String str7 = contentNoteMetadata.A05;
                Integer num2 = contentNoteMetadata.A02;
                if (z) {
                    c4f0.A02(enumC25577BSp, num, num2, str2, str3, str4, str5, str6, str7);
                } else {
                    c4f0.A03(enumC25577BSp, num, num2, str2, str3, str4, str5, str6, str7);
                }
                AbstractC166997dE.A1Y(A00.A0B, z);
                return;
            case 1:
                LLB llb = (LLB) obj;
                Jn3 jn3 = llb.A0U;
                C0UO c0uo = jn3.A09;
                Object value = c0uo.getValue();
                AbstractC46436Kgw abstractC46436Kgw = (AbstractC46436Kgw) jn3.A08.getValue();
                if (abstractC46436Kgw instanceof C45842KQx) {
                    boolean A0K = C14360o3.A0K(c0uo.getValue(), "❤️");
                    ContentNoteMetadata contentNoteMetadata2 = ((C45842KQx) abstractC46436Kgw).A05;
                    if (A0K) {
                        long j = jn3.A00;
                        String str8 = jn3.A06;
                        if (contentNoteMetadata2 != null) {
                            jn3.A03.A03(EnumC25577BSp.REPLY_SHEET, contentNoteMetadata2.A03, contentNoteMetadata2.A02, contentNoteMetadata2.A08, String.valueOf(j), contentNoteMetadata2.A04, contentNoteMetadata2.A06, contentNoteMetadata2.A0A, contentNoteMetadata2.A05);
                        } else {
                            jn3.A04.A0G(j, str8);
                        }
                        jn3.A07.Egh(null);
                    } else {
                        long j2 = jn3.A00;
                        String str9 = jn3.A06;
                        if (contentNoteMetadata2 != null) {
                            jn3.A03.A02(EnumC25577BSp.REPLY_SHEET, contentNoteMetadata2.A03, contentNoteMetadata2.A02, contentNoteMetadata2.A08, String.valueOf(j2), contentNoteMetadata2.A04, contentNoteMetadata2.A06, contentNoteMetadata2.A0A, contentNoteMetadata2.A05);
                        } else {
                            jn3.A04.A0E(j2, str9);
                        }
                        jn3.A07.Egh("❤️");
                        C2UY.A01.A04();
                    }
                }
                if ("❤️".equals(value)) {
                    return;
                }
                AbstractC135966Db.A01(llb.A0Q).A0F(EnumC46303KeZ.A0O, null, EnumC46273Ke5.REPLY_SHEET, null, AbstractC166997dE.A0b(), AbstractC166997dE.A0a(), null, "❤️", llb.A0Z, null);
                return;
            default:
                KDY kdy = (KDY) obj;
                C45996KXk c45996KXk = (C45996KXk) kdy.A0B.getValue();
                EnumC152186t3 enumC152186t3 = (EnumC152186t3) kdy.A08.getValue();
                C14360o3.A0B(enumC152186t3, 0);
                C45128JyU c45128JyU = ((C45290K2s) c45996KXk.A0L()).A00;
                if (c45128JyU != null && (str = c45128JyU.A0A) != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                    long longValue = A0j.longValue();
                    FriendMapRepository friendMapRepository = c45996KXk.A01;
                    if (!friendMapRepository.A0C(longValue)) {
                        C135976Dc A01 = AbstractC135966Db.A01(c45996KXk.A00);
                        C45128JyU c45128JyU2 = ((C45290K2s) c45996KXk.A0L()).A00;
                        if (c45128JyU2 != null && (c4f5 = c45128JyU2.A05) != null) {
                            A01.A0L(enumC152186t3, c4f5);
                        }
                        A01.A0G(EnumC46303KeZ.A0O, EnumC46273Ke5.REPLY_SHEET, null, AbstractC166997dE.A0b(), "❤️");
                        friendMapRepository.A07(longValue);
                    } else {
                        friendMapRepository.A08.A0G(longValue, null);
                        FriendMapRepository.A03(friendMapRepository, longValue, false);
                    }
                    c45996KXk.A0O(ML7.A00);
                    return;
                }
                return;
        }
    }
}
