package com.instagram.contentnotes.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC31175DnJ;
import X.AbstractC43594JPz;
import X.AbstractC50712Us;
import X.B4Z;
import X.C05A;
import X.C06090Tz;
import X.C0eB;
import X.C103514lR;
import X.C115115Ig;
import X.C14360o3;
import X.C18U;
import X.C194848jk;
import X.C1JX;
import X.C27110BxZ;
import X.C28531Zo;
import X.C3KG;
import X.C3NX;
import X.C3NY;
import X.C41451vu;
import X.C4F0;
import X.C4F2;
import X.C50282MIl;
import X.C7YF;
import X.C7YG;
import X.EnumC25577BSp;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC40821up;
import X.InterfaceC83703oF;
import X.InterfaceC83713oG;
import X.LMQ;
import X.OAI;
import X.OEQ;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.contentnotes.data.ContentNotesRepository$postNote$1", f = "ContentNotesRepository.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ContentNotesRepository$postNote$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ EnumC25577BSp A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ C4F0 A04;
    public final /* synthetic */ NoteAudience A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentNotesRepository$postNote$1(EnumC25577BSp enumC25577BSp, ImageUrl imageUrl, C4F0 c4f0, NoteAudience noteAudience, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = c4f0;
        this.A0D = str;
        this.A0F = str2;
        this.A05 = noteAudience;
        this.A08 = str3;
        this.A02 = enumC25577BSp;
        this.A0B = str4;
        this.A0E = str5;
        this.A07 = num;
        this.A09 = str6;
        this.A06 = num2;
        this.A0A = str7;
        this.A01 = i;
        this.A0C = str8;
        this.A03 = imageUrl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C4F0 c4f0 = this.A04;
        String str = this.A0D;
        String str2 = this.A0F;
        NoteAudience noteAudience = this.A05;
        String str3 = this.A08;
        EnumC25577BSp enumC25577BSp = this.A02;
        String str4 = this.A0B;
        String str5 = this.A0E;
        Integer num = this.A07;
        String str6 = this.A09;
        Integer num2 = this.A06;
        String str7 = this.A0A;
        int i = this.A01;
        return new ContentNotesRepository$postNote$1(enumC25577BSp, this.A03, c4f0, noteAudience, num, num2, str, str2, str3, str4, str5, str6, str7, this.A0C, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Long A0j;
        Object value;
        List<User> list;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            C4F0 c4f0 = this.A04;
            UserSession userSession = c4f0.A00;
            C4F2 c4f2 = c4f0.A01;
            String valueOf = String.valueOf(AbstractC50712Us.A01.A09(0L, Long.MAX_VALUE));
            String str = this.A0D;
            String str2 = this.A0F;
            NoteAudience noteAudience = this.A05;
            String str3 = this.A08;
            C27110BxZ c27110BxZ = new C27110BxZ(this.A02, userSession, c4f2, noteAudience, this.A07, this.A06, valueOf, str, str2, str3, this.A0B, this.A0E, this.A09, this.A0A);
            this.A00 = 1;
            obj2 = c27110BxZ.A00(this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        C3NY c3ny = (C3NY) obj2;
        if (c3ny instanceof C3NX) {
            Object A0r = AbstractC43594JPz.A0r(c3ny);
            C14360o3.A07(A0r);
            C103514lR c103514lR = (C103514lR) A0r;
            String str4 = c103514lR.A07;
            if (str4 != null && (A0j = AbstractC166997dE.A0j(str4)) != null) {
                long longValue = A0j.longValue();
                C4F0 c4f02 = this.A04;
                C05A c05a = c4f02.A03;
                do {
                    value = c05a.getValue();
                    ((Number) value).longValue();
                } while (!c05a.AIi(value, A0j));
                UserSession userSession2 = c4f02.A00;
                if (C18U.A06(C06090Tz.A05, userSession2, 36323096768555989L) && (list = c103514lR.A0B) != null && !list.isEmpty()) {
                    String str5 = this.A0F;
                    String str6 = this.A0C;
                    ImageUrl imageUrl = this.A03;
                    for (User user : list) {
                        C28531Zo c28531Zo = C28531Zo.A04;
                        C14360o3.A07(c28531Zo);
                        String username = user.getUsername();
                        boolean A0I = c28531Zo.A0I(userSession2, new DirectShareTarget(user));
                        C14360o3.A0B(str5, 1);
                        DirectShareTarget directShareTarget = new DirectShareTarget(user);
                        if (directShareTarget.A01() instanceof InterfaceC83703oF) {
                            C7YG A00 = C7YF.A00(userSession2);
                            InterfaceC83713oG A01 = directShareTarget.A01();
                            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadTarget");
                            A00.A02((InterfaceC83703oF) A01, AbstractC31175DnJ.A0f(directShareTarget), new C50282MIl(userSession2, imageUrl, directShareTarget, user, str5, username, str5, str6, longValue, A0I), true);
                        }
                    }
                }
            }
        } else if (c3ny instanceof C194848jk) {
            Object obj3 = ((C194848jk) c3ny).A00;
            if (obj3 instanceof C115115Ig) {
                int i = this.A01;
                C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MediaNoteResponse>>");
                String errorMessage = ((InterfaceC40821up) ((C115115Ig) obj3).A00).getErrorMessage();
                if (errorMessage != null && errorMessage.length() != 0) {
                    C41451vu.A01.E4s(new C3KG(new OEQ(new OAI(LMQ.A00, null, 2131968948), null, null, true, errorMessage, i, -1)));
                }
            }
        } else {
            throw B4Z.A00();
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentNotesRepository$postNote$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
