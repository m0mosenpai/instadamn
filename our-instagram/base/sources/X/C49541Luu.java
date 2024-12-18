package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.question.constants.QuestionStickerType;

/* renamed from: X.Luu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49541Luu implements InterfaceC65982ya {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47Z A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;

    @Override // X.InterfaceC65982ya
    public final void Dbp(C47Z c47z) {
        C14360o3.A0B(c47z, 0);
        if (c47z.A1f == EnumC915447k.A02) {
            c47z.A0X(this);
            UserSession userSession = this.A01;
            String str = this.A04;
            String str2 = this.A03;
            C47Z c47z2 = this.A02;
            String str3 = this.A05;
            int i = this.A00;
            String str4 = QuestionStickerType.A07.A00;
            String str5 = c47z2.A3t;
            int i2 = 1;
            if (c47z2.A11()) {
                i2 = 2;
            }
            C25621Ms A00 = AbstractC41336IRh.A00(userSession, str, str2, str4, "", "", KDA.__redex_internal_original_name, "", str3, i, false);
            A00.A9s("upload_id", str5);
            A00.A0D("media_type", i2);
            C1ON A0T = AbstractC31172DnG.A0T(A00, AbstractC58317Pt9.A00(29), "media");
            C1GJ.A06(A0T, A0T.A04.runnableId, 2, true, false);
            this.A06.invoke();
        }
    }

    public C49541Luu(UserSession userSession, C47Z c47z, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = c47z;
        this.A05 = str3;
        this.A00 = i;
        this.A06 = interfaceC16820sZ;
    }
}
