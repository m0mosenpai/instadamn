package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.OptimisticNetworkOperation;
import com.instagram.direct.inbox.notes.NotesApi;

/* renamed from: X.BxW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27107BxW extends OptimisticNetworkOperation {
    public final EnumC25577BSp A00;
    public final UserSession A01;
    public final NotesApi A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final InterfaceC16660sJ A0B;

    public C27107BxW(EnumC25577BSp enumC25577BSp, UserSession userSession, NotesApi notesApi, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25234BEr.A1R(notesApi, str, str2, enumC25577BSp, str3);
        this.A01 = userSession;
        this.A02 = notesApi;
        this.A08 = str;
        this.A09 = str2;
        this.A00 = enumC25577BSp;
        this.A05 = str3;
        this.A07 = str4;
        this.A0A = str5;
        this.A04 = num;
        this.A06 = str6;
        this.A03 = num2;
        this.A0B = interfaceC16660sJ;
    }
}
